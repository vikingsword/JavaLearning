package thinkingInJava.ch5.p78;

/**
 * @author: vikingar
 * @time: 2023/10/23 0:04
 * @description:
 */
public class Main {
    public static void main(String[] args) {
        new Tree();
        new Tree(100);
        Tree tree = new Tree();
        tree.info();
        tree.info("method overload: ");

        System.out.println("---------------");

        new Tree();
        new Tree(100);
        Tree tree2 = new Tree(10);
        tree2.info();
        tree2.info("method overload");


    }
}
