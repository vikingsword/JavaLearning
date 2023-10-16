package thinkingInJava.ch3.p45.prac5;

/**
 * @author: vikingar
 * @time: 2023/10/16 22:51
 * @description:
 */
public class Main {
    public static void main(String[] args) {
        Dog d1 = new Dog();
        Dog d2 = new Dog();
        d1.setName("spot");
        d1.setSays("Ruff");
        d2.setName("scruffy");
        d2.setSays("Wurf");

        System.out.println("dog1's name is " + d1.getName());
        System.out.println("dog1 says " + d1.getSays());

        System.out.println("dog2's name is " + d2.getName());
        System.out.println("dog2 says " + d2.getSays());

        System.out.println("-----------------");
        Dog dog;
        dog = d1;
        System.out.println("dog == d1 ? " + (d1 == dog));


    }
}
