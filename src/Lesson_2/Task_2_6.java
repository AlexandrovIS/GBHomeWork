package Lesson_2;

public class Task_2_6 {
    int[] arr = {2,1,2,2,1,1,1,10,};

    public static void main(String[] args) {
        Task_2_6 array = new Task_2_6();
        array.myArray();
    }
    public void myArray() {
        for (int n = 0; n < arr.length - 1; n++) {
            int counter = 0;
            int summ = 0;
            for (int i = 0; i < n+1; i++) counter += arr[i];
            for (int j = arr.length - 1; j > n; j--) summ +=arr[j];
            if (counter == summ) System.out.println(true);
        }
    }
}
