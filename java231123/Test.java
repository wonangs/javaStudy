package java231123;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Kim");
        names.add("Lee");
        names.add("Park");
        names.add("Choi");
        names.set(0, "han");
        String removed = names.remove(1);
        for (String name : names) {
            System.out.printf("%s ", name);
        }
    }
}
