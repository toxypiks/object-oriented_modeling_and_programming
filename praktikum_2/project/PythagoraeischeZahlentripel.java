package project;
import java.lang.Math;

public class PythagoraeischeZahlentripel
{
    private int[] numbers_to_check;
    private int[] squared_numbers_to_check;
    private int found_zahlentripel;

    public PythagoraeischeZahlentripel(int minimum, int maximum)
    {
        this.numbers_to_check = UtilsForArrays.createIntArray(minimum, maximum);
        this.squared_numbers_to_check = UtilsForArrays.quadriere(this.numbers_to_check);
        System.out.print("Squared numbers to check for Pythagorean triples: \n");
        UtilsForArrays.arrayInhaltAusgeben(this.squared_numbers_to_check);
        System.out.print("\nFound triples: \n");
        berechne();
    }

    private boolean istQuadratzahl(int number)
    {
        if (number < 0) {
            return false; //a squared number can not be negative
        }
        int sqrt_of_number = (int) Math.floor(Math.sqrt(number));
        return sqrt_of_number*sqrt_of_number == number;
    }

    private void berechne()
    {
        for(int i = 0; i < this.squared_numbers_to_check.length - 1; i++) {
            for(int j = 0; j < this.squared_numbers_to_check.length; j++) {
                int differenz = Math.abs(squared_numbers_to_check[j] - squared_numbers_to_check[i]);
                    if(istQuadratzahl(differenz) && differenz > squared_numbers_to_check[i]) {
                        System.out.printf("%.0f^2 + %.0f^2 = %.0f^2\n",
                                          Math.sqrt(squared_numbers_to_check[i]),
                                          Math.sqrt(differenz),
                                          Math.sqrt(squared_numbers_to_check[j]));
                        this.found_zahlentripel++;
                    }
            }
        }
    }

    public void gibAnzahlAus()
    {
        System.out.printf("\nIn total %d Pythagorean triples were found.\n", this.found_zahlentripel);
    }
}
