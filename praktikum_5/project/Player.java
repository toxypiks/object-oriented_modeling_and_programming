package project;

import java.util.Iterator;
import java.util.Map;

public class Player
{
    private String name;
    private int anzahlWuerfe;
    private WurfStatistik wurfStatistik;

    public Player(String name, int anzahlWuerfe)
    {
        this.name = name;
        this.anzahlWuerfe = anzahlWuerfe;
        this.wurfStatistik = new WurfStatistikImplementation();
    }

    public Player play()
    {
        for(int i = 0; i < anzahlWuerfe; i++)
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
        String result = this.name + ":\n";

        Iterator<Map.Entry<Integer, Integer>> it =
            wurfStatistik.entrySet().iterator();

        while (it.hasNext()) {
            Map.Entry<Integer, Integer> entry = it.next();
            result += entry.getKey() + ": " + entry.getValue() + "\n";
        }

        return result;
    }
}
