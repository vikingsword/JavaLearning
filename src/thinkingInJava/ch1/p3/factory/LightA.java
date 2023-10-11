package thinkingInJava.ch1.p3.factory;

/**
 * @author vikingar
 * @time 2023/10/11 22:52
 */
public class LightA implements LightProduct{
    @Override
    public void operate() {
        // on
        System.out.println("light on");
    }
}
