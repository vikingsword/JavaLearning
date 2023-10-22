package thinkingInJava.ch5.p78;

/**
 * @author: vikingar
 * @time: 2023/10/23 0:01
 * @description:
 */
public class Tree {
    int height;
    Tree() {
        System.out.println("planting a seed");
        height = 0;
    }
    Tree(int initialHeight) {
        height = initialHeight;
        System.out.println("Create a new tree that is " + height + " tall");

    }

    void info() {
        System.out.println("There is " + height + " feet tall");
    }

    void info(String s) {
        System.out.println(s + " : " + "There is " + height + " feet tall");
    }
}
