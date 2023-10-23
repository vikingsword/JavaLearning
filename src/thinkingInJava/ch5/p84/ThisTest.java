package thinkingInJava.ch5.p84;

/**
 * @author: vikingar
 * @time: 2023/10/23 23:41
 * @description:
 */
public class ThisTest {
    int j = 0;
    ThisTest increment() {
        j++;
        return this;
    }

    void print() {
        System.out.println("j = " + j);
    }

    public static void main(String[] args) {
        ThisTest thisTest = new ThisTest();
        thisTest.increment().increment().print();
    }
}
