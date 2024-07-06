package java231127;

public class FlyWithInterface {
    public static void main(String[] args) {
        Bird bird = new Bird();
        Helicopter copter = new Helicopter();
        Rocket rocket = new Rocket();

        Flyable[] arr = {bird, copter, rocket};
        for (Flyable flyable : arr) {
            flyable.fly();
        }
    }
}

interface Flyable {
    void fly();
}

class Bird implements Flyable {
    @Override
    public void fly() {
        System.out.println("[새]가 날아갑니다.");
    }
}

class Helicopter implements Flyable {
    @Override
    public void fly() {
        System.out.println("[헬기]가 날아갑니다.");
    }
}

class Rocket implements Flyable {
    @Override
    public void fly() {
        System.out.println("[로켓]이 날아갑니다.");
    }
}

