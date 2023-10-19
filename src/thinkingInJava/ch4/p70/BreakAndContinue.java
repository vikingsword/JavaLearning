package thinkingInJava.ch4.p70;

import org.w3c.dom.ranges.Range;

import java.util.Random;

/**
 * @author: vikingar
 * @time: 2023/10/20 0:06
 * @description:
 */
public class BreakAndContinue {

    static void test1() {
        for (int i = 0; i < 100; i++) {
            if (i == 74) break;
            if (i % 9 != 0) continue;
            System.out.print(i + " ");
        }
    }

    static void test2() {
        int i = 0;
        while (true) {
            i++;
            int j = i * 27;
            if (j == 1269) break;
            if (i % 10 != 0) continue;
            System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {

//        test1();

        test2();

    }
}
