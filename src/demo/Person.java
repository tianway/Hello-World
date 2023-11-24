package demo;

import java.util.Objects;

public class Person {

    protected String name;   //直接在类中定义变量，表示类具有的属性
    protected int age;
    protected String sex;
    protected String Profession;

    private static Person instance;

    protected Person() {
    }

    protected Person(String name, int age, String sex, String Profession) {   //跟普通方法是一样的
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.Profession = Profession;
    }

    public static Person getInstance() {
        if (instance == null) {
            instance = new Person();
        }
        return instance;
    }

    public static Person getInstance(String name, int age, String sex, String Profession) {
        if (instance == null) {
            instance = new Person(name, age, sex, Profession);
        }
        return instance;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getSex() {
        return sex;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setName(String name) {
        this.name = name;
    }

    void hello() {
        //完成自我介绍需要执行的所有代码就在这个花括号中编写
        //这里编写代码跟我们之前在main中是一样的（实际上main就是一个函数）
        //自我介绍需要用到当前对象的名字和年龄，我们直接使用成员变量即可，变量的值就是当前对象的存放值
        System.out.println("我叫 " + name + " 今年 " + age + " 岁了！");
    }

    int sum(int a, int b) {
        return a + b;   //return后面紧跟需要返回的结果，这样就可以将计算结果丢出去了
    }

    void swap(int a, int b) {   //这个函数的目的很明显，就是为了交换a和b的值
        int tmp = a;
        a = b;
        b = a;
    }

    void modify(Person person) {
        person.name = "ltyNB";   //修改对象的名称
    }

    double sum(double a, double b) {    //为了支持小数加法，我们可以进行一次重载
        return a + b;
    }

    int recursion(int n) {
        if (n == 0) return 0;
        return recursion(n - 1) + n;    //返回的结果是下一层返回的结果+当前这一层的n
    }

    public String getProfession() {
        return Profession;
    }

    public void setProfession(String profession) {
        Profession = profession;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && Objects.equals(name, person.name) && Objects.equals(sex, person.sex);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                ", Profession='" + Profession + '\'' +
                '}';
    }

    public void exam() {
        System.out.println("我是考试方法");
    }
}
