package Lesson_1;

public class Task_1_7 {
    public String name;
    public void showName(){
        System.out.println("Привет "+name);
    }

    public static void main(String[] args) {
        Task_1_7 ourTask_1_7=new Task_1_7();
        ourTask_1_7.name="Ivan";
        ourTask_1_7.showName();
    }
}
