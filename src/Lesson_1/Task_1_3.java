package Lesson_1;

public class Task_1_3 {
    public static void main(String[] args) {
        System.out.println(math(10.5f,20,30,40));
    }

    public static float math(float a,float b,float c,float d) {
        float e;  //надо дописать сравнение переменной d с нолем, чтобы не делить на ноль!
        e=a*(b+(c/d));
        return e;
    }
}
