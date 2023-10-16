package thinkingInJava.ch3.p45;

import java.util.Objects;

/**
 * @author: vikingar
 * @time: 2023/10/16 22:40
 * @description:
 */
public class Value {
    private int i;

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Value value = (Value) o;
        return i == value.i;
    }

    @Override
    public int hashCode() {
        return Objects.hash(i);
    }
}
