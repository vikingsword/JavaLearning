package thinkingInJava.ch4.p64;

import java.util.Scanner;

/**
 * @author: vikingar
 * @time: 2023/10/17 21:16
 * @description:
 */
public class GuessNumber {

    static int res = 5;
    public static void main(String[] args) {
        System.out.println("guess a number: ");
        Scanner sc = new Scanner(System.in);
        int guess = sc.nextInt();
        int count = 3;
        while (res != guess && count > 0) {
            System.out.println("try again: ");
            guess = sc.nextInt();
            count--;
        }
        if (res == guess) {
            System.out.println("you are right!");
        } else {
            System.out.println("game over!");
        }
    }
}
