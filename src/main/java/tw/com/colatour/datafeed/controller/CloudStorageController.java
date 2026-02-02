package tw.com.colatour.datafeed.controller;

import com.google.api.gax.paging.Page;
import com.google.cloud.storage.Blob;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import tw.com.colatour.datafeed.dto.BucketFile;
import tw.com.colatour.datafeed.service.CloudStorageService;

import java.util.ArrayList;
import java.util.List;

@RestController
public class CloudStorageController {

    @Autowired
    private CloudStorageService myCloudStorageService;

    @GetMapping("/datafeed/bucketfiles/{projectId}/{bucketName}/{filePath}")
    public ResponseEntity<List<BucketFile>> getBucketFiles(@PathVariable String projectId,
                                                           @PathVariable String bucketName,
                                                           @PathVariable String filePath) {

        List<BucketFile> myBucketFileList = new ArrayList<>();

        // 取得 Google Cloud Storage Bucket 裡面的檔案清單
        Page<Blob> myBlobPages = myCloudStorageService.getBucketFiles(projectId, bucketName, filePath);

        for (Blob wkBlob : myBlobPages.iterateAll()) {
            BucketFile wkBucketFile = new BucketFile();

            wkBucketFile.setFileName(wkBlob.getName());
            wkBucketFile.setFileSize(wkBlob.getSize());

            myBucketFileList.add(wkBucketFile);
        }

        if (myBucketFileList.size() > 0) {
            return ResponseEntity.status(HttpStatus.OK).body(myBucketFileList);
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }

    }

}
