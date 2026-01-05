package tw.com.colatour.datafeed.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Component;
import tw.com.colatour.datafeed.dao.DataFeedAirticketPriceE2Dao;
import tw.com.colatour.datafeed.model.DataFeedAirticketPriceE2;

import java.util.List;

@Component
public class DataFeedAirticketPriceE2DaoImpl implements DataFeedAirticketPriceE2Dao {

    @Autowired
    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    @Override
    public void createDataFeedAirticketPriceE2s(List<DataFeedAirticketPriceE2> dataFeedAirticketPriceE2List) {
        String mySql = "INSERT INTO data_feed.data_feed_airticket_price_E2 ( " +
                " file_no, price_no, " +
                " ap_ena, ap_enb, ap_enc, ap_end, ap_ene, ap_enf, ap_eng, ap_enh, ap_eni, ap_enj, ap_enk, ap_enl, ap_enm, " +
                " ap_enn, ap_eno, ap_enp, ap_enq, ap_enr, ap_ens, ap_ent, ap_enu, ap_env, ap_enw, ap_enx, ap_eny, ap_enz, " +
                " ap_eoa, ap_eob, ap_eoc, ap_eod, ap_eoe, ap_eof, ap_eog, ap_eoh, ap_eoi, ap_eoj, ap_eok, ap_eol, ap_eom, " +
                " ap_eon, ap_eoo, ap_eop, ap_eoq, ap_eor, ap_eos, ap_eot, ap_eou, ap_eov, ap_eow, ap_eox, ap_eoy, ap_eoz, " +
                " ap_epa, ap_epb, ap_epc, ap_epd, ap_epe, ap_epf, ap_epg, ap_eph, ap_epi, ap_epj, ap_epk, ap_epl, ap_epm, " +
                " ap_epn, ap_epo, ap_epp, ap_epq, ap_epr, ap_eps, ap_ept, ap_epu, ap_epv, ap_epw, ap_epx, ap_epy, ap_epz, " +
                " ap_eqa, ap_eqb, ap_eqc, ap_eqd, ap_eqe, ap_eqf, ap_eqg, ap_eqh, ap_eqi, ap_eqj, ap_eqk, ap_eql, ap_eqm, " +
                " ap_eqn, ap_eqo, ap_eqp, ap_eqq, ap_eqr, ap_eqs, ap_eqt, ap_equ, ap_eqv, ap_eqw, ap_eqx, ap_eqy, ap_eqz, " +
                " ap_era, ap_erb, ap_erc, ap_erd, ap_ere, ap_erf, ap_erg, ap_erh, ap_eri, ap_erj, ap_erk, ap_erl, ap_erm, " +
                " ap_ern, ap_ero, ap_erp, ap_erq, ap_err, ap_ers, ap_ert, ap_eru, ap_erv, ap_erw, ap_erx, ap_ery, ap_erz, " +
                " ap_esa, ap_esb, ap_esc, ap_esd, ap_ese, ap_esf, ap_esg, ap_esh, ap_esi, ap_esj, ap_esk, ap_esl, ap_esm, " +
                " ap_esn, ap_eso, ap_esp, ap_esq, ap_esr, ap_ess, ap_est, ap_esu, ap_esv, ap_esw, ap_esx, ap_esy, ap_esz, " +
                " ap_eta, ap_etb, ap_etc, ap_etd, ap_ete, ap_etf, ap_etg, ap_eth, ap_eti, ap_etj, ap_etk, ap_etl, ap_etm, " +
                " ap_etn, ap_eto, ap_etp, ap_etq, ap_etr, ap_ets, ap_ett, ap_etu, ap_etv, ap_etw, ap_etx, ap_ety, ap_etz, " +
                " ap_eua, ap_eub, ap_euc, ap_eud, ap_eue, ap_euf, ap_eug, ap_euh, ap_eui, ap_euj, ap_euk, ap_eul, ap_eum, " +
                " ap_eun, ap_euo, ap_eup, ap_euq, ap_eur, ap_eus, ap_eut, ap_euu, ap_euv, ap_euw, ap_eux, ap_euy, ap_euz, " +
                " ap_eva, ap_evb, ap_evc, ap_evd, ap_eve, ap_evf, ap_evg, ap_evh, ap_evi, ap_evj, ap_evk, ap_evl, ap_evm, " +
                " ap_evn, ap_evo, ap_evp, ap_evq, ap_evr, ap_evs, ap_evt, ap_evu, ap_evv, ap_evw, ap_evx, ap_evy, ap_evz, " +
                " ap_ewa, ap_ewb, ap_ewc, ap_ewd, ap_ewe, ap_ewf, ap_ewg, ap_ewh, ap_ewi, ap_ewj, ap_ewk, ap_ewl, ap_ewm, " +
                " ap_ewn, ap_ewo, ap_ewp, ap_ewq, ap_ewr, ap_ews, ap_ewt, ap_ewu, ap_ewv, ap_eww, ap_ewx, ap_ewy, ap_ewz, " +
                " ap_exa, ap_exb, ap_exc, ap_exd, ap_exe, ap_exf, ap_exg, ap_exh, ap_exi, ap_exj, ap_exk, ap_exl, ap_exm, " +
                " ap_exn, ap_exo, ap_exp, ap_exq, ap_exr, ap_exs, ap_ext, ap_exu, ap_exv, ap_exw, ap_exx, ap_exy, ap_exz, " +
                " ap_eya, ap_eyb, ap_eyc, ap_eyd, ap_eye, ap_eyf, ap_eyg, ap_eyh, ap_eyi, ap_eyj, ap_eyk, ap_eyl, ap_eym, " +
                " ap_eyn, ap_eyo, ap_eyp, ap_eyq, ap_eyr, ap_eys, ap_eyt, ap_eyu, ap_eyv, ap_eyw, ap_eyx, ap_eyy, ap_eyz, " +
                " ap_eza, ap_ezb, ap_ezc, ap_ezd, ap_eze, ap_ezf, ap_ezg, ap_ezh, ap_ezi, ap_ezj, ap_ezk, ap_ezl, ap_ezm, " +
                " ap_ezn, ap_ezo, ap_ezp, ap_ezq, ap_ezr, ap_ezs, ap_ezt, ap_ezu, ap_ezv, ap_ezw, ap_ezx, ap_ezy, ap_ezz ) " +
                " VALUES ( " +
                " :fileNo, :priceNo, " +
                " :apEna, :apEnb, :apEnc, :apEnd, :apEne, :apEnf, :apEng, :apEnh, :apEni, :apEnj, :apEnk, :apEnl, :apEnm, " +
                " :apEnn, :apEno, :apEnp, :apEnq, :apEnr, :apEns, :apEnt, :apEnu, :apEnv, :apEnw, :apEnx, :apEny, :apEnz, " +
                " :apEoa, :apEob, :apEoc, :apEod, :apEoe, :apEof, :apEog, :apEoh, :apEoi, :apEoj, :apEok, :apEol, :apEom, " +
                " :apEon, :apEoo, :apEop, :apEoq, :apEor, :apEos, :apEot, :apEou, :apEov, :apEow, :apEox, :apEoy, :apEoz, " +
                " :apEpa, :apEpb, :apEpc, :apEpd, :apEpe, :apEpf, :apEpg, :apEph, :apEpi, :apEpj, :apEpk, :apEpl, :apEpm, " +
                " :apEpn, :apEpo, :apEpp, :apEpq, :apEpr, :apEps, :apEpt, :apEpu, :apEpv, :apEpw, :apEpx, :apEpy, :apEpz, " +
                " :apEqa, :apEqb, :apEqc, :apEqd, :apEqe, :apEqf, :apEqg, :apEqh, :apEqi, :apEqj, :apEqk, :apEql, :apEqm, " +
                " :apEqn, :apEqo, :apEqp, :apEqq, :apEqr, :apEqs, :apEqt, :apEqu, :apEqv, :apEqw, :apEqx, :apEqy, :apEqz, " +
                " :apEra, :apErb, :apErc, :apErd, :apEre, :apErf, :apErg, :apErh, :apEri, :apErj, :apErk, :apErl, :apErm, " +
                " :apErn, :apEro, :apErp, :apErq, :apErr, :apErs, :apErt, :apEru, :apErv, :apErw, :apErx, :apEry, :apErz, " +
                " :apEsa, :apEsb, :apEsc, :apEsd, :apEse, :apEsf, :apEsg, :apEsh, :apEsi, :apEsj, :apEsk, :apEsl, :apEsm, " +
                " :apEsn, :apEso, :apEsp, :apEsq, :apEsr, :apEss, :apEst, :apEsu, :apEsv, :apEsw, :apEsx, :apEsy, :apEsz, " +
                " :apEta, :apEtb, :apEtc, :apEtd, :apEte, :apEtf, :apEtg, :apEth, :apEti, :apEtj, :apEtk, :apEtl, :apEtm, " +
                " :apEtn, :apEto, :apEtp, :apEtq, :apEtr, :apEts, :apEtt, :apEtu, :apEtv, :apEtw, :apEtx, :apEty, :apEtz, " +
                " :apEua, :apEub, :apEuc, :apEud, :apEue, :apEuf, :apEug, :apEuh, :apEui, :apEuj, :apEuk, :apEul, :apEum, " +
                " :apEun, :apEuo, :apEup, :apEuq, :apEur, :apEus, :apEut, :apEuu, :apEuv, :apEuw, :apEux, :apEuy, :apEuz, " +
                " :apEva, :apEvb, :apEvc, :apEvd, :apEve, :apEvf, :apEvg, :apEvh, :apEvi, :apEvj, :apEvk, :apEvl, :apEvm, " +
                " :apEvn, :apEvo, :apEvp, :apEvq, :apEvr, :apEvs, :apEvt, :apEvu, :apEvv, :apEvw, :apEvx, :apEvy, :apEvz, " +
                " :apEwa, :apEwb, :apEwc, :apEwd, :apEwe, :apEwf, :apEwg, :apEwh, :apEwi, :apEwj, :apEwk, :apEwl, :apEwm, " +
                " :apEwn, :apEwo, :apEwp, :apEwq, :apEwr, :apEws, :apEwt, :apEwu, :apEwv, :apEww, :apEwx, :apEwy, :apEwz, " +
                " :apExa, :apExb, :apExc, :apExd, :apExe, :apExf, :apExg, :apExh, :apExi, :apExj, :apExk, :apExl, :apExm, " +
                " :apExn, :apExo, :apExp, :apExq, :apExr, :apExs, :apExt, :apExu, :apExv, :apExw, :apExx, :apExy, :apExz, " +
                " :apEya, :apEyb, :apEyc, :apEyd, :apEye, :apEyf, :apEyg, :apEyh, :apEyi, :apEyj, :apEyk, :apEyl, :apEym, " +
                " :apEyn, :apEyo, :apEyp, :apEyq, :apEyr, :apEys, :apEyt, :apEyu, :apEyv, :apEyw, :apEyx, :apEyy, :apEyz, " +
                " :apEza, :apEzb, :apEzc, :apEzd, :apEze, :apEzf, :apEzg, :apEzh, :apEzi, :apEzj, :apEzk, :apEzl, :apEzm, " +
                " :apEzn, :apEzo, :apEzp, :apEzq, :apEzr, :apEzs, :apEzt, :apEzu, :apEzv, :apEzw, :apEzx, :apEzy, :apEzz ) ";

        MapSqlParameterSource[] myParameterSourceAry = new MapSqlParameterSource[dataFeedAirticketPriceE2List.size()];

        for (int i = 0; i < dataFeedAirticketPriceE2List.size(); i++) {
            DataFeedAirticketPriceE2 wkDataFeedAirticketPriceE2 = dataFeedAirticketPriceE2List.get(i);

            myParameterSourceAry[i] = new MapSqlParameterSource();

            myParameterSourceAry[i].addValue("fileNo", wkDataFeedAirticketPriceE2.getFileNo());
            myParameterSourceAry[i].addValue("priceNo", wkDataFeedAirticketPriceE2.getPriceNo());
            myParameterSourceAry[i].addValue("apEna", wkDataFeedAirticketPriceE2.getApEna());
            myParameterSourceAry[i].addValue("apEnb", wkDataFeedAirticketPriceE2.getApEnb());
            myParameterSourceAry[i].addValue("apEnc", wkDataFeedAirticketPriceE2.getApEnc());
            myParameterSourceAry[i].addValue("apEnd", wkDataFeedAirticketPriceE2.getApEnd());
            myParameterSourceAry[i].addValue("apEne", wkDataFeedAirticketPriceE2.getApEne());
            myParameterSourceAry[i].addValue("apEnf", wkDataFeedAirticketPriceE2.getApEnf());
            myParameterSourceAry[i].addValue("apEng", wkDataFeedAirticketPriceE2.getApEng());
            myParameterSourceAry[i].addValue("apEnh", wkDataFeedAirticketPriceE2.getApEnh());
            myParameterSourceAry[i].addValue("apEni", wkDataFeedAirticketPriceE2.getApEni());
            myParameterSourceAry[i].addValue("apEnj", wkDataFeedAirticketPriceE2.getApEnj());
            myParameterSourceAry[i].addValue("apEnk", wkDataFeedAirticketPriceE2.getApEnk());
            myParameterSourceAry[i].addValue("apEnl", wkDataFeedAirticketPriceE2.getApEnl());
            myParameterSourceAry[i].addValue("apEnm", wkDataFeedAirticketPriceE2.getApEnm());
            myParameterSourceAry[i].addValue("apEnn", wkDataFeedAirticketPriceE2.getApEnn());
            myParameterSourceAry[i].addValue("apEno", wkDataFeedAirticketPriceE2.getApEno());
            myParameterSourceAry[i].addValue("apEnp", wkDataFeedAirticketPriceE2.getApEnp());
            myParameterSourceAry[i].addValue("apEnq", wkDataFeedAirticketPriceE2.getApEnq());
            myParameterSourceAry[i].addValue("apEnr", wkDataFeedAirticketPriceE2.getApEnr());
            myParameterSourceAry[i].addValue("apEns", wkDataFeedAirticketPriceE2.getApEns());
            myParameterSourceAry[i].addValue("apEnt", wkDataFeedAirticketPriceE2.getApEnt());
            myParameterSourceAry[i].addValue("apEnu", wkDataFeedAirticketPriceE2.getApEnu());
            myParameterSourceAry[i].addValue("apEnv", wkDataFeedAirticketPriceE2.getApEnv());
            myParameterSourceAry[i].addValue("apEnw", wkDataFeedAirticketPriceE2.getApEnw());
            myParameterSourceAry[i].addValue("apEnx", wkDataFeedAirticketPriceE2.getApEnx());
            myParameterSourceAry[i].addValue("apEny", wkDataFeedAirticketPriceE2.getApEny());
            myParameterSourceAry[i].addValue("apEnz", wkDataFeedAirticketPriceE2.getApEnz());
            myParameterSourceAry[i].addValue("apEoa", wkDataFeedAirticketPriceE2.getApEoa());
            myParameterSourceAry[i].addValue("apEob", wkDataFeedAirticketPriceE2.getApEob());
            myParameterSourceAry[i].addValue("apEoc", wkDataFeedAirticketPriceE2.getApEoc());
            myParameterSourceAry[i].addValue("apEod", wkDataFeedAirticketPriceE2.getApEod());
            myParameterSourceAry[i].addValue("apEoe", wkDataFeedAirticketPriceE2.getApEoe());
            myParameterSourceAry[i].addValue("apEof", wkDataFeedAirticketPriceE2.getApEof());
            myParameterSourceAry[i].addValue("apEog", wkDataFeedAirticketPriceE2.getApEog());
            myParameterSourceAry[i].addValue("apEoh", wkDataFeedAirticketPriceE2.getApEoh());
            myParameterSourceAry[i].addValue("apEoi", wkDataFeedAirticketPriceE2.getApEoi());
            myParameterSourceAry[i].addValue("apEoj", wkDataFeedAirticketPriceE2.getApEoj());
            myParameterSourceAry[i].addValue("apEok", wkDataFeedAirticketPriceE2.getApEok());
            myParameterSourceAry[i].addValue("apEol", wkDataFeedAirticketPriceE2.getApEol());
            myParameterSourceAry[i].addValue("apEom", wkDataFeedAirticketPriceE2.getApEom());
            myParameterSourceAry[i].addValue("apEon", wkDataFeedAirticketPriceE2.getApEon());
            myParameterSourceAry[i].addValue("apEoo", wkDataFeedAirticketPriceE2.getApEoo());
            myParameterSourceAry[i].addValue("apEop", wkDataFeedAirticketPriceE2.getApEop());
            myParameterSourceAry[i].addValue("apEoq", wkDataFeedAirticketPriceE2.getApEoq());
            myParameterSourceAry[i].addValue("apEor", wkDataFeedAirticketPriceE2.getApEor());
            myParameterSourceAry[i].addValue("apEos", wkDataFeedAirticketPriceE2.getApEos());
            myParameterSourceAry[i].addValue("apEot", wkDataFeedAirticketPriceE2.getApEot());
            myParameterSourceAry[i].addValue("apEou", wkDataFeedAirticketPriceE2.getApEou());
            myParameterSourceAry[i].addValue("apEov", wkDataFeedAirticketPriceE2.getApEov());
            myParameterSourceAry[i].addValue("apEow", wkDataFeedAirticketPriceE2.getApEow());
            myParameterSourceAry[i].addValue("apEox", wkDataFeedAirticketPriceE2.getApEox());
            myParameterSourceAry[i].addValue("apEoy", wkDataFeedAirticketPriceE2.getApEoy());
            myParameterSourceAry[i].addValue("apEoz", wkDataFeedAirticketPriceE2.getApEoz());
            myParameterSourceAry[i].addValue("apEpa", wkDataFeedAirticketPriceE2.getApEpa());
            myParameterSourceAry[i].addValue("apEpb", wkDataFeedAirticketPriceE2.getApEpb());
            myParameterSourceAry[i].addValue("apEpc", wkDataFeedAirticketPriceE2.getApEpc());
            myParameterSourceAry[i].addValue("apEpd", wkDataFeedAirticketPriceE2.getApEpd());
            myParameterSourceAry[i].addValue("apEpe", wkDataFeedAirticketPriceE2.getApEpe());
            myParameterSourceAry[i].addValue("apEpf", wkDataFeedAirticketPriceE2.getApEpf());
            myParameterSourceAry[i].addValue("apEpg", wkDataFeedAirticketPriceE2.getApEpg());
            myParameterSourceAry[i].addValue("apEph", wkDataFeedAirticketPriceE2.getApEph());
            myParameterSourceAry[i].addValue("apEpi", wkDataFeedAirticketPriceE2.getApEpi());
            myParameterSourceAry[i].addValue("apEpj", wkDataFeedAirticketPriceE2.getApEpj());
            myParameterSourceAry[i].addValue("apEpk", wkDataFeedAirticketPriceE2.getApEpk());
            myParameterSourceAry[i].addValue("apEpl", wkDataFeedAirticketPriceE2.getApEpl());
            myParameterSourceAry[i].addValue("apEpm", wkDataFeedAirticketPriceE2.getApEpm());
            myParameterSourceAry[i].addValue("apEpn", wkDataFeedAirticketPriceE2.getApEpn());
            myParameterSourceAry[i].addValue("apEpo", wkDataFeedAirticketPriceE2.getApEpo());
            myParameterSourceAry[i].addValue("apEpp", wkDataFeedAirticketPriceE2.getApEpp());
            myParameterSourceAry[i].addValue("apEpq", wkDataFeedAirticketPriceE2.getApEpq());
            myParameterSourceAry[i].addValue("apEpr", wkDataFeedAirticketPriceE2.getApEpr());
            myParameterSourceAry[i].addValue("apEps", wkDataFeedAirticketPriceE2.getApEps());
            myParameterSourceAry[i].addValue("apEpt", wkDataFeedAirticketPriceE2.getApEpt());
            myParameterSourceAry[i].addValue("apEpu", wkDataFeedAirticketPriceE2.getApEpu());
            myParameterSourceAry[i].addValue("apEpv", wkDataFeedAirticketPriceE2.getApEpv());
            myParameterSourceAry[i].addValue("apEpw", wkDataFeedAirticketPriceE2.getApEpw());
            myParameterSourceAry[i].addValue("apEpx", wkDataFeedAirticketPriceE2.getApEpx());
            myParameterSourceAry[i].addValue("apEpy", wkDataFeedAirticketPriceE2.getApEpy());
            myParameterSourceAry[i].addValue("apEpz", wkDataFeedAirticketPriceE2.getApEpz());
            myParameterSourceAry[i].addValue("apEqa", wkDataFeedAirticketPriceE2.getApEqa());
            myParameterSourceAry[i].addValue("apEqb", wkDataFeedAirticketPriceE2.getApEqb());
            myParameterSourceAry[i].addValue("apEqc", wkDataFeedAirticketPriceE2.getApEqc());
            myParameterSourceAry[i].addValue("apEqd", wkDataFeedAirticketPriceE2.getApEqd());
            myParameterSourceAry[i].addValue("apEqe", wkDataFeedAirticketPriceE2.getApEqe());
            myParameterSourceAry[i].addValue("apEqf", wkDataFeedAirticketPriceE2.getApEqf());
            myParameterSourceAry[i].addValue("apEqg", wkDataFeedAirticketPriceE2.getApEqg());
            myParameterSourceAry[i].addValue("apEqh", wkDataFeedAirticketPriceE2.getApEqh());
            myParameterSourceAry[i].addValue("apEqi", wkDataFeedAirticketPriceE2.getApEqi());
            myParameterSourceAry[i].addValue("apEqj", wkDataFeedAirticketPriceE2.getApEqj());
            myParameterSourceAry[i].addValue("apEqk", wkDataFeedAirticketPriceE2.getApEqk());
            myParameterSourceAry[i].addValue("apEql", wkDataFeedAirticketPriceE2.getApEql());
            myParameterSourceAry[i].addValue("apEqm", wkDataFeedAirticketPriceE2.getApEqm());
            myParameterSourceAry[i].addValue("apEqn", wkDataFeedAirticketPriceE2.getApEqn());
            myParameterSourceAry[i].addValue("apEqo", wkDataFeedAirticketPriceE2.getApEqo());
            myParameterSourceAry[i].addValue("apEqp", wkDataFeedAirticketPriceE2.getApEqp());
            myParameterSourceAry[i].addValue("apEqq", wkDataFeedAirticketPriceE2.getApEqq());
            myParameterSourceAry[i].addValue("apEqr", wkDataFeedAirticketPriceE2.getApEqr());
            myParameterSourceAry[i].addValue("apEqs", wkDataFeedAirticketPriceE2.getApEqs());
            myParameterSourceAry[i].addValue("apEqt", wkDataFeedAirticketPriceE2.getApEqt());
            myParameterSourceAry[i].addValue("apEqu", wkDataFeedAirticketPriceE2.getApEqu());
            myParameterSourceAry[i].addValue("apEqv", wkDataFeedAirticketPriceE2.getApEqv());
            myParameterSourceAry[i].addValue("apEqw", wkDataFeedAirticketPriceE2.getApEqw());
            myParameterSourceAry[i].addValue("apEqx", wkDataFeedAirticketPriceE2.getApEqx());
            myParameterSourceAry[i].addValue("apEqy", wkDataFeedAirticketPriceE2.getApEqy());
            myParameterSourceAry[i].addValue("apEqz", wkDataFeedAirticketPriceE2.getApEqz());
            myParameterSourceAry[i].addValue("apEra", wkDataFeedAirticketPriceE2.getApEra());
            myParameterSourceAry[i].addValue("apErb", wkDataFeedAirticketPriceE2.getApErb());
            myParameterSourceAry[i].addValue("apErc", wkDataFeedAirticketPriceE2.getApErc());
            myParameterSourceAry[i].addValue("apErd", wkDataFeedAirticketPriceE2.getApErd());
            myParameterSourceAry[i].addValue("apEre", wkDataFeedAirticketPriceE2.getApEre());
            myParameterSourceAry[i].addValue("apErf", wkDataFeedAirticketPriceE2.getApErf());
            myParameterSourceAry[i].addValue("apErg", wkDataFeedAirticketPriceE2.getApErg());
            myParameterSourceAry[i].addValue("apErh", wkDataFeedAirticketPriceE2.getApErh());
            myParameterSourceAry[i].addValue("apEri", wkDataFeedAirticketPriceE2.getApEri());
            myParameterSourceAry[i].addValue("apErj", wkDataFeedAirticketPriceE2.getApErj());
            myParameterSourceAry[i].addValue("apErk", wkDataFeedAirticketPriceE2.getApErk());
            myParameterSourceAry[i].addValue("apErl", wkDataFeedAirticketPriceE2.getApErl());
            myParameterSourceAry[i].addValue("apErm", wkDataFeedAirticketPriceE2.getApErm());
            myParameterSourceAry[i].addValue("apErn", wkDataFeedAirticketPriceE2.getApErn());
            myParameterSourceAry[i].addValue("apEro", wkDataFeedAirticketPriceE2.getApEro());
            myParameterSourceAry[i].addValue("apErp", wkDataFeedAirticketPriceE2.getApErp());
            myParameterSourceAry[i].addValue("apErq", wkDataFeedAirticketPriceE2.getApErq());
            myParameterSourceAry[i].addValue("apErr", wkDataFeedAirticketPriceE2.getApErr());
            myParameterSourceAry[i].addValue("apErs", wkDataFeedAirticketPriceE2.getApErs());
            myParameterSourceAry[i].addValue("apErt", wkDataFeedAirticketPriceE2.getApErt());
            myParameterSourceAry[i].addValue("apEru", wkDataFeedAirticketPriceE2.getApEru());
            myParameterSourceAry[i].addValue("apErv", wkDataFeedAirticketPriceE2.getApErv());
            myParameterSourceAry[i].addValue("apErw", wkDataFeedAirticketPriceE2.getApErw());
            myParameterSourceAry[i].addValue("apErx", wkDataFeedAirticketPriceE2.getApErx());
            myParameterSourceAry[i].addValue("apEry", wkDataFeedAirticketPriceE2.getApEry());
            myParameterSourceAry[i].addValue("apErz", wkDataFeedAirticketPriceE2.getApErz());
            myParameterSourceAry[i].addValue("apEsa", wkDataFeedAirticketPriceE2.getApEsa());
            myParameterSourceAry[i].addValue("apEsb", wkDataFeedAirticketPriceE2.getApEsb());
            myParameterSourceAry[i].addValue("apEsc", wkDataFeedAirticketPriceE2.getApEsc());
            myParameterSourceAry[i].addValue("apEsd", wkDataFeedAirticketPriceE2.getApEsd());
            myParameterSourceAry[i].addValue("apEse", wkDataFeedAirticketPriceE2.getApEse());
            myParameterSourceAry[i].addValue("apEsf", wkDataFeedAirticketPriceE2.getApEsf());
            myParameterSourceAry[i].addValue("apEsg", wkDataFeedAirticketPriceE2.getApEsg());
            myParameterSourceAry[i].addValue("apEsh", wkDataFeedAirticketPriceE2.getApEsh());
            myParameterSourceAry[i].addValue("apEsi", wkDataFeedAirticketPriceE2.getApEsi());
            myParameterSourceAry[i].addValue("apEsj", wkDataFeedAirticketPriceE2.getApEsj());
            myParameterSourceAry[i].addValue("apEsk", wkDataFeedAirticketPriceE2.getApEsk());
            myParameterSourceAry[i].addValue("apEsl", wkDataFeedAirticketPriceE2.getApEsl());
            myParameterSourceAry[i].addValue("apEsm", wkDataFeedAirticketPriceE2.getApEsm());
            myParameterSourceAry[i].addValue("apEsn", wkDataFeedAirticketPriceE2.getApEsn());
            myParameterSourceAry[i].addValue("apEso", wkDataFeedAirticketPriceE2.getApEso());
            myParameterSourceAry[i].addValue("apEsp", wkDataFeedAirticketPriceE2.getApEsp());
            myParameterSourceAry[i].addValue("apEsq", wkDataFeedAirticketPriceE2.getApEsq());
            myParameterSourceAry[i].addValue("apEsr", wkDataFeedAirticketPriceE2.getApEsr());
            myParameterSourceAry[i].addValue("apEss", wkDataFeedAirticketPriceE2.getApEss());
            myParameterSourceAry[i].addValue("apEst", wkDataFeedAirticketPriceE2.getApEst());
            myParameterSourceAry[i].addValue("apEsu", wkDataFeedAirticketPriceE2.getApEsu());
            myParameterSourceAry[i].addValue("apEsv", wkDataFeedAirticketPriceE2.getApEsv());
            myParameterSourceAry[i].addValue("apEsw", wkDataFeedAirticketPriceE2.getApEsw());
            myParameterSourceAry[i].addValue("apEsx", wkDataFeedAirticketPriceE2.getApEsx());
            myParameterSourceAry[i].addValue("apEsy", wkDataFeedAirticketPriceE2.getApEsy());
            myParameterSourceAry[i].addValue("apEsz", wkDataFeedAirticketPriceE2.getApEsz());
            myParameterSourceAry[i].addValue("apEta", wkDataFeedAirticketPriceE2.getApEta());
            myParameterSourceAry[i].addValue("apEtb", wkDataFeedAirticketPriceE2.getApEtb());
            myParameterSourceAry[i].addValue("apEtc", wkDataFeedAirticketPriceE2.getApEtc());
            myParameterSourceAry[i].addValue("apEtd", wkDataFeedAirticketPriceE2.getApEtd());
            myParameterSourceAry[i].addValue("apEte", wkDataFeedAirticketPriceE2.getApEte());
            myParameterSourceAry[i].addValue("apEtf", wkDataFeedAirticketPriceE2.getApEtf());
            myParameterSourceAry[i].addValue("apEtg", wkDataFeedAirticketPriceE2.getApEtg());
            myParameterSourceAry[i].addValue("apEth", wkDataFeedAirticketPriceE2.getApEth());
            myParameterSourceAry[i].addValue("apEti", wkDataFeedAirticketPriceE2.getApEti());
            myParameterSourceAry[i].addValue("apEtj", wkDataFeedAirticketPriceE2.getApEtj());
            myParameterSourceAry[i].addValue("apEtk", wkDataFeedAirticketPriceE2.getApEtk());
            myParameterSourceAry[i].addValue("apEtl", wkDataFeedAirticketPriceE2.getApEtl());
            myParameterSourceAry[i].addValue("apEtm", wkDataFeedAirticketPriceE2.getApEtm());
            myParameterSourceAry[i].addValue("apEtn", wkDataFeedAirticketPriceE2.getApEtn());
            myParameterSourceAry[i].addValue("apEto", wkDataFeedAirticketPriceE2.getApEto());
            myParameterSourceAry[i].addValue("apEtp", wkDataFeedAirticketPriceE2.getApEtp());
            myParameterSourceAry[i].addValue("apEtq", wkDataFeedAirticketPriceE2.getApEtq());
            myParameterSourceAry[i].addValue("apEtr", wkDataFeedAirticketPriceE2.getApEtr());
            myParameterSourceAry[i].addValue("apEts", wkDataFeedAirticketPriceE2.getApEts());
            myParameterSourceAry[i].addValue("apEtt", wkDataFeedAirticketPriceE2.getApEtt());
            myParameterSourceAry[i].addValue("apEtu", wkDataFeedAirticketPriceE2.getApEtu());
            myParameterSourceAry[i].addValue("apEtv", wkDataFeedAirticketPriceE2.getApEtv());
            myParameterSourceAry[i].addValue("apEtw", wkDataFeedAirticketPriceE2.getApEtw());
            myParameterSourceAry[i].addValue("apEtx", wkDataFeedAirticketPriceE2.getApEtx());
            myParameterSourceAry[i].addValue("apEty", wkDataFeedAirticketPriceE2.getApEty());
            myParameterSourceAry[i].addValue("apEtz", wkDataFeedAirticketPriceE2.getApEtz());
            myParameterSourceAry[i].addValue("apEua", wkDataFeedAirticketPriceE2.getApEua());
            myParameterSourceAry[i].addValue("apEub", wkDataFeedAirticketPriceE2.getApEub());
            myParameterSourceAry[i].addValue("apEuc", wkDataFeedAirticketPriceE2.getApEuc());
            myParameterSourceAry[i].addValue("apEud", wkDataFeedAirticketPriceE2.getApEud());
            myParameterSourceAry[i].addValue("apEue", wkDataFeedAirticketPriceE2.getApEue());
            myParameterSourceAry[i].addValue("apEuf", wkDataFeedAirticketPriceE2.getApEuf());
            myParameterSourceAry[i].addValue("apEug", wkDataFeedAirticketPriceE2.getApEug());
            myParameterSourceAry[i].addValue("apEuh", wkDataFeedAirticketPriceE2.getApEuh());
            myParameterSourceAry[i].addValue("apEui", wkDataFeedAirticketPriceE2.getApEui());
            myParameterSourceAry[i].addValue("apEuj", wkDataFeedAirticketPriceE2.getApEuj());
            myParameterSourceAry[i].addValue("apEuk", wkDataFeedAirticketPriceE2.getApEuk());
            myParameterSourceAry[i].addValue("apEul", wkDataFeedAirticketPriceE2.getApEul());
            myParameterSourceAry[i].addValue("apEum", wkDataFeedAirticketPriceE2.getApEum());
            myParameterSourceAry[i].addValue("apEun", wkDataFeedAirticketPriceE2.getApEun());
            myParameterSourceAry[i].addValue("apEuo", wkDataFeedAirticketPriceE2.getApEuo());
            myParameterSourceAry[i].addValue("apEup", wkDataFeedAirticketPriceE2.getApEup());
            myParameterSourceAry[i].addValue("apEuq", wkDataFeedAirticketPriceE2.getApEuq());
            myParameterSourceAry[i].addValue("apEur", wkDataFeedAirticketPriceE2.getApEur());
            myParameterSourceAry[i].addValue("apEus", wkDataFeedAirticketPriceE2.getApEus());
            myParameterSourceAry[i].addValue("apEut", wkDataFeedAirticketPriceE2.getApEut());
            myParameterSourceAry[i].addValue("apEuu", wkDataFeedAirticketPriceE2.getApEuu());
            myParameterSourceAry[i].addValue("apEuv", wkDataFeedAirticketPriceE2.getApEuv());
            myParameterSourceAry[i].addValue("apEuw", wkDataFeedAirticketPriceE2.getApEuw());
            myParameterSourceAry[i].addValue("apEux", wkDataFeedAirticketPriceE2.getApEux());
            myParameterSourceAry[i].addValue("apEuy", wkDataFeedAirticketPriceE2.getApEuy());
            myParameterSourceAry[i].addValue("apEuz", wkDataFeedAirticketPriceE2.getApEuz());
            myParameterSourceAry[i].addValue("apEva", wkDataFeedAirticketPriceE2.getApEva());
            myParameterSourceAry[i].addValue("apEvb", wkDataFeedAirticketPriceE2.getApEvb());
            myParameterSourceAry[i].addValue("apEvc", wkDataFeedAirticketPriceE2.getApEvc());
            myParameterSourceAry[i].addValue("apEvd", wkDataFeedAirticketPriceE2.getApEvd());
            myParameterSourceAry[i].addValue("apEve", wkDataFeedAirticketPriceE2.getApEve());
            myParameterSourceAry[i].addValue("apEvf", wkDataFeedAirticketPriceE2.getApEvf());
            myParameterSourceAry[i].addValue("apEvg", wkDataFeedAirticketPriceE2.getApEvg());
            myParameterSourceAry[i].addValue("apEvh", wkDataFeedAirticketPriceE2.getApEvh());
            myParameterSourceAry[i].addValue("apEvi", wkDataFeedAirticketPriceE2.getApEvi());
            myParameterSourceAry[i].addValue("apEvj", wkDataFeedAirticketPriceE2.getApEvj());
            myParameterSourceAry[i].addValue("apEvk", wkDataFeedAirticketPriceE2.getApEvk());
            myParameterSourceAry[i].addValue("apEvl", wkDataFeedAirticketPriceE2.getApEvl());
            myParameterSourceAry[i].addValue("apEvm", wkDataFeedAirticketPriceE2.getApEvm());
            myParameterSourceAry[i].addValue("apEvn", wkDataFeedAirticketPriceE2.getApEvn());
            myParameterSourceAry[i].addValue("apEvo", wkDataFeedAirticketPriceE2.getApEvo());
            myParameterSourceAry[i].addValue("apEvp", wkDataFeedAirticketPriceE2.getApEvp());
            myParameterSourceAry[i].addValue("apEvq", wkDataFeedAirticketPriceE2.getApEvq());
            myParameterSourceAry[i].addValue("apEvr", wkDataFeedAirticketPriceE2.getApEvr());
            myParameterSourceAry[i].addValue("apEvs", wkDataFeedAirticketPriceE2.getApEvs());
            myParameterSourceAry[i].addValue("apEvt", wkDataFeedAirticketPriceE2.getApEvt());
            myParameterSourceAry[i].addValue("apEvu", wkDataFeedAirticketPriceE2.getApEvu());
            myParameterSourceAry[i].addValue("apEvv", wkDataFeedAirticketPriceE2.getApEvv());
            myParameterSourceAry[i].addValue("apEvw", wkDataFeedAirticketPriceE2.getApEvw());
            myParameterSourceAry[i].addValue("apEvx", wkDataFeedAirticketPriceE2.getApEvx());
            myParameterSourceAry[i].addValue("apEvy", wkDataFeedAirticketPriceE2.getApEvy());
            myParameterSourceAry[i].addValue("apEvz", wkDataFeedAirticketPriceE2.getApEvz());
            myParameterSourceAry[i].addValue("apEwa", wkDataFeedAirticketPriceE2.getApEwa());
            myParameterSourceAry[i].addValue("apEwb", wkDataFeedAirticketPriceE2.getApEwb());
            myParameterSourceAry[i].addValue("apEwc", wkDataFeedAirticketPriceE2.getApEwc());
            myParameterSourceAry[i].addValue("apEwd", wkDataFeedAirticketPriceE2.getApEwd());
            myParameterSourceAry[i].addValue("apEwe", wkDataFeedAirticketPriceE2.getApEwe());
            myParameterSourceAry[i].addValue("apEwf", wkDataFeedAirticketPriceE2.getApEwf());
            myParameterSourceAry[i].addValue("apEwg", wkDataFeedAirticketPriceE2.getApEwg());
            myParameterSourceAry[i].addValue("apEwh", wkDataFeedAirticketPriceE2.getApEwh());
            myParameterSourceAry[i].addValue("apEwi", wkDataFeedAirticketPriceE2.getApEwi());
            myParameterSourceAry[i].addValue("apEwj", wkDataFeedAirticketPriceE2.getApEwj());
            myParameterSourceAry[i].addValue("apEwk", wkDataFeedAirticketPriceE2.getApEwk());
            myParameterSourceAry[i].addValue("apEwl", wkDataFeedAirticketPriceE2.getApEwl());
            myParameterSourceAry[i].addValue("apEwm", wkDataFeedAirticketPriceE2.getApEwm());
            myParameterSourceAry[i].addValue("apEwn", wkDataFeedAirticketPriceE2.getApEwn());
            myParameterSourceAry[i].addValue("apEwo", wkDataFeedAirticketPriceE2.getApEwo());
            myParameterSourceAry[i].addValue("apEwp", wkDataFeedAirticketPriceE2.getApEwp());
            myParameterSourceAry[i].addValue("apEwq", wkDataFeedAirticketPriceE2.getApEwq());
            myParameterSourceAry[i].addValue("apEwr", wkDataFeedAirticketPriceE2.getApEwr());
            myParameterSourceAry[i].addValue("apEws", wkDataFeedAirticketPriceE2.getApEws());
            myParameterSourceAry[i].addValue("apEwt", wkDataFeedAirticketPriceE2.getApEwt());
            myParameterSourceAry[i].addValue("apEwu", wkDataFeedAirticketPriceE2.getApEwu());
            myParameterSourceAry[i].addValue("apEwv", wkDataFeedAirticketPriceE2.getApEwv());
            myParameterSourceAry[i].addValue("apEww", wkDataFeedAirticketPriceE2.getApEww());
            myParameterSourceAry[i].addValue("apEwx", wkDataFeedAirticketPriceE2.getApEwx());
            myParameterSourceAry[i].addValue("apEwy", wkDataFeedAirticketPriceE2.getApEwy());
            myParameterSourceAry[i].addValue("apEwz", wkDataFeedAirticketPriceE2.getApEwz());
            myParameterSourceAry[i].addValue("apExa", wkDataFeedAirticketPriceE2.getApExa());
            myParameterSourceAry[i].addValue("apExb", wkDataFeedAirticketPriceE2.getApExb());
            myParameterSourceAry[i].addValue("apExc", wkDataFeedAirticketPriceE2.getApExc());
            myParameterSourceAry[i].addValue("apExd", wkDataFeedAirticketPriceE2.getApExd());
            myParameterSourceAry[i].addValue("apExe", wkDataFeedAirticketPriceE2.getApExe());
            myParameterSourceAry[i].addValue("apExf", wkDataFeedAirticketPriceE2.getApExf());
            myParameterSourceAry[i].addValue("apExg", wkDataFeedAirticketPriceE2.getApExg());
            myParameterSourceAry[i].addValue("apExh", wkDataFeedAirticketPriceE2.getApExh());
            myParameterSourceAry[i].addValue("apExi", wkDataFeedAirticketPriceE2.getApExi());
            myParameterSourceAry[i].addValue("apExj", wkDataFeedAirticketPriceE2.getApExj());
            myParameterSourceAry[i].addValue("apExk", wkDataFeedAirticketPriceE2.getApExk());
            myParameterSourceAry[i].addValue("apExl", wkDataFeedAirticketPriceE2.getApExl());
            myParameterSourceAry[i].addValue("apExm", wkDataFeedAirticketPriceE2.getApExm());
            myParameterSourceAry[i].addValue("apExn", wkDataFeedAirticketPriceE2.getApExn());
            myParameterSourceAry[i].addValue("apExo", wkDataFeedAirticketPriceE2.getApExo());
            myParameterSourceAry[i].addValue("apExp", wkDataFeedAirticketPriceE2.getApExp());
            myParameterSourceAry[i].addValue("apExq", wkDataFeedAirticketPriceE2.getApExq());
            myParameterSourceAry[i].addValue("apExr", wkDataFeedAirticketPriceE2.getApExr());
            myParameterSourceAry[i].addValue("apExs", wkDataFeedAirticketPriceE2.getApExs());
            myParameterSourceAry[i].addValue("apExt", wkDataFeedAirticketPriceE2.getApExt());
            myParameterSourceAry[i].addValue("apExu", wkDataFeedAirticketPriceE2.getApExu());
            myParameterSourceAry[i].addValue("apExv", wkDataFeedAirticketPriceE2.getApExv());
            myParameterSourceAry[i].addValue("apExw", wkDataFeedAirticketPriceE2.getApExw());
            myParameterSourceAry[i].addValue("apExx", wkDataFeedAirticketPriceE2.getApExx());
            myParameterSourceAry[i].addValue("apExy", wkDataFeedAirticketPriceE2.getApExy());
            myParameterSourceAry[i].addValue("apExz", wkDataFeedAirticketPriceE2.getApExz());
            myParameterSourceAry[i].addValue("apEya", wkDataFeedAirticketPriceE2.getApEya());
            myParameterSourceAry[i].addValue("apEyb", wkDataFeedAirticketPriceE2.getApEyb());
            myParameterSourceAry[i].addValue("apEyc", wkDataFeedAirticketPriceE2.getApEyc());
            myParameterSourceAry[i].addValue("apEyd", wkDataFeedAirticketPriceE2.getApEyd());
            myParameterSourceAry[i].addValue("apEye", wkDataFeedAirticketPriceE2.getApEye());
            myParameterSourceAry[i].addValue("apEyf", wkDataFeedAirticketPriceE2.getApEyf());
            myParameterSourceAry[i].addValue("apEyg", wkDataFeedAirticketPriceE2.getApEyg());
            myParameterSourceAry[i].addValue("apEyh", wkDataFeedAirticketPriceE2.getApEyh());
            myParameterSourceAry[i].addValue("apEyi", wkDataFeedAirticketPriceE2.getApEyi());
            myParameterSourceAry[i].addValue("apEyj", wkDataFeedAirticketPriceE2.getApEyj());
            myParameterSourceAry[i].addValue("apEyk", wkDataFeedAirticketPriceE2.getApEyk());
            myParameterSourceAry[i].addValue("apEyl", wkDataFeedAirticketPriceE2.getApEyl());
            myParameterSourceAry[i].addValue("apEym", wkDataFeedAirticketPriceE2.getApEym());
            myParameterSourceAry[i].addValue("apEyn", wkDataFeedAirticketPriceE2.getApEyn());
            myParameterSourceAry[i].addValue("apEyo", wkDataFeedAirticketPriceE2.getApEyo());
            myParameterSourceAry[i].addValue("apEyp", wkDataFeedAirticketPriceE2.getApEyp());
            myParameterSourceAry[i].addValue("apEyq", wkDataFeedAirticketPriceE2.getApEyq());
            myParameterSourceAry[i].addValue("apEyr", wkDataFeedAirticketPriceE2.getApEyr());
            myParameterSourceAry[i].addValue("apEys", wkDataFeedAirticketPriceE2.getApEys());
            myParameterSourceAry[i].addValue("apEyt", wkDataFeedAirticketPriceE2.getApEyt());
            myParameterSourceAry[i].addValue("apEyu", wkDataFeedAirticketPriceE2.getApEyu());
            myParameterSourceAry[i].addValue("apEyv", wkDataFeedAirticketPriceE2.getApEyv());
            myParameterSourceAry[i].addValue("apEyw", wkDataFeedAirticketPriceE2.getApEyw());
            myParameterSourceAry[i].addValue("apEyx", wkDataFeedAirticketPriceE2.getApEyx());
            myParameterSourceAry[i].addValue("apEyy", wkDataFeedAirticketPriceE2.getApEyy());
            myParameterSourceAry[i].addValue("apEyz", wkDataFeedAirticketPriceE2.getApEyz());
            myParameterSourceAry[i].addValue("apEza", wkDataFeedAirticketPriceE2.getApEza());
            myParameterSourceAry[i].addValue("apEzb", wkDataFeedAirticketPriceE2.getApEzb());
            myParameterSourceAry[i].addValue("apEzc", wkDataFeedAirticketPriceE2.getApEzc());
            myParameterSourceAry[i].addValue("apEzd", wkDataFeedAirticketPriceE2.getApEzd());
            myParameterSourceAry[i].addValue("apEze", wkDataFeedAirticketPriceE2.getApEze());
            myParameterSourceAry[i].addValue("apEzf", wkDataFeedAirticketPriceE2.getApEzf());
            myParameterSourceAry[i].addValue("apEzg", wkDataFeedAirticketPriceE2.getApEzg());
            myParameterSourceAry[i].addValue("apEzh", wkDataFeedAirticketPriceE2.getApEzh());
            myParameterSourceAry[i].addValue("apEzi", wkDataFeedAirticketPriceE2.getApEzi());
            myParameterSourceAry[i].addValue("apEzj", wkDataFeedAirticketPriceE2.getApEzj());
            myParameterSourceAry[i].addValue("apEzk", wkDataFeedAirticketPriceE2.getApEzk());
            myParameterSourceAry[i].addValue("apEzl", wkDataFeedAirticketPriceE2.getApEzl());
            myParameterSourceAry[i].addValue("apEzm", wkDataFeedAirticketPriceE2.getApEzm());
            myParameterSourceAry[i].addValue("apEzn", wkDataFeedAirticketPriceE2.getApEzn());
            myParameterSourceAry[i].addValue("apEzo", wkDataFeedAirticketPriceE2.getApEzo());
            myParameterSourceAry[i].addValue("apEzp", wkDataFeedAirticketPriceE2.getApEzp());
            myParameterSourceAry[i].addValue("apEzq", wkDataFeedAirticketPriceE2.getApEzq());
            myParameterSourceAry[i].addValue("apEzr", wkDataFeedAirticketPriceE2.getApEzr());
            myParameterSourceAry[i].addValue("apEzs", wkDataFeedAirticketPriceE2.getApEzs());
            myParameterSourceAry[i].addValue("apEzt", wkDataFeedAirticketPriceE2.getApEzt());
            myParameterSourceAry[i].addValue("apEzu", wkDataFeedAirticketPriceE2.getApEzu());
            myParameterSourceAry[i].addValue("apEzv", wkDataFeedAirticketPriceE2.getApEzv());
            myParameterSourceAry[i].addValue("apEzw", wkDataFeedAirticketPriceE2.getApEzw());
            myParameterSourceAry[i].addValue("apEzx", wkDataFeedAirticketPriceE2.getApEzx());
            myParameterSourceAry[i].addValue("apEzy", wkDataFeedAirticketPriceE2.getApEzy());
            myParameterSourceAry[i].addValue("apEzz", wkDataFeedAirticketPriceE2.getApEzz());
        }

        namedParameterJdbcTemplate.batchUpdate(mySql, myParameterSourceAry);
    }
}
