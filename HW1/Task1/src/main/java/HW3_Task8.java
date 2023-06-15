//        Пусть дан произвольный список целых чисел.
//        1) Нужно удалить из него чётные числа
//        2) Найти минимальное значение
//        3) Найти максимальное значение
//        4) Найти среднее значение

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Random;

public class HW3_Task8 {
    public static void main(String[] args) {
        //        1) Нужно удалить из него чётные числа:

        ArrayList<Integer> arrayList1 = new ArrayList<>();
        ArrayList<Integer> arrayListOdd = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            arrayList1.add(new Random().nextInt(100));
        }
        System.out.println("Список: " + arrayList1);
        for (int i = 0; i < arrayList1.size(); i++) {
            if (arrayList1.get(i) % 2 == 1) {
                arrayListOdd.add(arrayList1.get(i));
            }

        }
        System.out.println("Задача1: Список без четных значений: " + arrayListOdd);

        arrayList1.sort(Comparator.naturalOrder());
        System.out.println("Задача2: Минимальное значение первого списка: " + arrayList1.get(0));
        System.out.println("Задача3: Максимальное значение первого списка: " + arrayList1.get(arrayList1.size() - 1));
        System.out.println("Список после сортировки: " + arrayList1);
        double sum=0;
        for (int item : arrayList1) {
            sum += item;
        }
        System.out.println("Задача4: Среднее значение первого списка: " + (sum/arrayList1.size()));

    }
}
