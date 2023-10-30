package thinkingInJava.ch5.p93;

/**
 * @author: vikingar
 * @time: 2023/10/27 23:42
 * @description:
 */
public class Measurement {
    public static void main(String[] args) {
        Depth depth = new Depth();
        System.out.println("depth = " + depth.toString());
        Depth2 depth2 = new Depth2();
        depth2.print();
        Depth2 depth21 = new Depth2();
        depth21.setI(1);
        int j = depth21.print2();
        System.out.println(j);

    }
}



class Depth2 {

    private int i;

    Integer print2() {
        return i;
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    void print() {
        System.out.println("depth2");
    }

}