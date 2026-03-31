/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {
    int md =0;
    public int diameterOfBinaryTree(TreeNode root) {
        calHeight(root);
        return md;
    }

    private int calHeight(TreeNode root){
        if(root==null)return 0;

        int leftHeight = calHeight(root.left);
        int rightHeight = calHeight(root.right);
        int d = leftHeight+rightHeight;
        md = Math.max(md,d);
        return 1+Math.max(leftHeight,rightHeight);
    }
}
