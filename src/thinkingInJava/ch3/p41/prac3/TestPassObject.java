package thinkingInJava.ch3.p41.prac3;

/**
 * @author: vikingar
 * @time: 2023/10/16 22:11
 * @description:
 */
public class TestPassObject {
    public static void f(TestLetter c) {
        c.f = 1.1F;
    }

    public static void main(String[] args) {
        TestLetter x = new TestLetter();
        x.f = 2.2F;
        System.out.println("x.f = " + x.f);
        f(x);
        System.out.println("x.f = " + x.f);

    }
}
