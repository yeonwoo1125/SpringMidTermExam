package kr.hs.study.springteststudy.AopStudy.main;

import kr.hs.study.springteststudy.AopStudy.beans.TestBean;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class Main4 {
    public static void main(String[] args){
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("config/aopConfig.xml");
        TestBean t1 = ctx.getBean("t1",TestBean.class);
        System.out.println(t1);
        t1.method1();

        ctx.close();
    }
}
