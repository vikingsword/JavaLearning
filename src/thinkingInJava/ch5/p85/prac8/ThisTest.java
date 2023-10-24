package thinkingInJava.ch5.p85.prac8;

/**
 * @author: vikingar
 * @time: 2023/10/24 23:40
 * @description:
 */
public class ThisTest {
    void method1() {
        System.out.println("this");
        this.method2();
    }

    void method3() {
        System.out.println("no this");
        method2();
    }


    void method2() {
        System.out.println("method2");
    }

}
