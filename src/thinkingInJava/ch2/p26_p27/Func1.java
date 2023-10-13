package thinkingInJava.ch2.p26_p27;

/**
 * @author: vikingar
 * @time: 2023/10/13 22:41
 * @description:
 */
public class Func1 {
    public int a;
    public double b;
    protected char c;

    private float d;

    public void printFunc1() {
        System.out.println("this is function 1");
    }


    public int getInt(int a, int b) {
        return a + b;
    }

    public int storage(String s) {
        return s.length() * 2;
    }
}
