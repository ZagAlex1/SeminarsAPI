package SeminarFive;

import java.util.HashMap;
import java.util.Random;

public class TaskOne {
    public static void main(String[] args) {

        HashMap<Integer, Integer> map1 = map(10);
        System.out.println(map1);
        for (int i: map1.values()) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
    }

    public static HashMap<Integer, Integer> map(int size){
        HashMap<Integer,Integer> map1 = new HashMap<>();
        for (int i = 0; i < size; i++) {
            map1.put(i, new Random().nextInt(10));
        }
        return map1;
    }
}
