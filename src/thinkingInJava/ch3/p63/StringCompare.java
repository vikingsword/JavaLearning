package thinkingInJava.ch3.p63;

import java.io.InputStream;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * @author: vikingar
 * @time: 2023/10/17 20:56
 * @description:
 */
public class StringCompare {
    public static boolean compare(String s1, String s2) {
        List<Character> charList1 = s1.chars().mapToObj(c -> (char) c).collect(Collectors.toList());
        List<Character> charList2 = s2.chars().mapToObj(c -> (char) c).collect(Collectors.toList());
        return IntStream.range(0, charList1.size()).allMatch(i -> charList1.get(i).equals(charList2.get(i)));
    }


    public static void main(String[] args) {
        boolean res = compare("zs", "ls");
        System.out.println(res);

        boolean res2 = compare("zs", "zs");
        System.out.println(res2);
    }



}
