package com.mybatis.configuration;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan("com.mybatis.repository")
public class MybatisConfiguration {

}
