package interfaces;

import java.util.*;

@SuppressWarnings("all") // List is okay

// 3/3/19 -- removed convenience-only method "public void addAll(IndexableList newElements);"

public interface IndexableList extends BiIterable {
    //Accessing
    public Object get(int index);
    public void set(int index, Object newElement);

    //Adding
    public void add(Object newElement);				//Add a new element to the end of the list -- e.g. at index = size()
    public void addAll(List newElements);			//Add new elements to end of list (in order received)

    //Removing
    public Object remove(int index);				//Remove element at index, return element.
    public void clear(); 							//Remove all elements

    //Changing Order
    public void shuffle();							//Randomize order
    public void reverse();

    //Querying
    public boolean isEmpty();
    public int size();
    public List asList();
    public int indexOf(Object anElement);	//Returns lowest index of matching element (using "equals"), or -1 if no matches
    public boolean contains(Object anElement);	//Return true if we find match (using "equals")
    public IndexableList copyFromTo(int startIndex, int stopIndex);
		/*e.g. if we have [10, 20, 30, 40, 50, 60, 70, 80, 90, 100]
		then copyFromTo(1, 3) we would return [20, 30, 40]*/

}


