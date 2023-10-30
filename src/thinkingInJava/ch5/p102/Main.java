package thinkingInJava.ch5.p102;

/**
 * @author: vikingar
 * @time: 2023/10/30 20:06
 * @description:
 */
public class Main {
    public static void main(String[] args) {
        VarArgs.printArray(new Object[]{1, 2, 3, 4, 5});
        System.out.println("----------");
        VarArgs.printArray(new Object[]{"str",2, 2.2F,3.4});

    }
}
