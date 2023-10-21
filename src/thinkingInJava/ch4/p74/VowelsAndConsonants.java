package thinkingInJava.ch4.p74;

import com.sun.xml.internal.messaging.saaj.util.JAXMStreamSource;

import java.util.Random;

/**
 * @author: vikingar
 * @time: 2023/10/20 0:34
 * @description:
 */
public class VowelsAndConsonants {
    public static void main(String[] args) {
        Random random = new Random(47);
        for (int i = 0; i < 100; i++) {
            int c = random.nextInt(26) + 'a';
            System.out.print((char)c + ": ");
            switch (c) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    System.out.println("is vowel");
                    break;
                case 'y':
                case 'w':
                    System.out.println("sometimes a vowel");
                    break;
                default:
                    System.out.println("consonant");


            }
        }
    }
}
