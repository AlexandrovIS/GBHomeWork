package Lesson_2;

public class Task_2_2 {
    public static void main(String[] args) {
        int[] arr = new int[8];
        int counter=0;
        for(int i = 0; i <arr.length; i++) {
            arr[i]=counter;
            System.out.print(arr[i]+" ");
            counter+=3;
        }
    }
}
