package kr.hs.study.springteststudy.AnnotationStudy.beans;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;

@Getter
public class TestBean2 {
    @Autowired
    private DataBean dataBean;
}
