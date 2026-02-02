package tw.com.colatour.datafeed.service;

import tw.com.colatour.datafeed.model.DataFeedLog;

public interface DataTransferService {

    DataFeedLog importData(String projectId, String bucketName);

}
