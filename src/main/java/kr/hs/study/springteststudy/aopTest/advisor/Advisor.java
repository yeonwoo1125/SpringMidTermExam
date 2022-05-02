package kr.hs.study.springteststudy.aopTest.advisor;

import org.aspectj.lang.ProceedingJoinPoint;

public class Advisor {
    public void after(){
        System.out.println("after");
    }
    public void before(){
        System.out.println("before");
    }
    public void afterThrowing(Throwable e){
        System.out.println("after throw"+e.getMessage());
    }
    public void afterReturning(){
        System.out.println("after returning");
    }
    public void around(ProceedingJoinPoint pcjp) throws Throwable {
        System.out.println("before around");
        pcjp.proceed();
        System.out.println("after around");
    }
}
