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
//        int target = 6;
//        System.out.println(Search.binarySearch(arr, target));
        int steps = 0;
        System.out.println(Frog.jumpPlans(steps));
    }
}
