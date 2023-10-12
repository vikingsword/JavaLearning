package thinkingInJava.ch1.p10;

/**
 * @author: vikingar
 * @time: 2023/10/12 22:52
 * @description:
 */
public class Triangle implements Shape{

    @Override
    public void erase() {
        System.out.println("triangle erase");
    }

    @Override
    public void draw() {
        System.out.println("triangle draw");
    }
}
