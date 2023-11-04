package thinkingInJava.ch6.p118;

/**
 * @author: vikingar
 * @time: 2023/11/4 20:21
 * @description:
 */
public class Main {
    public static void main(String[] args) {
//        Student s = new Student();
        Student aStudent = Student.createAStudent();
        aStudent.setName("zs");
        String name = aStudent.getName();
        System.out.println(name);
    }
}
