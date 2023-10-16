package thinkingInJava.ch3.p42;

import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Random;

/**
 * @author: vikingar
 * @time: 2023/10/16 22:15
 * @description:
 */
public class MathOps {
    public static void main(String[] args) {
        Random rand = new Random(47);
        int i, j, k;
        j = rand.nextInt(100) + 1;
        System.out.println("j = " + j);
        k = rand.nextInt(100) + 1;
        System.out.println("k = " + k);
        i = j + k;
        System.out.println("j + k = " + i);
        i = j - k;
        System.out.println("j - k = " + i);

        System.out.println("-----------------");

        SecureRandom secureRandom = new SecureRandom();

        // 生成一个随机整数
        int randomInt = secureRandom.nextInt();
        System.out.println("随机整数: " + randomInt);

        // 生成一个随机字节数组
        byte[] randomBytes = new byte[10];
        secureRandom.nextBytes(randomBytes);
        System.out.println("随机字节数组: " + Arrays.toString(randomBytes));
    }
}
