package test.lesson4;

import java.util.Scanner;

public class Lesson4_2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        switch (num){
            case 1:
                System.out.println("num 1");
                break;
            case 2:
                System.out.println("num 2");
                break;
            default:
                System.out.println("default");

        }

    }
}
