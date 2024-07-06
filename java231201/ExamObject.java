package java231201;

class TestA {
}

public class ExamObject {

    public static void main(String[] args) {
        Object obj = new Object();
        Object obj2 = new Object();
        Object obj3 = obj;

        System.out.println(obj.toString());
        System.out.println(obj.hashCode());
        System.out.println(obj2.toString());
        System.out.println(obj2.hashCode());
        System.out.println(obj.equals(obj2));
        System.out.println(obj.equals(obj3));

        TestA oba = new TestA();
        TestA oba2 = new TestA();
        TestA oba3 = oba;

        System.out.println(oba.toString());
        System.out.println(oba.hashCode());
        System.out.println(oba2.toString());
        System.out.println(oba2.hashCode());
        System.out.println(oba.equals(oba2));
        System.out.println(oba.equals(oba3));


    }
}
