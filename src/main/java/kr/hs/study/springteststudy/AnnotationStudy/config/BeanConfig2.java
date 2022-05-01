package kr.hs.study.springteststudy.AnnotationStudy.config;

import kr.hs.study.springteststudy.AnnotationStudy.beans.DataBean;
import kr.hs.study.springteststudy.AnnotationStudy.beans.TestBean2;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfig2 {

    @Bean
    public DataBean d2(){
        return new DataBean();
    }

    @Bean
    public TestBean2 t2(){
        return new TestBean2();
    }
}
