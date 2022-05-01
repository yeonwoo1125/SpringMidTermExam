package kr.hs.study.springteststudy.AnnotationStudy.beans;


import lombok.Getter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@Getter
public class TestBean {
    private int data1;
    private String data2;
    private DataBean data3;

    public TestBean(@Value("200")int data1, @Value("spring")String data2, DataBean data3){
        this.data1 = data1;
        this.data2 = data2;
        this.data3 = data3;
    }
}
