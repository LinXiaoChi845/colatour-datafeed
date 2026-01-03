package tw.com.colatour.datafeed.dto;

import lombok.Getter;
import lombok.Setter;
import tw.com.colatour.datafeed.model.DataFeedLog;

@Getter
@Setter
public class ApiResult {

    private boolean successMark;
    private String errorMessage;
    private DataFeedLog dataFeedLog;

}
