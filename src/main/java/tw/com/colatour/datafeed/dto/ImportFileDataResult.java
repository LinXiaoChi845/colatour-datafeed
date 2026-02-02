package tw.com.colatour.datafeed.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ImportFileDataResult {

    private Long fileSize;
    private Boolean successMark;
    private Boolean duplicateMark;
    private Boolean emptyAirticketPriceMark;

}
