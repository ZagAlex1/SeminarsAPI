package SeminarFive;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Sort {
    public static void main(String[] args) {

        ArrayList<Integer> age = new ArrayList<>();
        ArrayList<Integer> id = new ArrayList<>();

        age.add(38);
        age.add(27);
        age.add(45);
        age.add(41);
        age.add(31);

        id.add(0);
        id.add(1);
        id.add(2);
        id.add(3);
        id.add(4);

        Collections.sort(id, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {

                return age.get(o1) - age.get(o2);
            }
        });

        System.out.println(id);
        id.forEach(n -> System.out.print(age.get(n) + " "));
    }
}
