package structures;

import interfaces.Iterator;
import interfaces.Queue;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class MyQueue implements Queue {
    Node head;
    NodeIterator iter;
    int currentPosition = 0;
    int x = 0;
    List result = new ArrayList ();
    StringBuilder s = new StringBuilder ();

    public MyQueue() {
        head = null;
        iter = new NodeIterator(head,currentPosition,1);
    }

    @Override
    public void enqueue(Object newElement) {
        if(head == null){
            head = new Node(newElement, head);
        } else {
            Node temp = head;
            while (temp.next != null)
                temp = temp.next;

            temp.next = new Node (newElement, null);
        }
        x++;
    }

    @Override
    public Object dequeue() {
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
        dataCollection();
        return result;
    }

    @Override
    public void display() {
        System.out.println(s.toString());
    }

    public void dataCollection(){
        for (int i = 0; i < x; i++) {
            s.append (head.data);
            result.add(head.data);
            s.append (' ');
            head = head.next;
        }
    }

    @Override
    public Iterator toIterator() {
        return iter;
    }
}
