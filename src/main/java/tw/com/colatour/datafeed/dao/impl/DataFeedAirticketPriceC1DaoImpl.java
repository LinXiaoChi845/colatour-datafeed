package tw.com.colatour.datafeed.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Component;
import tw.com.colatour.datafeed.dao.DataFeedAirticketPriceC1Dao;
import tw.com.colatour.datafeed.model.DataFeedAirticketPriceC1;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class DataFeedAirticketPriceC1DaoImpl implements DataFeedAirticketPriceC1Dao {

    @Autowired
    private NamedParameterJdbcTemplate myNamedParameterJdbcTemplate;

    @Override
    public void createDataFeedAirticketPriceC1s(List<DataFeedAirticketPriceC1> dataFeedAirticketPriceC1List) {
        String mySql = "INSERT INTO db_airticket.data_feed_airticket_price_c1 ( " +
                " file_no, price_no, " +
                " ap_caa, ap_cab, ap_cac, ap_cad, ap_cae, ap_caf, ap_cag, ap_cah, ap_cai, ap_caj, ap_cak, ap_cal, ap_cam, " +
                " ap_can, ap_cao, ap_cap, ap_caq, ap_car, ap_cas, ap_cat, ap_cau, ap_cav, ap_caw, ap_cax, ap_cay, ap_caz, " +
                " ap_cba, ap_cbb, ap_cbc, ap_cbd, ap_cbe, ap_cbf, ap_cbg, ap_cbh, ap_cbi, ap_cbj, ap_cbk, ap_cbl, ap_cbm, " +
                " ap_cbn, ap_cbo, ap_cbp, ap_cbq, ap_cbr, ap_cbs, ap_cbt, ap_cbu, ap_cbv, ap_cbw, ap_cbx, ap_cby, ap_cbz, " +
                " ap_cca, ap_ccb, ap_ccc, ap_ccd, ap_cce, ap_ccf, ap_ccg, ap_cch, ap_cci, ap_ccj, ap_cck, ap_ccl, ap_ccm, " +
                " ap_ccn, ap_cco, ap_ccp, ap_ccq, ap_ccr, ap_ccs, ap_cct, ap_ccu, ap_ccv, ap_ccw, ap_ccx, ap_ccy, ap_ccz, " +
                " ap_cda, ap_cdb, ap_cdc, ap_cdd, ap_cde, ap_cdf, ap_cdg, ap_cdh, ap_cdi, ap_cdj, ap_cdk, ap_cdl, ap_cdm, " +
                " ap_cdn, ap_cdo, ap_cdp, ap_cdq, ap_cdr, ap_cds, ap_cdt, ap_cdu, ap_cdv, ap_cdw, ap_cdx, ap_cdy, ap_cdz, " +
                " ap_cea, ap_ceb, ap_cec, ap_ced, ap_cee, ap_cef, ap_ceg, ap_ceh, ap_cei, ap_cej, ap_cek, ap_cel, ap_cem, " +
                " ap_cen, ap_ceo, ap_cep, ap_ceq, ap_cer, ap_ces, ap_cet, ap_ceu, ap_cev, ap_cew, ap_cex, ap_cey, ap_cez, " +
                " ap_cfa, ap_cfb, ap_cfc, ap_cfd, ap_cfe, ap_cff, ap_cfg, ap_cfh, ap_cfi, ap_cfj, ap_cfk, ap_cfl, ap_cfm, " +
                " ap_cfn, ap_cfo, ap_cfp, ap_cfq, ap_cfr, ap_cfs, ap_cft, ap_cfu, ap_cfv, ap_cfw, ap_cfx, ap_cfy, ap_cfz, " +
                " ap_cga, ap_cgb, ap_cgc, ap_cgd, ap_cge, ap_cgf, ap_cgg, ap_cgh, ap_cgi, ap_cgj, ap_cgk, ap_cgl, ap_cgm, " +
                " ap_cgn, ap_cgo, ap_cgp, ap_cgq, ap_cgr, ap_cgs, ap_cgt, ap_cgu, ap_cgv, ap_cgw, ap_cgx, ap_cgy, ap_cgz, " +
                " ap_cha, ap_chb, ap_chc, ap_chd, ap_che, ap_chf, ap_chg, ap_chh, ap_chi, ap_chj, ap_chk, ap_chl, ap_chm, " +
                " ap_chn, ap_cho, ap_chp, ap_chq, ap_chr, ap_chs, ap_cht, ap_chu, ap_chv, ap_chw, ap_chx, ap_chy, ap_chz, " +
                " ap_cia, ap_cib, ap_cic, ap_cid, ap_cie, ap_cif, ap_cig, ap_cih, ap_cii, ap_cij, ap_cik, ap_cil, ap_cim, " +
                " ap_cin, ap_cio, ap_cip, ap_ciq, ap_cir, ap_cis, ap_cit, ap_ciu, ap_civ, ap_ciw, ap_cix, ap_ciy, ap_ciz, " +
                " ap_cja, ap_cjb, ap_cjc, ap_cjd, ap_cje, ap_cjf, ap_cjg, ap_cjh, ap_cji, ap_cjj, ap_cjk, ap_cjl, ap_cjm, " +
                " ap_cjn, ap_cjo, ap_cjp, ap_cjq, ap_cjr, ap_cjs, ap_cjt, ap_cju, ap_cjv, ap_cjw, ap_cjx, ap_cjy, ap_cjz, " +
                " ap_cka, ap_ckb, ap_ckc, ap_ckd, ap_cke, ap_ckf, ap_ckg, ap_ckh, ap_cki, ap_ckj, ap_ckk, ap_ckl, ap_ckm, " +
                " ap_ckn, ap_cko, ap_ckp, ap_ckq, ap_ckr, ap_cks, ap_ckt, ap_cku, ap_ckv, ap_ckw, ap_ckx, ap_cky, ap_ckz, " +
                " ap_cla, ap_clb, ap_clc, ap_cld, ap_cle, ap_clf, ap_clg, ap_clh, ap_cli, ap_clj, ap_clk, ap_cll, ap_clm, " +
                " ap_cln, ap_clo, ap_clp, ap_clq, ap_clr, ap_cls, ap_clt, ap_clu, ap_clv, ap_clw, ap_clx, ap_cly, ap_clz, " +
                " ap_cma, ap_cmb, ap_cmc, ap_cmd, ap_cme, ap_cmf, ap_cmg, ap_cmh, ap_cmi, ap_cmj, ap_cmk, ap_cml, ap_cmm, " +
                " ap_cmn, ap_cmo, ap_cmp, ap_cmq, ap_cmr, ap_cms, ap_cmt, ap_cmu, ap_cmv, ap_cmw, ap_cmx, ap_cmy, ap_cmz ) " +
                " VALUES ( " +
                " :fileNo, :priceNo, " +
                " :apCaa, :apCab, :apCac, :apCad, :apCae, :apCaf, :apCag, :apCah, :apCai, :apCaj, :apCak, :apCal, :apCam, " +
                " :apCan, :apCao, :apCap, :apCaq, :apCar, :apCas, :apCat, :apCau, :apCav, :apCaw, :apCax, :apCay, :apCaz, " +
                " :apCba, :apCbb, :apCbc, :apCbd, :apCbe, :apCbf, :apCbg, :apCbh, :apCbi, :apCbj, :apCbk, :apCbl, :apCbm, " +
                " :apCbn, :apCbo, :apCbp, :apCbq, :apCbr, :apCbs, :apCbt, :apCbu, :apCbv, :apCbw, :apCbx, :apCby, :apCbz, " +
                " :apCca, :apCcb, :apCcc, :apCcd, :apCce, :apCcf, :apCcg, :apCch, :apCci, :apCcj, :apCck, :apCcl, :apCcm, " +
                " :apCcn, :apCco, :apCcp, :apCcq, :apCcr, :apCcs, :apCct, :apCcu, :apCcv, :apCcw, :apCcx, :apCcy, :apCcz, " +
                " :apCda, :apCdb, :apCdc, :apCdd, :apCde, :apCdf, :apCdg, :apCdh, :apCdi, :apCdj, :apCdk, :apCdl, :apCdm, " +
                " :apCdn, :apCdo, :apCdp, :apCdq, :apCdr, :apCds, :apCdt, :apCdu, :apCdv, :apCdw, :apCdx, :apCdy, :apCdz, " +
                " :apCea, :apCeb, :apCec, :apCed, :apCee, :apCef, :apCeg, :apCeh, :apCei, :apCej, :apCek, :apCel, :apCem, " +
                " :apCen, :apCeo, :apCep, :apCeq, :apCer, :apCes, :apCet, :apCeu, :apCev, :apCew, :apCex, :apCey, :apCez, " +
                " :apCfa, :apCfb, :apCfc, :apCfd, :apCfe, :apCff, :apCfg, :apCfh, :apCfi, :apCfj, :apCfk, :apCfl, :apCfm, " +
                " :apCfn, :apCfo, :apCfp, :apCfq, :apCfr, :apCfs, :apCft, :apCfu, :apCfv, :apCfw, :apCfx, :apCfy, :apCfz, " +
                " :apCga, :apCgb, :apCgc, :apCgd, :apCge, :apCgf, :apCgg, :apCgh, :apCgi, :apCgj, :apCgk, :apCgl, :apCgm, " +
                " :apCgn, :apCgo, :apCgp, :apCgq, :apCgr, :apCgs, :apCgt, :apCgu, :apCgv, :apCgw, :apCgx, :apCgy, :apCgz, " +
                " :apCha, :apChb, :apChc, :apChd, :apChe, :apChf, :apChg, :apChh, :apChi, :apChj, :apChk, :apChl, :apChm, " +
                " :apChn, :apCho, :apChp, :apChq, :apChr, :apChs, :apCht, :apChu, :apChv, :apChw, :apChx, :apChy, :apChz, " +
                " :apCia, :apCib, :apCic, :apCid, :apCie, :apCif, :apCig, :apCih, :apCii, :apCij, :apCik, :apCil, :apCim, " +
                " :apCin, :apCio, :apCip, :apCiq, :apCir, :apCis, :apCit, :apCiu, :apCiv, :apCiw, :apCix, :apCiy, :apCiz, " +
                " :apCja, :apCjb, :apCjc, :apCjd, :apCje, :apCjf, :apCjg, :apCjh, :apCji, :apCjj, :apCjk, :apCjl, :apCjm, " +
                " :apCjn, :apCjo, :apCjp, :apCjq, :apCjr, :apCjs, :apCjt, :apCju, :apCjv, :apCjw, :apCjx, :apCjy, :apCjz, " +
                " :apCka, :apCkb, :apCkc, :apCkd, :apCke, :apCkf, :apCkg, :apCkh, :apCki, :apCkj, :apCkk, :apCkl, :apCkm, " +
                " :apCkn, :apCko, :apCkp, :apCkq, :apCkr, :apCks, :apCkt, :apCku, :apCkv, :apCkw, :apCkx, :apCky, :apCkz, " +
                " :apCla, :apClb, :apClc, :apCld, :apCle, :apClf, :apClg, :apClh, :apCli, :apClj, :apClk, :apCll, :apClm, " +
                " :apCln, :apClo, :apClp, :apClq, :apClr, :apCls, :apClt, :apClu, :apClv, :apClw, :apClx, :apCly, :apClz, " +
                " :apCma, :apCmb, :apCmc, :apCmd, :apCme, :apCmf, :apCmg, :apCmh, :apCmi, :apCmj, :apCmk, :apCml, :apCmm, " +
                " :apCmn, :apCmo, :apCmp, :apCmq, :apCmr, :apCms, :apCmt, :apCmu, :apCmv, :apCmw, :apCmx, :apCmy, :apCmz ) ";

        MapSqlParameterSource[] myParameterSourceAry = new MapSqlParameterSource[dataFeedAirticketPriceC1List.size()];

        for (int i = 0; i < dataFeedAirticketPriceC1List.size(); i++) {
            DataFeedAirticketPriceC1 wkDataFeedAirticketPriceC1 = dataFeedAirticketPriceC1List.get(i);

            myParameterSourceAry[i] = new MapSqlParameterSource();

            myParameterSourceAry[i].addValue("fileNo", wkDataFeedAirticketPriceC1.getFileNo());
            myParameterSourceAry[i].addValue("priceNo", wkDataFeedAirticketPriceC1.getPriceNo());
            myParameterSourceAry[i].addValue("apCaa", wkDataFeedAirticketPriceC1.getApCaa());
            myParameterSourceAry[i].addValue("apCab", wkDataFeedAirticketPriceC1.getApCab());
            myParameterSourceAry[i].addValue("apCac", wkDataFeedAirticketPriceC1.getApCac());
            myParameterSourceAry[i].addValue("apCad", wkDataFeedAirticketPriceC1.getApCad());
            myParameterSourceAry[i].addValue("apCae", wkDataFeedAirticketPriceC1.getApCae());
            myParameterSourceAry[i].addValue("apCaf", wkDataFeedAirticketPriceC1.getApCaf());
            myParameterSourceAry[i].addValue("apCag", wkDataFeedAirticketPriceC1.getApCag());
            myParameterSourceAry[i].addValue("apCah", wkDataFeedAirticketPriceC1.getApCah());
            myParameterSourceAry[i].addValue("apCai", wkDataFeedAirticketPriceC1.getApCai());
            myParameterSourceAry[i].addValue("apCaj", wkDataFeedAirticketPriceC1.getApCaj());
            myParameterSourceAry[i].addValue("apCak", wkDataFeedAirticketPriceC1.getApCak());
            myParameterSourceAry[i].addValue("apCal", wkDataFeedAirticketPriceC1.getApCal());
            myParameterSourceAry[i].addValue("apCam", wkDataFeedAirticketPriceC1.getApCam());
            myParameterSourceAry[i].addValue("apCan", wkDataFeedAirticketPriceC1.getApCan());
            myParameterSourceAry[i].addValue("apCao", wkDataFeedAirticketPriceC1.getApCao());
            myParameterSourceAry[i].addValue("apCap", wkDataFeedAirticketPriceC1.getApCap());
            myParameterSourceAry[i].addValue("apCaq", wkDataFeedAirticketPriceC1.getApCaq());
            myParameterSourceAry[i].addValue("apCar", wkDataFeedAirticketPriceC1.getApCar());
            myParameterSourceAry[i].addValue("apCas", wkDataFeedAirticketPriceC1.getApCas());
            myParameterSourceAry[i].addValue("apCat", wkDataFeedAirticketPriceC1.getApCat());
            myParameterSourceAry[i].addValue("apCau", wkDataFeedAirticketPriceC1.getApCau());
            myParameterSourceAry[i].addValue("apCav", wkDataFeedAirticketPriceC1.getApCav());
            myParameterSourceAry[i].addValue("apCaw", wkDataFeedAirticketPriceC1.getApCaw());
            myParameterSourceAry[i].addValue("apCax", wkDataFeedAirticketPriceC1.getApCax());
            myParameterSourceAry[i].addValue("apCay", wkDataFeedAirticketPriceC1.getApCay());
            myParameterSourceAry[i].addValue("apCaz", wkDataFeedAirticketPriceC1.getApCaz());
            myParameterSourceAry[i].addValue("apCba", wkDataFeedAirticketPriceC1.getApCba());
            myParameterSourceAry[i].addValue("apCbb", wkDataFeedAirticketPriceC1.getApCbb());
            myParameterSourceAry[i].addValue("apCbc", wkDataFeedAirticketPriceC1.getApCbc());
            myParameterSourceAry[i].addValue("apCbd", wkDataFeedAirticketPriceC1.getApCbd());
            myParameterSourceAry[i].addValue("apCbe", wkDataFeedAirticketPriceC1.getApCbe());
            myParameterSourceAry[i].addValue("apCbf", wkDataFeedAirticketPriceC1.getApCbf());
            myParameterSourceAry[i].addValue("apCbg", wkDataFeedAirticketPriceC1.getApCbg());
            myParameterSourceAry[i].addValue("apCbh", wkDataFeedAirticketPriceC1.getApCbh());
            myParameterSourceAry[i].addValue("apCbi", wkDataFeedAirticketPriceC1.getApCbi());
            myParameterSourceAry[i].addValue("apCbj", wkDataFeedAirticketPriceC1.getApCbj());
            myParameterSourceAry[i].addValue("apCbk", wkDataFeedAirticketPriceC1.getApCbk());
            myParameterSourceAry[i].addValue("apCbl", wkDataFeedAirticketPriceC1.getApCbl());
            myParameterSourceAry[i].addValue("apCbm", wkDataFeedAirticketPriceC1.getApCbm());
            myParameterSourceAry[i].addValue("apCbn", wkDataFeedAirticketPriceC1.getApCbn());
            myParameterSourceAry[i].addValue("apCbo", wkDataFeedAirticketPriceC1.getApCbo());
            myParameterSourceAry[i].addValue("apCbp", wkDataFeedAirticketPriceC1.getApCbp());
            myParameterSourceAry[i].addValue("apCbq", wkDataFeedAirticketPriceC1.getApCbq());
            myParameterSourceAry[i].addValue("apCbr", wkDataFeedAirticketPriceC1.getApCbr());
            myParameterSourceAry[i].addValue("apCbs", wkDataFeedAirticketPriceC1.getApCbs());
            myParameterSourceAry[i].addValue("apCbt", wkDataFeedAirticketPriceC1.getApCbt());
            myParameterSourceAry[i].addValue("apCbu", wkDataFeedAirticketPriceC1.getApCbu());
            myParameterSourceAry[i].addValue("apCbv", wkDataFeedAirticketPriceC1.getApCbv());
            myParameterSourceAry[i].addValue("apCbw", wkDataFeedAirticketPriceC1.getApCbw());
            myParameterSourceAry[i].addValue("apCbx", wkDataFeedAirticketPriceC1.getApCbx());
            myParameterSourceAry[i].addValue("apCby", wkDataFeedAirticketPriceC1.getApCby());
            myParameterSourceAry[i].addValue("apCbz", wkDataFeedAirticketPriceC1.getApCbz());
            myParameterSourceAry[i].addValue("apCca", wkDataFeedAirticketPriceC1.getApCca());
            myParameterSourceAry[i].addValue("apCcb", wkDataFeedAirticketPriceC1.getApCcb());
            myParameterSourceAry[i].addValue("apCcc", wkDataFeedAirticketPriceC1.getApCcc());
            myParameterSourceAry[i].addValue("apCcd", wkDataFeedAirticketPriceC1.getApCcd());
            myParameterSourceAry[i].addValue("apCce", wkDataFeedAirticketPriceC1.getApCce());
            myParameterSourceAry[i].addValue("apCcf", wkDataFeedAirticketPriceC1.getApCcf());
            myParameterSourceAry[i].addValue("apCcg", wkDataFeedAirticketPriceC1.getApCcg());
            myParameterSourceAry[i].addValue("apCch", wkDataFeedAirticketPriceC1.getApCch());
            myParameterSourceAry[i].addValue("apCci", wkDataFeedAirticketPriceC1.getApCci());
            myParameterSourceAry[i].addValue("apCcj", wkDataFeedAirticketPriceC1.getApCcj());
            myParameterSourceAry[i].addValue("apCck", wkDataFeedAirticketPriceC1.getApCck());
            myParameterSourceAry[i].addValue("apCcl", wkDataFeedAirticketPriceC1.getApCcl());
            myParameterSourceAry[i].addValue("apCcm", wkDataFeedAirticketPriceC1.getApCcm());
            myParameterSourceAry[i].addValue("apCcn", wkDataFeedAirticketPriceC1.getApCcn());
            myParameterSourceAry[i].addValue("apCco", wkDataFeedAirticketPriceC1.getApCco());
            myParameterSourceAry[i].addValue("apCcp", wkDataFeedAirticketPriceC1.getApCcp());
            myParameterSourceAry[i].addValue("apCcq", wkDataFeedAirticketPriceC1.getApCcq());
            myParameterSourceAry[i].addValue("apCcr", wkDataFeedAirticketPriceC1.getApCcr());
            myParameterSourceAry[i].addValue("apCcs", wkDataFeedAirticketPriceC1.getApCcs());
            myParameterSourceAry[i].addValue("apCct", wkDataFeedAirticketPriceC1.getApCct());
            myParameterSourceAry[i].addValue("apCcu", wkDataFeedAirticketPriceC1.getApCcu());
            myParameterSourceAry[i].addValue("apCcv", wkDataFeedAirticketPriceC1.getApCcv());
            myParameterSourceAry[i].addValue("apCcw", wkDataFeedAirticketPriceC1.getApCcw());
            myParameterSourceAry[i].addValue("apCcx", wkDataFeedAirticketPriceC1.getApCcx());
            myParameterSourceAry[i].addValue("apCcy", wkDataFeedAirticketPriceC1.getApCcy());
            myParameterSourceAry[i].addValue("apCcz", wkDataFeedAirticketPriceC1.getApCcz());
            myParameterSourceAry[i].addValue("apCda", wkDataFeedAirticketPriceC1.getApCda());
            myParameterSourceAry[i].addValue("apCdb", wkDataFeedAirticketPriceC1.getApCdb());
            myParameterSourceAry[i].addValue("apCdc", wkDataFeedAirticketPriceC1.getApCdc());
            myParameterSourceAry[i].addValue("apCdd", wkDataFeedAirticketPriceC1.getApCdd());
            myParameterSourceAry[i].addValue("apCde", wkDataFeedAirticketPriceC1.getApCde());
            myParameterSourceAry[i].addValue("apCdf", wkDataFeedAirticketPriceC1.getApCdf());
            myParameterSourceAry[i].addValue("apCdg", wkDataFeedAirticketPriceC1.getApCdg());
            myParameterSourceAry[i].addValue("apCdh", wkDataFeedAirticketPriceC1.getApCdh());
            myParameterSourceAry[i].addValue("apCdi", wkDataFeedAirticketPriceC1.getApCdi());
            myParameterSourceAry[i].addValue("apCdj", wkDataFeedAirticketPriceC1.getApCdj());
            myParameterSourceAry[i].addValue("apCdk", wkDataFeedAirticketPriceC1.getApCdk());
            myParameterSourceAry[i].addValue("apCdl", wkDataFeedAirticketPriceC1.getApCdl());
            myParameterSourceAry[i].addValue("apCdm", wkDataFeedAirticketPriceC1.getApCdm());
            myParameterSourceAry[i].addValue("apCdn", wkDataFeedAirticketPriceC1.getApCdn());
            myParameterSourceAry[i].addValue("apCdo", wkDataFeedAirticketPriceC1.getApCdo());
            myParameterSourceAry[i].addValue("apCdp", wkDataFeedAirticketPriceC1.getApCdp());
            myParameterSourceAry[i].addValue("apCdq", wkDataFeedAirticketPriceC1.getApCdq());
            myParameterSourceAry[i].addValue("apCdr", wkDataFeedAirticketPriceC1.getApCdr());
            myParameterSourceAry[i].addValue("apCds", wkDataFeedAirticketPriceC1.getApCds());
            myParameterSourceAry[i].addValue("apCdt", wkDataFeedAirticketPriceC1.getApCdt());
            myParameterSourceAry[i].addValue("apCdu", wkDataFeedAirticketPriceC1.getApCdu());
            myParameterSourceAry[i].addValue("apCdv", wkDataFeedAirticketPriceC1.getApCdv());
            myParameterSourceAry[i].addValue("apCdw", wkDataFeedAirticketPriceC1.getApCdw());
            myParameterSourceAry[i].addValue("apCdx", wkDataFeedAirticketPriceC1.getApCdx());
            myParameterSourceAry[i].addValue("apCdy", wkDataFeedAirticketPriceC1.getApCdy());
            myParameterSourceAry[i].addValue("apCdz", wkDataFeedAirticketPriceC1.getApCdz());
            myParameterSourceAry[i].addValue("apCea", wkDataFeedAirticketPriceC1.getApCea());
            myParameterSourceAry[i].addValue("apCeb", wkDataFeedAirticketPriceC1.getApCeb());
            myParameterSourceAry[i].addValue("apCec", wkDataFeedAirticketPriceC1.getApCec());
            myParameterSourceAry[i].addValue("apCed", wkDataFeedAirticketPriceC1.getApCed());
            myParameterSourceAry[i].addValue("apCee", wkDataFeedAirticketPriceC1.getApCee());
            myParameterSourceAry[i].addValue("apCef", wkDataFeedAirticketPriceC1.getApCef());
            myParameterSourceAry[i].addValue("apCeg", wkDataFeedAirticketPriceC1.getApCeg());
            myParameterSourceAry[i].addValue("apCeh", wkDataFeedAirticketPriceC1.getApCeh());
            myParameterSourceAry[i].addValue("apCei", wkDataFeedAirticketPriceC1.getApCei());
            myParameterSourceAry[i].addValue("apCej", wkDataFeedAirticketPriceC1.getApCej());
            myParameterSourceAry[i].addValue("apCek", wkDataFeedAirticketPriceC1.getApCek());
            myParameterSourceAry[i].addValue("apCel", wkDataFeedAirticketPriceC1.getApCel());
            myParameterSourceAry[i].addValue("apCem", wkDataFeedAirticketPriceC1.getApCem());
            myParameterSourceAry[i].addValue("apCen", wkDataFeedAirticketPriceC1.getApCen());
            myParameterSourceAry[i].addValue("apCeo", wkDataFeedAirticketPriceC1.getApCeo());
            myParameterSourceAry[i].addValue("apCep", wkDataFeedAirticketPriceC1.getApCep());
            myParameterSourceAry[i].addValue("apCeq", wkDataFeedAirticketPriceC1.getApCeq());
            myParameterSourceAry[i].addValue("apCer", wkDataFeedAirticketPriceC1.getApCer());
            myParameterSourceAry[i].addValue("apCes", wkDataFeedAirticketPriceC1.getApCes());
            myParameterSourceAry[i].addValue("apCet", wkDataFeedAirticketPriceC1.getApCet());
            myParameterSourceAry[i].addValue("apCeu", wkDataFeedAirticketPriceC1.getApCeu());
            myParameterSourceAry[i].addValue("apCev", wkDataFeedAirticketPriceC1.getApCev());
            myParameterSourceAry[i].addValue("apCew", wkDataFeedAirticketPriceC1.getApCew());
            myParameterSourceAry[i].addValue("apCex", wkDataFeedAirticketPriceC1.getApCex());
            myParameterSourceAry[i].addValue("apCey", wkDataFeedAirticketPriceC1.getApCey());
            myParameterSourceAry[i].addValue("apCez", wkDataFeedAirticketPriceC1.getApCez());
            myParameterSourceAry[i].addValue("apCfa", wkDataFeedAirticketPriceC1.getApCfa());
            myParameterSourceAry[i].addValue("apCfb", wkDataFeedAirticketPriceC1.getApCfb());
            myParameterSourceAry[i].addValue("apCfc", wkDataFeedAirticketPriceC1.getApCfc());
            myParameterSourceAry[i].addValue("apCfd", wkDataFeedAirticketPriceC1.getApCfd());
            myParameterSourceAry[i].addValue("apCfe", wkDataFeedAirticketPriceC1.getApCfe());
            myParameterSourceAry[i].addValue("apCff", wkDataFeedAirticketPriceC1.getApCff());
            myParameterSourceAry[i].addValue("apCfg", wkDataFeedAirticketPriceC1.getApCfg());
            myParameterSourceAry[i].addValue("apCfh", wkDataFeedAirticketPriceC1.getApCfh());
            myParameterSourceAry[i].addValue("apCfi", wkDataFeedAirticketPriceC1.getApCfi());
            myParameterSourceAry[i].addValue("apCfj", wkDataFeedAirticketPriceC1.getApCfj());
            myParameterSourceAry[i].addValue("apCfk", wkDataFeedAirticketPriceC1.getApCfk());
            myParameterSourceAry[i].addValue("apCfl", wkDataFeedAirticketPriceC1.getApCfl());
            myParameterSourceAry[i].addValue("apCfm", wkDataFeedAirticketPriceC1.getApCfm());
            myParameterSourceAry[i].addValue("apCfn", wkDataFeedAirticketPriceC1.getApCfn());
            myParameterSourceAry[i].addValue("apCfo", wkDataFeedAirticketPriceC1.getApCfo());
            myParameterSourceAry[i].addValue("apCfp", wkDataFeedAirticketPriceC1.getApCfp());
            myParameterSourceAry[i].addValue("apCfq", wkDataFeedAirticketPriceC1.getApCfq());
            myParameterSourceAry[i].addValue("apCfr", wkDataFeedAirticketPriceC1.getApCfr());
            myParameterSourceAry[i].addValue("apCfs", wkDataFeedAirticketPriceC1.getApCfs());
            myParameterSourceAry[i].addValue("apCft", wkDataFeedAirticketPriceC1.getApCft());
            myParameterSourceAry[i].addValue("apCfu", wkDataFeedAirticketPriceC1.getApCfu());
            myParameterSourceAry[i].addValue("apCfv", wkDataFeedAirticketPriceC1.getApCfv());
            myParameterSourceAry[i].addValue("apCfw", wkDataFeedAirticketPriceC1.getApCfw());
            myParameterSourceAry[i].addValue("apCfx", wkDataFeedAirticketPriceC1.getApCfx());
            myParameterSourceAry[i].addValue("apCfy", wkDataFeedAirticketPriceC1.getApCfy());
            myParameterSourceAry[i].addValue("apCfz", wkDataFeedAirticketPriceC1.getApCfz());
            myParameterSourceAry[i].addValue("apCga", wkDataFeedAirticketPriceC1.getApCga());
            myParameterSourceAry[i].addValue("apCgb", wkDataFeedAirticketPriceC1.getApCgb());
            myParameterSourceAry[i].addValue("apCgc", wkDataFeedAirticketPriceC1.getApCgc());
            myParameterSourceAry[i].addValue("apCgd", wkDataFeedAirticketPriceC1.getApCgd());
            myParameterSourceAry[i].addValue("apCge", wkDataFeedAirticketPriceC1.getApCge());
            myParameterSourceAry[i].addValue("apCgf", wkDataFeedAirticketPriceC1.getApCgf());
            myParameterSourceAry[i].addValue("apCgg", wkDataFeedAirticketPriceC1.getApCgg());
            myParameterSourceAry[i].addValue("apCgh", wkDataFeedAirticketPriceC1.getApCgh());
            myParameterSourceAry[i].addValue("apCgi", wkDataFeedAirticketPriceC1.getApCgi());
            myParameterSourceAry[i].addValue("apCgj", wkDataFeedAirticketPriceC1.getApCgj());
            myParameterSourceAry[i].addValue("apCgk", wkDataFeedAirticketPriceC1.getApCgk());
            myParameterSourceAry[i].addValue("apCgl", wkDataFeedAirticketPriceC1.getApCgl());
            myParameterSourceAry[i].addValue("apCgm", wkDataFeedAirticketPriceC1.getApCgm());
            myParameterSourceAry[i].addValue("apCgn", wkDataFeedAirticketPriceC1.getApCgn());
            myParameterSourceAry[i].addValue("apCgo", wkDataFeedAirticketPriceC1.getApCgo());
            myParameterSourceAry[i].addValue("apCgp", wkDataFeedAirticketPriceC1.getApCgp());
            myParameterSourceAry[i].addValue("apCgq", wkDataFeedAirticketPriceC1.getApCgq());
            myParameterSourceAry[i].addValue("apCgr", wkDataFeedAirticketPriceC1.getApCgr());
            myParameterSourceAry[i].addValue("apCgs", wkDataFeedAirticketPriceC1.getApCgs());
            myParameterSourceAry[i].addValue("apCgt", wkDataFeedAirticketPriceC1.getApCgt());
            myParameterSourceAry[i].addValue("apCgu", wkDataFeedAirticketPriceC1.getApCgu());
            myParameterSourceAry[i].addValue("apCgv", wkDataFeedAirticketPriceC1.getApCgv());
            myParameterSourceAry[i].addValue("apCgw", wkDataFeedAirticketPriceC1.getApCgw());
            myParameterSourceAry[i].addValue("apCgx", wkDataFeedAirticketPriceC1.getApCgx());
            myParameterSourceAry[i].addValue("apCgy", wkDataFeedAirticketPriceC1.getApCgy());
            myParameterSourceAry[i].addValue("apCgz", wkDataFeedAirticketPriceC1.getApCgz());
            myParameterSourceAry[i].addValue("apCha", wkDataFeedAirticketPriceC1.getApCha());
            myParameterSourceAry[i].addValue("apChb", wkDataFeedAirticketPriceC1.getApChb());
            myParameterSourceAry[i].addValue("apChc", wkDataFeedAirticketPriceC1.getApChc());
            myParameterSourceAry[i].addValue("apChd", wkDataFeedAirticketPriceC1.getApChd());
            myParameterSourceAry[i].addValue("apChe", wkDataFeedAirticketPriceC1.getApChe());
            myParameterSourceAry[i].addValue("apChf", wkDataFeedAirticketPriceC1.getApChf());
            myParameterSourceAry[i].addValue("apChg", wkDataFeedAirticketPriceC1.getApChg());
            myParameterSourceAry[i].addValue("apChh", wkDataFeedAirticketPriceC1.getApChh());
            myParameterSourceAry[i].addValue("apChi", wkDataFeedAirticketPriceC1.getApChi());
            myParameterSourceAry[i].addValue("apChj", wkDataFeedAirticketPriceC1.getApChj());
            myParameterSourceAry[i].addValue("apChk", wkDataFeedAirticketPriceC1.getApChk());
            myParameterSourceAry[i].addValue("apChl", wkDataFeedAirticketPriceC1.getApChl());
            myParameterSourceAry[i].addValue("apChm", wkDataFeedAirticketPriceC1.getApChm());
            myParameterSourceAry[i].addValue("apChn", wkDataFeedAirticketPriceC1.getApChn());
            myParameterSourceAry[i].addValue("apCho", wkDataFeedAirticketPriceC1.getApCho());
            myParameterSourceAry[i].addValue("apChp", wkDataFeedAirticketPriceC1.getApChp());
            myParameterSourceAry[i].addValue("apChq", wkDataFeedAirticketPriceC1.getApChq());
            myParameterSourceAry[i].addValue("apChr", wkDataFeedAirticketPriceC1.getApChr());
            myParameterSourceAry[i].addValue("apChs", wkDataFeedAirticketPriceC1.getApChs());
            myParameterSourceAry[i].addValue("apCht", wkDataFeedAirticketPriceC1.getApCht());
            myParameterSourceAry[i].addValue("apChu", wkDataFeedAirticketPriceC1.getApChu());
            myParameterSourceAry[i].addValue("apChv", wkDataFeedAirticketPriceC1.getApChv());
            myParameterSourceAry[i].addValue("apChw", wkDataFeedAirticketPriceC1.getApChw());
            myParameterSourceAry[i].addValue("apChx", wkDataFeedAirticketPriceC1.getApChx());
            myParameterSourceAry[i].addValue("apChy", wkDataFeedAirticketPriceC1.getApChy());
            myParameterSourceAry[i].addValue("apChz", wkDataFeedAirticketPriceC1.getApChz());
            myParameterSourceAry[i].addValue("apCia", wkDataFeedAirticketPriceC1.getApCia());
            myParameterSourceAry[i].addValue("apCib", wkDataFeedAirticketPriceC1.getApCib());
            myParameterSourceAry[i].addValue("apCic", wkDataFeedAirticketPriceC1.getApCic());
            myParameterSourceAry[i].addValue("apCid", wkDataFeedAirticketPriceC1.getApCid());
            myParameterSourceAry[i].addValue("apCie", wkDataFeedAirticketPriceC1.getApCie());
            myParameterSourceAry[i].addValue("apCif", wkDataFeedAirticketPriceC1.getApCif());
            myParameterSourceAry[i].addValue("apCig", wkDataFeedAirticketPriceC1.getApCig());
            myParameterSourceAry[i].addValue("apCih", wkDataFeedAirticketPriceC1.getApCih());
            myParameterSourceAry[i].addValue("apCii", wkDataFeedAirticketPriceC1.getApCii());
            myParameterSourceAry[i].addValue("apCij", wkDataFeedAirticketPriceC1.getApCij());
            myParameterSourceAry[i].addValue("apCik", wkDataFeedAirticketPriceC1.getApCik());
            myParameterSourceAry[i].addValue("apCil", wkDataFeedAirticketPriceC1.getApCil());
            myParameterSourceAry[i].addValue("apCim", wkDataFeedAirticketPriceC1.getApCim());
            myParameterSourceAry[i].addValue("apCin", wkDataFeedAirticketPriceC1.getApCin());
            myParameterSourceAry[i].addValue("apCio", wkDataFeedAirticketPriceC1.getApCio());
            myParameterSourceAry[i].addValue("apCip", wkDataFeedAirticketPriceC1.getApCip());
            myParameterSourceAry[i].addValue("apCiq", wkDataFeedAirticketPriceC1.getApCiq());
            myParameterSourceAry[i].addValue("apCir", wkDataFeedAirticketPriceC1.getApCir());
            myParameterSourceAry[i].addValue("apCis", wkDataFeedAirticketPriceC1.getApCis());
            myParameterSourceAry[i].addValue("apCit", wkDataFeedAirticketPriceC1.getApCit());
            myParameterSourceAry[i].addValue("apCiu", wkDataFeedAirticketPriceC1.getApCiu());
            myParameterSourceAry[i].addValue("apCiv", wkDataFeedAirticketPriceC1.getApCiv());
            myParameterSourceAry[i].addValue("apCiw", wkDataFeedAirticketPriceC1.getApCiw());
            myParameterSourceAry[i].addValue("apCix", wkDataFeedAirticketPriceC1.getApCix());
            myParameterSourceAry[i].addValue("apCiy", wkDataFeedAirticketPriceC1.getApCiy());
            myParameterSourceAry[i].addValue("apCiz", wkDataFeedAirticketPriceC1.getApCiz());
            myParameterSourceAry[i].addValue("apCja", wkDataFeedAirticketPriceC1.getApCja());
            myParameterSourceAry[i].addValue("apCjb", wkDataFeedAirticketPriceC1.getApCjb());
            myParameterSourceAry[i].addValue("apCjc", wkDataFeedAirticketPriceC1.getApCjc());
            myParameterSourceAry[i].addValue("apCjd", wkDataFeedAirticketPriceC1.getApCjd());
            myParameterSourceAry[i].addValue("apCje", wkDataFeedAirticketPriceC1.getApCje());
            myParameterSourceAry[i].addValue("apCjf", wkDataFeedAirticketPriceC1.getApCjf());
            myParameterSourceAry[i].addValue("apCjg", wkDataFeedAirticketPriceC1.getApCjg());
            myParameterSourceAry[i].addValue("apCjh", wkDataFeedAirticketPriceC1.getApCjh());
            myParameterSourceAry[i].addValue("apCji", wkDataFeedAirticketPriceC1.getApCji());
            myParameterSourceAry[i].addValue("apCjj", wkDataFeedAirticketPriceC1.getApCjj());
            myParameterSourceAry[i].addValue("apCjk", wkDataFeedAirticketPriceC1.getApCjk());
            myParameterSourceAry[i].addValue("apCjl", wkDataFeedAirticketPriceC1.getApCjl());
            myParameterSourceAry[i].addValue("apCjm", wkDataFeedAirticketPriceC1.getApCjm());
            myParameterSourceAry[i].addValue("apCjn", wkDataFeedAirticketPriceC1.getApCjn());
            myParameterSourceAry[i].addValue("apCjo", wkDataFeedAirticketPriceC1.getApCjo());
            myParameterSourceAry[i].addValue("apCjp", wkDataFeedAirticketPriceC1.getApCjp());
            myParameterSourceAry[i].addValue("apCjq", wkDataFeedAirticketPriceC1.getApCjq());
            myParameterSourceAry[i].addValue("apCjr", wkDataFeedAirticketPriceC1.getApCjr());
            myParameterSourceAry[i].addValue("apCjs", wkDataFeedAirticketPriceC1.getApCjs());
            myParameterSourceAry[i].addValue("apCjt", wkDataFeedAirticketPriceC1.getApCjt());
            myParameterSourceAry[i].addValue("apCju", wkDataFeedAirticketPriceC1.getApCju());
            myParameterSourceAry[i].addValue("apCjv", wkDataFeedAirticketPriceC1.getApCjv());
            myParameterSourceAry[i].addValue("apCjw", wkDataFeedAirticketPriceC1.getApCjw());
            myParameterSourceAry[i].addValue("apCjx", wkDataFeedAirticketPriceC1.getApCjx());
            myParameterSourceAry[i].addValue("apCjy", wkDataFeedAirticketPriceC1.getApCjy());
            myParameterSourceAry[i].addValue("apCjz", wkDataFeedAirticketPriceC1.getApCjz());
            myParameterSourceAry[i].addValue("apCka", wkDataFeedAirticketPriceC1.getApCka());
            myParameterSourceAry[i].addValue("apCkb", wkDataFeedAirticketPriceC1.getApCkb());
            myParameterSourceAry[i].addValue("apCkc", wkDataFeedAirticketPriceC1.getApCkc());
            myParameterSourceAry[i].addValue("apCkd", wkDataFeedAirticketPriceC1.getApCkd());
            myParameterSourceAry[i].addValue("apCke", wkDataFeedAirticketPriceC1.getApCke());
            myParameterSourceAry[i].addValue("apCkf", wkDataFeedAirticketPriceC1.getApCkf());
            myParameterSourceAry[i].addValue("apCkg", wkDataFeedAirticketPriceC1.getApCkg());
            myParameterSourceAry[i].addValue("apCkh", wkDataFeedAirticketPriceC1.getApCkh());
            myParameterSourceAry[i].addValue("apCki", wkDataFeedAirticketPriceC1.getApCki());
            myParameterSourceAry[i].addValue("apCkj", wkDataFeedAirticketPriceC1.getApCkj());
            myParameterSourceAry[i].addValue("apCkk", wkDataFeedAirticketPriceC1.getApCkk());
            myParameterSourceAry[i].addValue("apCkl", wkDataFeedAirticketPriceC1.getApCkl());
            myParameterSourceAry[i].addValue("apCkm", wkDataFeedAirticketPriceC1.getApCkm());
            myParameterSourceAry[i].addValue("apCkn", wkDataFeedAirticketPriceC1.getApCkn());
            myParameterSourceAry[i].addValue("apCko", wkDataFeedAirticketPriceC1.getApCko());
            myParameterSourceAry[i].addValue("apCkp", wkDataFeedAirticketPriceC1.getApCkp());
            myParameterSourceAry[i].addValue("apCkq", wkDataFeedAirticketPriceC1.getApCkq());
            myParameterSourceAry[i].addValue("apCkr", wkDataFeedAirticketPriceC1.getApCkr());
            myParameterSourceAry[i].addValue("apCks", wkDataFeedAirticketPriceC1.getApCks());
            myParameterSourceAry[i].addValue("apCkt", wkDataFeedAirticketPriceC1.getApCkt());
            myParameterSourceAry[i].addValue("apCku", wkDataFeedAirticketPriceC1.getApCku());
            myParameterSourceAry[i].addValue("apCkv", wkDataFeedAirticketPriceC1.getApCkv());
            myParameterSourceAry[i].addValue("apCkw", wkDataFeedAirticketPriceC1.getApCkw());
            myParameterSourceAry[i].addValue("apCkx", wkDataFeedAirticketPriceC1.getApCkx());
            myParameterSourceAry[i].addValue("apCky", wkDataFeedAirticketPriceC1.getApCky());
            myParameterSourceAry[i].addValue("apCkz", wkDataFeedAirticketPriceC1.getApCkz());
            myParameterSourceAry[i].addValue("apCla", wkDataFeedAirticketPriceC1.getApCla());
            myParameterSourceAry[i].addValue("apClb", wkDataFeedAirticketPriceC1.getApClb());
            myParameterSourceAry[i].addValue("apClc", wkDataFeedAirticketPriceC1.getApClc());
            myParameterSourceAry[i].addValue("apCld", wkDataFeedAirticketPriceC1.getApCld());
            myParameterSourceAry[i].addValue("apCle", wkDataFeedAirticketPriceC1.getApCle());
            myParameterSourceAry[i].addValue("apClf", wkDataFeedAirticketPriceC1.getApClf());
            myParameterSourceAry[i].addValue("apClg", wkDataFeedAirticketPriceC1.getApClg());
            myParameterSourceAry[i].addValue("apClh", wkDataFeedAirticketPriceC1.getApClh());
            myParameterSourceAry[i].addValue("apCli", wkDataFeedAirticketPriceC1.getApCli());
            myParameterSourceAry[i].addValue("apClj", wkDataFeedAirticketPriceC1.getApClj());
            myParameterSourceAry[i].addValue("apClk", wkDataFeedAirticketPriceC1.getApClk());
            myParameterSourceAry[i].addValue("apCll", wkDataFeedAirticketPriceC1.getApCll());
            myParameterSourceAry[i].addValue("apClm", wkDataFeedAirticketPriceC1.getApClm());
            myParameterSourceAry[i].addValue("apCln", wkDataFeedAirticketPriceC1.getApCln());
            myParameterSourceAry[i].addValue("apClo", wkDataFeedAirticketPriceC1.getApClo());
            myParameterSourceAry[i].addValue("apClp", wkDataFeedAirticketPriceC1.getApClp());
            myParameterSourceAry[i].addValue("apClq", wkDataFeedAirticketPriceC1.getApClq());
            myParameterSourceAry[i].addValue("apClr", wkDataFeedAirticketPriceC1.getApClr());
            myParameterSourceAry[i].addValue("apCls", wkDataFeedAirticketPriceC1.getApCls());
            myParameterSourceAry[i].addValue("apClt", wkDataFeedAirticketPriceC1.getApClt());
            myParameterSourceAry[i].addValue("apClu", wkDataFeedAirticketPriceC1.getApClu());
            myParameterSourceAry[i].addValue("apClv", wkDataFeedAirticketPriceC1.getApClv());
            myParameterSourceAry[i].addValue("apClw", wkDataFeedAirticketPriceC1.getApClw());
            myParameterSourceAry[i].addValue("apClx", wkDataFeedAirticketPriceC1.getApClx());
            myParameterSourceAry[i].addValue("apCly", wkDataFeedAirticketPriceC1.getApCly());
            myParameterSourceAry[i].addValue("apClz", wkDataFeedAirticketPriceC1.getApClz());
            myParameterSourceAry[i].addValue("apCma", wkDataFeedAirticketPriceC1.getApCma());
            myParameterSourceAry[i].addValue("apCmb", wkDataFeedAirticketPriceC1.getApCmb());
            myParameterSourceAry[i].addValue("apCmc", wkDataFeedAirticketPriceC1.getApCmc());
            myParameterSourceAry[i].addValue("apCmd", wkDataFeedAirticketPriceC1.getApCmd());
            myParameterSourceAry[i].addValue("apCme", wkDataFeedAirticketPriceC1.getApCme());
            myParameterSourceAry[i].addValue("apCmf", wkDataFeedAirticketPriceC1.getApCmf());
            myParameterSourceAry[i].addValue("apCmg", wkDataFeedAirticketPriceC1.getApCmg());
            myParameterSourceAry[i].addValue("apCmh", wkDataFeedAirticketPriceC1.getApCmh());
            myParameterSourceAry[i].addValue("apCmi", wkDataFeedAirticketPriceC1.getApCmi());
            myParameterSourceAry[i].addValue("apCmj", wkDataFeedAirticketPriceC1.getApCmj());
            myParameterSourceAry[i].addValue("apCmk", wkDataFeedAirticketPriceC1.getApCmk());
            myParameterSourceAry[i].addValue("apCml", wkDataFeedAirticketPriceC1.getApCml());
            myParameterSourceAry[i].addValue("apCmm", wkDataFeedAirticketPriceC1.getApCmm());
            myParameterSourceAry[i].addValue("apCmn", wkDataFeedAirticketPriceC1.getApCmn());
            myParameterSourceAry[i].addValue("apCmo", wkDataFeedAirticketPriceC1.getApCmo());
            myParameterSourceAry[i].addValue("apCmp", wkDataFeedAirticketPriceC1.getApCmp());
            myParameterSourceAry[i].addValue("apCmq", wkDataFeedAirticketPriceC1.getApCmq());
            myParameterSourceAry[i].addValue("apCmr", wkDataFeedAirticketPriceC1.getApCmr());
            myParameterSourceAry[i].addValue("apCms", wkDataFeedAirticketPriceC1.getApCms());
            myParameterSourceAry[i].addValue("apCmt", wkDataFeedAirticketPriceC1.getApCmt());
            myParameterSourceAry[i].addValue("apCmu", wkDataFeedAirticketPriceC1.getApCmu());
            myParameterSourceAry[i].addValue("apCmv", wkDataFeedAirticketPriceC1.getApCmv());
            myParameterSourceAry[i].addValue("apCmw", wkDataFeedAirticketPriceC1.getApCmw());
            myParameterSourceAry[i].addValue("apCmx", wkDataFeedAirticketPriceC1.getApCmx());
            myParameterSourceAry[i].addValue("apCmy", wkDataFeedAirticketPriceC1.getApCmy());
            myParameterSourceAry[i].addValue("apCmz", wkDataFeedAirticketPriceC1.getApCmz());
        }

        myNamedParameterJdbcTemplate.batchUpdate(mySql, myParameterSourceAry);
    }

    @Override
    public void deleteDataFeedAirticketPriceC1sByFileNo(Integer fileNo) {
        String mySql = "DELETE FROM db_airticket.data_feed_airticket_price_c1 " +
                " WHERE file_no = :fileNo ";

        Map<String,Object> myMap = new HashMap<>();
        myMap.put("fileNo", fileNo);

        myNamedParameterJdbcTemplate.update(mySql, myMap);
    }

}
