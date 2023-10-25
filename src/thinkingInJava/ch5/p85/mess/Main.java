package thinkingInJava.ch5.p85.mess;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author: vikingar
 * @time: 2023/10/25 17:02
 * @description:
 */
public class Main {
    public static void main(String[] args) {
        List<TestObject> list = new ArrayList<>();
        list.add(new TestObject(1));
        list.add(new TestObject(2));
        list.add(new TestObject(3));
        list.add(new TestObject(4));

        List<TestObject> afterSort = list.stream().filter(o -> o.getNumber() > 2).collect(Collectors.toList());
        afterSort.forEach(o -> {
            System.out.println(o.getNumber());
        });

        List<TestObject> afterSort2 = list.stream().sorted(new Comparator<TestObject>() {
            @Override
            public int compare(TestObject o1, TestObject o2) {
                return o2.getNumber() - o1.getNumber();
            }
        }).collect(Collectors.toList());


        System.out.println("---------------------");
        for (TestObject item : afterSort2) {
            System.out.println(item.getNumber());
        }



    }
}
