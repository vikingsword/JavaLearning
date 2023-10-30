package thinkingInJava.ch5.p107.prac22;

import thinkingInJava.ch5.p107.prac21.Money;

/**
 * @author: vikingar
 * @time: 2023/10/30 20:56
 * @description:
 */
public class Main {
    public static void main(String[] args) {
        PayMoney payMoney1 = new PayMoney(Money.ONE);
        PayMoney payMoney2 = new PayMoney(Money.FIVE);
        PayMoney payMoney3 = new PayMoney(Money.HUNDRED);

        payMoney1.pay();
        payMoney2.pay();
        payMoney3.pay();
        
    }
}
