package thinkingInJava.ch4.p66.prac1;

/**
 * @author: vikingar
 * @time: 2023/10/18 22:20
 * @description:
 */
public class PrintNumbers {

    static void print1() {
        for (int i = 1; i < 101; i++) {
            System.out.println(i);
        }
    }

    static void print2() {
        int i = 1;
        while (i < 101) {
            System.out.println(i);
            i++;
        }
    }

    static void print3() {
        int i = 1;
        do {
            System.out.println(i++);
        } while (i < 101);
    }

    public static void main(String[] args) {
//        print1();
//        print2();
        print3();
    }
}
