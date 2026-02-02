package tw.com.colatour.datafeed.dao;

import tw.com.colatour.datafeed.model.DataFeedAirticketPriceC2;

import java.util.List;

public interface DataFeedAirticketPriceC2Dao {

    void createDataFeedAirticketPriceC2s(List<DataFeedAirticketPriceC2> dataFeedAirticketPriceC2List);

    void deleteDataFeedAirticketPriceC2sByFileNo(Integer fileNo);

}
