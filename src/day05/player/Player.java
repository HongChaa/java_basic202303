package day05.player;

public class Player {

    String nickName; // 캐릭터 닉네임
    int level; // 레벨
    int hp; //  체력

    public Player() {
        this("이름없음");
        System.out.println("1번 생성자 호출");
//        this.nickName= "이름없음";
//        this.level = 1;
//        this.hp = 50;
    }

    // 생성자
    public Player(String nickName) {
        this(nickName, 1, 50);
//        System.out.println("2번 생성자 호출!!");
    }
    public Player(String nickName, int level, int hp) {
        this.nickName = nickName;
        this.level = level;
        this.hp = hp;
    }
    void levelUp(Player this) {

    }

    // 기능 - 메서드
    void attack(Player target) {

        if(this == target) return;

        System.out.println("parking의 주소 : " + target);
        System.out.println("this의 주소 : " + this);
        // 맞은 플레이어의 체력을 10 ~ 15 랜덤으로 감소
        int damage = (int) (Math.random() * 6 + 10);
        target.hp -= damage;
        // 전투로그를 출력
        // "공격자가 상대를 공격해서 xxx의 피해를 입힘"
        System.out.printf("%s님이 %s님을 공격해서 %d의 피해를 입힘!\n", this.nickName, target.nickName, damage);
    }






}
