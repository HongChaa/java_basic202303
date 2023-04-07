package music_;

import java.util.Arrays;

public class Register {

    private static String[][] musicList;

    static {
        musicList = new String[0][0];
    }

    public /*String[][]*/ void newRegister(String name, String title) {

        int findIndex = searchNameIndex(name);
        if (findIndex == -1) { // 가수를 새로 등록 해야하는 경우
           // System.out.println("musicList.length = " + musicList.length);
            findIndex = musicList.length + 1;
            String[][] temp = new String[findIndex][1]; // 배열크기를 키우고 복사하려면 행 길이, 열 길이 둘다 늘려야하고 행마다 열길이가 다 다름 해결하려면 너무 복잡해짐

            temp[findIndex - 1][0] = name;
            musicList = temp;
            temp = null;
            addTitle(findIndex, title);

        } else { // 이미 해당 가수가 등록돼 있는 경우
            addTitle(findIndex + 1, title);
        }

        for (int i = 0; i < musicList.length; i++) {
            for (int j = 0; j < musicList[i].length; j++) {
                System.out.print(musicList[i][j] + " ");
            }
        }

//        return musicList;

    }

    // 1. 노래 등록하기
    public void addTitle(int findIndex, String title) {

        // 해당 인덱스 (길이 + 1) 만큼 배열길이 늘리기
        String[][] temp = new String[musicList.length][musicList[findIndex - 1].length + 1];

        for (int i = 0; i < temp[findIndex - 1].length - 1; i++) {
            temp[findIndex - 1][i] = musicList[findIndex - 1][i];
        }
        temp[findIndex - 1][temp[findIndex - 1].length - 1] = title;

        musicList = temp;
        temp = null;

//        System.out.println(Arrays.toString(musicList[findIndex - 1]));
    }

    // 가수 인덱스 검사하기
    public int searchNameIndex(String name) {
        int findIndex = -1;

        for (int i = 0; i < musicList.length; i++) {
            if (musicList[i][0].equals(name)) {
                findIndex = i;
                break;
            }
        }
        return findIndex;
    }

    // 노래 정보 검색하기
    public void searchSongInfo() {

    }

}
