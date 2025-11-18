package project;

public class PythagoraeischeZahltripelMain
{

    public static void main (String[] args)
    {
        PythagoraeischeZahlentripel triple_eins = new PythagoraeischeZahlentripel(1, 1000);
        triple_eins.gibAnzahlAus();

        PythagoraeischeZahlentripel triple_zwei = new PythagoraeischeZahlentripel(1001, 2000);
        triple_zwei.gibAnzahlAus();
    }
}
