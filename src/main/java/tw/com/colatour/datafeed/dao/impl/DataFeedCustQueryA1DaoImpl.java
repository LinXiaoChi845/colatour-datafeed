package tw.com.colatour.datafeed.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Component;
import tw.com.colatour.datafeed.dao.DataFeedCustQueryA1Dao;
import tw.com.colatour.datafeed.model.DataFeedCustQueryA1;

import java.util.HashMap;
import java.util.Map;

@Component
public class DataFeedCustQueryA1DaoImpl implements DataFeedCustQueryA1Dao {

    @Autowired
    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    @Override
    public void createDataFeedCustQueryA1(DataFeedCustQueryA1 dataFeedCustQueryA1) {
        String mySql = "INSERT INTO data_feed.data_feed_cust_query_a1 ( " +
                " file_no, " +
                " cq_aaa, cq_aab, cq_aac, cq_aad, cq_aae, cq_aaf, cq_aag, cq_aah, cq_aai, cq_aaj, cq_aak, cq_aal, cq_aam, " +
                " cq_aan, cq_aao, cq_aap, cq_aaq, cq_aar, cq_aas, cq_aat, cq_aau, cq_aav, cq_aaw, cq_aax, cq_aay, cq_aaz, " +
                " cq_aba, cq_abb, cq_abc, cq_abd, cq_abe, cq_abf, cq_abg, cq_abh, cq_abi, cq_abj, cq_abk, cq_abl, cq_abm, " +
                " cq_abn, cq_abo, cq_abp, cq_abq, cq_abr, cq_abs, cq_abt, cq_abu, cq_abv, cq_abw, cq_abx, cq_aby, cq_abz, " +
                " cq_aca, cq_acb, cq_acc, cq_acd, cq_ace, cq_acf, cq_acg, cq_ach, cq_aci, cq_acj, cq_ack, cq_acl, cq_acm, " +
                " cq_acn, cq_aco, cq_acp, cq_acq, cq_acr, cq_acs, cq_act, cq_acu, cq_acv, cq_acw, cq_acx, cq_acy, cq_acz, " +
                " cq_ada, cq_adb, cq_adc, cq_add, cq_ade ) " +
                " VALUES ( " +
                " :fileNo, " +
                " :cqAaa, :cqAab, :cqAac, :cqAad, :cqAae, :cqAaf, :cqAag, :cqAah, :cqAai, :cqAaj, :cqAak, :cqAal, :cqAam, " +
                " :cqAan, :cqAao, :cqAap, :cqAaq, :cqAar, :cqAas, :cqAat, :cqAau, :cqAav, :cqAaw, :cqAax, :cqAay, :cqAaz, " +
                " :cqAba, :cqAbb, :cqAbc, :cqAbd, :cqAbe, :cqAbf, :cqAbg, :cqAbh, :cqAbi, :cqAbj, :cqAbk, :cqAbl, :cqAbm, " +
                " :cqAbn, :cqAbo, :cqAbp, :cqAbq, :cqAbr, :cqAbs, :cqAbt, :cqAbu, :cqAbv, :cqAbw, :cqAbx, :cqAby, :cqAbz, " +
                " :cqAca, :cqAcb, :cqAcc, :cqAcd, :cqAce, :cqAcf, :cqAcg, :cqAch, :cqAci, :cqAcj, :cqAck, :cqAcl, :cqAcm, " +
                " :cqAcn, :cqAco, :cqAcp, :cqAcq, :cqAcr, :cqAcs, :cqAct, :cqAcu, :cqAcv, :cqAcw, :cqAcx, :cqAcy, :cqAcz, " +
                " :cqAda, :cqAdb, :cqAdc, :cqAdd, :cqAde ) ";

        Map<String, Object> myMap = new HashMap<>();

        myMap.put("fileNo", dataFeedCustQueryA1.getFileNo());
        myMap.put("cqAaa", dataFeedCustQueryA1.getCqAaa());
        myMap.put("cqAab", dataFeedCustQueryA1.getCqAab());
        myMap.put("cqAac", dataFeedCustQueryA1.getCqAac());
        myMap.put("cqAad", dataFeedCustQueryA1.getCqAad());
        myMap.put("cqAae", dataFeedCustQueryA1.getCqAae());
        myMap.put("cqAaf", dataFeedCustQueryA1.getCqAaf());
        myMap.put("cqAag", dataFeedCustQueryA1.getCqAag());
        myMap.put("cqAah", dataFeedCustQueryA1.getCqAah());
        myMap.put("cqAai", dataFeedCustQueryA1.getCqAai());
        myMap.put("cqAaj", dataFeedCustQueryA1.getCqAaj());
        myMap.put("cqAak", dataFeedCustQueryA1.getCqAak());
        myMap.put("cqAal", dataFeedCustQueryA1.getCqAal());
        myMap.put("cqAam", dataFeedCustQueryA1.getCqAam());
        myMap.put("cqAan", dataFeedCustQueryA1.getCqAan());
        myMap.put("cqAao", dataFeedCustQueryA1.getCqAao());
        myMap.put("cqAap", dataFeedCustQueryA1.getCqAap());
        myMap.put("cqAaq", dataFeedCustQueryA1.getCqAaq());
        myMap.put("cqAar", dataFeedCustQueryA1.getCqAar());
        myMap.put("cqAas", dataFeedCustQueryA1.getCqAas());
        myMap.put("cqAat", dataFeedCustQueryA1.getCqAat());
        myMap.put("cqAau", dataFeedCustQueryA1.getCqAau());
        myMap.put("cqAav", dataFeedCustQueryA1.getCqAav());
        myMap.put("cqAaw", dataFeedCustQueryA1.getCqAaw());
        myMap.put("cqAax", dataFeedCustQueryA1.getCqAax());
        myMap.put("cqAay", dataFeedCustQueryA1.getCqAay());
        myMap.put("cqAaz", dataFeedCustQueryA1.getCqAaz());
        myMap.put("cqAba", dataFeedCustQueryA1.getCqAba());
        myMap.put("cqAbb", dataFeedCustQueryA1.getCqAbb());
        myMap.put("cqAbc", dataFeedCustQueryA1.getCqAbc());
        myMap.put("cqAbd", dataFeedCustQueryA1.getCqAbd());
        myMap.put("cqAbe", dataFeedCustQueryA1.getCqAbe());
        myMap.put("cqAbf", dataFeedCustQueryA1.getCqAbf());
        myMap.put("cqAbg", dataFeedCustQueryA1.getCqAbg());
        myMap.put("cqAbh", dataFeedCustQueryA1.getCqAbh());
        myMap.put("cqAbi", dataFeedCustQueryA1.getCqAbi());
        myMap.put("cqAbj", dataFeedCustQueryA1.getCqAbj());
        myMap.put("cqAbk", dataFeedCustQueryA1.getCqAbk());
        myMap.put("cqAbl", dataFeedCustQueryA1.getCqAbl());
        myMap.put("cqAbm", dataFeedCustQueryA1.getCqAbm());
        myMap.put("cqAbn", dataFeedCustQueryA1.getCqAbn());
        myMap.put("cqAbo", dataFeedCustQueryA1.getCqAbo());
        myMap.put("cqAbp", dataFeedCustQueryA1.getCqAbp());
        myMap.put("cqAbq", dataFeedCustQueryA1.getCqAbq());
        myMap.put("cqAbr", dataFeedCustQueryA1.getCqAbr());
        myMap.put("cqAbs", dataFeedCustQueryA1.getCqAbs());
        myMap.put("cqAbt", dataFeedCustQueryA1.getCqAbt());
        myMap.put("cqAbu", dataFeedCustQueryA1.getCqAbu());
        myMap.put("cqAbv", dataFeedCustQueryA1.getCqAbv());
        myMap.put("cqAbw", dataFeedCustQueryA1.getCqAbw());
        myMap.put("cqAbx", dataFeedCustQueryA1.getCqAbx());
        myMap.put("cqAby", dataFeedCustQueryA1.getCqAby());
        myMap.put("cqAbz", dataFeedCustQueryA1.getCqAbz());
        myMap.put("cqAca", dataFeedCustQueryA1.getCqAca());
        myMap.put("cqAcb", dataFeedCustQueryA1.getCqAcb());
        myMap.put("cqAcc", dataFeedCustQueryA1.getCqAcc());
        myMap.put("cqAcd", dataFeedCustQueryA1.getCqAcd());
        myMap.put("cqAce", dataFeedCustQueryA1.getCqAce());
        myMap.put("cqAcf", dataFeedCustQueryA1.getCqAcf());
        myMap.put("cqAcg", dataFeedCustQueryA1.getCqAcg());
        myMap.put("cqAch", dataFeedCustQueryA1.getCqAch());
        myMap.put("cqAci", dataFeedCustQueryA1.getCqAci());
        myMap.put("cqAcj", dataFeedCustQueryA1.getCqAcj());
        myMap.put("cqAck", dataFeedCustQueryA1.getCqAck());
        myMap.put("cqAcl", dataFeedCustQueryA1.getCqAcl());
        myMap.put("cqAcm", dataFeedCustQueryA1.getCqAcm());
        myMap.put("cqAcn", dataFeedCustQueryA1.getCqAcn());
        myMap.put("cqAco", dataFeedCustQueryA1.getCqAco());
        myMap.put("cqAcp", dataFeedCustQueryA1.getCqAcp());
        myMap.put("cqAcq", dataFeedCustQueryA1.getCqAcq());
        myMap.put("cqAcr", dataFeedCustQueryA1.getCqAcr());
        myMap.put("cqAcs", dataFeedCustQueryA1.getCqAcs());
        myMap.put("cqAct", dataFeedCustQueryA1.getCqAct());
        myMap.put("cqAcu", dataFeedCustQueryA1.getCqAcu());
        myMap.put("cqAcv", dataFeedCustQueryA1.getCqAcv());
        myMap.put("cqAcw", dataFeedCustQueryA1.getCqAcw());
        myMap.put("cqAcx", dataFeedCustQueryA1.getCqAcx());
        myMap.put("cqAcy", dataFeedCustQueryA1.getCqAcy());
        myMap.put("cqAcz", dataFeedCustQueryA1.getCqAcz());
        myMap.put("cqAda", dataFeedCustQueryA1.getCqAda());
        myMap.put("cqAdb", dataFeedCustQueryA1.getCqAdb());
        myMap.put("cqAdc", dataFeedCustQueryA1.getCqAdc());
        myMap.put("cqAdd", dataFeedCustQueryA1.getCqAdd());
        myMap.put("cqAde", dataFeedCustQueryA1.getCqAde());

        namedParameterJdbcTemplate.update(mySql, myMap);
    }
}
