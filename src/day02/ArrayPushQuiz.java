package day02;


import java.util.Arrays;
import java.util.Scanner;

public class ArrayPushQuiz {


    public static String pop() {

        if (foodList.length > 0) {
            // 0. 삭제 대상 데이터 백업
            String delTarget = foodList[foodList.length - 1];
            // 1. 원본배열보다 1개 사이즈 작은 새 배열 생성
            String[] temp = new String[foodList.length - 1];
            // 2. 맨 마지막 데이터만 빼고 모두 새배열에 복사
            for (int i = 0; i < temp.length; i++) {
                temp[i] = foodList[i];
            }
            // 3. 주소값 이전
            foodList = temp;
            temp = null;

            return delTarget;
        }
        System.out.println("삭제 데이터 없음!");
        return "";
    }


    public static void push(String newData) {

        // 1. 원본배열보다 1개 사이즈가 더 큰 새 배열 생성
        String[] temp = new String[foodList.length + 1];

        // 2. 원본배열 데이터 새 배열로 복사
        for (int i = 0; i < foodList.length; i++) {
            temp[i] = foodList[i];
        }

        // 3. 새로운 데이터를 새 배열의 끝인덱스에 추가
        temp[temp.length - 1] = newData;

        // 4. 주소값 이전
        foodList = temp;
        temp = null;
    }

    static String[] foodList = new String[0];


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String inputFood = "";
        int num;

        while (true) {
        System.out.println("#1. 먹고 싶은 음식을 입력!!");
        System.out.println("#2. 음식 삭제");
        System.out.println("#3. 종료");

            num = Integer.parseInt(sc.nextLine());

            switch (num) {
                case 1:
                    System.out.print("음식 입력 : ");
                    inputFood = sc.nextLine();
                    push(inputFood);
                    break;
                case 2:
                    System.out.println("음식 삭제");
                    pop();
                    break;
            }
            if (num == 3) {
                break;
            }

        }
        System.out.println("먹고 싶은 음식리스트: " + Arrays.toString(foodList));
//        String[] foodList = {};

        /*
            # 음식명을 입력받아서 배열에 순서대로 저장하는 코드

            1. 음식명을 입력받는다.
            2. 음식명에 '그만'이 입력되었는가?
            2-1. 그만이 입력되었으면 종료한다.
            2-2. 그만이 입력되지 않았으면 배열에 넣는다.
            3. 배열의 크기를 1 증가시킨다.
            4. 기존의 음식데이터를 증가된 새 배열에 복사한다.
            5. 새로운 음식명을 마지막 위치에 추가한다.
         */
    }
}
