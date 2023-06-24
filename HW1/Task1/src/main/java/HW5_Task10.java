//Реализуйте структуру телефонной книги с помощью HashMap.
//        Программа также должна учитывать, что во входной структуре будут повторяющиеся имена с
//        разными телефонами, их необходимо считать, как одного человека с разными телефонами.
//        Вывод должен быть отсортирован по убыванию числа телефонов.

import java.util.*;

public class HW5_Task10 {
    public static void main(String[] args) {
        Map<String, String> map_phone = new HashMap<>();
        map_phone.putIfAbsent("Иван", "+375296808080");
        map_phone.put("Иван2", "+375296808080; +375443111213");
        map_phone.put("Сергей", "+375296808070; +375443111215; +375255111258");
        map_phone.put("Василий", "+375255111258");
        map_phone.put("John", "+375257777777");

        ArrayList<String> arr_key = new ArrayList<>(map_phone.keySet());
        Collections.sort(arr_key, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return map_phone.get(o1).length() - map_phone.get(o2).length();
            }
        });
        System.out.println("--------------Не отсортированная телефоная книга-------------");
        int i = 1;
        for (var item : map_phone.entrySet()) {
            System.out.println(i + ". " + item.getKey() + "=" + item.getValue());
            i += 1;
        }

        System.out.println("--------------Отсортированная телефонная книга по кол-ву номеров т/ф-----------");
        i = 1;
        for (int j = 0; j < arr_key.size(); j++) {
            System.out.println(i + "." + arr_key.get(j) + "=" + map_phone.get(arr_key.get(j)));
            i += 1;
        }

    }
}
