package thinkingInJava.ch1.p10;

import thinkingInJava.ch1.p10.Circle;

/**
 * @author: vikingar
 * @time: 2023/10/12 0:03
 * @description:
 */

public class Main {

    public static void doSomething(Shape s) {
        s.draw();
        s.erase();
    }

    public static void main(String[] args) {
        Circle circle = new Circle();
        doSomething(circle);

        System.out.println("------------");

        Triangle triangle = new Triangle();
        doSomething(triangle);



    }



}
