package tw.com.colatour.datafeed.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Component;
import tw.com.colatour.datafeed.dao.DataFeedAirticketPriceA2Dao;
import tw.com.colatour.datafeed.model.DataFeedAirticketPriceA2;

import java.util.List;

@Component
public class DataFeedAirticketPriceA2DaoImpl implements DataFeedAirticketPriceA2Dao {

    @Autowired
    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    @Override
    public void createDataFeedAirticketPriceA2s(List<DataFeedAirticketPriceA2> dataFeedAirticketPriceA2List) {
        String mySql = "INSERT INTO data_feed.data_feed_airticket_price_A2 ( " +
                " file_no, price_no, " +
                " ap_ana, ap_anb, ap_anc, ap_and, ap_ane, ap_anf, ap_ang, ap_anh, ap_ani, ap_anj, ap_ank, ap_anl, ap_anm, " +
                " ap_ann, ap_ano, ap_anp, ap_anq, ap_anr, ap_ans, ap_ant, ap_anu, ap_anv, ap_anw, ap_anx, ap_any, ap_anz, " +
                " ap_aoa, ap_aob, ap_aoc, ap_aod, ap_aoe, ap_aof, ap_aog, ap_aoh, ap_aoi, ap_aoj, ap_aok, ap_aol, ap_aom, " +
                " ap_aon, ap_aoo, ap_aop, ap_aoq, ap_aor, ap_aos, ap_aot, ap_aou, ap_aov, ap_aow, ap_aox, ap_aoy, ap_aoz, " +
                " ap_apa, ap_apb, ap_apc, ap_apd, ap_ape, ap_apf, ap_apg, ap_aph, ap_api, ap_apj, ap_apk, ap_apl, ap_apm, " +
                " ap_apn, ap_apo, ap_app, ap_apq, ap_apr, ap_aps, ap_apt, ap_apu, ap_apv, ap_apw, ap_apx, ap_apy, ap_apz, " +
                " ap_aqa, ap_aqb, ap_aqc, ap_aqd, ap_aqe, ap_aqf, ap_aqg, ap_aqh, ap_aqi, ap_aqj, ap_aqk, ap_aql, ap_aqm, " +
                " ap_aqn, ap_aqo, ap_aqp, ap_aqq, ap_aqr, ap_aqs, ap_aqt, ap_aqu, ap_aqv, ap_aqw, ap_aqx, ap_aqy, ap_aqz, " +
                " ap_ara, ap_arb, ap_arc, ap_ard, ap_are, ap_arf, ap_arg, ap_arh, ap_ari, ap_arj, ap_ark, ap_arl, ap_arm, " +
                " ap_arn, ap_aro, ap_arp, ap_arq, ap_arr, ap_ars, ap_art, ap_aru, ap_arv, ap_arw, ap_arx, ap_ary, ap_arz, " +
                " ap_asa, ap_asb, ap_asc, ap_asd, ap_ase, ap_asf, ap_asg, ap_ash, ap_asi, ap_asj, ap_ask, ap_asl, ap_asm, " +
                " ap_asn, ap_aso, ap_asp, ap_asq, ap_asr, ap_ass, ap_ast, ap_asu, ap_asv, ap_asw, ap_asx, ap_asy, ap_asz, " +
                " ap_ata, ap_atb, ap_atc, ap_atd, ap_ate, ap_atf, ap_atg, ap_ath, ap_ati, ap_atj, ap_atk, ap_atl, ap_atm, " +
                " ap_atn, ap_ato, ap_atp, ap_atq, ap_atr, ap_ats, ap_att, ap_atu, ap_atv, ap_atw, ap_atx, ap_aty, ap_atz, " +
                " ap_aua, ap_aub, ap_auc, ap_aud, ap_aue, ap_auf, ap_aug, ap_auh, ap_aui, ap_auj, ap_auk, ap_aul, ap_aum, " +
                " ap_aun, ap_auo, ap_aup, ap_auq, ap_aur, ap_aus, ap_aut, ap_auu, ap_auv, ap_auw, ap_aux, ap_auy, ap_auz, " +
                " ap_ava, ap_avb, ap_avc, ap_avd, ap_ave, ap_avf, ap_avg, ap_avh, ap_avi, ap_avj, ap_avk, ap_avl, ap_avm, " +
                " ap_avn, ap_avo, ap_avp, ap_avq, ap_avr, ap_avs, ap_avt, ap_avu, ap_avv, ap_avw, ap_avx, ap_avy, ap_avz, " +
                " ap_awa, ap_awb, ap_awc, ap_awd, ap_awe, ap_awf, ap_awg, ap_awh, ap_awi, ap_awj, ap_awk, ap_awl, ap_awm, " +
                " ap_awn, ap_awo, ap_awp, ap_awq, ap_awr, ap_aws, ap_awt, ap_awu, ap_awv, ap_aww, ap_awx, ap_awy, ap_awz, " +
                " ap_axa, ap_axb, ap_axc, ap_axd, ap_axe, ap_axf, ap_axg, ap_axh, ap_axi, ap_axj, ap_axk, ap_axl, ap_axm, " +
                " ap_axn, ap_axo, ap_axp, ap_axq, ap_axr, ap_axs, ap_axt, ap_axu, ap_axv, ap_axw, ap_axx, ap_axy, ap_axz, " +
                " ap_aya, ap_ayb, ap_ayc, ap_ayd, ap_aye, ap_ayf, ap_ayg, ap_ayh, ap_ayi, ap_ayj, ap_ayk, ap_ayl, ap_aym, " +
                " ap_ayn, ap_ayo, ap_ayp, ap_ayq, ap_ayr, ap_ays, ap_ayt, ap_ayu, ap_ayv, ap_ayw, ap_ayx, ap_ayy, ap_ayz, " +
                " ap_aza, ap_azb, ap_azc, ap_azd, ap_aze, ap_azf, ap_azg, ap_azh, ap_azi, ap_azj, ap_azk, ap_azl, ap_azm, " +
                " ap_azn, ap_azo, ap_azp, ap_azq, ap_azr, ap_azs, ap_azt, ap_azu, ap_azv, ap_azw, ap_azx, ap_azy, ap_azz ) " +
                " VALUES ( " +
                " :fileNo, :priceNo, " +
                " :apAna, :apAnb, :apAnc, :apAnd, :apAne, :apAnf, :apAng, :apAnh, :apAni, :apAnj, :apAnk, :apAnl, :apAnm, " +
                " :apAnn, :apAno, :apAnp, :apAnq, :apAnr, :apAns, :apAnt, :apAnu, :apAnv, :apAnw, :apAnx, :apAny, :apAnz, " +
                " :apAoa, :apAob, :apAoc, :apAod, :apAoe, :apAof, :apAog, :apAoh, :apAoi, :apAoj, :apAok, :apAol, :apAom, " +
                " :apAon, :apAoo, :apAop, :apAoq, :apAor, :apAos, :apAot, :apAou, :apAov, :apAow, :apAox, :apAoy, :apAoz, " +
                " :apApa, :apApb, :apApc, :apApd, :apApe, :apApf, :apApg, :apAph, :apApi, :apApj, :apApk, :apApl, :apApm, " +
                " :apApn, :apApo, :apApp, :apApq, :apApr, :apAps, :apApt, :apApu, :apApv, :apApw, :apApx, :apApy, :apApz, " +
                " :apAqa, :apAqb, :apAqc, :apAqd, :apAqe, :apAqf, :apAqg, :apAqh, :apAqi, :apAqj, :apAqk, :apAql, :apAqm, " +
                " :apAqn, :apAqo, :apAqp, :apAqq, :apAqr, :apAqs, :apAqt, :apAqu, :apAqv, :apAqw, :apAqx, :apAqy, :apAqz, " +
                " :apAra, :apArb, :apArc, :apArd, :apAre, :apArf, :apArg, :apArh, :apAri, :apArj, :apArk, :apArl, :apArm, " +
                " :apArn, :apAro, :apArp, :apArq, :apArr, :apArs, :apArt, :apAru, :apArv, :apArw, :apArx, :apAry, :apArz, " +
                " :apAsa, :apAsb, :apAsc, :apAsd, :apAse, :apAsf, :apAsg, :apAsh, :apAsi, :apAsj, :apAsk, :apAsl, :apAsm, " +
                " :apAsn, :apAso, :apAsp, :apAsq, :apAsr, :apAss, :apAst, :apAsu, :apAsv, :apAsw, :apAsx, :apAsy, :apAsz, " +
                " :apAta, :apAtb, :apAtc, :apAtd, :apAte, :apAtf, :apAtg, :apAth, :apAti, :apAtj, :apAtk, :apAtl, :apAtm, " +
                " :apAtn, :apAto, :apAtp, :apAtq, :apAtr, :apAts, :apAtt, :apAtu, :apAtv, :apAtw, :apAtx, :apAty, :apAtz, " +
                " :apAua, :apAub, :apAuc, :apAud, :apAue, :apAuf, :apAug, :apAuh, :apAui, :apAuj, :apAuk, :apAul, :apAum, " +
                " :apAun, :apAuo, :apAup, :apAuq, :apAur, :apAus, :apAut, :apAuu, :apAuv, :apAuw, :apAux, :apAuy, :apAuz, " +
                " :apAva, :apAvb, :apAvc, :apAvd, :apAve, :apAvf, :apAvg, :apAvh, :apAvi, :apAvj, :apAvk, :apAvl, :apAvm, " +
                " :apAvn, :apAvo, :apAvp, :apAvq, :apAvr, :apAvs, :apAvt, :apAvu, :apAvv, :apAvw, :apAvx, :apAvy, :apAvz, " +
                " :apAwa, :apAwb, :apAwc, :apAwd, :apAwe, :apAwf, :apAwg, :apAwh, :apAwi, :apAwj, :apAwk, :apAwl, :apAwm, " +
                " :apAwn, :apAwo, :apAwp, :apAwq, :apAwr, :apAws, :apAwt, :apAwu, :apAwv, :apAww, :apAwx, :apAwy, :apAwz, " +
                " :apAxa, :apAxb, :apAxc, :apAxd, :apAxe, :apAxf, :apAxg, :apAxh, :apAxi, :apAxj, :apAxk, :apAxl, :apAxm, " +
                " :apAxn, :apAxo, :apAxp, :apAxq, :apAxr, :apAxs, :apAxt, :apAxu, :apAxv, :apAxw, :apAxx, :apAxy, :apAxz, " +
                " :apAya, :apAyb, :apAyc, :apAyd, :apAye, :apAyf, :apAyg, :apAyh, :apAyi, :apAyj, :apAyk, :apAyl, :apAym, " +
                " :apAyn, :apAyo, :apAyp, :apAyq, :apAyr, :apAys, :apAyt, :apAyu, :apAyv, :apAyw, :apAyx, :apAyy, :apAyz, " +
                " :apAza, :apAzb, :apAzc, :apAzd, :apAze, :apAzf, :apAzg, :apAzh, :apAzi, :apAzj, :apAzk, :apAzl, :apAzm, " +
                " :apAzn, :apAzo, :apAzp, :apAzq, :apAzr, :apAzs, :apAzt, :apAzu, :apAzv, :apAzw, :apAzx, :apAzy, :apAzz ) ";

        MapSqlParameterSource[] myParameterSourceAry = new MapSqlParameterSource[dataFeedAirticketPriceA2List.size()];

        for (int i = 0; i < dataFeedAirticketPriceA2List.size(); i++) {
            DataFeedAirticketPriceA2 wkDataFeedAirticketPriceA2 = dataFeedAirticketPriceA2List.get(i);

            myParameterSourceAry[i] = new MapSqlParameterSource();

            myParameterSourceAry[i].addValue("fileNo", wkDataFeedAirticketPriceA2.getFileNo());
            myParameterSourceAry[i].addValue("priceNo", wkDataFeedAirticketPriceA2.getPriceNo());
            myParameterSourceAry[i].addValue("apAna", wkDataFeedAirticketPriceA2.getApAna());
            myParameterSourceAry[i].addValue("apAnb", wkDataFeedAirticketPriceA2.getApAnb());
            myParameterSourceAry[i].addValue("apAnc", wkDataFeedAirticketPriceA2.getApAnc());
            myParameterSourceAry[i].addValue("apAnd", wkDataFeedAirticketPriceA2.getApAnd());
            myParameterSourceAry[i].addValue("apAne", wkDataFeedAirticketPriceA2.getApAne());
            myParameterSourceAry[i].addValue("apAnf", wkDataFeedAirticketPriceA2.getApAnf());
            myParameterSourceAry[i].addValue("apAng", wkDataFeedAirticketPriceA2.getApAng());
            myParameterSourceAry[i].addValue("apAnh", wkDataFeedAirticketPriceA2.getApAnh());
            myParameterSourceAry[i].addValue("apAni", wkDataFeedAirticketPriceA2.getApAni());
            myParameterSourceAry[i].addValue("apAnj", wkDataFeedAirticketPriceA2.getApAnj());
            myParameterSourceAry[i].addValue("apAnk", wkDataFeedAirticketPriceA2.getApAnk());
            myParameterSourceAry[i].addValue("apAnl", wkDataFeedAirticketPriceA2.getApAnl());
            myParameterSourceAry[i].addValue("apAnm", wkDataFeedAirticketPriceA2.getApAnm());
            myParameterSourceAry[i].addValue("apAnn", wkDataFeedAirticketPriceA2.getApAnn());
            myParameterSourceAry[i].addValue("apAno", wkDataFeedAirticketPriceA2.getApAno());
            myParameterSourceAry[i].addValue("apAnp", wkDataFeedAirticketPriceA2.getApAnp());
            myParameterSourceAry[i].addValue("apAnq", wkDataFeedAirticketPriceA2.getApAnq());
            myParameterSourceAry[i].addValue("apAnr", wkDataFeedAirticketPriceA2.getApAnr());
            myParameterSourceAry[i].addValue("apAns", wkDataFeedAirticketPriceA2.getApAns());
            myParameterSourceAry[i].addValue("apAnt", wkDataFeedAirticketPriceA2.getApAnt());
            myParameterSourceAry[i].addValue("apAnu", wkDataFeedAirticketPriceA2.getApAnu());
            myParameterSourceAry[i].addValue("apAnv", wkDataFeedAirticketPriceA2.getApAnv());
            myParameterSourceAry[i].addValue("apAnw", wkDataFeedAirticketPriceA2.getApAnw());
            myParameterSourceAry[i].addValue("apAnx", wkDataFeedAirticketPriceA2.getApAnx());
            myParameterSourceAry[i].addValue("apAny", wkDataFeedAirticketPriceA2.getApAny());
            myParameterSourceAry[i].addValue("apAnz", wkDataFeedAirticketPriceA2.getApAnz());
            myParameterSourceAry[i].addValue("apAoa", wkDataFeedAirticketPriceA2.getApAoa());
            myParameterSourceAry[i].addValue("apAob", wkDataFeedAirticketPriceA2.getApAob());
            myParameterSourceAry[i].addValue("apAoc", wkDataFeedAirticketPriceA2.getApAoc());
            myParameterSourceAry[i].addValue("apAod", wkDataFeedAirticketPriceA2.getApAod());
            myParameterSourceAry[i].addValue("apAoe", wkDataFeedAirticketPriceA2.getApAoe());
            myParameterSourceAry[i].addValue("apAof", wkDataFeedAirticketPriceA2.getApAof());
            myParameterSourceAry[i].addValue("apAog", wkDataFeedAirticketPriceA2.getApAog());
            myParameterSourceAry[i].addValue("apAoh", wkDataFeedAirticketPriceA2.getApAoh());
            myParameterSourceAry[i].addValue("apAoi", wkDataFeedAirticketPriceA2.getApAoi());
            myParameterSourceAry[i].addValue("apAoj", wkDataFeedAirticketPriceA2.getApAoj());
            myParameterSourceAry[i].addValue("apAok", wkDataFeedAirticketPriceA2.getApAok());
            myParameterSourceAry[i].addValue("apAol", wkDataFeedAirticketPriceA2.getApAol());
            myParameterSourceAry[i].addValue("apAom", wkDataFeedAirticketPriceA2.getApAom());
            myParameterSourceAry[i].addValue("apAon", wkDataFeedAirticketPriceA2.getApAon());
            myParameterSourceAry[i].addValue("apAoo", wkDataFeedAirticketPriceA2.getApAoo());
            myParameterSourceAry[i].addValue("apAop", wkDataFeedAirticketPriceA2.getApAop());
            myParameterSourceAry[i].addValue("apAoq", wkDataFeedAirticketPriceA2.getApAoq());
            myParameterSourceAry[i].addValue("apAor", wkDataFeedAirticketPriceA2.getApAor());
            myParameterSourceAry[i].addValue("apAos", wkDataFeedAirticketPriceA2.getApAos());
            myParameterSourceAry[i].addValue("apAot", wkDataFeedAirticketPriceA2.getApAot());
            myParameterSourceAry[i].addValue("apAou", wkDataFeedAirticketPriceA2.getApAou());
            myParameterSourceAry[i].addValue("apAov", wkDataFeedAirticketPriceA2.getApAov());
            myParameterSourceAry[i].addValue("apAow", wkDataFeedAirticketPriceA2.getApAow());
            myParameterSourceAry[i].addValue("apAox", wkDataFeedAirticketPriceA2.getApAox());
            myParameterSourceAry[i].addValue("apAoy", wkDataFeedAirticketPriceA2.getApAoy());
            myParameterSourceAry[i].addValue("apAoz", wkDataFeedAirticketPriceA2.getApAoz());
            myParameterSourceAry[i].addValue("apApa", wkDataFeedAirticketPriceA2.getApApa());
            myParameterSourceAry[i].addValue("apApb", wkDataFeedAirticketPriceA2.getApApb());
            myParameterSourceAry[i].addValue("apApc", wkDataFeedAirticketPriceA2.getApApc());
            myParameterSourceAry[i].addValue("apApd", wkDataFeedAirticketPriceA2.getApApd());
            myParameterSourceAry[i].addValue("apApe", wkDataFeedAirticketPriceA2.getApApe());
            myParameterSourceAry[i].addValue("apApf", wkDataFeedAirticketPriceA2.getApApf());
            myParameterSourceAry[i].addValue("apApg", wkDataFeedAirticketPriceA2.getApApg());
            myParameterSourceAry[i].addValue("apAph", wkDataFeedAirticketPriceA2.getApAph());
            myParameterSourceAry[i].addValue("apApi", wkDataFeedAirticketPriceA2.getApApi());
            myParameterSourceAry[i].addValue("apApj", wkDataFeedAirticketPriceA2.getApApj());
            myParameterSourceAry[i].addValue("apApk", wkDataFeedAirticketPriceA2.getApApk());
            myParameterSourceAry[i].addValue("apApl", wkDataFeedAirticketPriceA2.getApApl());
            myParameterSourceAry[i].addValue("apApm", wkDataFeedAirticketPriceA2.getApApm());
            myParameterSourceAry[i].addValue("apApn", wkDataFeedAirticketPriceA2.getApApn());
            myParameterSourceAry[i].addValue("apApo", wkDataFeedAirticketPriceA2.getApApo());
            myParameterSourceAry[i].addValue("apApp", wkDataFeedAirticketPriceA2.getApApp());
            myParameterSourceAry[i].addValue("apApq", wkDataFeedAirticketPriceA2.getApApq());
            myParameterSourceAry[i].addValue("apApr", wkDataFeedAirticketPriceA2.getApApr());
            myParameterSourceAry[i].addValue("apAps", wkDataFeedAirticketPriceA2.getApAps());
            myParameterSourceAry[i].addValue("apApt", wkDataFeedAirticketPriceA2.getApApt());
            myParameterSourceAry[i].addValue("apApu", wkDataFeedAirticketPriceA2.getApApu());
            myParameterSourceAry[i].addValue("apApv", wkDataFeedAirticketPriceA2.getApApv());
            myParameterSourceAry[i].addValue("apApw", wkDataFeedAirticketPriceA2.getApApw());
            myParameterSourceAry[i].addValue("apApx", wkDataFeedAirticketPriceA2.getApApx());
            myParameterSourceAry[i].addValue("apApy", wkDataFeedAirticketPriceA2.getApApy());
            myParameterSourceAry[i].addValue("apApz", wkDataFeedAirticketPriceA2.getApApz());
            myParameterSourceAry[i].addValue("apAqa", wkDataFeedAirticketPriceA2.getApAqa());
            myParameterSourceAry[i].addValue("apAqb", wkDataFeedAirticketPriceA2.getApAqb());
            myParameterSourceAry[i].addValue("apAqc", wkDataFeedAirticketPriceA2.getApAqc());
            myParameterSourceAry[i].addValue("apAqd", wkDataFeedAirticketPriceA2.getApAqd());
            myParameterSourceAry[i].addValue("apAqe", wkDataFeedAirticketPriceA2.getApAqe());
            myParameterSourceAry[i].addValue("apAqf", wkDataFeedAirticketPriceA2.getApAqf());
            myParameterSourceAry[i].addValue("apAqg", wkDataFeedAirticketPriceA2.getApAqg());
            myParameterSourceAry[i].addValue("apAqh", wkDataFeedAirticketPriceA2.getApAqh());
            myParameterSourceAry[i].addValue("apAqi", wkDataFeedAirticketPriceA2.getApAqi());
            myParameterSourceAry[i].addValue("apAqj", wkDataFeedAirticketPriceA2.getApAqj());
            myParameterSourceAry[i].addValue("apAqk", wkDataFeedAirticketPriceA2.getApAqk());
            myParameterSourceAry[i].addValue("apAql", wkDataFeedAirticketPriceA2.getApAql());
            myParameterSourceAry[i].addValue("apAqm", wkDataFeedAirticketPriceA2.getApAqm());
            myParameterSourceAry[i].addValue("apAqn", wkDataFeedAirticketPriceA2.getApAqn());
            myParameterSourceAry[i].addValue("apAqo", wkDataFeedAirticketPriceA2.getApAqo());
            myParameterSourceAry[i].addValue("apAqp", wkDataFeedAirticketPriceA2.getApAqp());
            myParameterSourceAry[i].addValue("apAqq", wkDataFeedAirticketPriceA2.getApAqq());
            myParameterSourceAry[i].addValue("apAqr", wkDataFeedAirticketPriceA2.getApAqr());
            myParameterSourceAry[i].addValue("apAqs", wkDataFeedAirticketPriceA2.getApAqs());
            myParameterSourceAry[i].addValue("apAqt", wkDataFeedAirticketPriceA2.getApAqt());
            myParameterSourceAry[i].addValue("apAqu", wkDataFeedAirticketPriceA2.getApAqu());
            myParameterSourceAry[i].addValue("apAqv", wkDataFeedAirticketPriceA2.getApAqv());
            myParameterSourceAry[i].addValue("apAqw", wkDataFeedAirticketPriceA2.getApAqw());
            myParameterSourceAry[i].addValue("apAqx", wkDataFeedAirticketPriceA2.getApAqx());
            myParameterSourceAry[i].addValue("apAqy", wkDataFeedAirticketPriceA2.getApAqy());
            myParameterSourceAry[i].addValue("apAqz", wkDataFeedAirticketPriceA2.getApAqz());
            myParameterSourceAry[i].addValue("apAra", wkDataFeedAirticketPriceA2.getApAra());
            myParameterSourceAry[i].addValue("apArb", wkDataFeedAirticketPriceA2.getApArb());
            myParameterSourceAry[i].addValue("apArc", wkDataFeedAirticketPriceA2.getApArc());
            myParameterSourceAry[i].addValue("apArd", wkDataFeedAirticketPriceA2.getApArd());
            myParameterSourceAry[i].addValue("apAre", wkDataFeedAirticketPriceA2.getApAre());
            myParameterSourceAry[i].addValue("apArf", wkDataFeedAirticketPriceA2.getApArf());
            myParameterSourceAry[i].addValue("apArg", wkDataFeedAirticketPriceA2.getApArg());
            myParameterSourceAry[i].addValue("apArh", wkDataFeedAirticketPriceA2.getApArh());
            myParameterSourceAry[i].addValue("apAri", wkDataFeedAirticketPriceA2.getApAri());
            myParameterSourceAry[i].addValue("apArj", wkDataFeedAirticketPriceA2.getApArj());
            myParameterSourceAry[i].addValue("apArk", wkDataFeedAirticketPriceA2.getApArk());
            myParameterSourceAry[i].addValue("apArl", wkDataFeedAirticketPriceA2.getApArl());
            myParameterSourceAry[i].addValue("apArm", wkDataFeedAirticketPriceA2.getApArm());
            myParameterSourceAry[i].addValue("apArn", wkDataFeedAirticketPriceA2.getApArn());
            myParameterSourceAry[i].addValue("apAro", wkDataFeedAirticketPriceA2.getApAro());
            myParameterSourceAry[i].addValue("apArp", wkDataFeedAirticketPriceA2.getApArp());
            myParameterSourceAry[i].addValue("apArq", wkDataFeedAirticketPriceA2.getApArq());
            myParameterSourceAry[i].addValue("apArr", wkDataFeedAirticketPriceA2.getApArr());
            myParameterSourceAry[i].addValue("apArs", wkDataFeedAirticketPriceA2.getApArs());
            myParameterSourceAry[i].addValue("apArt", wkDataFeedAirticketPriceA2.getApArt());
            myParameterSourceAry[i].addValue("apAru", wkDataFeedAirticketPriceA2.getApAru());
            myParameterSourceAry[i].addValue("apArv", wkDataFeedAirticketPriceA2.getApArv());
            myParameterSourceAry[i].addValue("apArw", wkDataFeedAirticketPriceA2.getApArw());
            myParameterSourceAry[i].addValue("apArx", wkDataFeedAirticketPriceA2.getApArx());
            myParameterSourceAry[i].addValue("apAry", wkDataFeedAirticketPriceA2.getApAry());
            myParameterSourceAry[i].addValue("apArz", wkDataFeedAirticketPriceA2.getApArz());
            myParameterSourceAry[i].addValue("apAsa", wkDataFeedAirticketPriceA2.getApAsa());
            myParameterSourceAry[i].addValue("apAsb", wkDataFeedAirticketPriceA2.getApAsb());
            myParameterSourceAry[i].addValue("apAsc", wkDataFeedAirticketPriceA2.getApAsc());
            myParameterSourceAry[i].addValue("apAsd", wkDataFeedAirticketPriceA2.getApAsd());
            myParameterSourceAry[i].addValue("apAse", wkDataFeedAirticketPriceA2.getApAse());
            myParameterSourceAry[i].addValue("apAsf", wkDataFeedAirticketPriceA2.getApAsf());
            myParameterSourceAry[i].addValue("apAsg", wkDataFeedAirticketPriceA2.getApAsg());
            myParameterSourceAry[i].addValue("apAsh", wkDataFeedAirticketPriceA2.getApAsh());
            myParameterSourceAry[i].addValue("apAsi", wkDataFeedAirticketPriceA2.getApAsi());
            myParameterSourceAry[i].addValue("apAsj", wkDataFeedAirticketPriceA2.getApAsj());
            myParameterSourceAry[i].addValue("apAsk", wkDataFeedAirticketPriceA2.getApAsk());
            myParameterSourceAry[i].addValue("apAsl", wkDataFeedAirticketPriceA2.getApAsl());
            myParameterSourceAry[i].addValue("apAsm", wkDataFeedAirticketPriceA2.getApAsm());
            myParameterSourceAry[i].addValue("apAsn", wkDataFeedAirticketPriceA2.getApAsn());
            myParameterSourceAry[i].addValue("apAso", wkDataFeedAirticketPriceA2.getApAso());
            myParameterSourceAry[i].addValue("apAsp", wkDataFeedAirticketPriceA2.getApAsp());
            myParameterSourceAry[i].addValue("apAsq", wkDataFeedAirticketPriceA2.getApAsq());
            myParameterSourceAry[i].addValue("apAsr", wkDataFeedAirticketPriceA2.getApAsr());
            myParameterSourceAry[i].addValue("apAss", wkDataFeedAirticketPriceA2.getApAss());
            myParameterSourceAry[i].addValue("apAst", wkDataFeedAirticketPriceA2.getApAst());
            myParameterSourceAry[i].addValue("apAsu", wkDataFeedAirticketPriceA2.getApAsu());
            myParameterSourceAry[i].addValue("apAsv", wkDataFeedAirticketPriceA2.getApAsv());
            myParameterSourceAry[i].addValue("apAsw", wkDataFeedAirticketPriceA2.getApAsw());
            myParameterSourceAry[i].addValue("apAsx", wkDataFeedAirticketPriceA2.getApAsx());
            myParameterSourceAry[i].addValue("apAsy", wkDataFeedAirticketPriceA2.getApAsy());
            myParameterSourceAry[i].addValue("apAsz", wkDataFeedAirticketPriceA2.getApAsz());
            myParameterSourceAry[i].addValue("apAta", wkDataFeedAirticketPriceA2.getApAta());
            myParameterSourceAry[i].addValue("apAtb", wkDataFeedAirticketPriceA2.getApAtb());
            myParameterSourceAry[i].addValue("apAtc", wkDataFeedAirticketPriceA2.getApAtc());
            myParameterSourceAry[i].addValue("apAtd", wkDataFeedAirticketPriceA2.getApAtd());
            myParameterSourceAry[i].addValue("apAte", wkDataFeedAirticketPriceA2.getApAte());
            myParameterSourceAry[i].addValue("apAtf", wkDataFeedAirticketPriceA2.getApAtf());
            myParameterSourceAry[i].addValue("apAtg", wkDataFeedAirticketPriceA2.getApAtg());
            myParameterSourceAry[i].addValue("apAth", wkDataFeedAirticketPriceA2.getApAth());
            myParameterSourceAry[i].addValue("apAti", wkDataFeedAirticketPriceA2.getApAti());
            myParameterSourceAry[i].addValue("apAtj", wkDataFeedAirticketPriceA2.getApAtj());
            myParameterSourceAry[i].addValue("apAtk", wkDataFeedAirticketPriceA2.getApAtk());
            myParameterSourceAry[i].addValue("apAtl", wkDataFeedAirticketPriceA2.getApAtl());
            myParameterSourceAry[i].addValue("apAtm", wkDataFeedAirticketPriceA2.getApAtm());
            myParameterSourceAry[i].addValue("apAtn", wkDataFeedAirticketPriceA2.getApAtn());
            myParameterSourceAry[i].addValue("apAto", wkDataFeedAirticketPriceA2.getApAto());
            myParameterSourceAry[i].addValue("apAtp", wkDataFeedAirticketPriceA2.getApAtp());
            myParameterSourceAry[i].addValue("apAtq", wkDataFeedAirticketPriceA2.getApAtq());
            myParameterSourceAry[i].addValue("apAtr", wkDataFeedAirticketPriceA2.getApAtr());
            myParameterSourceAry[i].addValue("apAts", wkDataFeedAirticketPriceA2.getApAts());
            myParameterSourceAry[i].addValue("apAtt", wkDataFeedAirticketPriceA2.getApAtt());
            myParameterSourceAry[i].addValue("apAtu", wkDataFeedAirticketPriceA2.getApAtu());
            myParameterSourceAry[i].addValue("apAtv", wkDataFeedAirticketPriceA2.getApAtv());
            myParameterSourceAry[i].addValue("apAtw", wkDataFeedAirticketPriceA2.getApAtw());
            myParameterSourceAry[i].addValue("apAtx", wkDataFeedAirticketPriceA2.getApAtx());
            myParameterSourceAry[i].addValue("apAty", wkDataFeedAirticketPriceA2.getApAty());
            myParameterSourceAry[i].addValue("apAtz", wkDataFeedAirticketPriceA2.getApAtz());
            myParameterSourceAry[i].addValue("apAua", wkDataFeedAirticketPriceA2.getApAua());
            myParameterSourceAry[i].addValue("apAub", wkDataFeedAirticketPriceA2.getApAub());
            myParameterSourceAry[i].addValue("apAuc", wkDataFeedAirticketPriceA2.getApAuc());
            myParameterSourceAry[i].addValue("apAud", wkDataFeedAirticketPriceA2.getApAud());
            myParameterSourceAry[i].addValue("apAue", wkDataFeedAirticketPriceA2.getApAue());
            myParameterSourceAry[i].addValue("apAuf", wkDataFeedAirticketPriceA2.getApAuf());
            myParameterSourceAry[i].addValue("apAug", wkDataFeedAirticketPriceA2.getApAug());
            myParameterSourceAry[i].addValue("apAuh", wkDataFeedAirticketPriceA2.getApAuh());
            myParameterSourceAry[i].addValue("apAui", wkDataFeedAirticketPriceA2.getApAui());
            myParameterSourceAry[i].addValue("apAuj", wkDataFeedAirticketPriceA2.getApAuj());
            myParameterSourceAry[i].addValue("apAuk", wkDataFeedAirticketPriceA2.getApAuk());
            myParameterSourceAry[i].addValue("apAul", wkDataFeedAirticketPriceA2.getApAul());
            myParameterSourceAry[i].addValue("apAum", wkDataFeedAirticketPriceA2.getApAum());
            myParameterSourceAry[i].addValue("apAun", wkDataFeedAirticketPriceA2.getApAun());
            myParameterSourceAry[i].addValue("apAuo", wkDataFeedAirticketPriceA2.getApAuo());
            myParameterSourceAry[i].addValue("apAup", wkDataFeedAirticketPriceA2.getApAup());
            myParameterSourceAry[i].addValue("apAuq", wkDataFeedAirticketPriceA2.getApAuq());
            myParameterSourceAry[i].addValue("apAur", wkDataFeedAirticketPriceA2.getApAur());
            myParameterSourceAry[i].addValue("apAus", wkDataFeedAirticketPriceA2.getApAus());
            myParameterSourceAry[i].addValue("apAut", wkDataFeedAirticketPriceA2.getApAut());
            myParameterSourceAry[i].addValue("apAuu", wkDataFeedAirticketPriceA2.getApAuu());
            myParameterSourceAry[i].addValue("apAuv", wkDataFeedAirticketPriceA2.getApAuv());
            myParameterSourceAry[i].addValue("apAuw", wkDataFeedAirticketPriceA2.getApAuw());
            myParameterSourceAry[i].addValue("apAux", wkDataFeedAirticketPriceA2.getApAux());
            myParameterSourceAry[i].addValue("apAuy", wkDataFeedAirticketPriceA2.getApAuy());
            myParameterSourceAry[i].addValue("apAuz", wkDataFeedAirticketPriceA2.getApAuz());
            myParameterSourceAry[i].addValue("apAva", wkDataFeedAirticketPriceA2.getApAva());
            myParameterSourceAry[i].addValue("apAvb", wkDataFeedAirticketPriceA2.getApAvb());
            myParameterSourceAry[i].addValue("apAvc", wkDataFeedAirticketPriceA2.getApAvc());
            myParameterSourceAry[i].addValue("apAvd", wkDataFeedAirticketPriceA2.getApAvd());
            myParameterSourceAry[i].addValue("apAve", wkDataFeedAirticketPriceA2.getApAve());
            myParameterSourceAry[i].addValue("apAvf", wkDataFeedAirticketPriceA2.getApAvf());
            myParameterSourceAry[i].addValue("apAvg", wkDataFeedAirticketPriceA2.getApAvg());
            myParameterSourceAry[i].addValue("apAvh", wkDataFeedAirticketPriceA2.getApAvh());
            myParameterSourceAry[i].addValue("apAvi", wkDataFeedAirticketPriceA2.getApAvi());
            myParameterSourceAry[i].addValue("apAvj", wkDataFeedAirticketPriceA2.getApAvj());
            myParameterSourceAry[i].addValue("apAvk", wkDataFeedAirticketPriceA2.getApAvk());
            myParameterSourceAry[i].addValue("apAvl", wkDataFeedAirticketPriceA2.getApAvl());
            myParameterSourceAry[i].addValue("apAvm", wkDataFeedAirticketPriceA2.getApAvm());
            myParameterSourceAry[i].addValue("apAvn", wkDataFeedAirticketPriceA2.getApAvn());
            myParameterSourceAry[i].addValue("apAvo", wkDataFeedAirticketPriceA2.getApAvo());
            myParameterSourceAry[i].addValue("apAvp", wkDataFeedAirticketPriceA2.getApAvp());
            myParameterSourceAry[i].addValue("apAvq", wkDataFeedAirticketPriceA2.getApAvq());
            myParameterSourceAry[i].addValue("apAvr", wkDataFeedAirticketPriceA2.getApAvr());
            myParameterSourceAry[i].addValue("apAvs", wkDataFeedAirticketPriceA2.getApAvs());
            myParameterSourceAry[i].addValue("apAvt", wkDataFeedAirticketPriceA2.getApAvt());
            myParameterSourceAry[i].addValue("apAvu", wkDataFeedAirticketPriceA2.getApAvu());
            myParameterSourceAry[i].addValue("apAvv", wkDataFeedAirticketPriceA2.getApAvv());
            myParameterSourceAry[i].addValue("apAvw", wkDataFeedAirticketPriceA2.getApAvw());
            myParameterSourceAry[i].addValue("apAvx", wkDataFeedAirticketPriceA2.getApAvx());
            myParameterSourceAry[i].addValue("apAvy", wkDataFeedAirticketPriceA2.getApAvy());
            myParameterSourceAry[i].addValue("apAvz", wkDataFeedAirticketPriceA2.getApAvz());
            myParameterSourceAry[i].addValue("apAwa", wkDataFeedAirticketPriceA2.getApAwa());
            myParameterSourceAry[i].addValue("apAwb", wkDataFeedAirticketPriceA2.getApAwb());
            myParameterSourceAry[i].addValue("apAwc", wkDataFeedAirticketPriceA2.getApAwc());
            myParameterSourceAry[i].addValue("apAwd", wkDataFeedAirticketPriceA2.getApAwd());
            myParameterSourceAry[i].addValue("apAwe", wkDataFeedAirticketPriceA2.getApAwe());
            myParameterSourceAry[i].addValue("apAwf", wkDataFeedAirticketPriceA2.getApAwf());
            myParameterSourceAry[i].addValue("apAwg", wkDataFeedAirticketPriceA2.getApAwg());
            myParameterSourceAry[i].addValue("apAwh", wkDataFeedAirticketPriceA2.getApAwh());
            myParameterSourceAry[i].addValue("apAwi", wkDataFeedAirticketPriceA2.getApAwi());
            myParameterSourceAry[i].addValue("apAwj", wkDataFeedAirticketPriceA2.getApAwj());
            myParameterSourceAry[i].addValue("apAwk", wkDataFeedAirticketPriceA2.getApAwk());
            myParameterSourceAry[i].addValue("apAwl", wkDataFeedAirticketPriceA2.getApAwl());
            myParameterSourceAry[i].addValue("apAwm", wkDataFeedAirticketPriceA2.getApAwm());
            myParameterSourceAry[i].addValue("apAwn", wkDataFeedAirticketPriceA2.getApAwn());
            myParameterSourceAry[i].addValue("apAwo", wkDataFeedAirticketPriceA2.getApAwo());
            myParameterSourceAry[i].addValue("apAwp", wkDataFeedAirticketPriceA2.getApAwp());
            myParameterSourceAry[i].addValue("apAwq", wkDataFeedAirticketPriceA2.getApAwq());
            myParameterSourceAry[i].addValue("apAwr", wkDataFeedAirticketPriceA2.getApAwr());
            myParameterSourceAry[i].addValue("apAws", wkDataFeedAirticketPriceA2.getApAws());
            myParameterSourceAry[i].addValue("apAwt", wkDataFeedAirticketPriceA2.getApAwt());
            myParameterSourceAry[i].addValue("apAwu", wkDataFeedAirticketPriceA2.getApAwu());
            myParameterSourceAry[i].addValue("apAwv", wkDataFeedAirticketPriceA2.getApAwv());
            myParameterSourceAry[i].addValue("apAww", wkDataFeedAirticketPriceA2.getApAww());
            myParameterSourceAry[i].addValue("apAwx", wkDataFeedAirticketPriceA2.getApAwx());
            myParameterSourceAry[i].addValue("apAwy", wkDataFeedAirticketPriceA2.getApAwy());
            myParameterSourceAry[i].addValue("apAwz", wkDataFeedAirticketPriceA2.getApAwz());
            myParameterSourceAry[i].addValue("apAxa", wkDataFeedAirticketPriceA2.getApAxa());
            myParameterSourceAry[i].addValue("apAxb", wkDataFeedAirticketPriceA2.getApAxb());
            myParameterSourceAry[i].addValue("apAxc", wkDataFeedAirticketPriceA2.getApAxc());
            myParameterSourceAry[i].addValue("apAxd", wkDataFeedAirticketPriceA2.getApAxd());
            myParameterSourceAry[i].addValue("apAxe", wkDataFeedAirticketPriceA2.getApAxe());
            myParameterSourceAry[i].addValue("apAxf", wkDataFeedAirticketPriceA2.getApAxf());
            myParameterSourceAry[i].addValue("apAxg", wkDataFeedAirticketPriceA2.getApAxg());
            myParameterSourceAry[i].addValue("apAxh", wkDataFeedAirticketPriceA2.getApAxh());
            myParameterSourceAry[i].addValue("apAxi", wkDataFeedAirticketPriceA2.getApAxi());
            myParameterSourceAry[i].addValue("apAxj", wkDataFeedAirticketPriceA2.getApAxj());
            myParameterSourceAry[i].addValue("apAxk", wkDataFeedAirticketPriceA2.getApAxk());
            myParameterSourceAry[i].addValue("apAxl", wkDataFeedAirticketPriceA2.getApAxl());
            myParameterSourceAry[i].addValue("apAxm", wkDataFeedAirticketPriceA2.getApAxm());
            myParameterSourceAry[i].addValue("apAxn", wkDataFeedAirticketPriceA2.getApAxn());
            myParameterSourceAry[i].addValue("apAxo", wkDataFeedAirticketPriceA2.getApAxo());
            myParameterSourceAry[i].addValue("apAxp", wkDataFeedAirticketPriceA2.getApAxp());
            myParameterSourceAry[i].addValue("apAxq", wkDataFeedAirticketPriceA2.getApAxq());
            myParameterSourceAry[i].addValue("apAxr", wkDataFeedAirticketPriceA2.getApAxr());
            myParameterSourceAry[i].addValue("apAxs", wkDataFeedAirticketPriceA2.getApAxs());
            myParameterSourceAry[i].addValue("apAxt", wkDataFeedAirticketPriceA2.getApAxt());
            myParameterSourceAry[i].addValue("apAxu", wkDataFeedAirticketPriceA2.getApAxu());
            myParameterSourceAry[i].addValue("apAxv", wkDataFeedAirticketPriceA2.getApAxv());
            myParameterSourceAry[i].addValue("apAxw", wkDataFeedAirticketPriceA2.getApAxw());
            myParameterSourceAry[i].addValue("apAxx", wkDataFeedAirticketPriceA2.getApAxx());
            myParameterSourceAry[i].addValue("apAxy", wkDataFeedAirticketPriceA2.getApAxy());
            myParameterSourceAry[i].addValue("apAxz", wkDataFeedAirticketPriceA2.getApAxz());
            myParameterSourceAry[i].addValue("apAya", wkDataFeedAirticketPriceA2.getApAya());
            myParameterSourceAry[i].addValue("apAyb", wkDataFeedAirticketPriceA2.getApAyb());
            myParameterSourceAry[i].addValue("apAyc", wkDataFeedAirticketPriceA2.getApAyc());
            myParameterSourceAry[i].addValue("apAyd", wkDataFeedAirticketPriceA2.getApAyd());
            myParameterSourceAry[i].addValue("apAye", wkDataFeedAirticketPriceA2.getApAye());
            myParameterSourceAry[i].addValue("apAyf", wkDataFeedAirticketPriceA2.getApAyf());
            myParameterSourceAry[i].addValue("apAyg", wkDataFeedAirticketPriceA2.getApAyg());
            myParameterSourceAry[i].addValue("apAyh", wkDataFeedAirticketPriceA2.getApAyh());
            myParameterSourceAry[i].addValue("apAyi", wkDataFeedAirticketPriceA2.getApAyi());
            myParameterSourceAry[i].addValue("apAyj", wkDataFeedAirticketPriceA2.getApAyj());
            myParameterSourceAry[i].addValue("apAyk", wkDataFeedAirticketPriceA2.getApAyk());
            myParameterSourceAry[i].addValue("apAyl", wkDataFeedAirticketPriceA2.getApAyl());
            myParameterSourceAry[i].addValue("apAym", wkDataFeedAirticketPriceA2.getApAym());
            myParameterSourceAry[i].addValue("apAyn", wkDataFeedAirticketPriceA2.getApAyn());
            myParameterSourceAry[i].addValue("apAyo", wkDataFeedAirticketPriceA2.getApAyo());
            myParameterSourceAry[i].addValue("apAyp", wkDataFeedAirticketPriceA2.getApAyp());
            myParameterSourceAry[i].addValue("apAyq", wkDataFeedAirticketPriceA2.getApAyq());
            myParameterSourceAry[i].addValue("apAyr", wkDataFeedAirticketPriceA2.getApAyr());
            myParameterSourceAry[i].addValue("apAys", wkDataFeedAirticketPriceA2.getApAys());
            myParameterSourceAry[i].addValue("apAyt", wkDataFeedAirticketPriceA2.getApAyt());
            myParameterSourceAry[i].addValue("apAyu", wkDataFeedAirticketPriceA2.getApAyu());
            myParameterSourceAry[i].addValue("apAyv", wkDataFeedAirticketPriceA2.getApAyv());
            myParameterSourceAry[i].addValue("apAyw", wkDataFeedAirticketPriceA2.getApAyw());
            myParameterSourceAry[i].addValue("apAyx", wkDataFeedAirticketPriceA2.getApAyx());
            myParameterSourceAry[i].addValue("apAyy", wkDataFeedAirticketPriceA2.getApAyy());
            myParameterSourceAry[i].addValue("apAyz", wkDataFeedAirticketPriceA2.getApAyz());
            myParameterSourceAry[i].addValue("apAza", wkDataFeedAirticketPriceA2.getApAza());
            myParameterSourceAry[i].addValue("apAzb", wkDataFeedAirticketPriceA2.getApAzb());
            myParameterSourceAry[i].addValue("apAzc", wkDataFeedAirticketPriceA2.getApAzc());
            myParameterSourceAry[i].addValue("apAzd", wkDataFeedAirticketPriceA2.getApAzd());
            myParameterSourceAry[i].addValue("apAze", wkDataFeedAirticketPriceA2.getApAze());
            myParameterSourceAry[i].addValue("apAzf", wkDataFeedAirticketPriceA2.getApAzf());
            myParameterSourceAry[i].addValue("apAzg", wkDataFeedAirticketPriceA2.getApAzg());
            myParameterSourceAry[i].addValue("apAzh", wkDataFeedAirticketPriceA2.getApAzh());
            myParameterSourceAry[i].addValue("apAzi", wkDataFeedAirticketPriceA2.getApAzi());
            myParameterSourceAry[i].addValue("apAzj", wkDataFeedAirticketPriceA2.getApAzj());
            myParameterSourceAry[i].addValue("apAzk", wkDataFeedAirticketPriceA2.getApAzk());
            myParameterSourceAry[i].addValue("apAzl", wkDataFeedAirticketPriceA2.getApAzl());
            myParameterSourceAry[i].addValue("apAzm", wkDataFeedAirticketPriceA2.getApAzm());
            myParameterSourceAry[i].addValue("apAzn", wkDataFeedAirticketPriceA2.getApAzn());
            myParameterSourceAry[i].addValue("apAzo", wkDataFeedAirticketPriceA2.getApAzo());
            myParameterSourceAry[i].addValue("apAzp", wkDataFeedAirticketPriceA2.getApAzp());
            myParameterSourceAry[i].addValue("apAzq", wkDataFeedAirticketPriceA2.getApAzq());
            myParameterSourceAry[i].addValue("apAzr", wkDataFeedAirticketPriceA2.getApAzr());
            myParameterSourceAry[i].addValue("apAzs", wkDataFeedAirticketPriceA2.getApAzs());
            myParameterSourceAry[i].addValue("apAzt", wkDataFeedAirticketPriceA2.getApAzt());
            myParameterSourceAry[i].addValue("apAzu", wkDataFeedAirticketPriceA2.getApAzu());
            myParameterSourceAry[i].addValue("apAzv", wkDataFeedAirticketPriceA2.getApAzv());
            myParameterSourceAry[i].addValue("apAzw", wkDataFeedAirticketPriceA2.getApAzw());
            myParameterSourceAry[i].addValue("apAzx", wkDataFeedAirticketPriceA2.getApAzx());
            myParameterSourceAry[i].addValue("apAzy", wkDataFeedAirticketPriceA2.getApAzy());
            myParameterSourceAry[i].addValue("apAzz", wkDataFeedAirticketPriceA2.getApAzz());
        }

        namedParameterJdbcTemplate.batchUpdate(mySql, myParameterSourceAry);
    }
}
