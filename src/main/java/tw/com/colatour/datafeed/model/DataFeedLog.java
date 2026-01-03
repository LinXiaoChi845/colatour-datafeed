package tw.com.colatour.datafeed.model;

import lombok.Getter;
import lombok.Setter;

import java.sql.Timestamp;

@Getter
@Setter
public class DataFeedLog {

    private Integer logNo;
    private Timestamp logStartTime;
    private Timestamp logEndTime;
    private Integer totalFileCnt;
    private Long totalFileSize;

}
