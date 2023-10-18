package thinkingInJava.ch4.p67;

/**
 * @author: vikingar
 * @time: 2023/10/18 22:58
 * @description:
 */
public class CommaOperator {
    public static void main(String[] args) {
        for (int i = 1, j = i + 10; i < 5; i++, j = i * 2) {
            System.out.println("i = " + i + "   j = " + j);
        }
    }
}
