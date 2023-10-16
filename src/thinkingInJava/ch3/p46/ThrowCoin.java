package thinkingInJava.ch3.p46;

import java.util.Random;

/**
 * @author: vikingar
 * @time: 2023/10/16 23:09
 * @description: throw coin
 */
public class ThrowCoin {
    public static void main(String[] args) {
//        method1();
        method2();
    }

    public static void method2() {
        int count = 10;
        while (count-- > 0) {
            int i = (int) (Math.random() * 2);
            System.out.println("随机生成的0或1： " + i);
        }
    }

    public static void method1() {
        Random rand = new Random();
        int count = 10;
        while (count-- > 0) {
            int i = rand.nextInt(2);
            System.out.println("随机生成的0或1： " + i);
        }
    }
}
