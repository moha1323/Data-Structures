package interfaces;

import java.util.List;

public interface DataStructure extends UniIterable {

    public boolean isEmpty();
    public int size();

    @SuppressWarnings("all") //List is okay
    public List asList();
}
