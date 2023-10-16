package thinkingInJava.ch3.p41;

/**
 * @author: vikingar
 * @time: 2023/10/16 22:08
 * @description:
 */
public class PassObject {
    static void f(Letter l) {
        l.c = 'z';
    }

    public static void main(String[] args) {
        Letter x = new Letter();
        x.c = 'a';
        System.out.println("x.c = " + x.c);
        f(x);
        System.out.println("x.c = " + x.c);

    }
}
