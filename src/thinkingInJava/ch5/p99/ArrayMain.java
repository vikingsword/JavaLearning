package thinkingInJava.ch5.p99;

import java.util.Random;

/**
 * @author: vikingar
 * @time: 2023/10/30 19:37
 * @description:
 */
public class ArrayMain {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        for (int i = 0; i < arr.length; i++) {
            System.out.println("arr[" + i + "] = " + arr[i]);
        }
//        System.out.println(arr[5]);

        System.out.println("--------------");
        Random random = new Random(47);
        int i = random.nextInt(20);
        int[] arr2;
        arr2 = new int[i];
        System.out.println("a.length = " + arr2.length);


    }
}
