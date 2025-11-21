package project;

import java.lang.Math;

public class Wuerfel implements GeometrischesObjekt
{
    private double seitenlaenge;

    public Wuerfel(double seitenlaenge) throws GeometrischesObjektException {
        if(seitenlaenge < 0) {
            throw new GeometrischesObjektException("Wuerfel: Parameter seitenlaenge < 0");
            //TODO collection improve message
        }
        else {
            this.seitenlaenge = seitenlaenge;
        }
    }
    public double getSeitenlaenge()
    {
        return this.seitenlaenge;
    }

    @Override
    public double getVolumen()
    {
        return Math.pow(this.seitenlaenge,3);
    }

    @Override
    public double getOberflaeche()
    {
        return 6 * Math.pow(this.seitenlaenge, 2);
    }

    @Override
    public String toString()
    {
        return ("Würfel mit " + "Seitenlänge = " + this.seitenlaenge + " Volumen = " + getVolumen() + " Oberfläche = " + getOberflaeche() + "\n");
    }
}
