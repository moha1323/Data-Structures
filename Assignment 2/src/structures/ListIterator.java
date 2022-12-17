package structures;

import interfaces.Iterator;

import java.util.ArrayList;
import java.util.List;

public class ListIterator implements Iterator {
    List iterlist;
    int position, direction;

    public ListIterator(List list, int currentPosition, int headOrTail){
        iterlist = list;
        position = currentPosition;
        direction = headOrTail;
    }

    @Override
    public Object next() {
        Object data;
        for(int i = 0; i < iterlist.size(); i++){
          data = iterlist.get(position);
          position++;
          return data;
        }
        return null;
    }

    @Override
    public Object peek() {
        do{
            return iterlist.get(position);
        }while(iterlist.size () != 0);
    }

    @Override
    public boolean hasNext() {
        return position < iterlist.size ();
    }

    @Override
    public void displayAll() {
        for(int i = 0; i < iterlist.size (); i++){
            System.out.println (iterlist.get(i));
        }
    }

    @Override
    public boolean allEquals(Iterator other) {
        return false;
    }

    @Override
    public boolean allEquals(List other) {
        return false;
    }

    @Override
    public List toList() {
        List collectData = new ArrayList ();
        for(int i = 0; i < iterlist.size (); i++){
            collectData.add(iterlist.get(i));
        }
        return collectData;
    }

    @Override
    public int size() {
        int count = 0;
        for (int i = position; i < iterlist.size (); i++){
            count++;
        }
        return count;
    }

    public void setDirection(int direction) {
        this.direction = direction;
    }

}
