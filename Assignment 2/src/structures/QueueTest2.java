package structures;

import java.util.List;

public class QueueTest2 {

    public static void main(String[] args){
        System.out.println("Queue Test 2");
        MyQueue queue = new MyQueue();

        System.out.println("\nAdded Elements");
        queue.enqueue(100);
        queue.enqueue(60);
        queue.enqueue(70);
        queue.enqueue(80);
        queue.enqueue(90);

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
