package demo;


import java.util.ArrayList;

//水仙花数类
public class NarcissisticNumber {
    public static void main(String[] args) {
        getNarcissisticNumberLess1000();
        getNarcissisticNumber(10000);
    }

    /**
     * 遍历输出100-1000内的水仙花数
     */
    public static void getNarcissisticNumberLess1000() {
        System.out.println("小于1000的三位水仙花数有：");
        for (int i = 1; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                for (int k = 0; k < 10; k++) {
                    if (i * i * i + j * j * j + k * k * k == i * 100 + j * 10 + k)
                        System.out.println(i * 100 + j * 10 + k);
                }
            }
        }
    }

    /**
     * 输出查找范围内全部水仙花数
     *
     * @param max 查找水仙花数的最大范围
     */
    public static void getNarcissisticNumber(int max) {
        System.out.println("小于" + max + "的水仙花数有：");
        for (int i = 1; i < max; i++) {
            int sum = 0;
            int temp = i;
            ArrayList<Integer> arrayList = new ArrayList<>(); //动态数组
            while (temp > 0) {
                arrayList.add(temp % 10);
                temp /= 10;
            }
            for (int a : arrayList) {
                sum += Math.pow(a, arrayList.size()); //幂指数方法
            }
            if (sum == i)
                System.out.println(i);
        }
    }
}