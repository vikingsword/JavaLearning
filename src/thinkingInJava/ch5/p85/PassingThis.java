package thinkingInJava.ch5.p85;

/**
 * @author: vikingar
 * @time: 2023/10/23 23:50
 * @description:
 */
public class PassingThis {
    public static void main(String[] args) {
        new Person().eat(new Apple());
    }
}
