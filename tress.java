import java.util.*;

public class tress {

    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val) {
            this.val = val;
        }
    }

    static class Solution {

        public TreeNode findSuccessor(TreeNode root, int key) {

            if (root == null) {
                return null;
            }

            Queue<TreeNode> queue = new LinkedList<>();
            queue.offer(root);

            while (!queue.isEmpty()) {

                TreeNode node = queue.poll();

                if (node.left != null) {
                    queue.offer(node.left);
                }

                if (node.right != null) {
                    queue.offer(node.right);
                }

                if (node.val == key) {
                    break;
                }
            }

            return queue.peek();
        }
    }

    public static void main(String[] args) {

        TreeNode root = new TreeNode(12);
        root.left = new TreeNode(7);
        root.right = new TreeNode(1);
        root.left.left = new TreeNode(9);
        root.left.right = new TreeNode(15);
        root.right.left = new TreeNode(10);
        root.right.right = new TreeNode(5);

        Solution obj = new Solution();

        TreeNode ans = obj.findSuccessor(root, 9);

        if (ans != null) {
            System.out.println(ans.val);
        } else {
            System.out.println("No Successor");
        }
    }
}