package kr.hs.study.springteststudy.xmlTest.main;

import kr.hs.study.springteststudy.xmlTest.beans.TestBean;
import kr.hs.study.springteststudy.xmlTest.beans.TestBean2;
import kr.hs.study.springteststudy.xmlTest.beans.TestBean3;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {
    public static void main(String[] args){
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("/config/xmlTestConfig.xml");
/*        TestBean t1 = ctx.getBean("test1", TestBean.class);
        System.out.println(t1.getDataBean());

        TestBean2 t2 = ctx.getBean("test2", TestBean2.class);
        System.out.println(t2.getDataBean());*/

        TestBean3 t3 = ctx.getBean("test3", TestBean3.class);
        System.out.println(t3.getDataBean());
        System.out.println(t3.getValue1());
        ctx.close();
    }
}
