package thinkingInJava.ch4.p70.prac7;

/**
 * @author: vikingar
 * @time: 2023/10/20 0:22
 * @description:
 */
public class PrintNumbers {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            if (i == 99) break;
            System.out.println(i + " ");
        }
    }
}
