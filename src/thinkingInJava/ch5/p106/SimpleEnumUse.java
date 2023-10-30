package thinkingInJava.ch5.p106;

/**
 * @author: vikingar
 * @time: 2023/10/30 20:38
 * @description:
 */
public class SimpleEnumUse {
    public static void main(String[] args) {
        Spiciness hot = Spiciness.HOT;
        System.out.println(hot);
        System.out.println("------------");

        for (Spiciness value : Spiciness.values()) {
            System.out.println(value + " : " + value.ordinal());
        }


    }
}
