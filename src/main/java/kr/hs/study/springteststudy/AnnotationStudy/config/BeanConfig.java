package kr.hs.study.springteststudy.AnnotationStudy.config;

import kr.hs.study.springteststudy.AnnotationStudy.beans.DataBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "kr.hs.study.springteststudy.AnnotationStudy.beans")
public class BeanConfig {
}
