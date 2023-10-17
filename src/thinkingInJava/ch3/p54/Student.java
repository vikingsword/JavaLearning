package thinkingInJava.ch3.p54;

/**
 * @author: vikingar
 * @time: 2023/10/17 20:37
 * @description:
 */
public class Student {

    private Integer id;

    public Student(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    private String name;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
