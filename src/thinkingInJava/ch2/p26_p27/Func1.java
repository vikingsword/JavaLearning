package thinkingInJava.ch2.p26_p27;

import java.util.ArrayList;
import java.util.List;

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

    public void test01() {
        List<String> list = new ArrayList<>();
        list.add("one");
        list.add("two");
        list.add("three");

        for (int i = 0; i < list.size(); i++) {
            String s = list.get(i);
            System.out.println(s);
        }
    }
}
