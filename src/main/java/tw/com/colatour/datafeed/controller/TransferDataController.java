package tw.com.colatour.datafeed.controller;

import com.google.api.gax.paging.Page;
import com.google.cloud.storage.Blob;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import tw.com.colatour.datafeed.dto.ApiResult;
import tw.com.colatour.datafeed.model.DataFeedLog;
import tw.com.colatour.datafeed.service.TransferDataService;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

@RestController
public class TransferDataController {

    private final static Logger myLog = LoggerFactory.getLogger(TransferDataController.class);

    @Autowired
    private TransferDataService transferDataService;

    @GetMapping("/datafeed/datafeedlogs")
    public ResponseEntity<List<DataFeedLog>> getDataFeedLogs() {
        List<DataFeedLog> myDataFeedLogList = transferDataService.getDataFeedLogs();

        return ResponseEntity.status(HttpStatus.OK).body(myDataFeedLogList);
    }

    @PostMapping("/datafeed/importdata")
    public ResponseEntity<ApiResult> importData() {
        ApiResult myApiResult = new ApiResult();
        myApiResult.setSuccessMark(false);
        myApiResult.setErrorMessage("初始異常");

        // 新增 Log 資料 ( 開始時間 )
        Integer myLogNo = transferDataService.createDataFeedLog();

        // 取得 剛剛新增的 Log 紀錄 ( 匯入結束後，更新相關資料的時候，會需要 )
        DataFeedLog myDataFeedLog = transferDataService.getDataFeedLogByLogNo(myLogNo);

        // 取得 前一天檔案路徑下的所有檔案 ( 每天的檔案會集中在 日期(ddMMyyyy) 為 物件前綴 的路徑之下 )
        DateTimeFormatter myFormatter = DateTimeFormatter.ofPattern("ddMMyyyy");
        LocalDate myToday = LocalDate.now(); // 系統當天日期
        LocalDate myYesterday = (myToday.minusDays(1)); // 往前一天
        String myFilePath = myYesterday.format(myFormatter);

        myLog.info("Cloud Storage Bucket: {}", myFilePath);

        // 取得 Google Cloud Storage bucket 下的所有檔案
        Page<Blob> myBlobPages = transferDataService.getFileList(myFilePath);

        // 將 檔案清單 裡面的每個檔案內容，匯入資料庫
        myDataFeedLog = transferDataService.importDataToDB(myBlobPages, myDataFeedLog);

        // 更新 Log 資料 ( 結束時間、總檔案數量、總檔案大小 )
        transferDataService.updateDataFeedLog(myDataFeedLog);

        // 重新取得最新的 DataFeedLog 資料 ( API 回傳本次匯入資料的紀錄 )
        myDataFeedLog = transferDataService.getDataFeedLogByLogNo(myLogNo);

        myApiResult.setSuccessMark(true);
        myApiResult.setErrorMessage("執行完成");
        myApiResult.setDataFeedLog(myDataFeedLog);

        return ResponseEntity.status(HttpStatus.CREATED).body(myApiResult);
    }

}
