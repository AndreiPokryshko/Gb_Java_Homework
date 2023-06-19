//Организовать вводи и хранение данных пользователей. ФИО возраст и пол
//        вывод в формате Фамилия И.О. возраст пол
//        добавить возможность выхода или вывода списка отсортированного по возрасту!)
//        *реализовать сортировку по возрасту с использованием индексов
//        *реализовать сортировку по возрасту и полу с использованием индексов

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class HW4_Task9 {
        public static void main(String[] args) {

            String[] myStr = new String[0];
            String encoding = System.getProperty("console.encoding", "UTF-8");
            Scanner scanner = new Scanner(System.in, encoding);
            ArrayList<String[]> arrayList = new ArrayList<>();
            while (true) {
                System.out.println("Введите Фамилию, Имя, Отчество, Возраст, Пол (м/ж). Дл выхода пусто.:");
                String input_str = scanner.nextLine();//из файла sem3_text_input.txt
                if (input_str.length() == 0) {
                    break;
                }
                System.out.println(input_str);
                myStr = input_str.strip().split(" ");
                arrayList.add(myStr);
            }
            PrintSorted(arrayList,4);//второй параметр - номер поля для сортировки: 1-5
        }
        public static void PrintSorted(ArrayList<String[]> arrayList, Integer field) {
            arrayList.sort(new Comparator<String[]>() {
                @Override
                public int compare(String[] o1, String[] o2) {
                    return  o1[field-1].compareTo(o2[field-1]);
                }
            });
            System.out.println("-".repeat(30));
            System.out.println("Сортировка по полю - "+field+" :");
            for (String[] str : arrayList) {
                System.out.println(str[0] + " " + str[1].charAt(0) + ". " + str[2].charAt(1) + ". " + str[3] + " " + str[4]);
            }

        }

}
