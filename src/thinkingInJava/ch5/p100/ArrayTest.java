package thinkingInJava.ch5.p100;

import java.util.Arrays;
import java.util.List;

/**
 * @author: vikingar
 * @time: 2023/10/30 19:44
 * @description:
 */
public class ArrayTest {

    public static void main(String[] args) {
        Integer[] arr = {
                new Integer(1),
                new Integer(2),
                new Integer(3)
        };

        Integer[] arr2 = {
                new Integer(4),
                5
        };

        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr2));

        System.out.println("----------------");

        int[] ints = {5, 6, 7};
        System.out.println(Arrays.toString(ints));

        System.out.println("----------------");

        List<Integer> list = Arrays.asList(1, 2, 3);
        Arrays.stream(ints).boxed().sorted((o1,o2) -> o2 - o1).forEach(System.out::println);

        System.out.println("-----------------");
        list.stream().forEach(System.out::println);



    }
}
