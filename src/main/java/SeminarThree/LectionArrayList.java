package SeminarThree;

import java.util.*;

public class LectionArrayList {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> list1 = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            list.add(new Random().nextInt(15)); // Добавить элемент в list, в конец массива
            list1.add(new Random().nextInt(15));
        }
        //list.add(0, 1); // Добавить элемент по индексу, весь массив подвинется
        //list.addAll(list1); // добавить все из list1 в list
        //list.addAll(0, list1);
        //list.size(); // Возвращает количество элементов массива
        //list.isEmpty(); // true, если пустой
//        list.clear(); // очистить массив(проставляет null)
        //list.set(0, 1223); // Меняем элемент на другой. Индекс, на что

        ArrayList<String> list2 = new ArrayList<>();
        list2.add("Hello!");
        list2.add("Hello!");
        list2.remove(0); // Удалит по индексу
        //list2.remove("Hello!"); // Удалит по содержимому
        //list.contains("Hello!"); // Возвращает истину если объект найден
        //list.trimToSize(); // Обрезать массив
        //list.ensureCapacity(20); // Установить емкость массива
        //list.get(2); // Получить элемент по индексу

//        for (int i = 0; i < list2.size(); i++) {
//            System.out.print(list2.get(i) + " ");
//        }
//        System.out.println();
//
//        for (int i : list) {
//            System.out.print(i + " ");
//        }
//        System.out.println();
//
//        ListIterator<Integer> iterator = list.listIterator(list.size() - 1);
//        while (iterator.hasPrevious()) {
//            int i = iterator.previous();
//            iterator.nextIndex();
//            System.out.print(i + " ");
//        }
//        System.out.println();
//
//        Iterator<Integer> iterator1 = list.iterator();
//        while (iterator1.hasNext()) {
//            int i = iterator1.next();
//            System.out.print(i + " ");
//            iterator1.remove();
//        }
//        System.out.println();

//        list.forEach(n -> System.out.print(n + " "));

//        System.out.println(list.size());

        System.out.println(list);
        System.out.println(list1);
        System.out.println("-".repeat(16));

//        list.retainAll(list1); // Удаляет совпадающие
        list.removeAll(list1); // Удаляет не совпадающие

//        list.sort(Comparator.naturalOrder()); // сортировка по увеличению
//        list.sort(Comparator.reverseOrder()); // сортировка по уменьшению

        list.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 - o2;
//                return o2 - o1; reverse
            }
        });

        System.out.println(list);

        List<Integer> list3 = list.subList(0, list1.size() / 2);
        System.out.println(list3);

        list1.clear();
        list.forEach(n -> list1.add(0, n));

        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(null);
    }
}

