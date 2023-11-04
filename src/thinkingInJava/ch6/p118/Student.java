package thinkingInJava.ch6.p118;

/**
 * @author: vikingar
 * @time: 2023/11/4 20:21
 * @description:
 */
public class Student {
    private Student(){}

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    static Student createAStudent() {
        return new Student();
    }
}
