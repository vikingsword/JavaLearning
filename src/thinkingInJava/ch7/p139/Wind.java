package thinkingInJava.ch7.p139;

/**
 * @author: vikingar
 * @time: 2023/11/6 22:44
 * @description:
 */
public class Wind extends Instrument{
    public static void main(String[] args) {
        Wind wind = new Wind();
        // 子类对象传给父类
        Instrument.tune(wind);
    }
}
