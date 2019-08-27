package com.haut.promotion.conf;

import org.apache.http.client.config.RequestConfig;

/**
 * 设置返回请求参数RequestConfig对象
 */
public class MyRequestConfig {
    private static RequestConfig requestConfig = RequestConfig.custom()
            .setSocketTimeout(45000).setConnectTimeout(45000)
            .setConnectionRequestTimeout(45000).build();

    public static RequestConfig getRequestConfig() {
        return requestConfig;
    }
}
