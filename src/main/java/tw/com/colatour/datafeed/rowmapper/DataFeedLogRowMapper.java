package tw.com.colatour.datafeed.rowmapper;

import org.checkerframework.checker.nullness.qual.Nullable;
import org.springframework.jdbc.core.RowMapper;
import tw.com.colatour.datafeed.model.DataFeedLog;

import java.sql.ResultSet;
import java.sql.SQLException;

public class DataFeedLogRowMapper implements RowMapper<DataFeedLog> {
    @Override
    public @Nullable DataFeedLog mapRow(ResultSet rs, int rowNum) throws SQLException {
        DataFeedLog myDataFeedLog = new DataFeedLog();

        myDataFeedLog.setLogNo(rs.getInt("log_no"));
        myDataFeedLog.setLogStartTime(rs.getTimestamp("log_start_time"));
        myDataFeedLog.setLogEndTime(rs.getTimestamp("log_end_time"));
        myDataFeedLog.setTotalFileCnt(rs.getInt("total_file_cnt"));
        myDataFeedLog.setTotalFileSize(rs.getLong("total_file_size"));
        myDataFeedLog.setSuccessFileCnt(rs.getInt("success_file_cnt"));
        myDataFeedLog.setSuccessFileSize(rs.getLong("success_file_size"));
        myDataFeedLog.setNonEmptyFileCnt(rs.getInt("non_empty_file_cnt"));
        myDataFeedLog.setNonEmptyFileSize(rs.getLong("non_empty_file_size"));
        myDataFeedLog.setEmptyFileCnt(rs.getInt("empty_file_cnt"));
        myDataFeedLog.setEmptyFileSize(rs.getLong("empty_file_size"));
        myDataFeedLog.setFailureFileCnt(rs.getInt("failure_file_cnt"));
        myDataFeedLog.setFailureFileSize(rs.getLong("failure_file_size"));
        myDataFeedLog.setDuplicateFileCnt(rs.getInt("duplicate_file_cnt"));
        myDataFeedLog.setDuplicateFileSize(rs.getLong("duplicate_file_size"));

        return myDataFeedLog;
    }

}
