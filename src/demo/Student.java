package demo;

public class Student extends Person implements Study<Void>, Cloneable {

    private Status status;
    private int score = 80;

    Student(String name, int age, String sex) {
        super(name, age, sex, "学生");
    }

    public Student() {

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
    public Void study() {
        System.out.println("每天认真学习");
        return null;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }


    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
