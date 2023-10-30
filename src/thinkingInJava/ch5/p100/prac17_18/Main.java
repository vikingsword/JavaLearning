package thinkingInJava.ch5.p100.prac17_18;

/**
 * @author: vikingar
 * @time: 2023/10/30 19:57
 * @description:
 */
public class Main {
    public static void main(String[] args) {
        ArrayTest str = new ArrayTest("str");
        ArrayTest[] list = {
                new ArrayTest("s1"),
                new ArrayTest("s2"),
                new ArrayTest("s3")
        };

        for (ArrayTest s : list) {
//            System.out.println(s);
        }
    }
}
