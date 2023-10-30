package thinkingInJava.ch5.p97.prac14;


/**
 * @author: vikingar
 * @time: 2023/10/30 19:18
 * @description:
 */
public class StaticTest2 {
    static String str1 = "str1";
    static String str2;

    static {
        str2 = "str2";
    }

    static void printStr() {
        System.out.println(str1);
        System.out.println(str2);
    }
}
