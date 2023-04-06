package day09.music_;

import day07.util.Utility.*;

import static day07.util.Utility.*;

public class View {

    Register rg;

    public View() {
        this.rg = new Register();
    }

    public void showMenu() {

        while (true) {
            System.out.println("**** 음악관리 프로그램 ****");
            System.out.println("# 현재 등록된 가수: n명");
            int num = Integer.parseInt(input("# 1. 노래 등록하기 \n# 2. 노래 정보 검색\n# 3. 프로그램 종료\n" +
                    "====================================\n>>"));
            switch (num) {
                case 1:
                    System.out.println("# 노래 등록을 시작합니다.");
                    String name = input("- 가수명: ");
                    String title = input("- 곡명: ");
                    /*String[][] musicList =*/ rg.newRegister(name, title);
                    break;
                case 2:
                    break;
                case 3: System.exit(0);

                default:
                    System.out.println("올바른 번호를 입력하세요.");
            }

        }

    }


}
