package java231123;

import java.util.ArrayList;

public class GterSterMain {
    // shopping basket
    public static void main(String[] args) {

        Item i1 = new Item("마우스", 49000);
        Item i2 = new Item("키보드", 159000);
        Item i3 = new Item("CPU", 250000);
        Item i4 = new Item("그래픽카드", 456000);
        Item i5 = new Item("메인보드", 180000);
        Item i6 = new Item("모니터", 357000);
        Item i7 = new Item("램", 45000);



        ArrayList<Item> basket = new ArrayList<>();
        basket.add(i1);
        basket.add(i2);
        basket.add(i3);
        basket.add(i4);

        int tot = 0;
        for (Item item : basket) {
            System.out.println(item.item + item.price);
            tot += item.price;
        }
        System.out.println(tot);


        int total = 0;
        for (int j = 0; j < basket.size(); j++) {
            System.out.println(basket.get(j).item + basket.get(j).price);
            total += basket.get(j).price;
        }
        System.out.println(total);


        System.out.println(i1.toString());


        i1.setPrice(68000);
        i1.setItem("mouse");
        System.out.println(i1.toString());

    }


}

