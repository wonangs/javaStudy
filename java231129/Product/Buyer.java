package java231129.Product;

public class Buyer {

    int money = 1000;
    int point = 0;

    void buy(Product p) {
        if (money < p.price) {
            System.out.println("잔액이 부족합니다.");
            return; // break 느낌의 함수 탈출 방법
        } else {
            System.out.println(p);
            money -= p.price;
            point += p.bonusPoint;
        }
    }
}