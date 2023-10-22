package thinkingInJava.ch5.p79;

/**
 * @author: vikingar
 * @time: 2023/10/23 0:07
 * @description:
 */
public class OverloadingOrder {
    public static void f(String s, int i){
        System.out.println("String: " + s + "; i: " + i);
    }

    public static void f(int i, String s) {
        System.out.println("i: " + i + "; String : " + s);
    }
    public static void main(String[] args) {
        f(1,"2");
        f("2",1);
    }
}
