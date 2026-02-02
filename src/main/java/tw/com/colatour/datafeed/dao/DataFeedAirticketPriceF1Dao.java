package tw.com.colatour.datafeed.dao;

import tw.com.colatour.datafeed.model.DataFeedAirticketPriceF1;

import java.util.List;

public interface DataFeedAirticketPriceF1Dao {

    void createDataFeedAirticketPriceF1s(List<DataFeedAirticketPriceF1> dataFeedAirticketPriceF1List);

    void deleteDataFeedAirticketPriceF1sByFileNo(Integer fileNo);

}
