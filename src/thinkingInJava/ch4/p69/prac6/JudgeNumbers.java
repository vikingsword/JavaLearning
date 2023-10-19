package thinkingInJava.ch4.p69.prac6;

/**
 * @author: vikingar
 * @time: 2023/10/20 0:01
 * @description:
 */
public class JudgeNumbers {

    /**
     * 判断某个数是否在 begin end 中间
     *
     * @param begin  开始点
     * @param end    结束点
     * @param target 判断的目标值
     * @return int
     */
    static int getRes(int target, int begin, int end) {
        if (target > begin && target < end) {
            return 1;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        System.out.println(getRes(2, 1, 3));
        System.out.println(getRes(1, 2, 3));
    }


}
