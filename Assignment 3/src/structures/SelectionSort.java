package structures;

import sortspecs.SortMethod;

import java.util.ArrayList;
import java.util.List;

public class SelectionSort implements SortMethod{
    List<Integer> arr;

    public SelectionSort() {
       arr = new ArrayList<Integer>();
    }

    public void add(int data){
        arr.add(data);
    }

    @Override
    public void sort() {
        for(int i = 0; i < arr.size (); i++){
            int min = i;
            for(int j = i + 1; j < arr.size(); j++){
                if(arr.get(j) < arr.get(min)){
                    min = j;
                }
            }
            int temp = arr.get(min);
            arr.set(min,arr.get(i));
            arr.set(i,temp);
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
