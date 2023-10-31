package thinkingInJava.ch6.p111;

import thinkingInJava.ch6.p111.access.*;

/**
 * @author: vikingar
 * @time: 2023/10/31 20:35
 * @description:
 */
public class MyClassTest {
    public static void main(String[] args) {
        MyClass myClass = new MyClass();
        myClass.setId(1);
        myClass.setName("zs");

        System.out.println(myClass.getId());
        System.out.println(myClass.getName());

    }
}
