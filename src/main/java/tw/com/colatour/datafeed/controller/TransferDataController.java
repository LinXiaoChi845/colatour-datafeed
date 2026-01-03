package tw.com.colatour.datafeed.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
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

}
