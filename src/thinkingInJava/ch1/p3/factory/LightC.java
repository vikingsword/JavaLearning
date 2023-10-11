package thinkingInJava.ch1.p3.factory;

/**
 * @author vikingar
 * @time 2023/10/11 22:55
 */
public class LightC implements LightProduct{
    @Override
    public void operate() {
        // lighten
        System.out.println("lighten");
    }
}
