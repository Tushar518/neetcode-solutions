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
        if(check(root)!=-1)return true;
        else return false;
    }

    private int check(TreeNode root){
        if(root==null)return 0;
        
        int leftH = check(root.left);
        if(leftH==-1)return -1;
        int rightH = check(root.right);
        if(rightH==-1)return -1;

        int diff = Math.abs(leftH-rightH);
        if(diff>1){return -1;}

        return 1 + Math.max(leftH,rightH);
    }
}
