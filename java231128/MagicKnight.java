package java231128;

class MagicKnight extends Knight implements Magician {

    int mp = 100;
    MagicKnight(String name) {
        super(name);
    }
    public void magicShield() {
        System.out.printf("[%s]의 매직실드!\n", name);

    }

    public void teleport() {
        System.out.printf("[%s]의 텔레포트!\n", name);

    }
}
