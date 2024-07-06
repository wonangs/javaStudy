package java231128;

public class Shark extends Fishes implements Waterlife {
    @Override
    void eat() {
        System.out.println("상어 움직인다");
    }

    @Override
    void cry() {
        System.out.println("상어 움직인다");
    }

    @Override
    void move() {
        System.out.println("상어 움직인다");
    }
    
    void bite() {
        System.out.println("상어 깨문다");
    }

    @Override
    public void waterAction() {
        System.out.println("상어의 하이드로펌프!");
    }

}
