package project;
import java.util.TreeMap;
import java.lang.Math;

public class WurfStatistikImplementation extends TreeMap<Integer, Integer> implements WurfStatistik
{
    public WurfStatistikImplementation() {
        super((a, b) -> (int)Math.signum(b - a));
    }
    public void wurf(Integer augenzahl)
    {
        put(augenzahl, getOrDefault(augenzahl, 0) +1);
    }
}
