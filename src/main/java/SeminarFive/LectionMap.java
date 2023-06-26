package SeminarFive;

import java.util.HashMap;
import java.util.Random;
import java.util.Set;

public class LectionMap {
    public static void main(String[] args) {

        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "!");
        map.putIfAbsent(1, "j"); // Проверяет, на ключ, если нет такого ставит новое
//        map.putAll(); Засунуть значения одной мапы в другую
//        map.replace(1, "j"); Если есть такой ключ, поменяет значение(наличие ключа обязательно)
//        map.replace(1,"!","j") Замена при полном соответствии ключ-значение

        map.remove(1); // Удалить элемент
        map.remove(1, "!"); // Удаление при полном соответствии
        map.get(1); // Получить значение по ключу
        map.getOrDefault(1, "#");// Если не нашел ключ 1 вернет значение по умолчанию

        map.keySet(); // Возвращает список ключей

        Set<Integer> se = map.keySet();
        for (int i = 0; i < se.size(); i++) {
            System.out.println(map.get((int) se.toArray()[i]));
        }

        for (String s : map.values()) {
            System.out.println(s);
        }

        map.containsValue("!"); // Проверяет есть ли такое значение
        map.containsKey(1); // Проверяет есть ли такой ключ

        map.compute(1, (key, value) -> value != null ? value + key : "0");// Нужно дополнительно делать map.containsKey(1)
        map.computeIfPresent(1, (key, value) -> value == null ? value + "!" : "0");// Выполнит если есть тако ключ
        map.computeIfAbsent(1, value -> value != null ? value + "!" : "0"); // Не можем использовать значение ключа

        map.clear();
        for (int i = 0; i < 10; i++) {
            map.put(i, String.valueOf(i));
        }

        map.replaceAll((key, value) -> (key + " " + value)); // Запишет в значение - ключ + значение
        System.out.println(map);

        HashMap<Integer, Integer> map1 = new HashMap<>();
        for (int i = 0; i < 10; i++) {
            map1.put(i, i);
        }
//        map1.replaceAll((key, value) -> value * value);
//        System.out.println(map1);

        HashMap<Integer, Integer> map2 = new HashMap<>();
        for (int i = 0; i < 10; i++) {
            map2.put(i, new Random().nextInt(5));
        }
        System.out.println(map1);
        System.out.println(map2);
        map1.replaceAll((key, value) -> map2.computeIfPresent(value, (k, v) -> v * key));
        System.out.println(map2);
    }
}
