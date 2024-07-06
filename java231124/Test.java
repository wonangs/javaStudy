package java231124;

public class Test {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Zxc z = new Zxc();
        Zxc z1 = new Zxc(1);
        Zxc z2 = new Zxc(2, 3);
        Zxc z3 = new Zxc(4, 5, 6);

        System.out.println(z1.c);

    }

}

class Zxc extends Asd {
    Zxc(int a, int b, int c) {
        super(a, b, c);
    }

    Zxc(int a, int b) {
        this(a, b, 1);
    }

    Zxc(int a) {
        this(a, 5, 4);
    }

    Zxc() {
        super();
    }
}

class Asd {
    int a;
    int b;
    int c;

    Asd() {
    }

    Asd(int a) {
        this.a = a;
    }

    Asd(int a, int b) {
        this.a = a;
        this.b = b;
    }

    Asd(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
}