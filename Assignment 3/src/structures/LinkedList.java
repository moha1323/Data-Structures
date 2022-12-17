package structures;

import java.util.*;
import java.util.NoSuchElementException;

public class LinkedList {
    Node head;

    public LinkedList(){
        head = null;
    }

    public void addToHead(int data){
        head = new Node(data, head);
    }

    public int getHead(){
        if(head == null)
            throw new NoSuchElementException();
        return head.data;
    }

    public int removeHead(){
        int temp = getHead ();
        head = head.next;
        return temp;
    }

    public void addToTail(int data){
        if(head == null)
            addToHead(data);
        else{
            Node temp = head;
            while(temp.next != null)
                temp = temp.next;
            temp.next = new Node(data,null);
        }
    }

    public int getTail(){
        if(head == null)
            throw new NoSuchElementException();
        Node temp = head;
        while(temp.next != null)
            temp = temp.next;
        return temp.data;
    }

    public int get(int position){
        if(head == null)
            throw new IndexOutOfBoundsException();
        Node temp = head;
        for(int i = 0; i < position; i++)
            temp = temp.next;
        if(temp == null)
            throw new IndexOutOfBoundsException();
        return temp.data;
    }

    public int size() {
        int size = 0;
        for(Node temp = head; temp.next != null; temp = temp.next)
            size++;
        return size;
    }

    public List<Integer> toList(LinkedList linkedList){
        List<Integer> collect = new ArrayList<Integer>();
        for(int i = 0; i < linkedList.size (); i++){
            collect.add(linkedList.get(i));
        }
        return collect;
    }

    public void clear(){
        head = null;
    }

    public boolean isEmpty(){
        return head == null;
    }

}
