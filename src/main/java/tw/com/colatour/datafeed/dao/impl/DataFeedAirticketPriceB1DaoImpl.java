package tw.com.colatour.datafeed.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Component;
import tw.com.colatour.datafeed.dao.DataFeedAirticketPriceB1Dao;
import tw.com.colatour.datafeed.model.DataFeedAirticketPriceB1;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class DataFeedAirticketPriceB1DaoImpl implements DataFeedAirticketPriceB1Dao {

    @Autowired
    private NamedParameterJdbcTemplate myNamedParameterJdbcTemplate;

    @Override
    public void createDataFeedAirticketPriceB1s(List<DataFeedAirticketPriceB1> dataFeedAirticketPriceB1List) {
        String mySql = "INSERT INTO db_airticket.data_feed_airticket_price_b1 ( " +
                " file_no, price_no, " +
                " ap_baa, ap_bab, ap_bac, ap_bad, ap_bae, ap_baf, ap_bag, ap_bah, ap_bai, ap_baj, ap_bak, ap_bal, ap_bam, " +
                " ap_ban, ap_bao, ap_bap, ap_baq, ap_bar, ap_bas, ap_bat, ap_bau, ap_bav, ap_baw, ap_bax, ap_bay, ap_baz, " +
                " ap_bba, ap_bbb, ap_bbc, ap_bbd, ap_bbe, ap_bbf, ap_bbg, ap_bbh, ap_bbi, ap_bbj, ap_bbk, ap_bbl, ap_bbm, " +
                " ap_bbn, ap_bbo, ap_bbp, ap_bbq, ap_bbr, ap_bbs, ap_bbt, ap_bbu, ap_bbv, ap_bbw, ap_bbx, ap_bby, ap_bbz, " +
                " ap_bca, ap_bcb, ap_bcc, ap_bcd, ap_bce, ap_bcf, ap_bcg, ap_bch, ap_bci, ap_bcj, ap_bck, ap_bcl, ap_bcm, " +
                " ap_bcn, ap_bco, ap_bcp, ap_bcq, ap_bcr, ap_bcs, ap_bct, ap_bcu, ap_bcv, ap_bcw, ap_bcx, ap_bcy, ap_bcz, " +
                " ap_bda, ap_bdb, ap_bdc, ap_bdd, ap_bde, ap_bdf, ap_bdg, ap_bdh, ap_bdi, ap_bdj, ap_bdk, ap_bdl, ap_bdm, " +
                " ap_bdn, ap_bdo, ap_bdp, ap_bdq, ap_bdr, ap_bds, ap_bdt, ap_bdu, ap_bdv, ap_bdw, ap_bdx, ap_bdy, ap_bdz, " +
                " ap_bea, ap_beb, ap_bec, ap_bed, ap_bee, ap_bef, ap_beg, ap_beh, ap_bei, ap_bej, ap_bek, ap_bel, ap_bem, " +
                " ap_ben, ap_beo, ap_bep, ap_beq, ap_ber, ap_bes, ap_bet, ap_beu, ap_bev, ap_bew, ap_bex, ap_bey, ap_bez, " +
                " ap_bfa, ap_bfb, ap_bfc, ap_bfd, ap_bfe, ap_bff, ap_bfg, ap_bfh, ap_bfi, ap_bfj, ap_bfk, ap_bfl, ap_bfm, " +
                " ap_bfn, ap_bfo, ap_bfp, ap_bfq, ap_bfr, ap_bfs, ap_bft, ap_bfu, ap_bfv, ap_bfw, ap_bfx, ap_bfy, ap_bfz, " +
                " ap_bga, ap_bgb, ap_bgc, ap_bgd, ap_bge, ap_bgf, ap_bgg, ap_bgh, ap_bgi, ap_bgj, ap_bgk, ap_bgl, ap_bgm, " +
                " ap_bgn, ap_bgo, ap_bgp, ap_bgq, ap_bgr, ap_bgs, ap_bgt, ap_bgu, ap_bgv, ap_bgw, ap_bgx, ap_bgy, ap_bgz, " +
                " ap_bha, ap_bhb, ap_bhc, ap_bhd, ap_bhe, ap_bhf, ap_bhg, ap_bhh, ap_bhi, ap_bhj, ap_bhk, ap_bhl, ap_bhm, " +
                " ap_bhn, ap_bho, ap_bhp, ap_bhq, ap_bhr, ap_bhs, ap_bht, ap_bhu, ap_bhv, ap_bhw, ap_bhx, ap_bhy, ap_bhz, " +
                " ap_bia, ap_bib, ap_bic, ap_bid, ap_bie, ap_bif, ap_big, ap_bih, ap_bii, ap_bij, ap_bik, ap_bil, ap_bim, " +
                " ap_bin, ap_bio, ap_bip, ap_biq, ap_bir, ap_bis, ap_bit, ap_biu, ap_biv, ap_biw, ap_bix, ap_biy, ap_biz, " +
                " ap_bja, ap_bjb, ap_bjc, ap_bjd, ap_bje, ap_bjf, ap_bjg, ap_bjh, ap_bji, ap_bjj, ap_bjk, ap_bjl, ap_bjm, " +
                " ap_bjn, ap_bjo, ap_bjp, ap_bjq, ap_bjr, ap_bjs, ap_bjt, ap_bju, ap_bjv, ap_bjw, ap_bjx, ap_bjy, ap_bjz, " +
                " ap_bka, ap_bkb, ap_bkc, ap_bkd, ap_bke, ap_bkf, ap_bkg, ap_bkh, ap_bki, ap_bkj, ap_bkk, ap_bkl, ap_bkm, " +
                " ap_bkn, ap_bko, ap_bkp, ap_bkq, ap_bkr, ap_bks, ap_bkt, ap_bku, ap_bkv, ap_bkw, ap_bkx, ap_bky, ap_bkz, " +
                " ap_bla, ap_blb, ap_blc, ap_bld, ap_ble, ap_blf, ap_blg, ap_blh, ap_bli, ap_blj, ap_blk, ap_bll, ap_blm, " +
                " ap_bln, ap_blo, ap_blp, ap_blq, ap_blr, ap_bls, ap_blt, ap_blu, ap_blv, ap_blw, ap_blx, ap_bly, ap_blz, " +
                " ap_bma, ap_bmb, ap_bmc, ap_bmd, ap_bme, ap_bmf, ap_bmg, ap_bmh, ap_bmi, ap_bmj, ap_bmk, ap_bml, ap_bmm, " +
                " ap_bmn, ap_bmo, ap_bmp, ap_bmq, ap_bmr, ap_bms, ap_bmt, ap_bmu, ap_bmv, ap_bmw, ap_bmx, ap_bmy, ap_bmz ) " +
                " VALUES ( " +
                " :fileNo, :priceNo, " +
                " :apBaa, :apBab, :apBac, :apBad, :apBae, :apBaf, :apBag, :apBah, :apBai, :apBaj, :apBak, :apBal, :apBam, " +
                " :apBan, :apBao, :apBap, :apBaq, :apBar, :apBas, :apBat, :apBau, :apBav, :apBaw, :apBax, :apBay, :apBaz, " +
                " :apBba, :apBbb, :apBbc, :apBbd, :apBbe, :apBbf, :apBbg, :apBbh, :apBbi, :apBbj, :apBbk, :apBbl, :apBbm, " +
                " :apBbn, :apBbo, :apBbp, :apBbq, :apBbr, :apBbs, :apBbt, :apBbu, :apBbv, :apBbw, :apBbx, :apBby, :apBbz, " +
                " :apBca, :apBcb, :apBcc, :apBcd, :apBce, :apBcf, :apBcg, :apBch, :apBci, :apBcj, :apBck, :apBcl, :apBcm, " +
                " :apBcn, :apBco, :apBcp, :apBcq, :apBcr, :apBcs, :apBct, :apBcu, :apBcv, :apBcw, :apBcx, :apBcy, :apBcz, " +
                " :apBda, :apBdb, :apBdc, :apBdd, :apBde, :apBdf, :apBdg, :apBdh, :apBdi, :apBdj, :apBdk, :apBdl, :apBdm, " +
                " :apBdn, :apBdo, :apBdp, :apBdq, :apBdr, :apBds, :apBdt, :apBdu, :apBdv, :apBdw, :apBdx, :apBdy, :apBdz, " +
                " :apBea, :apBeb, :apBec, :apBed, :apBee, :apBef, :apBeg, :apBeh, :apBei, :apBej, :apBek, :apBel, :apBem, " +
                " :apBen, :apBeo, :apBep, :apBeq, :apBer, :apBes, :apBet, :apBeu, :apBev, :apBew, :apBex, :apBey, :apBez, " +
                " :apBfa, :apBfb, :apBfc, :apBfd, :apBfe, :apBff, :apBfg, :apBfh, :apBfi, :apBfj, :apBfk, :apBfl, :apBfm, " +
                " :apBfn, :apBfo, :apBfp, :apBfq, :apBfr, :apBfs, :apBft, :apBfu, :apBfv, :apBfw, :apBfx, :apBfy, :apBfz, " +
                " :apBga, :apBgb, :apBgc, :apBgd, :apBge, :apBgf, :apBgg, :apBgh, :apBgi, :apBgj, :apBgk, :apBgl, :apBgm, " +
                " :apBgn, :apBgo, :apBgp, :apBgq, :apBgr, :apBgs, :apBgt, :apBgu, :apBgv, :apBgw, :apBgx, :apBgy, :apBgz, " +
                " :apBha, :apBhb, :apBhc, :apBhd, :apBhe, :apBhf, :apBhg, :apBhh, :apBhi, :apBhj, :apBhk, :apBhl, :apBhm, " +
                " :apBhn, :apBho, :apBhp, :apBhq, :apBhr, :apBhs, :apBht, :apBhu, :apBhv, :apBhw, :apBhx, :apBhy, :apBhz, " +
                " :apBia, :apBib, :apBic, :apBid, :apBie, :apBif, :apBig, :apBih, :apBii, :apBij, :apBik, :apBil, :apBim, " +
                " :apBin, :apBio, :apBip, :apBiq, :apBir, :apBis, :apBit, :apBiu, :apBiv, :apBiw, :apBix, :apBiy, :apBiz, " +
                " :apBja, :apBjb, :apBjc, :apBjd, :apBje, :apBjf, :apBjg, :apBjh, :apBji, :apBjj, :apBjk, :apBjl, :apBjm, " +
                " :apBjn, :apBjo, :apBjp, :apBjq, :apBjr, :apBjs, :apBjt, :apBju, :apBjv, :apBjw, :apBjx, :apBjy, :apBjz, " +
                " :apBka, :apBkb, :apBkc, :apBkd, :apBke, :apBkf, :apBkg, :apBkh, :apBki, :apBkj, :apBkk, :apBkl, :apBkm, " +
                " :apBkn, :apBko, :apBkp, :apBkq, :apBkr, :apBks, :apBkt, :apBku, :apBkv, :apBkw, :apBkx, :apBky, :apBkz, " +
                " :apBla, :apBlb, :apBlc, :apBld, :apBle, :apBlf, :apBlg, :apBlh, :apBli, :apBlj, :apBlk, :apBll, :apBlm, " +
                " :apBln, :apBlo, :apBlp, :apBlq, :apBlr, :apBls, :apBlt, :apBlu, :apBlv, :apBlw, :apBlx, :apBly, :apBlz, " +
                " :apBma, :apBmb, :apBmc, :apBmd, :apBme, :apBmf, :apBmg, :apBmh, :apBmi, :apBmj, :apBmk, :apBml, :apBmm, " +
                " :apBmn, :apBmo, :apBmp, :apBmq, :apBmr, :apBms, :apBmt, :apBmu, :apBmv, :apBmw, :apBmx, :apBmy, :apBmz ) ";

        MapSqlParameterSource[] myParameterSourceAry = new MapSqlParameterSource[dataFeedAirticketPriceB1List.size()];

        for (int i = 0; i < dataFeedAirticketPriceB1List.size(); i++) {
            DataFeedAirticketPriceB1 wkDataFeedAirticketPriceB1 = dataFeedAirticketPriceB1List.get(i);

            myParameterSourceAry[i] = new MapSqlParameterSource();

            myParameterSourceAry[i].addValue("fileNo", wkDataFeedAirticketPriceB1.getFileNo());
            myParameterSourceAry[i].addValue("priceNo", wkDataFeedAirticketPriceB1.getPriceNo());
            myParameterSourceAry[i].addValue("apBaa", wkDataFeedAirticketPriceB1.getApBaa());
            myParameterSourceAry[i].addValue("apBab", wkDataFeedAirticketPriceB1.getApBab());
            myParameterSourceAry[i].addValue("apBac", wkDataFeedAirticketPriceB1.getApBac());
            myParameterSourceAry[i].addValue("apBad", wkDataFeedAirticketPriceB1.getApBad());
            myParameterSourceAry[i].addValue("apBae", wkDataFeedAirticketPriceB1.getApBae());
            myParameterSourceAry[i].addValue("apBaf", wkDataFeedAirticketPriceB1.getApBaf());
            myParameterSourceAry[i].addValue("apBag", wkDataFeedAirticketPriceB1.getApBag());
            myParameterSourceAry[i].addValue("apBah", wkDataFeedAirticketPriceB1.getApBah());
            myParameterSourceAry[i].addValue("apBai", wkDataFeedAirticketPriceB1.getApBai());
            myParameterSourceAry[i].addValue("apBaj", wkDataFeedAirticketPriceB1.getApBaj());
            myParameterSourceAry[i].addValue("apBak", wkDataFeedAirticketPriceB1.getApBak());
            myParameterSourceAry[i].addValue("apBal", wkDataFeedAirticketPriceB1.getApBal());
            myParameterSourceAry[i].addValue("apBam", wkDataFeedAirticketPriceB1.getApBam());
            myParameterSourceAry[i].addValue("apBan", wkDataFeedAirticketPriceB1.getApBan());
            myParameterSourceAry[i].addValue("apBao", wkDataFeedAirticketPriceB1.getApBao());
            myParameterSourceAry[i].addValue("apBap", wkDataFeedAirticketPriceB1.getApBap());
            myParameterSourceAry[i].addValue("apBaq", wkDataFeedAirticketPriceB1.getApBaq());
            myParameterSourceAry[i].addValue("apBar", wkDataFeedAirticketPriceB1.getApBar());
            myParameterSourceAry[i].addValue("apBas", wkDataFeedAirticketPriceB1.getApBas());
            myParameterSourceAry[i].addValue("apBat", wkDataFeedAirticketPriceB1.getApBat());
            myParameterSourceAry[i].addValue("apBau", wkDataFeedAirticketPriceB1.getApBau());
            myParameterSourceAry[i].addValue("apBav", wkDataFeedAirticketPriceB1.getApBav());
            myParameterSourceAry[i].addValue("apBaw", wkDataFeedAirticketPriceB1.getApBaw());
            myParameterSourceAry[i].addValue("apBax", wkDataFeedAirticketPriceB1.getApBax());
            myParameterSourceAry[i].addValue("apBay", wkDataFeedAirticketPriceB1.getApBay());
            myParameterSourceAry[i].addValue("apBaz", wkDataFeedAirticketPriceB1.getApBaz());
            myParameterSourceAry[i].addValue("apBba", wkDataFeedAirticketPriceB1.getApBba());
            myParameterSourceAry[i].addValue("apBbb", wkDataFeedAirticketPriceB1.getApBbb());
            myParameterSourceAry[i].addValue("apBbc", wkDataFeedAirticketPriceB1.getApBbc());
            myParameterSourceAry[i].addValue("apBbd", wkDataFeedAirticketPriceB1.getApBbd());
            myParameterSourceAry[i].addValue("apBbe", wkDataFeedAirticketPriceB1.getApBbe());
            myParameterSourceAry[i].addValue("apBbf", wkDataFeedAirticketPriceB1.getApBbf());
            myParameterSourceAry[i].addValue("apBbg", wkDataFeedAirticketPriceB1.getApBbg());
            myParameterSourceAry[i].addValue("apBbh", wkDataFeedAirticketPriceB1.getApBbh());
            myParameterSourceAry[i].addValue("apBbi", wkDataFeedAirticketPriceB1.getApBbi());
            myParameterSourceAry[i].addValue("apBbj", wkDataFeedAirticketPriceB1.getApBbj());
            myParameterSourceAry[i].addValue("apBbk", wkDataFeedAirticketPriceB1.getApBbk());
            myParameterSourceAry[i].addValue("apBbl", wkDataFeedAirticketPriceB1.getApBbl());
            myParameterSourceAry[i].addValue("apBbm", wkDataFeedAirticketPriceB1.getApBbm());
            myParameterSourceAry[i].addValue("apBbn", wkDataFeedAirticketPriceB1.getApBbn());
            myParameterSourceAry[i].addValue("apBbo", wkDataFeedAirticketPriceB1.getApBbo());
            myParameterSourceAry[i].addValue("apBbp", wkDataFeedAirticketPriceB1.getApBbp());
            myParameterSourceAry[i].addValue("apBbq", wkDataFeedAirticketPriceB1.getApBbq());
            myParameterSourceAry[i].addValue("apBbr", wkDataFeedAirticketPriceB1.getApBbr());
            myParameterSourceAry[i].addValue("apBbs", wkDataFeedAirticketPriceB1.getApBbs());
            myParameterSourceAry[i].addValue("apBbt", wkDataFeedAirticketPriceB1.getApBbt());
            myParameterSourceAry[i].addValue("apBbu", wkDataFeedAirticketPriceB1.getApBbu());
            myParameterSourceAry[i].addValue("apBbv", wkDataFeedAirticketPriceB1.getApBbv());
            myParameterSourceAry[i].addValue("apBbw", wkDataFeedAirticketPriceB1.getApBbw());
            myParameterSourceAry[i].addValue("apBbx", wkDataFeedAirticketPriceB1.getApBbx());
            myParameterSourceAry[i].addValue("apBby", wkDataFeedAirticketPriceB1.getApBby());
            myParameterSourceAry[i].addValue("apBbz", wkDataFeedAirticketPriceB1.getApBbz());
            myParameterSourceAry[i].addValue("apBca", wkDataFeedAirticketPriceB1.getApBca());
            myParameterSourceAry[i].addValue("apBcb", wkDataFeedAirticketPriceB1.getApBcb());
            myParameterSourceAry[i].addValue("apBcc", wkDataFeedAirticketPriceB1.getApBcc());
            myParameterSourceAry[i].addValue("apBcd", wkDataFeedAirticketPriceB1.getApBcd());
            myParameterSourceAry[i].addValue("apBce", wkDataFeedAirticketPriceB1.getApBce());
            myParameterSourceAry[i].addValue("apBcf", wkDataFeedAirticketPriceB1.getApBcf());
            myParameterSourceAry[i].addValue("apBcg", wkDataFeedAirticketPriceB1.getApBcg());
            myParameterSourceAry[i].addValue("apBch", wkDataFeedAirticketPriceB1.getApBch());
            myParameterSourceAry[i].addValue("apBci", wkDataFeedAirticketPriceB1.getApBci());
            myParameterSourceAry[i].addValue("apBcj", wkDataFeedAirticketPriceB1.getApBcj());
            myParameterSourceAry[i].addValue("apBck", wkDataFeedAirticketPriceB1.getApBck());
            myParameterSourceAry[i].addValue("apBcl", wkDataFeedAirticketPriceB1.getApBcl());
            myParameterSourceAry[i].addValue("apBcm", wkDataFeedAirticketPriceB1.getApBcm());
            myParameterSourceAry[i].addValue("apBcn", wkDataFeedAirticketPriceB1.getApBcn());
            myParameterSourceAry[i].addValue("apBco", wkDataFeedAirticketPriceB1.getApBco());
            myParameterSourceAry[i].addValue("apBcp", wkDataFeedAirticketPriceB1.getApBcp());
            myParameterSourceAry[i].addValue("apBcq", wkDataFeedAirticketPriceB1.getApBcq());
            myParameterSourceAry[i].addValue("apBcr", wkDataFeedAirticketPriceB1.getApBcr());
            myParameterSourceAry[i].addValue("apBcs", wkDataFeedAirticketPriceB1.getApBcs());
            myParameterSourceAry[i].addValue("apBct", wkDataFeedAirticketPriceB1.getApBct());
            myParameterSourceAry[i].addValue("apBcu", wkDataFeedAirticketPriceB1.getApBcu());
            myParameterSourceAry[i].addValue("apBcv", wkDataFeedAirticketPriceB1.getApBcv());
            myParameterSourceAry[i].addValue("apBcw", wkDataFeedAirticketPriceB1.getApBcw());
            myParameterSourceAry[i].addValue("apBcx", wkDataFeedAirticketPriceB1.getApBcx());
            myParameterSourceAry[i].addValue("apBcy", wkDataFeedAirticketPriceB1.getApBcy());
            myParameterSourceAry[i].addValue("apBcz", wkDataFeedAirticketPriceB1.getApBcz());
            myParameterSourceAry[i].addValue("apBda", wkDataFeedAirticketPriceB1.getApBda());
            myParameterSourceAry[i].addValue("apBdb", wkDataFeedAirticketPriceB1.getApBdb());
            myParameterSourceAry[i].addValue("apBdc", wkDataFeedAirticketPriceB1.getApBdc());
            myParameterSourceAry[i].addValue("apBdd", wkDataFeedAirticketPriceB1.getApBdd());
            myParameterSourceAry[i].addValue("apBde", wkDataFeedAirticketPriceB1.getApBde());
            myParameterSourceAry[i].addValue("apBdf", wkDataFeedAirticketPriceB1.getApBdf());
            myParameterSourceAry[i].addValue("apBdg", wkDataFeedAirticketPriceB1.getApBdg());
            myParameterSourceAry[i].addValue("apBdh", wkDataFeedAirticketPriceB1.getApBdh());
            myParameterSourceAry[i].addValue("apBdi", wkDataFeedAirticketPriceB1.getApBdi());
            myParameterSourceAry[i].addValue("apBdj", wkDataFeedAirticketPriceB1.getApBdj());
            myParameterSourceAry[i].addValue("apBdk", wkDataFeedAirticketPriceB1.getApBdk());
            myParameterSourceAry[i].addValue("apBdl", wkDataFeedAirticketPriceB1.getApBdl());
            myParameterSourceAry[i].addValue("apBdm", wkDataFeedAirticketPriceB1.getApBdm());
            myParameterSourceAry[i].addValue("apBdn", wkDataFeedAirticketPriceB1.getApBdn());
            myParameterSourceAry[i].addValue("apBdo", wkDataFeedAirticketPriceB1.getApBdo());
            myParameterSourceAry[i].addValue("apBdp", wkDataFeedAirticketPriceB1.getApBdp());
            myParameterSourceAry[i].addValue("apBdq", wkDataFeedAirticketPriceB1.getApBdq());
            myParameterSourceAry[i].addValue("apBdr", wkDataFeedAirticketPriceB1.getApBdr());
            myParameterSourceAry[i].addValue("apBds", wkDataFeedAirticketPriceB1.getApBds());
            myParameterSourceAry[i].addValue("apBdt", wkDataFeedAirticketPriceB1.getApBdt());
            myParameterSourceAry[i].addValue("apBdu", wkDataFeedAirticketPriceB1.getApBdu());
            myParameterSourceAry[i].addValue("apBdv", wkDataFeedAirticketPriceB1.getApBdv());
            myParameterSourceAry[i].addValue("apBdw", wkDataFeedAirticketPriceB1.getApBdw());
            myParameterSourceAry[i].addValue("apBdx", wkDataFeedAirticketPriceB1.getApBdx());
            myParameterSourceAry[i].addValue("apBdy", wkDataFeedAirticketPriceB1.getApBdy());
            myParameterSourceAry[i].addValue("apBdz", wkDataFeedAirticketPriceB1.getApBdz());
            myParameterSourceAry[i].addValue("apBea", wkDataFeedAirticketPriceB1.getApBea());
            myParameterSourceAry[i].addValue("apBeb", wkDataFeedAirticketPriceB1.getApBeb());
            myParameterSourceAry[i].addValue("apBec", wkDataFeedAirticketPriceB1.getApBec());
            myParameterSourceAry[i].addValue("apBed", wkDataFeedAirticketPriceB1.getApBed());
            myParameterSourceAry[i].addValue("apBee", wkDataFeedAirticketPriceB1.getApBee());
            myParameterSourceAry[i].addValue("apBef", wkDataFeedAirticketPriceB1.getApBef());
            myParameterSourceAry[i].addValue("apBeg", wkDataFeedAirticketPriceB1.getApBeg());
            myParameterSourceAry[i].addValue("apBeh", wkDataFeedAirticketPriceB1.getApBeh());
            myParameterSourceAry[i].addValue("apBei", wkDataFeedAirticketPriceB1.getApBei());
            myParameterSourceAry[i].addValue("apBej", wkDataFeedAirticketPriceB1.getApBej());
            myParameterSourceAry[i].addValue("apBek", wkDataFeedAirticketPriceB1.getApBek());
            myParameterSourceAry[i].addValue("apBel", wkDataFeedAirticketPriceB1.getApBel());
            myParameterSourceAry[i].addValue("apBem", wkDataFeedAirticketPriceB1.getApBem());
            myParameterSourceAry[i].addValue("apBen", wkDataFeedAirticketPriceB1.getApBen());
            myParameterSourceAry[i].addValue("apBeo", wkDataFeedAirticketPriceB1.getApBeo());
            myParameterSourceAry[i].addValue("apBep", wkDataFeedAirticketPriceB1.getApBep());
            myParameterSourceAry[i].addValue("apBeq", wkDataFeedAirticketPriceB1.getApBeq());
            myParameterSourceAry[i].addValue("apBer", wkDataFeedAirticketPriceB1.getApBer());
            myParameterSourceAry[i].addValue("apBes", wkDataFeedAirticketPriceB1.getApBes());
            myParameterSourceAry[i].addValue("apBet", wkDataFeedAirticketPriceB1.getApBet());
            myParameterSourceAry[i].addValue("apBeu", wkDataFeedAirticketPriceB1.getApBeu());
            myParameterSourceAry[i].addValue("apBev", wkDataFeedAirticketPriceB1.getApBev());
            myParameterSourceAry[i].addValue("apBew", wkDataFeedAirticketPriceB1.getApBew());
            myParameterSourceAry[i].addValue("apBex", wkDataFeedAirticketPriceB1.getApBex());
            myParameterSourceAry[i].addValue("apBey", wkDataFeedAirticketPriceB1.getApBey());
            myParameterSourceAry[i].addValue("apBez", wkDataFeedAirticketPriceB1.getApBez());
            myParameterSourceAry[i].addValue("apBfa", wkDataFeedAirticketPriceB1.getApBfa());
            myParameterSourceAry[i].addValue("apBfb", wkDataFeedAirticketPriceB1.getApBfb());
            myParameterSourceAry[i].addValue("apBfc", wkDataFeedAirticketPriceB1.getApBfc());
            myParameterSourceAry[i].addValue("apBfd", wkDataFeedAirticketPriceB1.getApBfd());
            myParameterSourceAry[i].addValue("apBfe", wkDataFeedAirticketPriceB1.getApBfe());
            myParameterSourceAry[i].addValue("apBff", wkDataFeedAirticketPriceB1.getApBff());
            myParameterSourceAry[i].addValue("apBfg", wkDataFeedAirticketPriceB1.getApBfg());
            myParameterSourceAry[i].addValue("apBfh", wkDataFeedAirticketPriceB1.getApBfh());
            myParameterSourceAry[i].addValue("apBfi", wkDataFeedAirticketPriceB1.getApBfi());
            myParameterSourceAry[i].addValue("apBfj", wkDataFeedAirticketPriceB1.getApBfj());
            myParameterSourceAry[i].addValue("apBfk", wkDataFeedAirticketPriceB1.getApBfk());
            myParameterSourceAry[i].addValue("apBfl", wkDataFeedAirticketPriceB1.getApBfl());
            myParameterSourceAry[i].addValue("apBfm", wkDataFeedAirticketPriceB1.getApBfm());
            myParameterSourceAry[i].addValue("apBfn", wkDataFeedAirticketPriceB1.getApBfn());
            myParameterSourceAry[i].addValue("apBfo", wkDataFeedAirticketPriceB1.getApBfo());
            myParameterSourceAry[i].addValue("apBfp", wkDataFeedAirticketPriceB1.getApBfp());
            myParameterSourceAry[i].addValue("apBfq", wkDataFeedAirticketPriceB1.getApBfq());
            myParameterSourceAry[i].addValue("apBfr", wkDataFeedAirticketPriceB1.getApBfr());
            myParameterSourceAry[i].addValue("apBfs", wkDataFeedAirticketPriceB1.getApBfs());
            myParameterSourceAry[i].addValue("apBft", wkDataFeedAirticketPriceB1.getApBft());
            myParameterSourceAry[i].addValue("apBfu", wkDataFeedAirticketPriceB1.getApBfu());
            myParameterSourceAry[i].addValue("apBfv", wkDataFeedAirticketPriceB1.getApBfv());
            myParameterSourceAry[i].addValue("apBfw", wkDataFeedAirticketPriceB1.getApBfw());
            myParameterSourceAry[i].addValue("apBfx", wkDataFeedAirticketPriceB1.getApBfx());
            myParameterSourceAry[i].addValue("apBfy", wkDataFeedAirticketPriceB1.getApBfy());
            myParameterSourceAry[i].addValue("apBfz", wkDataFeedAirticketPriceB1.getApBfz());
            myParameterSourceAry[i].addValue("apBga", wkDataFeedAirticketPriceB1.getApBga());
            myParameterSourceAry[i].addValue("apBgb", wkDataFeedAirticketPriceB1.getApBgb());
            myParameterSourceAry[i].addValue("apBgc", wkDataFeedAirticketPriceB1.getApBgc());
            myParameterSourceAry[i].addValue("apBgd", wkDataFeedAirticketPriceB1.getApBgd());
            myParameterSourceAry[i].addValue("apBge", wkDataFeedAirticketPriceB1.getApBge());
            myParameterSourceAry[i].addValue("apBgf", wkDataFeedAirticketPriceB1.getApBgf());
            myParameterSourceAry[i].addValue("apBgg", wkDataFeedAirticketPriceB1.getApBgg());
            myParameterSourceAry[i].addValue("apBgh", wkDataFeedAirticketPriceB1.getApBgh());
            myParameterSourceAry[i].addValue("apBgi", wkDataFeedAirticketPriceB1.getApBgi());
            myParameterSourceAry[i].addValue("apBgj", wkDataFeedAirticketPriceB1.getApBgj());
            myParameterSourceAry[i].addValue("apBgk", wkDataFeedAirticketPriceB1.getApBgk());
            myParameterSourceAry[i].addValue("apBgl", wkDataFeedAirticketPriceB1.getApBgl());
            myParameterSourceAry[i].addValue("apBgm", wkDataFeedAirticketPriceB1.getApBgm());
            myParameterSourceAry[i].addValue("apBgn", wkDataFeedAirticketPriceB1.getApBgn());
            myParameterSourceAry[i].addValue("apBgo", wkDataFeedAirticketPriceB1.getApBgo());
            myParameterSourceAry[i].addValue("apBgp", wkDataFeedAirticketPriceB1.getApBgp());
            myParameterSourceAry[i].addValue("apBgq", wkDataFeedAirticketPriceB1.getApBgq());
            myParameterSourceAry[i].addValue("apBgr", wkDataFeedAirticketPriceB1.getApBgr());
            myParameterSourceAry[i].addValue("apBgs", wkDataFeedAirticketPriceB1.getApBgs());
            myParameterSourceAry[i].addValue("apBgt", wkDataFeedAirticketPriceB1.getApBgt());
            myParameterSourceAry[i].addValue("apBgu", wkDataFeedAirticketPriceB1.getApBgu());
            myParameterSourceAry[i].addValue("apBgv", wkDataFeedAirticketPriceB1.getApBgv());
            myParameterSourceAry[i].addValue("apBgw", wkDataFeedAirticketPriceB1.getApBgw());
            myParameterSourceAry[i].addValue("apBgx", wkDataFeedAirticketPriceB1.getApBgx());
            myParameterSourceAry[i].addValue("apBgy", wkDataFeedAirticketPriceB1.getApBgy());
            myParameterSourceAry[i].addValue("apBgz", wkDataFeedAirticketPriceB1.getApBgz());
            myParameterSourceAry[i].addValue("apBha", wkDataFeedAirticketPriceB1.getApBha());
            myParameterSourceAry[i].addValue("apBhb", wkDataFeedAirticketPriceB1.getApBhb());
            myParameterSourceAry[i].addValue("apBhc", wkDataFeedAirticketPriceB1.getApBhc());
            myParameterSourceAry[i].addValue("apBhd", wkDataFeedAirticketPriceB1.getApBhd());
            myParameterSourceAry[i].addValue("apBhe", wkDataFeedAirticketPriceB1.getApBhe());
            myParameterSourceAry[i].addValue("apBhf", wkDataFeedAirticketPriceB1.getApBhf());
            myParameterSourceAry[i].addValue("apBhg", wkDataFeedAirticketPriceB1.getApBhg());
            myParameterSourceAry[i].addValue("apBhh", wkDataFeedAirticketPriceB1.getApBhh());
            myParameterSourceAry[i].addValue("apBhi", wkDataFeedAirticketPriceB1.getApBhi());
            myParameterSourceAry[i].addValue("apBhj", wkDataFeedAirticketPriceB1.getApBhj());
            myParameterSourceAry[i].addValue("apBhk", wkDataFeedAirticketPriceB1.getApBhk());
            myParameterSourceAry[i].addValue("apBhl", wkDataFeedAirticketPriceB1.getApBhl());
            myParameterSourceAry[i].addValue("apBhm", wkDataFeedAirticketPriceB1.getApBhm());
            myParameterSourceAry[i].addValue("apBhn", wkDataFeedAirticketPriceB1.getApBhn());
            myParameterSourceAry[i].addValue("apBho", wkDataFeedAirticketPriceB1.getApBho());
            myParameterSourceAry[i].addValue("apBhp", wkDataFeedAirticketPriceB1.getApBhp());
            myParameterSourceAry[i].addValue("apBhq", wkDataFeedAirticketPriceB1.getApBhq());
            myParameterSourceAry[i].addValue("apBhr", wkDataFeedAirticketPriceB1.getApBhr());
            myParameterSourceAry[i].addValue("apBhs", wkDataFeedAirticketPriceB1.getApBhs());
            myParameterSourceAry[i].addValue("apBht", wkDataFeedAirticketPriceB1.getApBht());
            myParameterSourceAry[i].addValue("apBhu", wkDataFeedAirticketPriceB1.getApBhu());
            myParameterSourceAry[i].addValue("apBhv", wkDataFeedAirticketPriceB1.getApBhv());
            myParameterSourceAry[i].addValue("apBhw", wkDataFeedAirticketPriceB1.getApBhw());
            myParameterSourceAry[i].addValue("apBhx", wkDataFeedAirticketPriceB1.getApBhx());
            myParameterSourceAry[i].addValue("apBhy", wkDataFeedAirticketPriceB1.getApBhy());
            myParameterSourceAry[i].addValue("apBhz", wkDataFeedAirticketPriceB1.getApBhz());
            myParameterSourceAry[i].addValue("apBia", wkDataFeedAirticketPriceB1.getApBia());
            myParameterSourceAry[i].addValue("apBib", wkDataFeedAirticketPriceB1.getApBib());
            myParameterSourceAry[i].addValue("apBic", wkDataFeedAirticketPriceB1.getApBic());
            myParameterSourceAry[i].addValue("apBid", wkDataFeedAirticketPriceB1.getApBid());
            myParameterSourceAry[i].addValue("apBie", wkDataFeedAirticketPriceB1.getApBie());
            myParameterSourceAry[i].addValue("apBif", wkDataFeedAirticketPriceB1.getApBif());
            myParameterSourceAry[i].addValue("apBig", wkDataFeedAirticketPriceB1.getApBig());
            myParameterSourceAry[i].addValue("apBih", wkDataFeedAirticketPriceB1.getApBih());
            myParameterSourceAry[i].addValue("apBii", wkDataFeedAirticketPriceB1.getApBii());
            myParameterSourceAry[i].addValue("apBij", wkDataFeedAirticketPriceB1.getApBij());
            myParameterSourceAry[i].addValue("apBik", wkDataFeedAirticketPriceB1.getApBik());
            myParameterSourceAry[i].addValue("apBil", wkDataFeedAirticketPriceB1.getApBil());
            myParameterSourceAry[i].addValue("apBim", wkDataFeedAirticketPriceB1.getApBim());
            myParameterSourceAry[i].addValue("apBin", wkDataFeedAirticketPriceB1.getApBin());
            myParameterSourceAry[i].addValue("apBio", wkDataFeedAirticketPriceB1.getApBio());
            myParameterSourceAry[i].addValue("apBip", wkDataFeedAirticketPriceB1.getApBip());
            myParameterSourceAry[i].addValue("apBiq", wkDataFeedAirticketPriceB1.getApBiq());
            myParameterSourceAry[i].addValue("apBir", wkDataFeedAirticketPriceB1.getApBir());
            myParameterSourceAry[i].addValue("apBis", wkDataFeedAirticketPriceB1.getApBis());
            myParameterSourceAry[i].addValue("apBit", wkDataFeedAirticketPriceB1.getApBit());
            myParameterSourceAry[i].addValue("apBiu", wkDataFeedAirticketPriceB1.getApBiu());
            myParameterSourceAry[i].addValue("apBiv", wkDataFeedAirticketPriceB1.getApBiv());
            myParameterSourceAry[i].addValue("apBiw", wkDataFeedAirticketPriceB1.getApBiw());
            myParameterSourceAry[i].addValue("apBix", wkDataFeedAirticketPriceB1.getApBix());
            myParameterSourceAry[i].addValue("apBiy", wkDataFeedAirticketPriceB1.getApBiy());
            myParameterSourceAry[i].addValue("apBiz", wkDataFeedAirticketPriceB1.getApBiz());
            myParameterSourceAry[i].addValue("apBja", wkDataFeedAirticketPriceB1.getApBja());
            myParameterSourceAry[i].addValue("apBjb", wkDataFeedAirticketPriceB1.getApBjb());
            myParameterSourceAry[i].addValue("apBjc", wkDataFeedAirticketPriceB1.getApBjc());
            myParameterSourceAry[i].addValue("apBjd", wkDataFeedAirticketPriceB1.getApBjd());
            myParameterSourceAry[i].addValue("apBje", wkDataFeedAirticketPriceB1.getApBje());
            myParameterSourceAry[i].addValue("apBjf", wkDataFeedAirticketPriceB1.getApBjf());
            myParameterSourceAry[i].addValue("apBjg", wkDataFeedAirticketPriceB1.getApBjg());
            myParameterSourceAry[i].addValue("apBjh", wkDataFeedAirticketPriceB1.getApBjh());
            myParameterSourceAry[i].addValue("apBji", wkDataFeedAirticketPriceB1.getApBji());
            myParameterSourceAry[i].addValue("apBjj", wkDataFeedAirticketPriceB1.getApBjj());
            myParameterSourceAry[i].addValue("apBjk", wkDataFeedAirticketPriceB1.getApBjk());
            myParameterSourceAry[i].addValue("apBjl", wkDataFeedAirticketPriceB1.getApBjl());
            myParameterSourceAry[i].addValue("apBjm", wkDataFeedAirticketPriceB1.getApBjm());
            myParameterSourceAry[i].addValue("apBjn", wkDataFeedAirticketPriceB1.getApBjn());
            myParameterSourceAry[i].addValue("apBjo", wkDataFeedAirticketPriceB1.getApBjo());
            myParameterSourceAry[i].addValue("apBjp", wkDataFeedAirticketPriceB1.getApBjp());
            myParameterSourceAry[i].addValue("apBjq", wkDataFeedAirticketPriceB1.getApBjq());
            myParameterSourceAry[i].addValue("apBjr", wkDataFeedAirticketPriceB1.getApBjr());
            myParameterSourceAry[i].addValue("apBjs", wkDataFeedAirticketPriceB1.getApBjs());
            myParameterSourceAry[i].addValue("apBjt", wkDataFeedAirticketPriceB1.getApBjt());
            myParameterSourceAry[i].addValue("apBju", wkDataFeedAirticketPriceB1.getApBju());
            myParameterSourceAry[i].addValue("apBjv", wkDataFeedAirticketPriceB1.getApBjv());
            myParameterSourceAry[i].addValue("apBjw", wkDataFeedAirticketPriceB1.getApBjw());
            myParameterSourceAry[i].addValue("apBjx", wkDataFeedAirticketPriceB1.getApBjx());
            myParameterSourceAry[i].addValue("apBjy", wkDataFeedAirticketPriceB1.getApBjy());
            myParameterSourceAry[i].addValue("apBjz", wkDataFeedAirticketPriceB1.getApBjz());
            myParameterSourceAry[i].addValue("apBka", wkDataFeedAirticketPriceB1.getApBka());
            myParameterSourceAry[i].addValue("apBkb", wkDataFeedAirticketPriceB1.getApBkb());
            myParameterSourceAry[i].addValue("apBkc", wkDataFeedAirticketPriceB1.getApBkc());
            myParameterSourceAry[i].addValue("apBkd", wkDataFeedAirticketPriceB1.getApBkd());
            myParameterSourceAry[i].addValue("apBke", wkDataFeedAirticketPriceB1.getApBke());
            myParameterSourceAry[i].addValue("apBkf", wkDataFeedAirticketPriceB1.getApBkf());
            myParameterSourceAry[i].addValue("apBkg", wkDataFeedAirticketPriceB1.getApBkg());
            myParameterSourceAry[i].addValue("apBkh", wkDataFeedAirticketPriceB1.getApBkh());
            myParameterSourceAry[i].addValue("apBki", wkDataFeedAirticketPriceB1.getApBki());
            myParameterSourceAry[i].addValue("apBkj", wkDataFeedAirticketPriceB1.getApBkj());
            myParameterSourceAry[i].addValue("apBkk", wkDataFeedAirticketPriceB1.getApBkk());
            myParameterSourceAry[i].addValue("apBkl", wkDataFeedAirticketPriceB1.getApBkl());
            myParameterSourceAry[i].addValue("apBkm", wkDataFeedAirticketPriceB1.getApBkm());
            myParameterSourceAry[i].addValue("apBkn", wkDataFeedAirticketPriceB1.getApBkn());
            myParameterSourceAry[i].addValue("apBko", wkDataFeedAirticketPriceB1.getApBko());
            myParameterSourceAry[i].addValue("apBkp", wkDataFeedAirticketPriceB1.getApBkp());
            myParameterSourceAry[i].addValue("apBkq", wkDataFeedAirticketPriceB1.getApBkq());
            myParameterSourceAry[i].addValue("apBkr", wkDataFeedAirticketPriceB1.getApBkr());
            myParameterSourceAry[i].addValue("apBks", wkDataFeedAirticketPriceB1.getApBks());
            myParameterSourceAry[i].addValue("apBkt", wkDataFeedAirticketPriceB1.getApBkt());
            myParameterSourceAry[i].addValue("apBku", wkDataFeedAirticketPriceB1.getApBku());
            myParameterSourceAry[i].addValue("apBkv", wkDataFeedAirticketPriceB1.getApBkv());
            myParameterSourceAry[i].addValue("apBkw", wkDataFeedAirticketPriceB1.getApBkw());
            myParameterSourceAry[i].addValue("apBkx", wkDataFeedAirticketPriceB1.getApBkx());
            myParameterSourceAry[i].addValue("apBky", wkDataFeedAirticketPriceB1.getApBky());
            myParameterSourceAry[i].addValue("apBkz", wkDataFeedAirticketPriceB1.getApBkz());
            myParameterSourceAry[i].addValue("apBla", wkDataFeedAirticketPriceB1.getApBla());
            myParameterSourceAry[i].addValue("apBlb", wkDataFeedAirticketPriceB1.getApBlb());
            myParameterSourceAry[i].addValue("apBlc", wkDataFeedAirticketPriceB1.getApBlc());
            myParameterSourceAry[i].addValue("apBld", wkDataFeedAirticketPriceB1.getApBld());
            myParameterSourceAry[i].addValue("apBle", wkDataFeedAirticketPriceB1.getApBle());
            myParameterSourceAry[i].addValue("apBlf", wkDataFeedAirticketPriceB1.getApBlf());
            myParameterSourceAry[i].addValue("apBlg", wkDataFeedAirticketPriceB1.getApBlg());
            myParameterSourceAry[i].addValue("apBlh", wkDataFeedAirticketPriceB1.getApBlh());
            myParameterSourceAry[i].addValue("apBli", wkDataFeedAirticketPriceB1.getApBli());
            myParameterSourceAry[i].addValue("apBlj", wkDataFeedAirticketPriceB1.getApBlj());
            myParameterSourceAry[i].addValue("apBlk", wkDataFeedAirticketPriceB1.getApBlk());
            myParameterSourceAry[i].addValue("apBll", wkDataFeedAirticketPriceB1.getApBll());
            myParameterSourceAry[i].addValue("apBlm", wkDataFeedAirticketPriceB1.getApBlm());
            myParameterSourceAry[i].addValue("apBln", wkDataFeedAirticketPriceB1.getApBln());
            myParameterSourceAry[i].addValue("apBlo", wkDataFeedAirticketPriceB1.getApBlo());
            myParameterSourceAry[i].addValue("apBlp", wkDataFeedAirticketPriceB1.getApBlp());
            myParameterSourceAry[i].addValue("apBlq", wkDataFeedAirticketPriceB1.getApBlq());
            myParameterSourceAry[i].addValue("apBlr", wkDataFeedAirticketPriceB1.getApBlr());
            myParameterSourceAry[i].addValue("apBls", wkDataFeedAirticketPriceB1.getApBls());
            myParameterSourceAry[i].addValue("apBlt", wkDataFeedAirticketPriceB1.getApBlt());
            myParameterSourceAry[i].addValue("apBlu", wkDataFeedAirticketPriceB1.getApBlu());
            myParameterSourceAry[i].addValue("apBlv", wkDataFeedAirticketPriceB1.getApBlv());
            myParameterSourceAry[i].addValue("apBlw", wkDataFeedAirticketPriceB1.getApBlw());
            myParameterSourceAry[i].addValue("apBlx", wkDataFeedAirticketPriceB1.getApBlx());
            myParameterSourceAry[i].addValue("apBly", wkDataFeedAirticketPriceB1.getApBly());
            myParameterSourceAry[i].addValue("apBlz", wkDataFeedAirticketPriceB1.getApBlz());
            myParameterSourceAry[i].addValue("apBma", wkDataFeedAirticketPriceB1.getApBma());
            myParameterSourceAry[i].addValue("apBmb", wkDataFeedAirticketPriceB1.getApBmb());
            myParameterSourceAry[i].addValue("apBmc", wkDataFeedAirticketPriceB1.getApBmc());
            myParameterSourceAry[i].addValue("apBmd", wkDataFeedAirticketPriceB1.getApBmd());
            myParameterSourceAry[i].addValue("apBme", wkDataFeedAirticketPriceB1.getApBme());
            myParameterSourceAry[i].addValue("apBmf", wkDataFeedAirticketPriceB1.getApBmf());
            myParameterSourceAry[i].addValue("apBmg", wkDataFeedAirticketPriceB1.getApBmg());
            myParameterSourceAry[i].addValue("apBmh", wkDataFeedAirticketPriceB1.getApBmh());
            myParameterSourceAry[i].addValue("apBmi", wkDataFeedAirticketPriceB1.getApBmi());
            myParameterSourceAry[i].addValue("apBmj", wkDataFeedAirticketPriceB1.getApBmj());
            myParameterSourceAry[i].addValue("apBmk", wkDataFeedAirticketPriceB1.getApBmk());
            myParameterSourceAry[i].addValue("apBml", wkDataFeedAirticketPriceB1.getApBml());
            myParameterSourceAry[i].addValue("apBmm", wkDataFeedAirticketPriceB1.getApBmm());
            myParameterSourceAry[i].addValue("apBmn", wkDataFeedAirticketPriceB1.getApBmn());
            myParameterSourceAry[i].addValue("apBmo", wkDataFeedAirticketPriceB1.getApBmo());
            myParameterSourceAry[i].addValue("apBmp", wkDataFeedAirticketPriceB1.getApBmp());
            myParameterSourceAry[i].addValue("apBmq", wkDataFeedAirticketPriceB1.getApBmq());
            myParameterSourceAry[i].addValue("apBmr", wkDataFeedAirticketPriceB1.getApBmr());
            myParameterSourceAry[i].addValue("apBms", wkDataFeedAirticketPriceB1.getApBms());
            myParameterSourceAry[i].addValue("apBmt", wkDataFeedAirticketPriceB1.getApBmt());
            myParameterSourceAry[i].addValue("apBmu", wkDataFeedAirticketPriceB1.getApBmu());
            myParameterSourceAry[i].addValue("apBmv", wkDataFeedAirticketPriceB1.getApBmv());
            myParameterSourceAry[i].addValue("apBmw", wkDataFeedAirticketPriceB1.getApBmw());
            myParameterSourceAry[i].addValue("apBmx", wkDataFeedAirticketPriceB1.getApBmx());
            myParameterSourceAry[i].addValue("apBmy", wkDataFeedAirticketPriceB1.getApBmy());
            myParameterSourceAry[i].addValue("apBmz", wkDataFeedAirticketPriceB1.getApBmz());
        }

        myNamedParameterJdbcTemplate.batchUpdate(mySql, myParameterSourceAry);
    }

    @Override
    public void deleteDataFeedAirticketPriceB1sByFileNo(Integer fileNo) {
        String mySql = "DELETE FROM db_airticket.data_feed_airticket_price_b1 " +
                " WHERE file_no = :fileNo ";

        Map<String,Object> myMap = new HashMap<>();
        myMap.put("fileNo", fileNo);

        myNamedParameterJdbcTemplate.update(mySql, myMap);
    }

}
