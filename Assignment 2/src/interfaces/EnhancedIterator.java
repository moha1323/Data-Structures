package interfaces;

import java.util.List;

/*
	next() -- return next data (may be null if hasNext == false), advance iterator to next
	peek() -- return next data (may be null if hasNext == false)
	hasNext() -- return true if iterator is not at end (has a next data)

	Convenience methods
		Note that these all work from the (current position (cp) in the iterator --
		e.g. generally you would use them with a "new" iterator (with cp at "start")

		displayAll() -- display all elements (from current position)
		allEquals()-- return true if all elements in this iterator are equal to all in other.
		toList() -- collect all data into a List and return it
		size() -- return size of iteration (from cp to end)

	//Note: displayAll, allEquals, toList, and size all assume the Iterator is at the start
*/

@SuppressWarnings("all") // List is okay

public interface EnhancedIterator {

    //Convenience methods (especially for testing)
    public void displayAll();
    public boolean allEquals(Iterator other);
    public boolean allEquals(List other);
    public List toList();
    public int size();
}


