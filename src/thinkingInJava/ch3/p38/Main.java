package thinkingInJava.ch3.p38;

import org.apache.commons.math3.analysis.function.Exp;

/**
 * @author: vikingar
 * @time: 2023/10/15 23:14
 * @description: operators
 */
public class Main {
    public static void main(String[] args) {
        double x = 2.5;
        double y = 4.0;

        // 求平方根
        double sqrtResult = Math.sqrt(x);

        // 指数运算
        double expResult = Math.exp(x);

        // 对数运算
        double logResult = Math.log(x);

        // 正弦和余弦
        double sinResult = Math.sin(x);
        double cosResult = Math.cos(x);

        // 取整
        int ceilResult = (int) Math.ceil(x); // 向上取整
        int floorResult = (int) Math.floor(x); // 向下取整
        long roundResult = Math.round(x); // 四舍五入

        // 最大值和最小值
        double maxResult = Math.max(x, y);
        double minResult = Math.min(x, y);

    }
}
