package thinkingInJava.ch6.p119;

import thinkingInJava.ch6.p119.protectedDir.protectedDemo2;

/**
 * @author: vikingar
 * @time: 2023/11/4 20:25
 * @description:
 */
public class Main {
    public static void main(String[] args) {
        PublicDemo publicDemo = new PublicDemo();
        publicDemo.name = "zs";
        System.out.println(publicDemo.name);

        System.out.println("------");

        ProtectedDemo protectedDemo = new ProtectedDemo();
        protectedDemo.name = "ls";
        System.out.println(protectedDemo.name);

        System.out.println("-------");

        PrivateDemo privateDemo = new PrivateDemo();
//        privateDemo.name = "wu";

        System.out.println("---------");

        protectedDemo2 protectedDemo2 = new protectedDemo2();
//        protectedDemo2.name = "ss";


    }
}
