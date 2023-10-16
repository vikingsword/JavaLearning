package thinkingInJava.ch3.p44;

/**
 * @author: vikingar
 * @time: 2023/10/16 22:31
 * @description:
 */
public class Equivalence {
    public static void main(String[] args) {
        Integer i = new Integer(1);
        Integer i2 = new Integer(1);
        System.out.println(i == i2);
        System.out.println(i != i2);

        System.out.println("---------------");
        int j = 1;
        int k = 1;
        System.out.println(j == k);


    }
}
