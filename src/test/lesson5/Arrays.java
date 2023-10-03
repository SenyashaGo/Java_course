package test.lesson5;

public class Arrays {
    public static void main(String[] args) {

        int[] nums = new int[5];
        nums[0] = 69;
        System.out.println(nums[0]);

        float[] nums2 = new float[] {0.5f, 5.82324f, 24};
        System.out.println(nums2[1]);

        for (int i = 0; i < nums2.length; i++){
            System.out.println(nums2[i]);
        }
    }
}
