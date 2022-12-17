package interfaces;

//All inherited from EnhancedIterator
//Leaving in-place (empty) as object users (assignment) expects it

public interface Iterator extends EnhancedIterator
{
    //Basic
    public Object next();
    public Object peek();
    public boolean hasNext();
}