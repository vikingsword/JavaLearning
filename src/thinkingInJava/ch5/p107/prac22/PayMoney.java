package thinkingInJava.ch5.p107.prac22;

import thinkingInJava.ch5.p107.prac21.Money;

/**
 * @author: vikingar
 * @time: 2023/10/30 20:57
 * @description:
 */
public class PayMoney {
    Money money;

    public PayMoney(Money money) {
        this.money = money;
    }

    void pay() {
        switch (money) {
            case ONE:
                System.out.println("pay one");
                break;
            case FIVE:
                System.out.println("pay five");
                break;
            case TEN:
                System.out.println("pay ten");
                break;
            case HUNDRED:
                System.out.println("pay hundred");
                break;
            default:
                System.out.println("i don't know");
        }
    }
}
