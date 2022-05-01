package kr.hs.study.springteststudy.configStudy.beans;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
//생성자 DI
public class TestBean {
    private int data1;
    private String data2;
    private DataBean data3;

    public TestBean(int data1, String data2){
        this.data1 = data1;
        this.data2 = data2;
    }

    public TestBean(DataBean data3){
        this.data3 = data3;
    }
}
