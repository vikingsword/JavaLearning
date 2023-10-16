package thinkingInJava.ch3.p40;

/**
 * @author: vikingar
 * @time: 2023/10/16 21:56
 * @description:
 */
public class Assignment {

    public static void main(String[] args) {
        Tank t1 = new Tank();
        Tank t2 = new Tank();
        t1.level = 1;
        t2.level = 2;
        System.out.println("before assignment: ");
        System.out.println("t1.level: " + t1.level + "\nt2.level: " + t2.level);

        System.out.println("after assignment: ");
        t1 = t2;
        t1.level = 3;
        System.out.println("t1.level: " + t1.level + "\nt2.level: " + t2.level);

        System.out.println("--------------------");

        Tank t3 = new Tank();
        Tank t4 = new Tank();
        t3.level = 10;
        t4.level = 20;
        System.out.println("t3.level: " + t3.level + "\nt4.level: " + t4.level);
        t3.level = t4.level;
        System.out.println("t3.level: " + t3.level + "\nt4.level: " + t4.level);


    }
}
