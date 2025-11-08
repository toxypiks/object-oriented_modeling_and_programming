package project;
import java.util.Arrays;
import java.lang.Math;

/**
 * Methods to create and print arrays for executing Pythagorean triple algorithm
 * @author Toxypiks
 */
public class UtilsForArrays
{
    /**
     * Creates array of ascending integers from a minimum index to a maximum index
     *
     * @param minimum The minimum index
     * @param maximum The maximum index
     * @return the array of ascending integers
     */
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

    /**
     * Creates array of squared integers given by input array
     *
     * @param array_to_square Input integer array
     * @return squared_array Output array of squared integers
     */
    public static int[] quadriere(int[] array_to_square)
    {
        int[] squared_array = new int[array_to_square.length];
        for(int i = 0; i < squared_array.length; ++i)
            {
                squared_array[i] = (int) Math.pow(array_to_square[i],2);
            }
        return squared_array;
    }

    /**
     * Prints array of integers
     *
     * @param array_to_print Array of integers to be printed
     */
    public static void arrayInhaltAusgeben(int[] array_to_print)
    {
        System.out.println(Arrays.toString(array_to_print));
    }
}
