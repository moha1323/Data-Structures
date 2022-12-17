package hash;

public class HashLookupPrototype implements LookupPrototype {
    int listSize;
    Object[] list;

    public HashLookupPrototype(int size) {
        list = new Object[size];
        listSize = size;
    }

    @Override
    public int size() {
        int counter = 0;
        for(int i = 0; i < listSize; i++) {
            if(list[i] != null){
                counter++;
            }
        }
        return counter;
    }

    @Override
    public Object get(Object key) {
        if(key != null) {
            int index = (Math.abs(key.hashCode() % listSize));
            return list[index];
        }
        return null;
    }

    @Override
    public Object put(Object key, Object value) {
        int index = Math.abs(key.hashCode() % listSize);
        Object element = null;
        if(list[index] != null) {
            element = list[index];
        }
        list[index] = value;
        return element ;
    }

}