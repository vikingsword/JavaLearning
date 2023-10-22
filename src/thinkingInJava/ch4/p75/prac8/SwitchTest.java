package thinkingInJava.ch4.p75.prac8;

/**
 * @author: vikingar
 * @time: 2023/10/22 23:09
 * @description:
 */
public class SwitchTest {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            switch (i) {
                case 1:
                    System.out.println(1);
                    break;
                case 2:
                    System.out.println(2);
                    break;
                case 3:
                    System.out.println(3);
                    break;
                default:
                    System.out.println("end");
            }
        }
    }
}
