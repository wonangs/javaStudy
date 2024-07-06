package java231121;

public class CarMain {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Car c1 = new Car();
        Car c2 = new Car("B1");
        Car c3 = new Car("B2", "Red");
        Car c4 = new Car("B3", "Silver", 300);
        Truck t1 =  new Truck("r1", "Blue", 5000);
        System.out.println(c1.manufacture);
        System.out.println(c2.manufacture + " " + c2.model);
        System.out.println(c3.manufacture + " " + c3.model + " " + c3.color);
        System.out.println(c4.manufacture + " " + c4.model + " " + c4.color + " " + c4.maxspead);
        System.out.println(t1.model + " " + t1.color + " " + t1.capacity);
    }
}