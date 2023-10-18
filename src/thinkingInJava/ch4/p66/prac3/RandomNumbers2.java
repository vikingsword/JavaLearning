package thinkingInJava.ch4.p66.prac3;

import java.util.Random;

/**
 * @author: vikingar
 * @time: 2023/10/18 22:41
 * @description:
 */
public class RandomNumbers2 {

    public static void main(String[] args) {
        Random random = new Random();
        int temp = -1;
        int count = 0;
        while (true) {
            int num = random.nextInt(100);
            if (count != 0) {
                if (temp < num) {
                    System.out.println(temp + " < " + num);
                } else if (temp > num) {
                    System.out.println(temp + " > " + num);
                } else {
                    System.out.println(temp + " = " + num);
                    break;
                }
            }
            count++;
            temp = num;
        }
    }
}
