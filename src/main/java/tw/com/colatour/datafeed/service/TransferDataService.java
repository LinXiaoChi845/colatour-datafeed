package tw.com.colatour.datafeed.service;

import com.google.api.gax.paging.Page;
import com.google.cloud.storage.Blob;
import tw.com.colatour.datafeed.model.DataFeedLog;

import java.util.List;

public interface TransferDataService {

    List<DataFeedLog> getDataFeedLogs();

    DataFeedLog getDataFeedLogByLogNo(Integer logNo);

    Page<Blob> getFileList(String myFilePath);

    Integer createDataFeedLog();

    void updateDataFeedLog(DataFeedLog dataFeedLog);

    DataFeedLog importDataToDB(Page<Blob> blobPages, DataFeedLog dataFeedLog);

}
