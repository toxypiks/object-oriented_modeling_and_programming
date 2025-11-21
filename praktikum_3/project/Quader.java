package project;

public class Quader
{
    private double laenge;
    private double breite;
    private double hoehe;

    public Quader(double laenge, double breite, double hoehe) throws GeometrischesObjektException {
        if (laenge < 0) {
            throw new GeometrischesObjektException("Quader: Parameter ");
        } else {
            this.laenge = laenge;
        }

        if (breite < 0) {
            throw new GeometrischesObjektException("Quader: Parameter ");
        } else {
            this.breite = breite;
        }

        if (hoehe < 0) {
            throw new GeometrischesObjektException("Quader: Parameter ");
        } else {
            this.hoehe = hoehe;
        }
    }

    public double getLaenge()
    {
        return this.laenge;
    }

    public double getBreite()
    {
        return this.breite;
    }

    public double getHoehe()
    {
        return this.hoehe;
    }

    public double getVolumen()
    {
        return this.laenge*this.breite*this.hoehe;
    }

    public double getOberflaeche()
    {
        return (2*this.laenge*this.breite) + (2*this.laenge*this.hoehe) + (2*this.breite*this.hoehe);
    }

    public String toString()
    {
        return "Würfel mit" + " Länge = " + this.laenge + " Breite = " + this.breite + " Höhe = " + this.hoehe + " Volumen = " + getVolumen() + " Oberfläche = " + getOberflaeche();
    }
}
