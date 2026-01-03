package tw.com.colatour.datafeed.service;

import tw.com.colatour.datafeed.model.DataFeedLog;

import java.util.List;

public interface TransferDataService {

    List<DataFeedLog> getDataFeedLogs();

}
