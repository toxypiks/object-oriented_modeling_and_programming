package project;

public class GeometrischeObjekteMain
{
    public static void main (String[] args)
    {
        try {
            GeometrischesObjekt objekt1 = new Quader(3,4,5);
            GeometrischesObjekt objekt2 = new Wuerfel(4);

            GeometrischeObjekte geometrischeObjekte = new GeometrischeObjekte();
            geometrischeObjekte.add(objekt1);
            geometrischeObjekte.add(objekt2);
            geometrischeObjekte.ausgeben();

        } catch (GeometrischesObjektException e) {
            System.out.println("Fehler: " + e.getMessage());
        }

    }
}
