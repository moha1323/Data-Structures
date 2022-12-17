package hash;

public class ObjectElement<K,V> {
    K key;
    V data;


    public ObjectElement(K key, V data) {
        this.key = key;
        this.data = data;;
    }

    public K getKey() {
        return key;
    }

    public V getData() {
        return data;
    }
}
