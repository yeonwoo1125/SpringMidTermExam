package kr.hs.study.springteststudy.aopTest.beans;

import org.springframework.stereotype.Component;

public class TestBean {
    public void hello(){
        System.out.println("Hello~");
    }
    public void helloError(){
        throw new IllegalStateException();
    }
}
