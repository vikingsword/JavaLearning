package thinkingInJava.ch2.p29;

/**
 * @author: vikingar
 * @time: 2023/10/13 23:16
 * @description:
 */
public class Main {
    public static void main(String[] args) {
        StaticTest staticTest = new StaticTest();
        System.out.println(staticTest.a);
//        System.out.println(StaticTest::a);
        System.out.println(StaticTest.a);

        StaticTest staticTest1 = new StaticTest();
        staticTest1.a++;
        System.out.println(StaticTest.a);


        System.out.println("-------------");
        System.out.println("current a is: ");
        System.out.println(StaticTest.a);
        System.out.println("after increment: ");
        Incrementable.increment();
        System.out.println(StaticTest.a);
    }
}
