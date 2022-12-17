package hash;

public interface LookupPrototype {
    //Return size of Lookup (how many "slots")
    public int size();

    //Return Object at "key", or null if not found
    public Object get(Object key);

    //Put "value" at "key", replace if already present
    //Return previous value at key (or null if none)
    public Object put(Object key, Object value);
}
