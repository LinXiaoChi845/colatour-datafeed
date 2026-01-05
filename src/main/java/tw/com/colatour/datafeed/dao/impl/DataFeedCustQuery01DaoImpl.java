package tw.com.colatour.datafeed.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Component;
import tw.com.colatour.datafeed.dao.DataFeedCustQuery01Dao;
import tw.com.colatour.datafeed.model.DataFeedCustQuery01;

import java.util.HashMap;
import java.util.Map;

@Component
public class DataFeedCustQuery01DaoImpl implements DataFeedCustQuery01Dao {

    @Autowired
    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    @Override
    public void createDataFeedCustQuery01(DataFeedCustQuery01 dataFeedCustQuery01) {
        String mySql = "INSERT INTO data_feed.data_feed_cust_query_01 ( " +
                " file_no, cq_a, cq_b, cq_c, cq_d, cq_e, cq_f, cq_g, cq_h, cq_i, cq_j, cq_k, cq_l, cq_m, " +
                " cq_n, cq_o, cq_p, cq_q, cq_r, cq_s, cq_t, cq_u, cq_v, cq_w, cq_x, cq_y, cq_z, " +
                " cq_aa, cq_ab, cq_ac, cq_ad, cq_ae, cq_af, cq_ag, cq_ah, cq_ai, cq_aj, cq_ak, cq_al, cq_am, " +
                " cq_an, cq_ao, cq_ap, cq_aq, cq_ar, cq_as, cq_at, cq_au, cq_av, cq_aw, cq_ax, cq_ay, cq_az, " +
                " cq_ba, cq_bb, cq_bc, cq_bd, cq_be, cq_bf, cq_bg, cq_bh, cq_bi, cq_bj, cq_bk, cq_bl, cq_bm, " +
                " cq_bn, cq_bo, cq_bp, cq_bq, cq_br, cq_bs, cq_bt, cq_bu, cq_bv, cq_bw, cq_bx, cq_by, cq_bz, " +
                " cq_ca, cq_cb, cq_cc, cq_cd, cq_ce, cq_cf, cq_cg, cq_ch, cq_ci, cq_cj, cq_ck, cq_cl, cq_cm, " +
                " cq_cn, cq_co, cq_cp, cq_cq, cq_cr, cq_cs, cq_ct, cq_cu, cq_cv, cq_cw, cq_cx, cq_cy, cq_cz, " +
                " cq_da, cq_db, cq_dc, cq_dd, cq_de, cq_df, cq_dg, cq_dh, cq_di, cq_dj, cq_dk, cq_dl, cq_dm, " +
                " cq_dn, cq_do, cq_dp, cq_dq, cq_dr, cq_ds, cq_dt, cq_du, cq_dv, cq_dw, cq_dx, cq_dy, cq_dz, " +
                " cq_ea, cq_eb, cq_ec, cq_ed, cq_ee, cq_ef, cq_eg, cq_eh, cq_ei, cq_ej, cq_ek, cq_el, cq_em, " +
                " cq_en, cq_eo, cq_ep, cq_eq, cq_er, cq_es, cq_et, cq_eu, cq_ev, cq_ew, cq_ex, cq_ey, cq_ez, " +
                " cq_fa, cq_fb, cq_fc, cq_fd, cq_fe, cq_ff, cq_fg, cq_fh, cq_fi, cq_fj, cq_fk, cq_fl, cq_fm, " +
                " cq_fn, cq_fo, cq_fp, cq_fq, cq_fr, cq_fs, cq_ft, cq_fu, cq_fv, cq_fw, cq_fx, cq_fy, cq_fz, " +
                " cq_ga, cq_gb, cq_gc, cq_gd, cq_ge, cq_gf, cq_gg, cq_gh, cq_gi, cq_gj, cq_gk, cq_gl, cq_gm, " +
                " cq_gn, cq_go, cq_gp, cq_gq, cq_gr, cq_gs, cq_gt, cq_gu, cq_gv, cq_gw, cq_gx, cq_gy, cq_gz, " +
                " cq_ha, cq_hb, cq_hc, cq_hd, cq_he, cq_hf, cq_hg, cq_hh, cq_hi, cq_hj, cq_hk, cq_hl, cq_hm, " +
                " cq_hn, cq_ho, cq_hp, cq_hq, cq_hr, cq_hs, cq_ht, cq_hu, cq_hv, cq_hw, cq_hx, cq_hy, cq_hz, " +
                " cq_ia, cq_ib, cq_ic, cq_id, cq_ie, cq_if, cq_ig, cq_ih, cq_ii, cq_ij, cq_ik, cq_il, cq_im, " +
                " cq_in, cq_io, cq_ip, cq_iq, cq_ir, cq_is, cq_it, cq_iu, cq_iv, cq_iw, cq_ix, cq_iy, cq_iz, " +
                " cq_ja, cq_jb, cq_jc, cq_jd, cq_je, cq_jf, cq_jg, cq_jh, cq_ji, cq_jj, cq_jk, cq_jl, cq_jm, " +
                " cq_jn, cq_jo, cq_jp, cq_jq, cq_jr, cq_js, cq_jt, cq_ju, cq_jv, cq_jw, cq_jx, cq_jy, cq_jz, " +
                " cq_ka, cq_kb, cq_kc, cq_kd, cq_ke, cq_kf, cq_kg, cq_kh, cq_ki, cq_kj, cq_kk, cq_kl, cq_km, " +
                " cq_kn, cq_ko, cq_kp, cq_kq, cq_kr, cq_ks, cq_kt, cq_ku, cq_kv, cq_kw, cq_kx, cq_ky, cq_kz, " +
                " cq_la, cq_lb, cq_lc, cq_ld, cq_le, cq_lf, cq_lg, cq_lh, cq_li, cq_lj, cq_lk, cq_ll, cq_lm, " +
                " cq_ln, cq_lo, cq_lp, cq_lq, cq_lr, cq_ls, cq_lt, cq_lu, cq_lv, cq_lw, cq_lx, cq_ly, cq_lz, " +
                " cq_ma, cq_mb, cq_mc, cq_md, cq_me, cq_mf, cq_mg, cq_mh, cq_mi, cq_mj, cq_mk, cq_ml, cq_mm, " +
                " cq_mn, cq_mo, cq_mp, cq_mq, cq_mr, cq_ms, cq_mt, cq_mu, cq_mv, cq_mw, cq_mx, cq_my, cq_mz ) " +
                " VALUES ( " +
                " :fileNo, :cqA, :cqB, :cqC, :cqD, :cqE, :cqF, :cqG, :cqH, :cqI, :cqJ, :cqK, :cqL, :cqM, " +
                " :cqN, :cqO, :cqP, :cqQ, :cqR, :cqS, :cqT, :cqU, :cqV, :cqW, :cqX, :cqY, :cqZ, " +
                " :cqAa, :cqAb, :cqAc, :cqAd, :cqAe, :cqAf, :cqAg, :cqAh, :cqAi, :cqAj, :cqAk, :cqAl, :cqAm, " +
                " :cqAn, :cqAo, :cqAp, :cqAq, :cqAr, :cqAs, :cqAt, :cqAu, :cqAv, :cqAw, :cqAx, :cqAy, :cqAz, " +
                " :cqBa, :cqBb, :cqBc, :cqBd, :cqBe, :cqBf, :cqBg, :cqBh, :cqBi, :cqBj, :cqBk, :cqBl, :cqBm, " +
                " :cqBn, :cqBo, :cqBp, :cqBq, :cqBr, :cqBs, :cqBt, :cqBu, :cqBv, :cqBw, :cqBx, :cqBy, :cqBz, " +
                " :cqCa, :cqCb, :cqCc, :cqCd, :cqCe, :cqCf, :cqCg, :cqCh, :cqCi, :cqCj, :cqCk, :cqCl, :cqCm, " +
                " :cqCn, :cqCo, :cqCp, :cqCq, :cqCr, :cqCs, :cqCt, :cqCu, :cqCv, :cqCw, :cqCx, :cqCy, :cqCz, " +
                " :cqDa, :cqDb, :cqDc, :cqDd, :cqDe, :cqDf, :cqDg, :cqDh, :cqDi, :cqDj, :cqDk, :cqDl, :cqDm, " +
                " :cqDn, :cqDo, :cqDp, :cqDq, :cqDr, :cqDs, :cqDt, :cqDu, :cqDv, :cqDw, :cqDx, :cqDy, :cqDz, " +
                " :cqEa, :cqEb, :cqEc, :cqEd, :cqEe, :cqEf, :cqEg, :cqEh, :cqEi, :cqEj, :cqEk, :cqEl, :cqEm, " +
                " :cqEn, :cqEo, :cqEp, :cqEq, :cqEr, :cqEs, :cqEt, :cqEu, :cqEv, :cqEw, :cqEx, :cqEy, :cqEz, " +
                " :cqFa, :cqFb, :cqFc, :cqFd, :cqFe, :cqFf, :cqFg, :cqFh, :cqFi, :cqFj, :cqFk, :cqFl, :cqFm, " +
                " :cqFn, :cqFo, :cqFp, :cqFq, :cqFr, :cqFs, :cqFt, :cqFu, :cqFv, :cqFw, :cqFx, :cqFy, :cqFz, " +
                " :cqGa, :cqGb, :cqGc, :cqGd, :cqGe, :cqGf, :cqGg, :cqGh, :cqGi, :cqGj, :cqGk, :cqGl, :cqGm, " +
                " :cqGn, :cqGo, :cqGp, :cqGq, :cqGr, :cqGs, :cqGt, :cqGu, :cqGv, :cqGw, :cqGx, :cqGy, :cqGz, " +
                " :cqHa, :cqHb, :cqHc, :cqHd, :cqHe, :cqHf, :cqHg, :cqHh, :cqHi, :cqHj, :cqHk, :cqHl, :cqHm, " +
                " :cqHn, :cqHo, :cqHp, :cqHq, :cqHr, :cqHs, :cqHt, :cqHu, :cqHv, :cqHw, :cqHx, :cqHy, :cqHz, " +
                " :cqIa, :cqIb, :cqIc, :cqId, :cqIe, :cqIf, :cqIg, :cqIh, :cqIi, :cqIj, :cqIk, :cqIl, :cqIm, " +
                " :cqIn, :cqIo, :cqIp, :cqIq, :cqIr, :cqIs, :cqIt, :cqIu, :cqIv, :cqIw, :cqIx, :cqIy, :cqIz, " +
                " :cqJa, :cqJb, :cqJc, :cqJd, :cqJe, :cqJf, :cqJg, :cqJh, :cqJi, :cqJj, :cqJk, :cqJl, :cqJm, " +
                " :cqJn, :cqJo, :cqJp, :cqJq, :cqJr, :cqJs, :cqJt, :cqJu, :cqJv, :cqJw, :cqJx, :cqJy, :cqJz, " +
                " :cqKa, :cqKb, :cqKc, :cqKd, :cqKe, :cqKf, :cqKg, :cqKh, :cqKi, :cqKj, :cqKk, :cqKl, :cqKm, " +
                " :cqKn, :cqKo, :cqKp, :cqKq, :cqKr, :cqKs, :cqKt, :cqKu, :cqKv, :cqKw, :cqKx, :cqKy, :cqKz, " +
                " :cqLa, :cqLb, :cqLc, :cqLd, :cqLe, :cqLf, :cqLg, :cqLh, :cqLi, :cqLj, :cqLk, :cqLl, :cqLm, " +
                " :cqLn, :cqLo, :cqLp, :cqLq, :cqLr, :cqLs, :cqLt, :cqLu, :cqLv, :cqLw, :cqLx, :cqLy, :cqLz, " +
                " :cqMa, :cqMb, :cqMc, :cqMd, :cqMe, :cqMf, :cqMg, :cqMh, :cqMi, :cqMj, :cqMk, :cqMl, :cqMm, " +
                " :cqMn, :cqMo, :cqMp, :cqMq, :cqMr, :cqMs, :cqMt, :cqMu, :cqMv, :cqMw, :cqMx, :cqMy, :cqMz ) ";

        Map<String, Object> myMap = new HashMap<>();

        myMap.put("fileNo", dataFeedCustQuery01.getFileNo());
        myMap.put("cqA", dataFeedCustQuery01.getCqA());
        myMap.put("cqB", dataFeedCustQuery01.getCqB());
        myMap.put("cqC", dataFeedCustQuery01.getCqC());
        myMap.put("cqD", dataFeedCustQuery01.getCqD());
        myMap.put("cqE", dataFeedCustQuery01.getCqE());
        myMap.put("cqF", dataFeedCustQuery01.getCqF());
        myMap.put("cqG", dataFeedCustQuery01.getCqG());
        myMap.put("cqH", dataFeedCustQuery01.getCqH());
        myMap.put("cqI", dataFeedCustQuery01.getCqI());
        myMap.put("cqJ", dataFeedCustQuery01.getCqJ());
        myMap.put("cqK", dataFeedCustQuery01.getCqK());
        myMap.put("cqL", dataFeedCustQuery01.getCqL());
        myMap.put("cqM", dataFeedCustQuery01.getCqM());
        myMap.put("cqN", dataFeedCustQuery01.getCqN());
        myMap.put("cqO", dataFeedCustQuery01.getCqO());
        myMap.put("cqP", dataFeedCustQuery01.getCqP());
        myMap.put("cqQ", dataFeedCustQuery01.getCqQ());
        myMap.put("cqR", dataFeedCustQuery01.getCqR());
        myMap.put("cqS", dataFeedCustQuery01.getCqS());
        myMap.put("cqT", dataFeedCustQuery01.getCqT());
        myMap.put("cqU", dataFeedCustQuery01.getCqU());
        myMap.put("cqV", dataFeedCustQuery01.getCqV());
        myMap.put("cqW", dataFeedCustQuery01.getCqW());
        myMap.put("cqX", dataFeedCustQuery01.getCqX());
        myMap.put("cqY", dataFeedCustQuery01.getCqY());
        myMap.put("cqZ", dataFeedCustQuery01.getCqZ());
        myMap.put("cqAa", dataFeedCustQuery01.getCqAa());
        myMap.put("cqAb", dataFeedCustQuery01.getCqAb());
        myMap.put("cqAc", dataFeedCustQuery01.getCqAc());
        myMap.put("cqAd", dataFeedCustQuery01.getCqAd());
        myMap.put("cqAe", dataFeedCustQuery01.getCqAe());
        myMap.put("cqAf", dataFeedCustQuery01.getCqAf());
        myMap.put("cqAg", dataFeedCustQuery01.getCqAg());
        myMap.put("cqAh", dataFeedCustQuery01.getCqAh());
        myMap.put("cqAi", dataFeedCustQuery01.getCqAi());
        myMap.put("cqAj", dataFeedCustQuery01.getCqAj());
        myMap.put("cqAk", dataFeedCustQuery01.getCqAk());
        myMap.put("cqAl", dataFeedCustQuery01.getCqAl());
        myMap.put("cqAm", dataFeedCustQuery01.getCqAm());
        myMap.put("cqAn", dataFeedCustQuery01.getCqAn());
        myMap.put("cqAo", dataFeedCustQuery01.getCqAo());
        myMap.put("cqAp", dataFeedCustQuery01.getCqAp());
        myMap.put("cqAq", dataFeedCustQuery01.getCqAq());
        myMap.put("cqAr", dataFeedCustQuery01.getCqAr());
        myMap.put("cqAs", dataFeedCustQuery01.getCqAs());
        myMap.put("cqAt", dataFeedCustQuery01.getCqAt());
        myMap.put("cqAu", dataFeedCustQuery01.getCqAu());
        myMap.put("cqAv", dataFeedCustQuery01.getCqAv());
        myMap.put("cqAw", dataFeedCustQuery01.getCqAw());
        myMap.put("cqAx", dataFeedCustQuery01.getCqAx());
        myMap.put("cqAy", dataFeedCustQuery01.getCqAy());
        myMap.put("cqAz", dataFeedCustQuery01.getCqAz());
        myMap.put("cqBa", dataFeedCustQuery01.getCqBa());
        myMap.put("cqBb", dataFeedCustQuery01.getCqBb());
        myMap.put("cqBc", dataFeedCustQuery01.getCqBc());
        myMap.put("cqBd", dataFeedCustQuery01.getCqBd());
        myMap.put("cqBe", dataFeedCustQuery01.getCqBe());
        myMap.put("cqBf", dataFeedCustQuery01.getCqBf());
        myMap.put("cqBg", dataFeedCustQuery01.getCqBg());
        myMap.put("cqBh", dataFeedCustQuery01.getCqBh());
        myMap.put("cqBi", dataFeedCustQuery01.getCqBi());
        myMap.put("cqBj", dataFeedCustQuery01.getCqBj());
        myMap.put("cqBk", dataFeedCustQuery01.getCqBk());
        myMap.put("cqBl", dataFeedCustQuery01.getCqBl());
        myMap.put("cqBm", dataFeedCustQuery01.getCqBm());
        myMap.put("cqBn", dataFeedCustQuery01.getCqBn());
        myMap.put("cqBo", dataFeedCustQuery01.getCqBo());
        myMap.put("cqBp", dataFeedCustQuery01.getCqBp());
        myMap.put("cqBq", dataFeedCustQuery01.getCqBq());
        myMap.put("cqBr", dataFeedCustQuery01.getCqBr());
        myMap.put("cqBs", dataFeedCustQuery01.getCqBs());
        myMap.put("cqBt", dataFeedCustQuery01.getCqBt());
        myMap.put("cqBu", dataFeedCustQuery01.getCqBu());
        myMap.put("cqBv", dataFeedCustQuery01.getCqBv());
        myMap.put("cqBw", dataFeedCustQuery01.getCqBw());
        myMap.put("cqBx", dataFeedCustQuery01.getCqBx());
        myMap.put("cqBy", dataFeedCustQuery01.getCqBy());
        myMap.put("cqBz", dataFeedCustQuery01.getCqBz());
        myMap.put("cqCa", dataFeedCustQuery01.getCqCa());
        myMap.put("cqCb", dataFeedCustQuery01.getCqCb());
        myMap.put("cqCc", dataFeedCustQuery01.getCqCc());
        myMap.put("cqCd", dataFeedCustQuery01.getCqCd());
        myMap.put("cqCe", dataFeedCustQuery01.getCqCe());
        myMap.put("cqCf", dataFeedCustQuery01.getCqCf());
        myMap.put("cqCg", dataFeedCustQuery01.getCqCg());
        myMap.put("cqCh", dataFeedCustQuery01.getCqCh());
        myMap.put("cqCi", dataFeedCustQuery01.getCqCi());
        myMap.put("cqCj", dataFeedCustQuery01.getCqCj());
        myMap.put("cqCk", dataFeedCustQuery01.getCqCk());
        myMap.put("cqCl", dataFeedCustQuery01.getCqCl());
        myMap.put("cqCm", dataFeedCustQuery01.getCqCm());
        myMap.put("cqCn", dataFeedCustQuery01.getCqCn());
        myMap.put("cqCo", dataFeedCustQuery01.getCqCo());
        myMap.put("cqCp", dataFeedCustQuery01.getCqCp());
        myMap.put("cqCq", dataFeedCustQuery01.getCqCq());
        myMap.put("cqCr", dataFeedCustQuery01.getCqCr());
        myMap.put("cqCs", dataFeedCustQuery01.getCqCs());
        myMap.put("cqCt", dataFeedCustQuery01.getCqCt());
        myMap.put("cqCu", dataFeedCustQuery01.getCqCu());
        myMap.put("cqCv", dataFeedCustQuery01.getCqCv());
        myMap.put("cqCw", dataFeedCustQuery01.getCqCw());
        myMap.put("cqCx", dataFeedCustQuery01.getCqCx());
        myMap.put("cqCy", dataFeedCustQuery01.getCqCy());
        myMap.put("cqCz", dataFeedCustQuery01.getCqCz());
        myMap.put("cqDa", dataFeedCustQuery01.getCqDa());
        myMap.put("cqDb", dataFeedCustQuery01.getCqDb());
        myMap.put("cqDc", dataFeedCustQuery01.getCqDc());
        myMap.put("cqDd", dataFeedCustQuery01.getCqDd());
        myMap.put("cqDe", dataFeedCustQuery01.getCqDe());
        myMap.put("cqDf", dataFeedCustQuery01.getCqDf());
        myMap.put("cqDg", dataFeedCustQuery01.getCqDg());
        myMap.put("cqDh", dataFeedCustQuery01.getCqDh());
        myMap.put("cqDi", dataFeedCustQuery01.getCqDi());
        myMap.put("cqDj", dataFeedCustQuery01.getCqDj());
        myMap.put("cqDk", dataFeedCustQuery01.getCqDk());
        myMap.put("cqDl", dataFeedCustQuery01.getCqDl());
        myMap.put("cqDm", dataFeedCustQuery01.getCqDm());
        myMap.put("cqDn", dataFeedCustQuery01.getCqDn());
        myMap.put("cqDo", dataFeedCustQuery01.getCqDo());
        myMap.put("cqDp", dataFeedCustQuery01.getCqDp());
        myMap.put("cqDq", dataFeedCustQuery01.getCqDq());
        myMap.put("cqDr", dataFeedCustQuery01.getCqDr());
        myMap.put("cqDs", dataFeedCustQuery01.getCqDs());
        myMap.put("cqDt", dataFeedCustQuery01.getCqDt());
        myMap.put("cqDu", dataFeedCustQuery01.getCqDu());
        myMap.put("cqDv", dataFeedCustQuery01.getCqDv());
        myMap.put("cqDw", dataFeedCustQuery01.getCqDw());
        myMap.put("cqDx", dataFeedCustQuery01.getCqDx());
        myMap.put("cqDy", dataFeedCustQuery01.getCqDy());
        myMap.put("cqDz", dataFeedCustQuery01.getCqDz());
        myMap.put("cqEa", dataFeedCustQuery01.getCqEa());
        myMap.put("cqEb", dataFeedCustQuery01.getCqEb());
        myMap.put("cqEc", dataFeedCustQuery01.getCqEc());
        myMap.put("cqEd", dataFeedCustQuery01.getCqEd());
        myMap.put("cqEe", dataFeedCustQuery01.getCqEe());
        myMap.put("cqEf", dataFeedCustQuery01.getCqEf());
        myMap.put("cqEg", dataFeedCustQuery01.getCqEg());
        myMap.put("cqEh", dataFeedCustQuery01.getCqEh());
        myMap.put("cqEi", dataFeedCustQuery01.getCqEi());
        myMap.put("cqEj", dataFeedCustQuery01.getCqEj());
        myMap.put("cqEk", dataFeedCustQuery01.getCqEk());
        myMap.put("cqEl", dataFeedCustQuery01.getCqEl());
        myMap.put("cqEm", dataFeedCustQuery01.getCqEm());
        myMap.put("cqEn", dataFeedCustQuery01.getCqEn());
        myMap.put("cqEo", dataFeedCustQuery01.getCqEo());
        myMap.put("cqEp", dataFeedCustQuery01.getCqEp());
        myMap.put("cqEq", dataFeedCustQuery01.getCqEq());
        myMap.put("cqEr", dataFeedCustQuery01.getCqEr());
        myMap.put("cqEs", dataFeedCustQuery01.getCqEs());
        myMap.put("cqEt", dataFeedCustQuery01.getCqEt());
        myMap.put("cqEu", dataFeedCustQuery01.getCqEu());
        myMap.put("cqEv", dataFeedCustQuery01.getCqEv());
        myMap.put("cqEw", dataFeedCustQuery01.getCqEw());
        myMap.put("cqEx", dataFeedCustQuery01.getCqEx());
        myMap.put("cqEy", dataFeedCustQuery01.getCqEy());
        myMap.put("cqEz", dataFeedCustQuery01.getCqEz());
        myMap.put("cqFa", dataFeedCustQuery01.getCqFa());
        myMap.put("cqFb", dataFeedCustQuery01.getCqFb());
        myMap.put("cqFc", dataFeedCustQuery01.getCqFc());
        myMap.put("cqFd", dataFeedCustQuery01.getCqFd());
        myMap.put("cqFe", dataFeedCustQuery01.getCqFe());
        myMap.put("cqFf", dataFeedCustQuery01.getCqFf());
        myMap.put("cqFg", dataFeedCustQuery01.getCqFg());
        myMap.put("cqFh", dataFeedCustQuery01.getCqFh());
        myMap.put("cqFi", dataFeedCustQuery01.getCqFi());
        myMap.put("cqFj", dataFeedCustQuery01.getCqFj());
        myMap.put("cqFk", dataFeedCustQuery01.getCqFk());
        myMap.put("cqFl", dataFeedCustQuery01.getCqFl());
        myMap.put("cqFm", dataFeedCustQuery01.getCqFm());
        myMap.put("cqFn", dataFeedCustQuery01.getCqFn());
        myMap.put("cqFo", dataFeedCustQuery01.getCqFo());
        myMap.put("cqFp", dataFeedCustQuery01.getCqFp());
        myMap.put("cqFq", dataFeedCustQuery01.getCqFq());
        myMap.put("cqFr", dataFeedCustQuery01.getCqFr());
        myMap.put("cqFs", dataFeedCustQuery01.getCqFs());
        myMap.put("cqFt", dataFeedCustQuery01.getCqFt());
        myMap.put("cqFu", dataFeedCustQuery01.getCqFu());
        myMap.put("cqFv", dataFeedCustQuery01.getCqFv());
        myMap.put("cqFw", dataFeedCustQuery01.getCqFw());
        myMap.put("cqFx", dataFeedCustQuery01.getCqFx());
        myMap.put("cqFy", dataFeedCustQuery01.getCqFy());
        myMap.put("cqFz", dataFeedCustQuery01.getCqFz());
        myMap.put("cqGa", dataFeedCustQuery01.getCqGa());
        myMap.put("cqGb", dataFeedCustQuery01.getCqGb());
        myMap.put("cqGc", dataFeedCustQuery01.getCqGc());
        myMap.put("cqGd", dataFeedCustQuery01.getCqGd());
        myMap.put("cqGe", dataFeedCustQuery01.getCqGe());
        myMap.put("cqGf", dataFeedCustQuery01.getCqGf());
        myMap.put("cqGg", dataFeedCustQuery01.getCqGg());
        myMap.put("cqGh", dataFeedCustQuery01.getCqGh());
        myMap.put("cqGi", dataFeedCustQuery01.getCqGi());
        myMap.put("cqGj", dataFeedCustQuery01.getCqGj());
        myMap.put("cqGk", dataFeedCustQuery01.getCqGk());
        myMap.put("cqGl", dataFeedCustQuery01.getCqGl());
        myMap.put("cqGm", dataFeedCustQuery01.getCqGm());
        myMap.put("cqGn", dataFeedCustQuery01.getCqGn());
        myMap.put("cqGo", dataFeedCustQuery01.getCqGo());
        myMap.put("cqGp", dataFeedCustQuery01.getCqGp());
        myMap.put("cqGq", dataFeedCustQuery01.getCqGq());
        myMap.put("cqGr", dataFeedCustQuery01.getCqGr());
        myMap.put("cqGs", dataFeedCustQuery01.getCqGs());
        myMap.put("cqGt", dataFeedCustQuery01.getCqGt());
        myMap.put("cqGu", dataFeedCustQuery01.getCqGu());
        myMap.put("cqGv", dataFeedCustQuery01.getCqGv());
        myMap.put("cqGw", dataFeedCustQuery01.getCqGw());
        myMap.put("cqGx", dataFeedCustQuery01.getCqGx());
        myMap.put("cqGy", dataFeedCustQuery01.getCqGy());
        myMap.put("cqGz", dataFeedCustQuery01.getCqGz());
        myMap.put("cqHa", dataFeedCustQuery01.getCqHa());
        myMap.put("cqHb", dataFeedCustQuery01.getCqHb());
        myMap.put("cqHc", dataFeedCustQuery01.getCqHc());
        myMap.put("cqHd", dataFeedCustQuery01.getCqHd());
        myMap.put("cqHe", dataFeedCustQuery01.getCqHe());
        myMap.put("cqHf", dataFeedCustQuery01.getCqHf());
        myMap.put("cqHg", dataFeedCustQuery01.getCqHg());
        myMap.put("cqHh", dataFeedCustQuery01.getCqHh());
        myMap.put("cqHi", dataFeedCustQuery01.getCqHi());
        myMap.put("cqHj", dataFeedCustQuery01.getCqHj());
        myMap.put("cqHk", dataFeedCustQuery01.getCqHk());
        myMap.put("cqHl", dataFeedCustQuery01.getCqHl());
        myMap.put("cqHm", dataFeedCustQuery01.getCqHm());
        myMap.put("cqHn", dataFeedCustQuery01.getCqHn());
        myMap.put("cqHo", dataFeedCustQuery01.getCqHo());
        myMap.put("cqHp", dataFeedCustQuery01.getCqHp());
        myMap.put("cqHq", dataFeedCustQuery01.getCqHq());
        myMap.put("cqHr", dataFeedCustQuery01.getCqHr());
        myMap.put("cqHs", dataFeedCustQuery01.getCqHs());
        myMap.put("cqHt", dataFeedCustQuery01.getCqHt());
        myMap.put("cqHu", dataFeedCustQuery01.getCqHu());
        myMap.put("cqHv", dataFeedCustQuery01.getCqHv());
        myMap.put("cqHw", dataFeedCustQuery01.getCqHw());
        myMap.put("cqHx", dataFeedCustQuery01.getCqHx());
        myMap.put("cqHy", dataFeedCustQuery01.getCqHy());
        myMap.put("cqHz", dataFeedCustQuery01.getCqHz());
        myMap.put("cqIa", dataFeedCustQuery01.getCqIa());
        myMap.put("cqIb", dataFeedCustQuery01.getCqIb());
        myMap.put("cqIc", dataFeedCustQuery01.getCqIc());
        myMap.put("cqId", dataFeedCustQuery01.getCqId());
        myMap.put("cqIe", dataFeedCustQuery01.getCqIe());
        myMap.put("cqIf", dataFeedCustQuery01.getCqIf());
        myMap.put("cqIg", dataFeedCustQuery01.getCqIg());
        myMap.put("cqIh", dataFeedCustQuery01.getCqIh());
        myMap.put("cqIi", dataFeedCustQuery01.getCqIi());
        myMap.put("cqIj", dataFeedCustQuery01.getCqIj());
        myMap.put("cqIk", dataFeedCustQuery01.getCqIk());
        myMap.put("cqIl", dataFeedCustQuery01.getCqIl());
        myMap.put("cqIm", dataFeedCustQuery01.getCqIm());
        myMap.put("cqIn", dataFeedCustQuery01.getCqIn());
        myMap.put("cqIo", dataFeedCustQuery01.getCqIo());
        myMap.put("cqIp", dataFeedCustQuery01.getCqIp());
        myMap.put("cqIq", dataFeedCustQuery01.getCqIq());
        myMap.put("cqIr", dataFeedCustQuery01.getCqIr());
        myMap.put("cqIs", dataFeedCustQuery01.getCqIs());
        myMap.put("cqIt", dataFeedCustQuery01.getCqIt());
        myMap.put("cqIu", dataFeedCustQuery01.getCqIu());
        myMap.put("cqIv", dataFeedCustQuery01.getCqIv());
        myMap.put("cqIw", dataFeedCustQuery01.getCqIw());
        myMap.put("cqIx", dataFeedCustQuery01.getCqIx());
        myMap.put("cqIy", dataFeedCustQuery01.getCqIy());
        myMap.put("cqIz", dataFeedCustQuery01.getCqIz());
        myMap.put("cqJa", dataFeedCustQuery01.getCqJa());
        myMap.put("cqJb", dataFeedCustQuery01.getCqJb());
        myMap.put("cqJc", dataFeedCustQuery01.getCqJc());
        myMap.put("cqJd", dataFeedCustQuery01.getCqJd());
        myMap.put("cqJe", dataFeedCustQuery01.getCqJe());
        myMap.put("cqJf", dataFeedCustQuery01.getCqJf());
        myMap.put("cqJg", dataFeedCustQuery01.getCqJg());
        myMap.put("cqJh", dataFeedCustQuery01.getCqJh());
        myMap.put("cqJi", dataFeedCustQuery01.getCqJi());
        myMap.put("cqJj", dataFeedCustQuery01.getCqJj());
        myMap.put("cqJk", dataFeedCustQuery01.getCqJk());
        myMap.put("cqJl", dataFeedCustQuery01.getCqJl());
        myMap.put("cqJm", dataFeedCustQuery01.getCqJm());
        myMap.put("cqJn", dataFeedCustQuery01.getCqJn());
        myMap.put("cqJo", dataFeedCustQuery01.getCqJo());
        myMap.put("cqJp", dataFeedCustQuery01.getCqJp());
        myMap.put("cqJq", dataFeedCustQuery01.getCqJq());
        myMap.put("cqJr", dataFeedCustQuery01.getCqJr());
        myMap.put("cqJs", dataFeedCustQuery01.getCqJs());
        myMap.put("cqJt", dataFeedCustQuery01.getCqJt());
        myMap.put("cqJu", dataFeedCustQuery01.getCqJu());
        myMap.put("cqJv", dataFeedCustQuery01.getCqJv());
        myMap.put("cqJw", dataFeedCustQuery01.getCqJw());
        myMap.put("cqJx", dataFeedCustQuery01.getCqJx());
        myMap.put("cqJy", dataFeedCustQuery01.getCqJy());
        myMap.put("cqJz", dataFeedCustQuery01.getCqJz());
        myMap.put("cqKa", dataFeedCustQuery01.getCqKa());
        myMap.put("cqKb", dataFeedCustQuery01.getCqKb());
        myMap.put("cqKc", dataFeedCustQuery01.getCqKc());
        myMap.put("cqKd", dataFeedCustQuery01.getCqKd());
        myMap.put("cqKe", dataFeedCustQuery01.getCqKe());
        myMap.put("cqKf", dataFeedCustQuery01.getCqKf());
        myMap.put("cqKg", dataFeedCustQuery01.getCqKg());
        myMap.put("cqKh", dataFeedCustQuery01.getCqKh());
        myMap.put("cqKi", dataFeedCustQuery01.getCqKi());
        myMap.put("cqKj", dataFeedCustQuery01.getCqKj());
        myMap.put("cqKk", dataFeedCustQuery01.getCqKk());
        myMap.put("cqKl", dataFeedCustQuery01.getCqKl());
        myMap.put("cqKm", dataFeedCustQuery01.getCqKm());
        myMap.put("cqKn", dataFeedCustQuery01.getCqKn());
        myMap.put("cqKo", dataFeedCustQuery01.getCqKo());
        myMap.put("cqKp", dataFeedCustQuery01.getCqKp());
        myMap.put("cqKq", dataFeedCustQuery01.getCqKq());
        myMap.put("cqKr", dataFeedCustQuery01.getCqKr());
        myMap.put("cqKs", dataFeedCustQuery01.getCqKs());
        myMap.put("cqKt", dataFeedCustQuery01.getCqKt());
        myMap.put("cqKu", dataFeedCustQuery01.getCqKu());
        myMap.put("cqKv", dataFeedCustQuery01.getCqKv());
        myMap.put("cqKw", dataFeedCustQuery01.getCqKw());
        myMap.put("cqKx", dataFeedCustQuery01.getCqKx());
        myMap.put("cqKy", dataFeedCustQuery01.getCqKy());
        myMap.put("cqKz", dataFeedCustQuery01.getCqKz());
        myMap.put("cqLa", dataFeedCustQuery01.getCqLa());
        myMap.put("cqLb", dataFeedCustQuery01.getCqLb());
        myMap.put("cqLc", dataFeedCustQuery01.getCqLc());
        myMap.put("cqLd", dataFeedCustQuery01.getCqLd());
        myMap.put("cqLe", dataFeedCustQuery01.getCqLe());
        myMap.put("cqLf", dataFeedCustQuery01.getCqLf());
        myMap.put("cqLg", dataFeedCustQuery01.getCqLg());
        myMap.put("cqLh", dataFeedCustQuery01.getCqLh());
        myMap.put("cqLi", dataFeedCustQuery01.getCqLi());
        myMap.put("cqLj", dataFeedCustQuery01.getCqLj());
        myMap.put("cqLk", dataFeedCustQuery01.getCqLk());
        myMap.put("cqLl", dataFeedCustQuery01.getCqLl());
        myMap.put("cqLm", dataFeedCustQuery01.getCqLm());
        myMap.put("cqLn", dataFeedCustQuery01.getCqLn());
        myMap.put("cqLo", dataFeedCustQuery01.getCqLo());
        myMap.put("cqLp", dataFeedCustQuery01.getCqLp());
        myMap.put("cqLq", dataFeedCustQuery01.getCqLq());
        myMap.put("cqLr", dataFeedCustQuery01.getCqLr());
        myMap.put("cqLs", dataFeedCustQuery01.getCqLs());
        myMap.put("cqLt", dataFeedCustQuery01.getCqLt());
        myMap.put("cqLu", dataFeedCustQuery01.getCqLu());
        myMap.put("cqLv", dataFeedCustQuery01.getCqLv());
        myMap.put("cqLw", dataFeedCustQuery01.getCqLw());
        myMap.put("cqLx", dataFeedCustQuery01.getCqLx());
        myMap.put("cqLy", dataFeedCustQuery01.getCqLy());
        myMap.put("cqLz", dataFeedCustQuery01.getCqLz());
        myMap.put("cqMa", dataFeedCustQuery01.getCqMa());
        myMap.put("cqMb", dataFeedCustQuery01.getCqMb());
        myMap.put("cqMc", dataFeedCustQuery01.getCqMc());
        myMap.put("cqMd", dataFeedCustQuery01.getCqMd());
        myMap.put("cqMe", dataFeedCustQuery01.getCqMe());
        myMap.put("cqMf", dataFeedCustQuery01.getCqMf());
        myMap.put("cqMg", dataFeedCustQuery01.getCqMg());
        myMap.put("cqMh", dataFeedCustQuery01.getCqMh());
        myMap.put("cqMi", dataFeedCustQuery01.getCqMi());
        myMap.put("cqMj", dataFeedCustQuery01.getCqMj());
        myMap.put("cqMk", dataFeedCustQuery01.getCqMk());
        myMap.put("cqMl", dataFeedCustQuery01.getCqMl());
        myMap.put("cqMm", dataFeedCustQuery01.getCqMm());
        myMap.put("cqMn", dataFeedCustQuery01.getCqMn());
        myMap.put("cqMo", dataFeedCustQuery01.getCqMo());
        myMap.put("cqMp", dataFeedCustQuery01.getCqMp());
        myMap.put("cqMq", dataFeedCustQuery01.getCqMq());
        myMap.put("cqMr", dataFeedCustQuery01.getCqMr());
        myMap.put("cqMs", dataFeedCustQuery01.getCqMs());
        myMap.put("cqMt", dataFeedCustQuery01.getCqMt());
        myMap.put("cqMu", dataFeedCustQuery01.getCqMu());
        myMap.put("cqMv", dataFeedCustQuery01.getCqMv());
        myMap.put("cqMw", dataFeedCustQuery01.getCqMw());
        myMap.put("cqMx", dataFeedCustQuery01.getCqMx());
        myMap.put("cqMy", dataFeedCustQuery01.getCqMy());
        myMap.put("cqMz", dataFeedCustQuery01.getCqMz());

        namedParameterJdbcTemplate.update(mySql, myMap);
    }
}
