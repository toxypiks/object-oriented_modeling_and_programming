package project;

import java.util.List;
import java.util.ArrayList;

public class GeometrischeObjekte
{
    private final List<GeometrischesObjekt> geometrischeObjekte;

    public GeometrischeObjekte()
    {
        this.geometrischeObjekte = new ArrayList<GeometrischesObjekt>();
    }

    public boolean add(GeometrischesObjekt geometrischesObjekt)
    {
        return this.geometrischeObjekte.add(geometrischesObjekt);
    }

    private int getAnzahl()
    {
        if (this.geometrischeObjekte == null) {
            return 0;
        }
        int counter = 0;
        for (int i = 0; i < geometrischeObjekte.size(); ++i)
            {
                counter++;
            }
        return counter;
    }

    private double berechneGesamtesVolumen()
    {
        double totalVolume = 0;
        for (int i = 0; i < geometrischeObjekte.size(); ++i)
            {
                totalVolume += geometrischeObjekte.get(i).getVolumen();
            }
        return totalVolume;
    }

    private double berechneGesamteOberflaeche()
    {
        double totalSurface = 0;
        for (int i = 0; i < geometrischeObjekte.size(); ++i)
            {
                totalSurface += geometrischeObjekte.get(i).getOberflaeche();
            }
        return totalSurface;
    }

    public void ausgeben()
    {
        System.out.print("Anzahl geometrische Objekte in der Liste = " + getAnzahl() + "\n");
        for (int i = 0; i < geometrischeObjekte.size(); ++i)
            {
                System.out.println(geometrischeObjekte.get(i).toString());
            }
        System.out.print(" gesamtes Volumen = " + berechneGesamtesVolumen());
        System.out.print(" gesamte Oberfläche = " + berechneGesamteOberflaeche());
    }

}
