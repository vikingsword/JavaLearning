package thinkingInJava.ch1.p3.factory;

/**
 * @author vikingar
 * @time 2023/10/11 22:58
 */
public class LightFactoryA implements LightFactory{
    @Override
    public LightProduct operateLight() {
        return new LightA();
    }
}
