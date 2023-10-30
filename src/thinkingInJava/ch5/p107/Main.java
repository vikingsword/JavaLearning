package thinkingInJava.ch5.p107;

import thinkingInJava.ch5.p106.Spiciness;

/**
 * @author: vikingar
 * @time: 2023/10/30 20:49
 * @description:
 */
public class Main {
    public static void main(String[] args) {
        Burrito burrito1 = new Burrito(Spiciness.NOT);
        Burrito burrito2 = new Burrito(Spiciness.MEDIUM);
        Burrito burrito3 = new Burrito(Spiciness.HOT);

        burrito1.describe();
        burrito2.describe();
        burrito3.describe();

    }
}
