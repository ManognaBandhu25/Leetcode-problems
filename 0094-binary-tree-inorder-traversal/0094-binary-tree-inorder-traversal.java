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
 public class Solution {
    public ArrayList<Integer> inorderTraversal(TreeNode root) {

    ArrayList<Integer> lst = new ArrayList<Integer>();
    if(root == null)
        return lst;
        Stack<TreeNode> stack = new Stack<TreeNode>();
 
        TreeNode p = root;
        while(!stack.empty() || p != null){
 
        if(p != null){
            stack.push(p);
        p = p.left;
        }else{
            TreeNode t = stack.pop();
            lst.add(t.val);
            p = t.right;
        }
    }
    return lst;
 }
 }