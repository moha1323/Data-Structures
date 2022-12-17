package hash;

public interface Lookup<K, V> {
    //Return number of "buckets" hash structure has
    public int bucketCount();

    //Return value at key
    public V get(K key);

    //Put "value" at "key", replace if already present
    //Return previous value at key (or null if none)
    public Object put(K key, V value);

    //Remove key and value at "key"
    public V removeKey(K key);
}