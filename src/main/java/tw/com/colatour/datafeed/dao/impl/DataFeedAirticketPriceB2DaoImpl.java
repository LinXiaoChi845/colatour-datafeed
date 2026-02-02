package tw.com.colatour.datafeed.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Component;
import tw.com.colatour.datafeed.dao.DataFeedAirticketPriceB2Dao;
import tw.com.colatour.datafeed.model.DataFeedAirticketPriceB2;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class DataFeedAirticketPriceB2DaoImpl implements DataFeedAirticketPriceB2Dao {

    @Autowired
    private NamedParameterJdbcTemplate myNamedParameterJdbcTemplate;

    @Override
    public void createDataFeedAirticketPriceB2s(List<DataFeedAirticketPriceB2> dataFeedAirticketPriceB2List) {
        String mySql = "INSERT INTO db_airticket.data_feed_airticket_price_b2 ( " +
                " file_no, price_no, " +
                " ap_bna, ap_bnb, ap_bnc, ap_bnd, ap_bne, ap_bnf, ap_bng, ap_bnh, ap_bni, ap_bnj, ap_bnk, ap_bnl, ap_bnm, " +
                " ap_bnn, ap_bno, ap_bnp, ap_bnq, ap_bnr, ap_bns, ap_bnt, ap_bnu, ap_bnv, ap_bnw, ap_bnx, ap_bny, ap_bnz, " +
                " ap_boa, ap_bob, ap_boc, ap_bod, ap_boe, ap_bof, ap_bog, ap_boh, ap_boi, ap_boj, ap_bok, ap_bol, ap_bom, " +
                " ap_bon, ap_boo, ap_bop, ap_boq, ap_bor, ap_bos, ap_bot, ap_bou, ap_bov, ap_bow, ap_box, ap_boy, ap_boz, " +
                " ap_bpa, ap_bpb, ap_bpc, ap_bpd, ap_bpe, ap_bpf, ap_bpg, ap_bph, ap_bpi, ap_bpj, ap_bpk, ap_bpl, ap_bpm, " +
                " ap_bpn, ap_bpo, ap_bpp, ap_bpq, ap_bpr, ap_bps, ap_bpt, ap_bpu, ap_bpv, ap_bpw, ap_bpx, ap_bpy, ap_bpz, " +
                " ap_bqa, ap_bqb, ap_bqc, ap_bqd, ap_bqe, ap_bqf, ap_bqg, ap_bqh, ap_bqi, ap_bqj, ap_bqk, ap_bql, ap_bqm, " +
                " ap_bqn, ap_bqo, ap_bqp, ap_bqq, ap_bqr, ap_bqs, ap_bqt, ap_bqu, ap_bqv, ap_bqw, ap_bqx, ap_bqy, ap_bqz, " +
                " ap_bra, ap_brb, ap_brc, ap_brd, ap_bre, ap_brf, ap_brg, ap_brh, ap_bri, ap_brj, ap_brk, ap_brl, ap_brm, " +
                " ap_brn, ap_bro, ap_brp, ap_brq, ap_brr, ap_brs, ap_brt, ap_bru, ap_brv, ap_brw, ap_brx, ap_bry, ap_brz, " +
                " ap_bsa, ap_bsb, ap_bsc, ap_bsd, ap_bse, ap_bsf, ap_bsg, ap_bsh, ap_bsi, ap_bsj, ap_bsk, ap_bsl, ap_bsm, " +
                " ap_bsn, ap_bso, ap_bsp, ap_bsq, ap_bsr, ap_bss, ap_bst, ap_bsu, ap_bsv, ap_bsw, ap_bsx, ap_bsy, ap_bsz, " +
                " ap_bta, ap_btb, ap_btc, ap_btd, ap_bte, ap_btf, ap_btg, ap_bth, ap_bti, ap_btj, ap_btk, ap_btl, ap_btm, " +
                " ap_btn, ap_bto, ap_btp, ap_btq, ap_btr, ap_bts, ap_btt, ap_btu, ap_btv, ap_btw, ap_btx, ap_bty, ap_btz, " +
                " ap_bua, ap_bub, ap_buc, ap_bud, ap_bue, ap_buf, ap_bug, ap_buh, ap_bui, ap_buj, ap_buk, ap_bul, ap_bum, " +
                " ap_bun, ap_buo, ap_bup, ap_buq, ap_bur, ap_bus, ap_but, ap_buu, ap_buv, ap_buw, ap_bux, ap_buy, ap_buz, " +
                " ap_bva, ap_bvb, ap_bvc, ap_bvd, ap_bve, ap_bvf, ap_bvg, ap_bvh, ap_bvi, ap_bvj, ap_bvk, ap_bvl, ap_bvm, " +
                " ap_bvn, ap_bvo, ap_bvp, ap_bvq, ap_bvr, ap_bvs, ap_bvt, ap_bvu, ap_bvv, ap_bvw, ap_bvx, ap_bvy, ap_bvz, " +
                " ap_bwa, ap_bwb, ap_bwc, ap_bwd, ap_bwe, ap_bwf, ap_bwg, ap_bwh, ap_bwi, ap_bwj, ap_bwk, ap_bwl, ap_bwm, " +
                " ap_bwn, ap_bwo, ap_bwp, ap_bwq, ap_bwr, ap_bws, ap_bwt, ap_bwu, ap_bwv, ap_bww, ap_bwx, ap_bwy, ap_bwz, " +
                " ap_bxa, ap_bxb, ap_bxc, ap_bxd, ap_bxe, ap_bxf, ap_bxg, ap_bxh, ap_bxi, ap_bxj, ap_bxk, ap_bxl, ap_bxm, " +
                " ap_bxn, ap_bxo, ap_bxp, ap_bxq, ap_bxr, ap_bxs, ap_bxt, ap_bxu, ap_bxv, ap_bxw, ap_bxx, ap_bxy, ap_bxz, " +
                " ap_bya, ap_byb, ap_byc, ap_byd, ap_bye, ap_byf, ap_byg, ap_byh, ap_byi, ap_byj, ap_byk, ap_byl, ap_bym, " +
                " ap_byn, ap_byo, ap_byp, ap_byq, ap_byr, ap_bys, ap_byt, ap_byu, ap_byv, ap_byw, ap_byx, ap_byy, ap_byz, " +
                " ap_bza, ap_bzb, ap_bzc, ap_bzd, ap_bze, ap_bzf, ap_bzg, ap_bzh, ap_bzi, ap_bzj, ap_bzk, ap_bzl, ap_bzm, " +
                " ap_bzn, ap_bzo, ap_bzp, ap_bzq, ap_bzr, ap_bzs, ap_bzt, ap_bzu, ap_bzv, ap_bzw, ap_bzx, ap_bzy, ap_bzz ) " +
                " VALUES ( " +
                " :fileNo, :priceNo, " +
                " :apBna, :apBnb, :apBnc, :apBnd, :apBne, :apBnf, :apBng, :apBnh, :apBni, :apBnj, :apBnk, :apBnl, :apBnm, " +
                " :apBnn, :apBno, :apBnp, :apBnq, :apBnr, :apBns, :apBnt, :apBnu, :apBnv, :apBnw, :apBnx, :apBny, :apBnz, " +
                " :apBoa, :apBob, :apBoc, :apBod, :apBoe, :apBof, :apBog, :apBoh, :apBoi, :apBoj, :apBok, :apBol, :apBom, " +
                " :apBon, :apBoo, :apBop, :apBoq, :apBor, :apBos, :apBot, :apBou, :apBov, :apBow, :apBox, :apBoy, :apBoz, " +
                " :apBpa, :apBpb, :apBpc, :apBpd, :apBpe, :apBpf, :apBpg, :apBph, :apBpi, :apBpj, :apBpk, :apBpl, :apBpm, " +
                " :apBpn, :apBpo, :apBpp, :apBpq, :apBpr, :apBps, :apBpt, :apBpu, :apBpv, :apBpw, :apBpx, :apBpy, :apBpz, " +
                " :apBqa, :apBqb, :apBqc, :apBqd, :apBqe, :apBqf, :apBqg, :apBqh, :apBqi, :apBqj, :apBqk, :apBql, :apBqm, " +
                " :apBqn, :apBqo, :apBqp, :apBqq, :apBqr, :apBqs, :apBqt, :apBqu, :apBqv, :apBqw, :apBqx, :apBqy, :apBqz, " +
                " :apBra, :apBrb, :apBrc, :apBrd, :apBre, :apBrf, :apBrg, :apBrh, :apBri, :apBrj, :apBrk, :apBrl, :apBrm, " +
                " :apBrn, :apBro, :apBrp, :apBrq, :apBrr, :apBrs, :apBrt, :apBru, :apBrv, :apBrw, :apBrx, :apBry, :apBrz, " +
                " :apBsa, :apBsb, :apBsc, :apBsd, :apBse, :apBsf, :apBsg, :apBsh, :apBsi, :apBsj, :apBsk, :apBsl, :apBsm, " +
                " :apBsn, :apBso, :apBsp, :apBsq, :apBsr, :apBss, :apBst, :apBsu, :apBsv, :apBsw, :apBsx, :apBsy, :apBsz, " +
                " :apBta, :apBtb, :apBtc, :apBtd, :apBte, :apBtf, :apBtg, :apBth, :apBti, :apBtj, :apBtk, :apBtl, :apBtm, " +
                " :apBtn, :apBto, :apBtp, :apBtq, :apBtr, :apBts, :apBtt, :apBtu, :apBtv, :apBtw, :apBtx, :apBty, :apBtz, " +
                " :apBua, :apBub, :apBuc, :apBud, :apBue, :apBuf, :apBug, :apBuh, :apBui, :apBuj, :apBuk, :apBul, :apBum, " +
                " :apBun, :apBuo, :apBup, :apBuq, :apBur, :apBus, :apBut, :apBuu, :apBuv, :apBuw, :apBux, :apBuy, :apBuz, " +
                " :apBva, :apBvb, :apBvc, :apBvd, :apBve, :apBvf, :apBvg, :apBvh, :apBvi, :apBvj, :apBvk, :apBvl, :apBvm, " +
                " :apBvn, :apBvo, :apBvp, :apBvq, :apBvr, :apBvs, :apBvt, :apBvu, :apBvv, :apBvw, :apBvx, :apBvy, :apBvz, " +
                " :apBwa, :apBwb, :apBwc, :apBwd, :apBwe, :apBwf, :apBwg, :apBwh, :apBwi, :apBwj, :apBwk, :apBwl, :apBwm, " +
                " :apBwn, :apBwo, :apBwp, :apBwq, :apBwr, :apBws, :apBwt, :apBwu, :apBwv, :apBww, :apBwx, :apBwy, :apBwz, " +
                " :apBxa, :apBxb, :apBxc, :apBxd, :apBxe, :apBxf, :apBxg, :apBxh, :apBxi, :apBxj, :apBxk, :apBxl, :apBxm, " +
                " :apBxn, :apBxo, :apBxp, :apBxq, :apBxr, :apBxs, :apBxt, :apBxu, :apBxv, :apBxw, :apBxx, :apBxy, :apBxz, " +
                " :apBya, :apByb, :apByc, :apByd, :apBye, :apByf, :apByg, :apByh, :apByi, :apByj, :apByk, :apByl, :apBym, " +
                " :apByn, :apByo, :apByp, :apByq, :apByr, :apBys, :apByt, :apByu, :apByv, :apByw, :apByx, :apByy, :apByz, " +
                " :apBza, :apBzb, :apBzc, :apBzd, :apBze, :apBzf, :apBzg, :apBzh, :apBzi, :apBzj, :apBzk, :apBzl, :apBzm, " +
                " :apBzn, :apBzo, :apBzp, :apBzq, :apBzr, :apBzs, :apBzt, :apBzu, :apBzv, :apBzw, :apBzx, :apBzy, :apBzz ) ";

        MapSqlParameterSource[] myParameterSourceAry = new MapSqlParameterSource[dataFeedAirticketPriceB2List.size()];

        for (int i = 0; i < dataFeedAirticketPriceB2List.size(); i++) {
            DataFeedAirticketPriceB2 wkDataFeedAirticketPriceB2 = dataFeedAirticketPriceB2List.get(i);

            myParameterSourceAry[i] = new MapSqlParameterSource();

            myParameterSourceAry[i].addValue("fileNo", wkDataFeedAirticketPriceB2.getFileNo());
            myParameterSourceAry[i].addValue("priceNo", wkDataFeedAirticketPriceB2.getPriceNo());
            myParameterSourceAry[i].addValue("apBna", wkDataFeedAirticketPriceB2.getApBna());
            myParameterSourceAry[i].addValue("apBnb", wkDataFeedAirticketPriceB2.getApBnb());
            myParameterSourceAry[i].addValue("apBnc", wkDataFeedAirticketPriceB2.getApBnc());
            myParameterSourceAry[i].addValue("apBnd", wkDataFeedAirticketPriceB2.getApBnd());
            myParameterSourceAry[i].addValue("apBne", wkDataFeedAirticketPriceB2.getApBne());
            myParameterSourceAry[i].addValue("apBnf", wkDataFeedAirticketPriceB2.getApBnf());
            myParameterSourceAry[i].addValue("apBng", wkDataFeedAirticketPriceB2.getApBng());
            myParameterSourceAry[i].addValue("apBnh", wkDataFeedAirticketPriceB2.getApBnh());
            myParameterSourceAry[i].addValue("apBni", wkDataFeedAirticketPriceB2.getApBni());
            myParameterSourceAry[i].addValue("apBnj", wkDataFeedAirticketPriceB2.getApBnj());
            myParameterSourceAry[i].addValue("apBnk", wkDataFeedAirticketPriceB2.getApBnk());
            myParameterSourceAry[i].addValue("apBnl", wkDataFeedAirticketPriceB2.getApBnl());
            myParameterSourceAry[i].addValue("apBnm", wkDataFeedAirticketPriceB2.getApBnm());
            myParameterSourceAry[i].addValue("apBnn", wkDataFeedAirticketPriceB2.getApBnn());
            myParameterSourceAry[i].addValue("apBno", wkDataFeedAirticketPriceB2.getApBno());
            myParameterSourceAry[i].addValue("apBnp", wkDataFeedAirticketPriceB2.getApBnp());
            myParameterSourceAry[i].addValue("apBnq", wkDataFeedAirticketPriceB2.getApBnq());
            myParameterSourceAry[i].addValue("apBnr", wkDataFeedAirticketPriceB2.getApBnr());
            myParameterSourceAry[i].addValue("apBns", wkDataFeedAirticketPriceB2.getApBns());
            myParameterSourceAry[i].addValue("apBnt", wkDataFeedAirticketPriceB2.getApBnt());
            myParameterSourceAry[i].addValue("apBnu", wkDataFeedAirticketPriceB2.getApBnu());
            myParameterSourceAry[i].addValue("apBnv", wkDataFeedAirticketPriceB2.getApBnv());
            myParameterSourceAry[i].addValue("apBnw", wkDataFeedAirticketPriceB2.getApBnw());
            myParameterSourceAry[i].addValue("apBnx", wkDataFeedAirticketPriceB2.getApBnx());
            myParameterSourceAry[i].addValue("apBny", wkDataFeedAirticketPriceB2.getApBny());
            myParameterSourceAry[i].addValue("apBnz", wkDataFeedAirticketPriceB2.getApBnz());
            myParameterSourceAry[i].addValue("apBoa", wkDataFeedAirticketPriceB2.getApBoa());
            myParameterSourceAry[i].addValue("apBob", wkDataFeedAirticketPriceB2.getApBob());
            myParameterSourceAry[i].addValue("apBoc", wkDataFeedAirticketPriceB2.getApBoc());
            myParameterSourceAry[i].addValue("apBod", wkDataFeedAirticketPriceB2.getApBod());
            myParameterSourceAry[i].addValue("apBoe", wkDataFeedAirticketPriceB2.getApBoe());
            myParameterSourceAry[i].addValue("apBof", wkDataFeedAirticketPriceB2.getApBof());
            myParameterSourceAry[i].addValue("apBog", wkDataFeedAirticketPriceB2.getApBog());
            myParameterSourceAry[i].addValue("apBoh", wkDataFeedAirticketPriceB2.getApBoh());
            myParameterSourceAry[i].addValue("apBoi", wkDataFeedAirticketPriceB2.getApBoi());
            myParameterSourceAry[i].addValue("apBoj", wkDataFeedAirticketPriceB2.getApBoj());
            myParameterSourceAry[i].addValue("apBok", wkDataFeedAirticketPriceB2.getApBok());
            myParameterSourceAry[i].addValue("apBol", wkDataFeedAirticketPriceB2.getApBol());
            myParameterSourceAry[i].addValue("apBom", wkDataFeedAirticketPriceB2.getApBom());
            myParameterSourceAry[i].addValue("apBon", wkDataFeedAirticketPriceB2.getApBon());
            myParameterSourceAry[i].addValue("apBoo", wkDataFeedAirticketPriceB2.getApBoo());
            myParameterSourceAry[i].addValue("apBop", wkDataFeedAirticketPriceB2.getApBop());
            myParameterSourceAry[i].addValue("apBoq", wkDataFeedAirticketPriceB2.getApBoq());
            myParameterSourceAry[i].addValue("apBor", wkDataFeedAirticketPriceB2.getApBor());
            myParameterSourceAry[i].addValue("apBos", wkDataFeedAirticketPriceB2.getApBos());
            myParameterSourceAry[i].addValue("apBot", wkDataFeedAirticketPriceB2.getApBot());
            myParameterSourceAry[i].addValue("apBou", wkDataFeedAirticketPriceB2.getApBou());
            myParameterSourceAry[i].addValue("apBov", wkDataFeedAirticketPriceB2.getApBov());
            myParameterSourceAry[i].addValue("apBow", wkDataFeedAirticketPriceB2.getApBow());
            myParameterSourceAry[i].addValue("apBox", wkDataFeedAirticketPriceB2.getApBox());
            myParameterSourceAry[i].addValue("apBoy", wkDataFeedAirticketPriceB2.getApBoy());
            myParameterSourceAry[i].addValue("apBoz", wkDataFeedAirticketPriceB2.getApBoz());
            myParameterSourceAry[i].addValue("apBpa", wkDataFeedAirticketPriceB2.getApBpa());
            myParameterSourceAry[i].addValue("apBpb", wkDataFeedAirticketPriceB2.getApBpb());
            myParameterSourceAry[i].addValue("apBpc", wkDataFeedAirticketPriceB2.getApBpc());
            myParameterSourceAry[i].addValue("apBpd", wkDataFeedAirticketPriceB2.getApBpd());
            myParameterSourceAry[i].addValue("apBpe", wkDataFeedAirticketPriceB2.getApBpe());
            myParameterSourceAry[i].addValue("apBpf", wkDataFeedAirticketPriceB2.getApBpf());
            myParameterSourceAry[i].addValue("apBpg", wkDataFeedAirticketPriceB2.getApBpg());
            myParameterSourceAry[i].addValue("apBph", wkDataFeedAirticketPriceB2.getApBph());
            myParameterSourceAry[i].addValue("apBpi", wkDataFeedAirticketPriceB2.getApBpi());
            myParameterSourceAry[i].addValue("apBpj", wkDataFeedAirticketPriceB2.getApBpj());
            myParameterSourceAry[i].addValue("apBpk", wkDataFeedAirticketPriceB2.getApBpk());
            myParameterSourceAry[i].addValue("apBpl", wkDataFeedAirticketPriceB2.getApBpl());
            myParameterSourceAry[i].addValue("apBpm", wkDataFeedAirticketPriceB2.getApBpm());
            myParameterSourceAry[i].addValue("apBpn", wkDataFeedAirticketPriceB2.getApBpn());
            myParameterSourceAry[i].addValue("apBpo", wkDataFeedAirticketPriceB2.getApBpo());
            myParameterSourceAry[i].addValue("apBpp", wkDataFeedAirticketPriceB2.getApBpp());
            myParameterSourceAry[i].addValue("apBpq", wkDataFeedAirticketPriceB2.getApBpq());
            myParameterSourceAry[i].addValue("apBpr", wkDataFeedAirticketPriceB2.getApBpr());
            myParameterSourceAry[i].addValue("apBps", wkDataFeedAirticketPriceB2.getApBps());
            myParameterSourceAry[i].addValue("apBpt", wkDataFeedAirticketPriceB2.getApBpt());
            myParameterSourceAry[i].addValue("apBpu", wkDataFeedAirticketPriceB2.getApBpu());
            myParameterSourceAry[i].addValue("apBpv", wkDataFeedAirticketPriceB2.getApBpv());
            myParameterSourceAry[i].addValue("apBpw", wkDataFeedAirticketPriceB2.getApBpw());
            myParameterSourceAry[i].addValue("apBpx", wkDataFeedAirticketPriceB2.getApBpx());
            myParameterSourceAry[i].addValue("apBpy", wkDataFeedAirticketPriceB2.getApBpy());
            myParameterSourceAry[i].addValue("apBpz", wkDataFeedAirticketPriceB2.getApBpz());
            myParameterSourceAry[i].addValue("apBqa", wkDataFeedAirticketPriceB2.getApBqa());
            myParameterSourceAry[i].addValue("apBqb", wkDataFeedAirticketPriceB2.getApBqb());
            myParameterSourceAry[i].addValue("apBqc", wkDataFeedAirticketPriceB2.getApBqc());
            myParameterSourceAry[i].addValue("apBqd", wkDataFeedAirticketPriceB2.getApBqd());
            myParameterSourceAry[i].addValue("apBqe", wkDataFeedAirticketPriceB2.getApBqe());
            myParameterSourceAry[i].addValue("apBqf", wkDataFeedAirticketPriceB2.getApBqf());
            myParameterSourceAry[i].addValue("apBqg", wkDataFeedAirticketPriceB2.getApBqg());
            myParameterSourceAry[i].addValue("apBqh", wkDataFeedAirticketPriceB2.getApBqh());
            myParameterSourceAry[i].addValue("apBqi", wkDataFeedAirticketPriceB2.getApBqi());
            myParameterSourceAry[i].addValue("apBqj", wkDataFeedAirticketPriceB2.getApBqj());
            myParameterSourceAry[i].addValue("apBqk", wkDataFeedAirticketPriceB2.getApBqk());
            myParameterSourceAry[i].addValue("apBql", wkDataFeedAirticketPriceB2.getApBql());
            myParameterSourceAry[i].addValue("apBqm", wkDataFeedAirticketPriceB2.getApBqm());
            myParameterSourceAry[i].addValue("apBqn", wkDataFeedAirticketPriceB2.getApBqn());
            myParameterSourceAry[i].addValue("apBqo", wkDataFeedAirticketPriceB2.getApBqo());
            myParameterSourceAry[i].addValue("apBqp", wkDataFeedAirticketPriceB2.getApBqp());
            myParameterSourceAry[i].addValue("apBqq", wkDataFeedAirticketPriceB2.getApBqq());
            myParameterSourceAry[i].addValue("apBqr", wkDataFeedAirticketPriceB2.getApBqr());
            myParameterSourceAry[i].addValue("apBqs", wkDataFeedAirticketPriceB2.getApBqs());
            myParameterSourceAry[i].addValue("apBqt", wkDataFeedAirticketPriceB2.getApBqt());
            myParameterSourceAry[i].addValue("apBqu", wkDataFeedAirticketPriceB2.getApBqu());
            myParameterSourceAry[i].addValue("apBqv", wkDataFeedAirticketPriceB2.getApBqv());
            myParameterSourceAry[i].addValue("apBqw", wkDataFeedAirticketPriceB2.getApBqw());
            myParameterSourceAry[i].addValue("apBqx", wkDataFeedAirticketPriceB2.getApBqx());
            myParameterSourceAry[i].addValue("apBqy", wkDataFeedAirticketPriceB2.getApBqy());
            myParameterSourceAry[i].addValue("apBqz", wkDataFeedAirticketPriceB2.getApBqz());
            myParameterSourceAry[i].addValue("apBra", wkDataFeedAirticketPriceB2.getApBra());
            myParameterSourceAry[i].addValue("apBrb", wkDataFeedAirticketPriceB2.getApBrb());
            myParameterSourceAry[i].addValue("apBrc", wkDataFeedAirticketPriceB2.getApBrc());
            myParameterSourceAry[i].addValue("apBrd", wkDataFeedAirticketPriceB2.getApBrd());
            myParameterSourceAry[i].addValue("apBre", wkDataFeedAirticketPriceB2.getApBre());
            myParameterSourceAry[i].addValue("apBrf", wkDataFeedAirticketPriceB2.getApBrf());
            myParameterSourceAry[i].addValue("apBrg", wkDataFeedAirticketPriceB2.getApBrg());
            myParameterSourceAry[i].addValue("apBrh", wkDataFeedAirticketPriceB2.getApBrh());
            myParameterSourceAry[i].addValue("apBri", wkDataFeedAirticketPriceB2.getApBri());
            myParameterSourceAry[i].addValue("apBrj", wkDataFeedAirticketPriceB2.getApBrj());
            myParameterSourceAry[i].addValue("apBrk", wkDataFeedAirticketPriceB2.getApBrk());
            myParameterSourceAry[i].addValue("apBrl", wkDataFeedAirticketPriceB2.getApBrl());
            myParameterSourceAry[i].addValue("apBrm", wkDataFeedAirticketPriceB2.getApBrm());
            myParameterSourceAry[i].addValue("apBrn", wkDataFeedAirticketPriceB2.getApBrn());
            myParameterSourceAry[i].addValue("apBro", wkDataFeedAirticketPriceB2.getApBro());
            myParameterSourceAry[i].addValue("apBrp", wkDataFeedAirticketPriceB2.getApBrp());
            myParameterSourceAry[i].addValue("apBrq", wkDataFeedAirticketPriceB2.getApBrq());
            myParameterSourceAry[i].addValue("apBrr", wkDataFeedAirticketPriceB2.getApBrr());
            myParameterSourceAry[i].addValue("apBrs", wkDataFeedAirticketPriceB2.getApBrs());
            myParameterSourceAry[i].addValue("apBrt", wkDataFeedAirticketPriceB2.getApBrt());
            myParameterSourceAry[i].addValue("apBru", wkDataFeedAirticketPriceB2.getApBru());
            myParameterSourceAry[i].addValue("apBrv", wkDataFeedAirticketPriceB2.getApBrv());
            myParameterSourceAry[i].addValue("apBrw", wkDataFeedAirticketPriceB2.getApBrw());
            myParameterSourceAry[i].addValue("apBrx", wkDataFeedAirticketPriceB2.getApBrx());
            myParameterSourceAry[i].addValue("apBry", wkDataFeedAirticketPriceB2.getApBry());
            myParameterSourceAry[i].addValue("apBrz", wkDataFeedAirticketPriceB2.getApBrz());
            myParameterSourceAry[i].addValue("apBsa", wkDataFeedAirticketPriceB2.getApBsa());
            myParameterSourceAry[i].addValue("apBsb", wkDataFeedAirticketPriceB2.getApBsb());
            myParameterSourceAry[i].addValue("apBsc", wkDataFeedAirticketPriceB2.getApBsc());
            myParameterSourceAry[i].addValue("apBsd", wkDataFeedAirticketPriceB2.getApBsd());
            myParameterSourceAry[i].addValue("apBse", wkDataFeedAirticketPriceB2.getApBse());
            myParameterSourceAry[i].addValue("apBsf", wkDataFeedAirticketPriceB2.getApBsf());
            myParameterSourceAry[i].addValue("apBsg", wkDataFeedAirticketPriceB2.getApBsg());
            myParameterSourceAry[i].addValue("apBsh", wkDataFeedAirticketPriceB2.getApBsh());
            myParameterSourceAry[i].addValue("apBsi", wkDataFeedAirticketPriceB2.getApBsi());
            myParameterSourceAry[i].addValue("apBsj", wkDataFeedAirticketPriceB2.getApBsj());
            myParameterSourceAry[i].addValue("apBsk", wkDataFeedAirticketPriceB2.getApBsk());
            myParameterSourceAry[i].addValue("apBsl", wkDataFeedAirticketPriceB2.getApBsl());
            myParameterSourceAry[i].addValue("apBsm", wkDataFeedAirticketPriceB2.getApBsm());
            myParameterSourceAry[i].addValue("apBsn", wkDataFeedAirticketPriceB2.getApBsn());
            myParameterSourceAry[i].addValue("apBso", wkDataFeedAirticketPriceB2.getApBso());
            myParameterSourceAry[i].addValue("apBsp", wkDataFeedAirticketPriceB2.getApBsp());
            myParameterSourceAry[i].addValue("apBsq", wkDataFeedAirticketPriceB2.getApBsq());
            myParameterSourceAry[i].addValue("apBsr", wkDataFeedAirticketPriceB2.getApBsr());
            myParameterSourceAry[i].addValue("apBss", wkDataFeedAirticketPriceB2.getApBss());
            myParameterSourceAry[i].addValue("apBst", wkDataFeedAirticketPriceB2.getApBst());
            myParameterSourceAry[i].addValue("apBsu", wkDataFeedAirticketPriceB2.getApBsu());
            myParameterSourceAry[i].addValue("apBsv", wkDataFeedAirticketPriceB2.getApBsv());
            myParameterSourceAry[i].addValue("apBsw", wkDataFeedAirticketPriceB2.getApBsw());
            myParameterSourceAry[i].addValue("apBsx", wkDataFeedAirticketPriceB2.getApBsx());
            myParameterSourceAry[i].addValue("apBsy", wkDataFeedAirticketPriceB2.getApBsy());
            myParameterSourceAry[i].addValue("apBsz", wkDataFeedAirticketPriceB2.getApBsz());
            myParameterSourceAry[i].addValue("apBta", wkDataFeedAirticketPriceB2.getApBta());
            myParameterSourceAry[i].addValue("apBtb", wkDataFeedAirticketPriceB2.getApBtb());
            myParameterSourceAry[i].addValue("apBtc", wkDataFeedAirticketPriceB2.getApBtc());
            myParameterSourceAry[i].addValue("apBtd", wkDataFeedAirticketPriceB2.getApBtd());
            myParameterSourceAry[i].addValue("apBte", wkDataFeedAirticketPriceB2.getApBte());
            myParameterSourceAry[i].addValue("apBtf", wkDataFeedAirticketPriceB2.getApBtf());
            myParameterSourceAry[i].addValue("apBtg", wkDataFeedAirticketPriceB2.getApBtg());
            myParameterSourceAry[i].addValue("apBth", wkDataFeedAirticketPriceB2.getApBth());
            myParameterSourceAry[i].addValue("apBti", wkDataFeedAirticketPriceB2.getApBti());
            myParameterSourceAry[i].addValue("apBtj", wkDataFeedAirticketPriceB2.getApBtj());
            myParameterSourceAry[i].addValue("apBtk", wkDataFeedAirticketPriceB2.getApBtk());
            myParameterSourceAry[i].addValue("apBtl", wkDataFeedAirticketPriceB2.getApBtl());
            myParameterSourceAry[i].addValue("apBtm", wkDataFeedAirticketPriceB2.getApBtm());
            myParameterSourceAry[i].addValue("apBtn", wkDataFeedAirticketPriceB2.getApBtn());
            myParameterSourceAry[i].addValue("apBto", wkDataFeedAirticketPriceB2.getApBto());
            myParameterSourceAry[i].addValue("apBtp", wkDataFeedAirticketPriceB2.getApBtp());
            myParameterSourceAry[i].addValue("apBtq", wkDataFeedAirticketPriceB2.getApBtq());
            myParameterSourceAry[i].addValue("apBtr", wkDataFeedAirticketPriceB2.getApBtr());
            myParameterSourceAry[i].addValue("apBts", wkDataFeedAirticketPriceB2.getApBts());
            myParameterSourceAry[i].addValue("apBtt", wkDataFeedAirticketPriceB2.getApBtt());
            myParameterSourceAry[i].addValue("apBtu", wkDataFeedAirticketPriceB2.getApBtu());
            myParameterSourceAry[i].addValue("apBtv", wkDataFeedAirticketPriceB2.getApBtv());
            myParameterSourceAry[i].addValue("apBtw", wkDataFeedAirticketPriceB2.getApBtw());
            myParameterSourceAry[i].addValue("apBtx", wkDataFeedAirticketPriceB2.getApBtx());
            myParameterSourceAry[i].addValue("apBty", wkDataFeedAirticketPriceB2.getApBty());
            myParameterSourceAry[i].addValue("apBtz", wkDataFeedAirticketPriceB2.getApBtz());
            myParameterSourceAry[i].addValue("apBua", wkDataFeedAirticketPriceB2.getApBua());
            myParameterSourceAry[i].addValue("apBub", wkDataFeedAirticketPriceB2.getApBub());
            myParameterSourceAry[i].addValue("apBuc", wkDataFeedAirticketPriceB2.getApBuc());
            myParameterSourceAry[i].addValue("apBud", wkDataFeedAirticketPriceB2.getApBud());
            myParameterSourceAry[i].addValue("apBue", wkDataFeedAirticketPriceB2.getApBue());
            myParameterSourceAry[i].addValue("apBuf", wkDataFeedAirticketPriceB2.getApBuf());
            myParameterSourceAry[i].addValue("apBug", wkDataFeedAirticketPriceB2.getApBug());
            myParameterSourceAry[i].addValue("apBuh", wkDataFeedAirticketPriceB2.getApBuh());
            myParameterSourceAry[i].addValue("apBui", wkDataFeedAirticketPriceB2.getApBui());
            myParameterSourceAry[i].addValue("apBuj", wkDataFeedAirticketPriceB2.getApBuj());
            myParameterSourceAry[i].addValue("apBuk", wkDataFeedAirticketPriceB2.getApBuk());
            myParameterSourceAry[i].addValue("apBul", wkDataFeedAirticketPriceB2.getApBul());
            myParameterSourceAry[i].addValue("apBum", wkDataFeedAirticketPriceB2.getApBum());
            myParameterSourceAry[i].addValue("apBun", wkDataFeedAirticketPriceB2.getApBun());
            myParameterSourceAry[i].addValue("apBuo", wkDataFeedAirticketPriceB2.getApBuo());
            myParameterSourceAry[i].addValue("apBup", wkDataFeedAirticketPriceB2.getApBup());
            myParameterSourceAry[i].addValue("apBuq", wkDataFeedAirticketPriceB2.getApBuq());
            myParameterSourceAry[i].addValue("apBur", wkDataFeedAirticketPriceB2.getApBur());
            myParameterSourceAry[i].addValue("apBus", wkDataFeedAirticketPriceB2.getApBus());
            myParameterSourceAry[i].addValue("apBut", wkDataFeedAirticketPriceB2.getApBut());
            myParameterSourceAry[i].addValue("apBuu", wkDataFeedAirticketPriceB2.getApBuu());
            myParameterSourceAry[i].addValue("apBuv", wkDataFeedAirticketPriceB2.getApBuv());
            myParameterSourceAry[i].addValue("apBuw", wkDataFeedAirticketPriceB2.getApBuw());
            myParameterSourceAry[i].addValue("apBux", wkDataFeedAirticketPriceB2.getApBux());
            myParameterSourceAry[i].addValue("apBuy", wkDataFeedAirticketPriceB2.getApBuy());
            myParameterSourceAry[i].addValue("apBuz", wkDataFeedAirticketPriceB2.getApBuz());
            myParameterSourceAry[i].addValue("apBva", wkDataFeedAirticketPriceB2.getApBva());
            myParameterSourceAry[i].addValue("apBvb", wkDataFeedAirticketPriceB2.getApBvb());
            myParameterSourceAry[i].addValue("apBvc", wkDataFeedAirticketPriceB2.getApBvc());
            myParameterSourceAry[i].addValue("apBvd", wkDataFeedAirticketPriceB2.getApBvd());
            myParameterSourceAry[i].addValue("apBve", wkDataFeedAirticketPriceB2.getApBve());
            myParameterSourceAry[i].addValue("apBvf", wkDataFeedAirticketPriceB2.getApBvf());
            myParameterSourceAry[i].addValue("apBvg", wkDataFeedAirticketPriceB2.getApBvg());
            myParameterSourceAry[i].addValue("apBvh", wkDataFeedAirticketPriceB2.getApBvh());
            myParameterSourceAry[i].addValue("apBvi", wkDataFeedAirticketPriceB2.getApBvi());
            myParameterSourceAry[i].addValue("apBvj", wkDataFeedAirticketPriceB2.getApBvj());
            myParameterSourceAry[i].addValue("apBvk", wkDataFeedAirticketPriceB2.getApBvk());
            myParameterSourceAry[i].addValue("apBvl", wkDataFeedAirticketPriceB2.getApBvl());
            myParameterSourceAry[i].addValue("apBvm", wkDataFeedAirticketPriceB2.getApBvm());
            myParameterSourceAry[i].addValue("apBvn", wkDataFeedAirticketPriceB2.getApBvn());
            myParameterSourceAry[i].addValue("apBvo", wkDataFeedAirticketPriceB2.getApBvo());
            myParameterSourceAry[i].addValue("apBvp", wkDataFeedAirticketPriceB2.getApBvp());
            myParameterSourceAry[i].addValue("apBvq", wkDataFeedAirticketPriceB2.getApBvq());
            myParameterSourceAry[i].addValue("apBvr", wkDataFeedAirticketPriceB2.getApBvr());
            myParameterSourceAry[i].addValue("apBvs", wkDataFeedAirticketPriceB2.getApBvs());
            myParameterSourceAry[i].addValue("apBvt", wkDataFeedAirticketPriceB2.getApBvt());
            myParameterSourceAry[i].addValue("apBvu", wkDataFeedAirticketPriceB2.getApBvu());
            myParameterSourceAry[i].addValue("apBvv", wkDataFeedAirticketPriceB2.getApBvv());
            myParameterSourceAry[i].addValue("apBvw", wkDataFeedAirticketPriceB2.getApBvw());
            myParameterSourceAry[i].addValue("apBvx", wkDataFeedAirticketPriceB2.getApBvx());
            myParameterSourceAry[i].addValue("apBvy", wkDataFeedAirticketPriceB2.getApBvy());
            myParameterSourceAry[i].addValue("apBvz", wkDataFeedAirticketPriceB2.getApBvz());
            myParameterSourceAry[i].addValue("apBwa", wkDataFeedAirticketPriceB2.getApBwa());
            myParameterSourceAry[i].addValue("apBwb", wkDataFeedAirticketPriceB2.getApBwb());
            myParameterSourceAry[i].addValue("apBwc", wkDataFeedAirticketPriceB2.getApBwc());
            myParameterSourceAry[i].addValue("apBwd", wkDataFeedAirticketPriceB2.getApBwd());
            myParameterSourceAry[i].addValue("apBwe", wkDataFeedAirticketPriceB2.getApBwe());
            myParameterSourceAry[i].addValue("apBwf", wkDataFeedAirticketPriceB2.getApBwf());
            myParameterSourceAry[i].addValue("apBwg", wkDataFeedAirticketPriceB2.getApBwg());
            myParameterSourceAry[i].addValue("apBwh", wkDataFeedAirticketPriceB2.getApBwh());
            myParameterSourceAry[i].addValue("apBwi", wkDataFeedAirticketPriceB2.getApBwi());
            myParameterSourceAry[i].addValue("apBwj", wkDataFeedAirticketPriceB2.getApBwj());
            myParameterSourceAry[i].addValue("apBwk", wkDataFeedAirticketPriceB2.getApBwk());
            myParameterSourceAry[i].addValue("apBwl", wkDataFeedAirticketPriceB2.getApBwl());
            myParameterSourceAry[i].addValue("apBwm", wkDataFeedAirticketPriceB2.getApBwm());
            myParameterSourceAry[i].addValue("apBwn", wkDataFeedAirticketPriceB2.getApBwn());
            myParameterSourceAry[i].addValue("apBwo", wkDataFeedAirticketPriceB2.getApBwo());
            myParameterSourceAry[i].addValue("apBwp", wkDataFeedAirticketPriceB2.getApBwp());
            myParameterSourceAry[i].addValue("apBwq", wkDataFeedAirticketPriceB2.getApBwq());
            myParameterSourceAry[i].addValue("apBwr", wkDataFeedAirticketPriceB2.getApBwr());
            myParameterSourceAry[i].addValue("apBws", wkDataFeedAirticketPriceB2.getApBws());
            myParameterSourceAry[i].addValue("apBwt", wkDataFeedAirticketPriceB2.getApBwt());
            myParameterSourceAry[i].addValue("apBwu", wkDataFeedAirticketPriceB2.getApBwu());
            myParameterSourceAry[i].addValue("apBwv", wkDataFeedAirticketPriceB2.getApBwv());
            myParameterSourceAry[i].addValue("apBww", wkDataFeedAirticketPriceB2.getApBww());
            myParameterSourceAry[i].addValue("apBwx", wkDataFeedAirticketPriceB2.getApBwx());
            myParameterSourceAry[i].addValue("apBwy", wkDataFeedAirticketPriceB2.getApBwy());
            myParameterSourceAry[i].addValue("apBwz", wkDataFeedAirticketPriceB2.getApBwz());
            myParameterSourceAry[i].addValue("apBxa", wkDataFeedAirticketPriceB2.getApBxa());
            myParameterSourceAry[i].addValue("apBxb", wkDataFeedAirticketPriceB2.getApBxb());
            myParameterSourceAry[i].addValue("apBxc", wkDataFeedAirticketPriceB2.getApBxc());
            myParameterSourceAry[i].addValue("apBxd", wkDataFeedAirticketPriceB2.getApBxd());
            myParameterSourceAry[i].addValue("apBxe", wkDataFeedAirticketPriceB2.getApBxe());
            myParameterSourceAry[i].addValue("apBxf", wkDataFeedAirticketPriceB2.getApBxf());
            myParameterSourceAry[i].addValue("apBxg", wkDataFeedAirticketPriceB2.getApBxg());
            myParameterSourceAry[i].addValue("apBxh", wkDataFeedAirticketPriceB2.getApBxh());
            myParameterSourceAry[i].addValue("apBxi", wkDataFeedAirticketPriceB2.getApBxi());
            myParameterSourceAry[i].addValue("apBxj", wkDataFeedAirticketPriceB2.getApBxj());
            myParameterSourceAry[i].addValue("apBxk", wkDataFeedAirticketPriceB2.getApBxk());
            myParameterSourceAry[i].addValue("apBxl", wkDataFeedAirticketPriceB2.getApBxl());
            myParameterSourceAry[i].addValue("apBxm", wkDataFeedAirticketPriceB2.getApBxm());
            myParameterSourceAry[i].addValue("apBxn", wkDataFeedAirticketPriceB2.getApBxn());
            myParameterSourceAry[i].addValue("apBxo", wkDataFeedAirticketPriceB2.getApBxo());
            myParameterSourceAry[i].addValue("apBxp", wkDataFeedAirticketPriceB2.getApBxp());
            myParameterSourceAry[i].addValue("apBxq", wkDataFeedAirticketPriceB2.getApBxq());
            myParameterSourceAry[i].addValue("apBxr", wkDataFeedAirticketPriceB2.getApBxr());
            myParameterSourceAry[i].addValue("apBxs", wkDataFeedAirticketPriceB2.getApBxs());
            myParameterSourceAry[i].addValue("apBxt", wkDataFeedAirticketPriceB2.getApBxt());
            myParameterSourceAry[i].addValue("apBxu", wkDataFeedAirticketPriceB2.getApBxu());
            myParameterSourceAry[i].addValue("apBxv", wkDataFeedAirticketPriceB2.getApBxv());
            myParameterSourceAry[i].addValue("apBxw", wkDataFeedAirticketPriceB2.getApBxw());
            myParameterSourceAry[i].addValue("apBxx", wkDataFeedAirticketPriceB2.getApBxx());
            myParameterSourceAry[i].addValue("apBxy", wkDataFeedAirticketPriceB2.getApBxy());
            myParameterSourceAry[i].addValue("apBxz", wkDataFeedAirticketPriceB2.getApBxz());
            myParameterSourceAry[i].addValue("apBya", wkDataFeedAirticketPriceB2.getApBya());
            myParameterSourceAry[i].addValue("apByb", wkDataFeedAirticketPriceB2.getApByb());
            myParameterSourceAry[i].addValue("apByc", wkDataFeedAirticketPriceB2.getApByc());
            myParameterSourceAry[i].addValue("apByd", wkDataFeedAirticketPriceB2.getApByd());
            myParameterSourceAry[i].addValue("apBye", wkDataFeedAirticketPriceB2.getApBye());
            myParameterSourceAry[i].addValue("apByf", wkDataFeedAirticketPriceB2.getApByf());
            myParameterSourceAry[i].addValue("apByg", wkDataFeedAirticketPriceB2.getApByg());
            myParameterSourceAry[i].addValue("apByh", wkDataFeedAirticketPriceB2.getApByh());
            myParameterSourceAry[i].addValue("apByi", wkDataFeedAirticketPriceB2.getApByi());
            myParameterSourceAry[i].addValue("apByj", wkDataFeedAirticketPriceB2.getApByj());
            myParameterSourceAry[i].addValue("apByk", wkDataFeedAirticketPriceB2.getApByk());
            myParameterSourceAry[i].addValue("apByl", wkDataFeedAirticketPriceB2.getApByl());
            myParameterSourceAry[i].addValue("apBym", wkDataFeedAirticketPriceB2.getApBym());
            myParameterSourceAry[i].addValue("apByn", wkDataFeedAirticketPriceB2.getApByn());
            myParameterSourceAry[i].addValue("apByo", wkDataFeedAirticketPriceB2.getApByo());
            myParameterSourceAry[i].addValue("apByp", wkDataFeedAirticketPriceB2.getApByp());
            myParameterSourceAry[i].addValue("apByq", wkDataFeedAirticketPriceB2.getApByq());
            myParameterSourceAry[i].addValue("apByr", wkDataFeedAirticketPriceB2.getApByr());
            myParameterSourceAry[i].addValue("apBys", wkDataFeedAirticketPriceB2.getApBys());
            myParameterSourceAry[i].addValue("apByt", wkDataFeedAirticketPriceB2.getApByt());
            myParameterSourceAry[i].addValue("apByu", wkDataFeedAirticketPriceB2.getApByu());
            myParameterSourceAry[i].addValue("apByv", wkDataFeedAirticketPriceB2.getApByv());
            myParameterSourceAry[i].addValue("apByw", wkDataFeedAirticketPriceB2.getApByw());
            myParameterSourceAry[i].addValue("apByx", wkDataFeedAirticketPriceB2.getApByx());
            myParameterSourceAry[i].addValue("apByy", wkDataFeedAirticketPriceB2.getApByy());
            myParameterSourceAry[i].addValue("apByz", wkDataFeedAirticketPriceB2.getApByz());
            myParameterSourceAry[i].addValue("apBza", wkDataFeedAirticketPriceB2.getApBza());
            myParameterSourceAry[i].addValue("apBzb", wkDataFeedAirticketPriceB2.getApBzb());
            myParameterSourceAry[i].addValue("apBzc", wkDataFeedAirticketPriceB2.getApBzc());
            myParameterSourceAry[i].addValue("apBzd", wkDataFeedAirticketPriceB2.getApBzd());
            myParameterSourceAry[i].addValue("apBze", wkDataFeedAirticketPriceB2.getApBze());
            myParameterSourceAry[i].addValue("apBzf", wkDataFeedAirticketPriceB2.getApBzf());
            myParameterSourceAry[i].addValue("apBzg", wkDataFeedAirticketPriceB2.getApBzg());
            myParameterSourceAry[i].addValue("apBzh", wkDataFeedAirticketPriceB2.getApBzh());
            myParameterSourceAry[i].addValue("apBzi", wkDataFeedAirticketPriceB2.getApBzi());
            myParameterSourceAry[i].addValue("apBzj", wkDataFeedAirticketPriceB2.getApBzj());
            myParameterSourceAry[i].addValue("apBzk", wkDataFeedAirticketPriceB2.getApBzk());
            myParameterSourceAry[i].addValue("apBzl", wkDataFeedAirticketPriceB2.getApBzl());
            myParameterSourceAry[i].addValue("apBzm", wkDataFeedAirticketPriceB2.getApBzm());
            myParameterSourceAry[i].addValue("apBzn", wkDataFeedAirticketPriceB2.getApBzn());
            myParameterSourceAry[i].addValue("apBzo", wkDataFeedAirticketPriceB2.getApBzo());
            myParameterSourceAry[i].addValue("apBzp", wkDataFeedAirticketPriceB2.getApBzp());
            myParameterSourceAry[i].addValue("apBzq", wkDataFeedAirticketPriceB2.getApBzq());
            myParameterSourceAry[i].addValue("apBzr", wkDataFeedAirticketPriceB2.getApBzr());
            myParameterSourceAry[i].addValue("apBzs", wkDataFeedAirticketPriceB2.getApBzs());
            myParameterSourceAry[i].addValue("apBzt", wkDataFeedAirticketPriceB2.getApBzt());
            myParameterSourceAry[i].addValue("apBzu", wkDataFeedAirticketPriceB2.getApBzu());
            myParameterSourceAry[i].addValue("apBzv", wkDataFeedAirticketPriceB2.getApBzv());
            myParameterSourceAry[i].addValue("apBzw", wkDataFeedAirticketPriceB2.getApBzw());
            myParameterSourceAry[i].addValue("apBzx", wkDataFeedAirticketPriceB2.getApBzx());
            myParameterSourceAry[i].addValue("apBzy", wkDataFeedAirticketPriceB2.getApBzy());
            myParameterSourceAry[i].addValue("apBzz", wkDataFeedAirticketPriceB2.getApBzz());
        }

        myNamedParameterJdbcTemplate.batchUpdate(mySql, myParameterSourceAry);
    }

    @Override
    public void deleteDataFeedAirticketPriceB2sByFileNo(Integer fileNo) {
        String mySql = "DELETE FROM db_airticket.data_feed_airticket_price_b2 " +
                " WHERE file_no = :fileNo ";

        Map<String,Object> myMap = new HashMap<>();
        myMap.put("fileNo", fileNo);

        myNamedParameterJdbcTemplate.update(mySql, myMap);
    }
}
