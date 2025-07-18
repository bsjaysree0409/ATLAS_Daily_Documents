package July12;

class RedBlackTree {
    static final int RED = 0;
    static final int BLACK = 1;

    static class Node {
        int data, color;
        Node left, right, parent;

        Node(int data) {
            this.data = data;
            this.color = RED;  // New nodes are red by default
        }
    }

    private Node root = null;

    public void insert(int data) {
        Node newNode = new Node(data);
        root = bstInsert(root, newNode);
        fixViolation(newNode);
    }

    // Standard BST insert
    private Node bstInsert(Node root, Node node) {
        if (root == null)
            return node;

        if (node.data < root.data) {
            root.left = bstInsert(root.left, node);
            root.left.parent = root;
        } else if (node.data > root.data) {
            root.right = bstInsert(root.right, node);
            root.right.parent = root;
        }
        return root;
    }

    // Fix Red-Black Tree violations
    private void fixViolation(Node node) {
        Node parent = null;
        Node grandParent = null;

        while (node != root && node.parent.color == RED) {
            parent = node.parent;
            grandParent = parent.parent;

            // Parent is left child of grandparent
            if (parent == grandParent.left) {
                Node uncle = grandParent.right;

                // Case 1: Uncle is red
                if (uncle != null && uncle.color == RED) {
                    grandParent.color = RED;
                    parent.color = BLACK;
                    uncle.color = BLACK;
                    node = grandParent;
                } else {
                    // Case 2: Node is right child
                    if (node == parent.right) {
                        node = parent;
                        rotateLeft(node);
                    }
                    // Case 3: Node is left child
                    parent.color = BLACK;
                    grandParent.color = RED;
                    rotateRight(grandParent);
                }
            } else {
                // Parent is right child of grandparent
                Node uncle = grandParent.left;

                if (uncle != null && uncle.color == RED) {
                    grandParent.color = RED;
                    parent.color = BLACK;
                    uncle.color = BLACK;
                    node = grandParent;
                } else {
                    if (node == parent.left) {
                        node = parent;
                        rotateRight(node);
                    }
                    parent.color = BLACK;
                    grandParent.color = RED;
                    rotateLeft(grandParent);
                }
            }
        }
        root.color = BLACK;
    }

    private void rotateLeft(Node node) {
        Node rightChild = node.right;
        node.right = rightChild.left;

        if (rightChild.left != null)
            rightChild.left.parent = node;

        rightChild.parent = node.parent;

        if (node.parent == null)
            root = rightChild;
        else if (node == node.parent.left)
            node.parent.left = rightChild;
        else
            node.parent.right = rightChild;

        rightChild.left = node;
        node.parent = rightChild;
    }

    private void rotateRight(Node node) {
        Node leftChild = node.left;
        node.left = leftChild.right;

        if (leftChild.right != null)
            leftChild.right.parent = node;

        leftChild.parent = node.parent;

        if (node.parent == null)
            root = leftChild;
        else if (node == node.parent.left)
            node.parent.left = leftChild;
        else
            node.parent.right = leftChild;

        leftChild.right = node;
        node.parent = leftChild;
    }

    // In-order traversal
    public void inorder() {
        inorderHelper(root);
        System.out.println();
    }

    private void inorderHelper(Node node) {
        if (node != null) {
            inorderHelper(node.left);
            System.out.print(node.data + "(" + (node.color == RED ? "R" : "B") + ") ");
            inorderHelper(node.right);
        }
    }

    public static void main(String[] args) {
        RedBlackTree rbt = new RedBlackTree();
        int[] values = {10, 20, 30, 15, 25, 5};

        for (int value : values) {
            rbt.insert(value);
            System.out.print("Inorder after inserting " + value + ": ");
            rbt.inorder();
        }
    }
}
