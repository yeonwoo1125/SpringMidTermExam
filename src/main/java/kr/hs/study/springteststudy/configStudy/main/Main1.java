package kr.hs.study.springteststudy.configStudy.main;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class Main1 {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("config/config.xml");

        //생성자 DI
/*        TestBean t1 = ctx.getBean("t1",TestBean.class);
        System.out.println(t1);
        System.out.println("-----------------------------");

        TestBean t2 = ctx.getBean("t2",TestBean.class);
        System.out.println(t2);
        System.out.println(t2.getData1());
        System.out.println(t2.getData2());
        System.out.println("-----------------------------");

        TestBean t3 = ctx.getBean("t3", TestBean.class);
        System.out.println(t3);
        System.out.println(t3.getData3());*/

        //setter DI
/*        TestBean2 t1 = ctx.getBean("pro-bean1", TestBean2.class);
        System.out.println(t1);
        System.out.println(t1.getData1());
        System.out.println(t1.getData2());
        System.out.println(t1.getData3());*/

        //autowire
/*        TestBean3 t1 = ctx.getBean("t1",TestBean3.class);
        System.out.println(t1);
        System.out.println(t1.getData1());*/
        ctx.close();
    }

}
