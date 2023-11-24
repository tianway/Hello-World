package demo;

public interface Study {
    public static final int a = 10;   //接口中定义的静态变量只能是public static final的

    public static void test() {    //接口中定义的静态方法也只能是public的
        System.out.println("我是静态方法");
    }

    void study();
}
