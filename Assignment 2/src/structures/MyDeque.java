package structures;

import interfaces.Deque;
import interfaces.Iterator;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class MyDeque implements Deque {
    Node head;
    NodeIterator iter;
    int currentPosition = 0;
    int x = 0;
    List result = new ArrayList ();
    StringBuilder s = new StringBuilder ();

    public MyDeque() {
        head = null;
        iter = new NodeIterator(head,currentPosition,1);
    }

    @Override
    public void addToFront(Object newElement) {
        head = new Node(newElement, head);
        x++;
    }

    @Override
    public void addToBack(Object newElement) {
        if(head == null)
            addToFront(newElement);
        else{
            Node temp = head;
            while(temp.next != null)
                temp = temp.next;
            temp.next = new Node(newElement,null);
        }
        x++;
    }

    @Override
    public Object getFront() {
        if(head == null)
            throw new NoSuchElementException ();
        return head.data;
    }

    @Override
    public Object getBack() {
        if(head == null)
            throw new NoSuchElementException();
        Node temp = head;
        while(temp.next != null)
            temp = temp.next;
        return temp.data;
    }

    @Override
    public Object removeFront() {
        Object element = getFront();
        head = head.next;
        x--;
        return element;
    }

    @Override
    public Object removeBack() {
        Object element = getBack();
        Node temp = head;
        while(temp.next != null)
            temp = temp.next;
        temp.next = null;
        x--;
        return element;
    }

    @Override
    public List asList() {
        dataCollection();
        return result;
    }

    @Override
    public int size() {
        return x;
    }

    @Override
    public boolean isEmpty() {
        return head == null;
    }

    @Override
    public void display() {
        System.out.println(s.toString ());
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
