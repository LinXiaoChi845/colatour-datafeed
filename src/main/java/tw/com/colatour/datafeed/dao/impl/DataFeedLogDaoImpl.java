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
    private NamedParameterJdbcTemplate myNamedParameterJdbcTemplate;

    @Override
    public DataFeedLog getDataFeedLogByLogNo(Integer logNo) {
        String mySql = "SELECT log_no, log_start_time, log_end_time, total_file_cnt, total_file_size, " +
                " success_file_cnt, success_file_size, non_empty_file_cnt, non_empty_file_size, empty_file_cnt, empty_file_size, " +
                " failure_file_cnt, failure_file_size, duplicate_file_cnt, duplicate_file_size " +
                " FROM db_airticket.data_feed_Log " +
                " WHERE log_no = :logNo";

        Map<String, Object> myMap = new HashMap<>();

        myMap.put("logNo", logNo);

        List<DataFeedLog> myDataFeedLogList = myNamedParameterJdbcTemplate.query(mySql, myMap, new DataFeedLogRowMapper());

        if (myDataFeedLogList.size() > 0) {
            return myDataFeedLogList.get(0);
        } else {
            return null;
        }
    }

    @Override
    public Integer createDataFeedLog() {
        String mySql = "INSERT INTO db_airticket.data_feed_log ( " +
                " log_start_time, log_end_time, total_file_cnt, total_file_size, " +
                " success_file_cnt, success_file_size, non_empty_file_cnt, non_empty_file_size, empty_file_cnt, empty_file_size, " +
                " failure_file_cnt, failure_file_size, duplicate_file_cnt, duplicate_file_size ) " +
                " VALUES ( " +
                " :logStartTime, :logEndTime, :totalFileCnt, :totalFileSize, " +
                " :successFileCnt, :successFileSize, :nonEmptyFileCnt, :nonEmptyFileSize, :emptyFileCnt, :emptyFileSize, " +
                " :failureFileCnt, :failureFileSize, :duplicateFileCnt, :duplicateFileSize ) ";

        Map<String,Object> myMap = new HashMap<>();

        myMap.put("logStartTime", Timestamp.from(Instant.now()));
        myMap.put("logEndTime", new Timestamp(0L));
        myMap.put("totalFileCnt", 0);
        myMap.put("totalFileSize", 0);
        myMap.put("successFileCnt", 0);
        myMap.put("successFileSize", 0);
        myMap.put("nonEmptyFileCnt", 0);
        myMap.put("nonEmptyFileSize", 0);
        myMap.put("emptyFileCnt", 0);
        myMap.put("emptyFileSize", 0);
        myMap.put("failureFileCnt", 0);
        myMap.put("failureFileSize", 0);
        myMap.put("duplicateFileCnt", 0);
        myMap.put("duplicateFileSize", 0);


        KeyHolder myKeyHolder = new GeneratedKeyHolder();

        myNamedParameterJdbcTemplate.update(mySql, new MapSqlParameterSource(myMap), myKeyHolder);

        // PostgreSQL 不知道哪個欄位是 Key, 所以要指定欄位名稱，不然會報異常
        Integer myLogNo = (Integer)myKeyHolder.getKeys().get("log_no");

        return myLogNo;
    }

    @Override
    public void updateDataFeedLog(DataFeedLog dataFeedLog) {
        String mySql = "UPDATE db_airticket.data_feed_log " +
                " SET log_end_time = :logEndTime, " +
                " total_file_cnt = :totalFileCnt, " +
                " total_file_size = :totalFileSize, " +
                " success_file_cnt = :successFileCnt, " +
                " success_file_size = :successFileSize, " +
                " non_empty_file_cnt = :nonEmptyFileCnt, " +
                " non_empty_file_size = :nonEmptyFileSize, " +
                " empty_file_cnt = :emptyFileCnt, " +
                " empty_file_size = :emptyFileSize, " +
                " failure_file_cnt = :failureFileCnt, " +
                " failure_file_size = :failureFileSize, " +
                " duplicate_file_cnt = :duplicateFileCnt, " +
                " duplicate_file_size = :duplicateFileSize " +
                " WHERE log_no = :logNo";

        Map<String,Object> myMap = new HashMap<>();
        myMap.put("logNo", dataFeedLog.getLogNo());
        myMap.put("logEndTime", Timestamp.from(Instant.now()));
        myMap.put("totalFileCnt", dataFeedLog.getTotalFileCnt());
        myMap.put("totalFileSize", dataFeedLog.getTotalFileSize());
        myMap.put("successFileCnt", dataFeedLog.getSuccessFileCnt());
        myMap.put("successFileSize", dataFeedLog.getSuccessFileSize());
        myMap.put("nonEmptyFileCnt", dataFeedLog.getNonEmptyFileCnt());
        myMap.put("nonEmptyFileSize", dataFeedLog.getNonEmptyFileSize());
        myMap.put("emptyFileCnt", dataFeedLog.getEmptyFileCnt());
        myMap.put("emptyFileSize", dataFeedLog.getEmptyFileSize());
        myMap.put("failureFileCnt", dataFeedLog.getFailureFileCnt());
        myMap.put("failureFileSize", dataFeedLog.getFailureFileSize());
        myMap.put("duplicateFileCnt", dataFeedLog.getDuplicateFileCnt());
        myMap.put("duplicateFileSize", dataFeedLog.getDuplicateFileSize());

        myNamedParameterJdbcTemplate.update(mySql, myMap);
    }

}
