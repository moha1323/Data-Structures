package structures;

import java.util.List;

public class DequeTest1 {

    public static void main(String[] args){
        System.out.println("Deque Test 1");
        MyDeque deque = new MyDeque();

        System.out.println("\nAdded Elements to the Front");
        deque.addToFront(100);
        deque.addToFront(200);
        deque.addToFront(300);
        deque.addToFront(400);

        System.out.println("\nAdded Elements to the Back");
        deque.addToBack(100);
        deque.addToBack(200);
        deque.addToBack(300);
        deque.addToBack(400);

        System.out.println("\nGet Element at the Front");
        System.out.println(deque.getFront());

        System.out.println("\nGet Element at the back");
        System.out.println(deque.getBack());

        System.out.println("\nRemove Element at the Front");
        System.out.println(deque.removeFront());

        System.out.println("\nRemove Element at the Back");
        System.out.println(deque.removeBack());

        System.out.println("\nT or F: Is Deque Empty?");
        System.out.println(deque.isEmpty());

        System.out.println("\nSize of Deque");
        System.out.println(deque.size());

        System.out.println("\nCovert Deque to a List");
        List dequeList = deque.asList();
        for(int i = 0; i < dequeList.size (); i++){
            System.out.println(dequeList.get(i));
        }

        System.out.println("\nDisplay all elements in the Deque");
        deque.display();

    }
}
