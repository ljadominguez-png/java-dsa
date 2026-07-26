public class remove_element {

    public static void main(String[] args){
        int[] arr1 = new int[]{3,2,2,3};
        int[] arr2 = new int[]{0,1,2,2,3,0,4,2};

        remove_element myclass = new remove_element();
        System.out.println("result1 = " + myclass.removeElement(arr1, 3));
        System.out.println("result1 = " + myclass.removeElement(arr2, 2));
    }
    //remove an element based on a given value
    //ligc is similar to the 2 pointer
    public int removeElement(int[] nums, int val) {
        int writer = 0;
        for (int reader = 0; reader < nums.length; reader++){
            if(nums[reader] != val){
                nums[writer] = nums[reader];
                writer++;
            }
        }
    return writer;
    }
}
