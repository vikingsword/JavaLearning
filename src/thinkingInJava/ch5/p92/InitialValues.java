package thinkingInJava.ch5.p92;

/**
 * @author: vikingar
 * @time: 2023/10/26 23:37
 * @description:
 */
public class InitialValues {
    int i;
    boolean b;
    char c;
    float f;
    double d;
    byte b2;
    long l;

    InitialValues r;

    void printInitValue() {
        System.out.println("int = " + this.i);
        System.out.println("boolean = " + this.b);
        System.out.println("float = " + this.f);
        System.out.println("char = " + this.c);
        System.out.println("double = " + this.d);
        System.out.println("byte = " + this.b2);
        System.out.println("long = " + this.l);
    }

    public static void main(String[] args) {
        InitialValues initialValues = new InitialValues();
        initialValues.printInitValue();
    }
}
