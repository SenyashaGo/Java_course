package test.calc;

import java.util.Scanner;

public class Calc {

    public static void main(String[] args) {
        float num1, num2, res;
        String operator;
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        num1 = scan.nextFloat();
        System.out.print("Введите оператор: ");
        operator = scan.next();
        System.out.print("Введите второе число: ");
        num2 = scan.nextFloat();

        switch (operator){
            case "+":
                res = num1 + num2;
                System.out.println(res);
                break;
            case "-":
                res = num1 - num2;
                System.out.println(res);
                break;
            case "/":
                res = num1 / num2;
                System.out.println(res);
                break;
            case "*":
                res = num1 * num2;
                System.out.println(res);
                break;
            case "%":
                res = num1 % num2;
                System.out.println(res);
                break;
            default:
                System.out.println("Ошибка в выборе оператора");
        }

    }
}
