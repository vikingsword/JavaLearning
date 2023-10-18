package thinkingInJava.ch4.p67;

import java.util.Random;

/**
 * @author: vikingar
 * @time: 2023/10/18 23:04
 * @description:
 */
public class ForEachFloat {
    public static void main(String[] args) {
        Random random = new Random(100);
        float[] floatArr = new float[10];
        for (int i = 0; i < 10; i++) {
            floatArr[i]  = random.nextFloat();
        }
        // java8+ foreach
        for (float x : floatArr) {
            System.out.print(x + ", ");
        }


    }
}
