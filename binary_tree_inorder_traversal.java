//day 21 leetcode 94th problem
import java.util.ArrayList;
import java.util.List;

public class binary_tree_inorder_traversal {

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.right = new TreeNode(6);

        binary_tree_inorder_traversal solution = new binary_tree_inorder_traversal();
        List<Integer> result = solution.inorderTraversal(root);
        System.err.println("Inorder Traversal: " + result);
    }

    List<Integer> inorderTraversal(TreeNode root) {
        ArrayList<Integer> res = new ArrayList<>();
        //if some parts of the list are null do not return null
        //becaue addAll expects a empty list, not null
        if (root == null) {
            return res;
        }
        // Traverse the left subtree first
        res.addAll(inorderTraversal(root.left));
        // Visit the current node
        res.add(root.val);
        // Traveres the Right subtree
        res.addAll(inorderTraversal(root.right));
        return res;
    }

    static class TreeNode {

        int val;
        TreeNode left;
        TreeNode right;

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
