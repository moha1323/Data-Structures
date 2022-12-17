package interfaces;

import java.util.*;

@SuppressWarnings("all") // List is okay

public interface Bag extends UniIterable
{
    //Adding
    public void add(Object newElement);
    public void addAll(List newElements);

    //Getting
    public Object any();	//Returns any elment (or null for empty case)

    //Removing
    public Object remove(Object anElement);		//Remove any match (using "equals"), if match is found
    public void clear(); 	//Remove all elements

    //Querying
    public int size();
    public boolean isEmpty();
    public boolean contains(Object anElement);	//Return true if we find match (using "equals")
    public List asList();

    //Displaying
    public void display();	//Show all elements using toString (sent to "each" element)
}





