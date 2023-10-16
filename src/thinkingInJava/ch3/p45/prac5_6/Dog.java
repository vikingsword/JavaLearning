package thinkingInJava.ch3.p45.prac5_6;

import java.util.Objects;

/**
 * @author: vikingar
 * @time: 2023/10/16 22:51
 * @description:
 */
public class Dog {
    private String name;
    private String says;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSays() {
        return says;
    }

    public void setSays(String says) {
        this.says = says;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dog dog = (Dog) o;
        return Objects.equals(name, dog.name) && Objects.equals(says, dog.says);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, says);
    }
}
