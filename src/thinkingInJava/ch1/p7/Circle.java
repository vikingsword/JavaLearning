package thinkingInJava.ch1.p7;


/**
 * @author: vikingar
 * @time: 2023/10/11 23:32
 * @description:
 */
public class Circle extends Shape{

    public int length = 1;
    void getLength() {
        double len = (double) (3.14 * 2 * length);
        System.out.println("the length of circle is " + len);
    }

}
