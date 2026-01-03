package tw.com.colatour.datafeed.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import tw.com.colatour.datafeed.dto.ApiResult;
import tw.com.colatour.datafeed.model.DataFeedLog;
import tw.com.colatour.datafeed.service.TransferDataService;

import java.util.List;

@RestController
public class TransferDataController {

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
        DataFeedLog myDataFeedLog = transferDataService.getDataFeedLogByNo(myLogNo);



        myApiResult.setSuccessMark(true);
        myApiResult.setErrorMessage("執行完成");
        myApiResult.setDataFeedLog(myDataFeedLog);

        return ResponseEntity.status(HttpStatus.CREATED).body(myApiResult);
    }

}
