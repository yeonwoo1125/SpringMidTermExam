package kr.hs.study.springteststudy.annoTest.main;

import kr.hs.study.springteststudy.annoTest.beans.TestBean;
import kr.hs.study.springteststudy.annoTest.config.BeanConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {
    public static void main(String[] args){
        //AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(BeanConfig.class);
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("config/annoTestConfig.xml");
        TestBean t1 = ctx.getBean(TestBean.class);
        System.out.println(t1.getDataBean());

        ctx.close();
    }
}
