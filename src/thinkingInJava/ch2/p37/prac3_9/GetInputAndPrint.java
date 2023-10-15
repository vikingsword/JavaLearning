package thinkingInJava.ch2.p37.prac3_9;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author: vikingar
 * @time: 2023/10/15 22:56
 * @description:
 */
public class GetInputAndPrint {
    public void GetThreeParam() {
        Scanner sc = new Scanner(System.in);
        List<String> list = new ArrayList<>();
        System.out.println("input your character: ");
        for (int i = 0; i < 3; i++) {
            String input = sc.nextLine();
            list.add(input);
        }

        System.out.println("your input is : ");
        list.forEach(System.out::println);

    }
}
