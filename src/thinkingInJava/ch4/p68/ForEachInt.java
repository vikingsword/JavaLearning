package thinkingInJava.ch4.p68;

/**
 * @author: vikingar
 * @time: 2023/10/19 23:46
 * @description:
 */
public class ForEachInt {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        for (int i : arr) {
            System.out.print(i + ", ");
        }
    }
}
