package day06.modi.pac1;

class B {   // default 제한 : 클래스에는 public과 default

    public int x1;
    int x2;
    private int x3;


    void test() {
        A a = new A();  // public
        new A(10);  // default
//        new A("zzzz");  // private




        a.f1 = 1;   // public : 어디서든 접근 허용
        a.f2 = 2;   // default : 동일한 패키지 내에서만 허용
   //   a.f3 = 3;   // private : 동일한 클래스 내에서만 허용

        a.m1();// public
        a.m2();// default
   //   a.m3();// private
    }
}
