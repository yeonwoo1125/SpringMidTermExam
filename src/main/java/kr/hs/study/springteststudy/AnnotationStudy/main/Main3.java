package kr.hs.study.springteststudy.AnnotationStudy.main;



import kr.hs.study.springteststudy.AnnotationStudy.beans.TestBean;
import kr.hs.study.springteststudy.AnnotationStudy.beans.TestBean2;
import kr.hs.study.springteststudy.AnnotationStudy.beans.TestBean3;
import kr.hs.study.springteststudy.AnnotationStudy.config.BeanConfig;
import kr.hs.study.springteststudy.AnnotationStudy.config.BeanConfig2;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class Main3 {

    public static void main(String[] args) {

        //@Component - java
/*        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(BeanConfig.class);
        TestBean t1 = ctx.getBean(TestBean.class);
        System.out.println(t1);
        System.out.println(t1.getData1());
        System.out.println(t1.getData2());
        System.out.println(t1.getData3());*/

        //@Component - xml
/*        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("config/config.xml");
        TestBean t1 = ctx.getBean(TestBean.class);
        System.out.println(t1);
        System.out.println(t1.getData1());
        System.out.println(t1.getData2());
        System.out.println(t1.getData3());*/

        //Autowired
/*        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(BeanConfig2.class);
        TestBean2 t2 = ctx.getBean("t2",TestBean2.class);
        System.out.println(t2);
        System.out.println(t2.getDataBean());*/

        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("config/config.xml");
        TestBean3 t1 = ctx.getBean("t1",TestBean3.class);
        System.out.println(t1);
        System.out.println(t1.getDataBean());
        ctx.close();
    }

}
