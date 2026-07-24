public class remove_duplicates {

    public static void main(String[] args) {
        int[] problem1 = new int[]{1, 1, 2};
        int[] problem2 = new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4};

        remove_duplicates myclass = new remove_duplicates();
        int result1 = myclass.removedup(problem1), result2 = myclass.removedup(problem2);
        System.out.print("test1 : " + result1);
        System.out.println("");
        System.out.print("test2 : " + result2);
    }

    public int removedup(int[] nums) {
        //using tqo pointer approach
        // while it is true that they look the same as the previous
        //that returns the count of the unique elements
        //however the difference is the previous one does not 
        //modify the array, the problem wants to see that the array
        //is modified
        //fast = scans
        //slow = writes
        int slow = 0;
        for (int fast = 0; fast<nums.length; fast++){
            //compare values
            if(nums[fast] != nums[slow]){
                slow++;
                nums[slow] = nums[fast];// where modification happens
            }
        }
        //returns the count
        return slow + 1;
        //returns the modified array
        //return nums;
        //reason for removal, the problem 
        //does not want the count of uique
        //numbers but it wants the modified 
        //array version where duplicates are removed
       /* //create set
        Set<Integer> unique = new HashSet<>();
        //loop through the array and manually add it to the set
        for(int num: nums){
            unique.add(num);    
        }
        return unique.size();*/
    }
}
