package java231127;

public class ChildExampleMain {

    public static void main(String[] args) {

        Child child = new Child();

        Parent parent = child;

        parent.method();
        parent.method2();

    }
}
