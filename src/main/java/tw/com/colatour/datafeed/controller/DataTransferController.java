package tw.com.colatour.datafeed.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import tw.com.colatour.datafeed.model.DataFeedLog;
import tw.com.colatour.datafeed.service.DataTransferService;

@RestController
public class DataTransferController {

    private final String myProjectId = "my-colatour"; // Google Cloud Project Id
    private final String myBucketName = "yichi-datafeed"; // Google Cloud Storage Bucket Name

    @Autowired
    private DataTransferService dataTransferService;

    @PostMapping("/datafeed/importdata")
    public ResponseEntity<DataFeedLog> importData() {

        DataFeedLog dataFeedLog = dataTransferService.importData(myProjectId, myBucketName);

        return ResponseEntity.status(HttpStatus.OK).body(dataFeedLog);
    }
}
