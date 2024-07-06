package java231128;

public class Penguin extends Birds implements Waterlife {
    void eat() {
        System.out.println("펭귄 먹는다");
    }

    void cry() {
        System.out.println("펭귄 운다");
    }

    void move() {
        System.out.println("펭귄 움직인다");
    }

    void swim() {
        System.out.println("펭귄 수영한다");
    }

    @Override
    public void waterAction() {
        System.out.println("펭귄 파도타기!");
    }
}
