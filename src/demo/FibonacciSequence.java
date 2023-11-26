package demo;

//斐波那契数列
public class FibonacciSequence {
    public static void main(String[] args) {
        int target = 10;
        System.out.println("the " + target + "st number in fibonacci sequence is:" + fibonacciSequenceByCycle(target));
        System.out.println("the " + target + "st number in fibonacci sequence is:" + fibonacciSequenceByRecursion(target));
    }

    /**
     * 显示斐波那契数列的第target位数
     *
     * @param target 所求值在斐波那契数列中的位数
     */
    public static long fibonacciSequenceByCycle(int target) {
        long result;
        long head = 1, end = 1;
        for (int i = 1; i < target; i++) {
            result = head + end;
            head = end;
            end = result;
        }
        return head;
    }

    public static long fibonacciSequenceByRecursion(int target) {
        if (target >= 3) return fibonacciSequenceByRecursion(target - 1) + fibonacciSequenceByRecursion(target - 2);
        return 1;
    }
}
