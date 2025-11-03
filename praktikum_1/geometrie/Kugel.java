package geometrie;
import java.lang.Math;

public class Kugel {

    private double radius;

    public Kugel(double radius) {
        this.radius = Math.abs(radius);
    };

    public double getRadius()
    {
        return radius;
    }

    public double getDurchmesser()
    {
        return radius*2;
    }

    public double getVolumen()
    {
        return 4.0/3.0*Math.PI*Math.pow(radius,3);
    }

    public double getOberflaeche()
    {
        return 4*Math.PI*Math.pow(radius,2);
    }
}
