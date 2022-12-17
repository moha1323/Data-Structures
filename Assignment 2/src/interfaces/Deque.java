package interfaces;

import java.util.List;

@SuppressWarnings("all") // List is okay

// 3/3/19 -- removed convenience-only methos addAllToFront, addAllToBack

public interface Deque extends BiIterable
{
    //Adding
    public void addToFront(Object newElement);		//front or head
    public void addToBack(Object newElement);		//back or rear or tail

    //Getting
    public Object getFront();	//Return object at front (do not remove)
    public Object getBack();	//Return object at back (do not remove)

    //Removing
    public Object removeFront();	//Remove and return object at front
    public Object removeBack();		//Remove and return object at front

    //Querying
    public List asList();
    public int size();
    public boolean isEmpty();

    //Displaying
    public void display();	//Show all elements using toString (sent to "each" element)
}



