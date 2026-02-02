package tw.com.colatour.datafeed.dao;

import tw.com.colatour.datafeed.model.DataFeedAirticketPrice01;

import java.util.List;

public interface DataFeedAirticketPrice01Dao {

    void createDataFeedAirticketPrice01s(List<DataFeedAirticketPrice01> dataFeedAirticketPrice01List);

    void deleteDataFeedAirticketPrice01sByFileNo(Integer fileNo);

}
