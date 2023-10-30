package thinkingInJava.ch5.p103;

/**
 * @author: vikingar
 * @time: 2023/10/30 20:18
 * @description:
 */
public class Main {
    public static void main(String[] args) {
        OptionalTrailingArguments.f(1, "one");
        OptionalTrailingArguments.f(2, "one", "two");
        OptionalTrailingArguments.f(0);

    }
}
