package thinkingInJava.ch7.p140.prac16;

/**
 * @author: vikingar
 * @time: 2023/11/6 22:47
 * @description:
 */
public class Amphibian {
    void test() {
        System.out.println("test");
    }

    void test2() {
        System.out.println("test2");
    }

    public static void tune(Amphibian a) {
        a.test();
        a.test2();
    }
}
