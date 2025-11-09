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
        double sqrt_of_number = Math.floor(Math.sqrt(number));
        return sqrt_of_number*sqrt_of_number == number;
    }

    public void berechne()
    {
        for(int i = 0; i < this.squared_numbers_to_check.length - 1; i++) {
            for(int j = 0; j < this.squared_numbers_to_check.length; j++) {
                int differenz = Math.abs(squared_numbers_to_check[j] - squared_numbers_to_check[i]);
                    if(istQuadratzahl(differenz) && differenz > squared_numbers_to_check[i]) {
                        System.out.printf("\nInhalt des Arrays an der Position i: %d\n", squared_numbers_to_check[i]);
                        System.out.printf("Inhalt des Arrays an der Position j: %d\n", squared_numbers_to_check[j]);
                        System.out.printf("differenz = %d\n", differenz);
                        System.out.print("Ausgabe:\n");
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
        System.out.printf("\nEs wurden %d Pythagoräische Zahlentripel gefunden.\n", this.found_zahlentripel);
    }
}
