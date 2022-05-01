package kr.hs.study.springteststudy.AnnotationStudy.beans;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;

@Getter
public class TestBean3 {
    @Autowired
    private DataBean dataBean;
}
