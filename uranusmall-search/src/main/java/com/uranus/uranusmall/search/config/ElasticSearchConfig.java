package com.uranus.uranusmall.search.config;

/*
@author 图灵学院-白起老师
*/

import lombok.extern.slf4j.Slf4j;
import org.apache.http.HttpHost;
import org.apache.http.auth.AuthScope;
import org.apache.http.auth.UsernamePasswordCredentials;
import org.apache.http.client.CredentialsProvider;
import org.apache.http.conn.ssl.NoopHostnameVerifier;
import org.apache.http.conn.ssl.TrustStrategy;
import org.apache.http.impl.client.BasicCredentialsProvider;
import org.apache.http.impl.nio.client.HttpAsyncClientBuilder;
import org.apache.http.nio.conn.ssl.SSLIOSessionStrategy;
import org.apache.http.ssl.SSLContextBuilder;
import org.elasticsearch.client.RestClient;
import org.elasticsearch.client.RestClientBuilder;
import org.elasticsearch.client.RestHighLevelClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.net.ssl.SSLContext;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;

@Configuration
@Slf4j
public class ElasticSearchConfig {

    //http://45.125.57.198/
    /*@Bean
    public RestHighLevelClient restHighLevelClient(){
        RestHighLevelClient client = new RestHighLevelClient(
                RestClient.builder(
                       new HttpHost("192.168.21.130", 9200, "http"),
                        new HttpHost("192.168.21.131", 9200, "http"),
                        new HttpHost("192.168.21.132", 9200, "http")));
               RestClient.builder(
                        new HttpHost("es-gzxjce80.public.tencentelasticsearch.com", 9200, "https"));
        return client;
    }*/

    @Bean
    public RestHighLevelClient restHighLevelClient(){

        log.info("Elasticsearch init start ......");
        RestHighLevelClient restClient = null;
        try {
            final CredentialsProvider credentialsProvider = new BasicCredentialsProvider();
            credentialsProvider.setCredentials(AuthScope.ANY,
                    new UsernamePasswordCredentials("elastic", "lkkshiwo123?"));

            SSLContext sslContext = new SSLContextBuilder().loadTrustMaterial(null, new TrustStrategy() {
                // 信任所有
                public boolean isTrusted(X509Certificate[] chain, String authType) throws CertificateException {
                    return true;
                }
            }).build();
            SSLIOSessionStrategy sessionStrategy = new SSLIOSessionStrategy(sslContext, NoopHostnameVerifier.INSTANCE);
            restClient = new RestHighLevelClient(
                    RestClient.builder(
                                    new HttpHost("es-gzxjce80.public.tencentelasticsearch.com", 9200, "https"))
                            .setHttpClientConfigCallback(new RestClientBuilder.HttpClientConfigCallback() {
                                public HttpAsyncClientBuilder customizeHttpClient(HttpAsyncClientBuilder httpClientBuilder) {
                                    httpClientBuilder.disableAuthCaching();
                                    httpClientBuilder.setSSLStrategy(sessionStrategy);
                                    httpClientBuilder.setDefaultCredentialsProvider(credentialsProvider);
                                    return httpClientBuilder;
                                }
                            }));
        } catch (Exception e) {
            log.error("elasticsearch TransportClient create error!!", e);
        }
        return restClient;
    }

}
