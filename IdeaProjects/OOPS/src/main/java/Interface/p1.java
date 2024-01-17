package Interface;

public class p1 implements Test2, Test {


    @Override
    public void dis() {

    }

    @Override
    public void dis(String s) {
        Test2.super.dis(s);
    }
}
