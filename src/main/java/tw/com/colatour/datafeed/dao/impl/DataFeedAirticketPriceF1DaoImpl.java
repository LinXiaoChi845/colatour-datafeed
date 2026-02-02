package tw.com.colatour.datafeed.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Component;
import tw.com.colatour.datafeed.dao.DataFeedAirticketPriceF1Dao;
import tw.com.colatour.datafeed.model.DataFeedAirticketPriceF1;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class DataFeedAirticketPriceF1DaoImpl implements DataFeedAirticketPriceF1Dao {

    @Autowired
    private NamedParameterJdbcTemplate myNamedParameterJdbcTemplate;

    @Override
    public void createDataFeedAirticketPriceF1s(List<DataFeedAirticketPriceF1> dataFeedAirticketPriceF1List) {
        String mySql = "INSERT INTO db_airticket.data_feed_airticket_price_f1 ( " +
                " file_no, price_no, " +
                " ap_faa, ap_fab, ap_fac, ap_fad, ap_fae, ap_faf, ap_fag, ap_fah, ap_fai, ap_faj, ap_fak, ap_fal, ap_fam, " +
                " ap_fan, ap_fao, ap_fap, ap_faq, ap_far, ap_fas, ap_fat, ap_fau, ap_fav, ap_faw, ap_fax, ap_fay, ap_faz, " +
                " ap_fba, ap_fbb, ap_fbc, ap_fbd, ap_fbe, ap_fbf, ap_fbg, ap_fbh, ap_fbi, ap_fbj, ap_fbk, ap_fbl, ap_fbm, " +
                " ap_fbn, ap_fbo, ap_fbp, ap_fbq, ap_fbr, ap_fbs, ap_fbt, ap_fbu, ap_fbv, ap_fbw, ap_fbx, ap_fby, ap_fbz, " +
                " ap_fca, ap_fcb, ap_fcc, ap_fcd, ap_fce, ap_fcf, ap_fcg, ap_fch, ap_fci, ap_fcj, ap_fck, ap_fcl, ap_fcm, " +
                " ap_fcn, ap_fco, ap_fcp, ap_fcq, ap_fcr, ap_fcs, ap_fct, ap_fcu, ap_fcv, ap_fcw, ap_fcx, ap_fcy, ap_fcz, " +
                " ap_fda, ap_fdb, ap_fdc, ap_fdd, ap_fde, ap_fdf, ap_fdg, ap_fdh, ap_fdi, ap_fdj, ap_fdk, ap_fdl, ap_fdm, " +
                " ap_fdn, ap_fdo, ap_fdp, ap_fdq, ap_fdr, ap_fds, ap_fdt, ap_fdu, ap_fdv, ap_fdw, ap_fdx, ap_fdy, ap_fdz, " +
                " ap_fea, ap_feb, ap_fec, ap_fed, ap_fee, ap_fef, ap_feg, ap_feh, ap_fei, ap_fej, ap_fek, ap_fel, ap_fem, " +
                " ap_fen, ap_feo, ap_fep, ap_feq, ap_fer, ap_fes, ap_fet, ap_feu, ap_fev, ap_few, ap_fex, ap_fey, ap_fez, " +
                " ap_ffa, ap_ffb, ap_ffc, ap_ffd, ap_ffe, ap_fff, ap_ffg, ap_ffh, ap_ffi, ap_ffj, ap_ffk, ap_ffl, ap_ffm, " +
                " ap_ffn, ap_ffo, ap_ffp, ap_ffq, ap_ffr, ap_ffs, ap_fft, ap_ffu, ap_ffv, ap_ffw, ap_ffx, ap_ffy, ap_ffz, " +
                " ap_fga, ap_fgb, ap_fgc, ap_fgd, ap_fge, ap_fgf, ap_fgg, ap_fgh, ap_fgi, ap_fgj, ap_fgk, ap_fgl, ap_fgm, " +
                " ap_fgn, ap_fgo, ap_fgp, ap_fgq, ap_fgr, ap_fgs, ap_fgt, ap_fgu, ap_fgv, ap_fgw, ap_fgx, ap_fgy, ap_fgz, " +
                " ap_fha, ap_fhb, ap_fhc, ap_fhd, ap_fhe, ap_fhf, ap_fhg, ap_fhh, ap_fhi, ap_fhj, ap_fhk, ap_fhl, ap_fhm, " +
                " ap_fhn, ap_fho, ap_fhp, ap_fhq, ap_fhr, ap_fhs, ap_fht, ap_fhu, ap_fhv, ap_fhw, ap_fhx, ap_fhy, ap_fhz, " +
                " ap_fia, ap_fib, ap_fic, ap_fid, ap_fie, ap_fif, ap_fig, ap_fih, ap_fii, ap_fij, ap_fik, ap_fil, ap_fim, " +
                " ap_fin, ap_fio, ap_fip, ap_fiq, ap_fir, ap_fis, ap_fit, ap_fiu, ap_fiv, ap_fiw, ap_fix, ap_fiy, ap_fiz, " +
                " ap_fja, ap_fjb, ap_fjc, ap_fjd, ap_fje, ap_fjf, ap_fjg, ap_fjh, ap_fji, ap_fjj, ap_fjk, ap_fjl, ap_fjm, " +
                " ap_fjn, ap_fjo, ap_fjp, ap_fjq, ap_fjr, ap_fjs, ap_fjt, ap_fju, ap_fjv, ap_fjw, ap_fjx, ap_fjy, ap_fjz, " +
                " ap_fka, ap_fkb, ap_fkc, ap_fkd, ap_fke, ap_fkf, ap_fkg, ap_fkh, ap_fki, ap_fkj, ap_fkk, ap_fkl, ap_fkm, " +
                " ap_fkn, ap_fko, ap_fkp, ap_fkq, ap_fkr, ap_fks, ap_fkt, ap_fku, ap_fkv, ap_fkw, ap_fkx, ap_fky, ap_fkz, " +
                " ap_fla, ap_flb, ap_flc, ap_fld, ap_fle, ap_flf, ap_flg, ap_flh, ap_fli, ap_flj, ap_flk, ap_fll, ap_flm, " +
                " ap_fln, ap_flo, ap_flp, ap_flq, ap_flr, ap_fls, ap_flt, ap_flu, ap_flv, ap_flw, ap_flx, ap_fly, ap_flz, " +
                " ap_fma, ap_fmb, ap_fmc, ap_fmd, ap_fme, ap_fmf, ap_fmg, ap_fmh, ap_fmi, ap_fmj, ap_fmk, ap_fml, ap_fmm, " +
                " ap_fmn, ap_fmo, ap_fmp, ap_fmq, ap_fmr, ap_fms, ap_fmt, ap_fmu, ap_fmv, ap_fmw, ap_fmx, ap_fmy, ap_fmz ) " +
                " VALUES ( " +
                " :fileNo, :priceNo, " +
                " :apFaa, :apFab, :apFac, :apFad, :apFae, :apFaf, :apFag, :apFah, :apFai, :apFaj, :apFak, :apFal, :apFam, " +
                " :apFan, :apFao, :apFap, :apFaq, :apFar, :apFas, :apFat, :apFau, :apFav, :apFaw, :apFax, :apFay, :apFaz, " +
                " :apFba, :apFbb, :apFbc, :apFbd, :apFbe, :apFbf, :apFbg, :apFbh, :apFbi, :apFbj, :apFbk, :apFbl, :apFbm, " +
                " :apFbn, :apFbo, :apFbp, :apFbq, :apFbr, :apFbs, :apFbt, :apFbu, :apFbv, :apFbw, :apFbx, :apFby, :apFbz, " +
                " :apFca, :apFcb, :apFcc, :apFcd, :apFce, :apFcf, :apFcg, :apFch, :apFci, :apFcj, :apFck, :apFcl, :apFcm, " +
                " :apFcn, :apFco, :apFcp, :apFcq, :apFcr, :apFcs, :apFct, :apFcu, :apFcv, :apFcw, :apFcx, :apFcy, :apFcz, " +
                " :apFda, :apFdb, :apFdc, :apFdd, :apFde, :apFdf, :apFdg, :apFdh, :apFdi, :apFdj, :apFdk, :apFdl, :apFdm, " +
                " :apFdn, :apFdo, :apFdp, :apFdq, :apFdr, :apFds, :apFdt, :apFdu, :apFdv, :apFdw, :apFdx, :apFdy, :apFdz, " +
                " :apFea, :apFeb, :apFec, :apFed, :apFee, :apFef, :apFeg, :apFeh, :apFei, :apFej, :apFek, :apFel, :apFem, " +
                " :apFen, :apFeo, :apFep, :apFeq, :apFer, :apFes, :apFet, :apFeu, :apFev, :apFew, :apFex, :apFey, :apFez, " +
                " :apFfa, :apFfb, :apFfc, :apFfd, :apFfe, :apFff, :apFfg, :apFfh, :apFfi, :apFfj, :apFfk, :apFfl, :apFfm, " +
                " :apFfn, :apFfo, :apFfp, :apFfq, :apFfr, :apFfs, :apFft, :apFfu, :apFfv, :apFfw, :apFfx, :apFfy, :apFfz, " +
                " :apFga, :apFgb, :apFgc, :apFgd, :apFge, :apFgf, :apFgg, :apFgh, :apFgi, :apFgj, :apFgk, :apFgl, :apFgm, " +
                " :apFgn, :apFgo, :apFgp, :apFgq, :apFgr, :apFgs, :apFgt, :apFgu, :apFgv, :apFgw, :apFgx, :apFgy, :apFgz, " +
                " :apFha, :apFhb, :apFhc, :apFhd, :apFhe, :apFhf, :apFhg, :apFhh, :apFhi, :apFhj, :apFhk, :apFhl, :apFhm, " +
                " :apFhn, :apFho, :apFhp, :apFhq, :apFhr, :apFhs, :apFht, :apFhu, :apFhv, :apFhw, :apFhx, :apFhy, :apFhz, " +
                " :apFia, :apFib, :apFic, :apFid, :apFie, :apFif, :apFig, :apFih, :apFii, :apFij, :apFik, :apFil, :apFim, " +
                " :apFin, :apFio, :apFip, :apFiq, :apFir, :apFis, :apFit, :apFiu, :apFiv, :apFiw, :apFix, :apFiy, :apFiz, " +
                " :apFja, :apFjb, :apFjc, :apFjd, :apFje, :apFjf, :apFjg, :apFjh, :apFji, :apFjj, :apFjk, :apFjl, :apFjm, " +
                " :apFjn, :apFjo, :apFjp, :apFjq, :apFjr, :apFjs, :apFjt, :apFju, :apFjv, :apFjw, :apFjx, :apFjy, :apFjz, " +
                " :apFka, :apFkb, :apFkc, :apFkd, :apFke, :apFkf, :apFkg, :apFkh, :apFki, :apFkj, :apFkk, :apFkl, :apFkm, " +
                " :apFkn, :apFko, :apFkp, :apFkq, :apFkr, :apFks, :apFkt, :apFku, :apFkv, :apFkw, :apFkx, :apFky, :apFkz, " +
                " :apFla, :apFlb, :apFlc, :apFld, :apFle, :apFlf, :apFlg, :apFlh, :apFli, :apFlj, :apFlk, :apFll, :apFlm, " +
                " :apFln, :apFlo, :apFlp, :apFlq, :apFlr, :apFls, :apFlt, :apFlu, :apFlv, :apFlw, :apFlx, :apFly, :apFlz, " +
                " :apFma, :apFmb, :apFmc, :apFmd, :apFme, :apFmf, :apFmg, :apFmh, :apFmi, :apFmj, :apFmk, :apFml, :apFmm, " +
                " :apFmn, :apFmo, :apFmp, :apFmq, :apFmr, :apFms, :apFmt, :apFmu, :apFmv, :apFmw, :apFmx, :apFmy, :apFmz ) ";

        MapSqlParameterSource[] myParameterSourceAry = new MapSqlParameterSource[dataFeedAirticketPriceF1List.size()];

        for (int i = 0; i < dataFeedAirticketPriceF1List.size(); i++) {
            DataFeedAirticketPriceF1 wkDataFeedAirticketPriceF1 = dataFeedAirticketPriceF1List.get(i);

            myParameterSourceAry[i] = new MapSqlParameterSource();

            myParameterSourceAry[i].addValue("fileNo", wkDataFeedAirticketPriceF1.getFileNo());
            myParameterSourceAry[i].addValue("priceNo", wkDataFeedAirticketPriceF1.getPriceNo());
            myParameterSourceAry[i].addValue("apFaa", wkDataFeedAirticketPriceF1.getApFaa());
            myParameterSourceAry[i].addValue("apFab", wkDataFeedAirticketPriceF1.getApFab());
            myParameterSourceAry[i].addValue("apFac", wkDataFeedAirticketPriceF1.getApFac());
            myParameterSourceAry[i].addValue("apFad", wkDataFeedAirticketPriceF1.getApFad());
            myParameterSourceAry[i].addValue("apFae", wkDataFeedAirticketPriceF1.getApFae());
            myParameterSourceAry[i].addValue("apFaf", wkDataFeedAirticketPriceF1.getApFaf());
            myParameterSourceAry[i].addValue("apFag", wkDataFeedAirticketPriceF1.getApFag());
            myParameterSourceAry[i].addValue("apFah", wkDataFeedAirticketPriceF1.getApFah());
            myParameterSourceAry[i].addValue("apFai", wkDataFeedAirticketPriceF1.getApFai());
            myParameterSourceAry[i].addValue("apFaj", wkDataFeedAirticketPriceF1.getApFaj());
            myParameterSourceAry[i].addValue("apFak", wkDataFeedAirticketPriceF1.getApFak());
            myParameterSourceAry[i].addValue("apFal", wkDataFeedAirticketPriceF1.getApFal());
            myParameterSourceAry[i].addValue("apFam", wkDataFeedAirticketPriceF1.getApFam());
            myParameterSourceAry[i].addValue("apFan", wkDataFeedAirticketPriceF1.getApFan());
            myParameterSourceAry[i].addValue("apFao", wkDataFeedAirticketPriceF1.getApFao());
            myParameterSourceAry[i].addValue("apFap", wkDataFeedAirticketPriceF1.getApFap());
            myParameterSourceAry[i].addValue("apFaq", wkDataFeedAirticketPriceF1.getApFaq());
            myParameterSourceAry[i].addValue("apFar", wkDataFeedAirticketPriceF1.getApFar());
            myParameterSourceAry[i].addValue("apFas", wkDataFeedAirticketPriceF1.getApFas());
            myParameterSourceAry[i].addValue("apFat", wkDataFeedAirticketPriceF1.getApFat());
            myParameterSourceAry[i].addValue("apFau", wkDataFeedAirticketPriceF1.getApFau());
            myParameterSourceAry[i].addValue("apFav", wkDataFeedAirticketPriceF1.getApFav());
            myParameterSourceAry[i].addValue("apFaw", wkDataFeedAirticketPriceF1.getApFaw());
            myParameterSourceAry[i].addValue("apFax", wkDataFeedAirticketPriceF1.getApFax());
            myParameterSourceAry[i].addValue("apFay", wkDataFeedAirticketPriceF1.getApFay());
            myParameterSourceAry[i].addValue("apFaz", wkDataFeedAirticketPriceF1.getApFaz());
            myParameterSourceAry[i].addValue("apFba", wkDataFeedAirticketPriceF1.getApFba());
            myParameterSourceAry[i].addValue("apFbb", wkDataFeedAirticketPriceF1.getApFbb());
            myParameterSourceAry[i].addValue("apFbc", wkDataFeedAirticketPriceF1.getApFbc());
            myParameterSourceAry[i].addValue("apFbd", wkDataFeedAirticketPriceF1.getApFbd());
            myParameterSourceAry[i].addValue("apFbe", wkDataFeedAirticketPriceF1.getApFbe());
            myParameterSourceAry[i].addValue("apFbf", wkDataFeedAirticketPriceF1.getApFbf());
            myParameterSourceAry[i].addValue("apFbg", wkDataFeedAirticketPriceF1.getApFbg());
            myParameterSourceAry[i].addValue("apFbh", wkDataFeedAirticketPriceF1.getApFbh());
            myParameterSourceAry[i].addValue("apFbi", wkDataFeedAirticketPriceF1.getApFbi());
            myParameterSourceAry[i].addValue("apFbj", wkDataFeedAirticketPriceF1.getApFbj());
            myParameterSourceAry[i].addValue("apFbk", wkDataFeedAirticketPriceF1.getApFbk());
            myParameterSourceAry[i].addValue("apFbl", wkDataFeedAirticketPriceF1.getApFbl());
            myParameterSourceAry[i].addValue("apFbm", wkDataFeedAirticketPriceF1.getApFbm());
            myParameterSourceAry[i].addValue("apFbn", wkDataFeedAirticketPriceF1.getApFbn());
            myParameterSourceAry[i].addValue("apFbo", wkDataFeedAirticketPriceF1.getApFbo());
            myParameterSourceAry[i].addValue("apFbp", wkDataFeedAirticketPriceF1.getApFbp());
            myParameterSourceAry[i].addValue("apFbq", wkDataFeedAirticketPriceF1.getApFbq());
            myParameterSourceAry[i].addValue("apFbr", wkDataFeedAirticketPriceF1.getApFbr());
            myParameterSourceAry[i].addValue("apFbs", wkDataFeedAirticketPriceF1.getApFbs());
            myParameterSourceAry[i].addValue("apFbt", wkDataFeedAirticketPriceF1.getApFbt());
            myParameterSourceAry[i].addValue("apFbu", wkDataFeedAirticketPriceF1.getApFbu());
            myParameterSourceAry[i].addValue("apFbv", wkDataFeedAirticketPriceF1.getApFbv());
            myParameterSourceAry[i].addValue("apFbw", wkDataFeedAirticketPriceF1.getApFbw());
            myParameterSourceAry[i].addValue("apFbx", wkDataFeedAirticketPriceF1.getApFbx());
            myParameterSourceAry[i].addValue("apFby", wkDataFeedAirticketPriceF1.getApFby());
            myParameterSourceAry[i].addValue("apFbz", wkDataFeedAirticketPriceF1.getApFbz());
            myParameterSourceAry[i].addValue("apFca", wkDataFeedAirticketPriceF1.getApFca());
            myParameterSourceAry[i].addValue("apFcb", wkDataFeedAirticketPriceF1.getApFcb());
            myParameterSourceAry[i].addValue("apFcc", wkDataFeedAirticketPriceF1.getApFcc());
            myParameterSourceAry[i].addValue("apFcd", wkDataFeedAirticketPriceF1.getApFcd());
            myParameterSourceAry[i].addValue("apFce", wkDataFeedAirticketPriceF1.getApFce());
            myParameterSourceAry[i].addValue("apFcf", wkDataFeedAirticketPriceF1.getApFcf());
            myParameterSourceAry[i].addValue("apFcg", wkDataFeedAirticketPriceF1.getApFcg());
            myParameterSourceAry[i].addValue("apFch", wkDataFeedAirticketPriceF1.getApFch());
            myParameterSourceAry[i].addValue("apFci", wkDataFeedAirticketPriceF1.getApFci());
            myParameterSourceAry[i].addValue("apFcj", wkDataFeedAirticketPriceF1.getApFcj());
            myParameterSourceAry[i].addValue("apFck", wkDataFeedAirticketPriceF1.getApFck());
            myParameterSourceAry[i].addValue("apFcl", wkDataFeedAirticketPriceF1.getApFcl());
            myParameterSourceAry[i].addValue("apFcm", wkDataFeedAirticketPriceF1.getApFcm());
            myParameterSourceAry[i].addValue("apFcn", wkDataFeedAirticketPriceF1.getApFcn());
            myParameterSourceAry[i].addValue("apFco", wkDataFeedAirticketPriceF1.getApFco());
            myParameterSourceAry[i].addValue("apFcp", wkDataFeedAirticketPriceF1.getApFcp());
            myParameterSourceAry[i].addValue("apFcq", wkDataFeedAirticketPriceF1.getApFcq());
            myParameterSourceAry[i].addValue("apFcr", wkDataFeedAirticketPriceF1.getApFcr());
            myParameterSourceAry[i].addValue("apFcs", wkDataFeedAirticketPriceF1.getApFcs());
            myParameterSourceAry[i].addValue("apFct", wkDataFeedAirticketPriceF1.getApFct());
            myParameterSourceAry[i].addValue("apFcu", wkDataFeedAirticketPriceF1.getApFcu());
            myParameterSourceAry[i].addValue("apFcv", wkDataFeedAirticketPriceF1.getApFcv());
            myParameterSourceAry[i].addValue("apFcw", wkDataFeedAirticketPriceF1.getApFcw());
            myParameterSourceAry[i].addValue("apFcx", wkDataFeedAirticketPriceF1.getApFcx());
            myParameterSourceAry[i].addValue("apFcy", wkDataFeedAirticketPriceF1.getApFcy());
            myParameterSourceAry[i].addValue("apFcz", wkDataFeedAirticketPriceF1.getApFcz());
            myParameterSourceAry[i].addValue("apFda", wkDataFeedAirticketPriceF1.getApFda());
            myParameterSourceAry[i].addValue("apFdb", wkDataFeedAirticketPriceF1.getApFdb());
            myParameterSourceAry[i].addValue("apFdc", wkDataFeedAirticketPriceF1.getApFdc());
            myParameterSourceAry[i].addValue("apFdd", wkDataFeedAirticketPriceF1.getApFdd());
            myParameterSourceAry[i].addValue("apFde", wkDataFeedAirticketPriceF1.getApFde());
            myParameterSourceAry[i].addValue("apFdf", wkDataFeedAirticketPriceF1.getApFdf());
            myParameterSourceAry[i].addValue("apFdg", wkDataFeedAirticketPriceF1.getApFdg());
            myParameterSourceAry[i].addValue("apFdh", wkDataFeedAirticketPriceF1.getApFdh());
            myParameterSourceAry[i].addValue("apFdi", wkDataFeedAirticketPriceF1.getApFdi());
            myParameterSourceAry[i].addValue("apFdj", wkDataFeedAirticketPriceF1.getApFdj());
            myParameterSourceAry[i].addValue("apFdk", wkDataFeedAirticketPriceF1.getApFdk());
            myParameterSourceAry[i].addValue("apFdl", wkDataFeedAirticketPriceF1.getApFdl());
            myParameterSourceAry[i].addValue("apFdm", wkDataFeedAirticketPriceF1.getApFdm());
            myParameterSourceAry[i].addValue("apFdn", wkDataFeedAirticketPriceF1.getApFdn());
            myParameterSourceAry[i].addValue("apFdo", wkDataFeedAirticketPriceF1.getApFdo());
            myParameterSourceAry[i].addValue("apFdp", wkDataFeedAirticketPriceF1.getApFdp());
            myParameterSourceAry[i].addValue("apFdq", wkDataFeedAirticketPriceF1.getApFdq());
            myParameterSourceAry[i].addValue("apFdr", wkDataFeedAirticketPriceF1.getApFdr());
            myParameterSourceAry[i].addValue("apFds", wkDataFeedAirticketPriceF1.getApFds());
            myParameterSourceAry[i].addValue("apFdt", wkDataFeedAirticketPriceF1.getApFdt());
            myParameterSourceAry[i].addValue("apFdu", wkDataFeedAirticketPriceF1.getApFdu());
            myParameterSourceAry[i].addValue("apFdv", wkDataFeedAirticketPriceF1.getApFdv());
            myParameterSourceAry[i].addValue("apFdw", wkDataFeedAirticketPriceF1.getApFdw());
            myParameterSourceAry[i].addValue("apFdx", wkDataFeedAirticketPriceF1.getApFdx());
            myParameterSourceAry[i].addValue("apFdy", wkDataFeedAirticketPriceF1.getApFdy());
            myParameterSourceAry[i].addValue("apFdz", wkDataFeedAirticketPriceF1.getApFdz());
            myParameterSourceAry[i].addValue("apFea", wkDataFeedAirticketPriceF1.getApFea());
            myParameterSourceAry[i].addValue("apFeb", wkDataFeedAirticketPriceF1.getApFeb());
            myParameterSourceAry[i].addValue("apFec", wkDataFeedAirticketPriceF1.getApFec());
            myParameterSourceAry[i].addValue("apFed", wkDataFeedAirticketPriceF1.getApFed());
            myParameterSourceAry[i].addValue("apFee", wkDataFeedAirticketPriceF1.getApFee());
            myParameterSourceAry[i].addValue("apFef", wkDataFeedAirticketPriceF1.getApFef());
            myParameterSourceAry[i].addValue("apFeg", wkDataFeedAirticketPriceF1.getApFeg());
            myParameterSourceAry[i].addValue("apFeh", wkDataFeedAirticketPriceF1.getApFeh());
            myParameterSourceAry[i].addValue("apFei", wkDataFeedAirticketPriceF1.getApFei());
            myParameterSourceAry[i].addValue("apFej", wkDataFeedAirticketPriceF1.getApFej());
            myParameterSourceAry[i].addValue("apFek", wkDataFeedAirticketPriceF1.getApFek());
            myParameterSourceAry[i].addValue("apFel", wkDataFeedAirticketPriceF1.getApFel());
            myParameterSourceAry[i].addValue("apFem", wkDataFeedAirticketPriceF1.getApFem());
            myParameterSourceAry[i].addValue("apFen", wkDataFeedAirticketPriceF1.getApFen());
            myParameterSourceAry[i].addValue("apFeo", wkDataFeedAirticketPriceF1.getApFeo());
            myParameterSourceAry[i].addValue("apFep", wkDataFeedAirticketPriceF1.getApFep());
            myParameterSourceAry[i].addValue("apFeq", wkDataFeedAirticketPriceF1.getApFeq());
            myParameterSourceAry[i].addValue("apFer", wkDataFeedAirticketPriceF1.getApFer());
            myParameterSourceAry[i].addValue("apFes", wkDataFeedAirticketPriceF1.getApFes());
            myParameterSourceAry[i].addValue("apFet", wkDataFeedAirticketPriceF1.getApFet());
            myParameterSourceAry[i].addValue("apFeu", wkDataFeedAirticketPriceF1.getApFeu());
            myParameterSourceAry[i].addValue("apFev", wkDataFeedAirticketPriceF1.getApFev());
            myParameterSourceAry[i].addValue("apFew", wkDataFeedAirticketPriceF1.getApFew());
            myParameterSourceAry[i].addValue("apFex", wkDataFeedAirticketPriceF1.getApFex());
            myParameterSourceAry[i].addValue("apFey", wkDataFeedAirticketPriceF1.getApFey());
            myParameterSourceAry[i].addValue("apFez", wkDataFeedAirticketPriceF1.getApFez());
            myParameterSourceAry[i].addValue("apFfa", wkDataFeedAirticketPriceF1.getApFfa());
            myParameterSourceAry[i].addValue("apFfb", wkDataFeedAirticketPriceF1.getApFfb());
            myParameterSourceAry[i].addValue("apFfc", wkDataFeedAirticketPriceF1.getApFfc());
            myParameterSourceAry[i].addValue("apFfd", wkDataFeedAirticketPriceF1.getApFfd());
            myParameterSourceAry[i].addValue("apFfe", wkDataFeedAirticketPriceF1.getApFfe());
            myParameterSourceAry[i].addValue("apFff", wkDataFeedAirticketPriceF1.getApFff());
            myParameterSourceAry[i].addValue("apFfg", wkDataFeedAirticketPriceF1.getApFfg());
            myParameterSourceAry[i].addValue("apFfh", wkDataFeedAirticketPriceF1.getApFfh());
            myParameterSourceAry[i].addValue("apFfi", wkDataFeedAirticketPriceF1.getApFfi());
            myParameterSourceAry[i].addValue("apFfj", wkDataFeedAirticketPriceF1.getApFfj());
            myParameterSourceAry[i].addValue("apFfk", wkDataFeedAirticketPriceF1.getApFfk());
            myParameterSourceAry[i].addValue("apFfl", wkDataFeedAirticketPriceF1.getApFfl());
            myParameterSourceAry[i].addValue("apFfm", wkDataFeedAirticketPriceF1.getApFfm());
            myParameterSourceAry[i].addValue("apFfn", wkDataFeedAirticketPriceF1.getApFfn());
            myParameterSourceAry[i].addValue("apFfo", wkDataFeedAirticketPriceF1.getApFfo());
            myParameterSourceAry[i].addValue("apFfp", wkDataFeedAirticketPriceF1.getApFfp());
            myParameterSourceAry[i].addValue("apFfq", wkDataFeedAirticketPriceF1.getApFfq());
            myParameterSourceAry[i].addValue("apFfr", wkDataFeedAirticketPriceF1.getApFfr());
            myParameterSourceAry[i].addValue("apFfs", wkDataFeedAirticketPriceF1.getApFfs());
            myParameterSourceAry[i].addValue("apFft", wkDataFeedAirticketPriceF1.getApFft());
            myParameterSourceAry[i].addValue("apFfu", wkDataFeedAirticketPriceF1.getApFfu());
            myParameterSourceAry[i].addValue("apFfv", wkDataFeedAirticketPriceF1.getApFfv());
            myParameterSourceAry[i].addValue("apFfw", wkDataFeedAirticketPriceF1.getApFfw());
            myParameterSourceAry[i].addValue("apFfx", wkDataFeedAirticketPriceF1.getApFfx());
            myParameterSourceAry[i].addValue("apFfy", wkDataFeedAirticketPriceF1.getApFfy());
            myParameterSourceAry[i].addValue("apFfz", wkDataFeedAirticketPriceF1.getApFfz());
            myParameterSourceAry[i].addValue("apFga", wkDataFeedAirticketPriceF1.getApFga());
            myParameterSourceAry[i].addValue("apFgb", wkDataFeedAirticketPriceF1.getApFgb());
            myParameterSourceAry[i].addValue("apFgc", wkDataFeedAirticketPriceF1.getApFgc());
            myParameterSourceAry[i].addValue("apFgd", wkDataFeedAirticketPriceF1.getApFgd());
            myParameterSourceAry[i].addValue("apFge", wkDataFeedAirticketPriceF1.getApFge());
            myParameterSourceAry[i].addValue("apFgf", wkDataFeedAirticketPriceF1.getApFgf());
            myParameterSourceAry[i].addValue("apFgg", wkDataFeedAirticketPriceF1.getApFgg());
            myParameterSourceAry[i].addValue("apFgh", wkDataFeedAirticketPriceF1.getApFgh());
            myParameterSourceAry[i].addValue("apFgi", wkDataFeedAirticketPriceF1.getApFgi());
            myParameterSourceAry[i].addValue("apFgj", wkDataFeedAirticketPriceF1.getApFgj());
            myParameterSourceAry[i].addValue("apFgk", wkDataFeedAirticketPriceF1.getApFgk());
            myParameterSourceAry[i].addValue("apFgl", wkDataFeedAirticketPriceF1.getApFgl());
            myParameterSourceAry[i].addValue("apFgm", wkDataFeedAirticketPriceF1.getApFgm());
            myParameterSourceAry[i].addValue("apFgn", wkDataFeedAirticketPriceF1.getApFgn());
            myParameterSourceAry[i].addValue("apFgo", wkDataFeedAirticketPriceF1.getApFgo());
            myParameterSourceAry[i].addValue("apFgp", wkDataFeedAirticketPriceF1.getApFgp());
            myParameterSourceAry[i].addValue("apFgq", wkDataFeedAirticketPriceF1.getApFgq());
            myParameterSourceAry[i].addValue("apFgr", wkDataFeedAirticketPriceF1.getApFgr());
            myParameterSourceAry[i].addValue("apFgs", wkDataFeedAirticketPriceF1.getApFgs());
            myParameterSourceAry[i].addValue("apFgt", wkDataFeedAirticketPriceF1.getApFgt());
            myParameterSourceAry[i].addValue("apFgu", wkDataFeedAirticketPriceF1.getApFgu());
            myParameterSourceAry[i].addValue("apFgv", wkDataFeedAirticketPriceF1.getApFgv());
            myParameterSourceAry[i].addValue("apFgw", wkDataFeedAirticketPriceF1.getApFgw());
            myParameterSourceAry[i].addValue("apFgx", wkDataFeedAirticketPriceF1.getApFgx());
            myParameterSourceAry[i].addValue("apFgy", wkDataFeedAirticketPriceF1.getApFgy());
            myParameterSourceAry[i].addValue("apFgz", wkDataFeedAirticketPriceF1.getApFgz());
            myParameterSourceAry[i].addValue("apFha", wkDataFeedAirticketPriceF1.getApFha());
            myParameterSourceAry[i].addValue("apFhb", wkDataFeedAirticketPriceF1.getApFhb());
            myParameterSourceAry[i].addValue("apFhc", wkDataFeedAirticketPriceF1.getApFhc());
            myParameterSourceAry[i].addValue("apFhd", wkDataFeedAirticketPriceF1.getApFhd());
            myParameterSourceAry[i].addValue("apFhe", wkDataFeedAirticketPriceF1.getApFhe());
            myParameterSourceAry[i].addValue("apFhf", wkDataFeedAirticketPriceF1.getApFhf());
            myParameterSourceAry[i].addValue("apFhg", wkDataFeedAirticketPriceF1.getApFhg());
            myParameterSourceAry[i].addValue("apFhh", wkDataFeedAirticketPriceF1.getApFhh());
            myParameterSourceAry[i].addValue("apFhi", wkDataFeedAirticketPriceF1.getApFhi());
            myParameterSourceAry[i].addValue("apFhj", wkDataFeedAirticketPriceF1.getApFhj());
            myParameterSourceAry[i].addValue("apFhk", wkDataFeedAirticketPriceF1.getApFhk());
            myParameterSourceAry[i].addValue("apFhl", wkDataFeedAirticketPriceF1.getApFhl());
            myParameterSourceAry[i].addValue("apFhm", wkDataFeedAirticketPriceF1.getApFhm());
            myParameterSourceAry[i].addValue("apFhn", wkDataFeedAirticketPriceF1.getApFhn());
            myParameterSourceAry[i].addValue("apFho", wkDataFeedAirticketPriceF1.getApFho());
            myParameterSourceAry[i].addValue("apFhp", wkDataFeedAirticketPriceF1.getApFhp());
            myParameterSourceAry[i].addValue("apFhq", wkDataFeedAirticketPriceF1.getApFhq());
            myParameterSourceAry[i].addValue("apFhr", wkDataFeedAirticketPriceF1.getApFhr());
            myParameterSourceAry[i].addValue("apFhs", wkDataFeedAirticketPriceF1.getApFhs());
            myParameterSourceAry[i].addValue("apFht", wkDataFeedAirticketPriceF1.getApFht());
            myParameterSourceAry[i].addValue("apFhu", wkDataFeedAirticketPriceF1.getApFhu());
            myParameterSourceAry[i].addValue("apFhv", wkDataFeedAirticketPriceF1.getApFhv());
            myParameterSourceAry[i].addValue("apFhw", wkDataFeedAirticketPriceF1.getApFhw());
            myParameterSourceAry[i].addValue("apFhx", wkDataFeedAirticketPriceF1.getApFhx());
            myParameterSourceAry[i].addValue("apFhy", wkDataFeedAirticketPriceF1.getApFhy());
            myParameterSourceAry[i].addValue("apFhz", wkDataFeedAirticketPriceF1.getApFhz());
            myParameterSourceAry[i].addValue("apFia", wkDataFeedAirticketPriceF1.getApFia());
            myParameterSourceAry[i].addValue("apFib", wkDataFeedAirticketPriceF1.getApFib());
            myParameterSourceAry[i].addValue("apFic", wkDataFeedAirticketPriceF1.getApFic());
            myParameterSourceAry[i].addValue("apFid", wkDataFeedAirticketPriceF1.getApFid());
            myParameterSourceAry[i].addValue("apFie", wkDataFeedAirticketPriceF1.getApFie());
            myParameterSourceAry[i].addValue("apFif", wkDataFeedAirticketPriceF1.getApFif());
            myParameterSourceAry[i].addValue("apFig", wkDataFeedAirticketPriceF1.getApFig());
            myParameterSourceAry[i].addValue("apFih", wkDataFeedAirticketPriceF1.getApFih());
            myParameterSourceAry[i].addValue("apFii", wkDataFeedAirticketPriceF1.getApFii());
            myParameterSourceAry[i].addValue("apFij", wkDataFeedAirticketPriceF1.getApFij());
            myParameterSourceAry[i].addValue("apFik", wkDataFeedAirticketPriceF1.getApFik());
            myParameterSourceAry[i].addValue("apFil", wkDataFeedAirticketPriceF1.getApFil());
            myParameterSourceAry[i].addValue("apFim", wkDataFeedAirticketPriceF1.getApFim());
            myParameterSourceAry[i].addValue("apFin", wkDataFeedAirticketPriceF1.getApFin());
            myParameterSourceAry[i].addValue("apFio", wkDataFeedAirticketPriceF1.getApFio());
            myParameterSourceAry[i].addValue("apFip", wkDataFeedAirticketPriceF1.getApFip());
            myParameterSourceAry[i].addValue("apFiq", wkDataFeedAirticketPriceF1.getApFiq());
            myParameterSourceAry[i].addValue("apFir", wkDataFeedAirticketPriceF1.getApFir());
            myParameterSourceAry[i].addValue("apFis", wkDataFeedAirticketPriceF1.getApFis());
            myParameterSourceAry[i].addValue("apFit", wkDataFeedAirticketPriceF1.getApFit());
            myParameterSourceAry[i].addValue("apFiu", wkDataFeedAirticketPriceF1.getApFiu());
            myParameterSourceAry[i].addValue("apFiv", wkDataFeedAirticketPriceF1.getApFiv());
            myParameterSourceAry[i].addValue("apFiw", wkDataFeedAirticketPriceF1.getApFiw());
            myParameterSourceAry[i].addValue("apFix", wkDataFeedAirticketPriceF1.getApFix());
            myParameterSourceAry[i].addValue("apFiy", wkDataFeedAirticketPriceF1.getApFiy());
            myParameterSourceAry[i].addValue("apFiz", wkDataFeedAirticketPriceF1.getApFiz());
            myParameterSourceAry[i].addValue("apFja", wkDataFeedAirticketPriceF1.getApFja());
            myParameterSourceAry[i].addValue("apFjb", wkDataFeedAirticketPriceF1.getApFjb());
            myParameterSourceAry[i].addValue("apFjc", wkDataFeedAirticketPriceF1.getApFjc());
            myParameterSourceAry[i].addValue("apFjd", wkDataFeedAirticketPriceF1.getApFjd());
            myParameterSourceAry[i].addValue("apFje", wkDataFeedAirticketPriceF1.getApFje());
            myParameterSourceAry[i].addValue("apFjf", wkDataFeedAirticketPriceF1.getApFjf());
            myParameterSourceAry[i].addValue("apFjg", wkDataFeedAirticketPriceF1.getApFjg());
            myParameterSourceAry[i].addValue("apFjh", wkDataFeedAirticketPriceF1.getApFjh());
            myParameterSourceAry[i].addValue("apFji", wkDataFeedAirticketPriceF1.getApFji());
            myParameterSourceAry[i].addValue("apFjj", wkDataFeedAirticketPriceF1.getApFjj());
            myParameterSourceAry[i].addValue("apFjk", wkDataFeedAirticketPriceF1.getApFjk());
            myParameterSourceAry[i].addValue("apFjl", wkDataFeedAirticketPriceF1.getApFjl());
            myParameterSourceAry[i].addValue("apFjm", wkDataFeedAirticketPriceF1.getApFjm());
            myParameterSourceAry[i].addValue("apFjn", wkDataFeedAirticketPriceF1.getApFjn());
            myParameterSourceAry[i].addValue("apFjo", wkDataFeedAirticketPriceF1.getApFjo());
            myParameterSourceAry[i].addValue("apFjp", wkDataFeedAirticketPriceF1.getApFjp());
            myParameterSourceAry[i].addValue("apFjq", wkDataFeedAirticketPriceF1.getApFjq());
            myParameterSourceAry[i].addValue("apFjr", wkDataFeedAirticketPriceF1.getApFjr());
            myParameterSourceAry[i].addValue("apFjs", wkDataFeedAirticketPriceF1.getApFjs());
            myParameterSourceAry[i].addValue("apFjt", wkDataFeedAirticketPriceF1.getApFjt());
            myParameterSourceAry[i].addValue("apFju", wkDataFeedAirticketPriceF1.getApFju());
            myParameterSourceAry[i].addValue("apFjv", wkDataFeedAirticketPriceF1.getApFjv());
            myParameterSourceAry[i].addValue("apFjw", wkDataFeedAirticketPriceF1.getApFjw());
            myParameterSourceAry[i].addValue("apFjx", wkDataFeedAirticketPriceF1.getApFjx());
            myParameterSourceAry[i].addValue("apFjy", wkDataFeedAirticketPriceF1.getApFjy());
            myParameterSourceAry[i].addValue("apFjz", wkDataFeedAirticketPriceF1.getApFjz());
            myParameterSourceAry[i].addValue("apFka", wkDataFeedAirticketPriceF1.getApFka());
            myParameterSourceAry[i].addValue("apFkb", wkDataFeedAirticketPriceF1.getApFkb());
            myParameterSourceAry[i].addValue("apFkc", wkDataFeedAirticketPriceF1.getApFkc());
            myParameterSourceAry[i].addValue("apFkd", wkDataFeedAirticketPriceF1.getApFkd());
            myParameterSourceAry[i].addValue("apFke", wkDataFeedAirticketPriceF1.getApFke());
            myParameterSourceAry[i].addValue("apFkf", wkDataFeedAirticketPriceF1.getApFkf());
            myParameterSourceAry[i].addValue("apFkg", wkDataFeedAirticketPriceF1.getApFkg());
            myParameterSourceAry[i].addValue("apFkh", wkDataFeedAirticketPriceF1.getApFkh());
            myParameterSourceAry[i].addValue("apFki", wkDataFeedAirticketPriceF1.getApFki());
            myParameterSourceAry[i].addValue("apFkj", wkDataFeedAirticketPriceF1.getApFkj());
            myParameterSourceAry[i].addValue("apFkk", wkDataFeedAirticketPriceF1.getApFkk());
            myParameterSourceAry[i].addValue("apFkl", wkDataFeedAirticketPriceF1.getApFkl());
            myParameterSourceAry[i].addValue("apFkm", wkDataFeedAirticketPriceF1.getApFkm());
            myParameterSourceAry[i].addValue("apFkn", wkDataFeedAirticketPriceF1.getApFkn());
            myParameterSourceAry[i].addValue("apFko", wkDataFeedAirticketPriceF1.getApFko());
            myParameterSourceAry[i].addValue("apFkp", wkDataFeedAirticketPriceF1.getApFkp());
            myParameterSourceAry[i].addValue("apFkq", wkDataFeedAirticketPriceF1.getApFkq());
            myParameterSourceAry[i].addValue("apFkr", wkDataFeedAirticketPriceF1.getApFkr());
            myParameterSourceAry[i].addValue("apFks", wkDataFeedAirticketPriceF1.getApFks());
            myParameterSourceAry[i].addValue("apFkt", wkDataFeedAirticketPriceF1.getApFkt());
            myParameterSourceAry[i].addValue("apFku", wkDataFeedAirticketPriceF1.getApFku());
            myParameterSourceAry[i].addValue("apFkv", wkDataFeedAirticketPriceF1.getApFkv());
            myParameterSourceAry[i].addValue("apFkw", wkDataFeedAirticketPriceF1.getApFkw());
            myParameterSourceAry[i].addValue("apFkx", wkDataFeedAirticketPriceF1.getApFkx());
            myParameterSourceAry[i].addValue("apFky", wkDataFeedAirticketPriceF1.getApFky());
            myParameterSourceAry[i].addValue("apFkz", wkDataFeedAirticketPriceF1.getApFkz());
            myParameterSourceAry[i].addValue("apFla", wkDataFeedAirticketPriceF1.getApFla());
            myParameterSourceAry[i].addValue("apFlb", wkDataFeedAirticketPriceF1.getApFlb());
            myParameterSourceAry[i].addValue("apFlc", wkDataFeedAirticketPriceF1.getApFlc());
            myParameterSourceAry[i].addValue("apFld", wkDataFeedAirticketPriceF1.getApFld());
            myParameterSourceAry[i].addValue("apFle", wkDataFeedAirticketPriceF1.getApFle());
            myParameterSourceAry[i].addValue("apFlf", wkDataFeedAirticketPriceF1.getApFlf());
            myParameterSourceAry[i].addValue("apFlg", wkDataFeedAirticketPriceF1.getApFlg());
            myParameterSourceAry[i].addValue("apFlh", wkDataFeedAirticketPriceF1.getApFlh());
            myParameterSourceAry[i].addValue("apFli", wkDataFeedAirticketPriceF1.getApFli());
            myParameterSourceAry[i].addValue("apFlj", wkDataFeedAirticketPriceF1.getApFlj());
            myParameterSourceAry[i].addValue("apFlk", wkDataFeedAirticketPriceF1.getApFlk());
            myParameterSourceAry[i].addValue("apFll", wkDataFeedAirticketPriceF1.getApFll());
            myParameterSourceAry[i].addValue("apFlm", wkDataFeedAirticketPriceF1.getApFlm());
            myParameterSourceAry[i].addValue("apFln", wkDataFeedAirticketPriceF1.getApFln());
            myParameterSourceAry[i].addValue("apFlo", wkDataFeedAirticketPriceF1.getApFlo());
            myParameterSourceAry[i].addValue("apFlp", wkDataFeedAirticketPriceF1.getApFlp());
            myParameterSourceAry[i].addValue("apFlq", wkDataFeedAirticketPriceF1.getApFlq());
            myParameterSourceAry[i].addValue("apFlr", wkDataFeedAirticketPriceF1.getApFlr());
            myParameterSourceAry[i].addValue("apFls", wkDataFeedAirticketPriceF1.getApFls());
            myParameterSourceAry[i].addValue("apFlt", wkDataFeedAirticketPriceF1.getApFlt());
            myParameterSourceAry[i].addValue("apFlu", wkDataFeedAirticketPriceF1.getApFlu());
            myParameterSourceAry[i].addValue("apFlv", wkDataFeedAirticketPriceF1.getApFlv());
            myParameterSourceAry[i].addValue("apFlw", wkDataFeedAirticketPriceF1.getApFlw());
            myParameterSourceAry[i].addValue("apFlx", wkDataFeedAirticketPriceF1.getApFlx());
            myParameterSourceAry[i].addValue("apFly", wkDataFeedAirticketPriceF1.getApFly());
            myParameterSourceAry[i].addValue("apFlz", wkDataFeedAirticketPriceF1.getApFlz());
            myParameterSourceAry[i].addValue("apFma", wkDataFeedAirticketPriceF1.getApFma());
            myParameterSourceAry[i].addValue("apFmb", wkDataFeedAirticketPriceF1.getApFmb());
            myParameterSourceAry[i].addValue("apFmc", wkDataFeedAirticketPriceF1.getApFmc());
            myParameterSourceAry[i].addValue("apFmd", wkDataFeedAirticketPriceF1.getApFmd());
            myParameterSourceAry[i].addValue("apFme", wkDataFeedAirticketPriceF1.getApFme());
            myParameterSourceAry[i].addValue("apFmf", wkDataFeedAirticketPriceF1.getApFmf());
            myParameterSourceAry[i].addValue("apFmg", wkDataFeedAirticketPriceF1.getApFmg());
            myParameterSourceAry[i].addValue("apFmh", wkDataFeedAirticketPriceF1.getApFmh());
            myParameterSourceAry[i].addValue("apFmi", wkDataFeedAirticketPriceF1.getApFmi());
            myParameterSourceAry[i].addValue("apFmj", wkDataFeedAirticketPriceF1.getApFmj());
            myParameterSourceAry[i].addValue("apFmk", wkDataFeedAirticketPriceF1.getApFmk());
            myParameterSourceAry[i].addValue("apFml", wkDataFeedAirticketPriceF1.getApFml());
            myParameterSourceAry[i].addValue("apFmm", wkDataFeedAirticketPriceF1.getApFmm());
            myParameterSourceAry[i].addValue("apFmn", wkDataFeedAirticketPriceF1.getApFmn());
            myParameterSourceAry[i].addValue("apFmo", wkDataFeedAirticketPriceF1.getApFmo());
            myParameterSourceAry[i].addValue("apFmp", wkDataFeedAirticketPriceF1.getApFmp());
            myParameterSourceAry[i].addValue("apFmq", wkDataFeedAirticketPriceF1.getApFmq());
            myParameterSourceAry[i].addValue("apFmr", wkDataFeedAirticketPriceF1.getApFmr());
            myParameterSourceAry[i].addValue("apFms", wkDataFeedAirticketPriceF1.getApFms());
            myParameterSourceAry[i].addValue("apFmt", wkDataFeedAirticketPriceF1.getApFmt());
            myParameterSourceAry[i].addValue("apFmu", wkDataFeedAirticketPriceF1.getApFmu());
            myParameterSourceAry[i].addValue("apFmv", wkDataFeedAirticketPriceF1.getApFmv());
            myParameterSourceAry[i].addValue("apFmw", wkDataFeedAirticketPriceF1.getApFmw());
            myParameterSourceAry[i].addValue("apFmx", wkDataFeedAirticketPriceF1.getApFmx());
            myParameterSourceAry[i].addValue("apFmy", wkDataFeedAirticketPriceF1.getApFmy());
            myParameterSourceAry[i].addValue("apFmz", wkDataFeedAirticketPriceF1.getApFmz());
        }

        myNamedParameterJdbcTemplate.batchUpdate(mySql, myParameterSourceAry);
    }

    @Override
    public void deleteDataFeedAirticketPriceF1sByFileNo(Integer fileNo) {
        String mySql = "DELETE FROM db_airticket.data_feed_airticket_price_f1 " +
                " WHERE file_no = :fileNo ";

        Map<String,Object> myMap = new HashMap<>();
        myMap.put("fileNo", fileNo);

        myNamedParameterJdbcTemplate.update(mySql, myMap);
    }

}
