package thinkingInJava.ch3.p54;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author: vikingar
 * @time: 2023/10/17 20:23
 * @description:
 */
public class Main {
    public static void main(String[] args) {
        int i = 200;
        long  l = (long)i;

        int l2 = (int) 3e65;
        System.out.println(l2);

//        String s = "123a";
        String s = "123";
        int a = Integer.valueOf(s);
        System.out.println("a = " + a);

        char d = 'a';
        String s2 = String.valueOf(d);
        System.out.println("s2 = " + s2);

        List<String> list = new ArrayList<>();
        char[] chs = {'a','b','c'};
        list.add("a");
        list.add("b");
        list.forEach(System.out::println);
        System.out.println("---------------");
        list.forEach(o -> System.out.println(o));

        List<Student> stuList = new ArrayList<>();
        stuList.add(new Student(1, "zs"));
        stuList.add(new Student(2, "ls"));
        stuList.add(new Student(3, "wu"));

        for (Student student : stuList) {
            System.out.println("stuId: " + student.getId() + " stuName: " + student.getName());
        }
        System.out.println("-----------------");

        List<Student> sList2 = stuList.stream().filter(o -> o.getId() > 1).collect(Collectors.toList());

        System.out.println("student list after filter: ");
        sList2.forEach(item -> System.out.println("stuId: " + item.getId() + " stuName: " + item.getName()));



    }
}
