package com.haut.promotion.httpclient;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.haut.promotion.conf.MyRequestConfig;
import org.apache.http.HttpEntity;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.springframework.http.converter.json.GsonBuilderUtils;

import java.io.IOException;
import java.util.List;
import java.util.Map;

public class TestHttpClient {
    //Get方式请求
    public static void main(String[] args) throws IOException {
        //获取httpClient对象
        CloseableHttpClient httpClient = HttpClients.createDefault();
        //设置url
        String url = "http://localhost:8080/test?page=1";
        //创建连接的方式
        HttpGet get = new HttpGet(url);
        //设置链接的参数
        get.setConfig(MyRequestConfig.getRequestConfig());

//执行请求，获取从服务器返回的结果
        try {
            CloseableHttpResponse response = httpClient.execute(get);
            String s = EntityUtils.toString(response.getEntity(),"utf-8");
            System.out.println(s);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            httpClient.close();
        }

    }

}
