package thinkingInJava.ch4.mess;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author: vikingar
 * @time: 2023/10/18 8:55
 * @description:
 */
public class InputStreamTest {
    public static void main(String[] args) throws IOException {

        FileOutputStream fos = new FileOutputStream("./fos.txt", true);
//        FileOutputStream fos = new FileOutputStream("javase\\fos.txt",true);
        for (int i = 0; i < 10; i++) {
            fos.write("hello".getBytes());
            fos.write("\r\n".getBytes());
        }
        fos.close();
    }
}
