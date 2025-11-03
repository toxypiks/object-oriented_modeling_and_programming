package geometrie;

public class Kugeln {

    public static void main (String[] args) {

        Kugel kugel_eins = new Kugel(5.0);
        Kugel kugel_zwei = new Kugel(7.0);
        Kugel kugel_drei = new Kugel(-21);
        System.out.printf("Kugel 1 mit Radius =  %.0f, Durchmesser = %.0f, Volumen = %.0f und Oberfläche = %.0f.%n", kugel_eins.getRadius(), kugel_eins.getDurchmesser(), kugel_eins.getVolumen(), kugel_eins.getOberflaeche());
        System.out.printf("Kugel 2 mit Radius =  %.0f, Durchmesser = %.0f, Volumen = %.0f und Oberfläche = %.0f.%n", kugel_zwei.getRadius(), kugel_zwei.getDurchmesser(), kugel_zwei.getVolumen(), kugel_zwei.getOberflaeche());
        System.out.printf("Kugel 3 mit Radius =  %.0f, Durchmesser = %.0f, Volumen = %.0f und Oberfläche = %.0f.%n", kugel_drei.getRadius(), kugel_drei.getDurchmesser(), kugel_drei.getVolumen(), kugel_drei.getOberflaeche());
    }
}
