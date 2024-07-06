package java231128;

class HolyKnight extends Knight implements Healer {
    int dp = 100;

    HolyKnight(String name) {
        super(name);
    }

    public void heal() {
        System.out.printf("[%s]의 힐!\n", name);

    }

    public void recovery() {
        System.out.printf("[%s]의 회복!\n", name);

    }
}
