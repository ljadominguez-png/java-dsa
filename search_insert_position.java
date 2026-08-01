public class search_insert_position{
    public static void main (String [] args){
        int[] arr1 = new int[]{1,3,5,6};
        search_insert_position solution = new search_insert_position();
        System.out.println("Result: " + solution.searchInset(arr1, 5));
        System.out.println("Result: " + solution.searchInset(arr1, 2));
        System.out.println("Result: " + solution.searchInset(arr1, 7));
    }
    private int searchInset(int[] nums, int target){
        //use the binary search tree algorithm
        // 3 variables needed
        int left = 0, //first position
        right = nums.length -1; //last position
        while (left <= right) { 
            int mid = (left + right) / 2;

            if(nums[mid] == target){
                return mid;
            }
            // if target is larger then search more on the right half
            else if (nums[mid] < target) {
                left = mid + 1;
            }
            // if target is smaller
            else{
                right = mid -1;
            }
        }
        //if the target cannot be found
        return left;
    }
 }