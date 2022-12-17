package structures;

import interfaces.IndexableList;

import java.util.ArrayList;
import java.util.List;

public class IndexableListTest2 {

    public static void main(String[] args){
        MyIndexableList iList = new MyIndexableList ();
        System.out.println("Indexable List Test 2");

        System.out.println("\nAdded Elements");
        iList.add(33);
        iList.add(22);
        iList.add(11);

        System.out.println("\nGet Element @ Index 1");
        System.out.println(iList.get(1));

        System.out.println("\n(List) Added Elements");
        List list1 = new ArrayList<Integer> ();
        list1.add(33);
        list1.add(55);
        list1.add(66);
        list1.add(77);
        iList.addAll(list1);

        System.out.println("\nDisplaying Indexable List");
        iList.iter.displayAll();

        System.out.println("\nSet Element to 4 @ Index 3");
        iList.set(3,44);

        System.out.println("\nRemove Element @ Index 6");
        iList.remove(6);

        System.out.println("\nDisplaying Indexable List");
        iList.iter.displayAll();

        System.out.println("\nReversing");
        iList.reverse();

        System.out.println("\nDisplaying Indexable List");
        iList.iter.displayAll();

        System.out.println("\nSize of Indexable List");
        System.out.println(iList.size());

        System.out.println("\nIndex of the Element that contains '2'");
        System.out.println(iList.indexOf(2));

        System.out.println("\nT or F: Does Indexable List contain '10'?");
        System.out.println(iList.contains(10));

        System.out.println("\nCopy Elements between two Indexes to a new Indexable List");
        IndexableList copyFromTo = iList.copyFromTo(2,4);
        for(int i = 0; i < copyFromTo.size (); i++){
            System.out.println(copyFromTo.get(i));
        }

        System.out.println("\nShuffling");
        iList.shuffle();

        System.out.println("\nDisplaying Indexable List");
        iList.iter.displayAll();

        System.out.println("\nConvert Indexable List to List");
        iList.asList();

        System.out.println("\nClear Indexable List");
        iList.clear();

        System.out.println("\nT or F: Is Indexable List Empty?");
        System.out.println(iList.isEmpty());

    }
}
