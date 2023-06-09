package day01;

public class DataType {

    public static void main(String[] args) {

        
        // 10진수 1000 : 0011 1110 1000
        // 8bit = 1byte
        // 1024byte = 1kb
        long money = 2147483647L;
        
//        100; // 메모리에 저장
//        int a; // 4바이트 공간 할당 이름을 a 부여
//        a = 100; // 미리 저장된 100을 a에 복사
        
        // 실수리터럴은 기본 8바이트할당
        // float 4바이트 : 다운캐스팅
        float f1 = 1.2345678F;
        System.out.println("f1 = " + f1);

        double d1 = 1.23232323243434455;
        System.out.println("d1 = " + d1);

        // 논리타입
        boolean b1 = true;
        boolean b2 = false;

        //  문자 타입 : 한 글자
        char c1 = 'A';  // 65
        System.out.println((char)(c1 + 1));

        char c2 = 44032;
        System.out.println("c2 = " + c2);

        // 기본타입이 아니라 객체다
        String s = "hello";
    }
}
