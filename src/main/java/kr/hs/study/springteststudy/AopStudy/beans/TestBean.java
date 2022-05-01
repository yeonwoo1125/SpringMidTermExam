package kr.hs.study.springteststudy.AopStudy.beans;

public class TestBean {
    public void method1(){
        System.out.println("method1");
    }
    public void method2(){
        System.out.println("method2");
    }
    public void method3(){
        throw new IllegalStateException();
    }
}
