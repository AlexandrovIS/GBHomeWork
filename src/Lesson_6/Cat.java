package Lesson_6;

public class Cat extends Animal{
    private int MaxRun=200;
    private double MaxJump=2;
    private boolean MaxSwim=false;

    public Cat(String name, int age,int run,double jump,int swim) {
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

    private void printCatInfo(){
        System.out.println("Cat name "+getName()+" age "+getAge()+" run "+getRun()+ " jump "+getJump()+" swim "+getSwim());
    }
    public void printCatResult(){
        printCatInfo();
        System.out.println("Cat "+ getName()+" have a next result" +" run: " + maxRun()+" jump: "+maxJump()+" swim: "+MaxSwim);
    }
}
