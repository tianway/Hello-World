package demo;

public class Hanoi {
    public static void hanoiByRecursion(char a, char b, char c, int n) {
        if (n == 1) {
            System.out.println(a + "-->" + c);
        } else {
            hanoiByRecursion(a, c, b, n - 1);
            System.out.println(a + "-->" + c);
            hanoiByRecursion(b, a, c, n - 1);
        }
    }
}
