package tw.com.colatour.datafeed.dao;

import tw.com.colatour.datafeed.model.DataFeedAirticketPriceD1;

import java.util.List;

public interface DataFeedAirticketPriceD1Dao {

    void createDataFeedAirticketPriceD1s(List<DataFeedAirticketPriceD1> dataFeedAirticketPriceD1List);

    void deleteDataFeedAirticketPriceD1sByFileNo(Integer fileNo);

}
