package java231123;

import java.util.ArrayList;

public class CartMain {
    public static void main(String[] args) {
        Cart c1 = new Cart("지갑", 50000);
        Cart c3 = new Cart("가방", 70000);
        Cart c2 = new Cart("한우", 100000);

        ArrayList<Cart> carts = new ArrayList<Cart>();
        carts.add(c1);
        carts.add(c2);
        carts.add(c3);

        int total = 0;

        System.out.println("<결재 목록>");
        for (Cart cart : carts) {
            System.out.println(cart.item + "-" + cart.price);
            total += cart.price;
        }
        System.out.println("\n총 " + carts.size() + "개 해서 " + total + "원 입니다.");
    }
}