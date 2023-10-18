package thinkingInJava.ch4.p64;

import thinkingInJava.ch3.p54.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author: vikingar
 * @time: 2023/10/18 16:13
 * @description: this is the list of student for test.
 */
public class Main {
    public static void main(String[] args) {
        ArrayList<Student> stuList = new ArrayList<>();
        Student s1 = new Student(1, "ls");
        Student s2 = new Student(2, "wu");
        Student s3 = new Student(3, "zs");

        stuList.add(s1);
        stuList.add(s2);
        stuList.add(s3);

        stuList.forEach(i -> System.out.println(i.getName()));

        printList();

        System.out.println("------------------");
        List<Student> filterList = stuList.stream().filter(o -> "zs".equals(o.getName())).collect(Collectors.toList());
        filterList.forEach(o -> {
            System.out.println("id = " + o.getId() + "; name = " + o.getName());
        });

    }

    public static void printList() {
        System.out.println("test");
    }
}
