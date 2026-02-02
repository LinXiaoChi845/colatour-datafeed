package tw.com.colatour.datafeed.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Component;
import tw.com.colatour.datafeed.dao.DataFeedAirticketPrice02Dao;
import tw.com.colatour.datafeed.model.DataFeedAirticketPrice02;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class DataFeedAirticketPrice02DaoImpl implements DataFeedAirticketPrice02Dao {

    @Autowired
    private NamedParameterJdbcTemplate myNamedParameterJdbcTemplate;

    @Override
    public void createDataFeedAirticketPrice02s(List<DataFeedAirticketPrice02> dataFeedAirticketPrice02List) {
        String mySql = "INSERT INTO db_airticket.data_feed_airticket_price_02 ( " +
                " file_no, price_no, " +
                " ap_na, ap_nb, ap_nc, ap_nd, ap_ne, ap_nf, ap_ng, ap_nh, ap_ni, ap_nj, ap_nk, ap_nl, ap_nm, " +
                " ap_nn, ap_no, ap_np, ap_nq, ap_nr, ap_ns, ap_nt, ap_nu, ap_nv, ap_nw, ap_nx, ap_ny, ap_nz, " +
                " ap_oa, ap_ob, ap_oc, ap_od, ap_oe, ap_of, ap_og, ap_oh, ap_oi, ap_oj, ap_ok, ap_ol, ap_om, " +
                " ap_on, ap_oo, ap_op, ap_oq, ap_or, ap_os, ap_ot, ap_ou, ap_ov, ap_ow, ap_ox, ap_oy, ap_oz, " +
                " ap_pa, ap_pb, ap_pc, ap_pd, ap_pe, ap_pf, ap_pg, ap_ph, ap_pi, ap_pj, ap_pk, ap_pl, ap_pm, " +
                " ap_pn, ap_po, ap_pp, ap_pq, ap_pr, ap_ps, ap_pt, ap_pu, ap_pv, ap_pw, ap_px, ap_py, ap_pz, " +
                " ap_qa, ap_qb, ap_qc, ap_qd, ap_qe, ap_qf, ap_qg, ap_qh, ap_qi, ap_qj, ap_qk, ap_ql, ap_qm, " +
                " ap_qn, ap_qo, ap_qp, ap_qq, ap_qr, ap_qs, ap_qt, ap_qu, ap_qv, ap_qw, ap_qx, ap_qy, ap_qz, " +
                " ap_ra, ap_rb, ap_rc, ap_rd, ap_re, ap_rf, ap_rg, ap_rh, ap_ri, ap_rj, ap_rk, ap_rl, ap_rm, " +
                " ap_rn, ap_ro, ap_rp, ap_rq, ap_rr, ap_rs, ap_rt, ap_ru, ap_rv, ap_rw, ap_rx, ap_ry, ap_rz, " +
                " ap_sa, ap_sb, ap_sc, ap_sd, ap_se, ap_sf, ap_sg, ap_sh, ap_si, ap_sj, ap_sk, ap_sl, ap_sm, " +
                " ap_sn, ap_so, ap_sp, ap_sq, ap_sr, ap_ss, ap_st, ap_su, ap_sv, ap_sw, ap_sx, ap_sy, ap_sz, " +
                " ap_ta, ap_tb, ap_tc, ap_td, ap_te, ap_tf, ap_tg, ap_th, ap_ti, ap_tj, ap_tk, ap_tl, ap_tm, " +
                " ap_tn, ap_to, ap_tp, ap_tq, ap_tr, ap_ts, ap_tt, ap_tu, ap_tv, ap_tw, ap_tx, ap_ty, ap_tz, " +
                " ap_ua, ap_ub, ap_uc, ap_ud, ap_ue, ap_uf, ap_ug, ap_uh, ap_ui, ap_uj, ap_uk, ap_ul, ap_um, " +
                " ap_un, ap_uo, ap_up, ap_uq, ap_ur, ap_us, ap_ut, ap_uu, ap_uv, ap_uw, ap_ux, ap_uy, ap_uz, " +
                " ap_va, ap_vb, ap_vc, ap_vd, ap_ve, ap_vf, ap_vg, ap_vh, ap_vi, ap_vj, ap_vk, ap_vl, ap_vm, " +
                " ap_vn, ap_vo, ap_vp, ap_vq, ap_vr, ap_vs, ap_vt, ap_vu, ap_vv, ap_vw, ap_vx, ap_vy, ap_vz, " +
                " ap_wa, ap_wb, ap_wc, ap_wd, ap_we, ap_wf, ap_wg, ap_wh, ap_wi, ap_wj, ap_wk, ap_wl, ap_wm, " +
                " ap_wn, ap_wo, ap_wp, ap_wq, ap_wr, ap_ws, ap_wt, ap_wu, ap_wv, ap_ww, ap_wx, ap_wy, ap_wz, " +
                " ap_xa, ap_xb, ap_xc, ap_xd, ap_xe, ap_xf, ap_xg, ap_xh, ap_xi, ap_xj, ap_xk, ap_xl, ap_xm, " +
                " ap_xn, ap_xo, ap_xp, ap_xq, ap_xr, ap_xs, ap_xt, ap_xu, ap_xv, ap_xw, ap_xx, ap_xy, ap_xz, " +
                " ap_ya, ap_yb, ap_yc, ap_yd, ap_ye, ap_yf, ap_yg, ap_yh, ap_yi, ap_yj, ap_yk, ap_yl, ap_ym, " +
                " ap_yn, ap_yo, ap_yp, ap_yq, ap_yr, ap_ys, ap_yt, ap_yu, ap_yv, ap_yw, ap_yx, ap_yy, ap_yz, " +
                " ap_za, ap_zb, ap_zc, ap_zd, ap_ze, ap_zf, ap_zg, ap_zh, ap_zi, ap_zj, ap_zk, ap_zl, ap_zm, " +
                " ap_zn, ap_zo, ap_zp, ap_zq, ap_zr, ap_zs, ap_zt, ap_zu, ap_zv, ap_zw, ap_zx, ap_zy, ap_zz ) " +
                " VALUES ( " +
                " :fileNo, :priceNo, " +
                " :apNa, :apNb, :apNc, :apNd, :apNe, :apNf, :apNg, :apNh, :apNi, :apNj, :apNk, :apNl, :apNm, " +
                " :apNn, :apNo, :apNp, :apNq, :apNr, :apNs, :apNt, :apNu, :apNv, :apNw, :apNx, :apNy, :apNz, " +
                " :apOa, :apOb, :apOc, :apOd, :apOe, :apOf, :apOg, :apOh, :apOi, :apOj, :apOk, :apOl, :apOm, " +
                " :apOn, :apOo, :apOp, :apOq, :apOr, :apOs, :apOt, :apOu, :apOv, :apOw, :apOx, :apOy, :apOz, " +
                " :apPa, :apPb, :apPc, :apPd, :apPe, :apPf, :apPg, :apPh, :apPi, :apPj, :apPk, :apPl, :apPm, " +
                " :apPn, :apPo, :apPp, :apPq, :apPr, :apPs, :apPt, :apPu, :apPv, :apPw, :apPx, :apPy, :apPz, " +
                " :apQa, :apQb, :apQc, :apQd, :apQe, :apQf, :apQg, :apQh, :apQi, :apQj, :apQk, :apQl, :apQm, " +
                " :apQn, :apQo, :apQp, :apQq, :apQr, :apQs, :apQt, :apQu, :apQv, :apQw, :apQx, :apQy, :apQz, " +
                " :apRa, :apRb, :apRc, :apRd, :apRe, :apRf, :apRg, :apRh, :apRi, :apRj, :apRk, :apRl, :apRm, " +
                " :apRn, :apRo, :apRp, :apRq, :apRr, :apRs, :apRt, :apRu, :apRv, :apRw, :apRx, :apRy, :apRz, " +
                " :apSa, :apSb, :apSc, :apSd, :apSe, :apSf, :apSg, :apSh, :apSi, :apSj, :apSk, :apSl, :apSm, " +
                " :apSn, :apSo, :apSp, :apSq, :apSr, :apSs, :apSt, :apSu, :apSv, :apSw, :apSx, :apSy, :apSz, " +
                " :apTa, :apTb, :apTc, :apTd, :apTe, :apTf, :apTg, :apTh, :apTi, :apTj, :apTk, :apTl, :apTm, " +
                " :apTn, :apTo, :apTp, :apTq, :apTr, :apTs, :apTt, :apTu, :apTv, :apTw, :apTx, :apTy, :apTz, " +
                " :apUa, :apUb, :apUc, :apUd, :apUe, :apUf, :apUg, :apUh, :apUi, :apUj, :apUk, :apUl, :apUm, " +
                " :apUn, :apUo, :apUp, :apUq, :apUr, :apUs, :apUt, :apUu, :apUv, :apUw, :apUx, :apUy, :apUz, " +
                " :apVa, :apVb, :apVc, :apVd, :apVe, :apVf, :apVg, :apVh, :apVi, :apVj, :apVk, :apVl, :apVm, " +
                " :apVn, :apVo, :apVp, :apVq, :apVr, :apVs, :apVt, :apVu, :apVv, :apVw, :apVx, :apVy, :apVz, " +
                " :apWa, :apWb, :apWc, :apWd, :apWe, :apWf, :apWg, :apWh, :apWi, :apWj, :apWk, :apWl, :apWm, " +
                " :apWn, :apWo, :apWp, :apWq, :apWr, :apWs, :apWt, :apWu, :apWv, :apWw, :apWx, :apWy, :apWz, " +
                " :apXa, :apXb, :apXc, :apXd, :apXe, :apXf, :apXg, :apXh, :apXi, :apXj, :apXk, :apXl, :apXm, " +
                " :apXn, :apXo, :apXp, :apXq, :apXr, :apXs, :apXt, :apXu, :apXv, :apXw, :apXx, :apXy, :apXz, " +
                " :apYa, :apYb, :apYc, :apYd, :apYe, :apYf, :apYg, :apYh, :apYi, :apYj, :apYk, :apYl, :apYm, " +
                " :apYn, :apYo, :apYp, :apYq, :apYr, :apYs, :apYt, :apYu, :apYv, :apYw, :apYx, :apYy, :apYz, " +
                " :apZa, :apZb, :apZc, :apZd, :apZe, :apZf, :apZg, :apZh, :apZi, :apZj, :apZk, :apZl, :apZm, " +
                " :apZn, :apZo, :apZp, :apZq, :apZr, :apZs, :apZt, :apZu, :apZv, :apZw, :apZx, :apZy, :apZz ) ";

        MapSqlParameterSource[] myParameterSourceAry = new MapSqlParameterSource[dataFeedAirticketPrice02List.size()];

        for (int i = 0; i < dataFeedAirticketPrice02List.size() ; i++) {
            DataFeedAirticketPrice02 wkDataFeedAirticketPrice02 = dataFeedAirticketPrice02List.get(i);

            myParameterSourceAry[i] = new MapSqlParameterSource();

            myParameterSourceAry[i].addValue("fileNo", wkDataFeedAirticketPrice02.getFileNo());
            myParameterSourceAry[i].addValue("priceNo", wkDataFeedAirticketPrice02.getPriceNo());
            myParameterSourceAry[i].addValue("apNa", wkDataFeedAirticketPrice02.getApNa());
            myParameterSourceAry[i].addValue("apNb", wkDataFeedAirticketPrice02.getApNb());
            myParameterSourceAry[i].addValue("apNc", wkDataFeedAirticketPrice02.getApNc());
            myParameterSourceAry[i].addValue("apNd", wkDataFeedAirticketPrice02.getApNd());
            myParameterSourceAry[i].addValue("apNe", wkDataFeedAirticketPrice02.getApNe());
            myParameterSourceAry[i].addValue("apNf", wkDataFeedAirticketPrice02.getApNf());
            myParameterSourceAry[i].addValue("apNg", wkDataFeedAirticketPrice02.getApNg());
            myParameterSourceAry[i].addValue("apNh", wkDataFeedAirticketPrice02.getApNh());
            myParameterSourceAry[i].addValue("apNi", wkDataFeedAirticketPrice02.getApNi());
            myParameterSourceAry[i].addValue("apNj", wkDataFeedAirticketPrice02.getApNj());
            myParameterSourceAry[i].addValue("apNk", wkDataFeedAirticketPrice02.getApNk());
            myParameterSourceAry[i].addValue("apNl", wkDataFeedAirticketPrice02.getApNl());
            myParameterSourceAry[i].addValue("apNm", wkDataFeedAirticketPrice02.getApNm());
            myParameterSourceAry[i].addValue("apNn", wkDataFeedAirticketPrice02.getApNn());
            myParameterSourceAry[i].addValue("apNo", wkDataFeedAirticketPrice02.getApNo());
            myParameterSourceAry[i].addValue("apNp", wkDataFeedAirticketPrice02.getApNp());
            myParameterSourceAry[i].addValue("apNq", wkDataFeedAirticketPrice02.getApNq());
            myParameterSourceAry[i].addValue("apNr", wkDataFeedAirticketPrice02.getApNr());
            myParameterSourceAry[i].addValue("apNs", wkDataFeedAirticketPrice02.getApNs());
            myParameterSourceAry[i].addValue("apNt", wkDataFeedAirticketPrice02.getApNt());
            myParameterSourceAry[i].addValue("apNu", wkDataFeedAirticketPrice02.getApNu());
            myParameterSourceAry[i].addValue("apNv", wkDataFeedAirticketPrice02.getApNv());
            myParameterSourceAry[i].addValue("apNw", wkDataFeedAirticketPrice02.getApNw());
            myParameterSourceAry[i].addValue("apNx", wkDataFeedAirticketPrice02.getApNx());
            myParameterSourceAry[i].addValue("apNy", wkDataFeedAirticketPrice02.getApNy());
            myParameterSourceAry[i].addValue("apNz", wkDataFeedAirticketPrice02.getApNz());
            myParameterSourceAry[i].addValue("apOa", wkDataFeedAirticketPrice02.getApOa());
            myParameterSourceAry[i].addValue("apOb", wkDataFeedAirticketPrice02.getApOb());
            myParameterSourceAry[i].addValue("apOc", wkDataFeedAirticketPrice02.getApOc());
            myParameterSourceAry[i].addValue("apOd", wkDataFeedAirticketPrice02.getApOd());
            myParameterSourceAry[i].addValue("apOe", wkDataFeedAirticketPrice02.getApOe());
            myParameterSourceAry[i].addValue("apOf", wkDataFeedAirticketPrice02.getApOf());
            myParameterSourceAry[i].addValue("apOg", wkDataFeedAirticketPrice02.getApOg());
            myParameterSourceAry[i].addValue("apOh", wkDataFeedAirticketPrice02.getApOh());
            myParameterSourceAry[i].addValue("apOi", wkDataFeedAirticketPrice02.getApOi());
            myParameterSourceAry[i].addValue("apOj", wkDataFeedAirticketPrice02.getApOj());
            myParameterSourceAry[i].addValue("apOk", wkDataFeedAirticketPrice02.getApOk());
            myParameterSourceAry[i].addValue("apOl", wkDataFeedAirticketPrice02.getApOl());
            myParameterSourceAry[i].addValue("apOm", wkDataFeedAirticketPrice02.getApOm());
            myParameterSourceAry[i].addValue("apOn", wkDataFeedAirticketPrice02.getApOn());
            myParameterSourceAry[i].addValue("apOo", wkDataFeedAirticketPrice02.getApOo());
            myParameterSourceAry[i].addValue("apOp", wkDataFeedAirticketPrice02.getApOp());
            myParameterSourceAry[i].addValue("apOq", wkDataFeedAirticketPrice02.getApOq());
            myParameterSourceAry[i].addValue("apOr", wkDataFeedAirticketPrice02.getApOr());
            myParameterSourceAry[i].addValue("apOs", wkDataFeedAirticketPrice02.getApOs());
            myParameterSourceAry[i].addValue("apOt", wkDataFeedAirticketPrice02.getApOt());
            myParameterSourceAry[i].addValue("apOu", wkDataFeedAirticketPrice02.getApOu());
            myParameterSourceAry[i].addValue("apOv", wkDataFeedAirticketPrice02.getApOv());
            myParameterSourceAry[i].addValue("apOw", wkDataFeedAirticketPrice02.getApOw());
            myParameterSourceAry[i].addValue("apOx", wkDataFeedAirticketPrice02.getApOx());
            myParameterSourceAry[i].addValue("apOy", wkDataFeedAirticketPrice02.getApOy());
            myParameterSourceAry[i].addValue("apOz", wkDataFeedAirticketPrice02.getApOz());
            myParameterSourceAry[i].addValue("apPa", wkDataFeedAirticketPrice02.getApPa());
            myParameterSourceAry[i].addValue("apPb", wkDataFeedAirticketPrice02.getApPb());
            myParameterSourceAry[i].addValue("apPc", wkDataFeedAirticketPrice02.getApPc());
            myParameterSourceAry[i].addValue("apPd", wkDataFeedAirticketPrice02.getApPd());
            myParameterSourceAry[i].addValue("apPe", wkDataFeedAirticketPrice02.getApPe());
            myParameterSourceAry[i].addValue("apPf", wkDataFeedAirticketPrice02.getApPf());
            myParameterSourceAry[i].addValue("apPg", wkDataFeedAirticketPrice02.getApPg());
            myParameterSourceAry[i].addValue("apPh", wkDataFeedAirticketPrice02.getApPh());
            myParameterSourceAry[i].addValue("apPi", wkDataFeedAirticketPrice02.getApPi());
            myParameterSourceAry[i].addValue("apPj", wkDataFeedAirticketPrice02.getApPj());
            myParameterSourceAry[i].addValue("apPk", wkDataFeedAirticketPrice02.getApPk());
            myParameterSourceAry[i].addValue("apPl", wkDataFeedAirticketPrice02.getApPl());
            myParameterSourceAry[i].addValue("apPm", wkDataFeedAirticketPrice02.getApPm());
            myParameterSourceAry[i].addValue("apPn", wkDataFeedAirticketPrice02.getApPn());
            myParameterSourceAry[i].addValue("apPo", wkDataFeedAirticketPrice02.getApPo());
            myParameterSourceAry[i].addValue("apPp", wkDataFeedAirticketPrice02.getApPp());
            myParameterSourceAry[i].addValue("apPq", wkDataFeedAirticketPrice02.getApPq());
            myParameterSourceAry[i].addValue("apPr", wkDataFeedAirticketPrice02.getApPr());
            myParameterSourceAry[i].addValue("apPs", wkDataFeedAirticketPrice02.getApPs());
            myParameterSourceAry[i].addValue("apPt", wkDataFeedAirticketPrice02.getApPt());
            myParameterSourceAry[i].addValue("apPu", wkDataFeedAirticketPrice02.getApPu());
            myParameterSourceAry[i].addValue("apPv", wkDataFeedAirticketPrice02.getApPv());
            myParameterSourceAry[i].addValue("apPw", wkDataFeedAirticketPrice02.getApPw());
            myParameterSourceAry[i].addValue("apPx", wkDataFeedAirticketPrice02.getApPx());
            myParameterSourceAry[i].addValue("apPy", wkDataFeedAirticketPrice02.getApPy());
            myParameterSourceAry[i].addValue("apPz", wkDataFeedAirticketPrice02.getApPz());
            myParameterSourceAry[i].addValue("apQa", wkDataFeedAirticketPrice02.getApQa());
            myParameterSourceAry[i].addValue("apQb", wkDataFeedAirticketPrice02.getApQb());
            myParameterSourceAry[i].addValue("apQc", wkDataFeedAirticketPrice02.getApQc());
            myParameterSourceAry[i].addValue("apQd", wkDataFeedAirticketPrice02.getApQd());
            myParameterSourceAry[i].addValue("apQe", wkDataFeedAirticketPrice02.getApQe());
            myParameterSourceAry[i].addValue("apQf", wkDataFeedAirticketPrice02.getApQf());
            myParameterSourceAry[i].addValue("apQg", wkDataFeedAirticketPrice02.getApQg());
            myParameterSourceAry[i].addValue("apQh", wkDataFeedAirticketPrice02.getApQh());
            myParameterSourceAry[i].addValue("apQi", wkDataFeedAirticketPrice02.getApQi());
            myParameterSourceAry[i].addValue("apQj", wkDataFeedAirticketPrice02.getApQj());
            myParameterSourceAry[i].addValue("apQk", wkDataFeedAirticketPrice02.getApQk());
            myParameterSourceAry[i].addValue("apQl", wkDataFeedAirticketPrice02.getApQl());
            myParameterSourceAry[i].addValue("apQm", wkDataFeedAirticketPrice02.getApQm());
            myParameterSourceAry[i].addValue("apQn", wkDataFeedAirticketPrice02.getApQn());
            myParameterSourceAry[i].addValue("apQo", wkDataFeedAirticketPrice02.getApQo());
            myParameterSourceAry[i].addValue("apQp", wkDataFeedAirticketPrice02.getApQp());
            myParameterSourceAry[i].addValue("apQq", wkDataFeedAirticketPrice02.getApQq());
            myParameterSourceAry[i].addValue("apQr", wkDataFeedAirticketPrice02.getApQr());
            myParameterSourceAry[i].addValue("apQs", wkDataFeedAirticketPrice02.getApQs());
            myParameterSourceAry[i].addValue("apQt", wkDataFeedAirticketPrice02.getApQt());
            myParameterSourceAry[i].addValue("apQu", wkDataFeedAirticketPrice02.getApQu());
            myParameterSourceAry[i].addValue("apQv", wkDataFeedAirticketPrice02.getApQv());
            myParameterSourceAry[i].addValue("apQw", wkDataFeedAirticketPrice02.getApQw());
            myParameterSourceAry[i].addValue("apQx", wkDataFeedAirticketPrice02.getApQx());
            myParameterSourceAry[i].addValue("apQy", wkDataFeedAirticketPrice02.getApQy());
            myParameterSourceAry[i].addValue("apQz", wkDataFeedAirticketPrice02.getApQz());
            myParameterSourceAry[i].addValue("apRa", wkDataFeedAirticketPrice02.getApRa());
            myParameterSourceAry[i].addValue("apRb", wkDataFeedAirticketPrice02.getApRb());
            myParameterSourceAry[i].addValue("apRc", wkDataFeedAirticketPrice02.getApRc());
            myParameterSourceAry[i].addValue("apRd", wkDataFeedAirticketPrice02.getApRd());
            myParameterSourceAry[i].addValue("apRe", wkDataFeedAirticketPrice02.getApRe());
            myParameterSourceAry[i].addValue("apRf", wkDataFeedAirticketPrice02.getApRf());
            myParameterSourceAry[i].addValue("apRg", wkDataFeedAirticketPrice02.getApRg());
            myParameterSourceAry[i].addValue("apRh", wkDataFeedAirticketPrice02.getApRh());
            myParameterSourceAry[i].addValue("apRi", wkDataFeedAirticketPrice02.getApRi());
            myParameterSourceAry[i].addValue("apRj", wkDataFeedAirticketPrice02.getApRj());
            myParameterSourceAry[i].addValue("apRk", wkDataFeedAirticketPrice02.getApRk());
            myParameterSourceAry[i].addValue("apRl", wkDataFeedAirticketPrice02.getApRl());
            myParameterSourceAry[i].addValue("apRm", wkDataFeedAirticketPrice02.getApRm());
            myParameterSourceAry[i].addValue("apRn", wkDataFeedAirticketPrice02.getApRn());
            myParameterSourceAry[i].addValue("apRo", wkDataFeedAirticketPrice02.getApRo());
            myParameterSourceAry[i].addValue("apRp", wkDataFeedAirticketPrice02.getApRp());
            myParameterSourceAry[i].addValue("apRq", wkDataFeedAirticketPrice02.getApRq());
            myParameterSourceAry[i].addValue("apRr", wkDataFeedAirticketPrice02.getApRr());
            myParameterSourceAry[i].addValue("apRs", wkDataFeedAirticketPrice02.getApRs());
            myParameterSourceAry[i].addValue("apRt", wkDataFeedAirticketPrice02.getApRt());
            myParameterSourceAry[i].addValue("apRu", wkDataFeedAirticketPrice02.getApRu());
            myParameterSourceAry[i].addValue("apRv", wkDataFeedAirticketPrice02.getApRv());
            myParameterSourceAry[i].addValue("apRw", wkDataFeedAirticketPrice02.getApRw());
            myParameterSourceAry[i].addValue("apRx", wkDataFeedAirticketPrice02.getApRx());
            myParameterSourceAry[i].addValue("apRy", wkDataFeedAirticketPrice02.getApRy());
            myParameterSourceAry[i].addValue("apRz", wkDataFeedAirticketPrice02.getApRz());
            myParameterSourceAry[i].addValue("apSa", wkDataFeedAirticketPrice02.getApSa());
            myParameterSourceAry[i].addValue("apSb", wkDataFeedAirticketPrice02.getApSb());
            myParameterSourceAry[i].addValue("apSc", wkDataFeedAirticketPrice02.getApSc());
            myParameterSourceAry[i].addValue("apSd", wkDataFeedAirticketPrice02.getApSd());
            myParameterSourceAry[i].addValue("apSe", wkDataFeedAirticketPrice02.getApSe());
            myParameterSourceAry[i].addValue("apSf", wkDataFeedAirticketPrice02.getApSf());
            myParameterSourceAry[i].addValue("apSg", wkDataFeedAirticketPrice02.getApSg());
            myParameterSourceAry[i].addValue("apSh", wkDataFeedAirticketPrice02.getApSh());
            myParameterSourceAry[i].addValue("apSi", wkDataFeedAirticketPrice02.getApSi());
            myParameterSourceAry[i].addValue("apSj", wkDataFeedAirticketPrice02.getApSj());
            myParameterSourceAry[i].addValue("apSk", wkDataFeedAirticketPrice02.getApSk());
            myParameterSourceAry[i].addValue("apSl", wkDataFeedAirticketPrice02.getApSl());
            myParameterSourceAry[i].addValue("apSm", wkDataFeedAirticketPrice02.getApSm());
            myParameterSourceAry[i].addValue("apSn", wkDataFeedAirticketPrice02.getApSn());
            myParameterSourceAry[i].addValue("apSo", wkDataFeedAirticketPrice02.getApSo());
            myParameterSourceAry[i].addValue("apSp", wkDataFeedAirticketPrice02.getApSp());
            myParameterSourceAry[i].addValue("apSq", wkDataFeedAirticketPrice02.getApSq());
            myParameterSourceAry[i].addValue("apSr", wkDataFeedAirticketPrice02.getApSr());
            myParameterSourceAry[i].addValue("apSs", wkDataFeedAirticketPrice02.getApSs());
            myParameterSourceAry[i].addValue("apSt", wkDataFeedAirticketPrice02.getApSt());
            myParameterSourceAry[i].addValue("apSu", wkDataFeedAirticketPrice02.getApSu());
            myParameterSourceAry[i].addValue("apSv", wkDataFeedAirticketPrice02.getApSv());
            myParameterSourceAry[i].addValue("apSw", wkDataFeedAirticketPrice02.getApSw());
            myParameterSourceAry[i].addValue("apSx", wkDataFeedAirticketPrice02.getApSx());
            myParameterSourceAry[i].addValue("apSy", wkDataFeedAirticketPrice02.getApSy());
            myParameterSourceAry[i].addValue("apSz", wkDataFeedAirticketPrice02.getApSz());
            myParameterSourceAry[i].addValue("apTa", wkDataFeedAirticketPrice02.getApTa());
            myParameterSourceAry[i].addValue("apTb", wkDataFeedAirticketPrice02.getApTb());
            myParameterSourceAry[i].addValue("apTc", wkDataFeedAirticketPrice02.getApTc());
            myParameterSourceAry[i].addValue("apTd", wkDataFeedAirticketPrice02.getApTd());
            myParameterSourceAry[i].addValue("apTe", wkDataFeedAirticketPrice02.getApTe());
            myParameterSourceAry[i].addValue("apTf", wkDataFeedAirticketPrice02.getApTf());
            myParameterSourceAry[i].addValue("apTg", wkDataFeedAirticketPrice02.getApTg());
            myParameterSourceAry[i].addValue("apTh", wkDataFeedAirticketPrice02.getApTh());
            myParameterSourceAry[i].addValue("apTi", wkDataFeedAirticketPrice02.getApTi());
            myParameterSourceAry[i].addValue("apTj", wkDataFeedAirticketPrice02.getApTj());
            myParameterSourceAry[i].addValue("apTk", wkDataFeedAirticketPrice02.getApTk());
            myParameterSourceAry[i].addValue("apTl", wkDataFeedAirticketPrice02.getApTl());
            myParameterSourceAry[i].addValue("apTm", wkDataFeedAirticketPrice02.getApTm());
            myParameterSourceAry[i].addValue("apTn", wkDataFeedAirticketPrice02.getApTn());
            myParameterSourceAry[i].addValue("apTo", wkDataFeedAirticketPrice02.getApTo());
            myParameterSourceAry[i].addValue("apTp", wkDataFeedAirticketPrice02.getApTp());
            myParameterSourceAry[i].addValue("apTq", wkDataFeedAirticketPrice02.getApTq());
            myParameterSourceAry[i].addValue("apTr", wkDataFeedAirticketPrice02.getApTr());
            myParameterSourceAry[i].addValue("apTs", wkDataFeedAirticketPrice02.getApTs());
            myParameterSourceAry[i].addValue("apTt", wkDataFeedAirticketPrice02.getApTt());
            myParameterSourceAry[i].addValue("apTu", wkDataFeedAirticketPrice02.getApTu());
            myParameterSourceAry[i].addValue("apTv", wkDataFeedAirticketPrice02.getApTv());
            myParameterSourceAry[i].addValue("apTw", wkDataFeedAirticketPrice02.getApTw());
            myParameterSourceAry[i].addValue("apTx", wkDataFeedAirticketPrice02.getApTx());
            myParameterSourceAry[i].addValue("apTy", wkDataFeedAirticketPrice02.getApTy());
            myParameterSourceAry[i].addValue("apTz", wkDataFeedAirticketPrice02.getApTz());
            myParameterSourceAry[i].addValue("apUa", wkDataFeedAirticketPrice02.getApUa());
            myParameterSourceAry[i].addValue("apUb", wkDataFeedAirticketPrice02.getApUb());
            myParameterSourceAry[i].addValue("apUc", wkDataFeedAirticketPrice02.getApUc());
            myParameterSourceAry[i].addValue("apUd", wkDataFeedAirticketPrice02.getApUd());
            myParameterSourceAry[i].addValue("apUe", wkDataFeedAirticketPrice02.getApUe());
            myParameterSourceAry[i].addValue("apUf", wkDataFeedAirticketPrice02.getApUf());
            myParameterSourceAry[i].addValue("apUg", wkDataFeedAirticketPrice02.getApUg());
            myParameterSourceAry[i].addValue("apUh", wkDataFeedAirticketPrice02.getApUh());
            myParameterSourceAry[i].addValue("apUi", wkDataFeedAirticketPrice02.getApUi());
            myParameterSourceAry[i].addValue("apUj", wkDataFeedAirticketPrice02.getApUj());
            myParameterSourceAry[i].addValue("apUk", wkDataFeedAirticketPrice02.getApUk());
            myParameterSourceAry[i].addValue("apUl", wkDataFeedAirticketPrice02.getApUl());
            myParameterSourceAry[i].addValue("apUm", wkDataFeedAirticketPrice02.getApUm());
            myParameterSourceAry[i].addValue("apUn", wkDataFeedAirticketPrice02.getApUn());
            myParameterSourceAry[i].addValue("apUo", wkDataFeedAirticketPrice02.getApUo());
            myParameterSourceAry[i].addValue("apUp", wkDataFeedAirticketPrice02.getApUp());
            myParameterSourceAry[i].addValue("apUq", wkDataFeedAirticketPrice02.getApUq());
            myParameterSourceAry[i].addValue("apUr", wkDataFeedAirticketPrice02.getApUr());
            myParameterSourceAry[i].addValue("apUs", wkDataFeedAirticketPrice02.getApUs());
            myParameterSourceAry[i].addValue("apUt", wkDataFeedAirticketPrice02.getApUt());
            myParameterSourceAry[i].addValue("apUu", wkDataFeedAirticketPrice02.getApUu());
            myParameterSourceAry[i].addValue("apUv", wkDataFeedAirticketPrice02.getApUv());
            myParameterSourceAry[i].addValue("apUw", wkDataFeedAirticketPrice02.getApUw());
            myParameterSourceAry[i].addValue("apUx", wkDataFeedAirticketPrice02.getApUx());
            myParameterSourceAry[i].addValue("apUy", wkDataFeedAirticketPrice02.getApUy());
            myParameterSourceAry[i].addValue("apUz", wkDataFeedAirticketPrice02.getApUz());
            myParameterSourceAry[i].addValue("apVa", wkDataFeedAirticketPrice02.getApVa());
            myParameterSourceAry[i].addValue("apVb", wkDataFeedAirticketPrice02.getApVb());
            myParameterSourceAry[i].addValue("apVc", wkDataFeedAirticketPrice02.getApVc());
            myParameterSourceAry[i].addValue("apVd", wkDataFeedAirticketPrice02.getApVd());
            myParameterSourceAry[i].addValue("apVe", wkDataFeedAirticketPrice02.getApVe());
            myParameterSourceAry[i].addValue("apVf", wkDataFeedAirticketPrice02.getApVf());
            myParameterSourceAry[i].addValue("apVg", wkDataFeedAirticketPrice02.getApVg());
            myParameterSourceAry[i].addValue("apVh", wkDataFeedAirticketPrice02.getApVh());
            myParameterSourceAry[i].addValue("apVi", wkDataFeedAirticketPrice02.getApVi());
            myParameterSourceAry[i].addValue("apVj", wkDataFeedAirticketPrice02.getApVj());
            myParameterSourceAry[i].addValue("apVk", wkDataFeedAirticketPrice02.getApVk());
            myParameterSourceAry[i].addValue("apVl", wkDataFeedAirticketPrice02.getApVl());
            myParameterSourceAry[i].addValue("apVm", wkDataFeedAirticketPrice02.getApVm());
            myParameterSourceAry[i].addValue("apVn", wkDataFeedAirticketPrice02.getApVn());
            myParameterSourceAry[i].addValue("apVo", wkDataFeedAirticketPrice02.getApVo());
            myParameterSourceAry[i].addValue("apVp", wkDataFeedAirticketPrice02.getApVp());
            myParameterSourceAry[i].addValue("apVq", wkDataFeedAirticketPrice02.getApVq());
            myParameterSourceAry[i].addValue("apVr", wkDataFeedAirticketPrice02.getApVr());
            myParameterSourceAry[i].addValue("apVs", wkDataFeedAirticketPrice02.getApVs());
            myParameterSourceAry[i].addValue("apVt", wkDataFeedAirticketPrice02.getApVt());
            myParameterSourceAry[i].addValue("apVu", wkDataFeedAirticketPrice02.getApVu());
            myParameterSourceAry[i].addValue("apVv", wkDataFeedAirticketPrice02.getApVv());
            myParameterSourceAry[i].addValue("apVw", wkDataFeedAirticketPrice02.getApVw());
            myParameterSourceAry[i].addValue("apVx", wkDataFeedAirticketPrice02.getApVx());
            myParameterSourceAry[i].addValue("apVy", wkDataFeedAirticketPrice02.getApVy());
            myParameterSourceAry[i].addValue("apVz", wkDataFeedAirticketPrice02.getApVz());
            myParameterSourceAry[i].addValue("apWa", wkDataFeedAirticketPrice02.getApWa());
            myParameterSourceAry[i].addValue("apWb", wkDataFeedAirticketPrice02.getApWb());
            myParameterSourceAry[i].addValue("apWc", wkDataFeedAirticketPrice02.getApWc());
            myParameterSourceAry[i].addValue("apWd", wkDataFeedAirticketPrice02.getApWd());
            myParameterSourceAry[i].addValue("apWe", wkDataFeedAirticketPrice02.getApWe());
            myParameterSourceAry[i].addValue("apWf", wkDataFeedAirticketPrice02.getApWf());
            myParameterSourceAry[i].addValue("apWg", wkDataFeedAirticketPrice02.getApWg());
            myParameterSourceAry[i].addValue("apWh", wkDataFeedAirticketPrice02.getApWh());
            myParameterSourceAry[i].addValue("apWi", wkDataFeedAirticketPrice02.getApWi());
            myParameterSourceAry[i].addValue("apWj", wkDataFeedAirticketPrice02.getApWj());
            myParameterSourceAry[i].addValue("apWk", wkDataFeedAirticketPrice02.getApWk());
            myParameterSourceAry[i].addValue("apWl", wkDataFeedAirticketPrice02.getApWl());
            myParameterSourceAry[i].addValue("apWm", wkDataFeedAirticketPrice02.getApWm());
            myParameterSourceAry[i].addValue("apWn", wkDataFeedAirticketPrice02.getApWn());
            myParameterSourceAry[i].addValue("apWo", wkDataFeedAirticketPrice02.getApWo());
            myParameterSourceAry[i].addValue("apWp", wkDataFeedAirticketPrice02.getApWp());
            myParameterSourceAry[i].addValue("apWq", wkDataFeedAirticketPrice02.getApWq());
            myParameterSourceAry[i].addValue("apWr", wkDataFeedAirticketPrice02.getApWr());
            myParameterSourceAry[i].addValue("apWs", wkDataFeedAirticketPrice02.getApWs());
            myParameterSourceAry[i].addValue("apWt", wkDataFeedAirticketPrice02.getApWt());
            myParameterSourceAry[i].addValue("apWu", wkDataFeedAirticketPrice02.getApWu());
            myParameterSourceAry[i].addValue("apWv", wkDataFeedAirticketPrice02.getApWv());
            myParameterSourceAry[i].addValue("apWw", wkDataFeedAirticketPrice02.getApWw());
            myParameterSourceAry[i].addValue("apWx", wkDataFeedAirticketPrice02.getApWx());
            myParameterSourceAry[i].addValue("apWy", wkDataFeedAirticketPrice02.getApWy());
            myParameterSourceAry[i].addValue("apWz", wkDataFeedAirticketPrice02.getApWz());
            myParameterSourceAry[i].addValue("apXa", wkDataFeedAirticketPrice02.getApXa());
            myParameterSourceAry[i].addValue("apXb", wkDataFeedAirticketPrice02.getApXb());
            myParameterSourceAry[i].addValue("apXc", wkDataFeedAirticketPrice02.getApXc());
            myParameterSourceAry[i].addValue("apXd", wkDataFeedAirticketPrice02.getApXd());
            myParameterSourceAry[i].addValue("apXe", wkDataFeedAirticketPrice02.getApXe());
            myParameterSourceAry[i].addValue("apXf", wkDataFeedAirticketPrice02.getApXf());
            myParameterSourceAry[i].addValue("apXg", wkDataFeedAirticketPrice02.getApXg());
            myParameterSourceAry[i].addValue("apXh", wkDataFeedAirticketPrice02.getApXh());
            myParameterSourceAry[i].addValue("apXi", wkDataFeedAirticketPrice02.getApXi());
            myParameterSourceAry[i].addValue("apXj", wkDataFeedAirticketPrice02.getApXj());
            myParameterSourceAry[i].addValue("apXk", wkDataFeedAirticketPrice02.getApXk());
            myParameterSourceAry[i].addValue("apXl", wkDataFeedAirticketPrice02.getApXl());
            myParameterSourceAry[i].addValue("apXm", wkDataFeedAirticketPrice02.getApXm());
            myParameterSourceAry[i].addValue("apXn", wkDataFeedAirticketPrice02.getApXn());
            myParameterSourceAry[i].addValue("apXo", wkDataFeedAirticketPrice02.getApXo());
            myParameterSourceAry[i].addValue("apXp", wkDataFeedAirticketPrice02.getApXp());
            myParameterSourceAry[i].addValue("apXq", wkDataFeedAirticketPrice02.getApXq());
            myParameterSourceAry[i].addValue("apXr", wkDataFeedAirticketPrice02.getApXr());
            myParameterSourceAry[i].addValue("apXs", wkDataFeedAirticketPrice02.getApXs());
            myParameterSourceAry[i].addValue("apXt", wkDataFeedAirticketPrice02.getApXt());
            myParameterSourceAry[i].addValue("apXu", wkDataFeedAirticketPrice02.getApXu());
            myParameterSourceAry[i].addValue("apXv", wkDataFeedAirticketPrice02.getApXv());
            myParameterSourceAry[i].addValue("apXw", wkDataFeedAirticketPrice02.getApXw());
            myParameterSourceAry[i].addValue("apXx", wkDataFeedAirticketPrice02.getApXx());
            myParameterSourceAry[i].addValue("apXy", wkDataFeedAirticketPrice02.getApXy());
            myParameterSourceAry[i].addValue("apXz", wkDataFeedAirticketPrice02.getApXz());
            myParameterSourceAry[i].addValue("apYa", wkDataFeedAirticketPrice02.getApYa());
            myParameterSourceAry[i].addValue("apYb", wkDataFeedAirticketPrice02.getApYb());
            myParameterSourceAry[i].addValue("apYc", wkDataFeedAirticketPrice02.getApYc());
            myParameterSourceAry[i].addValue("apYd", wkDataFeedAirticketPrice02.getApYd());
            myParameterSourceAry[i].addValue("apYe", wkDataFeedAirticketPrice02.getApYe());
            myParameterSourceAry[i].addValue("apYf", wkDataFeedAirticketPrice02.getApYf());
            myParameterSourceAry[i].addValue("apYg", wkDataFeedAirticketPrice02.getApYg());
            myParameterSourceAry[i].addValue("apYh", wkDataFeedAirticketPrice02.getApYh());
            myParameterSourceAry[i].addValue("apYi", wkDataFeedAirticketPrice02.getApYi());
            myParameterSourceAry[i].addValue("apYj", wkDataFeedAirticketPrice02.getApYj());
            myParameterSourceAry[i].addValue("apYk", wkDataFeedAirticketPrice02.getApYk());
            myParameterSourceAry[i].addValue("apYl", wkDataFeedAirticketPrice02.getApYl());
            myParameterSourceAry[i].addValue("apYm", wkDataFeedAirticketPrice02.getApYm());
            myParameterSourceAry[i].addValue("apYn", wkDataFeedAirticketPrice02.getApYn());
            myParameterSourceAry[i].addValue("apYo", wkDataFeedAirticketPrice02.getApYo());
            myParameterSourceAry[i].addValue("apYp", wkDataFeedAirticketPrice02.getApYp());
            myParameterSourceAry[i].addValue("apYq", wkDataFeedAirticketPrice02.getApYq());
            myParameterSourceAry[i].addValue("apYr", wkDataFeedAirticketPrice02.getApYr());
            myParameterSourceAry[i].addValue("apYs", wkDataFeedAirticketPrice02.getApYs());
            myParameterSourceAry[i].addValue("apYt", wkDataFeedAirticketPrice02.getApYt());
            myParameterSourceAry[i].addValue("apYu", wkDataFeedAirticketPrice02.getApYu());
            myParameterSourceAry[i].addValue("apYv", wkDataFeedAirticketPrice02.getApYv());
            myParameterSourceAry[i].addValue("apYw", wkDataFeedAirticketPrice02.getApYw());
            myParameterSourceAry[i].addValue("apYx", wkDataFeedAirticketPrice02.getApYx());
            myParameterSourceAry[i].addValue("apYy", wkDataFeedAirticketPrice02.getApYy());
            myParameterSourceAry[i].addValue("apYz", wkDataFeedAirticketPrice02.getApYz());
            myParameterSourceAry[i].addValue("apZa", wkDataFeedAirticketPrice02.getApZa());
            myParameterSourceAry[i].addValue("apZb", wkDataFeedAirticketPrice02.getApZb());
            myParameterSourceAry[i].addValue("apZc", wkDataFeedAirticketPrice02.getApZc());
            myParameterSourceAry[i].addValue("apZd", wkDataFeedAirticketPrice02.getApZd());
            myParameterSourceAry[i].addValue("apZe", wkDataFeedAirticketPrice02.getApZe());
            myParameterSourceAry[i].addValue("apZf", wkDataFeedAirticketPrice02.getApZf());
            myParameterSourceAry[i].addValue("apZg", wkDataFeedAirticketPrice02.getApZg());
            myParameterSourceAry[i].addValue("apZh", wkDataFeedAirticketPrice02.getApZh());
            myParameterSourceAry[i].addValue("apZi", wkDataFeedAirticketPrice02.getApZi());
            myParameterSourceAry[i].addValue("apZj", wkDataFeedAirticketPrice02.getApZj());
            myParameterSourceAry[i].addValue("apZk", wkDataFeedAirticketPrice02.getApZk());
            myParameterSourceAry[i].addValue("apZl", wkDataFeedAirticketPrice02.getApZl());
            myParameterSourceAry[i].addValue("apZm", wkDataFeedAirticketPrice02.getApZm());
            myParameterSourceAry[i].addValue("apZn", wkDataFeedAirticketPrice02.getApZn());
            myParameterSourceAry[i].addValue("apZo", wkDataFeedAirticketPrice02.getApZo());
            myParameterSourceAry[i].addValue("apZp", wkDataFeedAirticketPrice02.getApZp());
            myParameterSourceAry[i].addValue("apZq", wkDataFeedAirticketPrice02.getApZq());
            myParameterSourceAry[i].addValue("apZr", wkDataFeedAirticketPrice02.getApZr());
            myParameterSourceAry[i].addValue("apZs", wkDataFeedAirticketPrice02.getApZs());
            myParameterSourceAry[i].addValue("apZt", wkDataFeedAirticketPrice02.getApZt());
            myParameterSourceAry[i].addValue("apZu", wkDataFeedAirticketPrice02.getApZu());
            myParameterSourceAry[i].addValue("apZv", wkDataFeedAirticketPrice02.getApZv());
            myParameterSourceAry[i].addValue("apZw", wkDataFeedAirticketPrice02.getApZw());
            myParameterSourceAry[i].addValue("apZx", wkDataFeedAirticketPrice02.getApZx());
            myParameterSourceAry[i].addValue("apZy", wkDataFeedAirticketPrice02.getApZy());
            myParameterSourceAry[i].addValue("apZz", wkDataFeedAirticketPrice02.getApZz());
        }

        myNamedParameterJdbcTemplate.batchUpdate(mySql, myParameterSourceAry);
    }

    @Override
    public void deleteDataFeedAirticketPrice02sByFileNo(Integer fileNo) {
        String mySql = "DELETE FROM db_airticket.data_feed_airticket_price_02 " +
                " WHERE file_no = :fileNo ";

        Map<String,Object> myMap = new HashMap<>();
        myMap.put("fileNo", fileNo);

        myNamedParameterJdbcTemplate.update(mySql, myMap);
    }

}
