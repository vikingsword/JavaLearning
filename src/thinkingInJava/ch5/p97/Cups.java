package thinkingInJava.ch5.p97;

/**
 * @author: vikingar
 * @time: 2023/10/30 19:05
 * @description:
 */
public class Cups {
    static Cup cup1;
    static Cup cup2;
    static {
         cup1 = new Cup(1);
         cup2 = new Cup(2);
    }

    Cups() {
        System.out.println("cups");
    }
}
