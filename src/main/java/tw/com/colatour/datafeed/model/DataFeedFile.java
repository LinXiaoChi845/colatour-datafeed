package tw.com.colatour.datafeed.model;

import lombok.Getter;
import lombok.Setter;

import java.sql.Timestamp;

@Getter
@Setter
public class DataFeedFile {

    private Integer fileNo;
    private Integer logNo;
    private Boolean successMark;
    private Timestamp importStartTime;
    private Timestamp importEndTime;
    private String fullFileName;
    private String filePath;
    private String fileName;
    private String dataDate;
    private String dataTime;
    private Long fileSize;
    private Integer totalPriceCnt;

    private String officeId;
    private String silo;
    private String currency;
    private String oriSeg1City;
    private String oriSeg1Airport;
    private String desSeg1City;
    private String desSeg1Airport;
    private String oriSeg2City;
    private String oriSeg2Airport;
    private String desSeg2City;
    private String desSeg2Airport;
    private Short stayDurationMin;
    private Short stayDurationMax;
    private String departureDate1;
    private String departureDate2;
    private String itineraryType;
    private Short pax1Nos;
    private String pax1Type;
    private Short pax2Nos;
    private String pax2Type;
    private Short pax3Nos;
    private String pax3Type;
    private Short pax4Nos;
    private String pax4Type;
    private Short pax5Nos;
    private String pax5Type;
    private Short pax6Nos;
    private String pax6Type;
    private Double ok;
    private Double fr;
    private Double tr;
    private Integer nbReturnedPriceResults;

    private String oriOriginSegment1;
    private String oriDestinationSegment1;
    private String oriOriginSegment2;
    private String oriDestinationSegment2;
    private String oriStayDurations;
    private String oriDepartureDates;
    private String oriPtcProfile;
    private String oriCustQuery;

}
