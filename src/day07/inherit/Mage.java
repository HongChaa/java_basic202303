package day07.inherit;

public class Mage extends Player {

    int mana; // 마력 게이지

    public Mage(String nickName) {
        super(nickName);
        this.mana = 100;
    }

    @Override
    public void showStatus() {
        System.out.println("\n======= Character's Info =========");
        System.out.println("# name: " + this.nickName);
        System.out.println("# level: " + this.level);
        System.out.println("# hp: " + this.hp);
        System.out.println("# mana: " + this.mana);
    }

    // 썬더볼트
    public void thunderBolt(Player ...players) {
        System.out.printf("# %s님 썬더볼트 시전!!!\n", this.nickName);
        System.out.println("========================================");

        int damage = 0;
        for (int i = 0; i < players.length; i++) {
            if(players[i].nickName == this.nickName) continue;
            damage = (int)(Math.random() * 6 + 10);
            players[i].hp = players[i].hp - damage;
            System.out.println(players[i].nickName + "님이 " + damage + "의 피해를 입었습니다. ( 남은 체력: " + players[i].hp + ")");
        }

    }
}