package tw.com.colatour.datafeed.dao;

import tw.com.colatour.datafeed.model.DataFeedLog;

import java.util.List;

public interface DataFeedLogDao {

    List<DataFeedLog> getDataFeedLogs();

}
