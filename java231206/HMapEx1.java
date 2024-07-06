package java231206;

import java.util.*;

public class HMapEx1 {
    public static void main(String[] args) {
        HashMap map = new HashMap();
        map.put("myId", "1234");
        map.put("asdf", "1111");
        map.put("asdf", "1234");

        Scanner s = new Scanner((System.in));

        while (true) {
            System.out.println("input id and password");
            System.out.print("id : ");
            String id = s.nextLine().trim();

            System.out.print("password : ");
            String password = s.nextLine().trim();
            System.out.println();

            if (!map.containsKey(id)) {
                System.out.println("not exist id. input again");
                continue;
            }
            if (!(map.get(id)).equals(password)) {
                System.out.println("password is not matched. input again");
            } else {
                System.out.println("id and password is matched");
                break;
            }


        }
    }
}
