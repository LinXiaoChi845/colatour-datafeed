package tw.com.colatour.datafeed.dao;

import tw.com.colatour.datafeed.model.DataFeedAirticketPriceA2;

import java.util.List;

public interface DataFeedAirticketPriceA2Dao {

    void createDataFeedAirticketPriceA2s(List<DataFeedAirticketPriceA2> dataFeedAirticketPriceA2List);

    void deleteDataFeedAirticketPriceA2sByFileNo(Integer fileNo);

}
