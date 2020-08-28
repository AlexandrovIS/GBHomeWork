package Lesson_1;

public class Task_1_2 {
    public String name;
    public void showName(){
        System.out.println(name);
    }

    public static void main(String[] args) {
        Task_1_2 ourTask=new Task_1_2();
        ourTask.name="Ivan";
        ourTask.showName();
    }
}
