package project;

public class Player
{
    private String name;
    private int anzahl_wuerfe;
    private WurfStatistik wurfStatistik;

    public Player(String name, int anzahl_wuerfe)
    {
        this.name = name;
        this.anzahl_wuerfe = anzahl_wuerfe;
        this.wurfStatistik = new WurfStatistikImplementation();
    }

    public Player play()
    {
        for(int i = 0; i < anzahl_wuerfe; i++)
            {
                // Math.random >= 0.0 and < 1.0 * 6 = >= 0.0 and < 6.0 + 1 to include 6 and start from 1
                int roll = (int) (Math.floor(Math.random() * 6) + 1);
                this.wurfStatistik.wurf(roll);
            }
        return this;
    }

    public String getName()
    {
        return this.name;
    }

    public WurfStatistik getWurfStatistik()
    {
        return this.wurfStatistik;
    }

    @Override
    public String toString()
    {
        return "Name: " + this.name + " Wurfstatistik: " + this.wurfStatistik.toString() + "\n";
    }
}
