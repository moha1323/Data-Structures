package hash;


public class HashLookup<K,V> implements Lookup<K,V> {
    int listSize;
    Object[] objectList;

    public HashLookup(int size) {
        objectList = new Object[size];
        this.listSize = size;
    }

    @Override
    public int bucketCount() {
        int counter = 0;
        for(int i = 0; i < listSize; i++) {
            if(objectList[i] != null){
                counter++;
            }
        }
        return counter;
    }

    @Override
    public V get(K key) {
        if(key != null){
            int index = Math.abs(key.hashCode() % listSize);
            if(objectList[index] != null){
                return (V)objectList[index].toString();
            }
        }
        return null;
    }

    @Override
    public Object put(K key, V value) {
        Object element = null;
        int index = Math.abs(key.hashCode() % listSize);
        if(key != null){
            ObjectElement obj = new ObjectElement(key,value);
            if(objectList[index] == null){
                objectList[index] = obj.getData();
            } else {
                element = objectList[index];
                objectList[index] = obj;
            }
        }
        return element;
    }

    @Override
    public V removeKey(K key) {
        V element = null;
        if(key != null){
            int index = Math.abs(key.hashCode() % listSize);
            if(objectList[index] != null){
                element = (V) objectList[index];
                objectList[index] = null;
            }
        }
        return element;
    }

}
