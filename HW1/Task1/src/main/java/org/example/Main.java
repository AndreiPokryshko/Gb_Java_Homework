package org.example;

import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int i = new Random().nextInt(0, 2000);
        System.out.println(i);
        System.out.println(Integer.toBinaryString(i));
        String str = Integer.toBinaryString(i).toString();
        System.out.println(str.length()); //вывод числа старшего бита
        System.out.println("--------------");
        System.out.println("Введите из диапазона 0-32767 число для заполнения массива: ");
        Scanner scan_in = new Scanner(System.in);
        int min_range = scan_in.nextShort();
        int[] arr_m1 = new int[(Short.MAX_VALUE - min_range) / 2 + (Short.MAX_VALUE - min_range)%2];
        for (int j = min_range, k = 0; j < Short.MAX_VALUE; j++) {
            if (j % 2 == 0) {
                arr_m1[k] = j;
                System.out.println(arr_m1[k]);
               k++;
            }
        }
             System.out.println(arr_m1.length);
// TASK 4:
        System.out.println("Введите из диапазона -32767 до 32767 число до которого заполится массив: ");
        int max_range = scan_in.nextShort();
        int[] arr_m2 = new int[(Math.abs(Short.MIN_VALUE)-Math.abs(max_range)) / 2 + (Math.abs(Short.MIN_VALUE)-Math.abs(max_range)) % 2];
        for (int j = Short.MIN_VALUE, k = 0; j < max_range; j++) {
            if (j % 2 != 0) {
                arr_m2[k] = j;
                System.out.println(arr_m2[k]);
                k++;
            }
        }
        System.out.println(arr_m2.length);
    }

}
