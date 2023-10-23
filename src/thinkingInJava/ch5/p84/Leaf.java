package thinkingInJava.ch5.p84;

/**
 * @author: vikingar
 * @time: 2023/10/23 23:39
 * @description:
 */
public class Leaf {
    int i = 0;
    Leaf increment() {
        i++;
        return this;
    }

    void print() {
        System.out.println("i = " + i);
    }

    public static void main(String[] args) {
        Leaf leaf = new Leaf();
        leaf.increment().increment().increment();
        leaf.print();
    }
}
