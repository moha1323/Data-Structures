package structures;

import interfaces.Bag;
import interfaces.Iterator;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MyBag implements Bag {
    List list;
    int currentPosition = 0;
    ListIterator iter;

    int x = 0;
    List<Integer> randNum;


    public MyBag() {
        list = new ArrayList();
        iter = new ListIterator(list,currentPosition,1);
    }

    @Override
    public void add(Object newElement) {
        list.add(newElement);
    }

    @Override
    public void addAll(List newElements) {
        list.addAll(newElements);
    }

    @Override
    public Object any() {
        List<Integer> randomNumbers = randomNumGen();
        int index = x;
        if(!isEmpty ()){
            x++;
            return list.get(randomNumbers.get(index));
        } else {
            return null;
        }
    }

    @Override
    public Object remove(Object anElement) {
        return list.remove(anElement);
    }

    @Override
    public void clear() {
        list.clear();
    }

    @Override
    public int size() {
        return list.size();
    }

    @Override
    public boolean isEmpty() {
        return list.isEmpty();
    }

    @Override
    public boolean contains(Object anElement) {
        boolean contains = false;
        for(int i = 0; i < list.size(); i++){
            if (list.get(i).equals (anElement)) {
                contains = true;
            } else {
                contains = false;
            }
        }
        return contains;
    }

    @Override
    public List asList() {
        return iter.toList();
    }

    @Override
    public void display() {
        StringBuilder s = new StringBuilder ();
        for (int i = 0; i < list.size(); i++) {
            s.append(list.get(i));
            s.append (' ');
        }
        System.out.println(s.toString ());
    }

    @Override
    public Iterator toIterator() {
        return iter;
    }

    private List randomNumGen(){
        randNum = new ArrayList<Integer>();
        Random rand = new Random();
        do{
            int nxt = rand.nextInt(list.size());
            if(!randNum.contains(nxt)){
                randNum.add(nxt);
            }
        }while(randNum.size() < list.size());
        return randNum;
    }
}
