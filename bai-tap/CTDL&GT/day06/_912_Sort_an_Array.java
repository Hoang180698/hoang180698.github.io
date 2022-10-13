public class _912_Sort_an_Array {
    public int[] sortArray(int[] nums) {
        
        return sort(nums, 0, nums.length - 1);
    }
    
   public int[] sort(int[] arr, int iL, int iR){
        //  dieu kien dung 
        if(iL == iR) {
            int[] singleElement = {arr[iL]};
            return singleElement;
        }

        // chia mang
        int iM = (iL + iR) / 2;
        int[] arr1 = sort(arr, iL, iM);
        int[] arr2 = sort(arr, iM + 1, iR);

        // gop mang
        int[] result = merge(arr1, arr2);

        return result;
    }
    public int[] merge(int[] arr1, int[]arr2) {
        int n = arr1.length + arr2.length;
        int[] result = new int[n];
        int i = 0;
        int j = 0;
        int k = 0;
        while(k < n) {
            if(i < arr1.length && j < arr2.length) { // arr1 vs arr2 khong rong
                if(arr1[i] <= arr2[j]) {
                    result[k] = arr1[i];
                    i++;
                } else {
                    result[k] = arr2[j];
                    j++;
                }
            }else { // arr1 hoac arr3 khac rong
                if(i < arr1.length) { //arr1 khong rong, arr2 khong rong
                    result[k] = arr1[i];
                    i++;
                } else { //arr1 rong , arr2 khong rong
                    result[k] = arr2[j];
                    j++;
                }
            }
            k++;
        }

        return result;
    }
}