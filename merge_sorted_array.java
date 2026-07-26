
import java.util.Arrays;

public class merge_sorted_array {
    public static void main(String[] args) {
        int[] num1 = new int[]{1,2,3,0,0,0};
        int[] num2 = new int[]{1};
        int[] num4 = new int[]{0};
        merge_sorted_array myclass = new merge_sorted_array();
        myclass.merge(num1,3 ,num2, 1);
        System.out.print(Arrays.toString(num1));
    }
    public void merge(int[] nums1,int m, int[] nums2, int n){
        int p1 = m - 1, p2 = n-1, pwrite = m + n - 1;
        // Condition: loop that runs as long as BOTH arrays still have elements to compare.
        while (p1 >= 0 && p2 >=0){
           // 1. Compare nums1[p1] and nums2[p2]
           if(nums1[p1] > nums2[p2]){
            // 2. Put the larger value at nums1[pWrite]
             nums1[pwrite] = nums1[p1];
             p1--;
           }else{
              nums1[pwrite] = nums2[p2];
              p2--;
           }
           pwrite--;
          
         // 3. Move the corresponding pointer (p1-- or p2--) and pWrite-- 
        }
        //a second while loop that handles any remaining elements in nums2
        while(p2 >=0){
            nums1[pwrite] = nums2[p2];
            p2--;
            pwrite--;
        }
    }
}
