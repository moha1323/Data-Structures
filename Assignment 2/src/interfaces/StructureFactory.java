package interfaces;

/*
In all cases below return a new (empty) data structure
for each method.

Note that you have two similar methods for some
data structure types.
E.g. newBag and newBag2.
In that case please different implementations for each of these.
In the next assignment we will do actual comparisons
to see how it lines up with our expected Big-O analysis

3/3/19 -- Changed method names for clarification (e.g. "newStack" to "newLinkedStack")
*/

public interface StructureFactory {

    public Stack newLinkedStack();
    public Queue newLinkedQueue();
    public IndexableList newLinkedIndexableList();
    public Bag newLinkedBag();
    public Deque newLinkedDeque();

    public Stack newArrayedStack();
    public IndexableList newArrayedList();
    public Bag newArrayedBag();
    public Deque newArrayedDeque();

}





