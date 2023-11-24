package demo;

//九九乘法表
public class NineNineTable {
    public static void main(String[] args) {
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < i+1; j++) {
//                利用printf方法格式化输出
                System.out.printf("%1$d x %2$d = %3$d ",j,i,i*j);
                if (j == i){
                    System.out.println();
                }
            }
        }
    }
}
