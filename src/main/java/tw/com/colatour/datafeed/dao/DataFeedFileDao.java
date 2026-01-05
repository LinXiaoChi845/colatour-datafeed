package tw.com.colatour.datafeed.dao;

import tw.com.colatour.datafeed.dto.DataFeedFileParam;
import tw.com.colatour.datafeed.model.DataFeedFile;

public interface DataFeedFileDao {

    DataFeedFile getDataFeedFileByFileName(String fileName);

    DataFeedFile getDataFeedFileByFileNo(Integer fileNo);

    Integer createDataFeedFile(DataFeedFileParam dataFeedFileParam);

    void updateDataFeedFile(DataFeedFile dataFeedFile);
}
