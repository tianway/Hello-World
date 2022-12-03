package demo;

//斐波那契数列
public class FibonacciSequence {
    public static void main(String[] args) {
        fibonacciSequence(6);
    }

    /**
     * 显示斐波那契数列的第target位数
     * @param target 所求值在斐波那契数列中的位数
     */
    public static void fibonacciSequence(int target) {
        int result = 0;
        if (target == 1 || target == 2) {
            result = 1;
        } else if (target > 2) {
            int head = 1, end = 1;
            for (int i = 3; i <= target; i++) {
                result = head + end;
                head = end;
                end = result;
            }
        }
        System.out.println("the " + target + "st number in fibonacci sequence is:" + result);
    }
}
