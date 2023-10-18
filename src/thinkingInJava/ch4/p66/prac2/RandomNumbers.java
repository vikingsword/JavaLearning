package thinkingInJava.ch4.p66.prac2;

import sun.java2d.opengl.WGLSurfaceData;

import java.util.Random;

/**
 * @author: vikingar
 * @time: 2023/10/18 22:23
 * @description:
 */
public class RandomNumbers {

    public static void main(String[] args) {
        Random random = new Random();
        int temp = -1;
        for (int i = 0; i < 25; i++) {
            int num = random.nextInt(100) + 1;

            if (i != 0) {
                if (temp < num) {
                    System.out.println(temp + " < " + num);
                } else if (temp > num) {
                    System.out.println(temp + " > " + num);
                } else {
                    System.out.println(temp + " = " + num);
                }
            }

            temp = num;
        }

    }
}
