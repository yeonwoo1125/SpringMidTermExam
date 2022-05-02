package kr.hs.study.springteststudy.xmlTest.beans;

public class TestBean2 {
    private DataBean dataBean;
    private int value1;
    private String value2;

    public DataBean getDataBean() {
        return dataBean;
    }

    public int getValue1() {
        return value1;
    }

    public String getValue2() {
        return value2;
    }

    public TestBean2(DataBean dataBean, int value1, String value2) {
        this.dataBean = dataBean;
        this.value1 = value1;
        this.value2 = value2;
    }
}
