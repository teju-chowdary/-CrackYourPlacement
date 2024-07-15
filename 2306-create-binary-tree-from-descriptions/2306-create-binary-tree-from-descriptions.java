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
    public TreeNode createBinaryTree(int[][] descriptions) {

        HashMap<Integer, TreeNode> map = new HashMap<>();
        HashSet<Integer> children = new HashSet<>();
        TreeNode root = null;

        for (int[] arr : descriptions) {
            int par = arr[0];
            int child = arr[1];
            int isLeft = arr[2];
            if (!map.containsKey(par)) {
                map.put(par, new TreeNode(par));
            }
            if (!map.containsKey(child)) {
                map.put(child, new TreeNode(child));
            }
            TreeNode parent = map.get(par);
            TreeNode chil = map.get(child);
            if (isLeft == 1) {
                parent.left = chil;
            } else {
                parent.right = chil;
            }

            children.add(child);

        }
        for (int[] arr : descriptions) {
            int par = arr[0];
            if (!children.contains(par)) {
                root = map.get(par);
            }
        }
        return root;
    }

}
