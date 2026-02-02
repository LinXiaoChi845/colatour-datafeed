package tw.com.colatour.datafeed.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Component;
import tw.com.colatour.datafeed.dao.DataFeedAirticketPrice01Dao;
import tw.com.colatour.datafeed.model.DataFeedAirticketPrice01;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class DataFeedAirticketPrice01DaoImpl implements DataFeedAirticketPrice01Dao {

    @Autowired
    private NamedParameterJdbcTemplate myNamedParameterJdbcTemplate;

    @Override
    public void createDataFeedAirticketPrice01s(List<DataFeedAirticketPrice01> dataFeedAirticketPrice01List) {
        String mySql = "INSERT INTO db_airticket.data_feed_airticket_price_01 ( " +
                " file_no, price_no, " +
                " ap_a, ap_b, ap_c, ap_d, ap_e, ap_f, ap_g, ap_h, ap_i, ap_j, ap_k, ap_l, ap_m, " +
                " ap_n, ap_o, ap_p, ap_q, ap_r, ap_s, ap_t, ap_u, ap_v, ap_w, ap_x, ap_y, ap_z, " +
                " ap_aa, ap_ab, ap_ac, ap_ad, ap_ae, ap_af, ap_ag, ap_ah, ap_ai, ap_aj, ap_ak, ap_al, ap_am, " +
                " ap_an, ap_ao, ap_ap, ap_aq, ap_ar, ap_as, ap_at, ap_au, ap_av, ap_aw, ap_ax, ap_ay, ap_az, " +
                " ap_ba, ap_bb, ap_bc, ap_bd, ap_be, ap_bf, ap_bg, ap_bh, ap_bi, ap_bj, ap_bk, ap_bl, ap_bm, " +
                " ap_bn, ap_bo, ap_bp, ap_bq, ap_br, ap_bs, ap_bt, ap_bu, ap_bv, ap_bw, ap_bx, ap_by, ap_bz, " +
                " ap_ca, ap_cb, ap_cc, ap_cd, ap_ce, ap_cf, ap_cg, ap_ch, ap_ci, ap_cj, ap_ck, ap_cl, ap_cm, " +
                " ap_cn, ap_co, ap_cp, ap_cq, ap_cr, ap_cs, ap_ct, ap_cu, ap_cv, ap_cw, ap_cx, ap_cy, ap_cz, " +
                " ap_da, ap_db, ap_dc, ap_dd, ap_de, ap_df, ap_dg, ap_dh, ap_di, ap_dj, ap_dk, ap_dl, ap_dm, " +
                " ap_dn, ap_do, ap_dp, ap_dq, ap_dr, ap_ds, ap_dt, ap_du, ap_dv, ap_dw, ap_dx, ap_dy, ap_dz, " +
                " ap_ea, ap_eb, ap_ec, ap_ed, ap_ee, ap_ef, ap_eg, ap_eh, ap_ei, ap_ej, ap_ek, ap_el, ap_em, " +
                " ap_en, ap_eo, ap_ep, ap_eq, ap_er, ap_es, ap_et, ap_eu, ap_ev, ap_ew, ap_ex, ap_ey, ap_ez, " +
                " ap_fa, ap_fb, ap_fc, ap_fd, ap_fe, ap_ff, ap_fg, ap_fh, ap_fi, ap_fj, ap_fk, ap_fl, ap_fm, " +
                " ap_fn, ap_fo, ap_fp, ap_fq, ap_fr, ap_fs, ap_ft, ap_fu, ap_fv, ap_fw, ap_fx, ap_fy, ap_fz, " +
                " ap_ga, ap_gb, ap_gc, ap_gd, ap_ge, ap_gf, ap_gg, ap_gh, ap_gi, ap_gj, ap_gk, ap_gl, ap_gm, " +
                " ap_gn, ap_go, ap_gp, ap_gq, ap_gr, ap_gs, ap_gt, ap_gu, ap_gv, ap_gw, ap_gx, ap_gy, ap_gz, " +
                " ap_ha, ap_hb, ap_hc, ap_hd, ap_he, ap_hf, ap_hg, ap_hh, ap_hi, ap_hj, ap_hk, ap_hl, ap_hm, " +
                " ap_hn, ap_ho, ap_hp, ap_hq, ap_hr, ap_hs, ap_ht, ap_hu, ap_hv, ap_hw, ap_hx, ap_hy, ap_hz, " +
                " ap_ia, ap_ib, ap_ic, ap_id, ap_ie, ap_if, ap_ig, ap_ih, ap_ii, ap_ij, ap_ik, ap_il, ap_im, " +
                " ap_in, ap_io, ap_ip, ap_iq, ap_ir, ap_is, ap_it, ap_iu, ap_iv, ap_iw, ap_ix, ap_iy, ap_iz, " +
                " ap_ja, ap_jb, ap_jc, ap_jd, ap_je, ap_jf, ap_jg, ap_jh, ap_ji, ap_jj, ap_jk, ap_jl, ap_jm, " +
                " ap_jn, ap_jo, ap_jp, ap_jq, ap_jr, ap_js, ap_jt, ap_ju, ap_jv, ap_jw, ap_jx, ap_jy, ap_jz, " +
                " ap_ka, ap_kb, ap_kc, ap_kd, ap_ke, ap_kf, ap_kg, ap_kh, ap_ki, ap_kj, ap_kk, ap_kl, ap_km, " +
                " ap_kn, ap_ko, ap_kp, ap_kq, ap_kr, ap_ks, ap_kt, ap_ku, ap_kv, ap_kw, ap_kx, ap_ky, ap_kz, " +
                " ap_la, ap_lb, ap_lc, ap_ld, ap_le, ap_lf, ap_lg, ap_lh, ap_li, ap_lj, ap_lk, ap_ll, ap_lm, " +
                " ap_ln, ap_lo, ap_lp, ap_lq, ap_lr, ap_ls, ap_lt, ap_lu, ap_lv, ap_lw, ap_lx, ap_ly, ap_lz, " +
                " ap_ma, ap_mb, ap_mc, ap_md, ap_me, ap_mf, ap_mg, ap_mh, ap_mi, ap_mj, ap_mk, ap_ml, ap_mm, " +
                " ap_mn, ap_mo, ap_mp, ap_mq, ap_mr, ap_ms, ap_mt, ap_mu, ap_mv, ap_mw, ap_mx, ap_my, ap_mz ) " +
                " VALUES ( " +
                " :fileNo, :priceNo, " +
                " :apA, :apB, :apC, :apD, :apE, :apF, :apG, :apH, :apI, :apJ, :apK, :apL, :apM, " +
                " :apN, :apO, :apP, :apQ, :apR, :apS, :apT, :apU, :apV, :apW, :apX, :apY, :apZ, " +
                " :apAa, :apAb, :apAc, :apAd, :apAe, :apAf, :apAg, :apAh, :apAi, :apAj, :apAk, :apAl, :apAm, " +
                " :apAn, :apAo, :apAp, :apAq, :apAr, :apAs, :apAt, :apAu, :apAv, :apAw, :apAx, :apAy, :apAz, " +
                " :apBa, :apBb, :apBc, :apBd, :apBe, :apBf, :apBg, :apBh, :apBi, :apBj, :apBk, :apBl, :apBm, " +
                " :apBn, :apBo, :apBp, :apBq, :apBr, :apBs, :apBt, :apBu, :apBv, :apBw, :apBx, :apBy, :apBz, " +
                " :apCa, :apCb, :apCc, :apCd, :apCe, :apCf, :apCg, :apCh, :apCi, :apCj, :apCk, :apCl, :apCm, " +
                " :apCn, :apCo, :apCp, :apCq, :apCr, :apCs, :apCt, :apCu, :apCv, :apCw, :apCx, :apCy, :apCz, " +
                " :apDa, :apDb, :apDc, :apDd, :apDe, :apDf, :apDg, :apDh, :apDi, :apDj, :apDk, :apDl, :apDm, " +
                " :apDn, :apDo, :apDp, :apDq, :apDr, :apDs, :apDt, :apDu, :apDv, :apDw, :apDx, :apDy, :apDz, " +
                " :apEa, :apEb, :apEc, :apEd, :apEe, :apEf, :apEg, :apEh, :apEi, :apEj, :apEk, :apEl, :apEm, " +
                " :apEn, :apEo, :apEp, :apEq, :apEr, :apEs, :apEt, :apEu, :apEv, :apEw, :apEx, :apEy, :apEz, " +
                " :apFa, :apFb, :apFc, :apFd, :apFe, :apFf, :apFg, :apFh, :apFi, :apFj, :apFk, :apFl, :apFm, " +
                " :apFn, :apFo, :apFp, :apFq, :apFr, :apFs, :apFt, :apFu, :apFv, :apFw, :apFx, :apFy, :apFz, " +
                " :apGa, :apGb, :apGc, :apGd, :apGe, :apGf, :apGg, :apGh, :apGi, :apGj, :apGk, :apGl, :apGm, " +
                " :apGn, :apGo, :apGp, :apGq, :apGr, :apGs, :apGt, :apGu, :apGv, :apGw, :apGx, :apGy, :apGz, " +
                " :apHa, :apHb, :apHc, :apHd, :apHe, :apHf, :apHg, :apHh, :apHi, :apHj, :apHk, :apHl, :apHm, " +
                " :apHn, :apHo, :apHp, :apHq, :apHr, :apHs, :apHt, :apHu, :apHv, :apHw, :apHx, :apHy, :apHz, " +
                " :apIa, :apIb, :apIc, :apId, :apIe, :apIf, :apIg, :apIh, :apIi, :apIj, :apIk, :apIl, :apIm, " +
                " :apIn, :apIo, :apIp, :apIq, :apIr, :apIs, :apIt, :apIu, :apIv, :apIw, :apIx, :apIy, :apIz, " +
                " :apJa, :apJb, :apJc, :apJd, :apJe, :apJf, :apJg, :apJh, :apJi, :apJj, :apJk, :apJl, :apJm, " +
                " :apJn, :apJo, :apJp, :apJq, :apJr, :apJs, :apJt, :apJu, :apJv, :apJw, :apJx, :apJy, :apJz, " +
                " :apKa, :apKb, :apKc, :apKd, :apKe, :apKf, :apKg, :apKh, :apKi, :apKj, :apKk, :apKl, :apKm, " +
                " :apKn, :apKo, :apKp, :apKq, :apKr, :apKs, :apKt, :apKu, :apKv, :apKw, :apKx, :apKy, :apKz, " +
                " :apLa, :apLb, :apLc, :apLd, :apLe, :apLf, :apLg, :apLh, :apLi, :apLj, :apLk, :apLl, :apLm, " +
                " :apLn, :apLo, :apLp, :apLq, :apLr, :apLs, :apLt, :apLu, :apLv, :apLw, :apLx, :apLy, :apLz, " +
                " :apMa, :apMb, :apMc, :apMd, :apMe, :apMf, :apMg, :apMh, :apMi, :apMj, :apMk, :apMl, :apMm, " +
                " :apMn, :apMo, :apMp, :apMq, :apMr, :apMs, :apMt, :apMu, :apMv, :apMw, :apMx, :apMy, :apMz ) ";

        MapSqlParameterSource[] myParameterSourceAry = new MapSqlParameterSource[dataFeedAirticketPrice01List.size()];

        for (int i = 0; i < dataFeedAirticketPrice01List.size(); i++) {
            DataFeedAirticketPrice01 wkDataFeedAirticketPrice01 = dataFeedAirticketPrice01List.get(i);

            myParameterSourceAry[i] = new MapSqlParameterSource();

            myParameterSourceAry[i].addValue("fileNo", wkDataFeedAirticketPrice01.getFileNo());
            myParameterSourceAry[i].addValue("priceNo", wkDataFeedAirticketPrice01.getPriceNo());
            myParameterSourceAry[i].addValue("apA", wkDataFeedAirticketPrice01.getApA());
            myParameterSourceAry[i].addValue("apB", wkDataFeedAirticketPrice01.getApB());
            myParameterSourceAry[i].addValue("apC", wkDataFeedAirticketPrice01.getApC());
            myParameterSourceAry[i].addValue("apD", wkDataFeedAirticketPrice01.getApD());
            myParameterSourceAry[i].addValue("apE", wkDataFeedAirticketPrice01.getApE());
            myParameterSourceAry[i].addValue("apF", wkDataFeedAirticketPrice01.getApF());
            myParameterSourceAry[i].addValue("apG", wkDataFeedAirticketPrice01.getApG());
            myParameterSourceAry[i].addValue("apH", wkDataFeedAirticketPrice01.getApH());
            myParameterSourceAry[i].addValue("apI", wkDataFeedAirticketPrice01.getApI());
            myParameterSourceAry[i].addValue("apJ", wkDataFeedAirticketPrice01.getApJ());
            myParameterSourceAry[i].addValue("apK", wkDataFeedAirticketPrice01.getApK());
            myParameterSourceAry[i].addValue("apL", wkDataFeedAirticketPrice01.getApL());
            myParameterSourceAry[i].addValue("apM", wkDataFeedAirticketPrice01.getApM());
            myParameterSourceAry[i].addValue("apN", wkDataFeedAirticketPrice01.getApN());
            myParameterSourceAry[i].addValue("apO", wkDataFeedAirticketPrice01.getApO());
            myParameterSourceAry[i].addValue("apP", wkDataFeedAirticketPrice01.getApP());
            myParameterSourceAry[i].addValue("apQ", wkDataFeedAirticketPrice01.getApQ());
            myParameterSourceAry[i].addValue("apR", wkDataFeedAirticketPrice01.getApR());
            myParameterSourceAry[i].addValue("apS", wkDataFeedAirticketPrice01.getApS());
            myParameterSourceAry[i].addValue("apT", wkDataFeedAirticketPrice01.getApT());
            myParameterSourceAry[i].addValue("apU", wkDataFeedAirticketPrice01.getApU());
            myParameterSourceAry[i].addValue("apV", wkDataFeedAirticketPrice01.getApV());
            myParameterSourceAry[i].addValue("apW", wkDataFeedAirticketPrice01.getApW());
            myParameterSourceAry[i].addValue("apX", wkDataFeedAirticketPrice01.getApX());
            myParameterSourceAry[i].addValue("apY", wkDataFeedAirticketPrice01.getApY());
            myParameterSourceAry[i].addValue("apZ", wkDataFeedAirticketPrice01.getApZ());
            myParameterSourceAry[i].addValue("apAa", wkDataFeedAirticketPrice01.getApAa());
            myParameterSourceAry[i].addValue("apAb", wkDataFeedAirticketPrice01.getApAb());
            myParameterSourceAry[i].addValue("apAc", wkDataFeedAirticketPrice01.getApAc());
            myParameterSourceAry[i].addValue("apAd", wkDataFeedAirticketPrice01.getApAd());
            myParameterSourceAry[i].addValue("apAe", wkDataFeedAirticketPrice01.getApAe());
            myParameterSourceAry[i].addValue("apAf", wkDataFeedAirticketPrice01.getApAf());
            myParameterSourceAry[i].addValue("apAg", wkDataFeedAirticketPrice01.getApAg());
            myParameterSourceAry[i].addValue("apAh", wkDataFeedAirticketPrice01.getApAh());
            myParameterSourceAry[i].addValue("apAi", wkDataFeedAirticketPrice01.getApAi());
            myParameterSourceAry[i].addValue("apAj", wkDataFeedAirticketPrice01.getApAj());
            myParameterSourceAry[i].addValue("apAk", wkDataFeedAirticketPrice01.getApAk());
            myParameterSourceAry[i].addValue("apAl", wkDataFeedAirticketPrice01.getApAl());
            myParameterSourceAry[i].addValue("apAm", wkDataFeedAirticketPrice01.getApAm());
            myParameterSourceAry[i].addValue("apAn", wkDataFeedAirticketPrice01.getApAn());
            myParameterSourceAry[i].addValue("apAo", wkDataFeedAirticketPrice01.getApAo());
            myParameterSourceAry[i].addValue("apAp", wkDataFeedAirticketPrice01.getApAp());
            myParameterSourceAry[i].addValue("apAq", wkDataFeedAirticketPrice01.getApAq());
            myParameterSourceAry[i].addValue("apAr", wkDataFeedAirticketPrice01.getApAr());
            myParameterSourceAry[i].addValue("apAs", wkDataFeedAirticketPrice01.getApAs());
            myParameterSourceAry[i].addValue("apAt", wkDataFeedAirticketPrice01.getApAt());
            myParameterSourceAry[i].addValue("apAu", wkDataFeedAirticketPrice01.getApAu());
            myParameterSourceAry[i].addValue("apAv", wkDataFeedAirticketPrice01.getApAv());
            myParameterSourceAry[i].addValue("apAw", wkDataFeedAirticketPrice01.getApAw());
            myParameterSourceAry[i].addValue("apAx", wkDataFeedAirticketPrice01.getApAx());
            myParameterSourceAry[i].addValue("apAy", wkDataFeedAirticketPrice01.getApAy());
            myParameterSourceAry[i].addValue("apAz", wkDataFeedAirticketPrice01.getApAz());
            myParameterSourceAry[i].addValue("apBa", wkDataFeedAirticketPrice01.getApBa());
            myParameterSourceAry[i].addValue("apBb", wkDataFeedAirticketPrice01.getApBb());
            myParameterSourceAry[i].addValue("apBc", wkDataFeedAirticketPrice01.getApBc());
            myParameterSourceAry[i].addValue("apBd", wkDataFeedAirticketPrice01.getApBd());
            myParameterSourceAry[i].addValue("apBe", wkDataFeedAirticketPrice01.getApBe());
            myParameterSourceAry[i].addValue("apBf", wkDataFeedAirticketPrice01.getApBf());
            myParameterSourceAry[i].addValue("apBg", wkDataFeedAirticketPrice01.getApBg());
            myParameterSourceAry[i].addValue("apBh", wkDataFeedAirticketPrice01.getApBh());
            myParameterSourceAry[i].addValue("apBi", wkDataFeedAirticketPrice01.getApBi());
            myParameterSourceAry[i].addValue("apBj", wkDataFeedAirticketPrice01.getApBj());
            myParameterSourceAry[i].addValue("apBk", wkDataFeedAirticketPrice01.getApBk());
            myParameterSourceAry[i].addValue("apBl", wkDataFeedAirticketPrice01.getApBl());
            myParameterSourceAry[i].addValue("apBm", wkDataFeedAirticketPrice01.getApBm());
            myParameterSourceAry[i].addValue("apBn", wkDataFeedAirticketPrice01.getApBn());
            myParameterSourceAry[i].addValue("apBo", wkDataFeedAirticketPrice01.getApBo());
            myParameterSourceAry[i].addValue("apBp", wkDataFeedAirticketPrice01.getApBp());
            myParameterSourceAry[i].addValue("apBq", wkDataFeedAirticketPrice01.getApBq());
            myParameterSourceAry[i].addValue("apBr", wkDataFeedAirticketPrice01.getApBr());
            myParameterSourceAry[i].addValue("apBs", wkDataFeedAirticketPrice01.getApBs());
            myParameterSourceAry[i].addValue("apBt", wkDataFeedAirticketPrice01.getApBt());
            myParameterSourceAry[i].addValue("apBu", wkDataFeedAirticketPrice01.getApBu());
            myParameterSourceAry[i].addValue("apBv", wkDataFeedAirticketPrice01.getApBv());
            myParameterSourceAry[i].addValue("apBw", wkDataFeedAirticketPrice01.getApBw());
            myParameterSourceAry[i].addValue("apBx", wkDataFeedAirticketPrice01.getApBx());
            myParameterSourceAry[i].addValue("apBy", wkDataFeedAirticketPrice01.getApBy());
            myParameterSourceAry[i].addValue("apBz", wkDataFeedAirticketPrice01.getApBz());
            myParameterSourceAry[i].addValue("apCa", wkDataFeedAirticketPrice01.getApCa());
            myParameterSourceAry[i].addValue("apCb", wkDataFeedAirticketPrice01.getApCb());
            myParameterSourceAry[i].addValue("apCc", wkDataFeedAirticketPrice01.getApCc());
            myParameterSourceAry[i].addValue("apCd", wkDataFeedAirticketPrice01.getApCd());
            myParameterSourceAry[i].addValue("apCe", wkDataFeedAirticketPrice01.getApCe());
            myParameterSourceAry[i].addValue("apCf", wkDataFeedAirticketPrice01.getApCf());
            myParameterSourceAry[i].addValue("apCg", wkDataFeedAirticketPrice01.getApCg());
            myParameterSourceAry[i].addValue("apCh", wkDataFeedAirticketPrice01.getApCh());
            myParameterSourceAry[i].addValue("apCi", wkDataFeedAirticketPrice01.getApCi());
            myParameterSourceAry[i].addValue("apCj", wkDataFeedAirticketPrice01.getApCj());
            myParameterSourceAry[i].addValue("apCk", wkDataFeedAirticketPrice01.getApCk());
            myParameterSourceAry[i].addValue("apCl", wkDataFeedAirticketPrice01.getApCl());
            myParameterSourceAry[i].addValue("apCm", wkDataFeedAirticketPrice01.getApCm());
            myParameterSourceAry[i].addValue("apCn", wkDataFeedAirticketPrice01.getApCn());
            myParameterSourceAry[i].addValue("apCo", wkDataFeedAirticketPrice01.getApCo());
            myParameterSourceAry[i].addValue("apCp", wkDataFeedAirticketPrice01.getApCp());
            myParameterSourceAry[i].addValue("apCq", wkDataFeedAirticketPrice01.getApCq());
            myParameterSourceAry[i].addValue("apCr", wkDataFeedAirticketPrice01.getApCr());
            myParameterSourceAry[i].addValue("apCs", wkDataFeedAirticketPrice01.getApCs());
            myParameterSourceAry[i].addValue("apCt", wkDataFeedAirticketPrice01.getApCt());
            myParameterSourceAry[i].addValue("apCu", wkDataFeedAirticketPrice01.getApCu());
            myParameterSourceAry[i].addValue("apCv", wkDataFeedAirticketPrice01.getApCv());
            myParameterSourceAry[i].addValue("apCw", wkDataFeedAirticketPrice01.getApCw());
            myParameterSourceAry[i].addValue("apCx", wkDataFeedAirticketPrice01.getApCx());
            myParameterSourceAry[i].addValue("apCy", wkDataFeedAirticketPrice01.getApCy());
            myParameterSourceAry[i].addValue("apCz", wkDataFeedAirticketPrice01.getApCz());
            myParameterSourceAry[i].addValue("apDa", wkDataFeedAirticketPrice01.getApDa());
            myParameterSourceAry[i].addValue("apDb", wkDataFeedAirticketPrice01.getApDb());
            myParameterSourceAry[i].addValue("apDc", wkDataFeedAirticketPrice01.getApDc());
            myParameterSourceAry[i].addValue("apDd", wkDataFeedAirticketPrice01.getApDd());
            myParameterSourceAry[i].addValue("apDe", wkDataFeedAirticketPrice01.getApDe());
            myParameterSourceAry[i].addValue("apDf", wkDataFeedAirticketPrice01.getApDf());
            myParameterSourceAry[i].addValue("apDg", wkDataFeedAirticketPrice01.getApDg());
            myParameterSourceAry[i].addValue("apDh", wkDataFeedAirticketPrice01.getApDh());
            myParameterSourceAry[i].addValue("apDi", wkDataFeedAirticketPrice01.getApDi());
            myParameterSourceAry[i].addValue("apDj", wkDataFeedAirticketPrice01.getApDj());
            myParameterSourceAry[i].addValue("apDk", wkDataFeedAirticketPrice01.getApDk());
            myParameterSourceAry[i].addValue("apDl", wkDataFeedAirticketPrice01.getApDl());
            myParameterSourceAry[i].addValue("apDm", wkDataFeedAirticketPrice01.getApDm());
            myParameterSourceAry[i].addValue("apDn", wkDataFeedAirticketPrice01.getApDn());
            myParameterSourceAry[i].addValue("apDo", wkDataFeedAirticketPrice01.getApDo());
            myParameterSourceAry[i].addValue("apDp", wkDataFeedAirticketPrice01.getApDp());
            myParameterSourceAry[i].addValue("apDq", wkDataFeedAirticketPrice01.getApDq());
            myParameterSourceAry[i].addValue("apDr", wkDataFeedAirticketPrice01.getApDr());
            myParameterSourceAry[i].addValue("apDs", wkDataFeedAirticketPrice01.getApDs());
            myParameterSourceAry[i].addValue("apDt", wkDataFeedAirticketPrice01.getApDt());
            myParameterSourceAry[i].addValue("apDu", wkDataFeedAirticketPrice01.getApDu());
            myParameterSourceAry[i].addValue("apDv", wkDataFeedAirticketPrice01.getApDv());
            myParameterSourceAry[i].addValue("apDw", wkDataFeedAirticketPrice01.getApDw());
            myParameterSourceAry[i].addValue("apDx", wkDataFeedAirticketPrice01.getApDx());
            myParameterSourceAry[i].addValue("apDy", wkDataFeedAirticketPrice01.getApDy());
            myParameterSourceAry[i].addValue("apDz", wkDataFeedAirticketPrice01.getApDz());
            myParameterSourceAry[i].addValue("apEa", wkDataFeedAirticketPrice01.getApEa());
            myParameterSourceAry[i].addValue("apEb", wkDataFeedAirticketPrice01.getApEb());
            myParameterSourceAry[i].addValue("apEc", wkDataFeedAirticketPrice01.getApEc());
            myParameterSourceAry[i].addValue("apEd", wkDataFeedAirticketPrice01.getApEd());
            myParameterSourceAry[i].addValue("apEe", wkDataFeedAirticketPrice01.getApEe());
            myParameterSourceAry[i].addValue("apEf", wkDataFeedAirticketPrice01.getApEf());
            myParameterSourceAry[i].addValue("apEg", wkDataFeedAirticketPrice01.getApEg());
            myParameterSourceAry[i].addValue("apEh", wkDataFeedAirticketPrice01.getApEh());
            myParameterSourceAry[i].addValue("apEi", wkDataFeedAirticketPrice01.getApEi());
            myParameterSourceAry[i].addValue("apEj", wkDataFeedAirticketPrice01.getApEj());
            myParameterSourceAry[i].addValue("apEk", wkDataFeedAirticketPrice01.getApEk());
            myParameterSourceAry[i].addValue("apEl", wkDataFeedAirticketPrice01.getApEl());
            myParameterSourceAry[i].addValue("apEm", wkDataFeedAirticketPrice01.getApEm());
            myParameterSourceAry[i].addValue("apEn", wkDataFeedAirticketPrice01.getApEn());
            myParameterSourceAry[i].addValue("apEo", wkDataFeedAirticketPrice01.getApEo());
            myParameterSourceAry[i].addValue("apEp", wkDataFeedAirticketPrice01.getApEp());
            myParameterSourceAry[i].addValue("apEq", wkDataFeedAirticketPrice01.getApEq());
            myParameterSourceAry[i].addValue("apEr", wkDataFeedAirticketPrice01.getApEr());
            myParameterSourceAry[i].addValue("apEs", wkDataFeedAirticketPrice01.getApEs());
            myParameterSourceAry[i].addValue("apEt", wkDataFeedAirticketPrice01.getApEt());
            myParameterSourceAry[i].addValue("apEu", wkDataFeedAirticketPrice01.getApEu());
            myParameterSourceAry[i].addValue("apEv", wkDataFeedAirticketPrice01.getApEv());
            myParameterSourceAry[i].addValue("apEw", wkDataFeedAirticketPrice01.getApEw());
            myParameterSourceAry[i].addValue("apEx", wkDataFeedAirticketPrice01.getApEx());
            myParameterSourceAry[i].addValue("apEy", wkDataFeedAirticketPrice01.getApEy());
            myParameterSourceAry[i].addValue("apEz", wkDataFeedAirticketPrice01.getApEz());
            myParameterSourceAry[i].addValue("apFa", wkDataFeedAirticketPrice01.getApFa());
            myParameterSourceAry[i].addValue("apFb", wkDataFeedAirticketPrice01.getApFb());
            myParameterSourceAry[i].addValue("apFc", wkDataFeedAirticketPrice01.getApFc());
            myParameterSourceAry[i].addValue("apFd", wkDataFeedAirticketPrice01.getApFd());
            myParameterSourceAry[i].addValue("apFe", wkDataFeedAirticketPrice01.getApFe());
            myParameterSourceAry[i].addValue("apFf", wkDataFeedAirticketPrice01.getApFf());
            myParameterSourceAry[i].addValue("apFg", wkDataFeedAirticketPrice01.getApFg());
            myParameterSourceAry[i].addValue("apFh", wkDataFeedAirticketPrice01.getApFh());
            myParameterSourceAry[i].addValue("apFi", wkDataFeedAirticketPrice01.getApFi());
            myParameterSourceAry[i].addValue("apFj", wkDataFeedAirticketPrice01.getApFj());
            myParameterSourceAry[i].addValue("apFk", wkDataFeedAirticketPrice01.getApFk());
            myParameterSourceAry[i].addValue("apFl", wkDataFeedAirticketPrice01.getApFl());
            myParameterSourceAry[i].addValue("apFm", wkDataFeedAirticketPrice01.getApFm());
            myParameterSourceAry[i].addValue("apFn", wkDataFeedAirticketPrice01.getApFn());
            myParameterSourceAry[i].addValue("apFo", wkDataFeedAirticketPrice01.getApFo());
            myParameterSourceAry[i].addValue("apFp", wkDataFeedAirticketPrice01.getApFp());
            myParameterSourceAry[i].addValue("apFq", wkDataFeedAirticketPrice01.getApFq());
            myParameterSourceAry[i].addValue("apFr", wkDataFeedAirticketPrice01.getApFr());
            myParameterSourceAry[i].addValue("apFs", wkDataFeedAirticketPrice01.getApFs());
            myParameterSourceAry[i].addValue("apFt", wkDataFeedAirticketPrice01.getApFt());
            myParameterSourceAry[i].addValue("apFu", wkDataFeedAirticketPrice01.getApFu());
            myParameterSourceAry[i].addValue("apFv", wkDataFeedAirticketPrice01.getApFv());
            myParameterSourceAry[i].addValue("apFw", wkDataFeedAirticketPrice01.getApFw());
            myParameterSourceAry[i].addValue("apFx", wkDataFeedAirticketPrice01.getApFx());
            myParameterSourceAry[i].addValue("apFy", wkDataFeedAirticketPrice01.getApFy());
            myParameterSourceAry[i].addValue("apFz", wkDataFeedAirticketPrice01.getApFz());
            myParameterSourceAry[i].addValue("apGa", wkDataFeedAirticketPrice01.getApGa());
            myParameterSourceAry[i].addValue("apGb", wkDataFeedAirticketPrice01.getApGb());
            myParameterSourceAry[i].addValue("apGc", wkDataFeedAirticketPrice01.getApGc());
            myParameterSourceAry[i].addValue("apGd", wkDataFeedAirticketPrice01.getApGd());
            myParameterSourceAry[i].addValue("apGe", wkDataFeedAirticketPrice01.getApGe());
            myParameterSourceAry[i].addValue("apGf", wkDataFeedAirticketPrice01.getApGf());
            myParameterSourceAry[i].addValue("apGg", wkDataFeedAirticketPrice01.getApGg());
            myParameterSourceAry[i].addValue("apGh", wkDataFeedAirticketPrice01.getApGh());
            myParameterSourceAry[i].addValue("apGi", wkDataFeedAirticketPrice01.getApGi());
            myParameterSourceAry[i].addValue("apGj", wkDataFeedAirticketPrice01.getApGj());
            myParameterSourceAry[i].addValue("apGk", wkDataFeedAirticketPrice01.getApGk());
            myParameterSourceAry[i].addValue("apGl", wkDataFeedAirticketPrice01.getApGl());
            myParameterSourceAry[i].addValue("apGm", wkDataFeedAirticketPrice01.getApGm());
            myParameterSourceAry[i].addValue("apGn", wkDataFeedAirticketPrice01.getApGn());
            myParameterSourceAry[i].addValue("apGo", wkDataFeedAirticketPrice01.getApGo());
            myParameterSourceAry[i].addValue("apGp", wkDataFeedAirticketPrice01.getApGp());
            myParameterSourceAry[i].addValue("apGq", wkDataFeedAirticketPrice01.getApGq());
            myParameterSourceAry[i].addValue("apGr", wkDataFeedAirticketPrice01.getApGr());
            myParameterSourceAry[i].addValue("apGs", wkDataFeedAirticketPrice01.getApGs());
            myParameterSourceAry[i].addValue("apGt", wkDataFeedAirticketPrice01.getApGt());
            myParameterSourceAry[i].addValue("apGu", wkDataFeedAirticketPrice01.getApGu());
            myParameterSourceAry[i].addValue("apGv", wkDataFeedAirticketPrice01.getApGv());
            myParameterSourceAry[i].addValue("apGw", wkDataFeedAirticketPrice01.getApGw());
            myParameterSourceAry[i].addValue("apGx", wkDataFeedAirticketPrice01.getApGx());
            myParameterSourceAry[i].addValue("apGy", wkDataFeedAirticketPrice01.getApGy());
            myParameterSourceAry[i].addValue("apGz", wkDataFeedAirticketPrice01.getApGz());
            myParameterSourceAry[i].addValue("apHa", wkDataFeedAirticketPrice01.getApHa());
            myParameterSourceAry[i].addValue("apHb", wkDataFeedAirticketPrice01.getApHb());
            myParameterSourceAry[i].addValue("apHc", wkDataFeedAirticketPrice01.getApHc());
            myParameterSourceAry[i].addValue("apHd", wkDataFeedAirticketPrice01.getApHd());
            myParameterSourceAry[i].addValue("apHe", wkDataFeedAirticketPrice01.getApHe());
            myParameterSourceAry[i].addValue("apHf", wkDataFeedAirticketPrice01.getApHf());
            myParameterSourceAry[i].addValue("apHg", wkDataFeedAirticketPrice01.getApHg());
            myParameterSourceAry[i].addValue("apHh", wkDataFeedAirticketPrice01.getApHh());
            myParameterSourceAry[i].addValue("apHi", wkDataFeedAirticketPrice01.getApHi());
            myParameterSourceAry[i].addValue("apHj", wkDataFeedAirticketPrice01.getApHj());
            myParameterSourceAry[i].addValue("apHk", wkDataFeedAirticketPrice01.getApHk());
            myParameterSourceAry[i].addValue("apHl", wkDataFeedAirticketPrice01.getApHl());
            myParameterSourceAry[i].addValue("apHm", wkDataFeedAirticketPrice01.getApHm());
            myParameterSourceAry[i].addValue("apHn", wkDataFeedAirticketPrice01.getApHn());
            myParameterSourceAry[i].addValue("apHo", wkDataFeedAirticketPrice01.getApHo());
            myParameterSourceAry[i].addValue("apHp", wkDataFeedAirticketPrice01.getApHp());
            myParameterSourceAry[i].addValue("apHq", wkDataFeedAirticketPrice01.getApHq());
            myParameterSourceAry[i].addValue("apHr", wkDataFeedAirticketPrice01.getApHr());
            myParameterSourceAry[i].addValue("apHs", wkDataFeedAirticketPrice01.getApHs());
            myParameterSourceAry[i].addValue("apHt", wkDataFeedAirticketPrice01.getApHt());
            myParameterSourceAry[i].addValue("apHu", wkDataFeedAirticketPrice01.getApHu());
            myParameterSourceAry[i].addValue("apHv", wkDataFeedAirticketPrice01.getApHv());
            myParameterSourceAry[i].addValue("apHw", wkDataFeedAirticketPrice01.getApHw());
            myParameterSourceAry[i].addValue("apHx", wkDataFeedAirticketPrice01.getApHx());
            myParameterSourceAry[i].addValue("apHy", wkDataFeedAirticketPrice01.getApHy());
            myParameterSourceAry[i].addValue("apHz", wkDataFeedAirticketPrice01.getApHz());
            myParameterSourceAry[i].addValue("apIa", wkDataFeedAirticketPrice01.getApIa());
            myParameterSourceAry[i].addValue("apIb", wkDataFeedAirticketPrice01.getApIb());
            myParameterSourceAry[i].addValue("apIc", wkDataFeedAirticketPrice01.getApIc());
            myParameterSourceAry[i].addValue("apId", wkDataFeedAirticketPrice01.getApId());
            myParameterSourceAry[i].addValue("apIe", wkDataFeedAirticketPrice01.getApIe());
            myParameterSourceAry[i].addValue("apIf", wkDataFeedAirticketPrice01.getApIf());
            myParameterSourceAry[i].addValue("apIg", wkDataFeedAirticketPrice01.getApIg());
            myParameterSourceAry[i].addValue("apIh", wkDataFeedAirticketPrice01.getApIh());
            myParameterSourceAry[i].addValue("apIi", wkDataFeedAirticketPrice01.getApIi());
            myParameterSourceAry[i].addValue("apIj", wkDataFeedAirticketPrice01.getApIj());
            myParameterSourceAry[i].addValue("apIk", wkDataFeedAirticketPrice01.getApIk());
            myParameterSourceAry[i].addValue("apIl", wkDataFeedAirticketPrice01.getApIl());
            myParameterSourceAry[i].addValue("apIm", wkDataFeedAirticketPrice01.getApIm());
            myParameterSourceAry[i].addValue("apIn", wkDataFeedAirticketPrice01.getApIn());
            myParameterSourceAry[i].addValue("apIo", wkDataFeedAirticketPrice01.getApIo());
            myParameterSourceAry[i].addValue("apIp", wkDataFeedAirticketPrice01.getApIp());
            myParameterSourceAry[i].addValue("apIq", wkDataFeedAirticketPrice01.getApIq());
            myParameterSourceAry[i].addValue("apIr", wkDataFeedAirticketPrice01.getApIr());
            myParameterSourceAry[i].addValue("apIs", wkDataFeedAirticketPrice01.getApIs());
            myParameterSourceAry[i].addValue("apIt", wkDataFeedAirticketPrice01.getApIt());
            myParameterSourceAry[i].addValue("apIu", wkDataFeedAirticketPrice01.getApIu());
            myParameterSourceAry[i].addValue("apIv", wkDataFeedAirticketPrice01.getApIv());
            myParameterSourceAry[i].addValue("apIw", wkDataFeedAirticketPrice01.getApIw());
            myParameterSourceAry[i].addValue("apIx", wkDataFeedAirticketPrice01.getApIx());
            myParameterSourceAry[i].addValue("apIy", wkDataFeedAirticketPrice01.getApIy());
            myParameterSourceAry[i].addValue("apIz", wkDataFeedAirticketPrice01.getApIz());
            myParameterSourceAry[i].addValue("apJa", wkDataFeedAirticketPrice01.getApJa());
            myParameterSourceAry[i].addValue("apJb", wkDataFeedAirticketPrice01.getApJb());
            myParameterSourceAry[i].addValue("apJc", wkDataFeedAirticketPrice01.getApJc());
            myParameterSourceAry[i].addValue("apJd", wkDataFeedAirticketPrice01.getApJd());
            myParameterSourceAry[i].addValue("apJe", wkDataFeedAirticketPrice01.getApJe());
            myParameterSourceAry[i].addValue("apJf", wkDataFeedAirticketPrice01.getApJf());
            myParameterSourceAry[i].addValue("apJg", wkDataFeedAirticketPrice01.getApJg());
            myParameterSourceAry[i].addValue("apJh", wkDataFeedAirticketPrice01.getApJh());
            myParameterSourceAry[i].addValue("apJi", wkDataFeedAirticketPrice01.getApJi());
            myParameterSourceAry[i].addValue("apJj", wkDataFeedAirticketPrice01.getApJj());
            myParameterSourceAry[i].addValue("apJk", wkDataFeedAirticketPrice01.getApJk());
            myParameterSourceAry[i].addValue("apJl", wkDataFeedAirticketPrice01.getApJl());
            myParameterSourceAry[i].addValue("apJm", wkDataFeedAirticketPrice01.getApJm());
            myParameterSourceAry[i].addValue("apJn", wkDataFeedAirticketPrice01.getApJn());
            myParameterSourceAry[i].addValue("apJo", wkDataFeedAirticketPrice01.getApJo());
            myParameterSourceAry[i].addValue("apJp", wkDataFeedAirticketPrice01.getApJp());
            myParameterSourceAry[i].addValue("apJq", wkDataFeedAirticketPrice01.getApJq());
            myParameterSourceAry[i].addValue("apJr", wkDataFeedAirticketPrice01.getApJr());
            myParameterSourceAry[i].addValue("apJs", wkDataFeedAirticketPrice01.getApJs());
            myParameterSourceAry[i].addValue("apJt", wkDataFeedAirticketPrice01.getApJt());
            myParameterSourceAry[i].addValue("apJu", wkDataFeedAirticketPrice01.getApJu());
            myParameterSourceAry[i].addValue("apJv", wkDataFeedAirticketPrice01.getApJv());
            myParameterSourceAry[i].addValue("apJw", wkDataFeedAirticketPrice01.getApJw());
            myParameterSourceAry[i].addValue("apJx", wkDataFeedAirticketPrice01.getApJx());
            myParameterSourceAry[i].addValue("apJy", wkDataFeedAirticketPrice01.getApJy());
            myParameterSourceAry[i].addValue("apJz", wkDataFeedAirticketPrice01.getApJz());
            myParameterSourceAry[i].addValue("apKa", wkDataFeedAirticketPrice01.getApKa());
            myParameterSourceAry[i].addValue("apKb", wkDataFeedAirticketPrice01.getApKb());
            myParameterSourceAry[i].addValue("apKc", wkDataFeedAirticketPrice01.getApKc());
            myParameterSourceAry[i].addValue("apKd", wkDataFeedAirticketPrice01.getApKd());
            myParameterSourceAry[i].addValue("apKe", wkDataFeedAirticketPrice01.getApKe());
            myParameterSourceAry[i].addValue("apKf", wkDataFeedAirticketPrice01.getApKf());
            myParameterSourceAry[i].addValue("apKg", wkDataFeedAirticketPrice01.getApKg());
            myParameterSourceAry[i].addValue("apKh", wkDataFeedAirticketPrice01.getApKh());
            myParameterSourceAry[i].addValue("apKi", wkDataFeedAirticketPrice01.getApKi());
            myParameterSourceAry[i].addValue("apKj", wkDataFeedAirticketPrice01.getApKj());
            myParameterSourceAry[i].addValue("apKk", wkDataFeedAirticketPrice01.getApKk());
            myParameterSourceAry[i].addValue("apKl", wkDataFeedAirticketPrice01.getApKl());
            myParameterSourceAry[i].addValue("apKm", wkDataFeedAirticketPrice01.getApKm());
            myParameterSourceAry[i].addValue("apKn", wkDataFeedAirticketPrice01.getApKn());
            myParameterSourceAry[i].addValue("apKo", wkDataFeedAirticketPrice01.getApKo());
            myParameterSourceAry[i].addValue("apKp", wkDataFeedAirticketPrice01.getApKp());
            myParameterSourceAry[i].addValue("apKq", wkDataFeedAirticketPrice01.getApKq());
            myParameterSourceAry[i].addValue("apKr", wkDataFeedAirticketPrice01.getApKr());
            myParameterSourceAry[i].addValue("apKs", wkDataFeedAirticketPrice01.getApKs());
            myParameterSourceAry[i].addValue("apKt", wkDataFeedAirticketPrice01.getApKt());
            myParameterSourceAry[i].addValue("apKu", wkDataFeedAirticketPrice01.getApKu());
            myParameterSourceAry[i].addValue("apKv", wkDataFeedAirticketPrice01.getApKv());
            myParameterSourceAry[i].addValue("apKw", wkDataFeedAirticketPrice01.getApKw());
            myParameterSourceAry[i].addValue("apKx", wkDataFeedAirticketPrice01.getApKx());
            myParameterSourceAry[i].addValue("apKy", wkDataFeedAirticketPrice01.getApKy());
            myParameterSourceAry[i].addValue("apKz", wkDataFeedAirticketPrice01.getApKz());
            myParameterSourceAry[i].addValue("apLa", wkDataFeedAirticketPrice01.getApLa());
            myParameterSourceAry[i].addValue("apLb", wkDataFeedAirticketPrice01.getApLb());
            myParameterSourceAry[i].addValue("apLc", wkDataFeedAirticketPrice01.getApLc());
            myParameterSourceAry[i].addValue("apLd", wkDataFeedAirticketPrice01.getApLd());
            myParameterSourceAry[i].addValue("apLe", wkDataFeedAirticketPrice01.getApLe());
            myParameterSourceAry[i].addValue("apLf", wkDataFeedAirticketPrice01.getApLf());
            myParameterSourceAry[i].addValue("apLg", wkDataFeedAirticketPrice01.getApLg());
            myParameterSourceAry[i].addValue("apLh", wkDataFeedAirticketPrice01.getApLh());
            myParameterSourceAry[i].addValue("apLi", wkDataFeedAirticketPrice01.getApLi());
            myParameterSourceAry[i].addValue("apLj", wkDataFeedAirticketPrice01.getApLj());
            myParameterSourceAry[i].addValue("apLk", wkDataFeedAirticketPrice01.getApLk());
            myParameterSourceAry[i].addValue("apLl", wkDataFeedAirticketPrice01.getApLl());
            myParameterSourceAry[i].addValue("apLm", wkDataFeedAirticketPrice01.getApLm());
            myParameterSourceAry[i].addValue("apLn", wkDataFeedAirticketPrice01.getApLn());
            myParameterSourceAry[i].addValue("apLo", wkDataFeedAirticketPrice01.getApLo());
            myParameterSourceAry[i].addValue("apLp", wkDataFeedAirticketPrice01.getApLp());
            myParameterSourceAry[i].addValue("apLq", wkDataFeedAirticketPrice01.getApLq());
            myParameterSourceAry[i].addValue("apLr", wkDataFeedAirticketPrice01.getApLr());
            myParameterSourceAry[i].addValue("apLs", wkDataFeedAirticketPrice01.getApLs());
            myParameterSourceAry[i].addValue("apLt", wkDataFeedAirticketPrice01.getApLt());
            myParameterSourceAry[i].addValue("apLu", wkDataFeedAirticketPrice01.getApLu());
            myParameterSourceAry[i].addValue("apLv", wkDataFeedAirticketPrice01.getApLv());
            myParameterSourceAry[i].addValue("apLw", wkDataFeedAirticketPrice01.getApLw());
            myParameterSourceAry[i].addValue("apLx", wkDataFeedAirticketPrice01.getApLx());
            myParameterSourceAry[i].addValue("apLy", wkDataFeedAirticketPrice01.getApLy());
            myParameterSourceAry[i].addValue("apLz", wkDataFeedAirticketPrice01.getApLz());
            myParameterSourceAry[i].addValue("apMa", wkDataFeedAirticketPrice01.getApMa());
            myParameterSourceAry[i].addValue("apMb", wkDataFeedAirticketPrice01.getApMb());
            myParameterSourceAry[i].addValue("apMc", wkDataFeedAirticketPrice01.getApMc());
            myParameterSourceAry[i].addValue("apMd", wkDataFeedAirticketPrice01.getApMd());
            myParameterSourceAry[i].addValue("apMe", wkDataFeedAirticketPrice01.getApMe());
            myParameterSourceAry[i].addValue("apMf", wkDataFeedAirticketPrice01.getApMf());
            myParameterSourceAry[i].addValue("apMg", wkDataFeedAirticketPrice01.getApMg());
            myParameterSourceAry[i].addValue("apMh", wkDataFeedAirticketPrice01.getApMh());
            myParameterSourceAry[i].addValue("apMi", wkDataFeedAirticketPrice01.getApMi());
            myParameterSourceAry[i].addValue("apMj", wkDataFeedAirticketPrice01.getApMj());
            myParameterSourceAry[i].addValue("apMk", wkDataFeedAirticketPrice01.getApMk());
            myParameterSourceAry[i].addValue("apMl", wkDataFeedAirticketPrice01.getApMl());
            myParameterSourceAry[i].addValue("apMm", wkDataFeedAirticketPrice01.getApMm());
            myParameterSourceAry[i].addValue("apMn", wkDataFeedAirticketPrice01.getApMn());
            myParameterSourceAry[i].addValue("apMo", wkDataFeedAirticketPrice01.getApMo());
            myParameterSourceAry[i].addValue("apMp", wkDataFeedAirticketPrice01.getApMp());
            myParameterSourceAry[i].addValue("apMq", wkDataFeedAirticketPrice01.getApMq());
            myParameterSourceAry[i].addValue("apMr", wkDataFeedAirticketPrice01.getApMr());
            myParameterSourceAry[i].addValue("apMs", wkDataFeedAirticketPrice01.getApMs());
            myParameterSourceAry[i].addValue("apMt", wkDataFeedAirticketPrice01.getApMt());
            myParameterSourceAry[i].addValue("apMu", wkDataFeedAirticketPrice01.getApMu());
            myParameterSourceAry[i].addValue("apMv", wkDataFeedAirticketPrice01.getApMv());
            myParameterSourceAry[i].addValue("apMw", wkDataFeedAirticketPrice01.getApMw());
            myParameterSourceAry[i].addValue("apMx", wkDataFeedAirticketPrice01.getApMx());
            myParameterSourceAry[i].addValue("apMy", wkDataFeedAirticketPrice01.getApMy());
            myParameterSourceAry[i].addValue("apMz", wkDataFeedAirticketPrice01.getApMz());
        }

        myNamedParameterJdbcTemplate.batchUpdate(mySql, myParameterSourceAry);
    }

    @Override
    public void deleteDataFeedAirticketPrice01sByFileNo(Integer fileNo) {
        String mySql = "DELETE FROM db_airticket.data_feed_airticket_price_01 " +
                " WHERE file_no = :fileNo ";

        Map<String,Object> myMap = new HashMap<>();
        myMap.put("fileNo", fileNo);

        myNamedParameterJdbcTemplate.update(mySql, myMap);
    }
}
