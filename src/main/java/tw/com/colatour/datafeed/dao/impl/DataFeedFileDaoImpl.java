package tw.com.colatour.datafeed.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Component;
import tw.com.colatour.datafeed.dao.DataFeedFileDao;
import tw.com.colatour.datafeed.dto.DataFeedFileParam;
import tw.com.colatour.datafeed.model.DataFeedFile;
import tw.com.colatour.datafeed.rowmapper.DataFeedFileRowMapper;

import java.sql.Timestamp;
import java.time.Instant;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class DataFeedFileDaoImpl implements DataFeedFileDao {

    @Autowired
    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    @Override
    public DataFeedFile getDataFeedFileByFileName(String fileName) {
        String mySql = "SELECT file_no, log_no, success_mark, import_start_time, import_end_time, " +
                " file_name, data_date, data_time, file_size, total_price_cnt, " +
                " office_id, silo, currency, " +
                " ori_seg_1_city, ori_seg_1_airport, des_seg_1_city, des_seg_1_airport, " +
                " ori_seg_2_city, ori_seg_2_airport, des_seg_2_city, des_seg_2_airport, " +
                " stay_duration_min, stay_duration_max, " +
                " departure_date_1, departure_date_2, itinerary_type, " +
                " pax_1_nos, pax_1_type, pax_2_nos, pax_2_type, pax_3_nos, pax_3_type, " +
                " pax_4_nos, pax_4_type, pax_5_nos, pax_5_type, pax_6_nos, pax_6_type, " +
                " ok, fr, tr, nb_returned_price_results, " +
                " ori_origin_segment_1, ori_destination_segment_1, " +
                " ori_origin_segment_2, ori_destination_segment_2, " +
                " ori_stay_durations, ori_departure_dates, " +
                " ori_ptc_profile, ori_cust_query " +
                " FROM data_feed.data_feed_file " +
                " WHERE file_name = :fileName";

        Map<String,Object> myMap = new HashMap<>();

        myMap.put("fileName", fileName);

        List<DataFeedFile> myDataFeedFileList = namedParameterJdbcTemplate.query(mySql, myMap, new DataFeedFileRowMapper());

        if (myDataFeedFileList.isEmpty()) {
            return null;
        } else {
            return myDataFeedFileList.get(0);
        }
    }

    @Override
    public DataFeedFile getDataFeedFileByFileNo(Integer fileNo) {
        String mySql = "SELECT file_no, log_no, success_mark, import_start_time, import_end_time, " +
                " file_name, data_date, data_time, file_size, total_price_cnt, " +
                " office_id, silo, currency, " +
                " ori_seg_1_city, ori_seg_1_airport, des_seg_1_city, des_seg_1_airport, " +
                " ori_seg_2_city, ori_seg_2_airport, des_seg_2_city, des_seg_2_airport, " +
                " stay_duration_min, stay_duration_max, " +
                " departure_date_1, departure_date_2, itinerary_type, " +
                " pax_1_nos, pax_1_type, pax_2_nos, pax_2_type, pax_3_nos, pax_3_type, " +
                " pax_4_nos, pax_4_type, pax_5_nos, pax_5_type, pax_6_nos, pax_6_type, " +
                " ok, fr, tr, nb_returned_price_results, " +
                " ori_origin_segment_1, ori_destination_segment_1, " +
                " ori_origin_segment_2, ori_destination_segment_2, " +
                " ori_stay_durations, ori_departure_dates, " +
                " ori_ptc_profile, ori_cust_query " +
                " FROM data_feed.data_feed_file " +
                " WHERE file_no = :fileNo ";

        Map<String,Object> myMap = new HashMap<>();

        myMap.put("fileNo", fileNo);

        List<DataFeedFile> myDataFeedFileList = namedParameterJdbcTemplate.query(mySql, myMap, new DataFeedFileRowMapper());

        if (myDataFeedFileList.isEmpty()) {
            return null;
        } else {
            return myDataFeedFileList.get(0);
        }
    }

    @Override
    public Integer createDataFeedFile(DataFeedFileParam dataFeedFileParam) {
        String mySql = "INSERT INTO data_feed.data_feed_file ( " +
                " log_no, success_mark, import_start_time, import_end_time, file_name, " +
                " data_date, data_time, file_size, total_price_cnt, " +
                " office_id, silo, currency, " +
                " ori_seg_1_city, ori_seg_1_airport, des_seg_1_city, des_seg_1_airport, " +
                " ori_seg_2_city, ori_seg_2_airport, des_seg_2_city, des_seg_2_airport, " +
                " stay_duration_min, stay_duration_max, " +
                " departure_date_1, departure_date_2, itinerary_type, " +
                " pax_1_nos, pax_1_type, pax_2_nos, pax_2_type, pax_3_nos, pax_3_type, " +
                " pax_4_nos, pax_4_type, pax_5_nos, pax_5_type, pax_6_nos, pax_6_type, " +
                " ok, fr, tr, nb_returned_price_results, " +
                " ori_origin_segment_1, ori_destination_segment_1, " +
                " ori_origin_segment_2, ori_destination_segment_2, " +
                " ori_stay_durations, ori_departure_dates, ori_ptc_profile, ori_cust_query ) " +
                " VALUES ( " +
                " :logNo, :successMark, :importStartTime, :importEndTime, :fileName, " +
                " :dataDate, :dataTime, :fileSize, :totalPriceCnt, " +
                " :officeId, :silo, :currency, " +
                " :oriSeg1City, :oriSeg1Airport, :desSeg1City, :desSeg1Airport, " +
                " :oriSeg2City, :oriSeg2Airport, :desSeg2City, :desSeg2Airport, " +
                " :stayDurationMin, :stayDurationMax, " +
                " :departureDate1, :departureDate2, :itineraryType, " +
                " :pax1Nos, :pax1Type, :pax2Nos, :pax2Type, :pax3Nos, :pax3Type, " +
                " :pax4Nos, :pax4Type, :pax5Nos, :pax5Type, :pax6Nos, :pax6Type, " +
                " :Ok, :Fr, :Tr, :nbReturnedPriceResults, " +
                " :oriOriginSegment1, :oriDestinationSegment1, " +
                " :oriOriginSegment2, :oriDestinationSegment2, " +
                " :oriStayDurations, :oriDepartureDates, :oriPtcProfile, :oriCustQuery ) ";

        Map<String, Object> myMap = new HashMap<>();

        myMap.put("logNo", dataFeedFileParam.getLogNo());
        myMap.put("successMark", Boolean.FALSE);
        myMap.put("importStartTime", Timestamp.from(Instant.now()));
        myMap.put("importEndTime", new Timestamp(0L));
        myMap.put("fileName", dataFeedFileParam.getFileName());
        myMap.put("dataDate", dataFeedFileParam.getDataDate());
        myMap.put("dataTime", dataFeedFileParam.getDataTime());
        myMap.put("fileSize", dataFeedFileParam.getFileSize());
        myMap.put("totalPriceCnt", 0);

        myMap.put("officeId", "");
        myMap.put("silo", "");
        myMap.put("currency", "");
        myMap.put("oriSeg1City", "");
        myMap.put("oriSeg1Airport", "");
        myMap.put("desSeg1City", "");
        myMap.put("desSeg1Airport", "");
        myMap.put("oriSeg2City", "");
        myMap.put("oriSeg2Airport", "");
        myMap.put("desSeg2City", "");
        myMap.put("desSeg2Airport", "");
        myMap.put("stayDurationMin", 0);
        myMap.put("stayDurationMax", 0);
        myMap.put("departureDate1", "");
        myMap.put("departureDate2", "");
        myMap.put("itineraryType", "");
        myMap.put("pax1Nos", 0);
        myMap.put("pax1Type", "");
        myMap.put("pax2Nos", 0);
        myMap.put("pax2Type", "");
        myMap.put("pax3Nos", 0);
        myMap.put("pax3Type", "");
        myMap.put("pax4Nos", 0);
        myMap.put("pax4Type", "");
        myMap.put("pax5Nos", 0);
        myMap.put("pax5Type", "");
        myMap.put("pax6Nos", 0);
        myMap.put("pax6Type", "");
        myMap.put("Ok", 0);
        myMap.put("Fr", 0);
        myMap.put("Tr", 0);
        myMap.put("nbReturnedPriceResults", 0);

        myMap.put("oriOriginSegment1", "");
        myMap.put("oriDestinationSegment1", "");
        myMap.put("oriOriginSegment2", "");
        myMap.put("oriDestinationSegment2", "");
        myMap.put("oriStayDurations", "");
        myMap.put("oriDepartureDates", "");
        myMap.put("oriPtcProfile", "");
        myMap.put("oriCustQuery", "");

        KeyHolder myKeyHolder = new GeneratedKeyHolder();

        namedParameterJdbcTemplate.update(mySql, new MapSqlParameterSource(myMap), myKeyHolder);

        // PostgreSQL 不知道哪個欄位是 Key, 所以要指定欄位名稱，不然會報異常 (
        Integer myFileNo = (Integer)myKeyHolder.getKeys().get("file_no");

        return myFileNo;
    }

    @Override
    public void updateDataFeedFile(DataFeedFile dataFeedFile) {
        String mySql = "UPDATE data_feed.data_feed_file " +
                "SET success_mark = :successMark, " +
                " import_end_time = :importEndTime, " +
                " total_price_cnt = :totalPriceCnt, " +
                " office_id = :officeId, " +
                " silo = :silo, " +
                " currency = :currency, " +
                " ori_seg_1_city = :oriSeg1City, " +
                " ori_seg_1_airport = :oriSeg1Airport, " +
                " des_seg_1_city = :desSeg1City, " +
                " des_seg_1_airport = :desSeg1Airport, " +
                " ori_seg_2_city = :oriSeg2City, " +
                " ori_seg_2_airport = :oriSeg2Airport, " +
                " des_seg_2_city = :desSeg2City, " +
                " des_seg_2_airport = :desSeg2Airport, " +
                " stay_duration_min = :stayDurationMin, " +
                " stay_duration_max = :stayDurationMax, " +
                " departure_date_1 = :departureDate1, " +
                " departure_date_2 = :departureDate2, " +
                " itinerary_type = :itineraryType, " +
                " pax_1_nos = :pax1Nos, " +
                " pax_1_type = :pax1Type, " +
                " pax_2_nos = :pax2Nos, " +
                " pax_2_type = :pax2Type, " +
                " pax_3_nos = :pax3Nos, " +
                " pax_3_type = :pax3Type, " +
                " pax_4_nos = :pax4Nos, " +
                " pax_4_type = :pax4Type, " +
                " pax_5_nos = :pax5Nos, " +
                " pax_5_type = :pax5Type, " +
                " pax_6_nos = :pax6Nos, " +
                " pax_6_type = :pax6Type, " +
                " ok = :Ok, " +
                " fr = :Fr, " +
                " tr = :Tr, " +
                " nb_returned_price_results = :nbReturnedPriceResults, " +
                " ori_origin_segment_1 = :oriOriginSegment1, " +
                " ori_destination_segment_1 = :oriDestinationSegment1, " +
                " ori_origin_segment_2 = :oriOriginSegment2, " +
                " ori_destination_segment_2 = :oriDestinationSegment2, " +
                " ori_stay_durations = :oriStayDurations, " +
                " ori_departure_dates = :oriDepartureDates, " +
                " ori_ptc_profile = :oriPtcProfile, " +
                " ori_cust_query = :oriCustQuery " +
                " WHERE file_no = :fileNo ";

        Map<String,Object> myMap = new HashMap<>();
        myMap.put("fileNo", dataFeedFile.getFileNo());
        myMap.put("successMark", Boolean.TRUE);
        myMap.put("importEndTime", Timestamp.from(Instant.now()));
        myMap.put("totalPriceCnt", dataFeedFile.getTotalPriceCnt());

        myMap.put("officeId", dataFeedFile.getOfficeId());
        myMap.put("silo", dataFeedFile.getSilo());
        myMap.put("currency", dataFeedFile.getCurrency());
        myMap.put("oriSeg1City", dataFeedFile.getOriSeg1City());
        myMap.put("oriSeg1Airport", dataFeedFile.getOriSeg1Airport());
        myMap.put("desSeg1City", dataFeedFile.getDesSeg1City());
        myMap.put("desSeg1Airport", dataFeedFile.getDesSeg1Airport());
        myMap.put("oriSeg2City", dataFeedFile.getOriSeg2City());
        myMap.put("oriSeg2Airport", dataFeedFile.getOriSeg2Airport());
        myMap.put("desSeg2City", dataFeedFile.getDesSeg2City());
        myMap.put("desSeg2Airport", dataFeedFile.getDesSeg2Airport());
        myMap.put("stayDurationMin", dataFeedFile.getStayDurationMin());
        myMap.put("stayDurationMax", dataFeedFile.getStayDurationMax());
        myMap.put("departureDate1", dataFeedFile.getDepartureDate1());
        myMap.put("departureDate2", dataFeedFile.getDepartureDate2());
        myMap.put("itineraryType", dataFeedFile.getItineraryType());
        myMap.put("pax1Nos", dataFeedFile.getPax1Nos());
        myMap.put("pax1Type", dataFeedFile.getPax1Type());
        myMap.put("pax2Nos", dataFeedFile.getPax2Nos());
        myMap.put("pax2Type", dataFeedFile.getPax2Type());
        myMap.put("pax3Nos", dataFeedFile.getPax3Nos());
        myMap.put("pax3Type", dataFeedFile.getPax3Type());
        myMap.put("pax4Nos", dataFeedFile.getPax4Nos());
        myMap.put("pax4Type", dataFeedFile.getPax4Type());
        myMap.put("pax5Nos", dataFeedFile.getPax5Nos());
        myMap.put("pax5Type", dataFeedFile.getPax5Type());
        myMap.put("pax6Nos", dataFeedFile.getPax6Nos());
        myMap.put("pax6Type", dataFeedFile.getPax6Type());
        myMap.put("Ok", dataFeedFile.getOk());
        myMap.put("Fr", dataFeedFile.getFr());
        myMap.put("Tr", dataFeedFile.getTr());
        myMap.put("nbReturnedPriceResults", dataFeedFile.getNbReturnedPriceResults());

        myMap.put("oriOriginSegment1", dataFeedFile.getOriOriginSegment1());
        myMap.put("oriDestinationSegment1", dataFeedFile.getOriDestinationSegment1());
        myMap.put("oriOriginSegment2", dataFeedFile.getOriOriginSegment2());
        myMap.put("oriDestinationSegment2", dataFeedFile.getOriDestinationSegment2());
        myMap.put("oriStayDurations", dataFeedFile.getOriStayDurations());
        myMap.put("oriDepartureDates", dataFeedFile.getOriDepartureDates());
        myMap.put("oriPtcProfile", dataFeedFile.getOriPtcProfile());
        myMap.put("oriCustQuery", dataFeedFile.getOriCustQuery());

        namedParameterJdbcTemplate.update(mySql, myMap);
    }
}
