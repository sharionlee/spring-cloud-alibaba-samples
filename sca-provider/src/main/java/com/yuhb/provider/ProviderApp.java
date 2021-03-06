package com.yuhb.provider;

import io.seata.spring.annotation.datasource.EnableAutoDataSourceProxy;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Created by yu.hb on 2019-10-30
 */
@SpringBootApplication
@EnableDiscoveryClient
@MapperScan("com.yuhb.provider.mapper")
@EnableAutoDataSourceProxy
public class ProviderApp {

    public static void main(String[] args) {
        SpringApplication.run(ProviderApp.class, args);
    }
}
