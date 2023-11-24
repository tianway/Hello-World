package demo;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Student student = new Student("小明", 18, "男");
        Student clone = (Student) student.clone();
        System.out.println(student);
        System.out.println(clone);
        System.out.println(student == clone);
        System.out.println(student.name == clone.name);
        student.setStatus(Status.RUNNING);
        System.out.println(student.getStatus());
        System.out.println(student.getStatus().getName());
    }
}
