package July12;

// Node class for AVL Tree
class AVLNode {
    int key, height;
    AVLNode left, right;

    public AVLNode(int key) {
        this.key = key;
        this.height = 1;
    }
}
