package thinkingInJava.ch4.p68;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @author: vikingar
 * @time: 2023/10/19 23:46
 * @description:
 */
public class ForEachInt {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        for (int i : arr) {
            System.out.print(i + ", ");
        }

        System.out.println("--------------");
        List<Integer> list = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            int num = random.nextInt(10);
            list.add(num);
        }
        list.forEach(o -> {System.out.print(o + ", ");});
    }
}
