package project;
import java.util.TreeMap;
import java.lang.Math;

public class WurfStatistikImplementation extends TreeMap<Integer, Integer> implements WurfStatistik
{
    public WurfStatistikImplementation() {
        // TreeMap constructor with Comparator functional interface
        // Math.signum returns -1.0 if b - a < 0 and 1.0 if b - a > 0 and 0.0 if b = a
        // results in descending order of keys in Treemap
        super((a, b) -> (int)Math.signum(b - a));
    }
    public void wurf(Integer augenzahl)
    {
        put(augenzahl, getOrDefault(augenzahl, 0) +1);
    }
}
