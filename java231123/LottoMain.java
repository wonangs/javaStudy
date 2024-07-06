package java231123;

import java.util.ArrayList;
import java.util.Random;

public class LottoMain {

    public static void main(String[] args) {




/*
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();

        for (int i = 1; i <= 45; i++) {
            list1.add(i);
        }
        Collections.shuffle(list1);

        for (int i = 0; i < 6; i++) {
            list2.add(list1.get(i));
        }
        Collections.sort(list2);
        System.out.println(list2);
*/

        ArrayList<Integer> al = new ArrayList<>();
        ArrayList<Integer> al2 = new ArrayList<>();
        Random rd = new Random();

        for (int i = 0; i < 6; i++) {
            int a = rd.nextInt(45)+1;
            al.add(a);

            // 중복 제거
        }


        System.out.println(al);
    }
}