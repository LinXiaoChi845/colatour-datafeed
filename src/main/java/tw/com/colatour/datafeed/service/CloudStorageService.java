package tw.com.colatour.datafeed.service;

import com.google.api.gax.paging.Page;
import com.google.cloud.storage.Blob;
import tw.com.colatour.datafeed.dto.BucketFile;

import java.util.List;

public interface CloudStorageService {

    Page<Blob> getBucketFiles(String projectId, String bucketName, String filePath);

}
