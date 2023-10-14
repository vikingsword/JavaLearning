package thinkingInJava.ch2.p30;

/**
 * @author: vikingar
 * @time: 2023/10/14 20:33
 * @description:
 */
public class ShowProperties {
    public static void main(String[] args) {
//        System.getProperties().list(System.out);
        System.out.println(System.getProperty("user.name"));
        System.out.println(System.getProperty("java.library.path"));
    }
}
