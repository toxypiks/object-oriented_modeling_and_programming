package project;

public class BinarySearchTree {
    private BinarySearchTreeNode root = null;

    public BinarySearchTree() {}

    public void add(double key)
    {
        if (this.root == null) {
            this.root = new BinarySearchTreeNode();
        }
        this.root.add(key);
    }

    public void print_tree()
    {
        root.print_tree();
    }

    public int getHeight() {
        return root.getHeight();
    }
}
