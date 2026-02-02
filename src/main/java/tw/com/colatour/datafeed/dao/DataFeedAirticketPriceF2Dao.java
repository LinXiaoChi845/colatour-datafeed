package tw.com.colatour.datafeed.dao;

import tw.com.colatour.datafeed.model.DataFeedAirticketPriceF2;

import java.util.List;

public interface DataFeedAirticketPriceF2Dao {

    void createDataFeedAirticketPriceF2s(List<DataFeedAirticketPriceF2> dataFeedAirticketPriceF2List);

    void deleteDataFeedAirticketPriceF2sByFileNo(Integer fileNo);

}
