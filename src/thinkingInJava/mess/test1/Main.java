package thinkingInJava.mess.test1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author: vikingar
 * @time: 2023/10/25 17:16
 * @description:
 */
public class Main {
    public static void main(String[] args) {
        List<TestObject> list = new ArrayList<>();
        list.add(new TestObject("vikingar"));
        list.add(new TestObject("niemandea"));
        list.add(new TestObject("tonny"));
        list.add(new TestObject("jerry"));

        List<TestObject> afterSorted = list.stream().sorted(new Comparator<TestObject>() {
            @Override
            public int compare(TestObject o1, TestObject o2) {
                return o1.getName().charAt(0) - o2.getName().charAt(0);
            }
        }).collect(Collectors.toList());

        System.out.println("-------------");
        list.stream().sorted((o1, o2) -> o2.getName().charAt(0) - o1.getName().charAt(0)).forEach(o -> System.out.println(o.getName()));

        System.out.println("---------------");

        list.stream().filter(o -> o.getName().length() > 5).mapToInt(o -> o.getName().length()).forEach(System.out::println);
        List<Integer> integerList = list.stream().filter(o -> o.getName().length() > 5).mapToInt(o -> o.getName().length()).boxed().collect(Collectors.toList());

        System.out.println("---------------");
        for (int item : integerList) {
            System.out.println(item);
        }

    }

}
