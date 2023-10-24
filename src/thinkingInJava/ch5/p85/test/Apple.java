package thinkingInJava.ch5.p85.test;

/**
 * @author: vikingar
 * @time: 2023/10/24 23:43
 * @description:
 */
public class Apple {

    Apple getPeel() {
        return Peeler.peel(this);
    }
}
