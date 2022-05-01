package kr.hs.study.springteststudy.javaStudy.config;

import kr.hs.study.springteststudy.javaStudy.beans.DataBean;
import kr.hs.study.springteststudy.javaStudy.beans.TestBean;
import kr.hs.study.springteststudy.javaStudy.beans.TestBean2;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;

@Configuration
public class BeanConfig {

/*    @Bean
    public TestBean t1(){
        return new TestBean();
    }

    @Bean
    public TestBean t2(){
        return new TestBean(1,"spring");
    }*/

    @Bean(name = "t1")
    @Lazy
    @Scope("prototype")
    public TestBean2 ddd(){
        TestBean2 t1 = new TestBean2();
        t1.setData1(10);
        t1.setData2("spring");
        t1.setData3(new DataBean());
        return t1;
    }
}
