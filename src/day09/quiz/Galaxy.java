package day09.quiz;

public class Galaxy extends SmartPhone implements Pencil{

    public Galaxy(String model) {
        super(model);
    }

    @Override
    public String information() {
        setModel("갤럭시");
        return getModel()+"는 삼성에서 만들어졌고 제원은 다음과 같다\n"
                +makeCall()+"\n"
                +takeCall()+"\n"
                +takePicture()+"\n"
                +charge()+"\n"
                +touchDisplay()+"\n블루투스 펜 탑재 여부: "
                +bluetoothPen()+"\n";
    }

    @Override
    public String charge() {
        return "고속충전, 고속 무선충전";
    }

    @Override
    public String takePicture() {
        return "1300만 듀얼카메라";
    }

    @Override
    public String makeCall() {
        return "번호를 누르고 통화버튼을 누름";
    }

    @Override
    public String takeCall() {
        return "전화받기 버튼을 누름";
    }

    @Override
    public boolean bluetoothPen() {
        return true;
    }

    @Override
    public String touchDisplay() {
        return "정전식, 와콤펜 지원";
    }
}
