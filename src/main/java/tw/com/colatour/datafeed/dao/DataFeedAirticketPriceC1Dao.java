package tw.com.colatour.datafeed.dao;

import tw.com.colatour.datafeed.model.DataFeedAirticketPriceC1;

import java.util.List;

public interface DataFeedAirticketPriceC1Dao {

    void createDataFeedAirticketPriceC1s(List<DataFeedAirticketPriceC1> dataFeedAirticketPriceC1List);

    void deleteDataFeedAirticketPriceC1sByFileNo(Integer fileNo);

}
