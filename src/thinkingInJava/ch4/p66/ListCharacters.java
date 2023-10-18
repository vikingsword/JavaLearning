package thinkingInJava.ch4.p66;

/**
 * @author: vikingar
 * @time: 2023/10/18 22:12
 * @description:
 */
public class ListCharacters {
    public static void main(String[] args) {
        for (char c = 0; c < 128; c ++) {
            if (Character.isLowerCase(c)) {
                System.out.println("value: " + (int)c + " Character: " + c);
            }
        }
    }
}
