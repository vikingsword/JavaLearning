package thinkingInJava.ch5.p103;

/**
 * @author: vikingar
 * @time: 2023/10/30 20:17
 * @description:
 */
public class OptionalTrailingArguments {
    static void f(int required, String... args) {
        System.out.println("required = " + required);
        for (String s : args)
            System.out.print(s + " ");
        System.out.println();

    }
}
