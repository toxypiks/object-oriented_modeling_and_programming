package project;

public class GeometrischeObjekteMain
{
    public static void main (String[] args)
    {
        GeometrischeObjekte geometrischeObjekte = new GeometrischeObjekte();
        try {
            GeometrischesObjekt objekt1 = new Quader(3,4,5);
            geometrischeObjekte.add(objekt1);

        } catch (GeometrischesObjektException e) {
            System.out.println(e.getMessage());
        }
        try {
            GeometrischesObjekt objekt2 = new Wuerfel(-4);
            geometrischeObjekte.add(objekt2);

        } catch (GeometrischesObjektException e) {
            System.out.println("Error: " + e.getMessage());
        }
        geometrischeObjekte.ausgeben();

    }
}
