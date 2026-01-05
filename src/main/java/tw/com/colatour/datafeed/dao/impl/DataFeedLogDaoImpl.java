package tw.com.colatour.datafeed.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Component;
import tw.com.colatour.datafeed.dao.DataFeedLogDao;
import tw.com.colatour.datafeed.model.DataFeedLog;
import tw.com.colatour.datafeed.rowmapper.DataFeedLogRowMapper;

import java.sql.Timestamp;
import java.time.Instant;
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

    @Override
    public DataFeedLog getDataFeedLogByLogNo(Integer logNo) {
        String mySql = "SELECT log_no, log_start_time, log_end_time, total_file_cnt, total_file_size " +
                " FROM data_feed.data_feed_log " +
                " WHERE log_no = :logNo";

        Map<String,Object> myMap = new HashMap<>();
        myMap.put("logNo", logNo);

        List<DataFeedLog> myDataFeedLogList = namedParameterJdbcTemplate.query(mySql, myMap, new DataFeedLogRowMapper());

        if (myDataFeedLogList.size() > 0) {
            return myDataFeedLogList.get(0);
        } else {
            return null;
        }
    }

    @Override
    public Integer createDataFeedLog() {
        String mySql = "INSERT INTO data_feed.data_feed_log ( " +
                " log_start_time, log_end_time, total_file_cnt, total_file_size ) " +
                " VALUES ( " +
                " :logStartTime, :logEndTime, :totalFileCnt, :totalFileSize ) ";

        Map<String,Object> myMap = new HashMap<>();

        myMap.put("logStartTime", Timestamp.from(Instant.now()));
        myMap.put("logEndTime", new Timestamp(0L));
        myMap.put("totalFileCnt", 0);
        myMap.put("totalFileSize", 0);

        KeyHolder myKeyHolder = new GeneratedKeyHolder();

        namedParameterJdbcTemplate.update(mySql, new MapSqlParameterSource(myMap), myKeyHolder);

        // PostgreSQL 不知道哪個欄位是 Key, 所以要指定欄位名稱，不然會報異常
        Integer myLogNo = (Integer)myKeyHolder.getKeys().get("log_no");

        return myLogNo;
    }

    @Override
    public void updateDataFeedLog(DataFeedLog dataFeedLog) {
        // 更新 DataFeedLog 的 log_end_time、total_file_cnt、total_file_size

        String mySql = "UPDATE data_feed.data_feed_log " +
                " SET log_end_time = :logEndTime, " +
                " total_file_cnt = :totalFileCnt, " +
                " total_file_size = :totalFileSize " +
                " WHERE log_no = :logNo";

        Map<String,Object> myMap = new HashMap<>();
        myMap.put("logNo", dataFeedLog.getLogNo());
        myMap.put("logEndTime", Timestamp.from(Instant.now()));
        myMap.put("totalFileCnt", dataFeedLog.getTotalFileCnt());
        myMap.put("totalFileSize", dataFeedLog.getTotalFileSize());

        namedParameterJdbcTemplate.update(mySql, myMap);

    }
}
