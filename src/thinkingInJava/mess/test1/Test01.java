package thinkingInJava.mess.test1;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author: vikingar
 * @time: 2023/10/25 17:38
 * @description:
 */
public class Test01 {
    public static void main(String[] args) {
        Map<String, TestObject> map = new HashMap<>();
        map.put("1", new TestObject("vikingar"));
        map.put("2", new TestObject("niemandea"));
        map.put("3", new TestObject("john"));
        map.put("4", new TestObject("tom"));


        map.entrySet().stream().map(item -> item.getValue().getName()).filter(o->o.length() > 3).sorted(((o1, o2) -> o2.length() - o2.length())).forEach(System.out::println);

        System.out.println("----------------------");

        long count = map.entrySet().stream().filter(o -> o.getValue().getName().equals("niemandea")).count();
        System.out.println(count);

        System.out.println("-------------------");

        map.entrySet().stream().mapToInt(o -> Integer.parseInt(o.getKey())).boxed().forEach(System.out::print);


    }
}
