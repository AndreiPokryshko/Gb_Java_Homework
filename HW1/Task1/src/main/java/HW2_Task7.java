//*Сравнить время выполнения замены символа "а" на "А" любой строки содержащей >1000 символов средствами String и StringBuilder.
public class HW2_Task7 {
    public static void main(String[] args) {
        String str="";

        for (int i = 0; i < 1000; i++) {
           str+="a";
        }
        System.out.println(str);
        long start_time=System.currentTimeMillis();
   ;String str2=str.replace('a','A');
        System.out.println(str.replace('a','A'));
        System.out.println("str.replace:" + (System.currentTimeMillis()-start_time));

StringBuilder stringBuilder = new StringBuilder(str);
        start_time=System.currentTimeMillis();
        System.out.println(stringBuilder.toString().replace('a','A'));
        System.out.println("stringb:" + (System.currentTimeMillis()-start_time));

    }
}
