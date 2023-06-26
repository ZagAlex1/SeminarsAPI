package SeminarSix;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;

public class HomeworkHashMap1 {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.merge("Ivan", "123", (o, n) -> o == null ? n : o + " " + n);
        map.merge("Ivan", "124", (o, n) -> o == null ? n : o + " " + n);
        map.merge("Ivan", "125", (o, n) -> o == null ? n : o + " " + n);
        map.merge("Petr", "123", (o, n) -> o == null ? n : o + " " + n);

        System.out.println(map);

        ArrayList<String> names = new ArrayList<>();
        for (String s : map.keySet()) {
            names.add(s);
        }

        Collections.sort(names, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return map.get(o1).split(" ").length - map.get(o2).split(" ").length;
            }
        });

        System.out.println(names);
    }
}
