package thinkingInJava.ch2.p37.prac3_9;

/**
 * @author: vikingar
 * @time: 2023/10/15 22:33
 * @description:
 */
public class Main {
    public static void main(String[] args) {
        ATypeName a = new ATypeName();
        a.printDemo();

        System.out.println("------------------");

        DataOnly dataOnly = new DataOnly();
        dataOnly.printDataOnly();

        System.out.println("--------------------");

        Storage storage = new Storage();
        storage.printStorage("vikingar");

        System.out.println("------------------");

        Incrementable.increment();

        Runnable runnable = Incrementable::increment;
        runnable.run();

        System.out.println("----------------");

        Integer i = 1;
        System.out.println(i);


        GetInputAndPrint getInputAndPrint = new GetInputAndPrint();
        getInputAndPrint.GetThreeParam();

        System.out.println("-------------");

        AllTheColorsOfTheRainbow allTheColorsOfTheRainbow = new AllTheColorsOfTheRainbow();
        allTheColorsOfTheRainbow.changTheHueOfTheColor(2);

    }
}
