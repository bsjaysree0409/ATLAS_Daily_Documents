package July12;

// AVL Tree class with insert operation
public class AVLTreeInsert {
    private AVLNode root;

    // Get the height of a node
    private int height(AVLNode node) {
        return node == null ? 0 : node.height;
    }

    // Get balance factor of node
    private int getBalance(AVLNode node) {
        return node == null ? 0 : height(node.left) - height(node.right);
    }

    // Right rotate
    private AVLNode rightRotate(AVLNode y) {
        AVLNode x = y.left;
        AVLNode T2 = x.right;

        // Rotate
        x.right = y;
        y.left = T2;

        // Update heights
        y.height = Math.max(height(y.left), height(y.right)) + 1;
        x.height = Math.max(height(x.left), height(x.right)) + 1;

        return x;
    }

    // Left rotate
    private AVLNode leftRotate(AVLNode x) {
        AVLNode y = x.right;
        AVLNode T2 = y.left;

        // Rotate
        y.left = x;
        x.right = T2;

        // Update heights
        x.height = Math.max(height(x.left), height(x.right)) + 1;
        y.height = Math.max(height(y.left), height(y.right)) + 1;

        return y;
    }

    // Insert node into AVL Tree
    private AVLNode insert(AVLNode node, int key) {
        // Step 1: Regular BST insert
        if (node == null)
            return new AVLNode(key);

        if (key < node.key)
            node.left = insert(node.left, key);
        else if (key > node.key)
            node.right = insert(node.right, key);
        else
            return node; // Duplicate keys not allowed

        // Step 2: Update height
        node.height = 1 + Math.max(height(node.left), height(node.right));

        // Step 3: Get balance factor
        int balance = getBalance(node);

        // Step 4: Balance tree if needed
        // Left Left Case
        if (balance > 1 && key < node.left.key)
            return rightRotate(node);

        // Right Right Case
        if (balance < -1 && key > node.right.key)
            return leftRotate(node);

        // Left Right Case
        if (balance > 1 && key > node.left.key) {
            node.left = leftRotate(node.left);
            return rightRotate(node);
        }

        // Right Left Case
        if (balance < -1 && key < node.right.key) {
            node.right = rightRotate(node.right);
            return leftRotate(node);
        }

        return node;
    }

    // Public method to insert key
    public void insert(int key) {
        root = insert(root, key);
    }

    // In-order traversal (sorted output)
    public void inorderTraversal() {
        inorderHelper(root);
        System.out.println();
    }

    private void inorderHelper(AVLNode node) {
        if (node != null) {
            inorderHelper(node.left);
            System.out.print(node.key + " ");
            inorderHelper(node.right);
        }
    }

    // Test insert operation
    public static void main(String[] args) {
        AVLTreeInsert avl = new AVLTreeInsert();

        // Insert values
        avl.insert(30);
        avl.insert(20);
        avl.insert(40);
        avl.insert(10);
        avl.insert(25);
        avl.insert(50);

        System.out.println("In-order traversal after insertions:");
        avl.inorderTraversal();
    }
}
