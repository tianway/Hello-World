package demo;

public class Frog {
    /*青蛙每次跳1或2阶，求青蛙跳台阶的所有方案数*/
    public static int jumpPlans(int steps){
        if(steps > 3) return jumpPlans(steps - 2) + jumpPlans(steps - 1);
        if(steps < 1) throw new RuntimeException("入参不符合要求，请保证其为正整数！");
        return steps;
    }
}