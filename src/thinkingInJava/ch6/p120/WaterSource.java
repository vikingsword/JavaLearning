package thinkingInJava.ch6.p120;

/**
 * @author: vikingar
 * @time: 2023/11/5 22:28
 * @description:
 */
public class WaterSource {
    private String s;
    WaterSource() {
        System.out.println("water source");
        s = "Constructed";
    }

    public String toString() {
        return s;
    }
}
