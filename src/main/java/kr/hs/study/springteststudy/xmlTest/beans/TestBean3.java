package kr.hs.study.springteststudy.xmlTest.beans;

import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Value;

@NoArgsConstructor
@Getter
public class TestBean3 {
    private DataBean dataBean;
    private int value1;
    private String value2;

    public TestBean3(DataBean dataBean, @Value("100")int value1, @Value("spring")String value2) {
        this.dataBean = dataBean;
        this.value1 = value1;
        this.value2 = value2;
    }
}
