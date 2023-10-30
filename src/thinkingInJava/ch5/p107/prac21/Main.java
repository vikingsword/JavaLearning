package thinkingInJava.ch5.p107.prac21;

/**
 * @author: vikingar
 * @time: 2023/10/30 20:53
 * @description:
 */
public class Main {
    public static void main(String[] args) {
        for (Money money : Money.values()) {
            System.out.println(money.ordinal() + " : " + money);
        }


    }
}
