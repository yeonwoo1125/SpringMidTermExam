package kr.hs.study.springteststudy.annoTest.beans;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Getter
@Component
public class TestBean {

    private DataBean dataBean;

    @Autowired
    public TestBean(DataBean dataBean){
        this.dataBean = dataBean;
    }
}
