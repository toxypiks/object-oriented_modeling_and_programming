package project;

public class BinarySearchTreeNode {

    private BinarySearchTreeNode left = null;
    private BinarySearchTreeNode right = null;
    private double key = 0;

    public BinarySearchTreeNode() {}

    public void add(double key)
    {
        if (this.left == null && this.right == null) {
            this.key = key;
            return;
        }
        else if (key < this.key) {
            if (this.left == null) {
                this.left = new BinarySearchTreeNode();
                this.left.add(key);
            }
            else {
                this.left.add(key);
            }
        }
        else if (key > this.key) {
            if (this.right == null) {
                this.right = new BinarySearchTreeNode();
                this.right.add(key);
            }
            else {
                right.add(key);
            }
        }
    }

    public void print_tree()
    {
        if (this.left == null && this.right == null && this.key == 0) {
            return;
        }
        if (this.left != null) {
            this.left.print_tree();
        }

        System.out.printf("%f\n", this.key);

        if (this.right != null) {
            this.right.print_tree();
        }
    }

    public int getHeight()
    {
        //return height of tree
        return 0;
    }
}
