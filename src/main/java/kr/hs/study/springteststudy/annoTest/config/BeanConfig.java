package kr.hs.study.springteststudy.annoTest.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "kr.hs.study.springteststudy.annoTest.beans")
public class BeanConfig {
}
