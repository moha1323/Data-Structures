package structures;

import com.sun.org.apache.xpath.internal.axes.OneStepIterator;
import interfaces.Iterator;
import interfaces.Stack;

import java.util.ArrayList;
import java.util.List;

public class StackList implements Stack {
    List list;
    ListIterator iter;
    int currentPosition = 0;

    public StackList() {
        list = new ArrayList();
        iter = new ListIterator(list,currentPosition,1);
    }

    @Override
    public void push(Object newElement) {
        List holder = new ArrayList();
        if(list.isEmpty ()){
            list.add(newElement);
        } else {
            holder.addAll(list);
            list.clear();
            list.add(newElement);
            list.addAll(holder);
        }
    }

    @Override
    public Object pop() {
        Object element = list.get(0);
        list.remove(0);
        return element;
    }

    @Override
    public Object peek() {
        return list.get(0);
    }

    @Override
    public int size() {
        return list.size();
    }

    @Override
    public boolean isEmpty() {
        return list.isEmpty();
    }

    @Override
    public List asList() {
        return list;
    }

    @Override
    public Iterator toIterator() {
        return iter;
    }
}
