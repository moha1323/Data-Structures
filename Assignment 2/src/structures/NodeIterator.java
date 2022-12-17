package structures;

import interfaces.Iterator;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class NodeIterator implements Iterator{
    Node head;
    int size;
    int position, direction;

    public NodeIterator(Node head, int currentPosition, int headOrTail) {
        this.head = head;
        position = currentPosition;
        direction = headOrTail;
    }

    @Override
    public Object next() {
        if(!hasNext ()) throw new NoSuchElementException();
        Object data = head.data;
        head = head.next;
        return data;
    }

    @Override
    public Object peek() {
        if(head == null)
            throw new NoSuchElementException();
        return head.data;
    }

    @Override
    public boolean hasNext() {
        return head == null;
    }

    @Override
    public void displayAll() {
        for(int i = 0; i < size; i++){
            System.out.println(head.data);
            head = head.next;
        }
    }

    @Override
    public boolean allEquals(Iterator other){
        return false;
    }

    @Override
    public boolean allEquals(List other) {
        return false;
    }

    @Override
    public List toList() {
        List result = new ArrayList();
        for(int i = 0; i < size; i++){
            result.add(head.data);
            head = head.next;
        }
        return result;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public int size() {
        return size;
    }

    public void setDirection(int direction) {
        this.direction = direction;
    }
}
