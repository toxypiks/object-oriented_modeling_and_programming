package project;

public class Player
{
    private String name;
    private int number_rolls;
    private WurfStatistik wurfstatistik;

    public Player(String name, int number_rolls)
    {
        this.name = name;
        this.number_rolls = number_rolls;
        this.wurfstatistik = new WurfStatistikImplementation();
    }

    public Player play()
    {
        for(int i = 0; i < number_rolls; i++)
            {
                // Math.random >= 0.0 and < 1.0 * 6 = >= 0.0 and < 6.0 + 1 to include 6 and start from 1
                int roll = (int) (Math.floor(Math.random() * 6) + 1);
                this.wurfstatistik.wurf(roll);
            }
        return this;
    }

    public String getName()
    {
        return this.name;
    }

    public WurfStatistik getWurfStatistik()
    {
        return this.wurfstatistik;
    }

    @Override
    public String toString()
    {
        return "Player name: " + this.name + " Wurfstatistik: " + this.wurfstatistik.toString() + "\n";
    }
}
