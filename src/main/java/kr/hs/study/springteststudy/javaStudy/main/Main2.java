package kr.hs.study.springteststudy.javaStudy.main;

import kr.hs.study.springteststudy.javaStudy.beans.TestBean;
import kr.hs.study.springteststudy.javaStudy.beans.TestBean2;
import kr.hs.study.springteststudy.javaStudy.config.BeanConfig;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class Main2 {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(BeanConfig.class);

/*        TestBean t1 = ctx.getBean("t1", TestBean.class);
        System.out.println(t1);
        System.out.println("-----------------------------------");

        //생성자 DI
        TestBean t2 = ctx.getBean("t2",TestBean.class);
        System.out.println(t2);
        System.out.println(t2.getData1());
        System.out.println(t2.getData2());*/

        //setter DI
        TestBean2 t1 = ctx.getBean("t1",TestBean2.class);
        System.out.println(t1);
        System.out.println(t1.getData1());
        System.out.println(t1.getData2());
        System.out.println(t1.getData3());

        ctx.close();
    }

}
