package Lesson_2;

public class Task_2_3 {
    public static void main(String[] args) {
        int[] arr={1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for(int i=0;i<arr.length;i++){
            //просто умножаем на 2 число из массива, если оно меньше 6
            if(arr[i]<6) arr[i]=arr[i]*2;
            System.out.print(arr[i]+" ");
        }
        System.out.println("");

        for (int j=0;j<arr.length;j++) {
            //Умножаем на 2 число из массива до тех пор, пока оно не станет удовлетворать условию
            while (arr[j]<6){
                arr[j]=arr[j]*2;
            }
            System.out.print(arr[j]+" ");
        }
    }
}
