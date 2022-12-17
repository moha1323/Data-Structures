package structures;

import interfaces.Iterator;
import interfaces.Queue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class QueueList implements Queue{
    List list;
    ListIterator iter;
    int currentPosition = 0;


    public QueueList() {
        list = new ArrayList();
        iter = new ListIterator(list,currentPosition,1);
    }


    @Override
    public void enqueue(Object newElement) {
        list.add(newElement);
    }

    @Override
    public Object dequeue() {
        Object obj = list.get(0);
        list.remove(list.get(0));
        return obj;
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
        return list.isEmpty ();
    }

    @Override
    public List asList() {
        return list;
    }

    @Override
    public void display() {
        for(int i = 0; i < list.size(); i++){
            System.out.println(list.get(1));
        }
    }

    @Override
    public Iterator toIterator() {
        return iter;
    }
}
