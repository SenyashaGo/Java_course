package test.lesson6;

import java.util.ArrayList;
import java.util.Scanner;

public class CollectionsFrame {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(1, 10);
        System.out.println(numbers.size());
        System.out.println(numbers.get(1));
        numbers.remove(1);
        System.out.println(numbers);
        numbers.clear();
        System.out.println(numbers);

    }
}
