//        Дана строка sql-запроса "select * from students where ". Сформируйте часть WHERE этого запроса, используя StringBuilder. Данные для фильтрации приведены ниже в виде json-строки.
//        Если значение null, то параметр не должен попадать в запрос.
//        Параметры для фильтрации: {"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}
//        В итоге должно получится select * from students where name=Ivanov, country=Russia, city=Moscow, age=null

import java.util.Scanner;

public class HW2_Task5 {
    public static void main(String[] args) {
//select * from students where name=Ivanov, country=Russia, city=Moscow, age=null
        Scanner scanner_in = new Scanner(System.in);
        String str=scanner_in.nextLine(); //Считывание с файла в IIdea Строка: {"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}
        str=str.replace("{", "");
        str= str.replaceAll("}","").replaceAll("\"" ,"").replaceAll(":" ,"=");
        System.out.print("select * from students where "+str);
    }
}
