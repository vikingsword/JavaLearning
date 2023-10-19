package thinkingInJava.ch4.p69;

import thinkingInJava.ch4.p66.prac1.PrintNumbers;

/**
 * @author: vikingar
 * @time: 2023/10/19 23:53
 * @description:
 */
public class IfElse2 {

    static int getMax(int a, int b) {
        if (a < b) {
            return b;
        } else if (a > b) {
            return a;
        } else {
            return a;
        }
    }

    static int test(int testVal, int target) {
        if (testVal > target) {
            return +1;
        } else if(testVal < target) {
            return -1;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        int res = getMax(1,2);
        System.out.println(res);

        System.out.println(getMax(2,3));

        System.out.println(test(3,4));

    }


}
