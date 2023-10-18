package thinkingInJava.ch4.p65;

/**
 * @author: vikingar
 * @time: 2023/10/18 22:05
 * @description:
 */
public class WhileTest {

    public static boolean condition() {
        boolean res = Math.random() < 0.99;
        System.out.print(res + ", ");
        return res;
    }
    public static void main(String[] args) {
        while (condition())
            System.out.println("inside 'while'");
        System.out.println("outside 'while'");
    }
}
