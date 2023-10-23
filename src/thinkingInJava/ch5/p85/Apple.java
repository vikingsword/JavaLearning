package thinkingInJava.ch5.p85;

/**
 * @author: vikingar
 * @time: 2023/10/23 23:46
 * @description:
 */
public class Apple {
    Apple getPeeled(){
        return Peeler.peel(this);
    }
}
