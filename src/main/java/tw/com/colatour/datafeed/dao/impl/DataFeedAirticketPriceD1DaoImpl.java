package tw.com.colatour.datafeed.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Component;
import tw.com.colatour.datafeed.dao.DataFeedAirticketPriceD1Dao;
import tw.com.colatour.datafeed.model.DataFeedAirticketPriceD1;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class DataFeedAirticketPriceD1DaoImpl implements DataFeedAirticketPriceD1Dao {

    @Autowired
    private NamedParameterJdbcTemplate myNamedParameterJdbcTemplate;

    @Override
    public void createDataFeedAirticketPriceD1s(List<DataFeedAirticketPriceD1> dataFeedAirticketPriceD1List) {
        String mySql = "INSERT INTO db_airticket.data_feed_airticket_price_d1 ( " +
                " file_no, price_no, " +
                " ap_daa, ap_dab, ap_dac, ap_dad, ap_dae, ap_daf, ap_dag, ap_dah, ap_dai, ap_daj, ap_dak, ap_dal, ap_dam, " +
                " ap_dan, ap_dao, ap_dap, ap_daq, ap_dar, ap_das, ap_dat, ap_dau, ap_dav, ap_daw, ap_dax, ap_day, ap_daz, " +
                " ap_dba, ap_dbb, ap_dbc, ap_dbd, ap_dbe, ap_dbf, ap_dbg, ap_dbh, ap_dbi, ap_dbj, ap_dbk, ap_dbl, ap_dbm, " +
                " ap_dbn, ap_dbo, ap_dbp, ap_dbq, ap_dbr, ap_dbs, ap_dbt, ap_dbu, ap_dbv, ap_dbw, ap_dbx, ap_dby, ap_dbz, " +
                " ap_dca, ap_dcb, ap_dcc, ap_dcd, ap_dce, ap_dcf, ap_dcg, ap_dch, ap_dci, ap_dcj, ap_dck, ap_dcl, ap_dcm, " +
                " ap_dcn, ap_dco, ap_dcp, ap_dcq, ap_dcr, ap_dcs, ap_dct, ap_dcu, ap_dcv, ap_dcw, ap_dcx, ap_dcy, ap_dcz, " +
                " ap_dda, ap_ddb, ap_ddc, ap_ddd, ap_dde, ap_ddf, ap_ddg, ap_ddh, ap_ddi, ap_ddj, ap_ddk, ap_ddl, ap_ddm, " +
                " ap_ddn, ap_ddo, ap_ddp, ap_ddq, ap_ddr, ap_dds, ap_ddt, ap_ddu, ap_ddv, ap_ddw, ap_ddx, ap_ddy, ap_ddz, " +
                " ap_dea, ap_deb, ap_dec, ap_ded, ap_dee, ap_def, ap_deg, ap_deh, ap_dei, ap_dej, ap_dek, ap_del, ap_dem, " +
                " ap_den, ap_deo, ap_dep, ap_deq, ap_der, ap_des, ap_det, ap_deu, ap_dev, ap_dew, ap_dex, ap_dey, ap_dez, " +
                " ap_dfa, ap_dfb, ap_dfc, ap_dfd, ap_dfe, ap_dff, ap_dfg, ap_dfh, ap_dfi, ap_dfj, ap_dfk, ap_dfl, ap_dfm, " +
                " ap_dfn, ap_dfo, ap_dfp, ap_dfq, ap_dfr, ap_dfs, ap_dft, ap_dfu, ap_dfv, ap_dfw, ap_dfx, ap_dfy, ap_dfz, " +
                " ap_dga, ap_dgb, ap_dgc, ap_dgd, ap_dge, ap_dgf, ap_dgg, ap_dgh, ap_dgi, ap_dgj, ap_dgk, ap_dgl, ap_dgm, " +
                " ap_dgn, ap_dgo, ap_dgp, ap_dgq, ap_dgr, ap_dgs, ap_dgt, ap_dgu, ap_dgv, ap_dgw, ap_dgx, ap_dgy, ap_dgz, " +
                " ap_dha, ap_dhb, ap_dhc, ap_dhd, ap_dhe, ap_dhf, ap_dhg, ap_dhh, ap_dhi, ap_dhj, ap_dhk, ap_dhl, ap_dhm, " +
                " ap_dhn, ap_dho, ap_dhp, ap_dhq, ap_dhr, ap_dhs, ap_dht, ap_dhu, ap_dhv, ap_dhw, ap_dhx, ap_dhy, ap_dhz, " +
                " ap_dia, ap_dib, ap_dic, ap_did, ap_die, ap_dif, ap_dig, ap_dih, ap_dii, ap_dij, ap_dik, ap_dil, ap_dim, " +
                " ap_din, ap_dio, ap_dip, ap_diq, ap_dir, ap_dis, ap_dit, ap_diu, ap_div, ap_diw, ap_dix, ap_diy, ap_diz, " +
                " ap_dja, ap_djb, ap_djc, ap_djd, ap_dje, ap_djf, ap_djg, ap_djh, ap_dji, ap_djj, ap_djk, ap_djl, ap_djm, " +
                " ap_djn, ap_djo, ap_djp, ap_djq, ap_djr, ap_djs, ap_djt, ap_dju, ap_djv, ap_djw, ap_djx, ap_djy, ap_djz, " +
                " ap_dka, ap_dkb, ap_dkc, ap_dkd, ap_dke, ap_dkf, ap_dkg, ap_dkh, ap_dki, ap_dkj, ap_dkk, ap_dkl, ap_dkm, " +
                " ap_dkn, ap_dko, ap_dkp, ap_dkq, ap_dkr, ap_dks, ap_dkt, ap_dku, ap_dkv, ap_dkw, ap_dkx, ap_dky, ap_dkz, " +
                " ap_dla, ap_dlb, ap_dlc, ap_dld, ap_dle, ap_dlf, ap_dlg, ap_dlh, ap_dli, ap_dlj, ap_dlk, ap_dll, ap_dlm, " +
                " ap_dln, ap_dlo, ap_dlp, ap_dlq, ap_dlr, ap_dls, ap_dlt, ap_dlu, ap_dlv, ap_dlw, ap_dlx, ap_dly, ap_dlz, " +
                " ap_dma, ap_dmb, ap_dmc, ap_dmd, ap_dme, ap_dmf, ap_dmg, ap_dmh, ap_dmi, ap_dmj, ap_dmk, ap_dml, ap_dmm, " +
                " ap_dmn, ap_dmo, ap_dmp, ap_dmq, ap_dmr, ap_dms, ap_dmt, ap_dmu, ap_dmv, ap_dmw, ap_dmx, ap_dmy, ap_dmz ) " +
                " VALUES ( " +
                " :fileNo, :priceNo, " +
                " :apDaa, :apDab, :apDac, :apDad, :apDae, :apDaf, :apDag, :apDah, :apDai, :apDaj, :apDak, :apDal, :apDam, " +
                " :apDan, :apDao, :apDap, :apDaq, :apDar, :apDas, :apDat, :apDau, :apDav, :apDaw, :apDax, :apDay, :apDaz, " +
                " :apDba, :apDbb, :apDbc, :apDbd, :apDbe, :apDbf, :apDbg, :apDbh, :apDbi, :apDbj, :apDbk, :apDbl, :apDbm, " +
                " :apDbn, :apDbo, :apDbp, :apDbq, :apDbr, :apDbs, :apDbt, :apDbu, :apDbv, :apDbw, :apDbx, :apDby, :apDbz, " +
                " :apDca, :apDcb, :apDcc, :apDcd, :apDce, :apDcf, :apDcg, :apDch, :apDci, :apDcj, :apDck, :apDcl, :apDcm, " +
                " :apDcn, :apDco, :apDcp, :apDcq, :apDcr, :apDcs, :apDct, :apDcu, :apDcv, :apDcw, :apDcx, :apDcy, :apDcz, " +
                " :apDda, :apDdb, :apDdc, :apDdd, :apDde, :apDdf, :apDdg, :apDdh, :apDdi, :apDdj, :apDdk, :apDdl, :apDdm, " +
                " :apDdn, :apDdo, :apDdp, :apDdq, :apDdr, :apDds, :apDdt, :apDdu, :apDdv, :apDdw, :apDdx, :apDdy, :apDdz, " +
                " :apDea, :apDeb, :apDec, :apDed, :apDee, :apDef, :apDeg, :apDeh, :apDei, :apDej, :apDek, :apDel, :apDem, " +
                " :apDen, :apDeo, :apDep, :apDeq, :apDer, :apDes, :apDet, :apDeu, :apDev, :apDew, :apDex, :apDey, :apDez, " +
                " :apDfa, :apDfb, :apDfc, :apDfd, :apDfe, :apDff, :apDfg, :apDfh, :apDfi, :apDfj, :apDfk, :apDfl, :apDfm, " +
                " :apDfn, :apDfo, :apDfp, :apDfq, :apDfr, :apDfs, :apDft, :apDfu, :apDfv, :apDfw, :apDfx, :apDfy, :apDfz, " +
                " :apDga, :apDgb, :apDgc, :apDgd, :apDge, :apDgf, :apDgg, :apDgh, :apDgi, :apDgj, :apDgk, :apDgl, :apDgm, " +
                " :apDgn, :apDgo, :apDgp, :apDgq, :apDgr, :apDgs, :apDgt, :apDgu, :apDgv, :apDgw, :apDgx, :apDgy, :apDgz, " +
                " :apDha, :apDhb, :apDhc, :apDhd, :apDhe, :apDhf, :apDhg, :apDhh, :apDhi, :apDhj, :apDhk, :apDhl, :apDhm, " +
                " :apDhn, :apDho, :apDhp, :apDhq, :apDhr, :apDhs, :apDht, :apDhu, :apDhv, :apDhw, :apDhx, :apDhy, :apDhz, " +
                " :apDia, :apDib, :apDic, :apDid, :apDie, :apDif, :apDig, :apDih, :apDii, :apDij, :apDik, :apDil, :apDim, " +
                " :apDin, :apDio, :apDip, :apDiq, :apDir, :apDis, :apDit, :apDiu, :apDiv, :apDiw, :apDix, :apDiy, :apDiz, " +
                " :apDja, :apDjb, :apDjc, :apDjd, :apDje, :apDjf, :apDjg, :apDjh, :apDji, :apDjj, :apDjk, :apDjl, :apDjm, " +
                " :apDjn, :apDjo, :apDjp, :apDjq, :apDjr, :apDjs, :apDjt, :apDju, :apDjv, :apDjw, :apDjx, :apDjy, :apDjz, " +
                " :apDka, :apDkb, :apDkc, :apDkd, :apDke, :apDkf, :apDkg, :apDkh, :apDki, :apDkj, :apDkk, :apDkl, :apDkm, " +
                " :apDkn, :apDko, :apDkp, :apDkq, :apDkr, :apDks, :apDkt, :apDku, :apDkv, :apDkw, :apDkx, :apDky, :apDkz, " +
                " :apDla, :apDlb, :apDlc, :apDld, :apDle, :apDlf, :apDlg, :apDlh, :apDli, :apDlj, :apDlk, :apDll, :apDlm, " +
                " :apDln, :apDlo, :apDlp, :apDlq, :apDlr, :apDls, :apDlt, :apDlu, :apDlv, :apDlw, :apDlx, :apDly, :apDlz, " +
                " :apDma, :apDmb, :apDmc, :apDmd, :apDme, :apDmf, :apDmg, :apDmh, :apDmi, :apDmj, :apDmk, :apDml, :apDmm, " +
                " :apDmn, :apDmo, :apDmp, :apDmq, :apDmr, :apDms, :apDmt, :apDmu, :apDmv, :apDmw, :apDmx, :apDmy, :apDmz ) ";

        MapSqlParameterSource[] myParameterSourceAry = new MapSqlParameterSource[dataFeedAirticketPriceD1List.size()];

        for (int i = 0; i < dataFeedAirticketPriceD1List.size(); i++) {
            DataFeedAirticketPriceD1 wkDataFeedAirticketPriceD1 = dataFeedAirticketPriceD1List.get(i);

            myParameterSourceAry[i] = new MapSqlParameterSource();

            myParameterSourceAry[i].addValue("fileNo", wkDataFeedAirticketPriceD1.getFileNo());
            myParameterSourceAry[i].addValue("priceNo", wkDataFeedAirticketPriceD1.getPriceNo());
            myParameterSourceAry[i].addValue("apDaa", wkDataFeedAirticketPriceD1.getApDaa());
            myParameterSourceAry[i].addValue("apDab", wkDataFeedAirticketPriceD1.getApDab());
            myParameterSourceAry[i].addValue("apDac", wkDataFeedAirticketPriceD1.getApDac());
            myParameterSourceAry[i].addValue("apDad", wkDataFeedAirticketPriceD1.getApDad());
            myParameterSourceAry[i].addValue("apDae", wkDataFeedAirticketPriceD1.getApDae());
            myParameterSourceAry[i].addValue("apDaf", wkDataFeedAirticketPriceD1.getApDaf());
            myParameterSourceAry[i].addValue("apDag", wkDataFeedAirticketPriceD1.getApDag());
            myParameterSourceAry[i].addValue("apDah", wkDataFeedAirticketPriceD1.getApDah());
            myParameterSourceAry[i].addValue("apDai", wkDataFeedAirticketPriceD1.getApDai());
            myParameterSourceAry[i].addValue("apDaj", wkDataFeedAirticketPriceD1.getApDaj());
            myParameterSourceAry[i].addValue("apDak", wkDataFeedAirticketPriceD1.getApDak());
            myParameterSourceAry[i].addValue("apDal", wkDataFeedAirticketPriceD1.getApDal());
            myParameterSourceAry[i].addValue("apDam", wkDataFeedAirticketPriceD1.getApDam());
            myParameterSourceAry[i].addValue("apDan", wkDataFeedAirticketPriceD1.getApDan());
            myParameterSourceAry[i].addValue("apDao", wkDataFeedAirticketPriceD1.getApDao());
            myParameterSourceAry[i].addValue("apDap", wkDataFeedAirticketPriceD1.getApDap());
            myParameterSourceAry[i].addValue("apDaq", wkDataFeedAirticketPriceD1.getApDaq());
            myParameterSourceAry[i].addValue("apDar", wkDataFeedAirticketPriceD1.getApDar());
            myParameterSourceAry[i].addValue("apDas", wkDataFeedAirticketPriceD1.getApDas());
            myParameterSourceAry[i].addValue("apDat", wkDataFeedAirticketPriceD1.getApDat());
            myParameterSourceAry[i].addValue("apDau", wkDataFeedAirticketPriceD1.getApDau());
            myParameterSourceAry[i].addValue("apDav", wkDataFeedAirticketPriceD1.getApDav());
            myParameterSourceAry[i].addValue("apDaw", wkDataFeedAirticketPriceD1.getApDaw());
            myParameterSourceAry[i].addValue("apDax", wkDataFeedAirticketPriceD1.getApDax());
            myParameterSourceAry[i].addValue("apDay", wkDataFeedAirticketPriceD1.getApDay());
            myParameterSourceAry[i].addValue("apDaz", wkDataFeedAirticketPriceD1.getApDaz());
            myParameterSourceAry[i].addValue("apDba", wkDataFeedAirticketPriceD1.getApDba());
            myParameterSourceAry[i].addValue("apDbb", wkDataFeedAirticketPriceD1.getApDbb());
            myParameterSourceAry[i].addValue("apDbc", wkDataFeedAirticketPriceD1.getApDbc());
            myParameterSourceAry[i].addValue("apDbd", wkDataFeedAirticketPriceD1.getApDbd());
            myParameterSourceAry[i].addValue("apDbe", wkDataFeedAirticketPriceD1.getApDbe());
            myParameterSourceAry[i].addValue("apDbf", wkDataFeedAirticketPriceD1.getApDbf());
            myParameterSourceAry[i].addValue("apDbg", wkDataFeedAirticketPriceD1.getApDbg());
            myParameterSourceAry[i].addValue("apDbh", wkDataFeedAirticketPriceD1.getApDbh());
            myParameterSourceAry[i].addValue("apDbi", wkDataFeedAirticketPriceD1.getApDbi());
            myParameterSourceAry[i].addValue("apDbj", wkDataFeedAirticketPriceD1.getApDbj());
            myParameterSourceAry[i].addValue("apDbk", wkDataFeedAirticketPriceD1.getApDbk());
            myParameterSourceAry[i].addValue("apDbl", wkDataFeedAirticketPriceD1.getApDbl());
            myParameterSourceAry[i].addValue("apDbm", wkDataFeedAirticketPriceD1.getApDbm());
            myParameterSourceAry[i].addValue("apDbn", wkDataFeedAirticketPriceD1.getApDbn());
            myParameterSourceAry[i].addValue("apDbo", wkDataFeedAirticketPriceD1.getApDbo());
            myParameterSourceAry[i].addValue("apDbp", wkDataFeedAirticketPriceD1.getApDbp());
            myParameterSourceAry[i].addValue("apDbq", wkDataFeedAirticketPriceD1.getApDbq());
            myParameterSourceAry[i].addValue("apDbr", wkDataFeedAirticketPriceD1.getApDbr());
            myParameterSourceAry[i].addValue("apDbs", wkDataFeedAirticketPriceD1.getApDbs());
            myParameterSourceAry[i].addValue("apDbt", wkDataFeedAirticketPriceD1.getApDbt());
            myParameterSourceAry[i].addValue("apDbu", wkDataFeedAirticketPriceD1.getApDbu());
            myParameterSourceAry[i].addValue("apDbv", wkDataFeedAirticketPriceD1.getApDbv());
            myParameterSourceAry[i].addValue("apDbw", wkDataFeedAirticketPriceD1.getApDbw());
            myParameterSourceAry[i].addValue("apDbx", wkDataFeedAirticketPriceD1.getApDbx());
            myParameterSourceAry[i].addValue("apDby", wkDataFeedAirticketPriceD1.getApDby());
            myParameterSourceAry[i].addValue("apDbz", wkDataFeedAirticketPriceD1.getApDbz());
            myParameterSourceAry[i].addValue("apDca", wkDataFeedAirticketPriceD1.getApDca());
            myParameterSourceAry[i].addValue("apDcb", wkDataFeedAirticketPriceD1.getApDcb());
            myParameterSourceAry[i].addValue("apDcc", wkDataFeedAirticketPriceD1.getApDcc());
            myParameterSourceAry[i].addValue("apDcd", wkDataFeedAirticketPriceD1.getApDcd());
            myParameterSourceAry[i].addValue("apDce", wkDataFeedAirticketPriceD1.getApDce());
            myParameterSourceAry[i].addValue("apDcf", wkDataFeedAirticketPriceD1.getApDcf());
            myParameterSourceAry[i].addValue("apDcg", wkDataFeedAirticketPriceD1.getApDcg());
            myParameterSourceAry[i].addValue("apDch", wkDataFeedAirticketPriceD1.getApDch());
            myParameterSourceAry[i].addValue("apDci", wkDataFeedAirticketPriceD1.getApDci());
            myParameterSourceAry[i].addValue("apDcj", wkDataFeedAirticketPriceD1.getApDcj());
            myParameterSourceAry[i].addValue("apDck", wkDataFeedAirticketPriceD1.getApDck());
            myParameterSourceAry[i].addValue("apDcl", wkDataFeedAirticketPriceD1.getApDcl());
            myParameterSourceAry[i].addValue("apDcm", wkDataFeedAirticketPriceD1.getApDcm());
            myParameterSourceAry[i].addValue("apDcn", wkDataFeedAirticketPriceD1.getApDcn());
            myParameterSourceAry[i].addValue("apDco", wkDataFeedAirticketPriceD1.getApDco());
            myParameterSourceAry[i].addValue("apDcp", wkDataFeedAirticketPriceD1.getApDcp());
            myParameterSourceAry[i].addValue("apDcq", wkDataFeedAirticketPriceD1.getApDcq());
            myParameterSourceAry[i].addValue("apDcr", wkDataFeedAirticketPriceD1.getApDcr());
            myParameterSourceAry[i].addValue("apDcs", wkDataFeedAirticketPriceD1.getApDcs());
            myParameterSourceAry[i].addValue("apDct", wkDataFeedAirticketPriceD1.getApDct());
            myParameterSourceAry[i].addValue("apDcu", wkDataFeedAirticketPriceD1.getApDcu());
            myParameterSourceAry[i].addValue("apDcv", wkDataFeedAirticketPriceD1.getApDcv());
            myParameterSourceAry[i].addValue("apDcw", wkDataFeedAirticketPriceD1.getApDcw());
            myParameterSourceAry[i].addValue("apDcx", wkDataFeedAirticketPriceD1.getApDcx());
            myParameterSourceAry[i].addValue("apDcy", wkDataFeedAirticketPriceD1.getApDcy());
            myParameterSourceAry[i].addValue("apDcz", wkDataFeedAirticketPriceD1.getApDcz());
            myParameterSourceAry[i].addValue("apDda", wkDataFeedAirticketPriceD1.getApDda());
            myParameterSourceAry[i].addValue("apDdb", wkDataFeedAirticketPriceD1.getApDdb());
            myParameterSourceAry[i].addValue("apDdc", wkDataFeedAirticketPriceD1.getApDdc());
            myParameterSourceAry[i].addValue("apDdd", wkDataFeedAirticketPriceD1.getApDdd());
            myParameterSourceAry[i].addValue("apDde", wkDataFeedAirticketPriceD1.getApDde());
            myParameterSourceAry[i].addValue("apDdf", wkDataFeedAirticketPriceD1.getApDdf());
            myParameterSourceAry[i].addValue("apDdg", wkDataFeedAirticketPriceD1.getApDdg());
            myParameterSourceAry[i].addValue("apDdh", wkDataFeedAirticketPriceD1.getApDdh());
            myParameterSourceAry[i].addValue("apDdi", wkDataFeedAirticketPriceD1.getApDdi());
            myParameterSourceAry[i].addValue("apDdj", wkDataFeedAirticketPriceD1.getApDdj());
            myParameterSourceAry[i].addValue("apDdk", wkDataFeedAirticketPriceD1.getApDdk());
            myParameterSourceAry[i].addValue("apDdl", wkDataFeedAirticketPriceD1.getApDdl());
            myParameterSourceAry[i].addValue("apDdm", wkDataFeedAirticketPriceD1.getApDdm());
            myParameterSourceAry[i].addValue("apDdn", wkDataFeedAirticketPriceD1.getApDdn());
            myParameterSourceAry[i].addValue("apDdo", wkDataFeedAirticketPriceD1.getApDdo());
            myParameterSourceAry[i].addValue("apDdp", wkDataFeedAirticketPriceD1.getApDdp());
            myParameterSourceAry[i].addValue("apDdq", wkDataFeedAirticketPriceD1.getApDdq());
            myParameterSourceAry[i].addValue("apDdr", wkDataFeedAirticketPriceD1.getApDdr());
            myParameterSourceAry[i].addValue("apDds", wkDataFeedAirticketPriceD1.getApDds());
            myParameterSourceAry[i].addValue("apDdt", wkDataFeedAirticketPriceD1.getApDdt());
            myParameterSourceAry[i].addValue("apDdu", wkDataFeedAirticketPriceD1.getApDdu());
            myParameterSourceAry[i].addValue("apDdv", wkDataFeedAirticketPriceD1.getApDdv());
            myParameterSourceAry[i].addValue("apDdw", wkDataFeedAirticketPriceD1.getApDdw());
            myParameterSourceAry[i].addValue("apDdx", wkDataFeedAirticketPriceD1.getApDdx());
            myParameterSourceAry[i].addValue("apDdy", wkDataFeedAirticketPriceD1.getApDdy());
            myParameterSourceAry[i].addValue("apDdz", wkDataFeedAirticketPriceD1.getApDdz());
            myParameterSourceAry[i].addValue("apDea", wkDataFeedAirticketPriceD1.getApDea());
            myParameterSourceAry[i].addValue("apDeb", wkDataFeedAirticketPriceD1.getApDeb());
            myParameterSourceAry[i].addValue("apDec", wkDataFeedAirticketPriceD1.getApDec());
            myParameterSourceAry[i].addValue("apDed", wkDataFeedAirticketPriceD1.getApDed());
            myParameterSourceAry[i].addValue("apDee", wkDataFeedAirticketPriceD1.getApDee());
            myParameterSourceAry[i].addValue("apDef", wkDataFeedAirticketPriceD1.getApDef());
            myParameterSourceAry[i].addValue("apDeg", wkDataFeedAirticketPriceD1.getApDeg());
            myParameterSourceAry[i].addValue("apDeh", wkDataFeedAirticketPriceD1.getApDeh());
            myParameterSourceAry[i].addValue("apDei", wkDataFeedAirticketPriceD1.getApDei());
            myParameterSourceAry[i].addValue("apDej", wkDataFeedAirticketPriceD1.getApDej());
            myParameterSourceAry[i].addValue("apDek", wkDataFeedAirticketPriceD1.getApDek());
            myParameterSourceAry[i].addValue("apDel", wkDataFeedAirticketPriceD1.getApDel());
            myParameterSourceAry[i].addValue("apDem", wkDataFeedAirticketPriceD1.getApDem());
            myParameterSourceAry[i].addValue("apDen", wkDataFeedAirticketPriceD1.getApDen());
            myParameterSourceAry[i].addValue("apDeo", wkDataFeedAirticketPriceD1.getApDeo());
            myParameterSourceAry[i].addValue("apDep", wkDataFeedAirticketPriceD1.getApDep());
            myParameterSourceAry[i].addValue("apDeq", wkDataFeedAirticketPriceD1.getApDeq());
            myParameterSourceAry[i].addValue("apDer", wkDataFeedAirticketPriceD1.getApDer());
            myParameterSourceAry[i].addValue("apDes", wkDataFeedAirticketPriceD1.getApDes());
            myParameterSourceAry[i].addValue("apDet", wkDataFeedAirticketPriceD1.getApDet());
            myParameterSourceAry[i].addValue("apDeu", wkDataFeedAirticketPriceD1.getApDeu());
            myParameterSourceAry[i].addValue("apDev", wkDataFeedAirticketPriceD1.getApDev());
            myParameterSourceAry[i].addValue("apDew", wkDataFeedAirticketPriceD1.getApDew());
            myParameterSourceAry[i].addValue("apDex", wkDataFeedAirticketPriceD1.getApDex());
            myParameterSourceAry[i].addValue("apDey", wkDataFeedAirticketPriceD1.getApDey());
            myParameterSourceAry[i].addValue("apDez", wkDataFeedAirticketPriceD1.getApDez());
            myParameterSourceAry[i].addValue("apDfa", wkDataFeedAirticketPriceD1.getApDfa());
            myParameterSourceAry[i].addValue("apDfb", wkDataFeedAirticketPriceD1.getApDfb());
            myParameterSourceAry[i].addValue("apDfc", wkDataFeedAirticketPriceD1.getApDfc());
            myParameterSourceAry[i].addValue("apDfd", wkDataFeedAirticketPriceD1.getApDfd());
            myParameterSourceAry[i].addValue("apDfe", wkDataFeedAirticketPriceD1.getApDfe());
            myParameterSourceAry[i].addValue("apDff", wkDataFeedAirticketPriceD1.getApDff());
            myParameterSourceAry[i].addValue("apDfg", wkDataFeedAirticketPriceD1.getApDfg());
            myParameterSourceAry[i].addValue("apDfh", wkDataFeedAirticketPriceD1.getApDfh());
            myParameterSourceAry[i].addValue("apDfi", wkDataFeedAirticketPriceD1.getApDfi());
            myParameterSourceAry[i].addValue("apDfj", wkDataFeedAirticketPriceD1.getApDfj());
            myParameterSourceAry[i].addValue("apDfk", wkDataFeedAirticketPriceD1.getApDfk());
            myParameterSourceAry[i].addValue("apDfl", wkDataFeedAirticketPriceD1.getApDfl());
            myParameterSourceAry[i].addValue("apDfm", wkDataFeedAirticketPriceD1.getApDfm());
            myParameterSourceAry[i].addValue("apDfn", wkDataFeedAirticketPriceD1.getApDfn());
            myParameterSourceAry[i].addValue("apDfo", wkDataFeedAirticketPriceD1.getApDfo());
            myParameterSourceAry[i].addValue("apDfp", wkDataFeedAirticketPriceD1.getApDfp());
            myParameterSourceAry[i].addValue("apDfq", wkDataFeedAirticketPriceD1.getApDfq());
            myParameterSourceAry[i].addValue("apDfr", wkDataFeedAirticketPriceD1.getApDfr());
            myParameterSourceAry[i].addValue("apDfs", wkDataFeedAirticketPriceD1.getApDfs());
            myParameterSourceAry[i].addValue("apDft", wkDataFeedAirticketPriceD1.getApDft());
            myParameterSourceAry[i].addValue("apDfu", wkDataFeedAirticketPriceD1.getApDfu());
            myParameterSourceAry[i].addValue("apDfv", wkDataFeedAirticketPriceD1.getApDfv());
            myParameterSourceAry[i].addValue("apDfw", wkDataFeedAirticketPriceD1.getApDfw());
            myParameterSourceAry[i].addValue("apDfx", wkDataFeedAirticketPriceD1.getApDfx());
            myParameterSourceAry[i].addValue("apDfy", wkDataFeedAirticketPriceD1.getApDfy());
            myParameterSourceAry[i].addValue("apDfz", wkDataFeedAirticketPriceD1.getApDfz());
            myParameterSourceAry[i].addValue("apDga", wkDataFeedAirticketPriceD1.getApDga());
            myParameterSourceAry[i].addValue("apDgb", wkDataFeedAirticketPriceD1.getApDgb());
            myParameterSourceAry[i].addValue("apDgc", wkDataFeedAirticketPriceD1.getApDgc());
            myParameterSourceAry[i].addValue("apDgd", wkDataFeedAirticketPriceD1.getApDgd());
            myParameterSourceAry[i].addValue("apDge", wkDataFeedAirticketPriceD1.getApDge());
            myParameterSourceAry[i].addValue("apDgf", wkDataFeedAirticketPriceD1.getApDgf());
            myParameterSourceAry[i].addValue("apDgg", wkDataFeedAirticketPriceD1.getApDgg());
            myParameterSourceAry[i].addValue("apDgh", wkDataFeedAirticketPriceD1.getApDgh());
            myParameterSourceAry[i].addValue("apDgi", wkDataFeedAirticketPriceD1.getApDgi());
            myParameterSourceAry[i].addValue("apDgj", wkDataFeedAirticketPriceD1.getApDgj());
            myParameterSourceAry[i].addValue("apDgk", wkDataFeedAirticketPriceD1.getApDgk());
            myParameterSourceAry[i].addValue("apDgl", wkDataFeedAirticketPriceD1.getApDgl());
            myParameterSourceAry[i].addValue("apDgm", wkDataFeedAirticketPriceD1.getApDgm());
            myParameterSourceAry[i].addValue("apDgn", wkDataFeedAirticketPriceD1.getApDgn());
            myParameterSourceAry[i].addValue("apDgo", wkDataFeedAirticketPriceD1.getApDgo());
            myParameterSourceAry[i].addValue("apDgp", wkDataFeedAirticketPriceD1.getApDgp());
            myParameterSourceAry[i].addValue("apDgq", wkDataFeedAirticketPriceD1.getApDgq());
            myParameterSourceAry[i].addValue("apDgr", wkDataFeedAirticketPriceD1.getApDgr());
            myParameterSourceAry[i].addValue("apDgs", wkDataFeedAirticketPriceD1.getApDgs());
            myParameterSourceAry[i].addValue("apDgt", wkDataFeedAirticketPriceD1.getApDgt());
            myParameterSourceAry[i].addValue("apDgu", wkDataFeedAirticketPriceD1.getApDgu());
            myParameterSourceAry[i].addValue("apDgv", wkDataFeedAirticketPriceD1.getApDgv());
            myParameterSourceAry[i].addValue("apDgw", wkDataFeedAirticketPriceD1.getApDgw());
            myParameterSourceAry[i].addValue("apDgx", wkDataFeedAirticketPriceD1.getApDgx());
            myParameterSourceAry[i].addValue("apDgy", wkDataFeedAirticketPriceD1.getApDgy());
            myParameterSourceAry[i].addValue("apDgz", wkDataFeedAirticketPriceD1.getApDgz());
            myParameterSourceAry[i].addValue("apDha", wkDataFeedAirticketPriceD1.getApDha());
            myParameterSourceAry[i].addValue("apDhb", wkDataFeedAirticketPriceD1.getApDhb());
            myParameterSourceAry[i].addValue("apDhc", wkDataFeedAirticketPriceD1.getApDhc());
            myParameterSourceAry[i].addValue("apDhd", wkDataFeedAirticketPriceD1.getApDhd());
            myParameterSourceAry[i].addValue("apDhe", wkDataFeedAirticketPriceD1.getApDhe());
            myParameterSourceAry[i].addValue("apDhf", wkDataFeedAirticketPriceD1.getApDhf());
            myParameterSourceAry[i].addValue("apDhg", wkDataFeedAirticketPriceD1.getApDhg());
            myParameterSourceAry[i].addValue("apDhh", wkDataFeedAirticketPriceD1.getApDhh());
            myParameterSourceAry[i].addValue("apDhi", wkDataFeedAirticketPriceD1.getApDhi());
            myParameterSourceAry[i].addValue("apDhj", wkDataFeedAirticketPriceD1.getApDhj());
            myParameterSourceAry[i].addValue("apDhk", wkDataFeedAirticketPriceD1.getApDhk());
            myParameterSourceAry[i].addValue("apDhl", wkDataFeedAirticketPriceD1.getApDhl());
            myParameterSourceAry[i].addValue("apDhm", wkDataFeedAirticketPriceD1.getApDhm());
            myParameterSourceAry[i].addValue("apDhn", wkDataFeedAirticketPriceD1.getApDhn());
            myParameterSourceAry[i].addValue("apDho", wkDataFeedAirticketPriceD1.getApDho());
            myParameterSourceAry[i].addValue("apDhp", wkDataFeedAirticketPriceD1.getApDhp());
            myParameterSourceAry[i].addValue("apDhq", wkDataFeedAirticketPriceD1.getApDhq());
            myParameterSourceAry[i].addValue("apDhr", wkDataFeedAirticketPriceD1.getApDhr());
            myParameterSourceAry[i].addValue("apDhs", wkDataFeedAirticketPriceD1.getApDhs());
            myParameterSourceAry[i].addValue("apDht", wkDataFeedAirticketPriceD1.getApDht());
            myParameterSourceAry[i].addValue("apDhu", wkDataFeedAirticketPriceD1.getApDhu());
            myParameterSourceAry[i].addValue("apDhv", wkDataFeedAirticketPriceD1.getApDhv());
            myParameterSourceAry[i].addValue("apDhw", wkDataFeedAirticketPriceD1.getApDhw());
            myParameterSourceAry[i].addValue("apDhx", wkDataFeedAirticketPriceD1.getApDhx());
            myParameterSourceAry[i].addValue("apDhy", wkDataFeedAirticketPriceD1.getApDhy());
            myParameterSourceAry[i].addValue("apDhz", wkDataFeedAirticketPriceD1.getApDhz());
            myParameterSourceAry[i].addValue("apDia", wkDataFeedAirticketPriceD1.getApDia());
            myParameterSourceAry[i].addValue("apDib", wkDataFeedAirticketPriceD1.getApDib());
            myParameterSourceAry[i].addValue("apDic", wkDataFeedAirticketPriceD1.getApDic());
            myParameterSourceAry[i].addValue("apDid", wkDataFeedAirticketPriceD1.getApDid());
            myParameterSourceAry[i].addValue("apDie", wkDataFeedAirticketPriceD1.getApDie());
            myParameterSourceAry[i].addValue("apDif", wkDataFeedAirticketPriceD1.getApDif());
            myParameterSourceAry[i].addValue("apDig", wkDataFeedAirticketPriceD1.getApDig());
            myParameterSourceAry[i].addValue("apDih", wkDataFeedAirticketPriceD1.getApDih());
            myParameterSourceAry[i].addValue("apDii", wkDataFeedAirticketPriceD1.getApDii());
            myParameterSourceAry[i].addValue("apDij", wkDataFeedAirticketPriceD1.getApDij());
            myParameterSourceAry[i].addValue("apDik", wkDataFeedAirticketPriceD1.getApDik());
            myParameterSourceAry[i].addValue("apDil", wkDataFeedAirticketPriceD1.getApDil());
            myParameterSourceAry[i].addValue("apDim", wkDataFeedAirticketPriceD1.getApDim());
            myParameterSourceAry[i].addValue("apDin", wkDataFeedAirticketPriceD1.getApDin());
            myParameterSourceAry[i].addValue("apDio", wkDataFeedAirticketPriceD1.getApDio());
            myParameterSourceAry[i].addValue("apDip", wkDataFeedAirticketPriceD1.getApDip());
            myParameterSourceAry[i].addValue("apDiq", wkDataFeedAirticketPriceD1.getApDiq());
            myParameterSourceAry[i].addValue("apDir", wkDataFeedAirticketPriceD1.getApDir());
            myParameterSourceAry[i].addValue("apDis", wkDataFeedAirticketPriceD1.getApDis());
            myParameterSourceAry[i].addValue("apDit", wkDataFeedAirticketPriceD1.getApDit());
            myParameterSourceAry[i].addValue("apDiu", wkDataFeedAirticketPriceD1.getApDiu());
            myParameterSourceAry[i].addValue("apDiv", wkDataFeedAirticketPriceD1.getApDiv());
            myParameterSourceAry[i].addValue("apDiw", wkDataFeedAirticketPriceD1.getApDiw());
            myParameterSourceAry[i].addValue("apDix", wkDataFeedAirticketPriceD1.getApDix());
            myParameterSourceAry[i].addValue("apDiy", wkDataFeedAirticketPriceD1.getApDiy());
            myParameterSourceAry[i].addValue("apDiz", wkDataFeedAirticketPriceD1.getApDiz());
            myParameterSourceAry[i].addValue("apDja", wkDataFeedAirticketPriceD1.getApDja());
            myParameterSourceAry[i].addValue("apDjb", wkDataFeedAirticketPriceD1.getApDjb());
            myParameterSourceAry[i].addValue("apDjc", wkDataFeedAirticketPriceD1.getApDjc());
            myParameterSourceAry[i].addValue("apDjd", wkDataFeedAirticketPriceD1.getApDjd());
            myParameterSourceAry[i].addValue("apDje", wkDataFeedAirticketPriceD1.getApDje());
            myParameterSourceAry[i].addValue("apDjf", wkDataFeedAirticketPriceD1.getApDjf());
            myParameterSourceAry[i].addValue("apDjg", wkDataFeedAirticketPriceD1.getApDjg());
            myParameterSourceAry[i].addValue("apDjh", wkDataFeedAirticketPriceD1.getApDjh());
            myParameterSourceAry[i].addValue("apDji", wkDataFeedAirticketPriceD1.getApDji());
            myParameterSourceAry[i].addValue("apDjj", wkDataFeedAirticketPriceD1.getApDjj());
            myParameterSourceAry[i].addValue("apDjk", wkDataFeedAirticketPriceD1.getApDjk());
            myParameterSourceAry[i].addValue("apDjl", wkDataFeedAirticketPriceD1.getApDjl());
            myParameterSourceAry[i].addValue("apDjm", wkDataFeedAirticketPriceD1.getApDjm());
            myParameterSourceAry[i].addValue("apDjn", wkDataFeedAirticketPriceD1.getApDjn());
            myParameterSourceAry[i].addValue("apDjo", wkDataFeedAirticketPriceD1.getApDjo());
            myParameterSourceAry[i].addValue("apDjp", wkDataFeedAirticketPriceD1.getApDjp());
            myParameterSourceAry[i].addValue("apDjq", wkDataFeedAirticketPriceD1.getApDjq());
            myParameterSourceAry[i].addValue("apDjr", wkDataFeedAirticketPriceD1.getApDjr());
            myParameterSourceAry[i].addValue("apDjs", wkDataFeedAirticketPriceD1.getApDjs());
            myParameterSourceAry[i].addValue("apDjt", wkDataFeedAirticketPriceD1.getApDjt());
            myParameterSourceAry[i].addValue("apDju", wkDataFeedAirticketPriceD1.getApDju());
            myParameterSourceAry[i].addValue("apDjv", wkDataFeedAirticketPriceD1.getApDjv());
            myParameterSourceAry[i].addValue("apDjw", wkDataFeedAirticketPriceD1.getApDjw());
            myParameterSourceAry[i].addValue("apDjx", wkDataFeedAirticketPriceD1.getApDjx());
            myParameterSourceAry[i].addValue("apDjy", wkDataFeedAirticketPriceD1.getApDjy());
            myParameterSourceAry[i].addValue("apDjz", wkDataFeedAirticketPriceD1.getApDjz());
            myParameterSourceAry[i].addValue("apDka", wkDataFeedAirticketPriceD1.getApDka());
            myParameterSourceAry[i].addValue("apDkb", wkDataFeedAirticketPriceD1.getApDkb());
            myParameterSourceAry[i].addValue("apDkc", wkDataFeedAirticketPriceD1.getApDkc());
            myParameterSourceAry[i].addValue("apDkd", wkDataFeedAirticketPriceD1.getApDkd());
            myParameterSourceAry[i].addValue("apDke", wkDataFeedAirticketPriceD1.getApDke());
            myParameterSourceAry[i].addValue("apDkf", wkDataFeedAirticketPriceD1.getApDkf());
            myParameterSourceAry[i].addValue("apDkg", wkDataFeedAirticketPriceD1.getApDkg());
            myParameterSourceAry[i].addValue("apDkh", wkDataFeedAirticketPriceD1.getApDkh());
            myParameterSourceAry[i].addValue("apDki", wkDataFeedAirticketPriceD1.getApDki());
            myParameterSourceAry[i].addValue("apDkj", wkDataFeedAirticketPriceD1.getApDkj());
            myParameterSourceAry[i].addValue("apDkk", wkDataFeedAirticketPriceD1.getApDkk());
            myParameterSourceAry[i].addValue("apDkl", wkDataFeedAirticketPriceD1.getApDkl());
            myParameterSourceAry[i].addValue("apDkm", wkDataFeedAirticketPriceD1.getApDkm());
            myParameterSourceAry[i].addValue("apDkn", wkDataFeedAirticketPriceD1.getApDkn());
            myParameterSourceAry[i].addValue("apDko", wkDataFeedAirticketPriceD1.getApDko());
            myParameterSourceAry[i].addValue("apDkp", wkDataFeedAirticketPriceD1.getApDkp());
            myParameterSourceAry[i].addValue("apDkq", wkDataFeedAirticketPriceD1.getApDkq());
            myParameterSourceAry[i].addValue("apDkr", wkDataFeedAirticketPriceD1.getApDkr());
            myParameterSourceAry[i].addValue("apDks", wkDataFeedAirticketPriceD1.getApDks());
            myParameterSourceAry[i].addValue("apDkt", wkDataFeedAirticketPriceD1.getApDkt());
            myParameterSourceAry[i].addValue("apDku", wkDataFeedAirticketPriceD1.getApDku());
            myParameterSourceAry[i].addValue("apDkv", wkDataFeedAirticketPriceD1.getApDkv());
            myParameterSourceAry[i].addValue("apDkw", wkDataFeedAirticketPriceD1.getApDkw());
            myParameterSourceAry[i].addValue("apDkx", wkDataFeedAirticketPriceD1.getApDkx());
            myParameterSourceAry[i].addValue("apDky", wkDataFeedAirticketPriceD1.getApDky());
            myParameterSourceAry[i].addValue("apDkz", wkDataFeedAirticketPriceD1.getApDkz());
            myParameterSourceAry[i].addValue("apDla", wkDataFeedAirticketPriceD1.getApDla());
            myParameterSourceAry[i].addValue("apDlb", wkDataFeedAirticketPriceD1.getApDlb());
            myParameterSourceAry[i].addValue("apDlc", wkDataFeedAirticketPriceD1.getApDlc());
            myParameterSourceAry[i].addValue("apDld", wkDataFeedAirticketPriceD1.getApDld());
            myParameterSourceAry[i].addValue("apDle", wkDataFeedAirticketPriceD1.getApDle());
            myParameterSourceAry[i].addValue("apDlf", wkDataFeedAirticketPriceD1.getApDlf());
            myParameterSourceAry[i].addValue("apDlg", wkDataFeedAirticketPriceD1.getApDlg());
            myParameterSourceAry[i].addValue("apDlh", wkDataFeedAirticketPriceD1.getApDlh());
            myParameterSourceAry[i].addValue("apDli", wkDataFeedAirticketPriceD1.getApDli());
            myParameterSourceAry[i].addValue("apDlj", wkDataFeedAirticketPriceD1.getApDlj());
            myParameterSourceAry[i].addValue("apDlk", wkDataFeedAirticketPriceD1.getApDlk());
            myParameterSourceAry[i].addValue("apDll", wkDataFeedAirticketPriceD1.getApDll());
            myParameterSourceAry[i].addValue("apDlm", wkDataFeedAirticketPriceD1.getApDlm());
            myParameterSourceAry[i].addValue("apDln", wkDataFeedAirticketPriceD1.getApDln());
            myParameterSourceAry[i].addValue("apDlo", wkDataFeedAirticketPriceD1.getApDlo());
            myParameterSourceAry[i].addValue("apDlp", wkDataFeedAirticketPriceD1.getApDlp());
            myParameterSourceAry[i].addValue("apDlq", wkDataFeedAirticketPriceD1.getApDlq());
            myParameterSourceAry[i].addValue("apDlr", wkDataFeedAirticketPriceD1.getApDlr());
            myParameterSourceAry[i].addValue("apDls", wkDataFeedAirticketPriceD1.getApDls());
            myParameterSourceAry[i].addValue("apDlt", wkDataFeedAirticketPriceD1.getApDlt());
            myParameterSourceAry[i].addValue("apDlu", wkDataFeedAirticketPriceD1.getApDlu());
            myParameterSourceAry[i].addValue("apDlv", wkDataFeedAirticketPriceD1.getApDlv());
            myParameterSourceAry[i].addValue("apDlw", wkDataFeedAirticketPriceD1.getApDlw());
            myParameterSourceAry[i].addValue("apDlx", wkDataFeedAirticketPriceD1.getApDlx());
            myParameterSourceAry[i].addValue("apDly", wkDataFeedAirticketPriceD1.getApDly());
            myParameterSourceAry[i].addValue("apDlz", wkDataFeedAirticketPriceD1.getApDlz());
            myParameterSourceAry[i].addValue("apDma", wkDataFeedAirticketPriceD1.getApDma());
            myParameterSourceAry[i].addValue("apDmb", wkDataFeedAirticketPriceD1.getApDmb());
            myParameterSourceAry[i].addValue("apDmc", wkDataFeedAirticketPriceD1.getApDmc());
            myParameterSourceAry[i].addValue("apDmd", wkDataFeedAirticketPriceD1.getApDmd());
            myParameterSourceAry[i].addValue("apDme", wkDataFeedAirticketPriceD1.getApDme());
            myParameterSourceAry[i].addValue("apDmf", wkDataFeedAirticketPriceD1.getApDmf());
            myParameterSourceAry[i].addValue("apDmg", wkDataFeedAirticketPriceD1.getApDmg());
            myParameterSourceAry[i].addValue("apDmh", wkDataFeedAirticketPriceD1.getApDmh());
            myParameterSourceAry[i].addValue("apDmi", wkDataFeedAirticketPriceD1.getApDmi());
            myParameterSourceAry[i].addValue("apDmj", wkDataFeedAirticketPriceD1.getApDmj());
            myParameterSourceAry[i].addValue("apDmk", wkDataFeedAirticketPriceD1.getApDmk());
            myParameterSourceAry[i].addValue("apDml", wkDataFeedAirticketPriceD1.getApDml());
            myParameterSourceAry[i].addValue("apDmm", wkDataFeedAirticketPriceD1.getApDmm());
            myParameterSourceAry[i].addValue("apDmn", wkDataFeedAirticketPriceD1.getApDmn());
            myParameterSourceAry[i].addValue("apDmo", wkDataFeedAirticketPriceD1.getApDmo());
            myParameterSourceAry[i].addValue("apDmp", wkDataFeedAirticketPriceD1.getApDmp());
            myParameterSourceAry[i].addValue("apDmq", wkDataFeedAirticketPriceD1.getApDmq());
            myParameterSourceAry[i].addValue("apDmr", wkDataFeedAirticketPriceD1.getApDmr());
            myParameterSourceAry[i].addValue("apDms", wkDataFeedAirticketPriceD1.getApDms());
            myParameterSourceAry[i].addValue("apDmt", wkDataFeedAirticketPriceD1.getApDmt());
            myParameterSourceAry[i].addValue("apDmu", wkDataFeedAirticketPriceD1.getApDmu());
            myParameterSourceAry[i].addValue("apDmv", wkDataFeedAirticketPriceD1.getApDmv());
            myParameterSourceAry[i].addValue("apDmw", wkDataFeedAirticketPriceD1.getApDmw());
            myParameterSourceAry[i].addValue("apDmx", wkDataFeedAirticketPriceD1.getApDmx());
            myParameterSourceAry[i].addValue("apDmy", wkDataFeedAirticketPriceD1.getApDmy());
            myParameterSourceAry[i].addValue("apDmz", wkDataFeedAirticketPriceD1.getApDmz());
        }

        myNamedParameterJdbcTemplate.batchUpdate(mySql, myParameterSourceAry);
    }

    @Override
    public void deleteDataFeedAirticketPriceD1sByFileNo(Integer fileNo) {
        String mySql = "DELETE FROM db_airticket.data_feed_airticket_price_d1 " +
                " WHERE file_no = :fileNo ";

        Map<String,Object> myMap = new HashMap<>();
        myMap.put("fileNo", fileNo);

        myNamedParameterJdbcTemplate.update(mySql, myMap);
    }

}
