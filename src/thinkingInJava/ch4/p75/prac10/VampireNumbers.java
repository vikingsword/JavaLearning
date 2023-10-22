package thinkingInJava.ch4.p75.prac10;

/**
 * @author: vikingar
 * @time: 2023/10/22 23:20
 * @description:
 */
public class VampireNumbers {
    public static void main(String[] args) {
        for (int i = 1000; i <= 9999; i++) {
            int num1 = i / 1000;          // 千位数
            int num2 = (i % 1000) / 100;  // 百位数
            int num3 = (i % 100) / 10;    // 十位数
            int num4 = i % 10;            // 个位数

            // 检查i是否是吸血鬼数字
            if (isVampireNumber(i, num1, num2, num3, num4)) {
                System.out.println(i);
            }
        }
    }

    // 检查一个数字是否是吸血鬼数字
    static boolean isVampireNumber(int num, int num1, int num2, int num3, int num4) {
        int fang1 = num1 * 10 + num2;
        int fang2 = num3 * 10 + num4;

        return num == fang1 * fang2 || num == fang2 * fang1;
    }
}
