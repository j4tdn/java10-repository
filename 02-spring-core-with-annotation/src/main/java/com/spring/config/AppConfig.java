package com.spring.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@ComponentScan(basePackages = "com.spring") // scan all call in basePackages to find bean with @Component
@Import(value = MovieConfig.class)
public class AppConfig {

}
