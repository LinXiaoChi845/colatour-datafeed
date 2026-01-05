package tw.com.colatour.datafeed.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Component;
import tw.com.colatour.datafeed.dao.DataFeedAirticketPriceD2Dao;
import tw.com.colatour.datafeed.model.DataFeedAirticketPriceD2;

import java.util.List;

@Component
public class DataFeedAirticketPriceD2DaoImpl implements DataFeedAirticketPriceD2Dao {

    @Autowired
    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    @Override
    public void createDataFeedAirticketPriceD2s(List<DataFeedAirticketPriceD2> dataFeedAirticketPriceD2List) {
        String mySql = "INSERT INTO data_feed.data_feed_airticket_price_D2 ( " +
                " file_no, price_no, " +
                " ap_dna, ap_dnb, ap_dnc, ap_dnd, ap_dne, ap_dnf, ap_dng, ap_dnh, ap_dni, ap_dnj, ap_dnk, ap_dnl, ap_dnm, " +
                " ap_dnn, ap_dno, ap_dnp, ap_dnq, ap_dnr, ap_dns, ap_dnt, ap_dnu, ap_dnv, ap_dnw, ap_dnx, ap_dny, ap_dnz, " +
                " ap_doa, ap_dob, ap_doc, ap_dod, ap_doe, ap_dof, ap_dog, ap_doh, ap_doi, ap_doj, ap_dok, ap_dol, ap_dom, " +
                " ap_don, ap_doo, ap_dop, ap_doq, ap_dor, ap_dos, ap_dot, ap_dou, ap_dov, ap_dow, ap_dox, ap_doy, ap_doz, " +
                " ap_dpa, ap_dpb, ap_dpc, ap_dpd, ap_dpe, ap_dpf, ap_dpg, ap_dph, ap_dpi, ap_dpj, ap_dpk, ap_dpl, ap_dpm, " +
                " ap_dpn, ap_dpo, ap_dpp, ap_dpq, ap_dpr, ap_dps, ap_dpt, ap_dpu, ap_dpv, ap_dpw, ap_dpx, ap_dpy, ap_dpz, " +
                " ap_dqa, ap_dqb, ap_dqc, ap_dqd, ap_dqe, ap_dqf, ap_dqg, ap_dqh, ap_dqi, ap_dqj, ap_dqk, ap_dql, ap_dqm, " +
                " ap_dqn, ap_dqo, ap_dqp, ap_dqq, ap_dqr, ap_dqs, ap_dqt, ap_dqu, ap_dqv, ap_dqw, ap_dqx, ap_dqy, ap_dqz, " +
                " ap_dra, ap_drb, ap_drc, ap_drd, ap_dre, ap_drf, ap_drg, ap_drh, ap_dri, ap_drj, ap_drk, ap_drl, ap_drm, " +
                " ap_drn, ap_dro, ap_drp, ap_drq, ap_drr, ap_drs, ap_drt, ap_dru, ap_drv, ap_drw, ap_drx, ap_dry, ap_drz, " +
                " ap_dsa, ap_dsb, ap_dsc, ap_dsd, ap_dse, ap_dsf, ap_dsg, ap_dsh, ap_dsi, ap_dsj, ap_dsk, ap_dsl, ap_dsm, " +
                " ap_dsn, ap_dso, ap_dsp, ap_dsq, ap_dsr, ap_dss, ap_dst, ap_dsu, ap_dsv, ap_dsw, ap_dsx, ap_dsy, ap_dsz, " +
                " ap_dta, ap_dtb, ap_dtc, ap_dtd, ap_dte, ap_dtf, ap_dtg, ap_dth, ap_dti, ap_dtj, ap_dtk, ap_dtl, ap_dtm, " +
                " ap_dtn, ap_dto, ap_dtp, ap_dtq, ap_dtr, ap_dts, ap_dtt, ap_dtu, ap_dtv, ap_dtw, ap_dtx, ap_dty, ap_dtz, " +
                " ap_dua, ap_dub, ap_duc, ap_dud, ap_due, ap_duf, ap_dug, ap_duh, ap_dui, ap_duj, ap_duk, ap_dul, ap_dum, " +
                " ap_dun, ap_duo, ap_dup, ap_duq, ap_dur, ap_dus, ap_dut, ap_duu, ap_duv, ap_duw, ap_dux, ap_duy, ap_duz, " +
                " ap_dva, ap_dvb, ap_dvc, ap_dvd, ap_dve, ap_dvf, ap_dvg, ap_dvh, ap_dvi, ap_dvj, ap_dvk, ap_dvl, ap_dvm, " +
                " ap_dvn, ap_dvo, ap_dvp, ap_dvq, ap_dvr, ap_dvs, ap_dvt, ap_dvu, ap_dvv, ap_dvw, ap_dvx, ap_dvy, ap_dvz, " +
                " ap_dwa, ap_dwb, ap_dwc, ap_dwd, ap_dwe, ap_dwf, ap_dwg, ap_dwh, ap_dwi, ap_dwj, ap_dwk, ap_dwl, ap_dwm, " +
                " ap_dwn, ap_dwo, ap_dwp, ap_dwq, ap_dwr, ap_dws, ap_dwt, ap_dwu, ap_dwv, ap_dww, ap_dwx, ap_dwy, ap_dwz, " +
                " ap_dxa, ap_dxb, ap_dxc, ap_dxd, ap_dxe, ap_dxf, ap_dxg, ap_dxh, ap_dxi, ap_dxj, ap_dxk, ap_dxl, ap_dxm, " +
                " ap_dxn, ap_dxo, ap_dxp, ap_dxq, ap_dxr, ap_dxs, ap_dxt, ap_dxu, ap_dxv, ap_dxw, ap_dxx, ap_dxy, ap_dxz, " +
                " ap_dya, ap_dyb, ap_dyc, ap_dyd, ap_dye, ap_dyf, ap_dyg, ap_dyh, ap_dyi, ap_dyj, ap_dyk, ap_dyl, ap_dym, " +
                " ap_dyn, ap_dyo, ap_dyp, ap_dyq, ap_dyr, ap_dys, ap_dyt, ap_dyu, ap_dyv, ap_dyw, ap_dyx, ap_dyy, ap_dyz, " +
                " ap_dza, ap_dzb, ap_dzc, ap_dzd, ap_dze, ap_dzf, ap_dzg, ap_dzh, ap_dzi, ap_dzj, ap_dzk, ap_dzl, ap_dzm, " +
                " ap_dzn, ap_dzo, ap_dzp, ap_dzq, ap_dzr, ap_dzs, ap_dzt, ap_dzu, ap_dzv, ap_dzw, ap_dzx, ap_dzy, ap_dzz ) " +
                " VALUES ( " +
                " :fileNo, :priceNo, " +
                " :apDna, :apDnb, :apDnc, :apDnd, :apDne, :apDnf, :apDng, :apDnh, :apDni, :apDnj, :apDnk, :apDnl, :apDnm, " +
                " :apDnn, :apDno, :apDnp, :apDnq, :apDnr, :apDns, :apDnt, :apDnu, :apDnv, :apDnw, :apDnx, :apDny, :apDnz, " +
                " :apDoa, :apDob, :apDoc, :apDod, :apDoe, :apDof, :apDog, :apDoh, :apDoi, :apDoj, :apDok, :apDol, :apDom, " +
                " :apDon, :apDoo, :apDop, :apDoq, :apDor, :apDos, :apDot, :apDou, :apDov, :apDow, :apDox, :apDoy, :apDoz, " +
                " :apDpa, :apDpb, :apDpc, :apDpd, :apDpe, :apDpf, :apDpg, :apDph, :apDpi, :apDpj, :apDpk, :apDpl, :apDpm, " +
                " :apDpn, :apDpo, :apDpp, :apDpq, :apDpr, :apDps, :apDpt, :apDpu, :apDpv, :apDpw, :apDpx, :apDpy, :apDpz, " +
                " :apDqa, :apDqb, :apDqc, :apDqd, :apDqe, :apDqf, :apDqg, :apDqh, :apDqi, :apDqj, :apDqk, :apDql, :apDqm, " +
                " :apDqn, :apDqo, :apDqp, :apDqq, :apDqr, :apDqs, :apDqt, :apDqu, :apDqv, :apDqw, :apDqx, :apDqy, :apDqz, " +
                " :apDra, :apDrb, :apDrc, :apDrd, :apDre, :apDrf, :apDrg, :apDrh, :apDri, :apDrj, :apDrk, :apDrl, :apDrm, " +
                " :apDrn, :apDro, :apDrp, :apDrq, :apDrr, :apDrs, :apDrt, :apDru, :apDrv, :apDrw, :apDrx, :apDry, :apDrz, " +
                " :apDsa, :apDsb, :apDsc, :apDsd, :apDse, :apDsf, :apDsg, :apDsh, :apDsi, :apDsj, :apDsk, :apDsl, :apDsm, " +
                " :apDsn, :apDso, :apDsp, :apDsq, :apDsr, :apDss, :apDst, :apDsu, :apDsv, :apDsw, :apDsx, :apDsy, :apDsz, " +
                " :apDta, :apDtb, :apDtc, :apDtd, :apDte, :apDtf, :apDtg, :apDth, :apDti, :apDtj, :apDtk, :apDtl, :apDtm, " +
                " :apDtn, :apDto, :apDtp, :apDtq, :apDtr, :apDts, :apDtt, :apDtu, :apDtv, :apDtw, :apDtx, :apDty, :apDtz, " +
                " :apDua, :apDub, :apDuc, :apDud, :apDue, :apDuf, :apDug, :apDuh, :apDui, :apDuj, :apDuk, :apDul, :apDum, " +
                " :apDun, :apDuo, :apDup, :apDuq, :apDur, :apDus, :apDut, :apDuu, :apDuv, :apDuw, :apDux, :apDuy, :apDuz, " +
                " :apDva, :apDvb, :apDvc, :apDvd, :apDve, :apDvf, :apDvg, :apDvh, :apDvi, :apDvj, :apDvk, :apDvl, :apDvm, " +
                " :apDvn, :apDvo, :apDvp, :apDvq, :apDvr, :apDvs, :apDvt, :apDvu, :apDvv, :apDvw, :apDvx, :apDvy, :apDvz, " +
                " :apDwa, :apDwb, :apDwc, :apDwd, :apDwe, :apDwf, :apDwg, :apDwh, :apDwi, :apDwj, :apDwk, :apDwl, :apDwm, " +
                " :apDwn, :apDwo, :apDwp, :apDwq, :apDwr, :apDws, :apDwt, :apDwu, :apDwv, :apDww, :apDwx, :apDwy, :apDwz, " +
                " :apDxa, :apDxb, :apDxc, :apDxd, :apDxe, :apDxf, :apDxg, :apDxh, :apDxi, :apDxj, :apDxk, :apDxl, :apDxm, " +
                " :apDxn, :apDxo, :apDxp, :apDxq, :apDxr, :apDxs, :apDxt, :apDxu, :apDxv, :apDxw, :apDxx, :apDxy, :apDxz, " +
                " :apDya, :apDyb, :apDyc, :apDyd, :apDye, :apDyf, :apDyg, :apDyh, :apDyi, :apDyj, :apDyk, :apDyl, :apDym, " +
                " :apDyn, :apDyo, :apDyp, :apDyq, :apDyr, :apDys, :apDyt, :apDyu, :apDyv, :apDyw, :apDyx, :apDyy, :apDyz, " +
                " :apDza, :apDzb, :apDzc, :apDzd, :apDze, :apDzf, :apDzg, :apDzh, :apDzi, :apDzj, :apDzk, :apDzl, :apDzm, " +
                " :apDzn, :apDzo, :apDzp, :apDzq, :apDzr, :apDzs, :apDzt, :apDzu, :apDzv, :apDzw, :apDzx, :apDzy, :apDzz ) ";

        MapSqlParameterSource[] myParameterSourceAry = new MapSqlParameterSource[dataFeedAirticketPriceD2List.size()];

        for (int i = 0; i < dataFeedAirticketPriceD2List.size(); i++) {
            DataFeedAirticketPriceD2 wkDataFeedAirticketPriceD2 = dataFeedAirticketPriceD2List.get(i);

            myParameterSourceAry[i] = new MapSqlParameterSource();

            myParameterSourceAry[i].addValue("fileNo", wkDataFeedAirticketPriceD2.getFileNo());
            myParameterSourceAry[i].addValue("priceNo", wkDataFeedAirticketPriceD2.getPriceNo());
            myParameterSourceAry[i].addValue("apDna", wkDataFeedAirticketPriceD2.getApDna());
            myParameterSourceAry[i].addValue("apDnb", wkDataFeedAirticketPriceD2.getApDnb());
            myParameterSourceAry[i].addValue("apDnc", wkDataFeedAirticketPriceD2.getApDnc());
            myParameterSourceAry[i].addValue("apDnd", wkDataFeedAirticketPriceD2.getApDnd());
            myParameterSourceAry[i].addValue("apDne", wkDataFeedAirticketPriceD2.getApDne());
            myParameterSourceAry[i].addValue("apDnf", wkDataFeedAirticketPriceD2.getApDnf());
            myParameterSourceAry[i].addValue("apDng", wkDataFeedAirticketPriceD2.getApDng());
            myParameterSourceAry[i].addValue("apDnh", wkDataFeedAirticketPriceD2.getApDnh());
            myParameterSourceAry[i].addValue("apDni", wkDataFeedAirticketPriceD2.getApDni());
            myParameterSourceAry[i].addValue("apDnj", wkDataFeedAirticketPriceD2.getApDnj());
            myParameterSourceAry[i].addValue("apDnk", wkDataFeedAirticketPriceD2.getApDnk());
            myParameterSourceAry[i].addValue("apDnl", wkDataFeedAirticketPriceD2.getApDnl());
            myParameterSourceAry[i].addValue("apDnm", wkDataFeedAirticketPriceD2.getApDnm());
            myParameterSourceAry[i].addValue("apDnn", wkDataFeedAirticketPriceD2.getApDnn());
            myParameterSourceAry[i].addValue("apDno", wkDataFeedAirticketPriceD2.getApDno());
            myParameterSourceAry[i].addValue("apDnp", wkDataFeedAirticketPriceD2.getApDnp());
            myParameterSourceAry[i].addValue("apDnq", wkDataFeedAirticketPriceD2.getApDnq());
            myParameterSourceAry[i].addValue("apDnr", wkDataFeedAirticketPriceD2.getApDnr());
            myParameterSourceAry[i].addValue("apDns", wkDataFeedAirticketPriceD2.getApDns());
            myParameterSourceAry[i].addValue("apDnt", wkDataFeedAirticketPriceD2.getApDnt());
            myParameterSourceAry[i].addValue("apDnu", wkDataFeedAirticketPriceD2.getApDnu());
            myParameterSourceAry[i].addValue("apDnv", wkDataFeedAirticketPriceD2.getApDnv());
            myParameterSourceAry[i].addValue("apDnw", wkDataFeedAirticketPriceD2.getApDnw());
            myParameterSourceAry[i].addValue("apDnx", wkDataFeedAirticketPriceD2.getApDnx());
            myParameterSourceAry[i].addValue("apDny", wkDataFeedAirticketPriceD2.getApDny());
            myParameterSourceAry[i].addValue("apDnz", wkDataFeedAirticketPriceD2.getApDnz());
            myParameterSourceAry[i].addValue("apDoa", wkDataFeedAirticketPriceD2.getApDoa());
            myParameterSourceAry[i].addValue("apDob", wkDataFeedAirticketPriceD2.getApDob());
            myParameterSourceAry[i].addValue("apDoc", wkDataFeedAirticketPriceD2.getApDoc());
            myParameterSourceAry[i].addValue("apDod", wkDataFeedAirticketPriceD2.getApDod());
            myParameterSourceAry[i].addValue("apDoe", wkDataFeedAirticketPriceD2.getApDoe());
            myParameterSourceAry[i].addValue("apDof", wkDataFeedAirticketPriceD2.getApDof());
            myParameterSourceAry[i].addValue("apDog", wkDataFeedAirticketPriceD2.getApDog());
            myParameterSourceAry[i].addValue("apDoh", wkDataFeedAirticketPriceD2.getApDoh());
            myParameterSourceAry[i].addValue("apDoi", wkDataFeedAirticketPriceD2.getApDoi());
            myParameterSourceAry[i].addValue("apDoj", wkDataFeedAirticketPriceD2.getApDoj());
            myParameterSourceAry[i].addValue("apDok", wkDataFeedAirticketPriceD2.getApDok());
            myParameterSourceAry[i].addValue("apDol", wkDataFeedAirticketPriceD2.getApDol());
            myParameterSourceAry[i].addValue("apDom", wkDataFeedAirticketPriceD2.getApDom());
            myParameterSourceAry[i].addValue("apDon", wkDataFeedAirticketPriceD2.getApDon());
            myParameterSourceAry[i].addValue("apDoo", wkDataFeedAirticketPriceD2.getApDoo());
            myParameterSourceAry[i].addValue("apDop", wkDataFeedAirticketPriceD2.getApDop());
            myParameterSourceAry[i].addValue("apDoq", wkDataFeedAirticketPriceD2.getApDoq());
            myParameterSourceAry[i].addValue("apDor", wkDataFeedAirticketPriceD2.getApDor());
            myParameterSourceAry[i].addValue("apDos", wkDataFeedAirticketPriceD2.getApDos());
            myParameterSourceAry[i].addValue("apDot", wkDataFeedAirticketPriceD2.getApDot());
            myParameterSourceAry[i].addValue("apDou", wkDataFeedAirticketPriceD2.getApDou());
            myParameterSourceAry[i].addValue("apDov", wkDataFeedAirticketPriceD2.getApDov());
            myParameterSourceAry[i].addValue("apDow", wkDataFeedAirticketPriceD2.getApDow());
            myParameterSourceAry[i].addValue("apDox", wkDataFeedAirticketPriceD2.getApDox());
            myParameterSourceAry[i].addValue("apDoy", wkDataFeedAirticketPriceD2.getApDoy());
            myParameterSourceAry[i].addValue("apDoz", wkDataFeedAirticketPriceD2.getApDoz());
            myParameterSourceAry[i].addValue("apDpa", wkDataFeedAirticketPriceD2.getApDpa());
            myParameterSourceAry[i].addValue("apDpb", wkDataFeedAirticketPriceD2.getApDpb());
            myParameterSourceAry[i].addValue("apDpc", wkDataFeedAirticketPriceD2.getApDpc());
            myParameterSourceAry[i].addValue("apDpd", wkDataFeedAirticketPriceD2.getApDpd());
            myParameterSourceAry[i].addValue("apDpe", wkDataFeedAirticketPriceD2.getApDpe());
            myParameterSourceAry[i].addValue("apDpf", wkDataFeedAirticketPriceD2.getApDpf());
            myParameterSourceAry[i].addValue("apDpg", wkDataFeedAirticketPriceD2.getApDpg());
            myParameterSourceAry[i].addValue("apDph", wkDataFeedAirticketPriceD2.getApDph());
            myParameterSourceAry[i].addValue("apDpi", wkDataFeedAirticketPriceD2.getApDpi());
            myParameterSourceAry[i].addValue("apDpj", wkDataFeedAirticketPriceD2.getApDpj());
            myParameterSourceAry[i].addValue("apDpk", wkDataFeedAirticketPriceD2.getApDpk());
            myParameterSourceAry[i].addValue("apDpl", wkDataFeedAirticketPriceD2.getApDpl());
            myParameterSourceAry[i].addValue("apDpm", wkDataFeedAirticketPriceD2.getApDpm());
            myParameterSourceAry[i].addValue("apDpn", wkDataFeedAirticketPriceD2.getApDpn());
            myParameterSourceAry[i].addValue("apDpo", wkDataFeedAirticketPriceD2.getApDpo());
            myParameterSourceAry[i].addValue("apDpp", wkDataFeedAirticketPriceD2.getApDpp());
            myParameterSourceAry[i].addValue("apDpq", wkDataFeedAirticketPriceD2.getApDpq());
            myParameterSourceAry[i].addValue("apDpr", wkDataFeedAirticketPriceD2.getApDpr());
            myParameterSourceAry[i].addValue("apDps", wkDataFeedAirticketPriceD2.getApDps());
            myParameterSourceAry[i].addValue("apDpt", wkDataFeedAirticketPriceD2.getApDpt());
            myParameterSourceAry[i].addValue("apDpu", wkDataFeedAirticketPriceD2.getApDpu());
            myParameterSourceAry[i].addValue("apDpv", wkDataFeedAirticketPriceD2.getApDpv());
            myParameterSourceAry[i].addValue("apDpw", wkDataFeedAirticketPriceD2.getApDpw());
            myParameterSourceAry[i].addValue("apDpx", wkDataFeedAirticketPriceD2.getApDpx());
            myParameterSourceAry[i].addValue("apDpy", wkDataFeedAirticketPriceD2.getApDpy());
            myParameterSourceAry[i].addValue("apDpz", wkDataFeedAirticketPriceD2.getApDpz());
            myParameterSourceAry[i].addValue("apDqa", wkDataFeedAirticketPriceD2.getApDqa());
            myParameterSourceAry[i].addValue("apDqb", wkDataFeedAirticketPriceD2.getApDqb());
            myParameterSourceAry[i].addValue("apDqc", wkDataFeedAirticketPriceD2.getApDqc());
            myParameterSourceAry[i].addValue("apDqd", wkDataFeedAirticketPriceD2.getApDqd());
            myParameterSourceAry[i].addValue("apDqe", wkDataFeedAirticketPriceD2.getApDqe());
            myParameterSourceAry[i].addValue("apDqf", wkDataFeedAirticketPriceD2.getApDqf());
            myParameterSourceAry[i].addValue("apDqg", wkDataFeedAirticketPriceD2.getApDqg());
            myParameterSourceAry[i].addValue("apDqh", wkDataFeedAirticketPriceD2.getApDqh());
            myParameterSourceAry[i].addValue("apDqi", wkDataFeedAirticketPriceD2.getApDqi());
            myParameterSourceAry[i].addValue("apDqj", wkDataFeedAirticketPriceD2.getApDqj());
            myParameterSourceAry[i].addValue("apDqk", wkDataFeedAirticketPriceD2.getApDqk());
            myParameterSourceAry[i].addValue("apDql", wkDataFeedAirticketPriceD2.getApDql());
            myParameterSourceAry[i].addValue("apDqm", wkDataFeedAirticketPriceD2.getApDqm());
            myParameterSourceAry[i].addValue("apDqn", wkDataFeedAirticketPriceD2.getApDqn());
            myParameterSourceAry[i].addValue("apDqo", wkDataFeedAirticketPriceD2.getApDqo());
            myParameterSourceAry[i].addValue("apDqp", wkDataFeedAirticketPriceD2.getApDqp());
            myParameterSourceAry[i].addValue("apDqq", wkDataFeedAirticketPriceD2.getApDqq());
            myParameterSourceAry[i].addValue("apDqr", wkDataFeedAirticketPriceD2.getApDqr());
            myParameterSourceAry[i].addValue("apDqs", wkDataFeedAirticketPriceD2.getApDqs());
            myParameterSourceAry[i].addValue("apDqt", wkDataFeedAirticketPriceD2.getApDqt());
            myParameterSourceAry[i].addValue("apDqu", wkDataFeedAirticketPriceD2.getApDqu());
            myParameterSourceAry[i].addValue("apDqv", wkDataFeedAirticketPriceD2.getApDqv());
            myParameterSourceAry[i].addValue("apDqw", wkDataFeedAirticketPriceD2.getApDqw());
            myParameterSourceAry[i].addValue("apDqx", wkDataFeedAirticketPriceD2.getApDqx());
            myParameterSourceAry[i].addValue("apDqy", wkDataFeedAirticketPriceD2.getApDqy());
            myParameterSourceAry[i].addValue("apDqz", wkDataFeedAirticketPriceD2.getApDqz());
            myParameterSourceAry[i].addValue("apDra", wkDataFeedAirticketPriceD2.getApDra());
            myParameterSourceAry[i].addValue("apDrb", wkDataFeedAirticketPriceD2.getApDrb());
            myParameterSourceAry[i].addValue("apDrc", wkDataFeedAirticketPriceD2.getApDrc());
            myParameterSourceAry[i].addValue("apDrd", wkDataFeedAirticketPriceD2.getApDrd());
            myParameterSourceAry[i].addValue("apDre", wkDataFeedAirticketPriceD2.getApDre());
            myParameterSourceAry[i].addValue("apDrf", wkDataFeedAirticketPriceD2.getApDrf());
            myParameterSourceAry[i].addValue("apDrg", wkDataFeedAirticketPriceD2.getApDrg());
            myParameterSourceAry[i].addValue("apDrh", wkDataFeedAirticketPriceD2.getApDrh());
            myParameterSourceAry[i].addValue("apDri", wkDataFeedAirticketPriceD2.getApDri());
            myParameterSourceAry[i].addValue("apDrj", wkDataFeedAirticketPriceD2.getApDrj());
            myParameterSourceAry[i].addValue("apDrk", wkDataFeedAirticketPriceD2.getApDrk());
            myParameterSourceAry[i].addValue("apDrl", wkDataFeedAirticketPriceD2.getApDrl());
            myParameterSourceAry[i].addValue("apDrm", wkDataFeedAirticketPriceD2.getApDrm());
            myParameterSourceAry[i].addValue("apDrn", wkDataFeedAirticketPriceD2.getApDrn());
            myParameterSourceAry[i].addValue("apDro", wkDataFeedAirticketPriceD2.getApDro());
            myParameterSourceAry[i].addValue("apDrp", wkDataFeedAirticketPriceD2.getApDrp());
            myParameterSourceAry[i].addValue("apDrq", wkDataFeedAirticketPriceD2.getApDrq());
            myParameterSourceAry[i].addValue("apDrr", wkDataFeedAirticketPriceD2.getApDrr());
            myParameterSourceAry[i].addValue("apDrs", wkDataFeedAirticketPriceD2.getApDrs());
            myParameterSourceAry[i].addValue("apDrt", wkDataFeedAirticketPriceD2.getApDrt());
            myParameterSourceAry[i].addValue("apDru", wkDataFeedAirticketPriceD2.getApDru());
            myParameterSourceAry[i].addValue("apDrv", wkDataFeedAirticketPriceD2.getApDrv());
            myParameterSourceAry[i].addValue("apDrw", wkDataFeedAirticketPriceD2.getApDrw());
            myParameterSourceAry[i].addValue("apDrx", wkDataFeedAirticketPriceD2.getApDrx());
            myParameterSourceAry[i].addValue("apDry", wkDataFeedAirticketPriceD2.getApDry());
            myParameterSourceAry[i].addValue("apDrz", wkDataFeedAirticketPriceD2.getApDrz());
            myParameterSourceAry[i].addValue("apDsa", wkDataFeedAirticketPriceD2.getApDsa());
            myParameterSourceAry[i].addValue("apDsb", wkDataFeedAirticketPriceD2.getApDsb());
            myParameterSourceAry[i].addValue("apDsc", wkDataFeedAirticketPriceD2.getApDsc());
            myParameterSourceAry[i].addValue("apDsd", wkDataFeedAirticketPriceD2.getApDsd());
            myParameterSourceAry[i].addValue("apDse", wkDataFeedAirticketPriceD2.getApDse());
            myParameterSourceAry[i].addValue("apDsf", wkDataFeedAirticketPriceD2.getApDsf());
            myParameterSourceAry[i].addValue("apDsg", wkDataFeedAirticketPriceD2.getApDsg());
            myParameterSourceAry[i].addValue("apDsh", wkDataFeedAirticketPriceD2.getApDsh());
            myParameterSourceAry[i].addValue("apDsi", wkDataFeedAirticketPriceD2.getApDsi());
            myParameterSourceAry[i].addValue("apDsj", wkDataFeedAirticketPriceD2.getApDsj());
            myParameterSourceAry[i].addValue("apDsk", wkDataFeedAirticketPriceD2.getApDsk());
            myParameterSourceAry[i].addValue("apDsl", wkDataFeedAirticketPriceD2.getApDsl());
            myParameterSourceAry[i].addValue("apDsm", wkDataFeedAirticketPriceD2.getApDsm());
            myParameterSourceAry[i].addValue("apDsn", wkDataFeedAirticketPriceD2.getApDsn());
            myParameterSourceAry[i].addValue("apDso", wkDataFeedAirticketPriceD2.getApDso());
            myParameterSourceAry[i].addValue("apDsp", wkDataFeedAirticketPriceD2.getApDsp());
            myParameterSourceAry[i].addValue("apDsq", wkDataFeedAirticketPriceD2.getApDsq());
            myParameterSourceAry[i].addValue("apDsr", wkDataFeedAirticketPriceD2.getApDsr());
            myParameterSourceAry[i].addValue("apDss", wkDataFeedAirticketPriceD2.getApDss());
            myParameterSourceAry[i].addValue("apDst", wkDataFeedAirticketPriceD2.getApDst());
            myParameterSourceAry[i].addValue("apDsu", wkDataFeedAirticketPriceD2.getApDsu());
            myParameterSourceAry[i].addValue("apDsv", wkDataFeedAirticketPriceD2.getApDsv());
            myParameterSourceAry[i].addValue("apDsw", wkDataFeedAirticketPriceD2.getApDsw());
            myParameterSourceAry[i].addValue("apDsx", wkDataFeedAirticketPriceD2.getApDsx());
            myParameterSourceAry[i].addValue("apDsy", wkDataFeedAirticketPriceD2.getApDsy());
            myParameterSourceAry[i].addValue("apDsz", wkDataFeedAirticketPriceD2.getApDsz());
            myParameterSourceAry[i].addValue("apDta", wkDataFeedAirticketPriceD2.getApDta());
            myParameterSourceAry[i].addValue("apDtb", wkDataFeedAirticketPriceD2.getApDtb());
            myParameterSourceAry[i].addValue("apDtc", wkDataFeedAirticketPriceD2.getApDtc());
            myParameterSourceAry[i].addValue("apDtd", wkDataFeedAirticketPriceD2.getApDtd());
            myParameterSourceAry[i].addValue("apDte", wkDataFeedAirticketPriceD2.getApDte());
            myParameterSourceAry[i].addValue("apDtf", wkDataFeedAirticketPriceD2.getApDtf());
            myParameterSourceAry[i].addValue("apDtg", wkDataFeedAirticketPriceD2.getApDtg());
            myParameterSourceAry[i].addValue("apDth", wkDataFeedAirticketPriceD2.getApDth());
            myParameterSourceAry[i].addValue("apDti", wkDataFeedAirticketPriceD2.getApDti());
            myParameterSourceAry[i].addValue("apDtj", wkDataFeedAirticketPriceD2.getApDtj());
            myParameterSourceAry[i].addValue("apDtk", wkDataFeedAirticketPriceD2.getApDtk());
            myParameterSourceAry[i].addValue("apDtl", wkDataFeedAirticketPriceD2.getApDtl());
            myParameterSourceAry[i].addValue("apDtm", wkDataFeedAirticketPriceD2.getApDtm());
            myParameterSourceAry[i].addValue("apDtn", wkDataFeedAirticketPriceD2.getApDtn());
            myParameterSourceAry[i].addValue("apDto", wkDataFeedAirticketPriceD2.getApDto());
            myParameterSourceAry[i].addValue("apDtp", wkDataFeedAirticketPriceD2.getApDtp());
            myParameterSourceAry[i].addValue("apDtq", wkDataFeedAirticketPriceD2.getApDtq());
            myParameterSourceAry[i].addValue("apDtr", wkDataFeedAirticketPriceD2.getApDtr());
            myParameterSourceAry[i].addValue("apDts", wkDataFeedAirticketPriceD2.getApDts());
            myParameterSourceAry[i].addValue("apDtt", wkDataFeedAirticketPriceD2.getApDtt());
            myParameterSourceAry[i].addValue("apDtu", wkDataFeedAirticketPriceD2.getApDtu());
            myParameterSourceAry[i].addValue("apDtv", wkDataFeedAirticketPriceD2.getApDtv());
            myParameterSourceAry[i].addValue("apDtw", wkDataFeedAirticketPriceD2.getApDtw());
            myParameterSourceAry[i].addValue("apDtx", wkDataFeedAirticketPriceD2.getApDtx());
            myParameterSourceAry[i].addValue("apDty", wkDataFeedAirticketPriceD2.getApDty());
            myParameterSourceAry[i].addValue("apDtz", wkDataFeedAirticketPriceD2.getApDtz());
            myParameterSourceAry[i].addValue("apDua", wkDataFeedAirticketPriceD2.getApDua());
            myParameterSourceAry[i].addValue("apDub", wkDataFeedAirticketPriceD2.getApDub());
            myParameterSourceAry[i].addValue("apDuc", wkDataFeedAirticketPriceD2.getApDuc());
            myParameterSourceAry[i].addValue("apDud", wkDataFeedAirticketPriceD2.getApDud());
            myParameterSourceAry[i].addValue("apDue", wkDataFeedAirticketPriceD2.getApDue());
            myParameterSourceAry[i].addValue("apDuf", wkDataFeedAirticketPriceD2.getApDuf());
            myParameterSourceAry[i].addValue("apDug", wkDataFeedAirticketPriceD2.getApDug());
            myParameterSourceAry[i].addValue("apDuh", wkDataFeedAirticketPriceD2.getApDuh());
            myParameterSourceAry[i].addValue("apDui", wkDataFeedAirticketPriceD2.getApDui());
            myParameterSourceAry[i].addValue("apDuj", wkDataFeedAirticketPriceD2.getApDuj());
            myParameterSourceAry[i].addValue("apDuk", wkDataFeedAirticketPriceD2.getApDuk());
            myParameterSourceAry[i].addValue("apDul", wkDataFeedAirticketPriceD2.getApDul());
            myParameterSourceAry[i].addValue("apDum", wkDataFeedAirticketPriceD2.getApDum());
            myParameterSourceAry[i].addValue("apDun", wkDataFeedAirticketPriceD2.getApDun());
            myParameterSourceAry[i].addValue("apDuo", wkDataFeedAirticketPriceD2.getApDuo());
            myParameterSourceAry[i].addValue("apDup", wkDataFeedAirticketPriceD2.getApDup());
            myParameterSourceAry[i].addValue("apDuq", wkDataFeedAirticketPriceD2.getApDuq());
            myParameterSourceAry[i].addValue("apDur", wkDataFeedAirticketPriceD2.getApDur());
            myParameterSourceAry[i].addValue("apDus", wkDataFeedAirticketPriceD2.getApDus());
            myParameterSourceAry[i].addValue("apDut", wkDataFeedAirticketPriceD2.getApDut());
            myParameterSourceAry[i].addValue("apDuu", wkDataFeedAirticketPriceD2.getApDuu());
            myParameterSourceAry[i].addValue("apDuv", wkDataFeedAirticketPriceD2.getApDuv());
            myParameterSourceAry[i].addValue("apDuw", wkDataFeedAirticketPriceD2.getApDuw());
            myParameterSourceAry[i].addValue("apDux", wkDataFeedAirticketPriceD2.getApDux());
            myParameterSourceAry[i].addValue("apDuy", wkDataFeedAirticketPriceD2.getApDuy());
            myParameterSourceAry[i].addValue("apDuz", wkDataFeedAirticketPriceD2.getApDuz());
            myParameterSourceAry[i].addValue("apDva", wkDataFeedAirticketPriceD2.getApDva());
            myParameterSourceAry[i].addValue("apDvb", wkDataFeedAirticketPriceD2.getApDvb());
            myParameterSourceAry[i].addValue("apDvc", wkDataFeedAirticketPriceD2.getApDvc());
            myParameterSourceAry[i].addValue("apDvd", wkDataFeedAirticketPriceD2.getApDvd());
            myParameterSourceAry[i].addValue("apDve", wkDataFeedAirticketPriceD2.getApDve());
            myParameterSourceAry[i].addValue("apDvf", wkDataFeedAirticketPriceD2.getApDvf());
            myParameterSourceAry[i].addValue("apDvg", wkDataFeedAirticketPriceD2.getApDvg());
            myParameterSourceAry[i].addValue("apDvh", wkDataFeedAirticketPriceD2.getApDvh());
            myParameterSourceAry[i].addValue("apDvi", wkDataFeedAirticketPriceD2.getApDvi());
            myParameterSourceAry[i].addValue("apDvj", wkDataFeedAirticketPriceD2.getApDvj());
            myParameterSourceAry[i].addValue("apDvk", wkDataFeedAirticketPriceD2.getApDvk());
            myParameterSourceAry[i].addValue("apDvl", wkDataFeedAirticketPriceD2.getApDvl());
            myParameterSourceAry[i].addValue("apDvm", wkDataFeedAirticketPriceD2.getApDvm());
            myParameterSourceAry[i].addValue("apDvn", wkDataFeedAirticketPriceD2.getApDvn());
            myParameterSourceAry[i].addValue("apDvo", wkDataFeedAirticketPriceD2.getApDvo());
            myParameterSourceAry[i].addValue("apDvp", wkDataFeedAirticketPriceD2.getApDvp());
            myParameterSourceAry[i].addValue("apDvq", wkDataFeedAirticketPriceD2.getApDvq());
            myParameterSourceAry[i].addValue("apDvr", wkDataFeedAirticketPriceD2.getApDvr());
            myParameterSourceAry[i].addValue("apDvs", wkDataFeedAirticketPriceD2.getApDvs());
            myParameterSourceAry[i].addValue("apDvt", wkDataFeedAirticketPriceD2.getApDvt());
            myParameterSourceAry[i].addValue("apDvu", wkDataFeedAirticketPriceD2.getApDvu());
            myParameterSourceAry[i].addValue("apDvv", wkDataFeedAirticketPriceD2.getApDvv());
            myParameterSourceAry[i].addValue("apDvw", wkDataFeedAirticketPriceD2.getApDvw());
            myParameterSourceAry[i].addValue("apDvx", wkDataFeedAirticketPriceD2.getApDvx());
            myParameterSourceAry[i].addValue("apDvy", wkDataFeedAirticketPriceD2.getApDvy());
            myParameterSourceAry[i].addValue("apDvz", wkDataFeedAirticketPriceD2.getApDvz());
            myParameterSourceAry[i].addValue("apDwa", wkDataFeedAirticketPriceD2.getApDwa());
            myParameterSourceAry[i].addValue("apDwb", wkDataFeedAirticketPriceD2.getApDwb());
            myParameterSourceAry[i].addValue("apDwc", wkDataFeedAirticketPriceD2.getApDwc());
            myParameterSourceAry[i].addValue("apDwd", wkDataFeedAirticketPriceD2.getApDwd());
            myParameterSourceAry[i].addValue("apDwe", wkDataFeedAirticketPriceD2.getApDwe());
            myParameterSourceAry[i].addValue("apDwf", wkDataFeedAirticketPriceD2.getApDwf());
            myParameterSourceAry[i].addValue("apDwg", wkDataFeedAirticketPriceD2.getApDwg());
            myParameterSourceAry[i].addValue("apDwh", wkDataFeedAirticketPriceD2.getApDwh());
            myParameterSourceAry[i].addValue("apDwi", wkDataFeedAirticketPriceD2.getApDwi());
            myParameterSourceAry[i].addValue("apDwj", wkDataFeedAirticketPriceD2.getApDwj());
            myParameterSourceAry[i].addValue("apDwk", wkDataFeedAirticketPriceD2.getApDwk());
            myParameterSourceAry[i].addValue("apDwl", wkDataFeedAirticketPriceD2.getApDwl());
            myParameterSourceAry[i].addValue("apDwm", wkDataFeedAirticketPriceD2.getApDwm());
            myParameterSourceAry[i].addValue("apDwn", wkDataFeedAirticketPriceD2.getApDwn());
            myParameterSourceAry[i].addValue("apDwo", wkDataFeedAirticketPriceD2.getApDwo());
            myParameterSourceAry[i].addValue("apDwp", wkDataFeedAirticketPriceD2.getApDwp());
            myParameterSourceAry[i].addValue("apDwq", wkDataFeedAirticketPriceD2.getApDwq());
            myParameterSourceAry[i].addValue("apDwr", wkDataFeedAirticketPriceD2.getApDwr());
            myParameterSourceAry[i].addValue("apDws", wkDataFeedAirticketPriceD2.getApDws());
            myParameterSourceAry[i].addValue("apDwt", wkDataFeedAirticketPriceD2.getApDwt());
            myParameterSourceAry[i].addValue("apDwu", wkDataFeedAirticketPriceD2.getApDwu());
            myParameterSourceAry[i].addValue("apDwv", wkDataFeedAirticketPriceD2.getApDwv());
            myParameterSourceAry[i].addValue("apDww", wkDataFeedAirticketPriceD2.getApDww());
            myParameterSourceAry[i].addValue("apDwx", wkDataFeedAirticketPriceD2.getApDwx());
            myParameterSourceAry[i].addValue("apDwy", wkDataFeedAirticketPriceD2.getApDwy());
            myParameterSourceAry[i].addValue("apDwz", wkDataFeedAirticketPriceD2.getApDwz());
            myParameterSourceAry[i].addValue("apDxa", wkDataFeedAirticketPriceD2.getApDxa());
            myParameterSourceAry[i].addValue("apDxb", wkDataFeedAirticketPriceD2.getApDxb());
            myParameterSourceAry[i].addValue("apDxc", wkDataFeedAirticketPriceD2.getApDxc());
            myParameterSourceAry[i].addValue("apDxd", wkDataFeedAirticketPriceD2.getApDxd());
            myParameterSourceAry[i].addValue("apDxe", wkDataFeedAirticketPriceD2.getApDxe());
            myParameterSourceAry[i].addValue("apDxf", wkDataFeedAirticketPriceD2.getApDxf());
            myParameterSourceAry[i].addValue("apDxg", wkDataFeedAirticketPriceD2.getApDxg());
            myParameterSourceAry[i].addValue("apDxh", wkDataFeedAirticketPriceD2.getApDxh());
            myParameterSourceAry[i].addValue("apDxi", wkDataFeedAirticketPriceD2.getApDxi());
            myParameterSourceAry[i].addValue("apDxj", wkDataFeedAirticketPriceD2.getApDxj());
            myParameterSourceAry[i].addValue("apDxk", wkDataFeedAirticketPriceD2.getApDxk());
            myParameterSourceAry[i].addValue("apDxl", wkDataFeedAirticketPriceD2.getApDxl());
            myParameterSourceAry[i].addValue("apDxm", wkDataFeedAirticketPriceD2.getApDxm());
            myParameterSourceAry[i].addValue("apDxn", wkDataFeedAirticketPriceD2.getApDxn());
            myParameterSourceAry[i].addValue("apDxo", wkDataFeedAirticketPriceD2.getApDxo());
            myParameterSourceAry[i].addValue("apDxp", wkDataFeedAirticketPriceD2.getApDxp());
            myParameterSourceAry[i].addValue("apDxq", wkDataFeedAirticketPriceD2.getApDxq());
            myParameterSourceAry[i].addValue("apDxr", wkDataFeedAirticketPriceD2.getApDxr());
            myParameterSourceAry[i].addValue("apDxs", wkDataFeedAirticketPriceD2.getApDxs());
            myParameterSourceAry[i].addValue("apDxt", wkDataFeedAirticketPriceD2.getApDxt());
            myParameterSourceAry[i].addValue("apDxu", wkDataFeedAirticketPriceD2.getApDxu());
            myParameterSourceAry[i].addValue("apDxv", wkDataFeedAirticketPriceD2.getApDxv());
            myParameterSourceAry[i].addValue("apDxw", wkDataFeedAirticketPriceD2.getApDxw());
            myParameterSourceAry[i].addValue("apDxx", wkDataFeedAirticketPriceD2.getApDxx());
            myParameterSourceAry[i].addValue("apDxy", wkDataFeedAirticketPriceD2.getApDxy());
            myParameterSourceAry[i].addValue("apDxz", wkDataFeedAirticketPriceD2.getApDxz());
            myParameterSourceAry[i].addValue("apDya", wkDataFeedAirticketPriceD2.getApDya());
            myParameterSourceAry[i].addValue("apDyb", wkDataFeedAirticketPriceD2.getApDyb());
            myParameterSourceAry[i].addValue("apDyc", wkDataFeedAirticketPriceD2.getApDyc());
            myParameterSourceAry[i].addValue("apDyd", wkDataFeedAirticketPriceD2.getApDyd());
            myParameterSourceAry[i].addValue("apDye", wkDataFeedAirticketPriceD2.getApDye());
            myParameterSourceAry[i].addValue("apDyf", wkDataFeedAirticketPriceD2.getApDyf());
            myParameterSourceAry[i].addValue("apDyg", wkDataFeedAirticketPriceD2.getApDyg());
            myParameterSourceAry[i].addValue("apDyh", wkDataFeedAirticketPriceD2.getApDyh());
            myParameterSourceAry[i].addValue("apDyi", wkDataFeedAirticketPriceD2.getApDyi());
            myParameterSourceAry[i].addValue("apDyj", wkDataFeedAirticketPriceD2.getApDyj());
            myParameterSourceAry[i].addValue("apDyk", wkDataFeedAirticketPriceD2.getApDyk());
            myParameterSourceAry[i].addValue("apDyl", wkDataFeedAirticketPriceD2.getApDyl());
            myParameterSourceAry[i].addValue("apDym", wkDataFeedAirticketPriceD2.getApDym());
            myParameterSourceAry[i].addValue("apDyn", wkDataFeedAirticketPriceD2.getApDyn());
            myParameterSourceAry[i].addValue("apDyo", wkDataFeedAirticketPriceD2.getApDyo());
            myParameterSourceAry[i].addValue("apDyp", wkDataFeedAirticketPriceD2.getApDyp());
            myParameterSourceAry[i].addValue("apDyq", wkDataFeedAirticketPriceD2.getApDyq());
            myParameterSourceAry[i].addValue("apDyr", wkDataFeedAirticketPriceD2.getApDyr());
            myParameterSourceAry[i].addValue("apDys", wkDataFeedAirticketPriceD2.getApDys());
            myParameterSourceAry[i].addValue("apDyt", wkDataFeedAirticketPriceD2.getApDyt());
            myParameterSourceAry[i].addValue("apDyu", wkDataFeedAirticketPriceD2.getApDyu());
            myParameterSourceAry[i].addValue("apDyv", wkDataFeedAirticketPriceD2.getApDyv());
            myParameterSourceAry[i].addValue("apDyw", wkDataFeedAirticketPriceD2.getApDyw());
            myParameterSourceAry[i].addValue("apDyx", wkDataFeedAirticketPriceD2.getApDyx());
            myParameterSourceAry[i].addValue("apDyy", wkDataFeedAirticketPriceD2.getApDyy());
            myParameterSourceAry[i].addValue("apDyz", wkDataFeedAirticketPriceD2.getApDyz());
            myParameterSourceAry[i].addValue("apDza", wkDataFeedAirticketPriceD2.getApDza());
            myParameterSourceAry[i].addValue("apDzb", wkDataFeedAirticketPriceD2.getApDzb());
            myParameterSourceAry[i].addValue("apDzc", wkDataFeedAirticketPriceD2.getApDzc());
            myParameterSourceAry[i].addValue("apDzd", wkDataFeedAirticketPriceD2.getApDzd());
            myParameterSourceAry[i].addValue("apDze", wkDataFeedAirticketPriceD2.getApDze());
            myParameterSourceAry[i].addValue("apDzf", wkDataFeedAirticketPriceD2.getApDzf());
            myParameterSourceAry[i].addValue("apDzg", wkDataFeedAirticketPriceD2.getApDzg());
            myParameterSourceAry[i].addValue("apDzh", wkDataFeedAirticketPriceD2.getApDzh());
            myParameterSourceAry[i].addValue("apDzi", wkDataFeedAirticketPriceD2.getApDzi());
            myParameterSourceAry[i].addValue("apDzj", wkDataFeedAirticketPriceD2.getApDzj());
            myParameterSourceAry[i].addValue("apDzk", wkDataFeedAirticketPriceD2.getApDzk());
            myParameterSourceAry[i].addValue("apDzl", wkDataFeedAirticketPriceD2.getApDzl());
            myParameterSourceAry[i].addValue("apDzm", wkDataFeedAirticketPriceD2.getApDzm());
            myParameterSourceAry[i].addValue("apDzn", wkDataFeedAirticketPriceD2.getApDzn());
            myParameterSourceAry[i].addValue("apDzo", wkDataFeedAirticketPriceD2.getApDzo());
            myParameterSourceAry[i].addValue("apDzp", wkDataFeedAirticketPriceD2.getApDzp());
            myParameterSourceAry[i].addValue("apDzq", wkDataFeedAirticketPriceD2.getApDzq());
            myParameterSourceAry[i].addValue("apDzr", wkDataFeedAirticketPriceD2.getApDzr());
            myParameterSourceAry[i].addValue("apDzs", wkDataFeedAirticketPriceD2.getApDzs());
            myParameterSourceAry[i].addValue("apDzt", wkDataFeedAirticketPriceD2.getApDzt());
            myParameterSourceAry[i].addValue("apDzu", wkDataFeedAirticketPriceD2.getApDzu());
            myParameterSourceAry[i].addValue("apDzv", wkDataFeedAirticketPriceD2.getApDzv());
            myParameterSourceAry[i].addValue("apDzw", wkDataFeedAirticketPriceD2.getApDzw());
            myParameterSourceAry[i].addValue("apDzx", wkDataFeedAirticketPriceD2.getApDzx());
            myParameterSourceAry[i].addValue("apDzy", wkDataFeedAirticketPriceD2.getApDzy());
            myParameterSourceAry[i].addValue("apDzz", wkDataFeedAirticketPriceD2.getApDzz());
        }

        namedParameterJdbcTemplate.batchUpdate(mySql, myParameterSourceAry);
    }
}
