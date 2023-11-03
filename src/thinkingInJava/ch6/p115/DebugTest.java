package thinkingInJava.ch6.p115;


import static thinkingInJava.ch6.p115.debugoff.Debug.debug;

/**
 * @author: vikingar
 * @time: 2023/10/31 20:53
 * @description:
 */
public class DebugTest {
    public static void main(String[] args) {
        debug();
        thinkingInJava.ch6.p115.debug.Debug debug = new thinkingInJava.ch6.p115.debug.Debug();
        debug.debug();


    }
}
