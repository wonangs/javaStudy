package java231128;

public class Whale extends Mammals implements Waterlife {
    @Override
    void eat() {
        System.out.println("고래 먹는다");
    }

    @Override
    void cry() {
        System.out.println("고래 멍멍");
    }

    @Override
    void move() {
        System.out.println("고래 움직인다");
    }
    
    void swim() {
        System.out.println("고래 수영한다");
    }
    
    @Override
    public void waterAction() {
        System.out.println("고래 물대포!");
    }
}
