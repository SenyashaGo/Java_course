package test.lesson5;


import java.util.Scanner;

public class Arrays2D {
    public static void main(String[] args) {

        int val1, val2;
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите размер основного массива: ");
        val1 = scan.nextInt();

        String[][] arr = new String[val1][]; // [[],[]]

        for (int i = 0; i < arr.length; i++){
            System.out.println("Сколько будет элементов?");
            val2 = scan.nextInt();

//            ПЕРЕВОД СТРИНГИ В ИНТ
//            number = Integer.valueOf(validString);
//            int i2 = Integer.valueOf(i);

            arr[i] = new String[val2];
            for (int j = 0; j < arr[i].length; j++){
                System.out.print("Введите элемент, который будет стоять под индексом \"" + j +"\": ");
                arr[i][j] = scan.next();
            }

        }
//        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++){

            StringBuilder pre_res = new StringBuilder("[");
            for (int j = 0; j < arr[i].length; j++){

//                надо доработать
                if (j>arr[i].length-2 && arr[i].length != 1){
                    continue;
                } else if (j>arr[i].length-2 && arr[i].length == 1) {
                    pre_res.append(arr[i][j]);
                } else {
                    pre_res.append(arr[i][j]).append(", ");
                }

            }
            pre_res.append("], ");
            String res = pre_res.toString();
            System.out.print(res);
        }



    }
}
