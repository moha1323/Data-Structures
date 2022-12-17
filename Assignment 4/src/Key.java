import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Key<K> {
    List<K> key1 = new ArrayList<>(),
            key2 = new ArrayList<>(),
            key3 = new ArrayList<>(),
            key4 = new ArrayList<>(),
            key5 = new ArrayList<>(),
            key6 = new ArrayList<>();

    public Key() {

    }

    public Object createKey(int size){
        Random rand = new Random();
        Object k1, k2, k3, k4, k5, k6;
        Object key = null;
        do{
            k1 = rand.nextInt(size);
            k2 = rand.nextInt(size);
            k3 = rand.nextInt(size);
            k4 = rand.nextInt(size);
            k5 = rand.nextInt(size);
            k6 = rand.nextInt(size);
            if(!key1.contains(k1) && !key2.contains(k2) && !key3.contains(k3) && !key4.contains(k4) && !key5.contains(k5) && !key6.contains(k6)){
                key1.add((K) k1);
                key2.add((K) k2);
                key3.add((K) k3);
                key4.add((K) k4);
                key5.add((K) k5);
                key6.add((K) k6);
            }

        }while(key1.size () < size && key2.size () < size && key3.size () < size && key4.size () < size && key5.size () < size && key6.size () < size);

        for(int i = 0; i < size; i++){
            for(int j = 0; j < i; j++){
                for(int k = 0; k < j; k++){
                    for(int l = 0; l < k; l++){
                        for(int m = 0; m < l; m++){
                            for(int n = 0; n < m; n++){
                                key = key1.get(i) + "" + key2.get(j) + "" + key3.get(k) + "" + key4.get(l) + "" + key5.get(m) + "" + key6.get(n);
                            }
                        }
                    }
                }
            }
        }

        return key;
    }
}
