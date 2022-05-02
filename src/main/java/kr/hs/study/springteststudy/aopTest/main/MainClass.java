package kr.hs.study.springteststudy.aopTest.main;

import kr.hs.study.springteststudy.aopTest.beans.TestBean;
import kr.hs.study.springteststudy.aopTest.config.BeanConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {
    public static void main(String[] args){
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("config/aopTestConfig.xml");

        TestBean t1 = ctx.getBean("t1",TestBean.class);
        t1.hello();
        t1.helloError();
        ctx.close();
    }
}
