package interfaces;
import java.util.List;

@SuppressWarnings("all") // List is okay

// 3/3/19 -- removed convenience-only method "pushAll"

public interface Stack extends UniIterable
{
    //Adding
    public void push(Object newElement);	//adds new top element

    //Getting
    public Object pop();	//removes top element
    public Object peek();	//returns top element (does not remove)

    //Querying
    public int size();
    public boolean isEmpty();
    public List asList();
}




