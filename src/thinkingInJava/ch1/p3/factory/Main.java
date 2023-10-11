package thinkingInJava.ch1.p3.factory;

/**
 * @author vikingar
 * @time 2023/10/11 23:00
 */
public class Main {
    public static void main(String[] args) {
        LightFactoryA lightFactoryA = new LightFactoryA();
        LightProduct light = lightFactoryA.operateLight();
        light.operate();
    }
}
