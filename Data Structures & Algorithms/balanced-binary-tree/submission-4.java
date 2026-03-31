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
    public boolean isBalanced(TreeNode root) {
        if(checkHeight(root)!=-1)return true;
        else return false;
    }

    private int checkHeight(TreeNode root){
        if(root==null)return 0;
        int leftH = checkHeight(root.left);
        if(leftH==-1)return-1;
        int rightH = checkHeight(root.right);
        if(rightH==-1)return-1;
        if(Math.abs(rightH-leftH)>1){return -1;}

        return 1+Math.max(leftH,rightH);
    }
}
