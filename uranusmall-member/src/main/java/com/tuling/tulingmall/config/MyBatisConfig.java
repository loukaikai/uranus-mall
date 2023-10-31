package com.uranus.uranusmall.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * MyBatis配置类
 * Created by macro on 2019/4/8.
 */
@Configuration
@EnableTransactionManagement
@MapperScan({"com.uranus.uranusmall.mapper","com.uranus.uranusmall.portal.dao","com.uranus.uranusmall.dao"})
public class MyBatisConfig {
}
