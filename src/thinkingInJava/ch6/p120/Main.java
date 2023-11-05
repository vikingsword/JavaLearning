package thinkingInJava.ch6.p120;

import thinkingInJava.ch4.p66.prac1.PrintNumbers;

/**
 * @author: vikingar
 * @time: 2023/11/5 22:27
 * @description:
 */
public class Main {
    private String value1, value2;
    private WaterSource waterSource = new WaterSource();
    private int i;
    private float f;

    public String toString() {
        return "value1 = " + value1 + " " + "value2 = " + value2 + ";" + "\n" +
                "i = " + i + "\n" + "f = " + f + "\n" + "waterSource = " + waterSource;
    }

    public static void main(String[] args) {
        Main main = new Main();
        System.out.println(main);
    }
}
