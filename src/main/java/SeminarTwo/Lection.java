package SeminarTwo;

import java.util.Arrays;

public class Lection {
    public static void main(String[] args) {
        String s = "!Привет!";
        System.out.println(s.length()); // Количество символов в строке
        s += "А"; // Прибавить А к строке S
        s.concat("А"); // Сложить вместе две строчки, тоже самое, что и s += A
        s.endsWith("А"); // Если заканчивается на А вернет true
        System.out.println(s.charAt(5)); // Вернет символ с указанным индексом
        System.out.println(s.indexOf("ри")); // Вернет индекс откуда начинается "ри"
        s.lastIndexOf("!"); // Вернет последний индекс вхождения !
        s.getBytes();// разделить строку по буквам
        System.out.println(s.toLowerCase()); // Перевод в нижний регистр, но не трогает исходник
        System.out.println(s.toUpperCase()); // Перевод в верхний регистр, но не трогает исходник
        // Вырезает подстроку, можно указать интервал
        s.subSequence(1, 3); // тоже самое
        System.out.println(s.repeat(4));
        System.out.println(s.repeat(4).replace("!", "?"));
        System.out.println(s.repeat(4).replace("!", ""));
        String[] tmp = s.repeat(4).split("А");
        System.out.println(s);
        System.out.println(Arrays.toString(tmp));

        //StringBuilder

        StringBuilder stringBuilder = new StringBuilder("Привет! ");
        stringBuilder.append(.235f); // Добавить элемент в билдер
        stringBuilder.setCharAt(stringBuilder.length() / 2, 'О'); // Установить букву по указанному индексу
        stringBuilder.deleteCharAt(stringBuilder.length() / 2); // Удалить букву по конкретному индексу
        stringBuilder.compareTo(new StringBuilder("!")); // Если равны вернет 0
        stringBuilder.delete(0, 1); // Удалить диапозон от 0 до 1
        stringBuilder.insert(4, true); // Вставить в билдер любой тип данных. Куда, что
        stringBuilder.indexOf("i");
        stringBuilder.lastIndexOf("i");
        stringBuilder.replace(0,5," "); // Откуда, до куда, на, что поменять
        stringBuilder.reverse(); //Развернуть строчку
        s = stringBuilder.toString(); // Переводит StringBuilder в строку
        System.out.println(s);

//        StringBuilder builder = new StringBuilder(s);
//        s = builder.reverse().toString();
//        builder = null;

        s = new StringBuilder(s).reverse().toString();

        String str = "";
        StringBuilder builder1 = new StringBuilder();

        long start = System.currentTimeMillis();
        for (int i = 0; i < 100; i++) {
            str += Character.getName(i);
        }
        System.out.println("String result: " + (System.currentTimeMillis() - start));

        start = System.currentTimeMillis();
        for (int i = 0; i < 100; i++) {
            builder1.append(Character.getName(i));
        }
        System.out.println("Builder result: " + (System.currentTimeMillis() - start));

    }
}
