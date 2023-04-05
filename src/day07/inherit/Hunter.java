package day07.inherit;

public class Hunter extends Player {

    int concentration; // 집중력

    public Hunter(String nickName) {
        super(nickName);
        this.concentration = 100;
    }

    public void summonBeast() {

    }
    @Override
    public void showStatus() {
        System.out.println("\n======= Character's Info =========");
        System.out.println("# name: " + this.nickName);
        System.out.println("# level: " + this.level);
        System.out.println("# hp: " + this.hp);
        System.out.println("# concentration: " + this.concentration);
    }
}