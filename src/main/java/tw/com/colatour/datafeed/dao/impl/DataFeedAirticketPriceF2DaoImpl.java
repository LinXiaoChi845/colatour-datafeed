package tw.com.colatour.datafeed.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Component;
import tw.com.colatour.datafeed.dao.DataFeedAirticketPriceF2Dao;
import tw.com.colatour.datafeed.model.DataFeedAirticketPriceF2;

import java.util.List;

@Component
public class DataFeedAirticketPriceF2DaoImpl implements DataFeedAirticketPriceF2Dao {

    @Autowired
    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    @Override
    public void createDataFeedAirticketPriceF2s(List<DataFeedAirticketPriceF2> dataFeedAirticketPriceF2List) {
        String mySql = "INSERT INTO data_feed.data_feed_airticket_price_F2 ( " +
                " file_no, price_no, " +
                " ap_fna, ap_fnb, ap_fnc, ap_fnd, ap_fne, ap_fnf, ap_fng, ap_fnh, ap_fni, ap_fnj, ap_fnk, ap_fnl, ap_fnm, " +
                " ap_fnn, ap_fno, ap_fnp, ap_fnq, ap_fnr, ap_fns, ap_fnt, ap_fnu, ap_fnv, ap_fnw, ap_fnx, ap_fny, ap_fnz, " +
                " ap_foa, ap_fob, ap_foc, ap_fod, ap_foe, ap_fof, ap_fog, ap_foh, ap_foi, ap_foj, ap_fok, ap_fol, ap_fom, " +
                " ap_fon, ap_foo, ap_fop, ap_foq, ap_for, ap_fos, ap_fot, ap_fou, ap_fov, ap_fow, ap_fox, ap_foy, ap_foz, " +
                " ap_fpa, ap_fpb, ap_fpc, ap_fpd, ap_fpe, ap_fpf, ap_fpg, ap_fph, ap_fpi, ap_fpj, ap_fpk, ap_fpl, ap_fpm, " +
                " ap_fpn, ap_fpo, ap_fpp, ap_fpq, ap_fpr, ap_fps, ap_fpt, ap_fpu, ap_fpv, ap_fpw, ap_fpx, ap_fpy, ap_fpz, " +
                " ap_fqa, ap_fqb, ap_fqc, ap_fqd, ap_fqe, ap_fqf, ap_fqg, ap_fqh, ap_fqi, ap_fqj, ap_fqk, ap_fql, ap_fqm, " +
                " ap_fqn, ap_fqo, ap_fqp, ap_fqq, ap_fqr, ap_fqs, ap_fqt, ap_fqu, ap_fqv, ap_fqw, ap_fqx, ap_fqy, ap_fqz, " +
                " ap_fra, ap_frb, ap_frc, ap_frd, ap_fre, ap_frf, ap_frg, ap_frh, ap_fri, ap_frj, ap_frk, ap_frl, ap_frm, " +
                " ap_frn, ap_fro, ap_frp, ap_frq, ap_frr, ap_frs, ap_frt, ap_fru, ap_frv, ap_frw, ap_frx, ap_fry, ap_frz, " +
                " ap_fsa, ap_fsb, ap_fsc, ap_fsd, ap_fse, ap_fsf, ap_fsg, ap_fsh, ap_fsi, ap_fsj, ap_fsk, ap_fsl, ap_fsm, " +
                " ap_fsn, ap_fso, ap_fsp, ap_fsq, ap_fsr, ap_fss, ap_fst, ap_fsu, ap_fsv, ap_fsw, ap_fsx, ap_fsy, ap_fsz, " +
                " ap_fta, ap_ftb, ap_ftc, ap_ftd, ap_fte, ap_ftf, ap_ftg, ap_fth, ap_fti, ap_ftj, ap_ftk, ap_ftl, ap_ftm, " +
                " ap_ftn, ap_fto, ap_ftp, ap_ftq, ap_ftr, ap_fts, ap_ftt, ap_ftu, ap_ftv, ap_ftw, ap_ftx, ap_fty, ap_ftz, " +
                " ap_fua, ap_fub, ap_fuc, ap_fud, ap_fue, ap_fuf, ap_fug, ap_fuh, ap_fui, ap_fuj, ap_fuk, ap_ful, ap_fum, " +
                " ap_fun, ap_fuo, ap_fup, ap_fuq, ap_fur, ap_fus, ap_fut, ap_fuu, ap_fuv, ap_fuw, ap_fux, ap_fuy, ap_fuz, " +
                " ap_fva, ap_fvb, ap_fvc, ap_fvd, ap_fve, ap_fvf, ap_fvg, ap_fvh, ap_fvi, ap_fvj, ap_fvk, ap_fvl, ap_fvm, " +
                " ap_fvn, ap_fvo, ap_fvp, ap_fvq, ap_fvr, ap_fvs, ap_fvt, ap_fvu, ap_fvv, ap_fvw, ap_fvx, ap_fvy, ap_fvz, " +
                " ap_fwa, ap_fwb, ap_fwc, ap_fwd, ap_fwe, ap_fwf, ap_fwg, ap_fwh, ap_fwi, ap_fwj, ap_fwk, ap_fwl, ap_fwm, " +
                " ap_fwn, ap_fwo, ap_fwp, ap_fwq, ap_fwr, ap_fws, ap_fwt, ap_fwu, ap_fwv, ap_fww, ap_fwx, ap_fwy, ap_fwz, " +
                " ap_fxa, ap_fxb, ap_fxc, ap_fxd, ap_fxe, ap_fxf, ap_fxg, ap_fxh, ap_fxi, ap_fxj, ap_fxk, ap_fxl, ap_fxm, " +
                " ap_fxn, ap_fxo, ap_fxp ) " +
                " VALUES ( " +
                " :fileNo, :priceNo, " +
                " :apFna, :apFnb, :apFnc, :apFnd, :apFne, :apFnf, :apFng, :apFnh, :apFni, :apFnj, :apFnk, :apFnl, :apFnm, " +
                " :apFnn, :apFno, :apFnp, :apFnq, :apFnr, :apFns, :apFnt, :apFnu, :apFnv, :apFnw, :apFnx, :apFny, :apFnz, " +
                " :apFoa, :apFob, :apFoc, :apFod, :apFoe, :apFof, :apFog, :apFoh, :apFoi, :apFoj, :apFok, :apFol, :apFom, " +
                " :apFon, :apFoo, :apFop, :apFoq, :apFor, :apFos, :apFot, :apFou, :apFov, :apFow, :apFox, :apFoy, :apFoz, " +
                " :apFpa, :apFpb, :apFpc, :apFpd, :apFpe, :apFpf, :apFpg, :apFph, :apFpi, :apFpj, :apFpk, :apFpl, :apFpm, " +
                " :apFpn, :apFpo, :apFpp, :apFpq, :apFpr, :apFps, :apFpt, :apFpu, :apFpv, :apFpw, :apFpx, :apFpy, :apFpz, " +
                " :apFqa, :apFqb, :apFqc, :apFqd, :apFqe, :apFqf, :apFqg, :apFqh, :apFqi, :apFqj, :apFqk, :apFql, :apFqm, " +
                " :apFqn, :apFqo, :apFqp, :apFqq, :apFqr, :apFqs, :apFqt, :apFqu, :apFqv, :apFqw, :apFqx, :apFqy, :apFqz, " +
                " :apFra, :apFrb, :apFrc, :apFrd, :apFre, :apFrf, :apFrg, :apFrh, :apFri, :apFrj, :apFrk, :apFrl, :apFrm, " +
                " :apFrn, :apFro, :apFrp, :apFrq, :apFrr, :apFrs, :apFrt, :apFru, :apFrv, :apFrw, :apFrx, :apFry, :apFrz, " +
                " :apFsa, :apFsb, :apFsc, :apFsd, :apFse, :apFsf, :apFsg, :apFsh, :apFsi, :apFsj, :apFsk, :apFsl, :apFsm, " +
                " :apFsn, :apFso, :apFsp, :apFsq, :apFsr, :apFss, :apFst, :apFsu, :apFsv, :apFsw, :apFsx, :apFsy, :apFsz, " +
                " :apFta, :apFtb, :apFtc, :apFtd, :apFte, :apFtf, :apFtg, :apFth, :apFti, :apFtj, :apFtk, :apFtl, :apFtm, " +
                " :apFtn, :apFto, :apFtp, :apFtq, :apFtr, :apFts, :apFtt, :apFtu, :apFtv, :apFtw, :apFtx, :apFty, :apFtz, " +
                " :apFua, :apFub, :apFuc, :apFud, :apFue, :apFuf, :apFug, :apFuh, :apFui, :apFuj, :apFuk, :apFul, :apFum, " +
                " :apFun, :apFuo, :apFup, :apFuq, :apFur, :apFus, :apFut, :apFuu, :apFuv, :apFuw, :apFux, :apFuy, :apFuz, " +
                " :apFva, :apFvb, :apFvc, :apFvd, :apFve, :apFvf, :apFvg, :apFvh, :apFvi, :apFvj, :apFvk, :apFvl, :apFvm, " +
                " :apFvn, :apFvo, :apFvp, :apFvq, :apFvr, :apFvs, :apFvt, :apFvu, :apFvv, :apFvw, :apFvx, :apFvy, :apFvz, " +
                " :apFwa, :apFwb, :apFwc, :apFwd, :apFwe, :apFwf, :apFwg, :apFwh, :apFwi, :apFwj, :apFwk, :apFwl, :apFwm, " +
                " :apFwn, :apFwo, :apFwp, :apFwq, :apFwr, :apFws, :apFwt, :apFwu, :apFwv, :apFww, :apFwx, :apFwy, :apFwz, " +
                " :apFxa, :apFxb, :apFxc, :apFxd, :apFxe, :apFxf, :apFxg, :apFxh, :apFxi, :apFxj, :apFxk, :apFxl, :apFxm, " +
                " :apFxn, :apFxo, :apFxp ) ";

        MapSqlParameterSource[] myParameterSourceAry = new MapSqlParameterSource[dataFeedAirticketPriceF2List.size()];

        for (int i = 0; i < dataFeedAirticketPriceF2List.size(); i++) {
            DataFeedAirticketPriceF2 wkDataFeedAirticketPriceF2 = dataFeedAirticketPriceF2List.get(i);

            myParameterSourceAry[i] = new MapSqlParameterSource();

            myParameterSourceAry[i].addValue("fileNo", wkDataFeedAirticketPriceF2.getFileNo());
            myParameterSourceAry[i].addValue("priceNo", wkDataFeedAirticketPriceF2.getPriceNo());
            myParameterSourceAry[i].addValue("apFna", wkDataFeedAirticketPriceF2.getApFna());
            myParameterSourceAry[i].addValue("apFnb", wkDataFeedAirticketPriceF2.getApFnb());
            myParameterSourceAry[i].addValue("apFnc", wkDataFeedAirticketPriceF2.getApFnc());
            myParameterSourceAry[i].addValue("apFnd", wkDataFeedAirticketPriceF2.getApFnd());
            myParameterSourceAry[i].addValue("apFne", wkDataFeedAirticketPriceF2.getApFne());
            myParameterSourceAry[i].addValue("apFnf", wkDataFeedAirticketPriceF2.getApFnf());
            myParameterSourceAry[i].addValue("apFng", wkDataFeedAirticketPriceF2.getApFng());
            myParameterSourceAry[i].addValue("apFnh", wkDataFeedAirticketPriceF2.getApFnh());
            myParameterSourceAry[i].addValue("apFni", wkDataFeedAirticketPriceF2.getApFni());
            myParameterSourceAry[i].addValue("apFnj", wkDataFeedAirticketPriceF2.getApFnj());
            myParameterSourceAry[i].addValue("apFnk", wkDataFeedAirticketPriceF2.getApFnk());
            myParameterSourceAry[i].addValue("apFnl", wkDataFeedAirticketPriceF2.getApFnl());
            myParameterSourceAry[i].addValue("apFnm", wkDataFeedAirticketPriceF2.getApFnm());
            myParameterSourceAry[i].addValue("apFnn", wkDataFeedAirticketPriceF2.getApFnn());
            myParameterSourceAry[i].addValue("apFno", wkDataFeedAirticketPriceF2.getApFno());
            myParameterSourceAry[i].addValue("apFnp", wkDataFeedAirticketPriceF2.getApFnp());
            myParameterSourceAry[i].addValue("apFnq", wkDataFeedAirticketPriceF2.getApFnq());
            myParameterSourceAry[i].addValue("apFnr", wkDataFeedAirticketPriceF2.getApFnr());
            myParameterSourceAry[i].addValue("apFns", wkDataFeedAirticketPriceF2.getApFns());
            myParameterSourceAry[i].addValue("apFnt", wkDataFeedAirticketPriceF2.getApFnt());
            myParameterSourceAry[i].addValue("apFnu", wkDataFeedAirticketPriceF2.getApFnu());
            myParameterSourceAry[i].addValue("apFnv", wkDataFeedAirticketPriceF2.getApFnv());
            myParameterSourceAry[i].addValue("apFnw", wkDataFeedAirticketPriceF2.getApFnw());
            myParameterSourceAry[i].addValue("apFnx", wkDataFeedAirticketPriceF2.getApFnx());
            myParameterSourceAry[i].addValue("apFny", wkDataFeedAirticketPriceF2.getApFny());
            myParameterSourceAry[i].addValue("apFnz", wkDataFeedAirticketPriceF2.getApFnz());
            myParameterSourceAry[i].addValue("apFoa", wkDataFeedAirticketPriceF2.getApFoa());
            myParameterSourceAry[i].addValue("apFob", wkDataFeedAirticketPriceF2.getApFob());
            myParameterSourceAry[i].addValue("apFoc", wkDataFeedAirticketPriceF2.getApFoc());
            myParameterSourceAry[i].addValue("apFod", wkDataFeedAirticketPriceF2.getApFod());
            myParameterSourceAry[i].addValue("apFoe", wkDataFeedAirticketPriceF2.getApFoe());
            myParameterSourceAry[i].addValue("apFof", wkDataFeedAirticketPriceF2.getApFof());
            myParameterSourceAry[i].addValue("apFog", wkDataFeedAirticketPriceF2.getApFog());
            myParameterSourceAry[i].addValue("apFoh", wkDataFeedAirticketPriceF2.getApFoh());
            myParameterSourceAry[i].addValue("apFoi", wkDataFeedAirticketPriceF2.getApFoi());
            myParameterSourceAry[i].addValue("apFoj", wkDataFeedAirticketPriceF2.getApFoj());
            myParameterSourceAry[i].addValue("apFok", wkDataFeedAirticketPriceF2.getApFok());
            myParameterSourceAry[i].addValue("apFol", wkDataFeedAirticketPriceF2.getApFol());
            myParameterSourceAry[i].addValue("apFom", wkDataFeedAirticketPriceF2.getApFom());
            myParameterSourceAry[i].addValue("apFon", wkDataFeedAirticketPriceF2.getApFon());
            myParameterSourceAry[i].addValue("apFoo", wkDataFeedAirticketPriceF2.getApFoo());
            myParameterSourceAry[i].addValue("apFop", wkDataFeedAirticketPriceF2.getApFop());
            myParameterSourceAry[i].addValue("apFoq", wkDataFeedAirticketPriceF2.getApFoq());
            myParameterSourceAry[i].addValue("apFor", wkDataFeedAirticketPriceF2.getApFor());
            myParameterSourceAry[i].addValue("apFos", wkDataFeedAirticketPriceF2.getApFos());
            myParameterSourceAry[i].addValue("apFot", wkDataFeedAirticketPriceF2.getApFot());
            myParameterSourceAry[i].addValue("apFou", wkDataFeedAirticketPriceF2.getApFou());
            myParameterSourceAry[i].addValue("apFov", wkDataFeedAirticketPriceF2.getApFov());
            myParameterSourceAry[i].addValue("apFow", wkDataFeedAirticketPriceF2.getApFow());
            myParameterSourceAry[i].addValue("apFox", wkDataFeedAirticketPriceF2.getApFox());
            myParameterSourceAry[i].addValue("apFoy", wkDataFeedAirticketPriceF2.getApFoy());
            myParameterSourceAry[i].addValue("apFoz", wkDataFeedAirticketPriceF2.getApFoz());
            myParameterSourceAry[i].addValue("apFpa", wkDataFeedAirticketPriceF2.getApFpa());
            myParameterSourceAry[i].addValue("apFpb", wkDataFeedAirticketPriceF2.getApFpb());
            myParameterSourceAry[i].addValue("apFpc", wkDataFeedAirticketPriceF2.getApFpc());
            myParameterSourceAry[i].addValue("apFpd", wkDataFeedAirticketPriceF2.getApFpd());
            myParameterSourceAry[i].addValue("apFpe", wkDataFeedAirticketPriceF2.getApFpe());
            myParameterSourceAry[i].addValue("apFpf", wkDataFeedAirticketPriceF2.getApFpf());
            myParameterSourceAry[i].addValue("apFpg", wkDataFeedAirticketPriceF2.getApFpg());
            myParameterSourceAry[i].addValue("apFph", wkDataFeedAirticketPriceF2.getApFph());
            myParameterSourceAry[i].addValue("apFpi", wkDataFeedAirticketPriceF2.getApFpi());
            myParameterSourceAry[i].addValue("apFpj", wkDataFeedAirticketPriceF2.getApFpj());
            myParameterSourceAry[i].addValue("apFpk", wkDataFeedAirticketPriceF2.getApFpk());
            myParameterSourceAry[i].addValue("apFpl", wkDataFeedAirticketPriceF2.getApFpl());
            myParameterSourceAry[i].addValue("apFpm", wkDataFeedAirticketPriceF2.getApFpm());
            myParameterSourceAry[i].addValue("apFpn", wkDataFeedAirticketPriceF2.getApFpn());
            myParameterSourceAry[i].addValue("apFpo", wkDataFeedAirticketPriceF2.getApFpo());
            myParameterSourceAry[i].addValue("apFpp", wkDataFeedAirticketPriceF2.getApFpp());
            myParameterSourceAry[i].addValue("apFpq", wkDataFeedAirticketPriceF2.getApFpq());
            myParameterSourceAry[i].addValue("apFpr", wkDataFeedAirticketPriceF2.getApFpr());
            myParameterSourceAry[i].addValue("apFps", wkDataFeedAirticketPriceF2.getApFps());
            myParameterSourceAry[i].addValue("apFpt", wkDataFeedAirticketPriceF2.getApFpt());
            myParameterSourceAry[i].addValue("apFpu", wkDataFeedAirticketPriceF2.getApFpu());
            myParameterSourceAry[i].addValue("apFpv", wkDataFeedAirticketPriceF2.getApFpv());
            myParameterSourceAry[i].addValue("apFpw", wkDataFeedAirticketPriceF2.getApFpw());
            myParameterSourceAry[i].addValue("apFpx", wkDataFeedAirticketPriceF2.getApFpx());
            myParameterSourceAry[i].addValue("apFpy", wkDataFeedAirticketPriceF2.getApFpy());
            myParameterSourceAry[i].addValue("apFpz", wkDataFeedAirticketPriceF2.getApFpz());
            myParameterSourceAry[i].addValue("apFqa", wkDataFeedAirticketPriceF2.getApFqa());
            myParameterSourceAry[i].addValue("apFqb", wkDataFeedAirticketPriceF2.getApFqb());
            myParameterSourceAry[i].addValue("apFqc", wkDataFeedAirticketPriceF2.getApFqc());
            myParameterSourceAry[i].addValue("apFqd", wkDataFeedAirticketPriceF2.getApFqd());
            myParameterSourceAry[i].addValue("apFqe", wkDataFeedAirticketPriceF2.getApFqe());
            myParameterSourceAry[i].addValue("apFqf", wkDataFeedAirticketPriceF2.getApFqf());
            myParameterSourceAry[i].addValue("apFqg", wkDataFeedAirticketPriceF2.getApFqg());
            myParameterSourceAry[i].addValue("apFqh", wkDataFeedAirticketPriceF2.getApFqh());
            myParameterSourceAry[i].addValue("apFqi", wkDataFeedAirticketPriceF2.getApFqi());
            myParameterSourceAry[i].addValue("apFqj", wkDataFeedAirticketPriceF2.getApFqj());
            myParameterSourceAry[i].addValue("apFqk", wkDataFeedAirticketPriceF2.getApFqk());
            myParameterSourceAry[i].addValue("apFql", wkDataFeedAirticketPriceF2.getApFql());
            myParameterSourceAry[i].addValue("apFqm", wkDataFeedAirticketPriceF2.getApFqm());
            myParameterSourceAry[i].addValue("apFqn", wkDataFeedAirticketPriceF2.getApFqn());
            myParameterSourceAry[i].addValue("apFqo", wkDataFeedAirticketPriceF2.getApFqo());
            myParameterSourceAry[i].addValue("apFqp", wkDataFeedAirticketPriceF2.getApFqp());
            myParameterSourceAry[i].addValue("apFqq", wkDataFeedAirticketPriceF2.getApFqq());
            myParameterSourceAry[i].addValue("apFqr", wkDataFeedAirticketPriceF2.getApFqr());
            myParameterSourceAry[i].addValue("apFqs", wkDataFeedAirticketPriceF2.getApFqs());
            myParameterSourceAry[i].addValue("apFqt", wkDataFeedAirticketPriceF2.getApFqt());
            myParameterSourceAry[i].addValue("apFqu", wkDataFeedAirticketPriceF2.getApFqu());
            myParameterSourceAry[i].addValue("apFqv", wkDataFeedAirticketPriceF2.getApFqv());
            myParameterSourceAry[i].addValue("apFqw", wkDataFeedAirticketPriceF2.getApFqw());
            myParameterSourceAry[i].addValue("apFqx", wkDataFeedAirticketPriceF2.getApFqx());
            myParameterSourceAry[i].addValue("apFqy", wkDataFeedAirticketPriceF2.getApFqy());
            myParameterSourceAry[i].addValue("apFqz", wkDataFeedAirticketPriceF2.getApFqz());
            myParameterSourceAry[i].addValue("apFra", wkDataFeedAirticketPriceF2.getApFra());
            myParameterSourceAry[i].addValue("apFrb", wkDataFeedAirticketPriceF2.getApFrb());
            myParameterSourceAry[i].addValue("apFrc", wkDataFeedAirticketPriceF2.getApFrc());
            myParameterSourceAry[i].addValue("apFrd", wkDataFeedAirticketPriceF2.getApFrd());
            myParameterSourceAry[i].addValue("apFre", wkDataFeedAirticketPriceF2.getApFre());
            myParameterSourceAry[i].addValue("apFrf", wkDataFeedAirticketPriceF2.getApFrf());
            myParameterSourceAry[i].addValue("apFrg", wkDataFeedAirticketPriceF2.getApFrg());
            myParameterSourceAry[i].addValue("apFrh", wkDataFeedAirticketPriceF2.getApFrh());
            myParameterSourceAry[i].addValue("apFri", wkDataFeedAirticketPriceF2.getApFri());
            myParameterSourceAry[i].addValue("apFrj", wkDataFeedAirticketPriceF2.getApFrj());
            myParameterSourceAry[i].addValue("apFrk", wkDataFeedAirticketPriceF2.getApFrk());
            myParameterSourceAry[i].addValue("apFrl", wkDataFeedAirticketPriceF2.getApFrl());
            myParameterSourceAry[i].addValue("apFrm", wkDataFeedAirticketPriceF2.getApFrm());
            myParameterSourceAry[i].addValue("apFrn", wkDataFeedAirticketPriceF2.getApFrn());
            myParameterSourceAry[i].addValue("apFro", wkDataFeedAirticketPriceF2.getApFro());
            myParameterSourceAry[i].addValue("apFrp", wkDataFeedAirticketPriceF2.getApFrp());
            myParameterSourceAry[i].addValue("apFrq", wkDataFeedAirticketPriceF2.getApFrq());
            myParameterSourceAry[i].addValue("apFrr", wkDataFeedAirticketPriceF2.getApFrr());
            myParameterSourceAry[i].addValue("apFrs", wkDataFeedAirticketPriceF2.getApFrs());
            myParameterSourceAry[i].addValue("apFrt", wkDataFeedAirticketPriceF2.getApFrt());
            myParameterSourceAry[i].addValue("apFru", wkDataFeedAirticketPriceF2.getApFru());
            myParameterSourceAry[i].addValue("apFrv", wkDataFeedAirticketPriceF2.getApFrv());
            myParameterSourceAry[i].addValue("apFrw", wkDataFeedAirticketPriceF2.getApFrw());
            myParameterSourceAry[i].addValue("apFrx", wkDataFeedAirticketPriceF2.getApFrx());
            myParameterSourceAry[i].addValue("apFry", wkDataFeedAirticketPriceF2.getApFry());
            myParameterSourceAry[i].addValue("apFrz", wkDataFeedAirticketPriceF2.getApFrz());
            myParameterSourceAry[i].addValue("apFsa", wkDataFeedAirticketPriceF2.getApFsa());
            myParameterSourceAry[i].addValue("apFsb", wkDataFeedAirticketPriceF2.getApFsb());
            myParameterSourceAry[i].addValue("apFsc", wkDataFeedAirticketPriceF2.getApFsc());
            myParameterSourceAry[i].addValue("apFsd", wkDataFeedAirticketPriceF2.getApFsd());
            myParameterSourceAry[i].addValue("apFse", wkDataFeedAirticketPriceF2.getApFse());
            myParameterSourceAry[i].addValue("apFsf", wkDataFeedAirticketPriceF2.getApFsf());
            myParameterSourceAry[i].addValue("apFsg", wkDataFeedAirticketPriceF2.getApFsg());
            myParameterSourceAry[i].addValue("apFsh", wkDataFeedAirticketPriceF2.getApFsh());
            myParameterSourceAry[i].addValue("apFsi", wkDataFeedAirticketPriceF2.getApFsi());
            myParameterSourceAry[i].addValue("apFsj", wkDataFeedAirticketPriceF2.getApFsj());
            myParameterSourceAry[i].addValue("apFsk", wkDataFeedAirticketPriceF2.getApFsk());
            myParameterSourceAry[i].addValue("apFsl", wkDataFeedAirticketPriceF2.getApFsl());
            myParameterSourceAry[i].addValue("apFsm", wkDataFeedAirticketPriceF2.getApFsm());
            myParameterSourceAry[i].addValue("apFsn", wkDataFeedAirticketPriceF2.getApFsn());
            myParameterSourceAry[i].addValue("apFso", wkDataFeedAirticketPriceF2.getApFso());
            myParameterSourceAry[i].addValue("apFsp", wkDataFeedAirticketPriceF2.getApFsp());
            myParameterSourceAry[i].addValue("apFsq", wkDataFeedAirticketPriceF2.getApFsq());
            myParameterSourceAry[i].addValue("apFsr", wkDataFeedAirticketPriceF2.getApFsr());
            myParameterSourceAry[i].addValue("apFss", wkDataFeedAirticketPriceF2.getApFss());
            myParameterSourceAry[i].addValue("apFst", wkDataFeedAirticketPriceF2.getApFst());
            myParameterSourceAry[i].addValue("apFsu", wkDataFeedAirticketPriceF2.getApFsu());
            myParameterSourceAry[i].addValue("apFsv", wkDataFeedAirticketPriceF2.getApFsv());
            myParameterSourceAry[i].addValue("apFsw", wkDataFeedAirticketPriceF2.getApFsw());
            myParameterSourceAry[i].addValue("apFsx", wkDataFeedAirticketPriceF2.getApFsx());
            myParameterSourceAry[i].addValue("apFsy", wkDataFeedAirticketPriceF2.getApFsy());
            myParameterSourceAry[i].addValue("apFsz", wkDataFeedAirticketPriceF2.getApFsz());
            myParameterSourceAry[i].addValue("apFta", wkDataFeedAirticketPriceF2.getApFta());
            myParameterSourceAry[i].addValue("apFtb", wkDataFeedAirticketPriceF2.getApFtb());
            myParameterSourceAry[i].addValue("apFtc", wkDataFeedAirticketPriceF2.getApFtc());
            myParameterSourceAry[i].addValue("apFtd", wkDataFeedAirticketPriceF2.getApFtd());
            myParameterSourceAry[i].addValue("apFte", wkDataFeedAirticketPriceF2.getApFte());
            myParameterSourceAry[i].addValue("apFtf", wkDataFeedAirticketPriceF2.getApFtf());
            myParameterSourceAry[i].addValue("apFtg", wkDataFeedAirticketPriceF2.getApFtg());
            myParameterSourceAry[i].addValue("apFth", wkDataFeedAirticketPriceF2.getApFth());
            myParameterSourceAry[i].addValue("apFti", wkDataFeedAirticketPriceF2.getApFti());
            myParameterSourceAry[i].addValue("apFtj", wkDataFeedAirticketPriceF2.getApFtj());
            myParameterSourceAry[i].addValue("apFtk", wkDataFeedAirticketPriceF2.getApFtk());
            myParameterSourceAry[i].addValue("apFtl", wkDataFeedAirticketPriceF2.getApFtl());
            myParameterSourceAry[i].addValue("apFtm", wkDataFeedAirticketPriceF2.getApFtm());
            myParameterSourceAry[i].addValue("apFtn", wkDataFeedAirticketPriceF2.getApFtn());
            myParameterSourceAry[i].addValue("apFto", wkDataFeedAirticketPriceF2.getApFto());
            myParameterSourceAry[i].addValue("apFtp", wkDataFeedAirticketPriceF2.getApFtp());
            myParameterSourceAry[i].addValue("apFtq", wkDataFeedAirticketPriceF2.getApFtq());
            myParameterSourceAry[i].addValue("apFtr", wkDataFeedAirticketPriceF2.getApFtr());
            myParameterSourceAry[i].addValue("apFts", wkDataFeedAirticketPriceF2.getApFts());
            myParameterSourceAry[i].addValue("apFtt", wkDataFeedAirticketPriceF2.getApFtt());
            myParameterSourceAry[i].addValue("apFtu", wkDataFeedAirticketPriceF2.getApFtu());
            myParameterSourceAry[i].addValue("apFtv", wkDataFeedAirticketPriceF2.getApFtv());
            myParameterSourceAry[i].addValue("apFtw", wkDataFeedAirticketPriceF2.getApFtw());
            myParameterSourceAry[i].addValue("apFtx", wkDataFeedAirticketPriceF2.getApFtx());
            myParameterSourceAry[i].addValue("apFty", wkDataFeedAirticketPriceF2.getApFty());
            myParameterSourceAry[i].addValue("apFtz", wkDataFeedAirticketPriceF2.getApFtz());
            myParameterSourceAry[i].addValue("apFua", wkDataFeedAirticketPriceF2.getApFua());
            myParameterSourceAry[i].addValue("apFub", wkDataFeedAirticketPriceF2.getApFub());
            myParameterSourceAry[i].addValue("apFuc", wkDataFeedAirticketPriceF2.getApFuc());
            myParameterSourceAry[i].addValue("apFud", wkDataFeedAirticketPriceF2.getApFud());
            myParameterSourceAry[i].addValue("apFue", wkDataFeedAirticketPriceF2.getApFue());
            myParameterSourceAry[i].addValue("apFuf", wkDataFeedAirticketPriceF2.getApFuf());
            myParameterSourceAry[i].addValue("apFug", wkDataFeedAirticketPriceF2.getApFug());
            myParameterSourceAry[i].addValue("apFuh", wkDataFeedAirticketPriceF2.getApFuh());
            myParameterSourceAry[i].addValue("apFui", wkDataFeedAirticketPriceF2.getApFui());
            myParameterSourceAry[i].addValue("apFuj", wkDataFeedAirticketPriceF2.getApFuj());
            myParameterSourceAry[i].addValue("apFuk", wkDataFeedAirticketPriceF2.getApFuk());
            myParameterSourceAry[i].addValue("apFul", wkDataFeedAirticketPriceF2.getApFul());
            myParameterSourceAry[i].addValue("apFum", wkDataFeedAirticketPriceF2.getApFum());
            myParameterSourceAry[i].addValue("apFun", wkDataFeedAirticketPriceF2.getApFun());
            myParameterSourceAry[i].addValue("apFuo", wkDataFeedAirticketPriceF2.getApFuo());
            myParameterSourceAry[i].addValue("apFup", wkDataFeedAirticketPriceF2.getApFup());
            myParameterSourceAry[i].addValue("apFuq", wkDataFeedAirticketPriceF2.getApFuq());
            myParameterSourceAry[i].addValue("apFur", wkDataFeedAirticketPriceF2.getApFur());
            myParameterSourceAry[i].addValue("apFus", wkDataFeedAirticketPriceF2.getApFus());
            myParameterSourceAry[i].addValue("apFut", wkDataFeedAirticketPriceF2.getApFut());
            myParameterSourceAry[i].addValue("apFuu", wkDataFeedAirticketPriceF2.getApFuu());
            myParameterSourceAry[i].addValue("apFuv", wkDataFeedAirticketPriceF2.getApFuv());
            myParameterSourceAry[i].addValue("apFuw", wkDataFeedAirticketPriceF2.getApFuw());
            myParameterSourceAry[i].addValue("apFux", wkDataFeedAirticketPriceF2.getApFux());
            myParameterSourceAry[i].addValue("apFuy", wkDataFeedAirticketPriceF2.getApFuy());
            myParameterSourceAry[i].addValue("apFuz", wkDataFeedAirticketPriceF2.getApFuz());
            myParameterSourceAry[i].addValue("apFva", wkDataFeedAirticketPriceF2.getApFva());
            myParameterSourceAry[i].addValue("apFvb", wkDataFeedAirticketPriceF2.getApFvb());
            myParameterSourceAry[i].addValue("apFvc", wkDataFeedAirticketPriceF2.getApFvc());
            myParameterSourceAry[i].addValue("apFvd", wkDataFeedAirticketPriceF2.getApFvd());
            myParameterSourceAry[i].addValue("apFve", wkDataFeedAirticketPriceF2.getApFve());
            myParameterSourceAry[i].addValue("apFvf", wkDataFeedAirticketPriceF2.getApFvf());
            myParameterSourceAry[i].addValue("apFvg", wkDataFeedAirticketPriceF2.getApFvg());
            myParameterSourceAry[i].addValue("apFvh", wkDataFeedAirticketPriceF2.getApFvh());
            myParameterSourceAry[i].addValue("apFvi", wkDataFeedAirticketPriceF2.getApFvi());
            myParameterSourceAry[i].addValue("apFvj", wkDataFeedAirticketPriceF2.getApFvj());
            myParameterSourceAry[i].addValue("apFvk", wkDataFeedAirticketPriceF2.getApFvk());
            myParameterSourceAry[i].addValue("apFvl", wkDataFeedAirticketPriceF2.getApFvl());
            myParameterSourceAry[i].addValue("apFvm", wkDataFeedAirticketPriceF2.getApFvm());
            myParameterSourceAry[i].addValue("apFvn", wkDataFeedAirticketPriceF2.getApFvn());
            myParameterSourceAry[i].addValue("apFvo", wkDataFeedAirticketPriceF2.getApFvo());
            myParameterSourceAry[i].addValue("apFvp", wkDataFeedAirticketPriceF2.getApFvp());
            myParameterSourceAry[i].addValue("apFvq", wkDataFeedAirticketPriceF2.getApFvq());
            myParameterSourceAry[i].addValue("apFvr", wkDataFeedAirticketPriceF2.getApFvr());
            myParameterSourceAry[i].addValue("apFvs", wkDataFeedAirticketPriceF2.getApFvs());
            myParameterSourceAry[i].addValue("apFvt", wkDataFeedAirticketPriceF2.getApFvt());
            myParameterSourceAry[i].addValue("apFvu", wkDataFeedAirticketPriceF2.getApFvu());
            myParameterSourceAry[i].addValue("apFvv", wkDataFeedAirticketPriceF2.getApFvv());
            myParameterSourceAry[i].addValue("apFvw", wkDataFeedAirticketPriceF2.getApFvw());
            myParameterSourceAry[i].addValue("apFvx", wkDataFeedAirticketPriceF2.getApFvx());
            myParameterSourceAry[i].addValue("apFvy", wkDataFeedAirticketPriceF2.getApFvy());
            myParameterSourceAry[i].addValue("apFvz", wkDataFeedAirticketPriceF2.getApFvz());
            myParameterSourceAry[i].addValue("apFwa", wkDataFeedAirticketPriceF2.getApFwa());
            myParameterSourceAry[i].addValue("apFwb", wkDataFeedAirticketPriceF2.getApFwb());
            myParameterSourceAry[i].addValue("apFwc", wkDataFeedAirticketPriceF2.getApFwc());
            myParameterSourceAry[i].addValue("apFwd", wkDataFeedAirticketPriceF2.getApFwd());
            myParameterSourceAry[i].addValue("apFwe", wkDataFeedAirticketPriceF2.getApFwe());
            myParameterSourceAry[i].addValue("apFwf", wkDataFeedAirticketPriceF2.getApFwf());
            myParameterSourceAry[i].addValue("apFwg", wkDataFeedAirticketPriceF2.getApFwg());
            myParameterSourceAry[i].addValue("apFwh", wkDataFeedAirticketPriceF2.getApFwh());
            myParameterSourceAry[i].addValue("apFwi", wkDataFeedAirticketPriceF2.getApFwi());
            myParameterSourceAry[i].addValue("apFwj", wkDataFeedAirticketPriceF2.getApFwj());
            myParameterSourceAry[i].addValue("apFwk", wkDataFeedAirticketPriceF2.getApFwk());
            myParameterSourceAry[i].addValue("apFwl", wkDataFeedAirticketPriceF2.getApFwl());
            myParameterSourceAry[i].addValue("apFwm", wkDataFeedAirticketPriceF2.getApFwm());
            myParameterSourceAry[i].addValue("apFwn", wkDataFeedAirticketPriceF2.getApFwn());
            myParameterSourceAry[i].addValue("apFwo", wkDataFeedAirticketPriceF2.getApFwo());
            myParameterSourceAry[i].addValue("apFwp", wkDataFeedAirticketPriceF2.getApFwp());
            myParameterSourceAry[i].addValue("apFwq", wkDataFeedAirticketPriceF2.getApFwq());
            myParameterSourceAry[i].addValue("apFwr", wkDataFeedAirticketPriceF2.getApFwr());
            myParameterSourceAry[i].addValue("apFws", wkDataFeedAirticketPriceF2.getApFws());
            myParameterSourceAry[i].addValue("apFwt", wkDataFeedAirticketPriceF2.getApFwt());
            myParameterSourceAry[i].addValue("apFwu", wkDataFeedAirticketPriceF2.getApFwu());
            myParameterSourceAry[i].addValue("apFwv", wkDataFeedAirticketPriceF2.getApFwv());
            myParameterSourceAry[i].addValue("apFww", wkDataFeedAirticketPriceF2.getApFww());
            myParameterSourceAry[i].addValue("apFwx", wkDataFeedAirticketPriceF2.getApFwx());
            myParameterSourceAry[i].addValue("apFwy", wkDataFeedAirticketPriceF2.getApFwy());
            myParameterSourceAry[i].addValue("apFwz", wkDataFeedAirticketPriceF2.getApFwz());
            myParameterSourceAry[i].addValue("apFxa", wkDataFeedAirticketPriceF2.getApFxa());
            myParameterSourceAry[i].addValue("apFxb", wkDataFeedAirticketPriceF2.getApFxb());
            myParameterSourceAry[i].addValue("apFxc", wkDataFeedAirticketPriceF2.getApFxc());
            myParameterSourceAry[i].addValue("apFxd", wkDataFeedAirticketPriceF2.getApFxd());
            myParameterSourceAry[i].addValue("apFxe", wkDataFeedAirticketPriceF2.getApFxe());
            myParameterSourceAry[i].addValue("apFxf", wkDataFeedAirticketPriceF2.getApFxf());
            myParameterSourceAry[i].addValue("apFxg", wkDataFeedAirticketPriceF2.getApFxg());
            myParameterSourceAry[i].addValue("apFxh", wkDataFeedAirticketPriceF2.getApFxh());
            myParameterSourceAry[i].addValue("apFxi", wkDataFeedAirticketPriceF2.getApFxi());
            myParameterSourceAry[i].addValue("apFxj", wkDataFeedAirticketPriceF2.getApFxj());
            myParameterSourceAry[i].addValue("apFxk", wkDataFeedAirticketPriceF2.getApFxk());
            myParameterSourceAry[i].addValue("apFxl", wkDataFeedAirticketPriceF2.getApFxl());
            myParameterSourceAry[i].addValue("apFxm", wkDataFeedAirticketPriceF2.getApFxm());
            myParameterSourceAry[i].addValue("apFxn", wkDataFeedAirticketPriceF2.getApFxn());
            myParameterSourceAry[i].addValue("apFxo", wkDataFeedAirticketPriceF2.getApFxo());
            myParameterSourceAry[i].addValue("apFxp", wkDataFeedAirticketPriceF2.getApFxp());
        }

        namedParameterJdbcTemplate.batchUpdate(mySql, myParameterSourceAry);
    }
}
