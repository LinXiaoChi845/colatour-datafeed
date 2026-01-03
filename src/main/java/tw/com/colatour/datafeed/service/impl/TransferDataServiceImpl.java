package tw.com.colatour.datafeed.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import tw.com.colatour.datafeed.dao.DataFeedLogDao;
import tw.com.colatour.datafeed.model.DataFeedLog;
import tw.com.colatour.datafeed.service.TransferDataService;

import java.util.List;

@Component
public class TransferDataServiceImpl implements TransferDataService {

    @Autowired
    private DataFeedLogDao dataFeedLogDao;

    @Override
    public List<DataFeedLog> getDataFeedLogs() {
        return dataFeedLogDao.getDataFeedLogs();
    }

    @Override
    public DataFeedLog getDataFeedLogByNo(Integer logNo) {
        return dataFeedLogDao.getDataFeedLogByNo(logNo);
    }

    @Override
    public Integer createDataFeedLog() {
        return dataFeedLogDao.createDataFeedLog();
    }


}
