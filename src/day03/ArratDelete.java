package day03;

import java.util.Arrays;

public class ArratDelete {

    public static void main(String[] args) {

        int[] arr = {1, 3, 5, 7, 9, 11};
        System.out.println("삭제 전: " + Arrays.toString(arr));

        int delIndex = 3;
        for (int i = delIndex; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }



        System.out.println("삭제 후: " + Arrays.toString(arr));
    }
}
