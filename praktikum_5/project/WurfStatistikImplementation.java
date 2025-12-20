package project;
import java.util.TreeMap;

public class WurfStatistikImplementation extends TreeMap<Integer, Integer> implements WurfStatistik
{
    public void wurf(Integer augenzahl)
    {
        put(augenzahl, getOrDefault(augenzahl, 0) +1);
    }
}
