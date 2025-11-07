package project;

import java.lang.Math;

public class PythagoraeischeZahlentripel
{
    private int[] numbers_to_check;
    private int[] squared_numbers_to_check;
    private int found_zahlentripel;

    public PythagoraeischeZahlentripel(final int minimum, final int maximum)
    {
        this.numbers_to_check = UtilsForArrays.createIntArray(minimum, maximum);
        this.squared_numbers_to_check = UtilsForArrays.quadriere(this.numbers_to_check);
        this.found_zahlentripel = 0;
    }

    public boolean istQuadratzahl(int number)
    {
        if (number < 0) {
            return false; //a squared number can not be negative
        }
        int sqrt_of_number = (int) Math.sqrt(number);
        return sqrt_of_number*sqrt_of_number == number;
    }

    public void berechne()
    {

    }

    public void gibAnzahlAus()
    {
        System.out.printf("Es wurden %d Pythagoräische Zahlentripel gefunden.\n", this.found_zahlentripel);
    }

    public static void main (String[] args)
    {
        System.out.print("Hello from Pytagoras\n");
    }
}
