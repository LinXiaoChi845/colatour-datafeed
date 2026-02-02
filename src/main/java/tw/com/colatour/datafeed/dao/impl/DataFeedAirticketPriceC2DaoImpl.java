package tw.com.colatour.datafeed.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Component;
import tw.com.colatour.datafeed.dao.DataFeedAirticketPriceC2Dao;
import tw.com.colatour.datafeed.model.DataFeedAirticketPriceC2;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class DataFeedAirticketPriceC2DaoImpl implements DataFeedAirticketPriceC2Dao {

    @Autowired
    private NamedParameterJdbcTemplate myNamedParameterJdbcTemplate;

    @Override
    public void createDataFeedAirticketPriceC2s(List<DataFeedAirticketPriceC2> dataFeedAirticketPriceC2List) {
        String mySql = "INSERT INTO db_airticket.data_feed_airticket_price_c2 ( " +
                " file_no, price_no, " +
                " ap_cna, ap_cnb, ap_cnc, ap_cnd, ap_cne, ap_cnf, ap_cng, ap_cnh, ap_cni, ap_cnj, ap_cnk, ap_cnl, ap_cnm, " +
                " ap_cnn, ap_cno, ap_cnp, ap_cnq, ap_cnr, ap_cns, ap_cnt, ap_cnu, ap_cnv, ap_cnw, ap_cnx, ap_cny, ap_cnz, " +
                " ap_coa, ap_cob, ap_coc, ap_cod, ap_coe, ap_cof, ap_cog, ap_coh, ap_coi, ap_coj, ap_cok, ap_col, ap_com, " +
                " ap_con, ap_coo, ap_cop, ap_coq, ap_cor, ap_cos, ap_cot, ap_cou, ap_cov, ap_cow, ap_cox, ap_coy, ap_coz, " +
                " ap_cpa, ap_cpb, ap_cpc, ap_cpd, ap_cpe, ap_cpf, ap_cpg, ap_cph, ap_cpi, ap_cpj, ap_cpk, ap_cpl, ap_cpm, " +
                " ap_cpn, ap_cpo, ap_cpp, ap_cpq, ap_cpr, ap_cps, ap_cpt, ap_cpu, ap_cpv, ap_cpw, ap_cpx, ap_cpy, ap_cpz, " +
                " ap_cqa, ap_cqb, ap_cqc, ap_cqd, ap_cqe, ap_cqf, ap_cqg, ap_cqh, ap_cqi, ap_cqj, ap_cqk, ap_cql, ap_cqm, " +
                " ap_cqn, ap_cqo, ap_cqp, ap_cqq, ap_cqr, ap_cqs, ap_cqt, ap_cqu, ap_cqv, ap_cqw, ap_cqx, ap_cqy, ap_cqz, " +
                " ap_cra, ap_crb, ap_crc, ap_crd, ap_cre, ap_crf, ap_crg, ap_crh, ap_cri, ap_crj, ap_crk, ap_crl, ap_crm, " +
                " ap_crn, ap_cro, ap_crp, ap_crq, ap_crr, ap_crs, ap_crt, ap_cru, ap_crv, ap_crw, ap_crx, ap_cry, ap_crz, " +
                " ap_csa, ap_csb, ap_csc, ap_csd, ap_cse, ap_csf, ap_csg, ap_csh, ap_csi, ap_csj, ap_csk, ap_csl, ap_csm, " +
                " ap_csn, ap_cso, ap_csp, ap_csq, ap_csr, ap_css, ap_cst, ap_csu, ap_csv, ap_csw, ap_csx, ap_csy, ap_csz, " +
                " ap_cta, ap_ctb, ap_ctc, ap_ctd, ap_cte, ap_ctf, ap_ctg, ap_cth, ap_cti, ap_ctj, ap_ctk, ap_ctl, ap_ctm, " +
                " ap_ctn, ap_cto, ap_ctp, ap_ctq, ap_ctr, ap_cts, ap_ctt, ap_ctu, ap_ctv, ap_ctw, ap_ctx, ap_cty, ap_ctz, " +
                " ap_cua, ap_cub, ap_cuc, ap_cud, ap_cue, ap_cuf, ap_cug, ap_cuh, ap_cui, ap_cuj, ap_cuk, ap_cul, ap_cum, " +
                " ap_cun, ap_cuo, ap_cup, ap_cuq, ap_cur, ap_cus, ap_cut, ap_cuu, ap_cuv, ap_cuw, ap_cux, ap_cuy, ap_cuz, " +
                " ap_cva, ap_cvb, ap_cvc, ap_cvd, ap_cve, ap_cvf, ap_cvg, ap_cvh, ap_cvi, ap_cvj, ap_cvk, ap_cvl, ap_cvm, " +
                " ap_cvn, ap_cvo, ap_cvp, ap_cvq, ap_cvr, ap_cvs, ap_cvt, ap_cvu, ap_cvv, ap_cvw, ap_cvx, ap_cvy, ap_cvz, " +
                " ap_cwa, ap_cwb, ap_cwc, ap_cwd, ap_cwe, ap_cwf, ap_cwg, ap_cwh, ap_cwi, ap_cwj, ap_cwk, ap_cwl, ap_cwm, " +
                " ap_cwn, ap_cwo, ap_cwp, ap_cwq, ap_cwr, ap_cws, ap_cwt, ap_cwu, ap_cwv, ap_cww, ap_cwx, ap_cwy, ap_cwz, " +
                " ap_cxa, ap_cxb, ap_cxc, ap_cxd, ap_cxe, ap_cxf, ap_cxg, ap_cxh, ap_cxi, ap_cxj, ap_cxk, ap_cxl, ap_cxm, " +
                " ap_cxn, ap_cxo, ap_cxp, ap_cxq, ap_cxr, ap_cxs, ap_cxt, ap_cxu, ap_cxv, ap_cxw, ap_cxx, ap_cxy, ap_cxz, " +
                " ap_cya, ap_cyb, ap_cyc, ap_cyd, ap_cye, ap_cyf, ap_cyg, ap_cyh, ap_cyi, ap_cyj, ap_cyk, ap_cyl, ap_cym, " +
                " ap_cyn, ap_cyo, ap_cyp, ap_cyq, ap_cyr, ap_cys, ap_cyt, ap_cyu, ap_cyv, ap_cyw, ap_cyx, ap_cyy, ap_cyz, " +
                " ap_cza, ap_czb, ap_czc, ap_czd, ap_cze, ap_czf, ap_czg, ap_czh, ap_czi, ap_czj, ap_czk, ap_czl, ap_czm, " +
                " ap_czn, ap_czo, ap_czp, ap_czq, ap_czr, ap_czs, ap_czt, ap_czu, ap_czv, ap_czw, ap_czx, ap_czy, ap_czz ) " +
                " VALUES ( " +
                " :fileNo, :priceNo, " +
                " :apCna, :apCnb, :apCnc, :apCnd, :apCne, :apCnf, :apCng, :apCnh, :apCni, :apCnj, :apCnk, :apCnl, :apCnm, " +
                " :apCnn, :apCno, :apCnp, :apCnq, :apCnr, :apCns, :apCnt, :apCnu, :apCnv, :apCnw, :apCnx, :apCny, :apCnz, " +
                " :apCoa, :apCob, :apCoc, :apCod, :apCoe, :apCof, :apCog, :apCoh, :apCoi, :apCoj, :apCok, :apCol, :apCom, " +
                " :apCon, :apCoo, :apCop, :apCoq, :apCor, :apCos, :apCot, :apCou, :apCov, :apCow, :apCox, :apCoy, :apCoz, " +
                " :apCpa, :apCpb, :apCpc, :apCpd, :apCpe, :apCpf, :apCpg, :apCph, :apCpi, :apCpj, :apCpk, :apCpl, :apCpm, " +
                " :apCpn, :apCpo, :apCpp, :apCpq, :apCpr, :apCps, :apCpt, :apCpu, :apCpv, :apCpw, :apCpx, :apCpy, :apCpz, " +
                " :apCqa, :apCqb, :apCqc, :apCqd, :apCqe, :apCqf, :apCqg, :apCqh, :apCqi, :apCqj, :apCqk, :apCql, :apCqm, " +
                " :apCqn, :apCqo, :apCqp, :apCqq, :apCqr, :apCqs, :apCqt, :apCqu, :apCqv, :apCqw, :apCqx, :apCqy, :apCqz, " +
                " :apCra, :apCrb, :apCrc, :apCrd, :apCre, :apCrf, :apCrg, :apCrh, :apCri, :apCrj, :apCrk, :apCrl, :apCrm, " +
                " :apCrn, :apCro, :apCrp, :apCrq, :apCrr, :apCrs, :apCrt, :apCru, :apCrv, :apCrw, :apCrx, :apCry, :apCrz, " +
                " :apCsa, :apCsb, :apCsc, :apCsd, :apCse, :apCsf, :apCsg, :apCsh, :apCsi, :apCsj, :apCsk, :apCsl, :apCsm, " +
                " :apCsn, :apCso, :apCsp, :apCsq, :apCsr, :apCss, :apCst, :apCsu, :apCsv, :apCsw, :apCsx, :apCsy, :apCsz, " +
                " :apCta, :apCtb, :apCtc, :apCtd, :apCte, :apCtf, :apCtg, :apCth, :apCti, :apCtj, :apCtk, :apCtl, :apCtm, " +
                " :apCtn, :apCto, :apCtp, :apCtq, :apCtr, :apCts, :apCtt, :apCtu, :apCtv, :apCtw, :apCtx, :apCty, :apCtz, " +
                " :apCua, :apCub, :apCuc, :apCud, :apCue, :apCuf, :apCug, :apCuh, :apCui, :apCuj, :apCuk, :apCul, :apCum, " +
                " :apCun, :apCuo, :apCup, :apCuq, :apCur, :apCus, :apCut, :apCuu, :apCuv, :apCuw, :apCux, :apCuy, :apCuz, " +
                " :apCva, :apCvb, :apCvc, :apCvd, :apCve, :apCvf, :apCvg, :apCvh, :apCvi, :apCvj, :apCvk, :apCvl, :apCvm, " +
                " :apCvn, :apCvo, :apCvp, :apCvq, :apCvr, :apCvs, :apCvt, :apCvu, :apCvv, :apCvw, :apCvx, :apCvy, :apCvz, " +
                " :apCwa, :apCwb, :apCwc, :apCwd, :apCwe, :apCwf, :apCwg, :apCwh, :apCwi, :apCwj, :apCwk, :apCwl, :apCwm, " +
                " :apCwn, :apCwo, :apCwp, :apCwq, :apCwr, :apCws, :apCwt, :apCwu, :apCwv, :apCww, :apCwx, :apCwy, :apCwz, " +
                " :apCxa, :apCxb, :apCxc, :apCxd, :apCxe, :apCxf, :apCxg, :apCxh, :apCxi, :apCxj, :apCxk, :apCxl, :apCxm, " +
                " :apCxn, :apCxo, :apCxp, :apCxq, :apCxr, :apCxs, :apCxt, :apCxu, :apCxv, :apCxw, :apCxx, :apCxy, :apCxz, " +
                " :apCya, :apCyb, :apCyc, :apCyd, :apCye, :apCyf, :apCyg, :apCyh, :apCyi, :apCyj, :apCyk, :apCyl, :apCym, " +
                " :apCyn, :apCyo, :apCyp, :apCyq, :apCyr, :apCys, :apCyt, :apCyu, :apCyv, :apCyw, :apCyx, :apCyy, :apCyz, " +
                " :apCza, :apCzb, :apCzc, :apCzd, :apCze, :apCzf, :apCzg, :apCzh, :apCzi, :apCzj, :apCzk, :apCzl, :apCzm, " +
                " :apCzn, :apCzo, :apCzp, :apCzq, :apCzr, :apCzs, :apCzt, :apCzu, :apCzv, :apCzw, :apCzx, :apCzy, :apCzz ) ";

        MapSqlParameterSource[] myParameterSourceAry = new MapSqlParameterSource[dataFeedAirticketPriceC2List.size()];

        for (int i = 0; i < dataFeedAirticketPriceC2List.size(); i++) {
            DataFeedAirticketPriceC2 wkDataFeedAirticketPriceC2 = dataFeedAirticketPriceC2List.get(i);

            myParameterSourceAry[i] = new MapSqlParameterSource();

            myParameterSourceAry[i].addValue("fileNo", wkDataFeedAirticketPriceC2.getFileNo());
            myParameterSourceAry[i].addValue("priceNo", wkDataFeedAirticketPriceC2.getPriceNo());
            myParameterSourceAry[i].addValue("apCna", wkDataFeedAirticketPriceC2.getApCna());
            myParameterSourceAry[i].addValue("apCnb", wkDataFeedAirticketPriceC2.getApCnb());
            myParameterSourceAry[i].addValue("apCnc", wkDataFeedAirticketPriceC2.getApCnc());
            myParameterSourceAry[i].addValue("apCnd", wkDataFeedAirticketPriceC2.getApCnd());
            myParameterSourceAry[i].addValue("apCne", wkDataFeedAirticketPriceC2.getApCne());
            myParameterSourceAry[i].addValue("apCnf", wkDataFeedAirticketPriceC2.getApCnf());
            myParameterSourceAry[i].addValue("apCng", wkDataFeedAirticketPriceC2.getApCng());
            myParameterSourceAry[i].addValue("apCnh", wkDataFeedAirticketPriceC2.getApCnh());
            myParameterSourceAry[i].addValue("apCni", wkDataFeedAirticketPriceC2.getApCni());
            myParameterSourceAry[i].addValue("apCnj", wkDataFeedAirticketPriceC2.getApCnj());
            myParameterSourceAry[i].addValue("apCnk", wkDataFeedAirticketPriceC2.getApCnk());
            myParameterSourceAry[i].addValue("apCnl", wkDataFeedAirticketPriceC2.getApCnl());
            myParameterSourceAry[i].addValue("apCnm", wkDataFeedAirticketPriceC2.getApCnm());
            myParameterSourceAry[i].addValue("apCnn", wkDataFeedAirticketPriceC2.getApCnn());
            myParameterSourceAry[i].addValue("apCno", wkDataFeedAirticketPriceC2.getApCno());
            myParameterSourceAry[i].addValue("apCnp", wkDataFeedAirticketPriceC2.getApCnp());
            myParameterSourceAry[i].addValue("apCnq", wkDataFeedAirticketPriceC2.getApCnq());
            myParameterSourceAry[i].addValue("apCnr", wkDataFeedAirticketPriceC2.getApCnr());
            myParameterSourceAry[i].addValue("apCns", wkDataFeedAirticketPriceC2.getApCns());
            myParameterSourceAry[i].addValue("apCnt", wkDataFeedAirticketPriceC2.getApCnt());
            myParameterSourceAry[i].addValue("apCnu", wkDataFeedAirticketPriceC2.getApCnu());
            myParameterSourceAry[i].addValue("apCnv", wkDataFeedAirticketPriceC2.getApCnv());
            myParameterSourceAry[i].addValue("apCnw", wkDataFeedAirticketPriceC2.getApCnw());
            myParameterSourceAry[i].addValue("apCnx", wkDataFeedAirticketPriceC2.getApCnx());
            myParameterSourceAry[i].addValue("apCny", wkDataFeedAirticketPriceC2.getApCny());
            myParameterSourceAry[i].addValue("apCnz", wkDataFeedAirticketPriceC2.getApCnz());
            myParameterSourceAry[i].addValue("apCoa", wkDataFeedAirticketPriceC2.getApCoa());
            myParameterSourceAry[i].addValue("apCob", wkDataFeedAirticketPriceC2.getApCob());
            myParameterSourceAry[i].addValue("apCoc", wkDataFeedAirticketPriceC2.getApCoc());
            myParameterSourceAry[i].addValue("apCod", wkDataFeedAirticketPriceC2.getApCod());
            myParameterSourceAry[i].addValue("apCoe", wkDataFeedAirticketPriceC2.getApCoe());
            myParameterSourceAry[i].addValue("apCof", wkDataFeedAirticketPriceC2.getApCof());
            myParameterSourceAry[i].addValue("apCog", wkDataFeedAirticketPriceC2.getApCog());
            myParameterSourceAry[i].addValue("apCoh", wkDataFeedAirticketPriceC2.getApCoh());
            myParameterSourceAry[i].addValue("apCoi", wkDataFeedAirticketPriceC2.getApCoi());
            myParameterSourceAry[i].addValue("apCoj", wkDataFeedAirticketPriceC2.getApCoj());
            myParameterSourceAry[i].addValue("apCok", wkDataFeedAirticketPriceC2.getApCok());
            myParameterSourceAry[i].addValue("apCol", wkDataFeedAirticketPriceC2.getApCol());
            myParameterSourceAry[i].addValue("apCom", wkDataFeedAirticketPriceC2.getApCom());
            myParameterSourceAry[i].addValue("apCon", wkDataFeedAirticketPriceC2.getApCon());
            myParameterSourceAry[i].addValue("apCoo", wkDataFeedAirticketPriceC2.getApCoo());
            myParameterSourceAry[i].addValue("apCop", wkDataFeedAirticketPriceC2.getApCop());
            myParameterSourceAry[i].addValue("apCoq", wkDataFeedAirticketPriceC2.getApCoq());
            myParameterSourceAry[i].addValue("apCor", wkDataFeedAirticketPriceC2.getApCor());
            myParameterSourceAry[i].addValue("apCos", wkDataFeedAirticketPriceC2.getApCos());
            myParameterSourceAry[i].addValue("apCot", wkDataFeedAirticketPriceC2.getApCot());
            myParameterSourceAry[i].addValue("apCou", wkDataFeedAirticketPriceC2.getApCou());
            myParameterSourceAry[i].addValue("apCov", wkDataFeedAirticketPriceC2.getApCov());
            myParameterSourceAry[i].addValue("apCow", wkDataFeedAirticketPriceC2.getApCow());
            myParameterSourceAry[i].addValue("apCox", wkDataFeedAirticketPriceC2.getApCox());
            myParameterSourceAry[i].addValue("apCoy", wkDataFeedAirticketPriceC2.getApCoy());
            myParameterSourceAry[i].addValue("apCoz", wkDataFeedAirticketPriceC2.getApCoz());
            myParameterSourceAry[i].addValue("apCpa", wkDataFeedAirticketPriceC2.getApCpa());
            myParameterSourceAry[i].addValue("apCpb", wkDataFeedAirticketPriceC2.getApCpb());
            myParameterSourceAry[i].addValue("apCpc", wkDataFeedAirticketPriceC2.getApCpc());
            myParameterSourceAry[i].addValue("apCpd", wkDataFeedAirticketPriceC2.getApCpd());
            myParameterSourceAry[i].addValue("apCpe", wkDataFeedAirticketPriceC2.getApCpe());
            myParameterSourceAry[i].addValue("apCpf", wkDataFeedAirticketPriceC2.getApCpf());
            myParameterSourceAry[i].addValue("apCpg", wkDataFeedAirticketPriceC2.getApCpg());
            myParameterSourceAry[i].addValue("apCph", wkDataFeedAirticketPriceC2.getApCph());
            myParameterSourceAry[i].addValue("apCpi", wkDataFeedAirticketPriceC2.getApCpi());
            myParameterSourceAry[i].addValue("apCpj", wkDataFeedAirticketPriceC2.getApCpj());
            myParameterSourceAry[i].addValue("apCpk", wkDataFeedAirticketPriceC2.getApCpk());
            myParameterSourceAry[i].addValue("apCpl", wkDataFeedAirticketPriceC2.getApCpl());
            myParameterSourceAry[i].addValue("apCpm", wkDataFeedAirticketPriceC2.getApCpm());
            myParameterSourceAry[i].addValue("apCpn", wkDataFeedAirticketPriceC2.getApCpn());
            myParameterSourceAry[i].addValue("apCpo", wkDataFeedAirticketPriceC2.getApCpo());
            myParameterSourceAry[i].addValue("apCpp", wkDataFeedAirticketPriceC2.getApCpp());
            myParameterSourceAry[i].addValue("apCpq", wkDataFeedAirticketPriceC2.getApCpq());
            myParameterSourceAry[i].addValue("apCpr", wkDataFeedAirticketPriceC2.getApCpr());
            myParameterSourceAry[i].addValue("apCps", wkDataFeedAirticketPriceC2.getApCps());
            myParameterSourceAry[i].addValue("apCpt", wkDataFeedAirticketPriceC2.getApCpt());
            myParameterSourceAry[i].addValue("apCpu", wkDataFeedAirticketPriceC2.getApCpu());
            myParameterSourceAry[i].addValue("apCpv", wkDataFeedAirticketPriceC2.getApCpv());
            myParameterSourceAry[i].addValue("apCpw", wkDataFeedAirticketPriceC2.getApCpw());
            myParameterSourceAry[i].addValue("apCpx", wkDataFeedAirticketPriceC2.getApCpx());
            myParameterSourceAry[i].addValue("apCpy", wkDataFeedAirticketPriceC2.getApCpy());
            myParameterSourceAry[i].addValue("apCpz", wkDataFeedAirticketPriceC2.getApCpz());
            myParameterSourceAry[i].addValue("apCqa", wkDataFeedAirticketPriceC2.getApCqa());
            myParameterSourceAry[i].addValue("apCqb", wkDataFeedAirticketPriceC2.getApCqb());
            myParameterSourceAry[i].addValue("apCqc", wkDataFeedAirticketPriceC2.getApCqc());
            myParameterSourceAry[i].addValue("apCqd", wkDataFeedAirticketPriceC2.getApCqd());
            myParameterSourceAry[i].addValue("apCqe", wkDataFeedAirticketPriceC2.getApCqe());
            myParameterSourceAry[i].addValue("apCqf", wkDataFeedAirticketPriceC2.getApCqf());
            myParameterSourceAry[i].addValue("apCqg", wkDataFeedAirticketPriceC2.getApCqg());
            myParameterSourceAry[i].addValue("apCqh", wkDataFeedAirticketPriceC2.getApCqh());
            myParameterSourceAry[i].addValue("apCqi", wkDataFeedAirticketPriceC2.getApCqi());
            myParameterSourceAry[i].addValue("apCqj", wkDataFeedAirticketPriceC2.getApCqj());
            myParameterSourceAry[i].addValue("apCqk", wkDataFeedAirticketPriceC2.getApCqk());
            myParameterSourceAry[i].addValue("apCql", wkDataFeedAirticketPriceC2.getApCql());
            myParameterSourceAry[i].addValue("apCqm", wkDataFeedAirticketPriceC2.getApCqm());
            myParameterSourceAry[i].addValue("apCqn", wkDataFeedAirticketPriceC2.getApCqn());
            myParameterSourceAry[i].addValue("apCqo", wkDataFeedAirticketPriceC2.getApCqo());
            myParameterSourceAry[i].addValue("apCqp", wkDataFeedAirticketPriceC2.getApCqp());
            myParameterSourceAry[i].addValue("apCqq", wkDataFeedAirticketPriceC2.getApCqq());
            myParameterSourceAry[i].addValue("apCqr", wkDataFeedAirticketPriceC2.getApCqr());
            myParameterSourceAry[i].addValue("apCqs", wkDataFeedAirticketPriceC2.getApCqs());
            myParameterSourceAry[i].addValue("apCqt", wkDataFeedAirticketPriceC2.getApCqt());
            myParameterSourceAry[i].addValue("apCqu", wkDataFeedAirticketPriceC2.getApCqu());
            myParameterSourceAry[i].addValue("apCqv", wkDataFeedAirticketPriceC2.getApCqv());
            myParameterSourceAry[i].addValue("apCqw", wkDataFeedAirticketPriceC2.getApCqw());
            myParameterSourceAry[i].addValue("apCqx", wkDataFeedAirticketPriceC2.getApCqx());
            myParameterSourceAry[i].addValue("apCqy", wkDataFeedAirticketPriceC2.getApCqy());
            myParameterSourceAry[i].addValue("apCqz", wkDataFeedAirticketPriceC2.getApCqz());
            myParameterSourceAry[i].addValue("apCra", wkDataFeedAirticketPriceC2.getApCra());
            myParameterSourceAry[i].addValue("apCrb", wkDataFeedAirticketPriceC2.getApCrb());
            myParameterSourceAry[i].addValue("apCrc", wkDataFeedAirticketPriceC2.getApCrc());
            myParameterSourceAry[i].addValue("apCrd", wkDataFeedAirticketPriceC2.getApCrd());
            myParameterSourceAry[i].addValue("apCre", wkDataFeedAirticketPriceC2.getApCre());
            myParameterSourceAry[i].addValue("apCrf", wkDataFeedAirticketPriceC2.getApCrf());
            myParameterSourceAry[i].addValue("apCrg", wkDataFeedAirticketPriceC2.getApCrg());
            myParameterSourceAry[i].addValue("apCrh", wkDataFeedAirticketPriceC2.getApCrh());
            myParameterSourceAry[i].addValue("apCri", wkDataFeedAirticketPriceC2.getApCri());
            myParameterSourceAry[i].addValue("apCrj", wkDataFeedAirticketPriceC2.getApCrj());
            myParameterSourceAry[i].addValue("apCrk", wkDataFeedAirticketPriceC2.getApCrk());
            myParameterSourceAry[i].addValue("apCrl", wkDataFeedAirticketPriceC2.getApCrl());
            myParameterSourceAry[i].addValue("apCrm", wkDataFeedAirticketPriceC2.getApCrm());
            myParameterSourceAry[i].addValue("apCrn", wkDataFeedAirticketPriceC2.getApCrn());
            myParameterSourceAry[i].addValue("apCro", wkDataFeedAirticketPriceC2.getApCro());
            myParameterSourceAry[i].addValue("apCrp", wkDataFeedAirticketPriceC2.getApCrp());
            myParameterSourceAry[i].addValue("apCrq", wkDataFeedAirticketPriceC2.getApCrq());
            myParameterSourceAry[i].addValue("apCrr", wkDataFeedAirticketPriceC2.getApCrr());
            myParameterSourceAry[i].addValue("apCrs", wkDataFeedAirticketPriceC2.getApCrs());
            myParameterSourceAry[i].addValue("apCrt", wkDataFeedAirticketPriceC2.getApCrt());
            myParameterSourceAry[i].addValue("apCru", wkDataFeedAirticketPriceC2.getApCru());
            myParameterSourceAry[i].addValue("apCrv", wkDataFeedAirticketPriceC2.getApCrv());
            myParameterSourceAry[i].addValue("apCrw", wkDataFeedAirticketPriceC2.getApCrw());
            myParameterSourceAry[i].addValue("apCrx", wkDataFeedAirticketPriceC2.getApCrx());
            myParameterSourceAry[i].addValue("apCry", wkDataFeedAirticketPriceC2.getApCry());
            myParameterSourceAry[i].addValue("apCrz", wkDataFeedAirticketPriceC2.getApCrz());
            myParameterSourceAry[i].addValue("apCsa", wkDataFeedAirticketPriceC2.getApCsa());
            myParameterSourceAry[i].addValue("apCsb", wkDataFeedAirticketPriceC2.getApCsb());
            myParameterSourceAry[i].addValue("apCsc", wkDataFeedAirticketPriceC2.getApCsc());
            myParameterSourceAry[i].addValue("apCsd", wkDataFeedAirticketPriceC2.getApCsd());
            myParameterSourceAry[i].addValue("apCse", wkDataFeedAirticketPriceC2.getApCse());
            myParameterSourceAry[i].addValue("apCsf", wkDataFeedAirticketPriceC2.getApCsf());
            myParameterSourceAry[i].addValue("apCsg", wkDataFeedAirticketPriceC2.getApCsg());
            myParameterSourceAry[i].addValue("apCsh", wkDataFeedAirticketPriceC2.getApCsh());
            myParameterSourceAry[i].addValue("apCsi", wkDataFeedAirticketPriceC2.getApCsi());
            myParameterSourceAry[i].addValue("apCsj", wkDataFeedAirticketPriceC2.getApCsj());
            myParameterSourceAry[i].addValue("apCsk", wkDataFeedAirticketPriceC2.getApCsk());
            myParameterSourceAry[i].addValue("apCsl", wkDataFeedAirticketPriceC2.getApCsl());
            myParameterSourceAry[i].addValue("apCsm", wkDataFeedAirticketPriceC2.getApCsm());
            myParameterSourceAry[i].addValue("apCsn", wkDataFeedAirticketPriceC2.getApCsn());
            myParameterSourceAry[i].addValue("apCso", wkDataFeedAirticketPriceC2.getApCso());
            myParameterSourceAry[i].addValue("apCsp", wkDataFeedAirticketPriceC2.getApCsp());
            myParameterSourceAry[i].addValue("apCsq", wkDataFeedAirticketPriceC2.getApCsq());
            myParameterSourceAry[i].addValue("apCsr", wkDataFeedAirticketPriceC2.getApCsr());
            myParameterSourceAry[i].addValue("apCss", wkDataFeedAirticketPriceC2.getApCss());
            myParameterSourceAry[i].addValue("apCst", wkDataFeedAirticketPriceC2.getApCst());
            myParameterSourceAry[i].addValue("apCsu", wkDataFeedAirticketPriceC2.getApCsu());
            myParameterSourceAry[i].addValue("apCsv", wkDataFeedAirticketPriceC2.getApCsv());
            myParameterSourceAry[i].addValue("apCsw", wkDataFeedAirticketPriceC2.getApCsw());
            myParameterSourceAry[i].addValue("apCsx", wkDataFeedAirticketPriceC2.getApCsx());
            myParameterSourceAry[i].addValue("apCsy", wkDataFeedAirticketPriceC2.getApCsy());
            myParameterSourceAry[i].addValue("apCsz", wkDataFeedAirticketPriceC2.getApCsz());
            myParameterSourceAry[i].addValue("apCta", wkDataFeedAirticketPriceC2.getApCta());
            myParameterSourceAry[i].addValue("apCtb", wkDataFeedAirticketPriceC2.getApCtb());
            myParameterSourceAry[i].addValue("apCtc", wkDataFeedAirticketPriceC2.getApCtc());
            myParameterSourceAry[i].addValue("apCtd", wkDataFeedAirticketPriceC2.getApCtd());
            myParameterSourceAry[i].addValue("apCte", wkDataFeedAirticketPriceC2.getApCte());
            myParameterSourceAry[i].addValue("apCtf", wkDataFeedAirticketPriceC2.getApCtf());
            myParameterSourceAry[i].addValue("apCtg", wkDataFeedAirticketPriceC2.getApCtg());
            myParameterSourceAry[i].addValue("apCth", wkDataFeedAirticketPriceC2.getApCth());
            myParameterSourceAry[i].addValue("apCti", wkDataFeedAirticketPriceC2.getApCti());
            myParameterSourceAry[i].addValue("apCtj", wkDataFeedAirticketPriceC2.getApCtj());
            myParameterSourceAry[i].addValue("apCtk", wkDataFeedAirticketPriceC2.getApCtk());
            myParameterSourceAry[i].addValue("apCtl", wkDataFeedAirticketPriceC2.getApCtl());
            myParameterSourceAry[i].addValue("apCtm", wkDataFeedAirticketPriceC2.getApCtm());
            myParameterSourceAry[i].addValue("apCtn", wkDataFeedAirticketPriceC2.getApCtn());
            myParameterSourceAry[i].addValue("apCto", wkDataFeedAirticketPriceC2.getApCto());
            myParameterSourceAry[i].addValue("apCtp", wkDataFeedAirticketPriceC2.getApCtp());
            myParameterSourceAry[i].addValue("apCtq", wkDataFeedAirticketPriceC2.getApCtq());
            myParameterSourceAry[i].addValue("apCtr", wkDataFeedAirticketPriceC2.getApCtr());
            myParameterSourceAry[i].addValue("apCts", wkDataFeedAirticketPriceC2.getApCts());
            myParameterSourceAry[i].addValue("apCtt", wkDataFeedAirticketPriceC2.getApCtt());
            myParameterSourceAry[i].addValue("apCtu", wkDataFeedAirticketPriceC2.getApCtu());
            myParameterSourceAry[i].addValue("apCtv", wkDataFeedAirticketPriceC2.getApCtv());
            myParameterSourceAry[i].addValue("apCtw", wkDataFeedAirticketPriceC2.getApCtw());
            myParameterSourceAry[i].addValue("apCtx", wkDataFeedAirticketPriceC2.getApCtx());
            myParameterSourceAry[i].addValue("apCty", wkDataFeedAirticketPriceC2.getApCty());
            myParameterSourceAry[i].addValue("apCtz", wkDataFeedAirticketPriceC2.getApCtz());
            myParameterSourceAry[i].addValue("apCua", wkDataFeedAirticketPriceC2.getApCua());
            myParameterSourceAry[i].addValue("apCub", wkDataFeedAirticketPriceC2.getApCub());
            myParameterSourceAry[i].addValue("apCuc", wkDataFeedAirticketPriceC2.getApCuc());
            myParameterSourceAry[i].addValue("apCud", wkDataFeedAirticketPriceC2.getApCud());
            myParameterSourceAry[i].addValue("apCue", wkDataFeedAirticketPriceC2.getApCue());
            myParameterSourceAry[i].addValue("apCuf", wkDataFeedAirticketPriceC2.getApCuf());
            myParameterSourceAry[i].addValue("apCug", wkDataFeedAirticketPriceC2.getApCug());
            myParameterSourceAry[i].addValue("apCuh", wkDataFeedAirticketPriceC2.getApCuh());
            myParameterSourceAry[i].addValue("apCui", wkDataFeedAirticketPriceC2.getApCui());
            myParameterSourceAry[i].addValue("apCuj", wkDataFeedAirticketPriceC2.getApCuj());
            myParameterSourceAry[i].addValue("apCuk", wkDataFeedAirticketPriceC2.getApCuk());
            myParameterSourceAry[i].addValue("apCul", wkDataFeedAirticketPriceC2.getApCul());
            myParameterSourceAry[i].addValue("apCum", wkDataFeedAirticketPriceC2.getApCum());
            myParameterSourceAry[i].addValue("apCun", wkDataFeedAirticketPriceC2.getApCun());
            myParameterSourceAry[i].addValue("apCuo", wkDataFeedAirticketPriceC2.getApCuo());
            myParameterSourceAry[i].addValue("apCup", wkDataFeedAirticketPriceC2.getApCup());
            myParameterSourceAry[i].addValue("apCuq", wkDataFeedAirticketPriceC2.getApCuq());
            myParameterSourceAry[i].addValue("apCur", wkDataFeedAirticketPriceC2.getApCur());
            myParameterSourceAry[i].addValue("apCus", wkDataFeedAirticketPriceC2.getApCus());
            myParameterSourceAry[i].addValue("apCut", wkDataFeedAirticketPriceC2.getApCut());
            myParameterSourceAry[i].addValue("apCuu", wkDataFeedAirticketPriceC2.getApCuu());
            myParameterSourceAry[i].addValue("apCuv", wkDataFeedAirticketPriceC2.getApCuv());
            myParameterSourceAry[i].addValue("apCuw", wkDataFeedAirticketPriceC2.getApCuw());
            myParameterSourceAry[i].addValue("apCux", wkDataFeedAirticketPriceC2.getApCux());
            myParameterSourceAry[i].addValue("apCuy", wkDataFeedAirticketPriceC2.getApCuy());
            myParameterSourceAry[i].addValue("apCuz", wkDataFeedAirticketPriceC2.getApCuz());
            myParameterSourceAry[i].addValue("apCva", wkDataFeedAirticketPriceC2.getApCva());
            myParameterSourceAry[i].addValue("apCvb", wkDataFeedAirticketPriceC2.getApCvb());
            myParameterSourceAry[i].addValue("apCvc", wkDataFeedAirticketPriceC2.getApCvc());
            myParameterSourceAry[i].addValue("apCvd", wkDataFeedAirticketPriceC2.getApCvd());
            myParameterSourceAry[i].addValue("apCve", wkDataFeedAirticketPriceC2.getApCve());
            myParameterSourceAry[i].addValue("apCvf", wkDataFeedAirticketPriceC2.getApCvf());
            myParameterSourceAry[i].addValue("apCvg", wkDataFeedAirticketPriceC2.getApCvg());
            myParameterSourceAry[i].addValue("apCvh", wkDataFeedAirticketPriceC2.getApCvh());
            myParameterSourceAry[i].addValue("apCvi", wkDataFeedAirticketPriceC2.getApCvi());
            myParameterSourceAry[i].addValue("apCvj", wkDataFeedAirticketPriceC2.getApCvj());
            myParameterSourceAry[i].addValue("apCvk", wkDataFeedAirticketPriceC2.getApCvk());
            myParameterSourceAry[i].addValue("apCvl", wkDataFeedAirticketPriceC2.getApCvl());
            myParameterSourceAry[i].addValue("apCvm", wkDataFeedAirticketPriceC2.getApCvm());
            myParameterSourceAry[i].addValue("apCvn", wkDataFeedAirticketPriceC2.getApCvn());
            myParameterSourceAry[i].addValue("apCvo", wkDataFeedAirticketPriceC2.getApCvo());
            myParameterSourceAry[i].addValue("apCvp", wkDataFeedAirticketPriceC2.getApCvp());
            myParameterSourceAry[i].addValue("apCvq", wkDataFeedAirticketPriceC2.getApCvq());
            myParameterSourceAry[i].addValue("apCvr", wkDataFeedAirticketPriceC2.getApCvr());
            myParameterSourceAry[i].addValue("apCvs", wkDataFeedAirticketPriceC2.getApCvs());
            myParameterSourceAry[i].addValue("apCvt", wkDataFeedAirticketPriceC2.getApCvt());
            myParameterSourceAry[i].addValue("apCvu", wkDataFeedAirticketPriceC2.getApCvu());
            myParameterSourceAry[i].addValue("apCvv", wkDataFeedAirticketPriceC2.getApCvv());
            myParameterSourceAry[i].addValue("apCvw", wkDataFeedAirticketPriceC2.getApCvw());
            myParameterSourceAry[i].addValue("apCvx", wkDataFeedAirticketPriceC2.getApCvx());
            myParameterSourceAry[i].addValue("apCvy", wkDataFeedAirticketPriceC2.getApCvy());
            myParameterSourceAry[i].addValue("apCvz", wkDataFeedAirticketPriceC2.getApCvz());
            myParameterSourceAry[i].addValue("apCwa", wkDataFeedAirticketPriceC2.getApCwa());
            myParameterSourceAry[i].addValue("apCwb", wkDataFeedAirticketPriceC2.getApCwb());
            myParameterSourceAry[i].addValue("apCwc", wkDataFeedAirticketPriceC2.getApCwc());
            myParameterSourceAry[i].addValue("apCwd", wkDataFeedAirticketPriceC2.getApCwd());
            myParameterSourceAry[i].addValue("apCwe", wkDataFeedAirticketPriceC2.getApCwe());
            myParameterSourceAry[i].addValue("apCwf", wkDataFeedAirticketPriceC2.getApCwf());
            myParameterSourceAry[i].addValue("apCwg", wkDataFeedAirticketPriceC2.getApCwg());
            myParameterSourceAry[i].addValue("apCwh", wkDataFeedAirticketPriceC2.getApCwh());
            myParameterSourceAry[i].addValue("apCwi", wkDataFeedAirticketPriceC2.getApCwi());
            myParameterSourceAry[i].addValue("apCwj", wkDataFeedAirticketPriceC2.getApCwj());
            myParameterSourceAry[i].addValue("apCwk", wkDataFeedAirticketPriceC2.getApCwk());
            myParameterSourceAry[i].addValue("apCwl", wkDataFeedAirticketPriceC2.getApCwl());
            myParameterSourceAry[i].addValue("apCwm", wkDataFeedAirticketPriceC2.getApCwm());
            myParameterSourceAry[i].addValue("apCwn", wkDataFeedAirticketPriceC2.getApCwn());
            myParameterSourceAry[i].addValue("apCwo", wkDataFeedAirticketPriceC2.getApCwo());
            myParameterSourceAry[i].addValue("apCwp", wkDataFeedAirticketPriceC2.getApCwp());
            myParameterSourceAry[i].addValue("apCwq", wkDataFeedAirticketPriceC2.getApCwq());
            myParameterSourceAry[i].addValue("apCwr", wkDataFeedAirticketPriceC2.getApCwr());
            myParameterSourceAry[i].addValue("apCws", wkDataFeedAirticketPriceC2.getApCws());
            myParameterSourceAry[i].addValue("apCwt", wkDataFeedAirticketPriceC2.getApCwt());
            myParameterSourceAry[i].addValue("apCwu", wkDataFeedAirticketPriceC2.getApCwu());
            myParameterSourceAry[i].addValue("apCwv", wkDataFeedAirticketPriceC2.getApCwv());
            myParameterSourceAry[i].addValue("apCww", wkDataFeedAirticketPriceC2.getApCww());
            myParameterSourceAry[i].addValue("apCwx", wkDataFeedAirticketPriceC2.getApCwx());
            myParameterSourceAry[i].addValue("apCwy", wkDataFeedAirticketPriceC2.getApCwy());
            myParameterSourceAry[i].addValue("apCwz", wkDataFeedAirticketPriceC2.getApCwz());
            myParameterSourceAry[i].addValue("apCxa", wkDataFeedAirticketPriceC2.getApCxa());
            myParameterSourceAry[i].addValue("apCxb", wkDataFeedAirticketPriceC2.getApCxb());
            myParameterSourceAry[i].addValue("apCxc", wkDataFeedAirticketPriceC2.getApCxc());
            myParameterSourceAry[i].addValue("apCxd", wkDataFeedAirticketPriceC2.getApCxd());
            myParameterSourceAry[i].addValue("apCxe", wkDataFeedAirticketPriceC2.getApCxe());
            myParameterSourceAry[i].addValue("apCxf", wkDataFeedAirticketPriceC2.getApCxf());
            myParameterSourceAry[i].addValue("apCxg", wkDataFeedAirticketPriceC2.getApCxg());
            myParameterSourceAry[i].addValue("apCxh", wkDataFeedAirticketPriceC2.getApCxh());
            myParameterSourceAry[i].addValue("apCxi", wkDataFeedAirticketPriceC2.getApCxi());
            myParameterSourceAry[i].addValue("apCxj", wkDataFeedAirticketPriceC2.getApCxj());
            myParameterSourceAry[i].addValue("apCxk", wkDataFeedAirticketPriceC2.getApCxk());
            myParameterSourceAry[i].addValue("apCxl", wkDataFeedAirticketPriceC2.getApCxl());
            myParameterSourceAry[i].addValue("apCxm", wkDataFeedAirticketPriceC2.getApCxm());
            myParameterSourceAry[i].addValue("apCxn", wkDataFeedAirticketPriceC2.getApCxn());
            myParameterSourceAry[i].addValue("apCxo", wkDataFeedAirticketPriceC2.getApCxo());
            myParameterSourceAry[i].addValue("apCxp", wkDataFeedAirticketPriceC2.getApCxp());
            myParameterSourceAry[i].addValue("apCxq", wkDataFeedAirticketPriceC2.getApCxq());
            myParameterSourceAry[i].addValue("apCxr", wkDataFeedAirticketPriceC2.getApCxr());
            myParameterSourceAry[i].addValue("apCxs", wkDataFeedAirticketPriceC2.getApCxs());
            myParameterSourceAry[i].addValue("apCxt", wkDataFeedAirticketPriceC2.getApCxt());
            myParameterSourceAry[i].addValue("apCxu", wkDataFeedAirticketPriceC2.getApCxu());
            myParameterSourceAry[i].addValue("apCxv", wkDataFeedAirticketPriceC2.getApCxv());
            myParameterSourceAry[i].addValue("apCxw", wkDataFeedAirticketPriceC2.getApCxw());
            myParameterSourceAry[i].addValue("apCxx", wkDataFeedAirticketPriceC2.getApCxx());
            myParameterSourceAry[i].addValue("apCxy", wkDataFeedAirticketPriceC2.getApCxy());
            myParameterSourceAry[i].addValue("apCxz", wkDataFeedAirticketPriceC2.getApCxz());
            myParameterSourceAry[i].addValue("apCya", wkDataFeedAirticketPriceC2.getApCya());
            myParameterSourceAry[i].addValue("apCyb", wkDataFeedAirticketPriceC2.getApCyb());
            myParameterSourceAry[i].addValue("apCyc", wkDataFeedAirticketPriceC2.getApCyc());
            myParameterSourceAry[i].addValue("apCyd", wkDataFeedAirticketPriceC2.getApCyd());
            myParameterSourceAry[i].addValue("apCye", wkDataFeedAirticketPriceC2.getApCye());
            myParameterSourceAry[i].addValue("apCyf", wkDataFeedAirticketPriceC2.getApCyf());
            myParameterSourceAry[i].addValue("apCyg", wkDataFeedAirticketPriceC2.getApCyg());
            myParameterSourceAry[i].addValue("apCyh", wkDataFeedAirticketPriceC2.getApCyh());
            myParameterSourceAry[i].addValue("apCyi", wkDataFeedAirticketPriceC2.getApCyi());
            myParameterSourceAry[i].addValue("apCyj", wkDataFeedAirticketPriceC2.getApCyj());
            myParameterSourceAry[i].addValue("apCyk", wkDataFeedAirticketPriceC2.getApCyk());
            myParameterSourceAry[i].addValue("apCyl", wkDataFeedAirticketPriceC2.getApCyl());
            myParameterSourceAry[i].addValue("apCym", wkDataFeedAirticketPriceC2.getApCym());
            myParameterSourceAry[i].addValue("apCyn", wkDataFeedAirticketPriceC2.getApCyn());
            myParameterSourceAry[i].addValue("apCyo", wkDataFeedAirticketPriceC2.getApCyo());
            myParameterSourceAry[i].addValue("apCyp", wkDataFeedAirticketPriceC2.getApCyp());
            myParameterSourceAry[i].addValue("apCyq", wkDataFeedAirticketPriceC2.getApCyq());
            myParameterSourceAry[i].addValue("apCyr", wkDataFeedAirticketPriceC2.getApCyr());
            myParameterSourceAry[i].addValue("apCys", wkDataFeedAirticketPriceC2.getApCys());
            myParameterSourceAry[i].addValue("apCyt", wkDataFeedAirticketPriceC2.getApCyt());
            myParameterSourceAry[i].addValue("apCyu", wkDataFeedAirticketPriceC2.getApCyu());
            myParameterSourceAry[i].addValue("apCyv", wkDataFeedAirticketPriceC2.getApCyv());
            myParameterSourceAry[i].addValue("apCyw", wkDataFeedAirticketPriceC2.getApCyw());
            myParameterSourceAry[i].addValue("apCyx", wkDataFeedAirticketPriceC2.getApCyx());
            myParameterSourceAry[i].addValue("apCyy", wkDataFeedAirticketPriceC2.getApCyy());
            myParameterSourceAry[i].addValue("apCyz", wkDataFeedAirticketPriceC2.getApCyz());
            myParameterSourceAry[i].addValue("apCza", wkDataFeedAirticketPriceC2.getApCza());
            myParameterSourceAry[i].addValue("apCzb", wkDataFeedAirticketPriceC2.getApCzb());
            myParameterSourceAry[i].addValue("apCzc", wkDataFeedAirticketPriceC2.getApCzc());
            myParameterSourceAry[i].addValue("apCzd", wkDataFeedAirticketPriceC2.getApCzd());
            myParameterSourceAry[i].addValue("apCze", wkDataFeedAirticketPriceC2.getApCze());
            myParameterSourceAry[i].addValue("apCzf", wkDataFeedAirticketPriceC2.getApCzf());
            myParameterSourceAry[i].addValue("apCzg", wkDataFeedAirticketPriceC2.getApCzg());
            myParameterSourceAry[i].addValue("apCzh", wkDataFeedAirticketPriceC2.getApCzh());
            myParameterSourceAry[i].addValue("apCzi", wkDataFeedAirticketPriceC2.getApCzi());
            myParameterSourceAry[i].addValue("apCzj", wkDataFeedAirticketPriceC2.getApCzj());
            myParameterSourceAry[i].addValue("apCzk", wkDataFeedAirticketPriceC2.getApCzk());
            myParameterSourceAry[i].addValue("apCzl", wkDataFeedAirticketPriceC2.getApCzl());
            myParameterSourceAry[i].addValue("apCzm", wkDataFeedAirticketPriceC2.getApCzm());
            myParameterSourceAry[i].addValue("apCzn", wkDataFeedAirticketPriceC2.getApCzn());
            myParameterSourceAry[i].addValue("apCzo", wkDataFeedAirticketPriceC2.getApCzo());
            myParameterSourceAry[i].addValue("apCzp", wkDataFeedAirticketPriceC2.getApCzp());
            myParameterSourceAry[i].addValue("apCzq", wkDataFeedAirticketPriceC2.getApCzq());
            myParameterSourceAry[i].addValue("apCzr", wkDataFeedAirticketPriceC2.getApCzr());
            myParameterSourceAry[i].addValue("apCzs", wkDataFeedAirticketPriceC2.getApCzs());
            myParameterSourceAry[i].addValue("apCzt", wkDataFeedAirticketPriceC2.getApCzt());
            myParameterSourceAry[i].addValue("apCzu", wkDataFeedAirticketPriceC2.getApCzu());
            myParameterSourceAry[i].addValue("apCzv", wkDataFeedAirticketPriceC2.getApCzv());
            myParameterSourceAry[i].addValue("apCzw", wkDataFeedAirticketPriceC2.getApCzw());
            myParameterSourceAry[i].addValue("apCzx", wkDataFeedAirticketPriceC2.getApCzx());
            myParameterSourceAry[i].addValue("apCzy", wkDataFeedAirticketPriceC2.getApCzy());
            myParameterSourceAry[i].addValue("apCzz", wkDataFeedAirticketPriceC2.getApCzz());
        }

        myNamedParameterJdbcTemplate.batchUpdate(mySql, myParameterSourceAry);
    }

    @Override
    public void deleteDataFeedAirticketPriceC2sByFileNo(Integer fileNo) {
        String mySql = "DELETE FROM db_airticket.data_feed_airticket_price_c2 " +
                " WHERE file_no = :fileNo ";

        Map<String,Object> myMap = new HashMap<>();
        myMap.put("fileNo", fileNo);

        myNamedParameterJdbcTemplate.update(mySql, myMap);
    }

}
