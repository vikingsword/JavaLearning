package thinkingInJava.ch1.p3.factory;

/**
 * @author vikingar
 * @time 2023/10/11 22:53
 */
public class LightB implements LightProduct{

    @Override
    public void operate() {
        // off
        System.out.println("off");
    }
}
