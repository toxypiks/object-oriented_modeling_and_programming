package project;
import java.util.Arrays;
import java.lang.Math;

public class BinarySearchTreeNode {

    private BinarySearchTreeNode left;
    private BinarySearchTreeNode right;
    public double key;

    public BinarySearchTreeNode() {}

    public void add(double new_key)
    {
        if (new_key > this.key) {
            if (this.right == null) {
                this.right = new BinarySearchTreeNode();
                this.right.key = new_key;
            }
            else {
                this.right.add(new_key);
            }
        }

        else if (new_key < this.key) {
            if (this.left == null) {
                this.left = new BinarySearchTreeNode();
                this.left.key = new_key;
            } else {
                this.left.add(new_key);
            }
        }
    }

    public int getHeight()
    {
        if (this.left == null && this.right == null) {
            return 1;
        }
        if (this.right == null) {
            return left.getHeight() + 1;
        }
        if (this.left == null) {
            return right.getHeight() + 1;
        }
        return Math.max(this.left.getHeight(), this.right.getHeight()) + 1;
    }
}
