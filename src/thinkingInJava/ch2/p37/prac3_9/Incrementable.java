package thinkingInJava.ch2.p37.prac3_9;

/**
 * @author: vikingar
 * @time: 2023/10/15 22:42
 * @description:
 */
public class Incrementable {

    public static int target = 1;
    public static void increment() {
        target++;
        System.out.println("target = " + target);
    }

    public void increment2() {
        System.out.println("this is increment 2");
    }
}
