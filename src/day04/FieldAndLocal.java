package day04;

public class FieldAndLocal {

    int a; // 필드 //(넓은 저장공간) 힙영역에 있기 때문에 기본적으로 0을 넣어놓은 상태이므로 에러x
    double[] b;


    void mm(int b) { // b: 매개변수 호출될때 무조건 들어오게되어있으므로 에러 x
        int c; // c: 지역변수 // (좁은 저장공간) 스택영역에 있기에 초기화 필요.

        if(a > 10) {
            c = 99;
        } else if (a < 5) {
            c = -100;
        } else {
            c = 55;
        }

        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);

    }
}
