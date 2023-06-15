package SeminarTwo;

import java.util.Scanner;

public class FirstTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первую строку: ");
        String str = scanner.nextLine();

        System.out.println("Введите вторую строку: ");
        String str1 = scanner.nextLine();

        Boolean bool;
        if (str.contains(str1)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

        scanner.close();
    }
}
