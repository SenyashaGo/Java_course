package test.lesson7;

public class Func2 {
    public static void main(String[] args) {
        byte[] arr = new byte[] {1,2,3};
        System.out.println(sum(arr));
    }
    public static int sum(byte[] arr){
        int res = 0;
        for (Byte i : arr){
            res+= i;
        }
        return res;
    }
}
