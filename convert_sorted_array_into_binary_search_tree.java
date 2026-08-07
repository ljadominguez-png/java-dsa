/*
Given an integer array nums where the elements are sorted in ascending order, convert it to a height-balanced binary search tree.

 

Example 1:


Input: nums = [-10,-3,0,5,9]
Output: [0,-3,9,-10,null,5]
Explanation: [0,-10,5,null,-3,null,9] is also accepted:

Example 2:


Input: nums = [1,3]
Output: [3,1]
Explanation: [1,null,3] and [3,1] are both height-balanced BSTs.
 

Constraints:

1 <= nums.length <= 104
-104 <= nums[i] <= 104
nums is sorted in a strictly increasing order.
*/
public class convert_sorted_array_into_binary_search_tree {

    public static void main(String[] args) {
        int [] test1 = new int[]{-10,-3,0,5,9};
        int [] test2 = new int[]{1,3};

        convert_sorted_array_into_binary_search_tree solution = new convert_sorted_array_into_binary_search_tree();
        TreeNode result = solution.sortedArraytoBST(test1);
        //tinamad na mag print ng result tignan nalang sa leetcode taena
    }
    //pointers does not work here, instead we apply the concept of divide and conquer
    public TreeNode sortedArraytoBST(int[] nums) {
        return helper(nums, 0, nums.length-1);
    }

    //recursive helper function
    private TreeNode helper (int[] nums, int start, int end){
        if (start > end){
            return null;
        }
        //finding the middle
        int mid = (start + end)/2;
        TreeNode nodes = new TreeNode();
        nodes.left = helper(nums, start, end-1);
        nodes.right = helper(nums, start +1, end);

        return nodes;
    }

    static class TreeNode {

        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}
