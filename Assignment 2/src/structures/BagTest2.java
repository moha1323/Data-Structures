package structures;

import java.util.ArrayList;
import java.util.List;

public class BagTest2 {
    public static void main(String[] args){
        System.out.println("Bag Test 2");
        MyBag bag = new MyBag();

        System.out.println("\nAdded Elements");
        bag.add(8);
        bag.add(16);
        bag.add(24);
        bag.add(32);
        bag.add(72);

        System.out.println("\n(List)Added Elements");
        List elementsList = new ArrayList ();
        elementsList.add(40);
        elementsList.add(48);
        elementsList.add(56);
        elementsList.add(64);
        bag.addAll(elementsList);

        System.out.println("\nDisplay Random Element");
        System.out.println(bag.any());

        System.out.println("\nRemove '72' from the Bag");
        bag.remove(72);

        System.out.println("\nT or F: Does the Bag contain '72'?");
        System.out.println(bag.contains(72));

        System.out.println("\nDisplay all elements in the Bag");
        bag.display();

        System.out.println("\nCovert Queue to a List");
        List bagList = bag.asList();
        for(int i = 0; i < bagList.size (); i++){
            System.out.println(bagList.get(i));
        }

        System.out.println("\nSize of Bag");
        System.out.println(bag.size());

        System.out.println("\nClear the Bag");
        bag.clear();

        System.out.println("\nT or F: Is Bag Empty?");
        System.out.println(bag.isEmpty());
    }
}
