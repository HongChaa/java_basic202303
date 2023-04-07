package test;

import java.util.Arrays;

public class Test01 {

    public static void main(String[] args) {

        int[][] arr2 = new int[][] {
                {10, 20, 30},
                {10, 20, 30},
                {10, 20, 30}
        };
        int[][] arr3 = new int[][] {
                {10, 20, 30},
                {10},
                {10, 20, 30, 40, 50}
        };

        String[][] arr = new String[0][0];
        int a = 1;
        String[][] temp = new String[a][arr.length + 1];
        temp[0][0] = "안녕";
        System.out.println(temp[0].length);
        System.out.println("temp 길이 : "+ temp.length + "  temp[][] 길이 : "+ temp[0].length);
        System.out.println("arr3 길이 : "+ arr3.length + "  arr[][] 길이 : "+ arr3[1].length);
        System.out.println(Arrays.toString(temp[0]));





    }

}
