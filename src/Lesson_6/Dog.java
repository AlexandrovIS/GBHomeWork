package Lesson_6;

public class Dog extends Animal{
    private int MaxRun=500;
    private double MaxJump=0.5;
    private int MaxSwim=10;

    public Dog(String name, int age,int run,double jump,int swim) {
        super(name, age, run, jump, swim);
    }
    public boolean maxRun(){
        if(getRun()<=MaxRun) return true;

        return false;
    }
    public boolean maxJump(){
        if(getJump()<=MaxJump)return true;
        return false;
    }
    public boolean maxSwim(){
        if(getSwim()<=MaxSwim)return true;
        return false;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "Name="+getName()+
                ", age="+getAge()+
                ", run="+getRun()+
                ", jump="+getJump()+
                ", swim="+getSwim()+
                ", MaxRun=" + maxRun() +
                ", MaxJump=" + maxJump() +
                ", MaxSwim=" + maxSwim() +
                '}';
    }

}
