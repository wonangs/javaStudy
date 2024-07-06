package java231204;

import java.util.*;

public class ArrayListEx1 {

    public static void main(String[] args) {

        ArrayList list = new ArrayList(10);
        list.add(new Integer(5));
        list.add(new Integer(4));
        list.add(new Integer(2));
        list.add(new Integer(0));
        list.add(new Integer(1));
        list.add(new Integer(3));

        ArrayList list2 = new ArrayList(list.subList(1, 4));
        print(list, list2);

        Collections.sort(list);
        Collections.sort(list2);
        print(list, list2);

        System.out.println("list.containsALL(list2) : " + list.containsAll(list2));

        list2.add("B");
        list2.add("C");

        list2.add(3, "A");
        print(list, list2);

        list2.set(3, "AA");
        print(list, list2);

        System.out.println("list1.retainAll(list2) : " + list.retainAll(list2));
        print(list, list2);

        for (int i = list2.size() - 1; i >= 0; i--) {
            if (list.contains(list2.get(i))) {
                list2.remove(i);
            }
            print(list, list2);
        }
    }

    static void print(ArrayList list, ArrayList list2) {
        System.out.println("list : " + list);
        System.out.println("list : " + list2);
        System.out.println();
    }
}
