package thinkingInJava.ch3.p53;

/**
 * @author: vikingar
 * @time: 2023/10/17 20:13
 * @description:
 */
public class Ternary {
    public static int test01(Integer i) {
        return i > 10 ? i * 100 : i * 10;
    }

    public static void main(String[] args) {
        int res1 = test01(9);

        int res2 = test01(11);

        System.out.println("res1 = " + res1);
        System.out.println("res2 = " + res2);
    }
}
