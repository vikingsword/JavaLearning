package thinkingInJava.ch5.p102;

/**
 * @author: vikingar
 * @time: 2023/10/30 20:10
 * @description:
 */
public class NewVarArgs {
    static void printArray(Object... args) {
        for (Object o : args)
            System.out.print(o + " ");
        System.out.println();
    }
}
