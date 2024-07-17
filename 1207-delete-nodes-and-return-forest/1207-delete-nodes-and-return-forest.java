/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode() {}
 * TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) {
 * this.val = val;
 * this.left = left;
 * this.right = right;
 * }
 * }
 */
class Solution {
    public Set<Integer> set;
    public List<TreeNode> ans = new ArrayList<>();

    public TreeNode fun(TreeNode root) {
        if (root == null) {
            return null;
        }
        root.left = fun(root.left);
        root.right = fun(root.right);
        

        if (set.contains(root.val)) {
            if (root.left != null) {
                ans.add(root.left);
            }
            if (root.right != null) {
                ans.add(root.right);
            }

            return null;
        }

        return root;
    }

    public List<TreeNode> delNodes(TreeNode root, int[] to_delete) {
        set = new HashSet<>();
        for (int i = 0; i < to_delete.length; i++) {
            set.add(to_delete[i]);
        }
        if (!set.contains(root.val)) {
            ans.add(root);
        }
        fun(root);
        return ans;

    }
}