package demo;

public class Student extends Person implements Study, Cloneable {

    private Status status;

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }


    Student() {
    }

    Student(String name, int age, String sex) {
        super(name, age, sex, "学生");
    }

    public void doHomework() {
        System.out.println("做作业");
    }

    @Override
    public void exam() {
        System.out.println("考试轻松拿A");
        ;
    }

    @Override
    public void study() {
        System.out.println("每天认真学习");
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }


}
