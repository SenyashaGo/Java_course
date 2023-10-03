package test.lesson3;

import java.util.Scanner;

public class Math {

    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        System.out.print("Введите имя: ");
//        String user_name = scan.nextLine();
//        System.out.println("Привет, " + user_name);
//
//        short f1 = 50, f2 = 30;
//        int res = f1 + f2;
//        System.out.println("Результат: " + res);
        float first, second, res1, res2, res3, res4, res5;
        Scanner scan = new Scanner(System.in);
        System.out.print("Режим калькулятора!\n\nВведите 1 число: ");
        first = scan.nextFloat();
        System.out.print("\nВведите 2 число: ");
        second = scan.nextFloat();

        res1 = first + second;
        res2 = first - second;
        res3 = first / second;
        res4 = first % second;
        res5 = first * second;
        System.out.println("\nРезультат:\n" + res1 + "\n" + res2 +"\n"+ res3 + "\n" + res4);

    }
}
