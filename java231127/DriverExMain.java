package java231127;

public class DriverExMain {

    public static void main(String[] args) {


        Driver driver = new Driver();
        Bus bus = new Bus();

        driver.drive(bus);
        driver.drive(new Taxi());
    }
}