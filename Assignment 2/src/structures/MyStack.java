package structures;

import interfaces.Iterator;
import interfaces.Stack;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class MyStack implements Stack {
    Node head;
    NodeIterator iter;
    int currentPosition = 0;
    int x;

    public MyStack() {
        head = null;
        iter = new NodeIterator(head,currentPosition,1);
    }

    @Override
    public void push(Object newElement) {
        head = new Node(newElement, head);
        x++;
    }

    @Override
    public Object pop() {
        if(isEmpty ()) throw new NoSuchElementException ();
        Object data = head.data;
        head = head.next;
        x--;
        return data;
    }

    @Override
    public Object peek() {
        if(isEmpty ()) throw new NoSuchElementException ();
        return head.data;
    }

    @Override
    public int size() {
        iter.setSize(x);
        return x;
    }

    @Override
    public boolean isEmpty() {
        return head == null;
    }

    @Override
    public List asList() {
        List result = new ArrayList ();
        for(int i = 0; i < x; i++){
            result.add(head.data);
            head = head.next;
        }
        return result;
    }

    @Override
    public Iterator toIterator() {
        return iter;
    }
}
