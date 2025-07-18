package July18;

import java.util.*;

class Node {
    char key;
    Node left, right;

    Node(char key) {
        this.key = key;
    }
}

public class ReverseOddLevels {

    Node root;

    // Function to reverse nodes at alternate odd levels (root is Level 1)
    void reverseOddLevels(Node left, Node right, int level) {
        if (left == null || right == null)
            return;

        // If current level is odd, swap values
        if (level % 2 == 1) {
            char temp = left.key;
            left.key = right.key;
            right.key = temp;
        }

        // Recurse deeper
        reverseOddLevels(left.left, right.right, level + 1);
        reverseOddLevels(left.right, right.left, level + 1);
    }

    // Function to print tree level by level
    void printLevelOrder(Node root) {
        if (root == null) return;

        Queue<Node> q = new LinkedList<>();
        q.add(root);

        while (!q.isEmpty()) {
            int levelSize = q.size();
            for (int i = 0; i < levelSize; i++) {
                Node temp = q.poll();
                System.out.print(temp.key + " ");
                if (temp.left != null) q.add(temp.left);
                if (temp.right != null) q.add(temp.right);
            }
            System.out.println(); // new line for new level
        }
    }

    public static void main(String[] args) {
        ReverseOddLevels tree = new ReverseOddLevels();

        // Level 1
        tree.root = new Node('A');

        // Level 2
        tree.root.left = new Node('B');
        tree.root.right = new Node('C');

        // Level 3
        tree.root.left.left = new Node('D');
        tree.root.left.right = new Node('E');
        tree.root.right.left = new Node('F');
        tree.root.right.right = new Node('G');

        // Level 4
        tree.root.left.left.left = new Node('H');
        tree.root.left.left.right = new Node('I');
        tree.root.left.right.left = new Node('J');
        tree.root.left.right.right = new Node('K');
        tree.root.right.left.left = new Node('L');
        tree.root.right.left.right = new Node('M');
        tree.root.right.right.left = new Node('N');
        tree.root.right.right.right = new Node('O');

        System.out.println("Before reversal (Level Order):");
        tree.printLevelOrder(tree.root);

        // Perform alternate level reversal (odd levels only)
        tree.reverseOddLevels(tree.root.left, tree.root.right, 2); // Start with level 2 (children of level 1)

        System.out.println("\nAfter reversing odd levels (Level Order):");
        tree.printLevelOrder(tree.root);
    }
}
