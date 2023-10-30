package thinkingInJava.ch5.p97;

/**
 * @author: vikingar
 * @time: 2023/10/30 19:07
 * @description:
 */
public class StaticTest {
    public static void main(String[] args) {
        System.out.println("inside main");
        Cups.cup1.f(100);
    }

    static Cups cups1 = new Cups();
//    static Cups cups2 = new Cups();

}
