package java231128;

public class GameSimulation {

    public static void main(String[] args) {
        Knight atomic = new Knight("아토믹");
        Knight uther = new HolyKnight("우서");
        Knight genji = new MagicKnight("겐지");

        atomic.slash();
        uther.slash();
        genji.slash();
        Healer healer = (uther instanceof Healer) ? (HolyKnight) uther : null;
//        Healer healer = (HolyKnight) uther ;


        healer.heal();
        healer.recovery();
        Magician magician = (genji instanceof Magician) ? (MagicKnight) genji : null;
        magician.magicShield();
        magician.teleport();

    }
}
