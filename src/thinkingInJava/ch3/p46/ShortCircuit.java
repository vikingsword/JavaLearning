package thinkingInJava.ch3.p46;

/**
 * @author: vikingar
 * @time: 2023/10/16 23:23
 * @description: 程序短路
 */
public class ShortCircuit {
    public static boolean test1(int value) {
        System.out.println("(test " + value + " )");
        System.out.println("result: " + (value < 1));
        return value < 1;
    }

    public static boolean test2(int val) {
        System.out.println("(test " + val + " )");
        System.out.println("result: " + (val < 2));
        return val < 2;
    }

    public static boolean test3(int val) {
        System.out.println("(test " + val + " )");
        System.out.println("result: " + (val < 3));
        return val < 3;
    }

    public static void main(String[] args) {
        boolean b = test1(0) && test2(2) && test3(3);
        System.out.println("b = " + b);
    }
}
