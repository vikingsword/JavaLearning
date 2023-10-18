package thinkingInJava.ch4.mess;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author: vikingar
 * @time: 2023/10/18 8:44
 * @description:
 */
public class OutputStreamTest {
    public static void main(String[] args) throws IOException {
        FileOutputStream of = new FileOutputStream("./src/thinkingInJava/ch4/mess/test.txt");
        of.write("123".getBytes());

        of.close();

    }
}
