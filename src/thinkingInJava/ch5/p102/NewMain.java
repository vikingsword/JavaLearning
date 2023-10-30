package thinkingInJava.ch5.p102;

import java.util.ArrayList;

/**
 * @author: vikingar
 * @time: 2023/10/30 20:11
 * @description:
 */
public class NewMain {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        NewVarArgs.printArray(new Integer(1), new Float(2.2), 3, 3.3, "string", list);
    }
}
