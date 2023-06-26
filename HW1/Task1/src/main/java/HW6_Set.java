import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

//Разработать программу, имитирующую поведение коллекции HashSet. В программе содать метод add добавляющий элемент,
// метод toString возвращающий строку с элементами множества и метод позволяющий читать элементы по индексу.
//        *Реализовать все методы из семинара.
//        Формат данных Integer.
public class HW6_Set {
    public static void main(String[] args) {

        MySet mySet = new MySet();
        System.out.println(mySet.AddItem(2));
        System.out.println(mySet.AddItem(4));
        System.out.println(mySet.AddItem(5));
        System.out.println(mySet.AddItem(10));
        System.out.println(mySet.AddItem(11));
        System.out.println(mySet.AddItem(11));
        System.out.println(mySet.PrintSize());
        System.out.println(mySet.delItem(10));
        System.out.println("Вывод значения по индексу 2 : " + mySet.getByIndex(2));
        System.out.println("Содержит 11? : " + mySet.hasItem(11));
        System.out.println("Содержит 13? : " + mySet.hasItem(13));

        mySet.printMySet();
    }

    static class MySet<E> {
        Map<Integer, Object> hashMapSet = new HashMap<>();
        private static final Object obj = new Object();

        private boolean AddItem(int item) {
            return hashMapSet.put(item, obj) == null;
        }

        private int PrintSize() {
            return hashMapSet.size();
        }

        private boolean delItem(int item) {
            return hashMapSet.remove(item, obj);
        }

        private void printMySet() {
            for (Integer key : hashMapSet.keySet()) {
                System.out.print(key + " ");
            }
        }

        private E getByIndex(int index) {
            ArrayList arrayList=new ArrayList<>(hashMapSet.keySet());
           return (E) arrayList.get(index);

        }

        private boolean hasItem(int item){
            return hashMapSet.containsKey(item);
        }
    }
}


