//Дана json-строка (можно сохранить в файл и читать из файла)
//        [{"фамилия":"Иванов","оценка":"5","предмет":"Математика"},{"фамилия":"Петрова","оценка":"4","предмет":"Информатика"},{"фамилия":"Краснов","оценка":"5","предмет":"Физика"}]
//        Написать метод(ы), который распарсит json и, используя StringBuilder, создаст строки вида: Студент [фамилия] получил [оценка] по предмету [предмет].
//        Пример вывода:
//        Студент Иванов получил 5 по предмету Математика.
//        Студент Петрова получил 4 по предмету Информатика.
//        Студент Краснов получил 5 по предмету Физика.

import java.util.Scanner;

public class HW2_task6 {
    public static void main(String[] args) {
        Scanner scanner_in = new Scanner(System.in);
        StringBuilder builder=new StringBuilder(scanner_in.nextLine());
        String str_fam1=builder.substring(13,19);
        String str_fam2=builder.substring(70,77);
        String str_fam3=builder.substring(129,136);
        String str_mark1=builder.substring(31,32);
        String str_mark2=builder.substring(89,90);
        String str_mark3=builder.substring(148,149);
        String str_subject1=builder.substring(45,55);
        String str_subject2=builder.substring(103,114);
        String str_subject3=builder.substring(162,168);
        System.out.println("Студент "+str_fam1+" получил "+str_mark1+" по предмету "+str_subject1+".");
        System.out.println("Студент "+str_fam2+" получила "+str_mark2+" по предмету "+str_subject2+".");
        System.out.println("Студент "+str_fam3+" получил "+str_mark3+" по предмету "+str_subject3+".");
    }
}
