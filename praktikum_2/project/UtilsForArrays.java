package project;
import java.util.Arrays;

public class UtilsForArrays {

    public static int[] createIntArray(int minimum, int maximum) {
        int[] new_array = new int[maximum - minimum + 1];
        int start = minimum;
        for(int i = 0; i < new_array.length; i++)
            {
                new_array[i] = start;
                start++;
            }
        return new_array;
    }

    public static void main (String[] args) {
        int[] my_array = UtilsForArrays.createIntArray(2, 7);
        System.out.println(Arrays.toString(my_array));
    }
}
