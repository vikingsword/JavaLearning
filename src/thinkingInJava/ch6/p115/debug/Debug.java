package thinkingInJava.ch6.p115.debug;

import java.util.Scanner;

/**
 * @author: vikingar
 * @time: 2023/10/31 20:51
 * @description:
 */
public class Debug {
    public void debug() {
        System.out.println("input your name: ");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        System.out.println("your input is " + input);
    }
}
