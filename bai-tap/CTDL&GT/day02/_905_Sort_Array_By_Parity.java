import java.util.Arrays;

public class _905_Sort_Array_By_Parity {
    public static int[] sortArrayByParity(int[] nums) {  
        int[] arr = new int[nums.length];
        int n = nums.length - 1;
        int k = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                arr[k] = nums[i];
                k++;
            } else {
                arr[n] = nums[i];
                n--;
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] nums = {1,2,2,3,4,5};
        sortArrayByParity(nums);
        System.out.println(Arrays.toString(nums));
    }
}
