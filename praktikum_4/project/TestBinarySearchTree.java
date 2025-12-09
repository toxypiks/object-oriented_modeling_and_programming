package project;

public class TestBinarySearchTree
{
    public static void main (String[] args)
    {
        BinarySearchTree tree_one = new BinarySearchTree();
        tree_one.add(50.0);
        tree_one.add(25.0);
        tree_one.add(75.0);
        tree_one.add(12.5);
        tree_one.add(87.5);
        tree_one.add(37.5);
        tree_one.add(62.5);

        System.out.printf("Height of tree one: %d\n", tree_one.getHeight());

        BinarySearchTree tree_two = new BinarySearchTree();
        tree_two.add(12.5);
        tree_two.add(25.0);
        tree_two.add(37.5);
        tree_two.add(50.0);
        tree_two.add(62.5);
        tree_two.add(75.0);
        tree_two.add(87.5);

        System.out.printf("Height of tree two: %d\n", tree_two.getHeight());
    }
}
