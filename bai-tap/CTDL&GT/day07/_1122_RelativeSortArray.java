public class _1122_RelativeSortArray {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int[] nums = new int[1001];
        int k = 0;
        for (int i : arr1) {
            nums[i]++;
        }
        for (int i : arr2) {
            while(nums[i] > 0) {
                arr1[k] = i;
                k++;
                nums[i]--;
            }
        }
        for (int i = 0; i < nums.length; i++) {
            while (nums[i] > 0) {
                arr1[k] = i;
                k++;
                nums[i]--;
            }
        }
       
        return arr1;
    }
}
