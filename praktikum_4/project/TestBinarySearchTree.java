package project;

public class TestBinarySearchTree
{
    public static void main (String[] args)
    {
        System.out.println("Hello from new project");

        BinarySearchTree my_tree = new BinarySearchTree();
        my_tree.add(23);
        my_tree.add(4);
        my_tree.add(50);
        my_tree.print_tree();
    }
}
