import java.util.Arrays;

public class _414_Third_Maximum_Number {
    public static int thirdMax(int[] nums) {
        Arrays.sort(nums);
        int i = nums.length - 1;
        int k = 0;
        int x = nums[i];
        while (k < 2 && i>= 0 ) {
             if(nums[i] < x ) {
                x = nums[i];
                k++;
             }
             i--;
        }
        if (k == 2) {
            return x;
        } else {
            return nums[nums.length - 1];
        }
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2,5,5, 4, 2, 3, 3 };
        int num = thirdMax(arr);
        System.out.println(num);
    }
}