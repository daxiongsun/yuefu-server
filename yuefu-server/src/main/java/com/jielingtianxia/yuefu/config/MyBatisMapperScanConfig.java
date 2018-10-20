package com.jielingtianxia.yuefu.config;

import org.mybatis.spring.annotation.MapperScan;
import org.mybatis.spring.mapper.MapperScannerConfigurer;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.context.annotation.Configuration;

/**
 * @Description TODO
 * @Author daxiong
 * @Date 8/7/2018 10:47 PM
 **/
@Configuration
@AutoConfigureAfter(MybatisConfig.class)
@MapperScan("com.ngsky.mapper")
public class MyBatisMapperScanConfig {

    @Value("${mybatis.scan-package}")
    private String scanPackages;

    public MapperScannerConfigurer mapperScannerConfigurer(){
        MapperScannerConfigurer mapperScannerConfigurer = new MapperScannerConfigurer();
        mapperScannerConfigurer.setSqlSessionFactoryBeanName("sqlSessionFactory");
        mapperScannerConfigurer.setBasePackage(scanPackages);
        return mapperScannerConfigurer;
    }
}
