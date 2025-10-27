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
    public List<List<Integer>> levelOrder(TreeNode root) {
    List<List<Integer>> res = new ArrayList<>();
        levelOrder(root, 0, res);
    return res;  
    }
    void levelOrder(TreeNode root, int level,List<List<Integer>>res){
        if(root==null) return;
        if(res.size()<=level){
            res.add(new ArrayList<>());
        }
        res.get(level).add(root.val);
        levelOrder(root.left,level+1,res);
        levelOrder(root.right,level+1,res);
    }
}




















        