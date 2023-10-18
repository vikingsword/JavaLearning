package thinkingInJava.ch4.p66.prac4;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: vikingar
 * @time: 2023/10/18 22:45
 * @description:
 */
public class PrintPrime {
    public static void main(String[] args) {
        List<Integer> primeList = new ArrayList<>();
        for (int i = 3; i < 100; i++) {
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    break;
                }
                if (i == j + 1) {
                    primeList.add(i);
                }
            }

        }

        primeList.forEach(System.out::println);
    }
}
