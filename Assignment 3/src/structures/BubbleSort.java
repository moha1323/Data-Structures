package structures;

import sortspecs.SortMethod;

import java.util.ArrayList;
import java.util.List;

public class BubbleSort implements SortMethod {
    List<Integer> arr;

    public BubbleSort() {
        arr = new ArrayList<Integer> ();
    }

    public void add(int data){
        arr.add(data);
    }

    @Override
    public void sort(){
        int temp;
        for(int i = arr.size () - 1; i > 0; i--){
            for(int j = 0; j < i; j++){
                if(arr.get(j) > arr.get(j + 1)){
                    temp = arr.get(j);
                    arr.set(j,arr.get(j + 1));
                    arr.set(j + 1, temp);
                }
            }
        }
    }

    @Override
    public List getSortedResult() {
        List result = new ArrayList();
        for(int i = 0; i < arr.size (); i++){
            result.add(arr.get(i));
            System.out.println (result.get(i));
        }
        return result;
    }
}
