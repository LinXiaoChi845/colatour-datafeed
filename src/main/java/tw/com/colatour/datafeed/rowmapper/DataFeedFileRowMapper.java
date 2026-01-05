package tw.com.colatour.datafeed.rowmapper;

import org.jspecify.annotations.Nullable;
import org.springframework.jdbc.core.RowMapper;
import tw.com.colatour.datafeed.model.DataFeedFile;

import java.sql.ResultSet;
import java.sql.SQLException;

public class DataFeedFileRowMapper implements RowMapper<DataFeedFile> {

    @Override
    public @Nullable DataFeedFile mapRow(ResultSet rs, int rowNum) throws SQLException {
        DataFeedFile myDataFeedFile = new DataFeedFile();

        myDataFeedFile.setFileNo(rs.getInt("file_no"));
        myDataFeedFile.setLogNo(rs.getInt("log_no"));
        myDataFeedFile.setSuccessMark(rs.getBoolean("success_mark"));
        myDataFeedFile.setImportStartTime(rs.getTimestamp("import_start_time"));
        myDataFeedFile.setImportEndTime(rs.getTimestamp("import_end_time"));
        myDataFeedFile.setFileName(rs.getString("file_name"));
        myDataFeedFile.setDataDate(rs.getString("data_date"));
        myDataFeedFile.setDataTime(rs.getString("data_time"));
        myDataFeedFile.setFileSize(rs.getLong("file_size"));
        myDataFeedFile.setTotalPriceCnt(rs.getInt("total_price_cnt"));

        myDataFeedFile.setOfficeId(rs.getString("office_id"));
        myDataFeedFile.setSilo(rs.getString("silo"));
        myDataFeedFile.setCurrency(rs.getString("currency"));
        myDataFeedFile.setOriSeg1City(rs.getString("ori_Seg_1_city"));
        myDataFeedFile.setOriSeg1Airport(rs.getString("ori_Seg_1_airport"));
        myDataFeedFile.setDesSeg1City(rs.getString("des_Seg_1_city"));
        myDataFeedFile.setDesSeg1Airport(rs.getString("des_Seg_1_airport"));
        myDataFeedFile.setOriSeg2City(rs.getString("ori_Seg_2_city"));
        myDataFeedFile.setOriSeg2Airport(rs.getString("ori_Seg_2_airport"));
        myDataFeedFile.setDesSeg2City(rs.getString("des_Seg_2_city"));
        myDataFeedFile.setDesSeg2Airport(rs.getString("des_Seg_2_airport"));
        myDataFeedFile.setStayDurationMin(rs.getShort("stay_duration_min"));
        myDataFeedFile.setStayDurationMax(rs.getShort("stay_duration_max"));
        myDataFeedFile.setDepartureDate1(rs.getString("departure_date_1"));
        myDataFeedFile.setDepartureDate2(rs.getString("departure_date_2"));
        myDataFeedFile.setItineraryType(rs.getString("itinerary_type"));
        myDataFeedFile.setPax1Nos(rs.getShort("pax_1_nos"));
        myDataFeedFile.setPax1Type(rs.getString("pax_1_type"));
        myDataFeedFile.setPax2Nos(rs.getShort("pax_2_nos"));
        myDataFeedFile.setPax2Type(rs.getString("pax_2_type"));
        myDataFeedFile.setPax3Nos(rs.getShort("pax_3_nos"));
        myDataFeedFile.setPax3Type(rs.getString("pax_3_type"));
        myDataFeedFile.setPax4Nos(rs.getShort("pax_4_nos"));
        myDataFeedFile.setPax4Type(rs.getString("pax_4_type"));
        myDataFeedFile.setPax5Nos(rs.getShort("pax_5_nos"));
        myDataFeedFile.setPax5Type(rs.getString("pax_5_type"));
        myDataFeedFile.setPax6Nos(rs.getShort("pax_6_nos"));
        myDataFeedFile.setPax6Type(rs.getString("pax_6_type"));
        myDataFeedFile.setOk(rs.getDouble("ok"));
        myDataFeedFile.setFr(rs.getDouble("fr"));
        myDataFeedFile.setTr(rs.getDouble("tr"));
        myDataFeedFile.setNbReturnedPriceResults(rs.getInt("nb_returned_price_results"));

        myDataFeedFile.setOriOriginSegment1(rs.getString("ori_origin_segment_1"));
        myDataFeedFile.setOriDestinationSegment1(rs.getString("ori_destination_segment_1"));
        myDataFeedFile.setOriOriginSegment2(rs.getString("ori_origin_segment_2"));
        myDataFeedFile.setOriDestinationSegment2(rs.getString("ori_destination_segment_2"));
        myDataFeedFile.setOriStayDurations(rs.getString("ori_stay_durations"));
        myDataFeedFile.setOriDepartureDates(rs.getString("ori_departure_dates"));
        myDataFeedFile.setOriPtcProfile(rs.getString("ori_ptc_profile"));
        myDataFeedFile.setOriCustQuery(rs.getString("ori_cust_query"));

        return myDataFeedFile;
    }
}
