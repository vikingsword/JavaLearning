package thinkingInJava.ch4.p68;

/**
 * @author: vikingar
 * @time: 2023/10/18 23:09
 * @description:
 */
public class ForEachString {
    public static void main(String[] args) {
        String s = "vikingar";
        for (char c : s.toCharArray()) {
            System.out.print(c + " ");
        }
    }
}
