package tw.com.colatour.datafeed.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Component;
import tw.com.colatour.datafeed.dao.DataFeedCustQuery02Dao;
import tw.com.colatour.datafeed.model.DataFeedCustQuery02;

import java.util.HashMap;
import java.util.Map;

@Component
public class DataFeedCustQuery02DaoImpl implements DataFeedCustQuery02Dao {

    @Autowired
    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    @Override
    public void createDataFeedCustQuery02(DataFeedCustQuery02 dataFeedCustQuery02) {
        String mySql = "INSERT INTO data_feed.data_feed_cust_query_02 ( " +
                " file_no, " +
                " cq_na, cq_nb, cq_nc, cq_nd, cq_ne, cq_nf, cq_ng, cq_nh, cq_ni, cq_nj, cq_nk, cq_nl, cq_nm, " +
                " cq_nn, cq_no, cq_np, cq_nq, cq_nr, cq_ns, cq_nt, cq_nu, cq_nv, cq_nw, cq_nx, cq_ny, cq_nz, " +
                " cq_oa, cq_ob, cq_oc, cq_od, cq_oe, cq_of, cq_og, cq_oh, cq_oi, cq_oj, cq_ok, cq_ol, cq_om, " +
                " cq_on, cq_oo, cq_op, cq_oq, cq_or, cq_os, cq_ot, cq_ou, cq_ov, cq_ow, cq_ox, cq_oy, cq_oz, " +
                " cq_pa, cq_pb, cq_pc, cq_pd, cq_pe, cq_pf, cq_pg, cq_ph, cq_pi, cq_pj, cq_pk, cq_pl, cq_pm, " +
                " cq_pn, cq_po, cq_pp, cq_pq, cq_pr, cq_ps, cq_pt, cq_pu, cq_pv, cq_pw, cq_px, cq_py, cq_pz, " +
                " cq_qa, cq_qb, cq_qc, cq_qd, cq_qe, cq_qf, cq_qg, cq_qh, cq_qi, cq_qj, cq_qk, cq_ql, cq_qm, " +
                " cq_qn, cq_qo, cq_qp, cq_qq, cq_qr, cq_qs, cq_qt, cq_qu, cq_qv, cq_qw, cq_qx, cq_qy, cq_qz, " +
                " cq_ra, cq_rb, cq_rc, cq_rd, cq_re, cq_rf, cq_rg, cq_rh, cq_ri, cq_rj, cq_rk, cq_rl, cq_rm, " +
                " cq_rn, cq_ro, cq_rp, cq_rq, cq_rr, cq_rs, cq_rt, cq_ru, cq_rv, cq_rw, cq_rx, cq_ry, cq_rz, " +
                " cq_sa, cq_sb, cq_sc, cq_sd, cq_se, cq_sf, cq_sg, cq_sh, cq_si, cq_sj, cq_sk, cq_sl, cq_sm, " +
                " cq_sn, cq_so, cq_sp, cq_sq, cq_sr, cq_ss, cq_st, cq_su, cq_sv, cq_sw, cq_sx, cq_sy, cq_sz, " +
                " cq_ta, cq_tb, cq_tc, cq_td, cq_te, cq_tf, cq_tg, cq_th, cq_ti, cq_tj, cq_tk, cq_tl, cq_tm, " +
                " cq_tn, cq_to, cq_tp, cq_tq, cq_tr, cq_ts, cq_tt, cq_tu, cq_tv, cq_tw, cq_tx, cq_ty, cq_tz, " +
                " cq_ua, cq_ub, cq_uc, cq_ud, cq_ue, cq_uf, cq_ug, cq_uh, cq_ui, cq_uj, cq_uk, cq_ul, cq_um, " +
                " cq_un, cq_uo, cq_up, cq_uq, cq_ur, cq_us, cq_ut, cq_uu, cq_uv, cq_uw, cq_ux, cq_uy, cq_uz, " +
                " cq_va, cq_vb, cq_vc, cq_vd, cq_ve, cq_vf, cq_vg, cq_vh, cq_vi, cq_vj, cq_vk, cq_vl, cq_vm, " +
                " cq_vn, cq_vo, cq_vp, cq_vq, cq_vr, cq_vs, cq_vt, cq_vu, cq_vv, cq_vw, cq_vx, cq_vy, cq_vz, " +
                " cq_wa, cq_wb, cq_wc, cq_wd, cq_we, cq_wf, cq_wg, cq_wh, cq_wi, cq_wj, cq_wk, cq_wl, cq_wm, " +
                " cq_wn, cq_wo, cq_wp, cq_wq, cq_wr, cq_ws, cq_wt, cq_wu, cq_wv, cq_ww, cq_wx, cq_wy, cq_wz, " +
                " cq_xa, cq_xb, cq_xc, cq_xd, cq_xe, cq_xf, cq_xg, cq_xh, cq_xi, cq_xj, cq_xk, cq_xl, cq_xm, " +
                " cq_xn, cq_xo, cq_xp, cq_xq, cq_xr, cq_xs, cq_xt, cq_xu, cq_xv, cq_xw, cq_xx, cq_xy, cq_xz, " +
                " cq_ya, cq_yb, cq_yc, cq_yd, cq_ye, cq_yf, cq_yg, cq_yh, cq_yi, cq_yj, cq_yk, cq_yl, cq_ym, " +
                " cq_yn, cq_yo, cq_yp, cq_yq, cq_yr, cq_ys, cq_yt, cq_yu, cq_yv, cq_yw, cq_yx, cq_yy, cq_yz, " +
                " cq_za, cq_zb, cq_zc, cq_zd, cq_ze, cq_zf, cq_zg, cq_zh, cq_zi, cq_zj, cq_zk, cq_zl, cq_zm, " +
                " cq_zn, cq_zo, cq_zp, cq_zq, cq_zr, cq_zs, cq_zt, cq_zu, cq_zv, cq_zw, cq_zx, cq_zy, cq_zz ) " +
                " VALUES ( " +
                " :fileNo, " +
                " :cqNa, :cqNb, :cqNc, :cqNd, :cqNe, :cqNf, :cqNg, :cqNh, :cqNi, :cqNj, :cqNk, :cqNl, :cqNm, " +
                " :cqNn, :cqNo, :cqNp, :cqNq, :cqNr, :cqNs, :cqNt, :cqNu, :cqNv, :cqNw, :cqNx, :cqNy, :cqNz, " +
                " :cqOa, :cqOb, :cqOc, :cqOd, :cqOe, :cqOf, :cqOg, :cqOh, :cqOi, :cqOj, :cqOk, :cqOl, :cqOm, " +
                " :cqOn, :cqOo, :cqOp, :cqOq, :cqOr, :cqOs, :cqOt, :cqOu, :cqOv, :cqOw, :cqOx, :cqOy, :cqOz, " +
                " :cqPa, :cqPb, :cqPc, :cqPd, :cqPe, :cqPf, :cqPg, :cqPh, :cqPi, :cqPj, :cqPk, :cqPl, :cqPm, " +
                " :cqPn, :cqPo, :cqPp, :cqPq, :cqPr, :cqPs, :cqPt, :cqPu, :cqPv, :cqPw, :cqPx, :cqPy, :cqPz, " +
                " :cqQa, :cqQb, :cqQc, :cqQd, :cqQe, :cqQf, :cqQg, :cqQh, :cqQi, :cqQj, :cqQk, :cqQl, :cqQm, " +
                " :cqQn, :cqQo, :cqQp, :cqQq, :cqQr, :cqQs, :cqQt, :cqQu, :cqQv, :cqQw, :cqQx, :cqQy, :cqQz, " +
                " :cqRa, :cqRb, :cqRc, :cqRd, :cqRe, :cqRf, :cqRg, :cqRh, :cqRi, :cqRj, :cqRk, :cqRl, :cqRm, " +
                " :cqRn, :cqRo, :cqRp, :cqRq, :cqRr, :cqRs, :cqRt, :cqRu, :cqRv, :cqRw, :cqRx, :cqRy, :cqRz, " +
                " :cqSa, :cqSb, :cqSc, :cqSd, :cqSe, :cqSf, :cqSg, :cqSh, :cqSi, :cqSj, :cqSk, :cqSl, :cqSm, " +
                " :cqSn, :cqSo, :cqSp, :cqSq, :cqSr, :cqSs, :cqSt, :cqSu, :cqSv, :cqSw, :cqSx, :cqSy, :cqSz, " +
                " :cqTa, :cqTb, :cqTc, :cqTd, :cqTe, :cqTf, :cqTg, :cqTh, :cqTi, :cqTj, :cqTk, :cqTl, :cqTm, " +
                " :cqTn, :cqTo, :cqTp, :cqTq, :cqTr, :cqTs, :cqTt, :cqTu, :cqTv, :cqTw, :cqTx, :cqTy, :cqTz, " +
                " :cqUa, :cqUb, :cqUc, :cqUd, :cqUe, :cqUf, :cqUg, :cqUh, :cqUi, :cqUj, :cqUk, :cqUl, :cqUm, " +
                " :cqUn, :cqUo, :cqUp, :cqUq, :cqUr, :cqUs, :cqUt, :cqUu, :cqUv, :cqUw, :cqUx, :cqUy, :cqUz, " +
                " :cqVa, :cqVb, :cqVc, :cqVd, :cqVe, :cqVf, :cqVg, :cqVh, :cqVi, :cqVj, :cqVk, :cqVl, :cqVm, " +
                " :cqVn, :cqVo, :cqVp, :cqVq, :cqVr, :cqVs, :cqVt, :cqVu, :cqVv, :cqVw, :cqVx, :cqVy, :cqVz, " +
                " :cqWa, :cqWb, :cqWc, :cqWd, :cqWe, :cqWf, :cqWg, :cqWh, :cqWi, :cqWj, :cqWk, :cqWl, :cqWm, " +
                " :cqWn, :cqWo, :cqWp, :cqWq, :cqWr, :cqWs, :cqWt, :cqWu, :cqWv, :cqWw, :cqWx, :cqWy, :cqWz, " +
                " :cqXa, :cqXb, :cqXc, :cqXd, :cqXe, :cqXf, :cqXg, :cqXh, :cqXi, :cqXj, :cqXk, :cqXl, :cqXm, " +
                " :cqXn, :cqXo, :cqXp, :cqXq, :cqXr, :cqXs, :cqXt, :cqXu, :cqXv, :cqXw, :cqXx, :cqXy, :cqXz, " +
                " :cqYa, :cqYb, :cqYc, :cqYd, :cqYe, :cqYf, :cqYg, :cqYh, :cqYi, :cqYj, :cqYk, :cqYl, :cqYm, " +
                " :cqYn, :cqYo, :cqYp, :cqYq, :cqYr, :cqYs, :cqYt, :cqYu, :cqYv, :cqYw, :cqYx, :cqYy, :cqYz, " +
                " :cqZa, :cqZb, :cqZc, :cqZd, :cqZe, :cqZf, :cqZg, :cqZh, :cqZi, :cqZj, :cqZk, :cqZl, :cqZm, " +
                " :cqZn, :cqZo, :cqZp, :cqZq, :cqZr, :cqZs, :cqZt, :cqZu, :cqZv, :cqZw, :cqZx, :cqZy, :cqZz ) ";

        Map<String, Object> myMap = new HashMap<>();

        myMap.put("fileNo", dataFeedCustQuery02.getFileNo());
        myMap.put("cqNa", dataFeedCustQuery02.getCqNa());
        myMap.put("cqNb", dataFeedCustQuery02.getCqNb());
        myMap.put("cqNc", dataFeedCustQuery02.getCqNc());
        myMap.put("cqNd", dataFeedCustQuery02.getCqNd());
        myMap.put("cqNe", dataFeedCustQuery02.getCqNe());
        myMap.put("cqNf", dataFeedCustQuery02.getCqNf());
        myMap.put("cqNg", dataFeedCustQuery02.getCqNg());
        myMap.put("cqNh", dataFeedCustQuery02.getCqNh());
        myMap.put("cqNi", dataFeedCustQuery02.getCqNi());
        myMap.put("cqNj", dataFeedCustQuery02.getCqNj());
        myMap.put("cqNk", dataFeedCustQuery02.getCqNk());
        myMap.put("cqNl", dataFeedCustQuery02.getCqNl());
        myMap.put("cqNm", dataFeedCustQuery02.getCqNm());
        myMap.put("cqNn", dataFeedCustQuery02.getCqNn());
        myMap.put("cqNo", dataFeedCustQuery02.getCqNo());
        myMap.put("cqNp", dataFeedCustQuery02.getCqNp());
        myMap.put("cqNq", dataFeedCustQuery02.getCqNq());
        myMap.put("cqNr", dataFeedCustQuery02.getCqNr());
        myMap.put("cqNs", dataFeedCustQuery02.getCqNs());
        myMap.put("cqNt", dataFeedCustQuery02.getCqNt());
        myMap.put("cqNu", dataFeedCustQuery02.getCqNu());
        myMap.put("cqNv", dataFeedCustQuery02.getCqNv());
        myMap.put("cqNw", dataFeedCustQuery02.getCqNw());
        myMap.put("cqNx", dataFeedCustQuery02.getCqNx());
        myMap.put("cqNy", dataFeedCustQuery02.getCqNy());
        myMap.put("cqNz", dataFeedCustQuery02.getCqNz());
        myMap.put("cqOa", dataFeedCustQuery02.getCqOa());
        myMap.put("cqOb", dataFeedCustQuery02.getCqOb());
        myMap.put("cqOc", dataFeedCustQuery02.getCqOc());
        myMap.put("cqOd", dataFeedCustQuery02.getCqOd());
        myMap.put("cqOe", dataFeedCustQuery02.getCqOe());
        myMap.put("cqOf", dataFeedCustQuery02.getCqOf());
        myMap.put("cqOg", dataFeedCustQuery02.getCqOg());
        myMap.put("cqOh", dataFeedCustQuery02.getCqOh());
        myMap.put("cqOi", dataFeedCustQuery02.getCqOi());
        myMap.put("cqOj", dataFeedCustQuery02.getCqOj());
        myMap.put("cqOk", dataFeedCustQuery02.getCqOk());
        myMap.put("cqOl", dataFeedCustQuery02.getCqOl());
        myMap.put("cqOm", dataFeedCustQuery02.getCqOm());
        myMap.put("cqOn", dataFeedCustQuery02.getCqOn());
        myMap.put("cqOo", dataFeedCustQuery02.getCqOo());
        myMap.put("cqOp", dataFeedCustQuery02.getCqOp());
        myMap.put("cqOq", dataFeedCustQuery02.getCqOq());
        myMap.put("cqOr", dataFeedCustQuery02.getCqOr());
        myMap.put("cqOs", dataFeedCustQuery02.getCqOs());
        myMap.put("cqOt", dataFeedCustQuery02.getCqOt());
        myMap.put("cqOu", dataFeedCustQuery02.getCqOu());
        myMap.put("cqOv", dataFeedCustQuery02.getCqOv());
        myMap.put("cqOw", dataFeedCustQuery02.getCqOw());
        myMap.put("cqOx", dataFeedCustQuery02.getCqOx());
        myMap.put("cqOy", dataFeedCustQuery02.getCqOy());
        myMap.put("cqOz", dataFeedCustQuery02.getCqOz());
        myMap.put("cqPa", dataFeedCustQuery02.getCqPa());
        myMap.put("cqPb", dataFeedCustQuery02.getCqPb());
        myMap.put("cqPc", dataFeedCustQuery02.getCqPc());
        myMap.put("cqPd", dataFeedCustQuery02.getCqPd());
        myMap.put("cqPe", dataFeedCustQuery02.getCqPe());
        myMap.put("cqPf", dataFeedCustQuery02.getCqPf());
        myMap.put("cqPg", dataFeedCustQuery02.getCqPg());
        myMap.put("cqPh", dataFeedCustQuery02.getCqPh());
        myMap.put("cqPi", dataFeedCustQuery02.getCqPi());
        myMap.put("cqPj", dataFeedCustQuery02.getCqPj());
        myMap.put("cqPk", dataFeedCustQuery02.getCqPk());
        myMap.put("cqPl", dataFeedCustQuery02.getCqPl());
        myMap.put("cqPm", dataFeedCustQuery02.getCqPm());
        myMap.put("cqPn", dataFeedCustQuery02.getCqPn());
        myMap.put("cqPo", dataFeedCustQuery02.getCqPo());
        myMap.put("cqPp", dataFeedCustQuery02.getCqPp());
        myMap.put("cqPq", dataFeedCustQuery02.getCqPq());
        myMap.put("cqPr", dataFeedCustQuery02.getCqPr());
        myMap.put("cqPs", dataFeedCustQuery02.getCqPs());
        myMap.put("cqPt", dataFeedCustQuery02.getCqPt());
        myMap.put("cqPu", dataFeedCustQuery02.getCqPu());
        myMap.put("cqPv", dataFeedCustQuery02.getCqPv());
        myMap.put("cqPw", dataFeedCustQuery02.getCqPw());
        myMap.put("cqPx", dataFeedCustQuery02.getCqPx());
        myMap.put("cqPy", dataFeedCustQuery02.getCqPy());
        myMap.put("cqPz", dataFeedCustQuery02.getCqPz());
        myMap.put("cqQa", dataFeedCustQuery02.getCqQa());
        myMap.put("cqQb", dataFeedCustQuery02.getCqQb());
        myMap.put("cqQc", dataFeedCustQuery02.getCqQc());
        myMap.put("cqQd", dataFeedCustQuery02.getCqQd());
        myMap.put("cqQe", dataFeedCustQuery02.getCqQe());
        myMap.put("cqQf", dataFeedCustQuery02.getCqQf());
        myMap.put("cqQg", dataFeedCustQuery02.getCqQg());
        myMap.put("cqQh", dataFeedCustQuery02.getCqQh());
        myMap.put("cqQi", dataFeedCustQuery02.getCqQi());
        myMap.put("cqQj", dataFeedCustQuery02.getCqQj());
        myMap.put("cqQk", dataFeedCustQuery02.getCqQk());
        myMap.put("cqQl", dataFeedCustQuery02.getCqQl());
        myMap.put("cqQm", dataFeedCustQuery02.getCqQm());
        myMap.put("cqQn", dataFeedCustQuery02.getCqQn());
        myMap.put("cqQo", dataFeedCustQuery02.getCqQo());
        myMap.put("cqQp", dataFeedCustQuery02.getCqQp());
        myMap.put("cqQq", dataFeedCustQuery02.getCqQq());
        myMap.put("cqQr", dataFeedCustQuery02.getCqQr());
        myMap.put("cqQs", dataFeedCustQuery02.getCqQs());
        myMap.put("cqQt", dataFeedCustQuery02.getCqQt());
        myMap.put("cqQu", dataFeedCustQuery02.getCqQu());
        myMap.put("cqQv", dataFeedCustQuery02.getCqQv());
        myMap.put("cqQw", dataFeedCustQuery02.getCqQw());
        myMap.put("cqQx", dataFeedCustQuery02.getCqQx());
        myMap.put("cqQy", dataFeedCustQuery02.getCqQy());
        myMap.put("cqQz", dataFeedCustQuery02.getCqQz());
        myMap.put("cqRa", dataFeedCustQuery02.getCqRa());
        myMap.put("cqRb", dataFeedCustQuery02.getCqRb());
        myMap.put("cqRc", dataFeedCustQuery02.getCqRc());
        myMap.put("cqRd", dataFeedCustQuery02.getCqRd());
        myMap.put("cqRe", dataFeedCustQuery02.getCqRe());
        myMap.put("cqRf", dataFeedCustQuery02.getCqRf());
        myMap.put("cqRg", dataFeedCustQuery02.getCqRg());
        myMap.put("cqRh", dataFeedCustQuery02.getCqRh());
        myMap.put("cqRi", dataFeedCustQuery02.getCqRi());
        myMap.put("cqRj", dataFeedCustQuery02.getCqRj());
        myMap.put("cqRk", dataFeedCustQuery02.getCqRk());
        myMap.put("cqRl", dataFeedCustQuery02.getCqRl());
        myMap.put("cqRm", dataFeedCustQuery02.getCqRm());
        myMap.put("cqRn", dataFeedCustQuery02.getCqRn());
        myMap.put("cqRo", dataFeedCustQuery02.getCqRo());
        myMap.put("cqRp", dataFeedCustQuery02.getCqRp());
        myMap.put("cqRq", dataFeedCustQuery02.getCqRq());
        myMap.put("cqRr", dataFeedCustQuery02.getCqRr());
        myMap.put("cqRs", dataFeedCustQuery02.getCqRs());
        myMap.put("cqRt", dataFeedCustQuery02.getCqRt());
        myMap.put("cqRu", dataFeedCustQuery02.getCqRu());
        myMap.put("cqRv", dataFeedCustQuery02.getCqRv());
        myMap.put("cqRw", dataFeedCustQuery02.getCqRw());
        myMap.put("cqRx", dataFeedCustQuery02.getCqRx());
        myMap.put("cqRy", dataFeedCustQuery02.getCqRy());
        myMap.put("cqRz", dataFeedCustQuery02.getCqRz());
        myMap.put("cqSa", dataFeedCustQuery02.getCqSa());
        myMap.put("cqSb", dataFeedCustQuery02.getCqSb());
        myMap.put("cqSc", dataFeedCustQuery02.getCqSc());
        myMap.put("cqSd", dataFeedCustQuery02.getCqSd());
        myMap.put("cqSe", dataFeedCustQuery02.getCqSe());
        myMap.put("cqSf", dataFeedCustQuery02.getCqSf());
        myMap.put("cqSg", dataFeedCustQuery02.getCqSg());
        myMap.put("cqSh", dataFeedCustQuery02.getCqSh());
        myMap.put("cqSi", dataFeedCustQuery02.getCqSi());
        myMap.put("cqSj", dataFeedCustQuery02.getCqSj());
        myMap.put("cqSk", dataFeedCustQuery02.getCqSk());
        myMap.put("cqSl", dataFeedCustQuery02.getCqSl());
        myMap.put("cqSm", dataFeedCustQuery02.getCqSm());
        myMap.put("cqSn", dataFeedCustQuery02.getCqSn());
        myMap.put("cqSo", dataFeedCustQuery02.getCqSo());
        myMap.put("cqSp", dataFeedCustQuery02.getCqSp());
        myMap.put("cqSq", dataFeedCustQuery02.getCqSq());
        myMap.put("cqSr", dataFeedCustQuery02.getCqSr());
        myMap.put("cqSs", dataFeedCustQuery02.getCqSs());
        myMap.put("cqSt", dataFeedCustQuery02.getCqSt());
        myMap.put("cqSu", dataFeedCustQuery02.getCqSu());
        myMap.put("cqSv", dataFeedCustQuery02.getCqSv());
        myMap.put("cqSw", dataFeedCustQuery02.getCqSw());
        myMap.put("cqSx", dataFeedCustQuery02.getCqSx());
        myMap.put("cqSy", dataFeedCustQuery02.getCqSy());
        myMap.put("cqSz", dataFeedCustQuery02.getCqSz());
        myMap.put("cqTa", dataFeedCustQuery02.getCqTa());
        myMap.put("cqTb", dataFeedCustQuery02.getCqTb());
        myMap.put("cqTc", dataFeedCustQuery02.getCqTc());
        myMap.put("cqTd", dataFeedCustQuery02.getCqTd());
        myMap.put("cqTe", dataFeedCustQuery02.getCqTe());
        myMap.put("cqTf", dataFeedCustQuery02.getCqTf());
        myMap.put("cqTg", dataFeedCustQuery02.getCqTg());
        myMap.put("cqTh", dataFeedCustQuery02.getCqTh());
        myMap.put("cqTi", dataFeedCustQuery02.getCqTi());
        myMap.put("cqTj", dataFeedCustQuery02.getCqTj());
        myMap.put("cqTk", dataFeedCustQuery02.getCqTk());
        myMap.put("cqTl", dataFeedCustQuery02.getCqTl());
        myMap.put("cqTm", dataFeedCustQuery02.getCqTm());
        myMap.put("cqTn", dataFeedCustQuery02.getCqTn());
        myMap.put("cqTo", dataFeedCustQuery02.getCqTo());
        myMap.put("cqTp", dataFeedCustQuery02.getCqTp());
        myMap.put("cqTq", dataFeedCustQuery02.getCqTq());
        myMap.put("cqTr", dataFeedCustQuery02.getCqTr());
        myMap.put("cqTs", dataFeedCustQuery02.getCqTs());
        myMap.put("cqTt", dataFeedCustQuery02.getCqTt());
        myMap.put("cqTu", dataFeedCustQuery02.getCqTu());
        myMap.put("cqTv", dataFeedCustQuery02.getCqTv());
        myMap.put("cqTw", dataFeedCustQuery02.getCqTw());
        myMap.put("cqTx", dataFeedCustQuery02.getCqTx());
        myMap.put("cqTy", dataFeedCustQuery02.getCqTy());
        myMap.put("cqTz", dataFeedCustQuery02.getCqTz());
        myMap.put("cqUa", dataFeedCustQuery02.getCqUa());
        myMap.put("cqUb", dataFeedCustQuery02.getCqUb());
        myMap.put("cqUc", dataFeedCustQuery02.getCqUc());
        myMap.put("cqUd", dataFeedCustQuery02.getCqUd());
        myMap.put("cqUe", dataFeedCustQuery02.getCqUe());
        myMap.put("cqUf", dataFeedCustQuery02.getCqUf());
        myMap.put("cqUg", dataFeedCustQuery02.getCqUg());
        myMap.put("cqUh", dataFeedCustQuery02.getCqUh());
        myMap.put("cqUi", dataFeedCustQuery02.getCqUi());
        myMap.put("cqUj", dataFeedCustQuery02.getCqUj());
        myMap.put("cqUk", dataFeedCustQuery02.getCqUk());
        myMap.put("cqUl", dataFeedCustQuery02.getCqUl());
        myMap.put("cqUm", dataFeedCustQuery02.getCqUm());
        myMap.put("cqUn", dataFeedCustQuery02.getCqUn());
        myMap.put("cqUo", dataFeedCustQuery02.getCqUo());
        myMap.put("cqUp", dataFeedCustQuery02.getCqUp());
        myMap.put("cqUq", dataFeedCustQuery02.getCqUq());
        myMap.put("cqUr", dataFeedCustQuery02.getCqUr());
        myMap.put("cqUs", dataFeedCustQuery02.getCqUs());
        myMap.put("cqUt", dataFeedCustQuery02.getCqUt());
        myMap.put("cqUu", dataFeedCustQuery02.getCqUu());
        myMap.put("cqUv", dataFeedCustQuery02.getCqUv());
        myMap.put("cqUw", dataFeedCustQuery02.getCqUw());
        myMap.put("cqUx", dataFeedCustQuery02.getCqUx());
        myMap.put("cqUy", dataFeedCustQuery02.getCqUy());
        myMap.put("cqUz", dataFeedCustQuery02.getCqUz());
        myMap.put("cqVa", dataFeedCustQuery02.getCqVa());
        myMap.put("cqVb", dataFeedCustQuery02.getCqVb());
        myMap.put("cqVc", dataFeedCustQuery02.getCqVc());
        myMap.put("cqVd", dataFeedCustQuery02.getCqVd());
        myMap.put("cqVe", dataFeedCustQuery02.getCqVe());
        myMap.put("cqVf", dataFeedCustQuery02.getCqVf());
        myMap.put("cqVg", dataFeedCustQuery02.getCqVg());
        myMap.put("cqVh", dataFeedCustQuery02.getCqVh());
        myMap.put("cqVi", dataFeedCustQuery02.getCqVi());
        myMap.put("cqVj", dataFeedCustQuery02.getCqVj());
        myMap.put("cqVk", dataFeedCustQuery02.getCqVk());
        myMap.put("cqVl", dataFeedCustQuery02.getCqVl());
        myMap.put("cqVm", dataFeedCustQuery02.getCqVm());
        myMap.put("cqVn", dataFeedCustQuery02.getCqVn());
        myMap.put("cqVo", dataFeedCustQuery02.getCqVo());
        myMap.put("cqVp", dataFeedCustQuery02.getCqVp());
        myMap.put("cqVq", dataFeedCustQuery02.getCqVq());
        myMap.put("cqVr", dataFeedCustQuery02.getCqVr());
        myMap.put("cqVs", dataFeedCustQuery02.getCqVs());
        myMap.put("cqVt", dataFeedCustQuery02.getCqVt());
        myMap.put("cqVu", dataFeedCustQuery02.getCqVu());
        myMap.put("cqVv", dataFeedCustQuery02.getCqVv());
        myMap.put("cqVw", dataFeedCustQuery02.getCqVw());
        myMap.put("cqVx", dataFeedCustQuery02.getCqVx());
        myMap.put("cqVy", dataFeedCustQuery02.getCqVy());
        myMap.put("cqVz", dataFeedCustQuery02.getCqVz());
        myMap.put("cqWa", dataFeedCustQuery02.getCqWa());
        myMap.put("cqWb", dataFeedCustQuery02.getCqWb());
        myMap.put("cqWc", dataFeedCustQuery02.getCqWc());
        myMap.put("cqWd", dataFeedCustQuery02.getCqWd());
        myMap.put("cqWe", dataFeedCustQuery02.getCqWe());
        myMap.put("cqWf", dataFeedCustQuery02.getCqWf());
        myMap.put("cqWg", dataFeedCustQuery02.getCqWg());
        myMap.put("cqWh", dataFeedCustQuery02.getCqWh());
        myMap.put("cqWi", dataFeedCustQuery02.getCqWi());
        myMap.put("cqWj", dataFeedCustQuery02.getCqWj());
        myMap.put("cqWk", dataFeedCustQuery02.getCqWk());
        myMap.put("cqWl", dataFeedCustQuery02.getCqWl());
        myMap.put("cqWm", dataFeedCustQuery02.getCqWm());
        myMap.put("cqWn", dataFeedCustQuery02.getCqWn());
        myMap.put("cqWo", dataFeedCustQuery02.getCqWo());
        myMap.put("cqWp", dataFeedCustQuery02.getCqWp());
        myMap.put("cqWq", dataFeedCustQuery02.getCqWq());
        myMap.put("cqWr", dataFeedCustQuery02.getCqWr());
        myMap.put("cqWs", dataFeedCustQuery02.getCqWs());
        myMap.put("cqWt", dataFeedCustQuery02.getCqWt());
        myMap.put("cqWu", dataFeedCustQuery02.getCqWu());
        myMap.put("cqWv", dataFeedCustQuery02.getCqWv());
        myMap.put("cqWw", dataFeedCustQuery02.getCqWw());
        myMap.put("cqWx", dataFeedCustQuery02.getCqWx());
        myMap.put("cqWy", dataFeedCustQuery02.getCqWy());
        myMap.put("cqWz", dataFeedCustQuery02.getCqWz());
        myMap.put("cqXa", dataFeedCustQuery02.getCqXa());
        myMap.put("cqXb", dataFeedCustQuery02.getCqXb());
        myMap.put("cqXc", dataFeedCustQuery02.getCqXc());
        myMap.put("cqXd", dataFeedCustQuery02.getCqXd());
        myMap.put("cqXe", dataFeedCustQuery02.getCqXe());
        myMap.put("cqXf", dataFeedCustQuery02.getCqXf());
        myMap.put("cqXg", dataFeedCustQuery02.getCqXg());
        myMap.put("cqXh", dataFeedCustQuery02.getCqXh());
        myMap.put("cqXi", dataFeedCustQuery02.getCqXi());
        myMap.put("cqXj", dataFeedCustQuery02.getCqXj());
        myMap.put("cqXk", dataFeedCustQuery02.getCqXk());
        myMap.put("cqXl", dataFeedCustQuery02.getCqXl());
        myMap.put("cqXm", dataFeedCustQuery02.getCqXm());
        myMap.put("cqXn", dataFeedCustQuery02.getCqXn());
        myMap.put("cqXo", dataFeedCustQuery02.getCqXo());
        myMap.put("cqXp", dataFeedCustQuery02.getCqXp());
        myMap.put("cqXq", dataFeedCustQuery02.getCqXq());
        myMap.put("cqXr", dataFeedCustQuery02.getCqXr());
        myMap.put("cqXs", dataFeedCustQuery02.getCqXs());
        myMap.put("cqXt", dataFeedCustQuery02.getCqXt());
        myMap.put("cqXu", dataFeedCustQuery02.getCqXu());
        myMap.put("cqXv", dataFeedCustQuery02.getCqXv());
        myMap.put("cqXw", dataFeedCustQuery02.getCqXw());
        myMap.put("cqXx", dataFeedCustQuery02.getCqXx());
        myMap.put("cqXy", dataFeedCustQuery02.getCqXy());
        myMap.put("cqXz", dataFeedCustQuery02.getCqXz());
        myMap.put("cqYa", dataFeedCustQuery02.getCqYa());
        myMap.put("cqYb", dataFeedCustQuery02.getCqYb());
        myMap.put("cqYc", dataFeedCustQuery02.getCqYc());
        myMap.put("cqYd", dataFeedCustQuery02.getCqYd());
        myMap.put("cqYe", dataFeedCustQuery02.getCqYe());
        myMap.put("cqYf", dataFeedCustQuery02.getCqYf());
        myMap.put("cqYg", dataFeedCustQuery02.getCqYg());
        myMap.put("cqYh", dataFeedCustQuery02.getCqYh());
        myMap.put("cqYi", dataFeedCustQuery02.getCqYi());
        myMap.put("cqYj", dataFeedCustQuery02.getCqYj());
        myMap.put("cqYk", dataFeedCustQuery02.getCqYk());
        myMap.put("cqYl", dataFeedCustQuery02.getCqYl());
        myMap.put("cqYm", dataFeedCustQuery02.getCqYm());
        myMap.put("cqYn", dataFeedCustQuery02.getCqYn());
        myMap.put("cqYo", dataFeedCustQuery02.getCqYo());
        myMap.put("cqYp", dataFeedCustQuery02.getCqYp());
        myMap.put("cqYq", dataFeedCustQuery02.getCqYq());
        myMap.put("cqYr", dataFeedCustQuery02.getCqYr());
        myMap.put("cqYs", dataFeedCustQuery02.getCqYs());
        myMap.put("cqYt", dataFeedCustQuery02.getCqYt());
        myMap.put("cqYu", dataFeedCustQuery02.getCqYu());
        myMap.put("cqYv", dataFeedCustQuery02.getCqYv());
        myMap.put("cqYw", dataFeedCustQuery02.getCqYw());
        myMap.put("cqYx", dataFeedCustQuery02.getCqYx());
        myMap.put("cqYy", dataFeedCustQuery02.getCqYy());
        myMap.put("cqYz", dataFeedCustQuery02.getCqYz());
        myMap.put("cqZa", dataFeedCustQuery02.getCqZa());
        myMap.put("cqZb", dataFeedCustQuery02.getCqZb());
        myMap.put("cqZc", dataFeedCustQuery02.getCqZc());
        myMap.put("cqZd", dataFeedCustQuery02.getCqZd());
        myMap.put("cqZe", dataFeedCustQuery02.getCqZe());
        myMap.put("cqZf", dataFeedCustQuery02.getCqZf());
        myMap.put("cqZg", dataFeedCustQuery02.getCqZg());
        myMap.put("cqZh", dataFeedCustQuery02.getCqZh());
        myMap.put("cqZi", dataFeedCustQuery02.getCqZi());
        myMap.put("cqZj", dataFeedCustQuery02.getCqZj());
        myMap.put("cqZk", dataFeedCustQuery02.getCqZk());
        myMap.put("cqZl", dataFeedCustQuery02.getCqZl());
        myMap.put("cqZm", dataFeedCustQuery02.getCqZm());
        myMap.put("cqZn", dataFeedCustQuery02.getCqZn());
        myMap.put("cqZo", dataFeedCustQuery02.getCqZo());
        myMap.put("cqZp", dataFeedCustQuery02.getCqZp());
        myMap.put("cqZq", dataFeedCustQuery02.getCqZq());
        myMap.put("cqZr", dataFeedCustQuery02.getCqZr());
        myMap.put("cqZs", dataFeedCustQuery02.getCqZs());
        myMap.put("cqZt", dataFeedCustQuery02.getCqZt());
        myMap.put("cqZu", dataFeedCustQuery02.getCqZu());
        myMap.put("cqZv", dataFeedCustQuery02.getCqZv());
        myMap.put("cqZw", dataFeedCustQuery02.getCqZw());
        myMap.put("cqZx", dataFeedCustQuery02.getCqZx());
        myMap.put("cqZy", dataFeedCustQuery02.getCqZy());
        myMap.put("cqZz", dataFeedCustQuery02.getCqZz());

        namedParameterJdbcTemplate.update(mySql, myMap);
    }
}
