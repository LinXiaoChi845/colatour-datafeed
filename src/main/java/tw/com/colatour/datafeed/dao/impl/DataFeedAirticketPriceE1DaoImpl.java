package tw.com.colatour.datafeed.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Component;
import tw.com.colatour.datafeed.dao.DataFeedAirticketPriceE1Dao;
import tw.com.colatour.datafeed.model.DataFeedAirticketPriceE1;

import java.util.List;

@Component
public class DataFeedAirticketPriceE1DaoImpl implements DataFeedAirticketPriceE1Dao {

    @Autowired
    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    @Override
    public void createDataFeedAirticketPriceE1s(List<DataFeedAirticketPriceE1> dataFeedAirticketPriceE1List) {
        String mySql = "INSERT INTO data_feed.data_feed_airticket_price_E1 ( " +
                " file_no, price_no, " +
                " ap_eaa, ap_eab, ap_eac, ap_ead, ap_eae, ap_eaf, ap_eag, ap_eah, ap_eai, ap_eaj, ap_eak, ap_eal, ap_eam, " +
                " ap_ean, ap_eao, ap_eap, ap_eaq, ap_ear, ap_eas, ap_eat, ap_eau, ap_eav, ap_eaw, ap_eax, ap_eay, ap_eaz, " +
                " ap_eba, ap_ebb, ap_ebc, ap_ebd, ap_ebe, ap_ebf, ap_ebg, ap_ebh, ap_ebi, ap_ebj, ap_ebk, ap_ebl, ap_ebm, " +
                " ap_ebn, ap_ebo, ap_ebp, ap_ebq, ap_ebr, ap_ebs, ap_ebt, ap_ebu, ap_ebv, ap_ebw, ap_ebx, ap_eby, ap_ebz, " +
                " ap_eca, ap_ecb, ap_ecc, ap_ecd, ap_ece, ap_ecf, ap_ecg, ap_ech, ap_eci, ap_ecj, ap_eck, ap_ecl, ap_ecm, " +
                " ap_ecn, ap_eco, ap_ecp, ap_ecq, ap_ecr, ap_ecs, ap_ect, ap_ecu, ap_ecv, ap_ecw, ap_ecx, ap_ecy, ap_ecz, " +
                " ap_eda, ap_edb, ap_edc, ap_edd, ap_ede, ap_edf, ap_edg, ap_edh, ap_edi, ap_edj, ap_edk, ap_edl, ap_edm, " +
                " ap_edn, ap_edo, ap_edp, ap_edq, ap_edr, ap_eds, ap_edt, ap_edu, ap_edv, ap_edw, ap_edx, ap_edy, ap_edz, " +
                " ap_eea, ap_eeb, ap_eec, ap_eed, ap_eee, ap_eef, ap_eeg, ap_eeh, ap_eei, ap_eej, ap_eek, ap_eel, ap_eem, " +
                " ap_een, ap_eeo, ap_eep, ap_eeq, ap_eer, ap_ees, ap_eet, ap_eeu, ap_eev, ap_eew, ap_eex, ap_eey, ap_eez, " +
                " ap_efa, ap_efb, ap_efc, ap_efd, ap_efe, ap_eff, ap_efg, ap_efh, ap_efi, ap_efj, ap_efk, ap_efl, ap_efm, " +
                " ap_efn, ap_efo, ap_efp, ap_efq, ap_efr, ap_efs, ap_eft, ap_efu, ap_efv, ap_efw, ap_efx, ap_efy, ap_efz, " +
                " ap_ega, ap_egb, ap_egc, ap_egd, ap_ege, ap_egf, ap_egg, ap_egh, ap_egi, ap_egj, ap_egk, ap_egl, ap_egm, " +
                " ap_egn, ap_ego, ap_egp, ap_egq, ap_egr, ap_egs, ap_egt, ap_egu, ap_egv, ap_egw, ap_egx, ap_egy, ap_egz, " +
                " ap_eha, ap_ehb, ap_ehc, ap_ehd, ap_ehe, ap_ehf, ap_ehg, ap_ehh, ap_ehi, ap_ehj, ap_ehk, ap_ehl, ap_ehm, " +
                " ap_ehn, ap_eho, ap_ehp, ap_ehq, ap_ehr, ap_ehs, ap_eht, ap_ehu, ap_ehv, ap_ehw, ap_ehx, ap_ehy, ap_ehz, " +
                " ap_eia, ap_eib, ap_eic, ap_eid, ap_eie, ap_eif, ap_eig, ap_eih, ap_eii, ap_eij, ap_eik, ap_eil, ap_eim, " +
                " ap_ein, ap_eio, ap_eip, ap_eiq, ap_eir, ap_eis, ap_eit, ap_eiu, ap_eiv, ap_eiw, ap_eix, ap_eiy, ap_eiz, " +
                " ap_eja, ap_ejb, ap_ejc, ap_ejd, ap_eje, ap_ejf, ap_ejg, ap_ejh, ap_eji, ap_ejj, ap_ejk, ap_ejl, ap_ejm, " +
                " ap_ejn, ap_ejo, ap_ejp, ap_ejq, ap_ejr, ap_ejs, ap_ejt, ap_eju, ap_ejv, ap_ejw, ap_ejx, ap_ejy, ap_ejz, " +
                " ap_eka, ap_ekb, ap_ekc, ap_ekd, ap_eke, ap_ekf, ap_ekg, ap_ekh, ap_eki, ap_ekj, ap_ekk, ap_ekl, ap_ekm, " +
                " ap_ekn, ap_eko, ap_ekp, ap_ekq, ap_ekr, ap_eks, ap_ekt, ap_eku, ap_ekv, ap_ekw, ap_ekx, ap_eky, ap_ekz, " +
                " ap_ela, ap_elb, ap_elc, ap_eld, ap_ele, ap_elf, ap_elg, ap_elh, ap_eli, ap_elj, ap_elk, ap_ell, ap_elm, " +
                " ap_eln, ap_elo, ap_elp, ap_elq, ap_elr, ap_els, ap_elt, ap_elu, ap_elv, ap_elw, ap_elx, ap_ely, ap_elz, " +
                " ap_ema, ap_emb, ap_emc, ap_emd, ap_eme, ap_emf, ap_emg, ap_emh, ap_emi, ap_emj, ap_emk, ap_eml, ap_emm, " +
                " ap_emn, ap_emo, ap_emp, ap_emq, ap_emr, ap_ems, ap_emt, ap_emu, ap_emv, ap_emw, ap_emx, ap_emy, ap_emz ) " +
                " VALUES ( " +
                " :fileNo, :priceNo, " +
                " :apEaa, :apEab, :apEac, :apEad, :apEae, :apEaf, :apEag, :apEah, :apEai, :apEaj, :apEak, :apEal, :apEam, " +
                " :apEan, :apEao, :apEap, :apEaq, :apEar, :apEas, :apEat, :apEau, :apEav, :apEaw, :apEax, :apEay, :apEaz, " +
                " :apEba, :apEbb, :apEbc, :apEbd, :apEbe, :apEbf, :apEbg, :apEbh, :apEbi, :apEbj, :apEbk, :apEbl, :apEbm, " +
                " :apEbn, :apEbo, :apEbp, :apEbq, :apEbr, :apEbs, :apEbt, :apEbu, :apEbv, :apEbw, :apEbx, :apEby, :apEbz, " +
                " :apEca, :apEcb, :apEcc, :apEcd, :apEce, :apEcf, :apEcg, :apEch, :apEci, :apEcj, :apEck, :apEcl, :apEcm, " +
                " :apEcn, :apEco, :apEcp, :apEcq, :apEcr, :apEcs, :apEct, :apEcu, :apEcv, :apEcw, :apEcx, :apEcy, :apEcz, " +
                " :apEda, :apEdb, :apEdc, :apEdd, :apEde, :apEdf, :apEdg, :apEdh, :apEdi, :apEdj, :apEdk, :apEdl, :apEdm, " +
                " :apEdn, :apEdo, :apEdp, :apEdq, :apEdr, :apEds, :apEdt, :apEdu, :apEdv, :apEdw, :apEdx, :apEdy, :apEdz, " +
                " :apEea, :apEeb, :apEec, :apEed, :apEee, :apEef, :apEeg, :apEeh, :apEei, :apEej, :apEek, :apEel, :apEem, " +
                " :apEen, :apEeo, :apEep, :apEeq, :apEer, :apEes, :apEet, :apEeu, :apEev, :apEew, :apEex, :apEey, :apEez, " +
                " :apEfa, :apEfb, :apEfc, :apEfd, :apEfe, :apEff, :apEfg, :apEfh, :apEfi, :apEfj, :apEfk, :apEfl, :apEfm, " +
                " :apEfn, :apEfo, :apEfp, :apEfq, :apEfr, :apEfs, :apEft, :apEfu, :apEfv, :apEfw, :apEfx, :apEfy, :apEfz, " +
                " :apEga, :apEgb, :apEgc, :apEgd, :apEge, :apEgf, :apEgg, :apEgh, :apEgi, :apEgj, :apEgk, :apEgl, :apEgm, " +
                " :apEgn, :apEgo, :apEgp, :apEgq, :apEgr, :apEgs, :apEgt, :apEgu, :apEgv, :apEgw, :apEgx, :apEgy, :apEgz, " +
                " :apEha, :apEhb, :apEhc, :apEhd, :apEhe, :apEhf, :apEhg, :apEhh, :apEhi, :apEhj, :apEhk, :apEhl, :apEhm, " +
                " :apEhn, :apEho, :apEhp, :apEhq, :apEhr, :apEhs, :apEht, :apEhu, :apEhv, :apEhw, :apEhx, :apEhy, :apEhz, " +
                " :apEia, :apEib, :apEic, :apEid, :apEie, :apEif, :apEig, :apEih, :apEii, :apEij, :apEik, :apEil, :apEim, " +
                " :apEin, :apEio, :apEip, :apEiq, :apEir, :apEis, :apEit, :apEiu, :apEiv, :apEiw, :apEix, :apEiy, :apEiz, " +
                " :apEja, :apEjb, :apEjc, :apEjd, :apEje, :apEjf, :apEjg, :apEjh, :apEji, :apEjj, :apEjk, :apEjl, :apEjm, " +
                " :apEjn, :apEjo, :apEjp, :apEjq, :apEjr, :apEjs, :apEjt, :apEju, :apEjv, :apEjw, :apEjx, :apEjy, :apEjz, " +
                " :apEka, :apEkb, :apEkc, :apEkd, :apEke, :apEkf, :apEkg, :apEkh, :apEki, :apEkj, :apEkk, :apEkl, :apEkm, " +
                " :apEkn, :apEko, :apEkp, :apEkq, :apEkr, :apEks, :apEkt, :apEku, :apEkv, :apEkw, :apEkx, :apEky, :apEkz, " +
                " :apEla, :apElb, :apElc, :apEld, :apEle, :apElf, :apElg, :apElh, :apEli, :apElj, :apElk, :apEll, :apElm, " +
                " :apEln, :apElo, :apElp, :apElq, :apElr, :apEls, :apElt, :apElu, :apElv, :apElw, :apElx, :apEly, :apElz, " +
                " :apEma, :apEmb, :apEmc, :apEmd, :apEme, :apEmf, :apEmg, :apEmh, :apEmi, :apEmj, :apEmk, :apEml, :apEmm, " +
                " :apEmn, :apEmo, :apEmp, :apEmq, :apEmr, :apEms, :apEmt, :apEmu, :apEmv, :apEmw, :apEmx, :apEmy, :apEmz ) ";

        MapSqlParameterSource[] myParameterSourceAry = new MapSqlParameterSource[dataFeedAirticketPriceE1List.size()];

        for (int i = 0; i < dataFeedAirticketPriceE1List.size(); i++) {
            DataFeedAirticketPriceE1 wkDataFeedAirticketPriceE1 = dataFeedAirticketPriceE1List.get(i);

            myParameterSourceAry[i] = new MapSqlParameterSource();

            myParameterSourceAry[i].addValue("fileNo", wkDataFeedAirticketPriceE1.getFileNo());
            myParameterSourceAry[i].addValue("priceNo", wkDataFeedAirticketPriceE1.getPriceNo());
            myParameterSourceAry[i].addValue("apEaa", wkDataFeedAirticketPriceE1.getApEaa());
            myParameterSourceAry[i].addValue("apEab", wkDataFeedAirticketPriceE1.getApEab());
            myParameterSourceAry[i].addValue("apEac", wkDataFeedAirticketPriceE1.getApEac());
            myParameterSourceAry[i].addValue("apEad", wkDataFeedAirticketPriceE1.getApEad());
            myParameterSourceAry[i].addValue("apEae", wkDataFeedAirticketPriceE1.getApEae());
            myParameterSourceAry[i].addValue("apEaf", wkDataFeedAirticketPriceE1.getApEaf());
            myParameterSourceAry[i].addValue("apEag", wkDataFeedAirticketPriceE1.getApEag());
            myParameterSourceAry[i].addValue("apEah", wkDataFeedAirticketPriceE1.getApEah());
            myParameterSourceAry[i].addValue("apEai", wkDataFeedAirticketPriceE1.getApEai());
            myParameterSourceAry[i].addValue("apEaj", wkDataFeedAirticketPriceE1.getApEaj());
            myParameterSourceAry[i].addValue("apEak", wkDataFeedAirticketPriceE1.getApEak());
            myParameterSourceAry[i].addValue("apEal", wkDataFeedAirticketPriceE1.getApEal());
            myParameterSourceAry[i].addValue("apEam", wkDataFeedAirticketPriceE1.getApEam());
            myParameterSourceAry[i].addValue("apEan", wkDataFeedAirticketPriceE1.getApEan());
            myParameterSourceAry[i].addValue("apEao", wkDataFeedAirticketPriceE1.getApEao());
            myParameterSourceAry[i].addValue("apEap", wkDataFeedAirticketPriceE1.getApEap());
            myParameterSourceAry[i].addValue("apEaq", wkDataFeedAirticketPriceE1.getApEaq());
            myParameterSourceAry[i].addValue("apEar", wkDataFeedAirticketPriceE1.getApEar());
            myParameterSourceAry[i].addValue("apEas", wkDataFeedAirticketPriceE1.getApEas());
            myParameterSourceAry[i].addValue("apEat", wkDataFeedAirticketPriceE1.getApEat());
            myParameterSourceAry[i].addValue("apEau", wkDataFeedAirticketPriceE1.getApEau());
            myParameterSourceAry[i].addValue("apEav", wkDataFeedAirticketPriceE1.getApEav());
            myParameterSourceAry[i].addValue("apEaw", wkDataFeedAirticketPriceE1.getApEaw());
            myParameterSourceAry[i].addValue("apEax", wkDataFeedAirticketPriceE1.getApEax());
            myParameterSourceAry[i].addValue("apEay", wkDataFeedAirticketPriceE1.getApEay());
            myParameterSourceAry[i].addValue("apEaz", wkDataFeedAirticketPriceE1.getApEaz());
            myParameterSourceAry[i].addValue("apEba", wkDataFeedAirticketPriceE1.getApEba());
            myParameterSourceAry[i].addValue("apEbb", wkDataFeedAirticketPriceE1.getApEbb());
            myParameterSourceAry[i].addValue("apEbc", wkDataFeedAirticketPriceE1.getApEbc());
            myParameterSourceAry[i].addValue("apEbd", wkDataFeedAirticketPriceE1.getApEbd());
            myParameterSourceAry[i].addValue("apEbe", wkDataFeedAirticketPriceE1.getApEbe());
            myParameterSourceAry[i].addValue("apEbf", wkDataFeedAirticketPriceE1.getApEbf());
            myParameterSourceAry[i].addValue("apEbg", wkDataFeedAirticketPriceE1.getApEbg());
            myParameterSourceAry[i].addValue("apEbh", wkDataFeedAirticketPriceE1.getApEbh());
            myParameterSourceAry[i].addValue("apEbi", wkDataFeedAirticketPriceE1.getApEbi());
            myParameterSourceAry[i].addValue("apEbj", wkDataFeedAirticketPriceE1.getApEbj());
            myParameterSourceAry[i].addValue("apEbk", wkDataFeedAirticketPriceE1.getApEbk());
            myParameterSourceAry[i].addValue("apEbl", wkDataFeedAirticketPriceE1.getApEbl());
            myParameterSourceAry[i].addValue("apEbm", wkDataFeedAirticketPriceE1.getApEbm());
            myParameterSourceAry[i].addValue("apEbn", wkDataFeedAirticketPriceE1.getApEbn());
            myParameterSourceAry[i].addValue("apEbo", wkDataFeedAirticketPriceE1.getApEbo());
            myParameterSourceAry[i].addValue("apEbp", wkDataFeedAirticketPriceE1.getApEbp());
            myParameterSourceAry[i].addValue("apEbq", wkDataFeedAirticketPriceE1.getApEbq());
            myParameterSourceAry[i].addValue("apEbr", wkDataFeedAirticketPriceE1.getApEbr());
            myParameterSourceAry[i].addValue("apEbs", wkDataFeedAirticketPriceE1.getApEbs());
            myParameterSourceAry[i].addValue("apEbt", wkDataFeedAirticketPriceE1.getApEbt());
            myParameterSourceAry[i].addValue("apEbu", wkDataFeedAirticketPriceE1.getApEbu());
            myParameterSourceAry[i].addValue("apEbv", wkDataFeedAirticketPriceE1.getApEbv());
            myParameterSourceAry[i].addValue("apEbw", wkDataFeedAirticketPriceE1.getApEbw());
            myParameterSourceAry[i].addValue("apEbx", wkDataFeedAirticketPriceE1.getApEbx());
            myParameterSourceAry[i].addValue("apEby", wkDataFeedAirticketPriceE1.getApEby());
            myParameterSourceAry[i].addValue("apEbz", wkDataFeedAirticketPriceE1.getApEbz());
            myParameterSourceAry[i].addValue("apEca", wkDataFeedAirticketPriceE1.getApEca());
            myParameterSourceAry[i].addValue("apEcb", wkDataFeedAirticketPriceE1.getApEcb());
            myParameterSourceAry[i].addValue("apEcc", wkDataFeedAirticketPriceE1.getApEcc());
            myParameterSourceAry[i].addValue("apEcd", wkDataFeedAirticketPriceE1.getApEcd());
            myParameterSourceAry[i].addValue("apEce", wkDataFeedAirticketPriceE1.getApEce());
            myParameterSourceAry[i].addValue("apEcf", wkDataFeedAirticketPriceE1.getApEcf());
            myParameterSourceAry[i].addValue("apEcg", wkDataFeedAirticketPriceE1.getApEcg());
            myParameterSourceAry[i].addValue("apEch", wkDataFeedAirticketPriceE1.getApEch());
            myParameterSourceAry[i].addValue("apEci", wkDataFeedAirticketPriceE1.getApEci());
            myParameterSourceAry[i].addValue("apEcj", wkDataFeedAirticketPriceE1.getApEcj());
            myParameterSourceAry[i].addValue("apEck", wkDataFeedAirticketPriceE1.getApEck());
            myParameterSourceAry[i].addValue("apEcl", wkDataFeedAirticketPriceE1.getApEcl());
            myParameterSourceAry[i].addValue("apEcm", wkDataFeedAirticketPriceE1.getApEcm());
            myParameterSourceAry[i].addValue("apEcn", wkDataFeedAirticketPriceE1.getApEcn());
            myParameterSourceAry[i].addValue("apEco", wkDataFeedAirticketPriceE1.getApEco());
            myParameterSourceAry[i].addValue("apEcp", wkDataFeedAirticketPriceE1.getApEcp());
            myParameterSourceAry[i].addValue("apEcq", wkDataFeedAirticketPriceE1.getApEcq());
            myParameterSourceAry[i].addValue("apEcr", wkDataFeedAirticketPriceE1.getApEcr());
            myParameterSourceAry[i].addValue("apEcs", wkDataFeedAirticketPriceE1.getApEcs());
            myParameterSourceAry[i].addValue("apEct", wkDataFeedAirticketPriceE1.getApEct());
            myParameterSourceAry[i].addValue("apEcu", wkDataFeedAirticketPriceE1.getApEcu());
            myParameterSourceAry[i].addValue("apEcv", wkDataFeedAirticketPriceE1.getApEcv());
            myParameterSourceAry[i].addValue("apEcw", wkDataFeedAirticketPriceE1.getApEcw());
            myParameterSourceAry[i].addValue("apEcx", wkDataFeedAirticketPriceE1.getApEcx());
            myParameterSourceAry[i].addValue("apEcy", wkDataFeedAirticketPriceE1.getApEcy());
            myParameterSourceAry[i].addValue("apEcz", wkDataFeedAirticketPriceE1.getApEcz());
            myParameterSourceAry[i].addValue("apEda", wkDataFeedAirticketPriceE1.getApEda());
            myParameterSourceAry[i].addValue("apEdb", wkDataFeedAirticketPriceE1.getApEdb());
            myParameterSourceAry[i].addValue("apEdc", wkDataFeedAirticketPriceE1.getApEdc());
            myParameterSourceAry[i].addValue("apEdd", wkDataFeedAirticketPriceE1.getApEdd());
            myParameterSourceAry[i].addValue("apEde", wkDataFeedAirticketPriceE1.getApEde());
            myParameterSourceAry[i].addValue("apEdf", wkDataFeedAirticketPriceE1.getApEdf());
            myParameterSourceAry[i].addValue("apEdg", wkDataFeedAirticketPriceE1.getApEdg());
            myParameterSourceAry[i].addValue("apEdh", wkDataFeedAirticketPriceE1.getApEdh());
            myParameterSourceAry[i].addValue("apEdi", wkDataFeedAirticketPriceE1.getApEdi());
            myParameterSourceAry[i].addValue("apEdj", wkDataFeedAirticketPriceE1.getApEdj());
            myParameterSourceAry[i].addValue("apEdk", wkDataFeedAirticketPriceE1.getApEdk());
            myParameterSourceAry[i].addValue("apEdl", wkDataFeedAirticketPriceE1.getApEdl());
            myParameterSourceAry[i].addValue("apEdm", wkDataFeedAirticketPriceE1.getApEdm());
            myParameterSourceAry[i].addValue("apEdn", wkDataFeedAirticketPriceE1.getApEdn());
            myParameterSourceAry[i].addValue("apEdo", wkDataFeedAirticketPriceE1.getApEdo());
            myParameterSourceAry[i].addValue("apEdp", wkDataFeedAirticketPriceE1.getApEdp());
            myParameterSourceAry[i].addValue("apEdq", wkDataFeedAirticketPriceE1.getApEdq());
            myParameterSourceAry[i].addValue("apEdr", wkDataFeedAirticketPriceE1.getApEdr());
            myParameterSourceAry[i].addValue("apEds", wkDataFeedAirticketPriceE1.getApEds());
            myParameterSourceAry[i].addValue("apEdt", wkDataFeedAirticketPriceE1.getApEdt());
            myParameterSourceAry[i].addValue("apEdu", wkDataFeedAirticketPriceE1.getApEdu());
            myParameterSourceAry[i].addValue("apEdv", wkDataFeedAirticketPriceE1.getApEdv());
            myParameterSourceAry[i].addValue("apEdw", wkDataFeedAirticketPriceE1.getApEdw());
            myParameterSourceAry[i].addValue("apEdx", wkDataFeedAirticketPriceE1.getApEdx());
            myParameterSourceAry[i].addValue("apEdy", wkDataFeedAirticketPriceE1.getApEdy());
            myParameterSourceAry[i].addValue("apEdz", wkDataFeedAirticketPriceE1.getApEdz());
            myParameterSourceAry[i].addValue("apEea", wkDataFeedAirticketPriceE1.getApEea());
            myParameterSourceAry[i].addValue("apEeb", wkDataFeedAirticketPriceE1.getApEeb());
            myParameterSourceAry[i].addValue("apEec", wkDataFeedAirticketPriceE1.getApEec());
            myParameterSourceAry[i].addValue("apEed", wkDataFeedAirticketPriceE1.getApEed());
            myParameterSourceAry[i].addValue("apEee", wkDataFeedAirticketPriceE1.getApEee());
            myParameterSourceAry[i].addValue("apEef", wkDataFeedAirticketPriceE1.getApEef());
            myParameterSourceAry[i].addValue("apEeg", wkDataFeedAirticketPriceE1.getApEeg());
            myParameterSourceAry[i].addValue("apEeh", wkDataFeedAirticketPriceE1.getApEeh());
            myParameterSourceAry[i].addValue("apEei", wkDataFeedAirticketPriceE1.getApEei());
            myParameterSourceAry[i].addValue("apEej", wkDataFeedAirticketPriceE1.getApEej());
            myParameterSourceAry[i].addValue("apEek", wkDataFeedAirticketPriceE1.getApEek());
            myParameterSourceAry[i].addValue("apEel", wkDataFeedAirticketPriceE1.getApEel());
            myParameterSourceAry[i].addValue("apEem", wkDataFeedAirticketPriceE1.getApEem());
            myParameterSourceAry[i].addValue("apEen", wkDataFeedAirticketPriceE1.getApEen());
            myParameterSourceAry[i].addValue("apEeo", wkDataFeedAirticketPriceE1.getApEeo());
            myParameterSourceAry[i].addValue("apEep", wkDataFeedAirticketPriceE1.getApEep());
            myParameterSourceAry[i].addValue("apEeq", wkDataFeedAirticketPriceE1.getApEeq());
            myParameterSourceAry[i].addValue("apEer", wkDataFeedAirticketPriceE1.getApEer());
            myParameterSourceAry[i].addValue("apEes", wkDataFeedAirticketPriceE1.getApEes());
            myParameterSourceAry[i].addValue("apEet", wkDataFeedAirticketPriceE1.getApEet());
            myParameterSourceAry[i].addValue("apEeu", wkDataFeedAirticketPriceE1.getApEeu());
            myParameterSourceAry[i].addValue("apEev", wkDataFeedAirticketPriceE1.getApEev());
            myParameterSourceAry[i].addValue("apEew", wkDataFeedAirticketPriceE1.getApEew());
            myParameterSourceAry[i].addValue("apEex", wkDataFeedAirticketPriceE1.getApEex());
            myParameterSourceAry[i].addValue("apEey", wkDataFeedAirticketPriceE1.getApEey());
            myParameterSourceAry[i].addValue("apEez", wkDataFeedAirticketPriceE1.getApEez());
            myParameterSourceAry[i].addValue("apEfa", wkDataFeedAirticketPriceE1.getApEfa());
            myParameterSourceAry[i].addValue("apEfb", wkDataFeedAirticketPriceE1.getApEfb());
            myParameterSourceAry[i].addValue("apEfc", wkDataFeedAirticketPriceE1.getApEfc());
            myParameterSourceAry[i].addValue("apEfd", wkDataFeedAirticketPriceE1.getApEfd());
            myParameterSourceAry[i].addValue("apEfe", wkDataFeedAirticketPriceE1.getApEfe());
            myParameterSourceAry[i].addValue("apEff", wkDataFeedAirticketPriceE1.getApEff());
            myParameterSourceAry[i].addValue("apEfg", wkDataFeedAirticketPriceE1.getApEfg());
            myParameterSourceAry[i].addValue("apEfh", wkDataFeedAirticketPriceE1.getApEfh());
            myParameterSourceAry[i].addValue("apEfi", wkDataFeedAirticketPriceE1.getApEfi());
            myParameterSourceAry[i].addValue("apEfj", wkDataFeedAirticketPriceE1.getApEfj());
            myParameterSourceAry[i].addValue("apEfk", wkDataFeedAirticketPriceE1.getApEfk());
            myParameterSourceAry[i].addValue("apEfl", wkDataFeedAirticketPriceE1.getApEfl());
            myParameterSourceAry[i].addValue("apEfm", wkDataFeedAirticketPriceE1.getApEfm());
            myParameterSourceAry[i].addValue("apEfn", wkDataFeedAirticketPriceE1.getApEfn());
            myParameterSourceAry[i].addValue("apEfo", wkDataFeedAirticketPriceE1.getApEfo());
            myParameterSourceAry[i].addValue("apEfp", wkDataFeedAirticketPriceE1.getApEfp());
            myParameterSourceAry[i].addValue("apEfq", wkDataFeedAirticketPriceE1.getApEfq());
            myParameterSourceAry[i].addValue("apEfr", wkDataFeedAirticketPriceE1.getApEfr());
            myParameterSourceAry[i].addValue("apEfs", wkDataFeedAirticketPriceE1.getApEfs());
            myParameterSourceAry[i].addValue("apEft", wkDataFeedAirticketPriceE1.getApEft());
            myParameterSourceAry[i].addValue("apEfu", wkDataFeedAirticketPriceE1.getApEfu());
            myParameterSourceAry[i].addValue("apEfv", wkDataFeedAirticketPriceE1.getApEfv());
            myParameterSourceAry[i].addValue("apEfw", wkDataFeedAirticketPriceE1.getApEfw());
            myParameterSourceAry[i].addValue("apEfx", wkDataFeedAirticketPriceE1.getApEfx());
            myParameterSourceAry[i].addValue("apEfy", wkDataFeedAirticketPriceE1.getApEfy());
            myParameterSourceAry[i].addValue("apEfz", wkDataFeedAirticketPriceE1.getApEfz());
            myParameterSourceAry[i].addValue("apEga", wkDataFeedAirticketPriceE1.getApEga());
            myParameterSourceAry[i].addValue("apEgb", wkDataFeedAirticketPriceE1.getApEgb());
            myParameterSourceAry[i].addValue("apEgc", wkDataFeedAirticketPriceE1.getApEgc());
            myParameterSourceAry[i].addValue("apEgd", wkDataFeedAirticketPriceE1.getApEgd());
            myParameterSourceAry[i].addValue("apEge", wkDataFeedAirticketPriceE1.getApEge());
            myParameterSourceAry[i].addValue("apEgf", wkDataFeedAirticketPriceE1.getApEgf());
            myParameterSourceAry[i].addValue("apEgg", wkDataFeedAirticketPriceE1.getApEgg());
            myParameterSourceAry[i].addValue("apEgh", wkDataFeedAirticketPriceE1.getApEgh());
            myParameterSourceAry[i].addValue("apEgi", wkDataFeedAirticketPriceE1.getApEgi());
            myParameterSourceAry[i].addValue("apEgj", wkDataFeedAirticketPriceE1.getApEgj());
            myParameterSourceAry[i].addValue("apEgk", wkDataFeedAirticketPriceE1.getApEgk());
            myParameterSourceAry[i].addValue("apEgl", wkDataFeedAirticketPriceE1.getApEgl());
            myParameterSourceAry[i].addValue("apEgm", wkDataFeedAirticketPriceE1.getApEgm());
            myParameterSourceAry[i].addValue("apEgn", wkDataFeedAirticketPriceE1.getApEgn());
            myParameterSourceAry[i].addValue("apEgo", wkDataFeedAirticketPriceE1.getApEgo());
            myParameterSourceAry[i].addValue("apEgp", wkDataFeedAirticketPriceE1.getApEgp());
            myParameterSourceAry[i].addValue("apEgq", wkDataFeedAirticketPriceE1.getApEgq());
            myParameterSourceAry[i].addValue("apEgr", wkDataFeedAirticketPriceE1.getApEgr());
            myParameterSourceAry[i].addValue("apEgs", wkDataFeedAirticketPriceE1.getApEgs());
            myParameterSourceAry[i].addValue("apEgt", wkDataFeedAirticketPriceE1.getApEgt());
            myParameterSourceAry[i].addValue("apEgu", wkDataFeedAirticketPriceE1.getApEgu());
            myParameterSourceAry[i].addValue("apEgv", wkDataFeedAirticketPriceE1.getApEgv());
            myParameterSourceAry[i].addValue("apEgw", wkDataFeedAirticketPriceE1.getApEgw());
            myParameterSourceAry[i].addValue("apEgx", wkDataFeedAirticketPriceE1.getApEgx());
            myParameterSourceAry[i].addValue("apEgy", wkDataFeedAirticketPriceE1.getApEgy());
            myParameterSourceAry[i].addValue("apEgz", wkDataFeedAirticketPriceE1.getApEgz());
            myParameterSourceAry[i].addValue("apEha", wkDataFeedAirticketPriceE1.getApEha());
            myParameterSourceAry[i].addValue("apEhb", wkDataFeedAirticketPriceE1.getApEhb());
            myParameterSourceAry[i].addValue("apEhc", wkDataFeedAirticketPriceE1.getApEhc());
            myParameterSourceAry[i].addValue("apEhd", wkDataFeedAirticketPriceE1.getApEhd());
            myParameterSourceAry[i].addValue("apEhe", wkDataFeedAirticketPriceE1.getApEhe());
            myParameterSourceAry[i].addValue("apEhf", wkDataFeedAirticketPriceE1.getApEhf());
            myParameterSourceAry[i].addValue("apEhg", wkDataFeedAirticketPriceE1.getApEhg());
            myParameterSourceAry[i].addValue("apEhh", wkDataFeedAirticketPriceE1.getApEhh());
            myParameterSourceAry[i].addValue("apEhi", wkDataFeedAirticketPriceE1.getApEhi());
            myParameterSourceAry[i].addValue("apEhj", wkDataFeedAirticketPriceE1.getApEhj());
            myParameterSourceAry[i].addValue("apEhk", wkDataFeedAirticketPriceE1.getApEhk());
            myParameterSourceAry[i].addValue("apEhl", wkDataFeedAirticketPriceE1.getApEhl());
            myParameterSourceAry[i].addValue("apEhm", wkDataFeedAirticketPriceE1.getApEhm());
            myParameterSourceAry[i].addValue("apEhn", wkDataFeedAirticketPriceE1.getApEhn());
            myParameterSourceAry[i].addValue("apEho", wkDataFeedAirticketPriceE1.getApEho());
            myParameterSourceAry[i].addValue("apEhp", wkDataFeedAirticketPriceE1.getApEhp());
            myParameterSourceAry[i].addValue("apEhq", wkDataFeedAirticketPriceE1.getApEhq());
            myParameterSourceAry[i].addValue("apEhr", wkDataFeedAirticketPriceE1.getApEhr());
            myParameterSourceAry[i].addValue("apEhs", wkDataFeedAirticketPriceE1.getApEhs());
            myParameterSourceAry[i].addValue("apEht", wkDataFeedAirticketPriceE1.getApEht());
            myParameterSourceAry[i].addValue("apEhu", wkDataFeedAirticketPriceE1.getApEhu());
            myParameterSourceAry[i].addValue("apEhv", wkDataFeedAirticketPriceE1.getApEhv());
            myParameterSourceAry[i].addValue("apEhw", wkDataFeedAirticketPriceE1.getApEhw());
            myParameterSourceAry[i].addValue("apEhx", wkDataFeedAirticketPriceE1.getApEhx());
            myParameterSourceAry[i].addValue("apEhy", wkDataFeedAirticketPriceE1.getApEhy());
            myParameterSourceAry[i].addValue("apEhz", wkDataFeedAirticketPriceE1.getApEhz());
            myParameterSourceAry[i].addValue("apEia", wkDataFeedAirticketPriceE1.getApEia());
            myParameterSourceAry[i].addValue("apEib", wkDataFeedAirticketPriceE1.getApEib());
            myParameterSourceAry[i].addValue("apEic", wkDataFeedAirticketPriceE1.getApEic());
            myParameterSourceAry[i].addValue("apEid", wkDataFeedAirticketPriceE1.getApEid());
            myParameterSourceAry[i].addValue("apEie", wkDataFeedAirticketPriceE1.getApEie());
            myParameterSourceAry[i].addValue("apEif", wkDataFeedAirticketPriceE1.getApEif());
            myParameterSourceAry[i].addValue("apEig", wkDataFeedAirticketPriceE1.getApEig());
            myParameterSourceAry[i].addValue("apEih", wkDataFeedAirticketPriceE1.getApEih());
            myParameterSourceAry[i].addValue("apEii", wkDataFeedAirticketPriceE1.getApEii());
            myParameterSourceAry[i].addValue("apEij", wkDataFeedAirticketPriceE1.getApEij());
            myParameterSourceAry[i].addValue("apEik", wkDataFeedAirticketPriceE1.getApEik());
            myParameterSourceAry[i].addValue("apEil", wkDataFeedAirticketPriceE1.getApEil());
            myParameterSourceAry[i].addValue("apEim", wkDataFeedAirticketPriceE1.getApEim());
            myParameterSourceAry[i].addValue("apEin", wkDataFeedAirticketPriceE1.getApEin());
            myParameterSourceAry[i].addValue("apEio", wkDataFeedAirticketPriceE1.getApEio());
            myParameterSourceAry[i].addValue("apEip", wkDataFeedAirticketPriceE1.getApEip());
            myParameterSourceAry[i].addValue("apEiq", wkDataFeedAirticketPriceE1.getApEiq());
            myParameterSourceAry[i].addValue("apEir", wkDataFeedAirticketPriceE1.getApEir());
            myParameterSourceAry[i].addValue("apEis", wkDataFeedAirticketPriceE1.getApEis());
            myParameterSourceAry[i].addValue("apEit", wkDataFeedAirticketPriceE1.getApEit());
            myParameterSourceAry[i].addValue("apEiu", wkDataFeedAirticketPriceE1.getApEiu());
            myParameterSourceAry[i].addValue("apEiv", wkDataFeedAirticketPriceE1.getApEiv());
            myParameterSourceAry[i].addValue("apEiw", wkDataFeedAirticketPriceE1.getApEiw());
            myParameterSourceAry[i].addValue("apEix", wkDataFeedAirticketPriceE1.getApEix());
            myParameterSourceAry[i].addValue("apEiy", wkDataFeedAirticketPriceE1.getApEiy());
            myParameterSourceAry[i].addValue("apEiz", wkDataFeedAirticketPriceE1.getApEiz());
            myParameterSourceAry[i].addValue("apEja", wkDataFeedAirticketPriceE1.getApEja());
            myParameterSourceAry[i].addValue("apEjb", wkDataFeedAirticketPriceE1.getApEjb());
            myParameterSourceAry[i].addValue("apEjc", wkDataFeedAirticketPriceE1.getApEjc());
            myParameterSourceAry[i].addValue("apEjd", wkDataFeedAirticketPriceE1.getApEjd());
            myParameterSourceAry[i].addValue("apEje", wkDataFeedAirticketPriceE1.getApEje());
            myParameterSourceAry[i].addValue("apEjf", wkDataFeedAirticketPriceE1.getApEjf());
            myParameterSourceAry[i].addValue("apEjg", wkDataFeedAirticketPriceE1.getApEjg());
            myParameterSourceAry[i].addValue("apEjh", wkDataFeedAirticketPriceE1.getApEjh());
            myParameterSourceAry[i].addValue("apEji", wkDataFeedAirticketPriceE1.getApEji());
            myParameterSourceAry[i].addValue("apEjj", wkDataFeedAirticketPriceE1.getApEjj());
            myParameterSourceAry[i].addValue("apEjk", wkDataFeedAirticketPriceE1.getApEjk());
            myParameterSourceAry[i].addValue("apEjl", wkDataFeedAirticketPriceE1.getApEjl());
            myParameterSourceAry[i].addValue("apEjm", wkDataFeedAirticketPriceE1.getApEjm());
            myParameterSourceAry[i].addValue("apEjn", wkDataFeedAirticketPriceE1.getApEjn());
            myParameterSourceAry[i].addValue("apEjo", wkDataFeedAirticketPriceE1.getApEjo());
            myParameterSourceAry[i].addValue("apEjp", wkDataFeedAirticketPriceE1.getApEjp());
            myParameterSourceAry[i].addValue("apEjq", wkDataFeedAirticketPriceE1.getApEjq());
            myParameterSourceAry[i].addValue("apEjr", wkDataFeedAirticketPriceE1.getApEjr());
            myParameterSourceAry[i].addValue("apEjs", wkDataFeedAirticketPriceE1.getApEjs());
            myParameterSourceAry[i].addValue("apEjt", wkDataFeedAirticketPriceE1.getApEjt());
            myParameterSourceAry[i].addValue("apEju", wkDataFeedAirticketPriceE1.getApEju());
            myParameterSourceAry[i].addValue("apEjv", wkDataFeedAirticketPriceE1.getApEjv());
            myParameterSourceAry[i].addValue("apEjw", wkDataFeedAirticketPriceE1.getApEjw());
            myParameterSourceAry[i].addValue("apEjx", wkDataFeedAirticketPriceE1.getApEjx());
            myParameterSourceAry[i].addValue("apEjy", wkDataFeedAirticketPriceE1.getApEjy());
            myParameterSourceAry[i].addValue("apEjz", wkDataFeedAirticketPriceE1.getApEjz());
            myParameterSourceAry[i].addValue("apEka", wkDataFeedAirticketPriceE1.getApEka());
            myParameterSourceAry[i].addValue("apEkb", wkDataFeedAirticketPriceE1.getApEkb());
            myParameterSourceAry[i].addValue("apEkc", wkDataFeedAirticketPriceE1.getApEkc());
            myParameterSourceAry[i].addValue("apEkd", wkDataFeedAirticketPriceE1.getApEkd());
            myParameterSourceAry[i].addValue("apEke", wkDataFeedAirticketPriceE1.getApEke());
            myParameterSourceAry[i].addValue("apEkf", wkDataFeedAirticketPriceE1.getApEkf());
            myParameterSourceAry[i].addValue("apEkg", wkDataFeedAirticketPriceE1.getApEkg());
            myParameterSourceAry[i].addValue("apEkh", wkDataFeedAirticketPriceE1.getApEkh());
            myParameterSourceAry[i].addValue("apEki", wkDataFeedAirticketPriceE1.getApEki());
            myParameterSourceAry[i].addValue("apEkj", wkDataFeedAirticketPriceE1.getApEkj());
            myParameterSourceAry[i].addValue("apEkk", wkDataFeedAirticketPriceE1.getApEkk());
            myParameterSourceAry[i].addValue("apEkl", wkDataFeedAirticketPriceE1.getApEkl());
            myParameterSourceAry[i].addValue("apEkm", wkDataFeedAirticketPriceE1.getApEkm());
            myParameterSourceAry[i].addValue("apEkn", wkDataFeedAirticketPriceE1.getApEkn());
            myParameterSourceAry[i].addValue("apEko", wkDataFeedAirticketPriceE1.getApEko());
            myParameterSourceAry[i].addValue("apEkp", wkDataFeedAirticketPriceE1.getApEkp());
            myParameterSourceAry[i].addValue("apEkq", wkDataFeedAirticketPriceE1.getApEkq());
            myParameterSourceAry[i].addValue("apEkr", wkDataFeedAirticketPriceE1.getApEkr());
            myParameterSourceAry[i].addValue("apEks", wkDataFeedAirticketPriceE1.getApEks());
            myParameterSourceAry[i].addValue("apEkt", wkDataFeedAirticketPriceE1.getApEkt());
            myParameterSourceAry[i].addValue("apEku", wkDataFeedAirticketPriceE1.getApEku());
            myParameterSourceAry[i].addValue("apEkv", wkDataFeedAirticketPriceE1.getApEkv());
            myParameterSourceAry[i].addValue("apEkw", wkDataFeedAirticketPriceE1.getApEkw());
            myParameterSourceAry[i].addValue("apEkx", wkDataFeedAirticketPriceE1.getApEkx());
            myParameterSourceAry[i].addValue("apEky", wkDataFeedAirticketPriceE1.getApEky());
            myParameterSourceAry[i].addValue("apEkz", wkDataFeedAirticketPriceE1.getApEkz());
            myParameterSourceAry[i].addValue("apEla", wkDataFeedAirticketPriceE1.getApEla());
            myParameterSourceAry[i].addValue("apElb", wkDataFeedAirticketPriceE1.getApElb());
            myParameterSourceAry[i].addValue("apElc", wkDataFeedAirticketPriceE1.getApElc());
            myParameterSourceAry[i].addValue("apEld", wkDataFeedAirticketPriceE1.getApEld());
            myParameterSourceAry[i].addValue("apEle", wkDataFeedAirticketPriceE1.getApEle());
            myParameterSourceAry[i].addValue("apElf", wkDataFeedAirticketPriceE1.getApElf());
            myParameterSourceAry[i].addValue("apElg", wkDataFeedAirticketPriceE1.getApElg());
            myParameterSourceAry[i].addValue("apElh", wkDataFeedAirticketPriceE1.getApElh());
            myParameterSourceAry[i].addValue("apEli", wkDataFeedAirticketPriceE1.getApEli());
            myParameterSourceAry[i].addValue("apElj", wkDataFeedAirticketPriceE1.getApElj());
            myParameterSourceAry[i].addValue("apElk", wkDataFeedAirticketPriceE1.getApElk());
            myParameterSourceAry[i].addValue("apEll", wkDataFeedAirticketPriceE1.getApEll());
            myParameterSourceAry[i].addValue("apElm", wkDataFeedAirticketPriceE1.getApElm());
            myParameterSourceAry[i].addValue("apEln", wkDataFeedAirticketPriceE1.getApEln());
            myParameterSourceAry[i].addValue("apElo", wkDataFeedAirticketPriceE1.getApElo());
            myParameterSourceAry[i].addValue("apElp", wkDataFeedAirticketPriceE1.getApElp());
            myParameterSourceAry[i].addValue("apElq", wkDataFeedAirticketPriceE1.getApElq());
            myParameterSourceAry[i].addValue("apElr", wkDataFeedAirticketPriceE1.getApElr());
            myParameterSourceAry[i].addValue("apEls", wkDataFeedAirticketPriceE1.getApEls());
            myParameterSourceAry[i].addValue("apElt", wkDataFeedAirticketPriceE1.getApElt());
            myParameterSourceAry[i].addValue("apElu", wkDataFeedAirticketPriceE1.getApElu());
            myParameterSourceAry[i].addValue("apElv", wkDataFeedAirticketPriceE1.getApElv());
            myParameterSourceAry[i].addValue("apElw", wkDataFeedAirticketPriceE1.getApElw());
            myParameterSourceAry[i].addValue("apElx", wkDataFeedAirticketPriceE1.getApElx());
            myParameterSourceAry[i].addValue("apEly", wkDataFeedAirticketPriceE1.getApEly());
            myParameterSourceAry[i].addValue("apElz", wkDataFeedAirticketPriceE1.getApElz());
            myParameterSourceAry[i].addValue("apEma", wkDataFeedAirticketPriceE1.getApEma());
            myParameterSourceAry[i].addValue("apEmb", wkDataFeedAirticketPriceE1.getApEmb());
            myParameterSourceAry[i].addValue("apEmc", wkDataFeedAirticketPriceE1.getApEmc());
            myParameterSourceAry[i].addValue("apEmd", wkDataFeedAirticketPriceE1.getApEmd());
            myParameterSourceAry[i].addValue("apEme", wkDataFeedAirticketPriceE1.getApEme());
            myParameterSourceAry[i].addValue("apEmf", wkDataFeedAirticketPriceE1.getApEmf());
            myParameterSourceAry[i].addValue("apEmg", wkDataFeedAirticketPriceE1.getApEmg());
            myParameterSourceAry[i].addValue("apEmh", wkDataFeedAirticketPriceE1.getApEmh());
            myParameterSourceAry[i].addValue("apEmi", wkDataFeedAirticketPriceE1.getApEmi());
            myParameterSourceAry[i].addValue("apEmj", wkDataFeedAirticketPriceE1.getApEmj());
            myParameterSourceAry[i].addValue("apEmk", wkDataFeedAirticketPriceE1.getApEmk());
            myParameterSourceAry[i].addValue("apEml", wkDataFeedAirticketPriceE1.getApEml());
            myParameterSourceAry[i].addValue("apEmm", wkDataFeedAirticketPriceE1.getApEmm());
            myParameterSourceAry[i].addValue("apEmn", wkDataFeedAirticketPriceE1.getApEmn());
            myParameterSourceAry[i].addValue("apEmo", wkDataFeedAirticketPriceE1.getApEmo());
            myParameterSourceAry[i].addValue("apEmp", wkDataFeedAirticketPriceE1.getApEmp());
            myParameterSourceAry[i].addValue("apEmq", wkDataFeedAirticketPriceE1.getApEmq());
            myParameterSourceAry[i].addValue("apEmr", wkDataFeedAirticketPriceE1.getApEmr());
            myParameterSourceAry[i].addValue("apEms", wkDataFeedAirticketPriceE1.getApEms());
            myParameterSourceAry[i].addValue("apEmt", wkDataFeedAirticketPriceE1.getApEmt());
            myParameterSourceAry[i].addValue("apEmu", wkDataFeedAirticketPriceE1.getApEmu());
            myParameterSourceAry[i].addValue("apEmv", wkDataFeedAirticketPriceE1.getApEmv());
            myParameterSourceAry[i].addValue("apEmw", wkDataFeedAirticketPriceE1.getApEmw());
            myParameterSourceAry[i].addValue("apEmx", wkDataFeedAirticketPriceE1.getApEmx());
            myParameterSourceAry[i].addValue("apEmy", wkDataFeedAirticketPriceE1.getApEmy());
            myParameterSourceAry[i].addValue("apEmz", wkDataFeedAirticketPriceE1.getApEmz());
        }

        namedParameterJdbcTemplate.batchUpdate(mySql, myParameterSourceAry);
    }
}
