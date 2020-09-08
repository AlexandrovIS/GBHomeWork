package Lesson_6;

public class Animal {
    private String name;
    private int age;
    private int run;
    private double jump;
    private int swim;

    public int getRun() {
        return run;
    }

    public void setRun(int run) {
        this.run = run;
    }

    public double getJump() {
        return jump;
    }

    public void setJump(double jump) {
        this.jump = jump;
    }

    public int getSwim() {
        return swim;
    }

    public void setSwim(int swim) {
        this.swim = swim;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Animal(String name, int age, int run, double jump, int swim){
        this.name=name;
        this.age=age;
        this.run = run;
        this.jump = jump;
        this.swim = swim;
    }
    public void printInfo(){
        System.out.println(toString());
    }
    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", run=" + run +
                ", jump=" + jump +
                ", swim=" + swim +
                '}';
    }
}
