package test.lesson7;


import java.util.Scanner;

public class Func {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        info("Введите первое число: ");
        int n1 = scan.nextInt();
        info("Введите второе число: ");
        int n2 = scan.nextInt();
        summa(n1,n2);
    }

    public static void info(String word){
        System.out.print(word);
    }

    public static void summa(int n1, int n2){
        int res = n1 + n2;
        String result = String.valueOf(res);
        info(result);
    }
}
