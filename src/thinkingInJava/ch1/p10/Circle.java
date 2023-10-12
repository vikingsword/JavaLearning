package thinkingInJava.ch1.p10;

/**
 * @author: vikingar
 * @time: 2023/10/12 22:43
 * @description:
 */
public class Circle implements Shape{
    @Override
    public void erase() {
        System.out.println("circle erase");
    }

    @Override
    public void draw() {
        System.out.println("circle draw");
    }
}
