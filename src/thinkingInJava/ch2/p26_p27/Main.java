package thinkingInJava.ch2.p26_p27;

/**
 * @author: vikingar
 * @time: 2023/10/13 22:41
 * @description:
 */
public class Main {
    public static void main(String[] args) {
        Func1 func1 = new Func1();
        func1.a = 1;
        func1.b = 2.2;
        func1.c = '2';
        System.out.println(func1.a);
        System.out.println(func1.b);
        System.out.println(func1.c);


        func1.printFunc1();

        int res = func1.getInt(1,2);
        System.out.println("res = " + res);

        int res2 = func1.storage("vikingar");
        System.out.println(res2);

    }
}
