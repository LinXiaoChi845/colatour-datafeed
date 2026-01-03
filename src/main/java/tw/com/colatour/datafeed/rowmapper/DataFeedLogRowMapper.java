package tw.com.colatour.datafeed.rowmapper;

import org.jspecify.annotations.Nullable;
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

        return myDataFeedLog;
    }
}
