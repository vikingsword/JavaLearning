package thinkingInJava.ch3.p45;

/**
 * @author: vikingar
 * @time: 2023/10/16 22:40
 * @description:
 */
public class EqualsMethod2 {

    public static void main(String[] args) {
        Value v1 = new Value();
        Value v2 = new Value();
        v1.setI(1);
        v2.setI(1);
        System.out.println(v1.equals(v2));


    }
}
