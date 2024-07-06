package java231206;

import java.util.*;

public class HMapEx2 {

    public static void main(String[] args) {

        HashMap map = new HashMap();
        map.put("김자바", new Integer(100));
        map.put("이자바", new Integer(100));
        map.put("박자바", new Integer(80));
        map.put("최자바", new Integer(90));

        Set set = map.entrySet();
        Iterator it = set.iterator();

        while (it.hasNext()) {
            Map.Entry e = (Map.Entry) it.next();
            System.out.println("name : "+ e.getKey() + ", 점수 : " + e.getValue());
        }

        set = map.keySet();
        System.out.println("participant list : " + set);

        Collection values = map.values();
        it = values.iterator();

        int total = 0;

        while (it.hasNext()) {
            Integer i = (Integer) it.next();
            total += i.intValue();
        }

        System.out.println("total : " + total);
        System.out.println("avg : " + (float) total / set.size());
        System.out.println("highest score : " + Collections.max(values));
        System.out.println("lowest score : " + Collections.min(values));

    }
}
