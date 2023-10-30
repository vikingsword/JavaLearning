package thinkingInJava.ch5.p102;

/**
 * @author: vikingar
 * @time: 2023/10/30 20:06
 * @description:
 */
public class VarArgs {
    static void printArray(Object[] os) {
        for (Object o : os) {
            System.out.println(o);
        }
    }
}
