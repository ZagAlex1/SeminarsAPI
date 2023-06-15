package SeminarTwo;

import java.util.Scanner;

public class SecondTask {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первую строку: ");
        String str = scanner.nextLine();

        System.out.println("Введите вторую строку: ");
        StringBuilder str1 = new StringBuilder(scanner.nextLine());

        System.out.println(str.equals(str1.reverse().toString()));

        scanner.close();
    }
}
