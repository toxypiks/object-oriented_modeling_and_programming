package project;

public class BinarySearchTree {
    private BinarySearchTreeNode root = null;

    public BinarySearchTree() {}

    public void add(double key)
    {
        root.add(key);
    }

    public int getHeight() {
        return root.getHeight();
    }
}
