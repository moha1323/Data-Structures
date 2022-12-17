package structures;

import interfaces.IndexableList;
import interfaces.Iterator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MyIndexableList implements IndexableList{
    List list;
    int currentPosition = 0;
    ListIterator iter;

    public MyIndexableList() {
        list = new ArrayList<Integer> ();
        iter = new ListIterator(list,currentPosition,1);
    }

    @Override
    public Object get(int index) {
        return list.get(index);
    }

    @Override
    public void set(int index, Object newElement) {
        list.set(index, newElement);
    }

    @Override
    public void add(Object newElement) {
        list.add(newElement);
    }

    @Override
    public void addAll(List newElements) {
        list.addAll(newElements);
    }

    @Override
    public Object remove(int index) {
        return list.remove(index);
    }

    @Override
    public void clear() {
        list.clear();
    }

    @Override
    public void shuffle() {
        Collections.shuffle(list);
    }


    @Override
    public void reverse() {
        Collections.reverse(list);
    }

    @Override
    public boolean isEmpty() {
        return iter.hasNext();
    }

    @Override
    public int size() {
        return iter.size();
    }

    @Override
    public List asList() {
        return iter.toList();
    }

    @Override
    public int indexOf(Object anElement) {
        return list.indexOf(anElement);
    }

    @Override
    public boolean contains(Object anElement) {
        return list.contains(anElement);
    }

    @Override
    public IndexableList copyFromTo(int startIndex, int stopIndex) {
        MyIndexableList newIndexableList = new MyIndexableList();
        for(int i = startIndex; i <= stopIndex; i++){
            if(startIndex <= stopIndex) {
                newIndexableList.add(list.get(startIndex));
                startIndex++;
            }
        }
        return newIndexableList;
    }

    @Override
    public Iterator toBackwardIterator() {
        iter.setDirection(-1);
        return iter;
    }

    @Override
    public Iterator toIterator() {
        iter.setDirection(1);
        return iter;
    }
}
