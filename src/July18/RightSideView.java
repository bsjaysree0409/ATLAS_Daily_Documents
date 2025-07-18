package July18;

import java.util.*;

class TreeNode {
    int val;
    TreeNode left, right;

    TreeNode(int val) {
        this.val = val;
    }
}

public class RightSideView {

    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (root == null) return result;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            int levelSize = queue.size();
            TreeNode rightMost = null;

            for (int i = 0; i < levelSize; i++) {
                TreeNode current = queue.poll();

                // The last node in this level is the rightmost one
                if (i == levelSize - 1)
                    result.add(current.val);

                if (current.left != null) queue.add(current.left);
                if (current.right != null) queue.add(current.right);
            }
        }

        return result;
    }

    // Helper method to manually construct tree from array
    public static TreeNode buildExampleTree1() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.right = new TreeNode(5);
        root.right.right = new TreeNode(4);
        return root;
    }

    public static void main(String[] args) {
        RightSideView solution = new RightSideView();

        TreeNode example1 = buildExampleTree1();
        System.out.println("Right side view: " + solution.rightSideView(example1)); // Output: [1, 3, 4]
    }
}
