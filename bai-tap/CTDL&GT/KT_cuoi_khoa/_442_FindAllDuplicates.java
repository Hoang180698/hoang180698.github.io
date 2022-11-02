import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _442_FindAllDuplicates {
    public List<Integer> findDuplicates(int[] nums) {
       List<Integer> list = new ArrayList<>();
       Arrays.sort(nums);
       for (int i = 0; i < nums.length - 1; i++) {
           if (nums[i] == nums[i + 1]) {
               list.add(nums[i]);
               i++;
           }
       }
       return list;
   }
}
