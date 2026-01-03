package tw.com.colatour.datafeed.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Component;
import tw.com.colatour.datafeed.dao.DataFeedLogDao;
import tw.com.colatour.datafeed.model.DataFeedLog;
import tw.com.colatour.datafeed.rowmapper.DataFeedLogRowMapper;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class DataFeedLogDaoImpl implements DataFeedLogDao {

    @Autowired
    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    @Override
    public List<DataFeedLog> getDataFeedLogs() {
        String mySql = "SELECT log_no, log_start_time, log_end_time, total_file_cnt, total_file_size " +
                " FROM data_feed.data_feed_log ";

        Map<String,Object> myMap = new HashMap<>();

        List<DataFeedLog> myDataFeedLogList = namedParameterJdbcTemplate.query(mySql, myMap, new DataFeedLogRowMapper());

        return myDataFeedLogList;
    }
}
