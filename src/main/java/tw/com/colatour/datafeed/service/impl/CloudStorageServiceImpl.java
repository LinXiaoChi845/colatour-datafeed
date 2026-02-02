package tw.com.colatour.datafeed.service.impl;

import com.google.api.gax.paging.Page;
import com.google.cloud.storage.Blob;
import com.google.cloud.storage.Storage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import tw.com.colatour.datafeed.dto.BucketFile;
import tw.com.colatour.datafeed.service.CloudStorageService;

import java.util.ArrayList;
import java.util.List;

@Component
public class CloudStorageServiceImpl implements CloudStorageService {

    @Autowired
    private Storage myStorage;


    @Override
    public Page<Blob> getBucketFiles(String projectId, String bucketName, String filePath) {
        // 建立 Google Cloud Storage 物件
        //Storage myStorage = StorageOptions.newBuilder().setProjectId(projectId).build().getService();

        // 物件前綴 的路徑
        String myPrefix = filePath + "/";

        // 取得 Bucket 裡面，特定前綴 (目錄) 下的 檔案清單，只取 .mr 的檔案
        Page<Blob> myBlobPages = myStorage.list(bucketName,
                Storage.BlobListOption.prefix(myPrefix),
                Storage.BlobListOption.currentDirectory(),
                Storage.BlobListOption.matchGlob("**.mr"));

        return myBlobPages;
    }
}
