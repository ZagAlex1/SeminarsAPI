package SeminarFive;

import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

public class TaskTwo {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        HashMap<Integer, String> man = map(3);
        HashMap<Integer, String> woman = map(3);
        System.out.println(man);
        System.out.println(woman);

        for (int m : man.keySet()) {
            if(woman.containsKey(m)){
                System.out.println(man.get(m) + " " + woman.get(m));
            }
        }
    }

    public static HashMap<Integer, String> map(int size) {
        HashMap<Integer, String> map1 = new HashMap<>();
        for (int i = 0; i < size; i++) {
            map1.put(new Random().nextInt(25), scanner.nextLine());
        }
        return map1;
    }
}
