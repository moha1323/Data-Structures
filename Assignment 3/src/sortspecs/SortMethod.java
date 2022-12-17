package sortspecs;

import java.util.List;

/*
	sort()

		No method params, not return value.

		This method does the sort.

	resultAsDataStructure()

		Return the result as a data structure.

		If your result is a Java List, that's fine, just construct
		a IndexableList (from the Java List).

		If your result is a linked list, that works also, just
		return it (your linked list should implement the "ListDs" interface).
 */


public interface SortMethod {

    public void sort();
    public List getSortedResult();

}
