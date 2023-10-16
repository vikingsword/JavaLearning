package thinkingInJava.ch3.p45;

import java.util.Random;

/**
 * @author: vikingar
 * @time: 2023/10/16 22:59
 * @description:
 */
public class Bool {
    public static void main(String[] args) {
        Random rand = new Random(47);
        int i = rand.nextInt(100);
        int j = rand.nextInt(100);
        System.out.println("i = " + i);
        System.out.println("j = " + j);

        System.out.println("i > j is " + (i > j));
        System.out.println("i < j is " + (i < j));
        System.out.println("i == j is " + (i == j));


    }
}
