package java231121;

public class Car {

    String manufacture = "Bentley";
    String model;
    String color;
    int maxspead;

    Car() {
    }

    Car(String model) {
        this.model = model;   // 생성자 오버로딩
    }

    Car(String model, String color) {
        this.model = model;
        this.color = color;
    }

    Car(String model, String color, int maxspead) {
        this.model = model;
        this.color = color;
        this.maxspead = maxspead;
    }
}

class Truck extends Car {
    double capacity;

    Truck(String model, String color, double capacity) {
        super(model, color, 0);
//        this.model = model;
//        this.color = color; // 초기화가 안된 상태
        this.capacity = capacity;
    }
}
