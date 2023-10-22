package thinkingInJava.ch5.p76;

/**
 * @author: vikingar
 * @time: 2023/10/22 23:49
 * @description:
 */
public class SimpleConstructor {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            new Rock();
        }
        System.out.println("--------------");

        for (int i = 0; i < 10; i++) {
            new Rock2(i);
        }
    }
}
