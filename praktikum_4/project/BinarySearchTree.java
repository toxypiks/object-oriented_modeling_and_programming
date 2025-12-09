package project;

public class BinarySearchTree {
    private BinarySearchTreeNode root;

    public BinarySearchTree() {}

    public void add(double key)
    {
        if (this.root == null) {
            this.root = new BinarySearchTreeNode();
            this.root.key = key;
        }
        else {
            this.root.add(key);
        }
    }

    public int getHeight() {
        if (this.root == null) {
            return 0;
        } else {
            return this.root.getHeight();
        }
    }
}
