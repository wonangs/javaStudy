package java231120;

import java.util.Scanner;

public class TvUse {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // TV 생성하기
        MakeTV[] tv = new MakeTV[3];
        tv[0] = new MakeTV("Yellow", false, 12);
        tv[1] = new MakeTV("Green", false, 23);
        tv[2] = new MakeTV("Blue", false, 14);


        tv[0].channelUp();
        tv[1].channelDown();
        tv[2].channelUp();
        tv[2].channelUp();

        for (int i = 0; i < tv.length; i++) {
            System.out.println(tv[i].channel);
        }
    }
}