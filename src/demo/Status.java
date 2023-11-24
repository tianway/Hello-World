package demo;

public enum Status {
    RUNNING("跑步"), STUDYING("学习"), SLEEPING("睡觉");
    private String name;

    Status(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
