package thinkingInJava.ch5.p107;

import thinkingInJava.ch5.p106.Spiciness;

/**
 * @author: vikingar
 * @time: 2023/10/30 20:43
 * @description: /bʊˈriːtoʊ/ 墨西哥卷饼 drug
 */
public class Burrito {
    Spiciness degree;
    Burrito(Spiciness degree) {
        this.degree = degree;
    }

    void describe() {
        System.out.print("this burrito is : ");
        switch (degree) {
            case NOT:
                System.out.println("not spicy at all");
                break;
            case MILD:
            case MEDIUM:
                System.out.println("a little hot");
                break;
            case HOT:
            case FILMING:
                System.out.println("too hot");
                break;
            default:
                System.out.println("i don't know");
        }
    }
}
