package demo;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        /*object类提供的clone方法是浅拷贝*/
//        Student student = new Student("小明", 18, "男");
//        Student clone = (Student) student.clone();
//        System.out.println(student);
//        System.out.println(clone);
//        System.out.println(student == clone);
//        System.out.println(student.name == clone.name);
        /*枚举类练习*/
//        student.setStatus(Status.RUNNING);
//        System.out.println(student.getStatus());
//        System.out.println(student.getStatus().getName());
        /*数组工具类练习*/
//        int[] arr = new int[]{1, 2, 3, 4, 5};
//        int[] target = Arrays.copyOfRange(arr, 3, 5);   //也可以只拷贝某个范围内的内容
//        System.out.println(Arrays.toString(target));
//        System.out.println(arr == target);
        /*冒泡排序练习*/
//        int[] arr = new int[]{3, 5, 7, 2, 9, 0, 6, 1, 8, 4};
//        BubbleSort.sort(arr);
//        System.out.println(Arrays.toString(arr));
        /*二分查找练习*/
//        int[] arr = {1, 3, 4, 6, 7, 8, 10, 11, 13, 15};
//        int target = 0;
//        System.out.println(Search.binarySearch(arr, target));
//        System.out.println(Search.binarySearchByRecursion(arr, 0, arr.length - 1, target));
        /*青蛙跳阶练习*/
//        int steps = 0;
//        System.out.println(Frog.jumpPlans(steps));
        /*回文字符串判断练习*/
//        System.out.println(PalindromeString.isPalindromeString("ABCBA"));
//        System.out.println(PalindromeString.isPalindromeString("ABCA"));
        /*汉诺塔练习*/
//        Hanoi.hanoiByRecursion('A','B','C',3);
        /*泛型练习*/
//        Integer[] arr = {1, 4, 5, 2, 6, 3, 0, 7, 9, 8};
//        Arrays.sort(arr, (o1, o2) -> o2 - o1);
//        System.out.println(Arrays.toString(arr));

//        String[] arr = {"AAA", "BBB", "CCC"};
//        String[] newArr = Arrays.copyOf(arr, 3);   //这里传入的类型是什么，返回的类型就是什么，也是用到了泛型
//        System.out.println(Arrays.toString(newArr));
        /*函数式接口练习*/
//        Supplier<Student> studentSupplier = Student::new;
//        Student student = studentSupplier.get();
//        student.doHomework();
//
//        Consumer<Student> studentConsumer = student1 -> System.out.println(student1 + " is so delicious!");
//        studentConsumer.andThen(student1 -> System.out.println("yes " + student1 + "is so delicious")).accept(student);
//
//        Function<Integer, String> INTEGER_STRING_FUNCTION = Object::toString;
//        Boolean str = INTEGER_STRING_FUNCTION.compose(String::length).andThen(String::isEmpty).apply("tianwayNB");
//        System.out.println(str);
//        Predicate<Student> studentPredicate = student -> student.getScore() >= 60;
//        Student student = new Student();
//        if (studentPredicate.and(student1 -> student1.getScore() >= 90).test(student)) {
//            System.out.println("及格了");
//        } else {
//            System.out.println("不及格");
//        }
//        Predicate<String> predicate = Predicate.isEqual("hello world");
//        System.out.println(predicate.test("hello world!"));

    }
}
