package structures;

import java.util.List;

public class QueueTest1 {

    public static void main(String[] args){
        System.out.println("Queue Test 1");
        MyQueue queue = new MyQueue();

        System.out.println("\nAdded Elements");
        queue.enqueue(6);
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);

        System.out.println("\nRemove Element @ Head");
        System.out.println(queue.dequeue());

        System.out.println("\nGet Element @ Head");
        System.out.println(queue.peek());

        System.out.println("\nT or F: Is Queue Empty?");
        System.out.println(queue.isEmpty());

        System.out.println("\nSize of Queue");
        System.out.println(queue.size());

        System.out.println("\nCovert Queue to a List");
        List queueList = queue.asList();
        for(int i = 0; i < queueList.size (); i++){
            System.out.println(queueList.get(i));
        }

        System.out.println("\nDisplay all elements in the Queue");
        queue.display();

    }
}
