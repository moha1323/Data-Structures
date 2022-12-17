package interfaces;

import java.util.*;

@SuppressWarnings("all") // List is okay

// 3/3/19 -- removed convenience method enqueueAll

public interface Queue extends UniIterable
{
    //Adding
    public void enqueue(Object newElement);		//add element to back/rear/tail

    //Getting
    public Object dequeue();	//remove and return (from front/head)
    public Object peek();		//peek (from front/head)

    //Querying
    public int size();
    public boolean isEmpty();
    public List asList();

    //Displaying
    public void display();	//Show all elements using toString (sent to "each" element)
}





