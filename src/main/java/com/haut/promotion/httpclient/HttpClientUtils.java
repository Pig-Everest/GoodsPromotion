package com.haut.promotion.httpclient;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.haut.promotion.conf.MyRequestConfig;
import com.haut.promotion.conf.RedisConfig;
import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import java.util.Map;
import java.util.Set;

public class HttpClientUtils {
    /**
     *
     * @param url 请求的url地址，为get请求
     * @param params 请求的地址所需要的参数，map的key作为参数名，value为所需的值
     * @return 返回值为Map
     * @throws Exception
     *
     */
    public static Map<String,Object> doGet(String url, Map<String, Object> params) throws Exception {
        // 创建httpClient对象
        CloseableHttpClient httpClient = HttpClients.createDefault();
        // 创建访问的地址
        URIBuilder uriBuilder = new URIBuilder(url);
        if (params != null) {
            Set<Map.Entry<String, Object>> entrySet = params.entrySet();
            for (Map.Entry<String, Object> entry : entrySet) {
                uriBuilder.setParameter(entry.getKey(), entry.getValue().toString());
            }
        }
        // 创建http对象
        HttpGet httpGet = new HttpGet(uriBuilder.build());
        httpGet.setConfig(MyRequestConfig.getRequestConfig());

        // 创建httpResponse对象
        CloseableHttpResponse httpResponse = httpClient.execute(httpGet);
        HttpEntity entity = httpResponse.getEntity();
        String responseContent = EntityUtils.toString(entity, "UTF-8");
        ObjectMapper objectMapper = new ObjectMapper();
        Map<String, Object> map = objectMapper.readValue(responseContent, Map.class);

        if (httpResponse != null) {
            httpResponse.close();
        }
        if (httpClient != null) {
            httpClient.close();
        }
        return  map;

    }
}
