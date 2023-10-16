package thinkingInJava.ch3.p40.prac2;

import com.sun.org.apache.xml.internal.security.transforms.implementations.TransformXPath2Filter;

/**
 * @author: vikingar
 * @time: 2023/10/16 22:04
 * @description:
 */
public class PracAssignment {
    public static void main(String[] args) {
        PracTank t1 = new PracTank();
        PracTank t2 = new PracTank();
        t1.level = 1.1F;
        t2.level = 2.2F;
        System.out.println("t1.level = " + t1.level + "\nt2.level = " + t2.level);

        System.out.println("--------------");
        t1.level = t2.level;
        System.out.println("t1.level = " + t1.level + "\nt2.level = " + t2.level);

    }
}
