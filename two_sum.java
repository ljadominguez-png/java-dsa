
import java.util.HashMap;

public class two_sum {

    public static void main(String[] args) {
        int[] arr = new int[]{
            1, 2, 3, 4, 5, 6, 7
        };
        two_sum myclass = new two_sum();
        int[] result = myclass.twosum(arr, 12);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]);
        }

    }

    public int[] twosum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }
            map.put(nums[i], i);
        }
        return new int[]{};
    }
}
