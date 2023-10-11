package thinkingInJava.ch1.p7;

/**
 * @author: vikingar
 * @time: 2023/10/11 23:35
 * @description:
 */
public class Square extends Shape{

    int length = 1;
    void getLength() {
        int len = 4 * length;
        System.out.println("the length of square is " + len);
    }
}
