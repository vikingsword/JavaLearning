package thinkingInJava.ch3.p47;

/**
 * @author: vikingar
 * @time: 2023/10/17 19:45
 * @description:
 */
public class Main {
    public static void main(String[] args) {
        int i1 = 0x2f;
        System.out.println(i1);

        int i2 = 0x2F;
        System.out.println(i2);

        System.out.println("i2 = " + Integer.toBinaryString(i2));

        char c = 0xffff;
        System.out.println("c = " + Integer.toBinaryString(c));

        long l = 0xff;
        System.out.println("l = " + Long.toBinaryString(l));


    }
}
