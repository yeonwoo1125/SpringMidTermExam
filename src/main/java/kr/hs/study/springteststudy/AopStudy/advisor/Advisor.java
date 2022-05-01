package kr.hs.study.springteststudy.AopStudy.advisor;

import org.aspectj.lang.ProceedingJoinPoint;

public class Advisor {
    public void beforeMethod(){
        System.out.println("before Method");
    }
    public void afterMethod(){
        System.out.println("after Method");
    }
    public void aroundMethod(ProceedingJoinPoint p) throws Throwable{
        System.out.println("around 1");
        p.proceed();
        System.out.println("around 2");
    }
}
