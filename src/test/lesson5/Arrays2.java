package test.lesson5;

import java.util.*;
import java.util.Arrays;


public class Arrays2 {
    public static void main(String[] args) {
        int max_arr;

        Scanner scan = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        max_arr = scan.nextInt();

        String[] arr = new String[max_arr];
        ArrayList <Integer> list = new ArrayList<Integer>();
//        int[] arr2 = new int[0];

        for (int i = 0; i < max_arr; i++){
            System.out.print("Введите элемент массива: ");
            String value = scan.next();
            arr[i] = value;
        }

        System.out.println(Arrays.toString(arr));

        System.out.println("Хотите найти какой-то определенный элемент?");
        String value2 = scan.next();

        if ("да".equalsIgnoreCase(value2)){
            int k = 0;
            //for each - конструкиця ниже
            for (String i : arr){
                try{
                    int resValue = Integer.parseInt(i);
                    list.add(resValue);
//                    arr2[k] = resValue;
                } catch (NumberFormatException e) {

                }
                k++;
            }
            System.out.println("Напишите какой (min | max | search)");
            String value3 = scan.next();

            switch (value3){
                case "минимальный":
                    try {
                        System.out.println(Collections.min(list, null));
                        break;
                    } catch (NoSuchElementException e){
                        
                    }

                default:
                    System.out.println("Введено непраивльное значение");
            }

        } else {
            System.out.println("Программа завершена");
        }

    }
}
