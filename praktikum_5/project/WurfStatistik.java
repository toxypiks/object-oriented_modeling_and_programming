package project;
import java.util.SortedMap;

public interface WurfStatistik<K,V> extends SortedMap<K,V>
{
    void wurf(K key);

}
