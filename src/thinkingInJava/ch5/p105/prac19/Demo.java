package thinkingInJava.ch5.p105.prac19;

import java.util.Arrays;

/**
 * @author: vikingar
 * @time: 2023/10/30 20:29
 * @description:
 */
public class Demo {
    static void printStr(String[]... args) {
        for (String[] strArr : args) {
            Arrays.stream(strArr).forEach(System.out::println);
            System.out.println("------------");
        }
    }
}
