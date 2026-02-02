package tw.com.colatour.datafeed.dao;

import tw.com.colatour.datafeed.model.DataFeedFile;

public interface DataFeedFileDao {

    DataFeedFile getFileNoByFileName(String fileName);

    DataFeedFile getDataFeedFileByFileNo(Integer fileNo);

    Integer createDataFeedFile(Integer logNo, String fullFileName, String filePath, String fileName);

    void updateDataFeedFile(DataFeedFile dataFeedFile);

    void deleteDataFeedFile(Integer fileNo);

}
