package tw.com.colatour.datafeed.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Component;
import tw.com.colatour.datafeed.dao.DataFeedAirticketPriceA1Dao;
import tw.com.colatour.datafeed.model.DataFeedAirticketPriceA1;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class DataFeedAirticketPriceA1DaoImpl implements DataFeedAirticketPriceA1Dao {

    @Autowired
    private NamedParameterJdbcTemplate myNamedParameterJdbcTemplate;

    @Override
    public void createDataFeedAirticketPriceA1s(List<DataFeedAirticketPriceA1> dataFeedAirticketPriceA1List) {
        String mySql = "INSERT INTO db_airticket.data_feed_airticket_price_a1 ( " +
                " file_no, price_no, " +
                " ap_aaa, ap_aab, ap_aac, ap_aad, ap_aae, ap_aaf, ap_aag, ap_aah, ap_aai, ap_aaj, ap_aak, ap_aal, ap_aam, " +
                " ap_aan, ap_aao, ap_aap, ap_aaq, ap_aar, ap_aas, ap_aat, ap_aau, ap_aav, ap_aaw, ap_aax, ap_aay, ap_aaz, " +
                " ap_aba, ap_abb, ap_abc, ap_abd, ap_abe, ap_abf, ap_abg, ap_abh, ap_abi, ap_abj, ap_abk, ap_abl, ap_abm, " +
                " ap_abn, ap_abo, ap_abp, ap_abq, ap_abr, ap_abs, ap_abt, ap_abu, ap_abv, ap_abw, ap_abx, ap_aby, ap_abz, " +
                " ap_aca, ap_acb, ap_acc, ap_acd, ap_ace, ap_acf, ap_acg, ap_ach, ap_aci, ap_acj, ap_ack, ap_acl, ap_acm, " +
                " ap_acn, ap_aco, ap_acp, ap_acq, ap_acr, ap_acs, ap_act, ap_acu, ap_acv, ap_acw, ap_acx, ap_acy, ap_acz, " +
                " ap_ada, ap_adb, ap_adc, ap_add, ap_ade, ap_adf, ap_adg, ap_adh, ap_adi, ap_adj, ap_adk, ap_adl, ap_adm, " +
                " ap_adn, ap_ado, ap_adp, ap_adq, ap_adr, ap_ads, ap_adt, ap_adu, ap_adv, ap_adw, ap_adx, ap_ady, ap_adz, " +
                " ap_aea, ap_aeb, ap_aec, ap_aed, ap_aee, ap_aef, ap_aeg, ap_aeh, ap_aei, ap_aej, ap_aek, ap_ael, ap_aem, " +
                " ap_aen, ap_aeo, ap_aep, ap_aeq, ap_aer, ap_aes, ap_aet, ap_aeu, ap_aev, ap_aew, ap_aex, ap_aey, ap_aez, " +
                " ap_afa, ap_afb, ap_afc, ap_afd, ap_afe, ap_aff, ap_afg, ap_afh, ap_afi, ap_afj, ap_afk, ap_afl, ap_afm, " +
                " ap_afn, ap_afo, ap_afp, ap_afq, ap_afr, ap_afs, ap_aft, ap_afu, ap_afv, ap_afw, ap_afx, ap_afy, ap_afz, " +
                " ap_aga, ap_agb, ap_agc, ap_agd, ap_age, ap_agf, ap_agg, ap_agh, ap_agi, ap_agj, ap_agk, ap_agl, ap_agm, " +
                " ap_agn, ap_ago, ap_agp, ap_agq, ap_agr, ap_ags, ap_agt, ap_agu, ap_agv, ap_agw, ap_agx, ap_agy, ap_agz, " +
                " ap_aha, ap_ahb, ap_ahc, ap_ahd, ap_ahe, ap_ahf, ap_ahg, ap_ahh, ap_ahi, ap_ahj, ap_ahk, ap_ahl, ap_ahm, " +
                " ap_ahn, ap_aho, ap_ahp, ap_ahq, ap_ahr, ap_ahs, ap_aht, ap_ahu, ap_ahv, ap_ahw, ap_ahx, ap_ahy, ap_ahz, " +
                " ap_aia, ap_aib, ap_aic, ap_aid, ap_aie, ap_aif, ap_aig, ap_aih, ap_aii, ap_aij, ap_aik, ap_ail, ap_aim, " +
                " ap_ain, ap_aio, ap_aip, ap_aiq, ap_air, ap_ais, ap_ait, ap_aiu, ap_aiv, ap_aiw, ap_aix, ap_aiy, ap_aiz, " +
                " ap_aja, ap_ajb, ap_ajc, ap_ajd, ap_aje, ap_ajf, ap_ajg, ap_ajh, ap_aji, ap_ajj, ap_ajk, ap_ajl, ap_ajm, " +
                " ap_ajn, ap_ajo, ap_ajp, ap_ajq, ap_ajr, ap_ajs, ap_ajt, ap_aju, ap_ajv, ap_ajw, ap_ajx, ap_ajy, ap_ajz, " +
                " ap_aka, ap_akb, ap_akc, ap_akd, ap_ake, ap_akf, ap_akg, ap_akh, ap_aki, ap_akj, ap_akk, ap_akl, ap_akm, " +
                " ap_akn, ap_ako, ap_akp, ap_akq, ap_akr, ap_aks, ap_akt, ap_aku, ap_akv, ap_akw, ap_akx, ap_aky, ap_akz, " +
                " ap_ala, ap_alb, ap_alc, ap_ald, ap_ale, ap_alf, ap_alg, ap_alh, ap_ali, ap_alj, ap_alk, ap_all, ap_alm, " +
                " ap_aln, ap_alo, ap_alp, ap_alq, ap_alr, ap_als, ap_alt, ap_alu, ap_alv, ap_alw, ap_alx, ap_aly, ap_alz, " +
                " ap_ama, ap_amb, ap_amc, ap_amd, ap_ame, ap_amf, ap_amg, ap_amh, ap_ami, ap_amj, ap_amk, ap_aml, ap_amm, " +
                " ap_amn, ap_amo, ap_amp, ap_amq, ap_amr, ap_ams, ap_amt, ap_amu, ap_amv, ap_amw, ap_amx, ap_amy, ap_amz ) " +
                " VALUES ( " +
                " :fileNo, :priceNo, " +
                " :apAaa, :apAab, :apAac, :apAad, :apAae, :apAaf, :apAag, :apAah, :apAai, :apAaj, :apAak, :apAal, :apAam, " +
                " :apAan, :apAao, :apAap, :apAaq, :apAar, :apAas, :apAat, :apAau, :apAav, :apAaw, :apAax, :apAay, :apAaz, " +
                " :apAba, :apAbb, :apAbc, :apAbd, :apAbe, :apAbf, :apAbg, :apAbh, :apAbi, :apAbj, :apAbk, :apAbl, :apAbm, " +
                " :apAbn, :apAbo, :apAbp, :apAbq, :apAbr, :apAbs, :apAbt, :apAbu, :apAbv, :apAbw, :apAbx, :apAby, :apAbz, " +
                " :apAca, :apAcb, :apAcc, :apAcd, :apAce, :apAcf, :apAcg, :apAch, :apAci, :apAcj, :apAck, :apAcl, :apAcm, " +
                " :apAcn, :apAco, :apAcp, :apAcq, :apAcr, :apAcs, :apAct, :apAcu, :apAcv, :apAcw, :apAcx, :apAcy, :apAcz, " +
                " :apAda, :apAdb, :apAdc, :apAdd, :apAde, :apAdf, :apAdg, :apAdh, :apAdi, :apAdj, :apAdk, :apAdl, :apAdm, " +
                " :apAdn, :apAdo, :apAdp, :apAdq, :apAdr, :apAds, :apAdt, :apAdu, :apAdv, :apAdw, :apAdx, :apAdy, :apAdz, " +
                " :apAea, :apAeb, :apAec, :apAed, :apAee, :apAef, :apAeg, :apAeh, :apAei, :apAej, :apAek, :apAel, :apAem, " +
                " :apAen, :apAeo, :apAep, :apAeq, :apAer, :apAes, :apAet, :apAeu, :apAev, :apAew, :apAex, :apAey, :apAez, " +
                " :apAfa, :apAfb, :apAfc, :apAfd, :apAfe, :apAff, :apAfg, :apAfh, :apAfi, :apAfj, :apAfk, :apAfl, :apAfm, " +
                " :apAfn, :apAfo, :apAfp, :apAfq, :apAfr, :apAfs, :apAft, :apAfu, :apAfv, :apAfw, :apAfx, :apAfy, :apAfz, " +
                " :apAga, :apAgb, :apAgc, :apAgd, :apAge, :apAgf, :apAgg, :apAgh, :apAgi, :apAgj, :apAgk, :apAgl, :apAgm, " +
                " :apAgn, :apAgo, :apAgp, :apAgq, :apAgr, :apAgs, :apAgt, :apAgu, :apAgv, :apAgw, :apAgx, :apAgy, :apAgz, " +
                " :apAha, :apAhb, :apAhc, :apAhd, :apAhe, :apAhf, :apAhg, :apAhh, :apAhi, :apAhj, :apAhk, :apAhl, :apAhm, " +
                " :apAhn, :apAho, :apAhp, :apAhq, :apAhr, :apAhs, :apAht, :apAhu, :apAhv, :apAhw, :apAhx, :apAhy, :apAhz, " +
                " :apAia, :apAib, :apAic, :apAid, :apAie, :apAif, :apAig, :apAih, :apAii, :apAij, :apAik, :apAil, :apAim, " +
                " :apAin, :apAio, :apAip, :apAiq, :apAir, :apAis, :apAit, :apAiu, :apAiv, :apAiw, :apAix, :apAiy, :apAiz, " +
                " :apAja, :apAjb, :apAjc, :apAjd, :apAje, :apAjf, :apAjg, :apAjh, :apAji, :apAjj, :apAjk, :apAjl, :apAjm, " +
                " :apAjn, :apAjo, :apAjp, :apAjq, :apAjr, :apAjs, :apAjt, :apAju, :apAjv, :apAjw, :apAjx, :apAjy, :apAjz, " +
                " :apAka, :apAkb, :apAkc, :apAkd, :apAke, :apAkf, :apAkg, :apAkh, :apAki, :apAkj, :apAkk, :apAkl, :apAkm, " +
                " :apAkn, :apAko, :apAkp, :apAkq, :apAkr, :apAks, :apAkt, :apAku, :apAkv, :apAkw, :apAkx, :apAky, :apAkz, " +
                " :apAla, :apAlb, :apAlc, :apAld, :apAle, :apAlf, :apAlg, :apAlh, :apAli, :apAlj, :apAlk, :apAll, :apAlm, " +
                " :apAln, :apAlo, :apAlp, :apAlq, :apAlr, :apAls, :apAlt, :apAlu, :apAlv, :apAlw, :apAlx, :apAly, :apAlz, " +
                " :apAma, :apAmb, :apAmc, :apAmd, :apAme, :apAmf, :apAmg, :apAmh, :apAmi, :apAmj, :apAmk, :apAml, :apAmm, " +
                " :apAmn, :apAmo, :apAmp, :apAmq, :apAmr, :apAms, :apAmt, :apAmu, :apAmv, :apAmw, :apAmx, :apAmy, :apAmz ) ";

        MapSqlParameterSource[] myParameterSourceAry = new MapSqlParameterSource[dataFeedAirticketPriceA1List.size()];

        for (int i = 0; i < dataFeedAirticketPriceA1List.size(); i++) {
            DataFeedAirticketPriceA1 wkDataFeedAirticketPriceA1 = dataFeedAirticketPriceA1List.get(i);

            myParameterSourceAry[i] = new MapSqlParameterSource();

            myParameterSourceAry[i].addValue("fileNo", wkDataFeedAirticketPriceA1.getFileNo());
            myParameterSourceAry[i].addValue("priceNo", wkDataFeedAirticketPriceA1.getPriceNo());
            myParameterSourceAry[i].addValue("apAaa", wkDataFeedAirticketPriceA1.getApAaa());
            myParameterSourceAry[i].addValue("apAab", wkDataFeedAirticketPriceA1.getApAab());
            myParameterSourceAry[i].addValue("apAac", wkDataFeedAirticketPriceA1.getApAac());
            myParameterSourceAry[i].addValue("apAad", wkDataFeedAirticketPriceA1.getApAad());
            myParameterSourceAry[i].addValue("apAae", wkDataFeedAirticketPriceA1.getApAae());
            myParameterSourceAry[i].addValue("apAaf", wkDataFeedAirticketPriceA1.getApAaf());
            myParameterSourceAry[i].addValue("apAag", wkDataFeedAirticketPriceA1.getApAag());
            myParameterSourceAry[i].addValue("apAah", wkDataFeedAirticketPriceA1.getApAah());
            myParameterSourceAry[i].addValue("apAai", wkDataFeedAirticketPriceA1.getApAai());
            myParameterSourceAry[i].addValue("apAaj", wkDataFeedAirticketPriceA1.getApAaj());
            myParameterSourceAry[i].addValue("apAak", wkDataFeedAirticketPriceA1.getApAak());
            myParameterSourceAry[i].addValue("apAal", wkDataFeedAirticketPriceA1.getApAal());
            myParameterSourceAry[i].addValue("apAam", wkDataFeedAirticketPriceA1.getApAam());
            myParameterSourceAry[i].addValue("apAan", wkDataFeedAirticketPriceA1.getApAan());
            myParameterSourceAry[i].addValue("apAao", wkDataFeedAirticketPriceA1.getApAao());
            myParameterSourceAry[i].addValue("apAap", wkDataFeedAirticketPriceA1.getApAap());
            myParameterSourceAry[i].addValue("apAaq", wkDataFeedAirticketPriceA1.getApAaq());
            myParameterSourceAry[i].addValue("apAar", wkDataFeedAirticketPriceA1.getApAar());
            myParameterSourceAry[i].addValue("apAas", wkDataFeedAirticketPriceA1.getApAas());
            myParameterSourceAry[i].addValue("apAat", wkDataFeedAirticketPriceA1.getApAat());
            myParameterSourceAry[i].addValue("apAau", wkDataFeedAirticketPriceA1.getApAau());
            myParameterSourceAry[i].addValue("apAav", wkDataFeedAirticketPriceA1.getApAav());
            myParameterSourceAry[i].addValue("apAaw", wkDataFeedAirticketPriceA1.getApAaw());
            myParameterSourceAry[i].addValue("apAax", wkDataFeedAirticketPriceA1.getApAax());
            myParameterSourceAry[i].addValue("apAay", wkDataFeedAirticketPriceA1.getApAay());
            myParameterSourceAry[i].addValue("apAaz", wkDataFeedAirticketPriceA1.getApAaz());
            myParameterSourceAry[i].addValue("apAba", wkDataFeedAirticketPriceA1.getApAba());
            myParameterSourceAry[i].addValue("apAbb", wkDataFeedAirticketPriceA1.getApAbb());
            myParameterSourceAry[i].addValue("apAbc", wkDataFeedAirticketPriceA1.getApAbc());
            myParameterSourceAry[i].addValue("apAbd", wkDataFeedAirticketPriceA1.getApAbd());
            myParameterSourceAry[i].addValue("apAbe", wkDataFeedAirticketPriceA1.getApAbe());
            myParameterSourceAry[i].addValue("apAbf", wkDataFeedAirticketPriceA1.getApAbf());
            myParameterSourceAry[i].addValue("apAbg", wkDataFeedAirticketPriceA1.getApAbg());
            myParameterSourceAry[i].addValue("apAbh", wkDataFeedAirticketPriceA1.getApAbh());
            myParameterSourceAry[i].addValue("apAbi", wkDataFeedAirticketPriceA1.getApAbi());
            myParameterSourceAry[i].addValue("apAbj", wkDataFeedAirticketPriceA1.getApAbj());
            myParameterSourceAry[i].addValue("apAbk", wkDataFeedAirticketPriceA1.getApAbk());
            myParameterSourceAry[i].addValue("apAbl", wkDataFeedAirticketPriceA1.getApAbl());
            myParameterSourceAry[i].addValue("apAbm", wkDataFeedAirticketPriceA1.getApAbm());
            myParameterSourceAry[i].addValue("apAbn", wkDataFeedAirticketPriceA1.getApAbn());
            myParameterSourceAry[i].addValue("apAbo", wkDataFeedAirticketPriceA1.getApAbo());
            myParameterSourceAry[i].addValue("apAbp", wkDataFeedAirticketPriceA1.getApAbp());
            myParameterSourceAry[i].addValue("apAbq", wkDataFeedAirticketPriceA1.getApAbq());
            myParameterSourceAry[i].addValue("apAbr", wkDataFeedAirticketPriceA1.getApAbr());
            myParameterSourceAry[i].addValue("apAbs", wkDataFeedAirticketPriceA1.getApAbs());
            myParameterSourceAry[i].addValue("apAbt", wkDataFeedAirticketPriceA1.getApAbt());
            myParameterSourceAry[i].addValue("apAbu", wkDataFeedAirticketPriceA1.getApAbu());
            myParameterSourceAry[i].addValue("apAbv", wkDataFeedAirticketPriceA1.getApAbv());
            myParameterSourceAry[i].addValue("apAbw", wkDataFeedAirticketPriceA1.getApAbw());
            myParameterSourceAry[i].addValue("apAbx", wkDataFeedAirticketPriceA1.getApAbx());
            myParameterSourceAry[i].addValue("apAby", wkDataFeedAirticketPriceA1.getApAby());
            myParameterSourceAry[i].addValue("apAbz", wkDataFeedAirticketPriceA1.getApAbz());
            myParameterSourceAry[i].addValue("apAca", wkDataFeedAirticketPriceA1.getApAca());
            myParameterSourceAry[i].addValue("apAcb", wkDataFeedAirticketPriceA1.getApAcb());
            myParameterSourceAry[i].addValue("apAcc", wkDataFeedAirticketPriceA1.getApAcc());
            myParameterSourceAry[i].addValue("apAcd", wkDataFeedAirticketPriceA1.getApAcd());
            myParameterSourceAry[i].addValue("apAce", wkDataFeedAirticketPriceA1.getApAce());
            myParameterSourceAry[i].addValue("apAcf", wkDataFeedAirticketPriceA1.getApAcf());
            myParameterSourceAry[i].addValue("apAcg", wkDataFeedAirticketPriceA1.getApAcg());
            myParameterSourceAry[i].addValue("apAch", wkDataFeedAirticketPriceA1.getApAch());
            myParameterSourceAry[i].addValue("apAci", wkDataFeedAirticketPriceA1.getApAci());
            myParameterSourceAry[i].addValue("apAcj", wkDataFeedAirticketPriceA1.getApAcj());
            myParameterSourceAry[i].addValue("apAck", wkDataFeedAirticketPriceA1.getApAck());
            myParameterSourceAry[i].addValue("apAcl", wkDataFeedAirticketPriceA1.getApAcl());
            myParameterSourceAry[i].addValue("apAcm", wkDataFeedAirticketPriceA1.getApAcm());
            myParameterSourceAry[i].addValue("apAcn", wkDataFeedAirticketPriceA1.getApAcn());
            myParameterSourceAry[i].addValue("apAco", wkDataFeedAirticketPriceA1.getApAco());
            myParameterSourceAry[i].addValue("apAcp", wkDataFeedAirticketPriceA1.getApAcp());
            myParameterSourceAry[i].addValue("apAcq", wkDataFeedAirticketPriceA1.getApAcq());
            myParameterSourceAry[i].addValue("apAcr", wkDataFeedAirticketPriceA1.getApAcr());
            myParameterSourceAry[i].addValue("apAcs", wkDataFeedAirticketPriceA1.getApAcs());
            myParameterSourceAry[i].addValue("apAct", wkDataFeedAirticketPriceA1.getApAct());
            myParameterSourceAry[i].addValue("apAcu", wkDataFeedAirticketPriceA1.getApAcu());
            myParameterSourceAry[i].addValue("apAcv", wkDataFeedAirticketPriceA1.getApAcv());
            myParameterSourceAry[i].addValue("apAcw", wkDataFeedAirticketPriceA1.getApAcw());
            myParameterSourceAry[i].addValue("apAcx", wkDataFeedAirticketPriceA1.getApAcx());
            myParameterSourceAry[i].addValue("apAcy", wkDataFeedAirticketPriceA1.getApAcy());
            myParameterSourceAry[i].addValue("apAcz", wkDataFeedAirticketPriceA1.getApAcz());
            myParameterSourceAry[i].addValue("apAda", wkDataFeedAirticketPriceA1.getApAda());
            myParameterSourceAry[i].addValue("apAdb", wkDataFeedAirticketPriceA1.getApAdb());
            myParameterSourceAry[i].addValue("apAdc", wkDataFeedAirticketPriceA1.getApAdc());
            myParameterSourceAry[i].addValue("apAdd", wkDataFeedAirticketPriceA1.getApAdd());
            myParameterSourceAry[i].addValue("apAde", wkDataFeedAirticketPriceA1.getApAde());
            myParameterSourceAry[i].addValue("apAdf", wkDataFeedAirticketPriceA1.getApAdf());
            myParameterSourceAry[i].addValue("apAdg", wkDataFeedAirticketPriceA1.getApAdg());
            myParameterSourceAry[i].addValue("apAdh", wkDataFeedAirticketPriceA1.getApAdh());
            myParameterSourceAry[i].addValue("apAdi", wkDataFeedAirticketPriceA1.getApAdi());
            myParameterSourceAry[i].addValue("apAdj", wkDataFeedAirticketPriceA1.getApAdj());
            myParameterSourceAry[i].addValue("apAdk", wkDataFeedAirticketPriceA1.getApAdk());
            myParameterSourceAry[i].addValue("apAdl", wkDataFeedAirticketPriceA1.getApAdl());
            myParameterSourceAry[i].addValue("apAdm", wkDataFeedAirticketPriceA1.getApAdm());
            myParameterSourceAry[i].addValue("apAdn", wkDataFeedAirticketPriceA1.getApAdn());
            myParameterSourceAry[i].addValue("apAdo", wkDataFeedAirticketPriceA1.getApAdo());
            myParameterSourceAry[i].addValue("apAdp", wkDataFeedAirticketPriceA1.getApAdp());
            myParameterSourceAry[i].addValue("apAdq", wkDataFeedAirticketPriceA1.getApAdq());
            myParameterSourceAry[i].addValue("apAdr", wkDataFeedAirticketPriceA1.getApAdr());
            myParameterSourceAry[i].addValue("apAds", wkDataFeedAirticketPriceA1.getApAds());
            myParameterSourceAry[i].addValue("apAdt", wkDataFeedAirticketPriceA1.getApAdt());
            myParameterSourceAry[i].addValue("apAdu", wkDataFeedAirticketPriceA1.getApAdu());
            myParameterSourceAry[i].addValue("apAdv", wkDataFeedAirticketPriceA1.getApAdv());
            myParameterSourceAry[i].addValue("apAdw", wkDataFeedAirticketPriceA1.getApAdw());
            myParameterSourceAry[i].addValue("apAdx", wkDataFeedAirticketPriceA1.getApAdx());
            myParameterSourceAry[i].addValue("apAdy", wkDataFeedAirticketPriceA1.getApAdy());
            myParameterSourceAry[i].addValue("apAdz", wkDataFeedAirticketPriceA1.getApAdz());
            myParameterSourceAry[i].addValue("apAea", wkDataFeedAirticketPriceA1.getApAea());
            myParameterSourceAry[i].addValue("apAeb", wkDataFeedAirticketPriceA1.getApAeb());
            myParameterSourceAry[i].addValue("apAec", wkDataFeedAirticketPriceA1.getApAec());
            myParameterSourceAry[i].addValue("apAed", wkDataFeedAirticketPriceA1.getApAed());
            myParameterSourceAry[i].addValue("apAee", wkDataFeedAirticketPriceA1.getApAee());
            myParameterSourceAry[i].addValue("apAef", wkDataFeedAirticketPriceA1.getApAef());
            myParameterSourceAry[i].addValue("apAeg", wkDataFeedAirticketPriceA1.getApAeg());
            myParameterSourceAry[i].addValue("apAeh", wkDataFeedAirticketPriceA1.getApAeh());
            myParameterSourceAry[i].addValue("apAei", wkDataFeedAirticketPriceA1.getApAei());
            myParameterSourceAry[i].addValue("apAej", wkDataFeedAirticketPriceA1.getApAej());
            myParameterSourceAry[i].addValue("apAek", wkDataFeedAirticketPriceA1.getApAek());
            myParameterSourceAry[i].addValue("apAel", wkDataFeedAirticketPriceA1.getApAel());
            myParameterSourceAry[i].addValue("apAem", wkDataFeedAirticketPriceA1.getApAem());
            myParameterSourceAry[i].addValue("apAen", wkDataFeedAirticketPriceA1.getApAen());
            myParameterSourceAry[i].addValue("apAeo", wkDataFeedAirticketPriceA1.getApAeo());
            myParameterSourceAry[i].addValue("apAep", wkDataFeedAirticketPriceA1.getApAep());
            myParameterSourceAry[i].addValue("apAeq", wkDataFeedAirticketPriceA1.getApAeq());
            myParameterSourceAry[i].addValue("apAer", wkDataFeedAirticketPriceA1.getApAer());
            myParameterSourceAry[i].addValue("apAes", wkDataFeedAirticketPriceA1.getApAes());
            myParameterSourceAry[i].addValue("apAet", wkDataFeedAirticketPriceA1.getApAet());
            myParameterSourceAry[i].addValue("apAeu", wkDataFeedAirticketPriceA1.getApAeu());
            myParameterSourceAry[i].addValue("apAev", wkDataFeedAirticketPriceA1.getApAev());
            myParameterSourceAry[i].addValue("apAew", wkDataFeedAirticketPriceA1.getApAew());
            myParameterSourceAry[i].addValue("apAex", wkDataFeedAirticketPriceA1.getApAex());
            myParameterSourceAry[i].addValue("apAey", wkDataFeedAirticketPriceA1.getApAey());
            myParameterSourceAry[i].addValue("apAez", wkDataFeedAirticketPriceA1.getApAez());
            myParameterSourceAry[i].addValue("apAfa", wkDataFeedAirticketPriceA1.getApAfa());
            myParameterSourceAry[i].addValue("apAfb", wkDataFeedAirticketPriceA1.getApAfb());
            myParameterSourceAry[i].addValue("apAfc", wkDataFeedAirticketPriceA1.getApAfc());
            myParameterSourceAry[i].addValue("apAfd", wkDataFeedAirticketPriceA1.getApAfd());
            myParameterSourceAry[i].addValue("apAfe", wkDataFeedAirticketPriceA1.getApAfe());
            myParameterSourceAry[i].addValue("apAff", wkDataFeedAirticketPriceA1.getApAff());
            myParameterSourceAry[i].addValue("apAfg", wkDataFeedAirticketPriceA1.getApAfg());
            myParameterSourceAry[i].addValue("apAfh", wkDataFeedAirticketPriceA1.getApAfh());
            myParameterSourceAry[i].addValue("apAfi", wkDataFeedAirticketPriceA1.getApAfi());
            myParameterSourceAry[i].addValue("apAfj", wkDataFeedAirticketPriceA1.getApAfj());
            myParameterSourceAry[i].addValue("apAfk", wkDataFeedAirticketPriceA1.getApAfk());
            myParameterSourceAry[i].addValue("apAfl", wkDataFeedAirticketPriceA1.getApAfl());
            myParameterSourceAry[i].addValue("apAfm", wkDataFeedAirticketPriceA1.getApAfm());
            myParameterSourceAry[i].addValue("apAfn", wkDataFeedAirticketPriceA1.getApAfn());
            myParameterSourceAry[i].addValue("apAfo", wkDataFeedAirticketPriceA1.getApAfo());
            myParameterSourceAry[i].addValue("apAfp", wkDataFeedAirticketPriceA1.getApAfp());
            myParameterSourceAry[i].addValue("apAfq", wkDataFeedAirticketPriceA1.getApAfq());
            myParameterSourceAry[i].addValue("apAfr", wkDataFeedAirticketPriceA1.getApAfr());
            myParameterSourceAry[i].addValue("apAfs", wkDataFeedAirticketPriceA1.getApAfs());
            myParameterSourceAry[i].addValue("apAft", wkDataFeedAirticketPriceA1.getApAft());
            myParameterSourceAry[i].addValue("apAfu", wkDataFeedAirticketPriceA1.getApAfu());
            myParameterSourceAry[i].addValue("apAfv", wkDataFeedAirticketPriceA1.getApAfv());
            myParameterSourceAry[i].addValue("apAfw", wkDataFeedAirticketPriceA1.getApAfw());
            myParameterSourceAry[i].addValue("apAfx", wkDataFeedAirticketPriceA1.getApAfx());
            myParameterSourceAry[i].addValue("apAfy", wkDataFeedAirticketPriceA1.getApAfy());
            myParameterSourceAry[i].addValue("apAfz", wkDataFeedAirticketPriceA1.getApAfz());
            myParameterSourceAry[i].addValue("apAga", wkDataFeedAirticketPriceA1.getApAga());
            myParameterSourceAry[i].addValue("apAgb", wkDataFeedAirticketPriceA1.getApAgb());
            myParameterSourceAry[i].addValue("apAgc", wkDataFeedAirticketPriceA1.getApAgc());
            myParameterSourceAry[i].addValue("apAgd", wkDataFeedAirticketPriceA1.getApAgd());
            myParameterSourceAry[i].addValue("apAge", wkDataFeedAirticketPriceA1.getApAge());
            myParameterSourceAry[i].addValue("apAgf", wkDataFeedAirticketPriceA1.getApAgf());
            myParameterSourceAry[i].addValue("apAgg", wkDataFeedAirticketPriceA1.getApAgg());
            myParameterSourceAry[i].addValue("apAgh", wkDataFeedAirticketPriceA1.getApAgh());
            myParameterSourceAry[i].addValue("apAgi", wkDataFeedAirticketPriceA1.getApAgi());
            myParameterSourceAry[i].addValue("apAgj", wkDataFeedAirticketPriceA1.getApAgj());
            myParameterSourceAry[i].addValue("apAgk", wkDataFeedAirticketPriceA1.getApAgk());
            myParameterSourceAry[i].addValue("apAgl", wkDataFeedAirticketPriceA1.getApAgl());
            myParameterSourceAry[i].addValue("apAgm", wkDataFeedAirticketPriceA1.getApAgm());
            myParameterSourceAry[i].addValue("apAgn", wkDataFeedAirticketPriceA1.getApAgn());
            myParameterSourceAry[i].addValue("apAgo", wkDataFeedAirticketPriceA1.getApAgo());
            myParameterSourceAry[i].addValue("apAgp", wkDataFeedAirticketPriceA1.getApAgp());
            myParameterSourceAry[i].addValue("apAgq", wkDataFeedAirticketPriceA1.getApAgq());
            myParameterSourceAry[i].addValue("apAgr", wkDataFeedAirticketPriceA1.getApAgr());
            myParameterSourceAry[i].addValue("apAgs", wkDataFeedAirticketPriceA1.getApAgs());
            myParameterSourceAry[i].addValue("apAgt", wkDataFeedAirticketPriceA1.getApAgt());
            myParameterSourceAry[i].addValue("apAgu", wkDataFeedAirticketPriceA1.getApAgu());
            myParameterSourceAry[i].addValue("apAgv", wkDataFeedAirticketPriceA1.getApAgv());
            myParameterSourceAry[i].addValue("apAgw", wkDataFeedAirticketPriceA1.getApAgw());
            myParameterSourceAry[i].addValue("apAgx", wkDataFeedAirticketPriceA1.getApAgx());
            myParameterSourceAry[i].addValue("apAgy", wkDataFeedAirticketPriceA1.getApAgy());
            myParameterSourceAry[i].addValue("apAgz", wkDataFeedAirticketPriceA1.getApAgz());
            myParameterSourceAry[i].addValue("apAha", wkDataFeedAirticketPriceA1.getApAha());
            myParameterSourceAry[i].addValue("apAhb", wkDataFeedAirticketPriceA1.getApAhb());
            myParameterSourceAry[i].addValue("apAhc", wkDataFeedAirticketPriceA1.getApAhc());
            myParameterSourceAry[i].addValue("apAhd", wkDataFeedAirticketPriceA1.getApAhd());
            myParameterSourceAry[i].addValue("apAhe", wkDataFeedAirticketPriceA1.getApAhe());
            myParameterSourceAry[i].addValue("apAhf", wkDataFeedAirticketPriceA1.getApAhf());
            myParameterSourceAry[i].addValue("apAhg", wkDataFeedAirticketPriceA1.getApAhg());
            myParameterSourceAry[i].addValue("apAhh", wkDataFeedAirticketPriceA1.getApAhh());
            myParameterSourceAry[i].addValue("apAhi", wkDataFeedAirticketPriceA1.getApAhi());
            myParameterSourceAry[i].addValue("apAhj", wkDataFeedAirticketPriceA1.getApAhj());
            myParameterSourceAry[i].addValue("apAhk", wkDataFeedAirticketPriceA1.getApAhk());
            myParameterSourceAry[i].addValue("apAhl", wkDataFeedAirticketPriceA1.getApAhl());
            myParameterSourceAry[i].addValue("apAhm", wkDataFeedAirticketPriceA1.getApAhm());
            myParameterSourceAry[i].addValue("apAhn", wkDataFeedAirticketPriceA1.getApAhn());
            myParameterSourceAry[i].addValue("apAho", wkDataFeedAirticketPriceA1.getApAho());
            myParameterSourceAry[i].addValue("apAhp", wkDataFeedAirticketPriceA1.getApAhp());
            myParameterSourceAry[i].addValue("apAhq", wkDataFeedAirticketPriceA1.getApAhq());
            myParameterSourceAry[i].addValue("apAhr", wkDataFeedAirticketPriceA1.getApAhr());
            myParameterSourceAry[i].addValue("apAhs", wkDataFeedAirticketPriceA1.getApAhs());
            myParameterSourceAry[i].addValue("apAht", wkDataFeedAirticketPriceA1.getApAht());
            myParameterSourceAry[i].addValue("apAhu", wkDataFeedAirticketPriceA1.getApAhu());
            myParameterSourceAry[i].addValue("apAhv", wkDataFeedAirticketPriceA1.getApAhv());
            myParameterSourceAry[i].addValue("apAhw", wkDataFeedAirticketPriceA1.getApAhw());
            myParameterSourceAry[i].addValue("apAhx", wkDataFeedAirticketPriceA1.getApAhx());
            myParameterSourceAry[i].addValue("apAhy", wkDataFeedAirticketPriceA1.getApAhy());
            myParameterSourceAry[i].addValue("apAhz", wkDataFeedAirticketPriceA1.getApAhz());
            myParameterSourceAry[i].addValue("apAia", wkDataFeedAirticketPriceA1.getApAia());
            myParameterSourceAry[i].addValue("apAib", wkDataFeedAirticketPriceA1.getApAib());
            myParameterSourceAry[i].addValue("apAic", wkDataFeedAirticketPriceA1.getApAic());
            myParameterSourceAry[i].addValue("apAid", wkDataFeedAirticketPriceA1.getApAid());
            myParameterSourceAry[i].addValue("apAie", wkDataFeedAirticketPriceA1.getApAie());
            myParameterSourceAry[i].addValue("apAif", wkDataFeedAirticketPriceA1.getApAif());
            myParameterSourceAry[i].addValue("apAig", wkDataFeedAirticketPriceA1.getApAig());
            myParameterSourceAry[i].addValue("apAih", wkDataFeedAirticketPriceA1.getApAih());
            myParameterSourceAry[i].addValue("apAii", wkDataFeedAirticketPriceA1.getApAii());
            myParameterSourceAry[i].addValue("apAij", wkDataFeedAirticketPriceA1.getApAij());
            myParameterSourceAry[i].addValue("apAik", wkDataFeedAirticketPriceA1.getApAik());
            myParameterSourceAry[i].addValue("apAil", wkDataFeedAirticketPriceA1.getApAil());
            myParameterSourceAry[i].addValue("apAim", wkDataFeedAirticketPriceA1.getApAim());
            myParameterSourceAry[i].addValue("apAin", wkDataFeedAirticketPriceA1.getApAin());
            myParameterSourceAry[i].addValue("apAio", wkDataFeedAirticketPriceA1.getApAio());
            myParameterSourceAry[i].addValue("apAip", wkDataFeedAirticketPriceA1.getApAip());
            myParameterSourceAry[i].addValue("apAiq", wkDataFeedAirticketPriceA1.getApAiq());
            myParameterSourceAry[i].addValue("apAir", wkDataFeedAirticketPriceA1.getApAir());
            myParameterSourceAry[i].addValue("apAis", wkDataFeedAirticketPriceA1.getApAis());
            myParameterSourceAry[i].addValue("apAit", wkDataFeedAirticketPriceA1.getApAit());
            myParameterSourceAry[i].addValue("apAiu", wkDataFeedAirticketPriceA1.getApAiu());
            myParameterSourceAry[i].addValue("apAiv", wkDataFeedAirticketPriceA1.getApAiv());
            myParameterSourceAry[i].addValue("apAiw", wkDataFeedAirticketPriceA1.getApAiw());
            myParameterSourceAry[i].addValue("apAix", wkDataFeedAirticketPriceA1.getApAix());
            myParameterSourceAry[i].addValue("apAiy", wkDataFeedAirticketPriceA1.getApAiy());
            myParameterSourceAry[i].addValue("apAiz", wkDataFeedAirticketPriceA1.getApAiz());
            myParameterSourceAry[i].addValue("apAja", wkDataFeedAirticketPriceA1.getApAja());
            myParameterSourceAry[i].addValue("apAjb", wkDataFeedAirticketPriceA1.getApAjb());
            myParameterSourceAry[i].addValue("apAjc", wkDataFeedAirticketPriceA1.getApAjc());
            myParameterSourceAry[i].addValue("apAjd", wkDataFeedAirticketPriceA1.getApAjd());
            myParameterSourceAry[i].addValue("apAje", wkDataFeedAirticketPriceA1.getApAje());
            myParameterSourceAry[i].addValue("apAjf", wkDataFeedAirticketPriceA1.getApAjf());
            myParameterSourceAry[i].addValue("apAjg", wkDataFeedAirticketPriceA1.getApAjg());
            myParameterSourceAry[i].addValue("apAjh", wkDataFeedAirticketPriceA1.getApAjh());
            myParameterSourceAry[i].addValue("apAji", wkDataFeedAirticketPriceA1.getApAji());
            myParameterSourceAry[i].addValue("apAjj", wkDataFeedAirticketPriceA1.getApAjj());
            myParameterSourceAry[i].addValue("apAjk", wkDataFeedAirticketPriceA1.getApAjk());
            myParameterSourceAry[i].addValue("apAjl", wkDataFeedAirticketPriceA1.getApAjl());
            myParameterSourceAry[i].addValue("apAjm", wkDataFeedAirticketPriceA1.getApAjm());
            myParameterSourceAry[i].addValue("apAjn", wkDataFeedAirticketPriceA1.getApAjn());
            myParameterSourceAry[i].addValue("apAjo", wkDataFeedAirticketPriceA1.getApAjo());
            myParameterSourceAry[i].addValue("apAjp", wkDataFeedAirticketPriceA1.getApAjp());
            myParameterSourceAry[i].addValue("apAjq", wkDataFeedAirticketPriceA1.getApAjq());
            myParameterSourceAry[i].addValue("apAjr", wkDataFeedAirticketPriceA1.getApAjr());
            myParameterSourceAry[i].addValue("apAjs", wkDataFeedAirticketPriceA1.getApAjs());
            myParameterSourceAry[i].addValue("apAjt", wkDataFeedAirticketPriceA1.getApAjt());
            myParameterSourceAry[i].addValue("apAju", wkDataFeedAirticketPriceA1.getApAju());
            myParameterSourceAry[i].addValue("apAjv", wkDataFeedAirticketPriceA1.getApAjv());
            myParameterSourceAry[i].addValue("apAjw", wkDataFeedAirticketPriceA1.getApAjw());
            myParameterSourceAry[i].addValue("apAjx", wkDataFeedAirticketPriceA1.getApAjx());
            myParameterSourceAry[i].addValue("apAjy", wkDataFeedAirticketPriceA1.getApAjy());
            myParameterSourceAry[i].addValue("apAjz", wkDataFeedAirticketPriceA1.getApAjz());
            myParameterSourceAry[i].addValue("apAka", wkDataFeedAirticketPriceA1.getApAka());
            myParameterSourceAry[i].addValue("apAkb", wkDataFeedAirticketPriceA1.getApAkb());
            myParameterSourceAry[i].addValue("apAkc", wkDataFeedAirticketPriceA1.getApAkc());
            myParameterSourceAry[i].addValue("apAkd", wkDataFeedAirticketPriceA1.getApAkd());
            myParameterSourceAry[i].addValue("apAke", wkDataFeedAirticketPriceA1.getApAke());
            myParameterSourceAry[i].addValue("apAkf", wkDataFeedAirticketPriceA1.getApAkf());
            myParameterSourceAry[i].addValue("apAkg", wkDataFeedAirticketPriceA1.getApAkg());
            myParameterSourceAry[i].addValue("apAkh", wkDataFeedAirticketPriceA1.getApAkh());
            myParameterSourceAry[i].addValue("apAki", wkDataFeedAirticketPriceA1.getApAki());
            myParameterSourceAry[i].addValue("apAkj", wkDataFeedAirticketPriceA1.getApAkj());
            myParameterSourceAry[i].addValue("apAkk", wkDataFeedAirticketPriceA1.getApAkk());
            myParameterSourceAry[i].addValue("apAkl", wkDataFeedAirticketPriceA1.getApAkl());
            myParameterSourceAry[i].addValue("apAkm", wkDataFeedAirticketPriceA1.getApAkm());
            myParameterSourceAry[i].addValue("apAkn", wkDataFeedAirticketPriceA1.getApAkn());
            myParameterSourceAry[i].addValue("apAko", wkDataFeedAirticketPriceA1.getApAko());
            myParameterSourceAry[i].addValue("apAkp", wkDataFeedAirticketPriceA1.getApAkp());
            myParameterSourceAry[i].addValue("apAkq", wkDataFeedAirticketPriceA1.getApAkq());
            myParameterSourceAry[i].addValue("apAkr", wkDataFeedAirticketPriceA1.getApAkr());
            myParameterSourceAry[i].addValue("apAks", wkDataFeedAirticketPriceA1.getApAks());
            myParameterSourceAry[i].addValue("apAkt", wkDataFeedAirticketPriceA1.getApAkt());
            myParameterSourceAry[i].addValue("apAku", wkDataFeedAirticketPriceA1.getApAku());
            myParameterSourceAry[i].addValue("apAkv", wkDataFeedAirticketPriceA1.getApAkv());
            myParameterSourceAry[i].addValue("apAkw", wkDataFeedAirticketPriceA1.getApAkw());
            myParameterSourceAry[i].addValue("apAkx", wkDataFeedAirticketPriceA1.getApAkx());
            myParameterSourceAry[i].addValue("apAky", wkDataFeedAirticketPriceA1.getApAky());
            myParameterSourceAry[i].addValue("apAkz", wkDataFeedAirticketPriceA1.getApAkz());
            myParameterSourceAry[i].addValue("apAla", wkDataFeedAirticketPriceA1.getApAla());
            myParameterSourceAry[i].addValue("apAlb", wkDataFeedAirticketPriceA1.getApAlb());
            myParameterSourceAry[i].addValue("apAlc", wkDataFeedAirticketPriceA1.getApAlc());
            myParameterSourceAry[i].addValue("apAld", wkDataFeedAirticketPriceA1.getApAld());
            myParameterSourceAry[i].addValue("apAle", wkDataFeedAirticketPriceA1.getApAle());
            myParameterSourceAry[i].addValue("apAlf", wkDataFeedAirticketPriceA1.getApAlf());
            myParameterSourceAry[i].addValue("apAlg", wkDataFeedAirticketPriceA1.getApAlg());
            myParameterSourceAry[i].addValue("apAlh", wkDataFeedAirticketPriceA1.getApAlh());
            myParameterSourceAry[i].addValue("apAli", wkDataFeedAirticketPriceA1.getApAli());
            myParameterSourceAry[i].addValue("apAlj", wkDataFeedAirticketPriceA1.getApAlj());
            myParameterSourceAry[i].addValue("apAlk", wkDataFeedAirticketPriceA1.getApAlk());
            myParameterSourceAry[i].addValue("apAll", wkDataFeedAirticketPriceA1.getApAll());
            myParameterSourceAry[i].addValue("apAlm", wkDataFeedAirticketPriceA1.getApAlm());
            myParameterSourceAry[i].addValue("apAln", wkDataFeedAirticketPriceA1.getApAln());
            myParameterSourceAry[i].addValue("apAlo", wkDataFeedAirticketPriceA1.getApAlo());
            myParameterSourceAry[i].addValue("apAlp", wkDataFeedAirticketPriceA1.getApAlp());
            myParameterSourceAry[i].addValue("apAlq", wkDataFeedAirticketPriceA1.getApAlq());
            myParameterSourceAry[i].addValue("apAlr", wkDataFeedAirticketPriceA1.getApAlr());
            myParameterSourceAry[i].addValue("apAls", wkDataFeedAirticketPriceA1.getApAls());
            myParameterSourceAry[i].addValue("apAlt", wkDataFeedAirticketPriceA1.getApAlt());
            myParameterSourceAry[i].addValue("apAlu", wkDataFeedAirticketPriceA1.getApAlu());
            myParameterSourceAry[i].addValue("apAlv", wkDataFeedAirticketPriceA1.getApAlv());
            myParameterSourceAry[i].addValue("apAlw", wkDataFeedAirticketPriceA1.getApAlw());
            myParameterSourceAry[i].addValue("apAlx", wkDataFeedAirticketPriceA1.getApAlx());
            myParameterSourceAry[i].addValue("apAly", wkDataFeedAirticketPriceA1.getApAly());
            myParameterSourceAry[i].addValue("apAlz", wkDataFeedAirticketPriceA1.getApAlz());
            myParameterSourceAry[i].addValue("apAma", wkDataFeedAirticketPriceA1.getApAma());
            myParameterSourceAry[i].addValue("apAmb", wkDataFeedAirticketPriceA1.getApAmb());
            myParameterSourceAry[i].addValue("apAmc", wkDataFeedAirticketPriceA1.getApAmc());
            myParameterSourceAry[i].addValue("apAmd", wkDataFeedAirticketPriceA1.getApAmd());
            myParameterSourceAry[i].addValue("apAme", wkDataFeedAirticketPriceA1.getApAme());
            myParameterSourceAry[i].addValue("apAmf", wkDataFeedAirticketPriceA1.getApAmf());
            myParameterSourceAry[i].addValue("apAmg", wkDataFeedAirticketPriceA1.getApAmg());
            myParameterSourceAry[i].addValue("apAmh", wkDataFeedAirticketPriceA1.getApAmh());
            myParameterSourceAry[i].addValue("apAmi", wkDataFeedAirticketPriceA1.getApAmi());
            myParameterSourceAry[i].addValue("apAmj", wkDataFeedAirticketPriceA1.getApAmj());
            myParameterSourceAry[i].addValue("apAmk", wkDataFeedAirticketPriceA1.getApAmk());
            myParameterSourceAry[i].addValue("apAml", wkDataFeedAirticketPriceA1.getApAml());
            myParameterSourceAry[i].addValue("apAmm", wkDataFeedAirticketPriceA1.getApAmm());
            myParameterSourceAry[i].addValue("apAmn", wkDataFeedAirticketPriceA1.getApAmn());
            myParameterSourceAry[i].addValue("apAmo", wkDataFeedAirticketPriceA1.getApAmo());
            myParameterSourceAry[i].addValue("apAmp", wkDataFeedAirticketPriceA1.getApAmp());
            myParameterSourceAry[i].addValue("apAmq", wkDataFeedAirticketPriceA1.getApAmq());
            myParameterSourceAry[i].addValue("apAmr", wkDataFeedAirticketPriceA1.getApAmr());
            myParameterSourceAry[i].addValue("apAms", wkDataFeedAirticketPriceA1.getApAms());
            myParameterSourceAry[i].addValue("apAmt", wkDataFeedAirticketPriceA1.getApAmt());
            myParameterSourceAry[i].addValue("apAmu", wkDataFeedAirticketPriceA1.getApAmu());
            myParameterSourceAry[i].addValue("apAmv", wkDataFeedAirticketPriceA1.getApAmv());
            myParameterSourceAry[i].addValue("apAmw", wkDataFeedAirticketPriceA1.getApAmw());
            myParameterSourceAry[i].addValue("apAmx", wkDataFeedAirticketPriceA1.getApAmx());
            myParameterSourceAry[i].addValue("apAmy", wkDataFeedAirticketPriceA1.getApAmy());
            myParameterSourceAry[i].addValue("apAmz", wkDataFeedAirticketPriceA1.getApAmz());
        }

        myNamedParameterJdbcTemplate.batchUpdate(mySql, myParameterSourceAry);
    }

    @Override
    public void deleteDataFeedAirticketPriceA1sByFileNo(Integer fileNo) {
        String mySql = "DELETE FROM db_airticket.data_feed_airticket_price_a1 " +
                " WHERE file_no = :fileNo ";

        Map<String,Object> myMap = new HashMap<>();
        myMap.put("fileNo", fileNo);

        myNamedParameterJdbcTemplate.update(mySql, myMap);
    }

}
