import java.lang.reflect.Array;
import java.util.Arrays;

public class _283_Move_Zeroes {
    public static void moveZeroes(int[] nums) {
        int k = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[k] = nums[i];
                k++;
            }
        }
        for (int i = k; i < nums.length; i++) {
            nums[i] = 0;
        }
    }

    public static void main(String[] args) {
        int[] nums = { 1, 2, 0, 4, 0, 0, 5 };
        moveZeroes(nums);
        System.out.println(Arrays.toString(nums));
    }
}
