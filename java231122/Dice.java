package java231122;

import java.util.Random;

public class Dice {
    private int sides;
    private Random rand = new Random();

    public Dice() {

    }

    public Dice(int sides) {
        this.sides = sides;
    }

    int roll(int Num) {

        int[] Array = new int[Num];
        for (int i = 0; i < Num; i++) {
            Array[i] = rand.nextInt(sides) + 1;
        }
//        System.out.println(String.toString(Array));
        return Num;
    }
}
