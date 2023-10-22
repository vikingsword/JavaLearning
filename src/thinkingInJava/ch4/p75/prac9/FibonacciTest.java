package thinkingInJava.ch4.p75.prac9;

import java.util.Scanner;

/**
 * @author: vikingar
 * @time: 2023/10/22 23:12
 * @description:
 */
public class FibonacciTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("input a number: ");
        int input = sc.nextInt();
        int num1 = 1;
        int num2 = 1;
        int sum = 0;
        System.out.print("1 2 ");
        while (sum < input) {
            sum = num1 + num2;
            num1 = num2;
            num2 = sum;
            System.out.print(sum + " ");
        }
    }
}
