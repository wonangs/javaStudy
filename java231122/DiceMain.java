package java231122;

public class DiceMain {

    public static void main(String[] args) {

        Dice d1 = new Dice(12);
        Dice d2 = new Dice(6);

        int a = d1.roll(5);
        int b = d2.roll(5);

        System.out.println(d1.roll(5));
        System.out.println(d2.roll(5));

    }
}
