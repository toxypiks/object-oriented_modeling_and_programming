package project;
import java.util.Arrays;
import java.lang.Math;

public class UtilsForArrays
{

    public static int[] createIntArray(int minimum, int maximum)
    {
        int[] new_array = new int[maximum - minimum + 1];
        for(int i = 0; i < new_array.length; i++)
            {
                new_array[i] = minimum;
                minimum++;
            }
        return new_array;
    }

    public static int[] quadriere(int[] array_to_square)
    {
        int[] squared_array = new int[array_to_square.length];
        for(int i = 0; i < squared_array.length; ++i)
            {
                squared_array[i] = (int) Math.pow(array_to_square[i],2);
            }
        return squared_array;
    }

    public static void arrayInhaltAusgeben(int[] array_to_print)
    {
        System.out.println(Arrays.toString(array_to_print));
    }
}
