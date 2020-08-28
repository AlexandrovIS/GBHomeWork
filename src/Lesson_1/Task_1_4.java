package Lesson_1;

public class Task_1_4 {
    public static void main(String[] args) {
        System.out.println(math(10.5f,9.5f));
    }
    public static boolean math(float a, float b) {
        if ((a + b) >=10 & (a + b) <= 20) {
            return true;
        } else return false;
    }
}
