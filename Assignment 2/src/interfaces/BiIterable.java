
package interfaces;

/*
The idea of iterating in two directions. 
We extend "UniIterable" and we add a "reverse" iteration traversal direction.
	asBackwardIterator()

When a class implements BiDirectionalIterable it will
implement asIterator (forward is default/implied)
and asBackwardIterator.

For example,
	Given a simple ordered collection:
		A, B, C, D

	- If we asked for an iterator (default/forward).
	We would expect the iterator to visit A-B-C-D.

	- If we asked for a backward iterator we would expect
	the iterator to visit D-C-B-A.
	
3/3/19 -- changed "as" to "to" in "toBackwardIterator"  

*/

public interface BiIterable extends UniIterable
{
    public Iterator toBackwardIterator();
}