package java231124;

public class MoreKeywords {

    public static void main(String[] args) {

        Weapon w1 = new Weapon("장검", 1200, 10);
        Weapon w2 = new Weapon();
        w1.printInfo();
        w2.printInfo();
    }
}

abstract class Item {

    private String name;
    private int gold;

    Item() {
        this("이름 없음", -1);
    }

    Item(String name, int gold) {
        this.name = name;
        this.gold = gold;
    }

    public String getName() {
        return name;
    }

    public int getGold() {
        return gold;
    }
}


class Weapon extends Item {
    int power;
    Weapon() {
        this("이름 없음", -1, -1);
    }

    Weapon(String name, int gold, int power) {
        super(name, gold);
        this.power = power;
    }
    void weapon(String name, int gold, int power) {

    }

    void printInfo() {
        System.out.printf("[%s] 가격 : [%d골드], 공격력 : [%d]", getName(), getGold(), power);
        System.out.println();
    }
}