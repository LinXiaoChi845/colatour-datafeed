package tw.com.colatour.datafeed.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DataFeedFileParam {

    private Integer logNo;
    private String fileName;
    private String dataDate;
    private String dataTime;
    private Long fileSize;

}
