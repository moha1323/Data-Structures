package structures;

import java.util.ArrayList;
import java.util.List;

public class BagTest1 {
    public static void main(String[] args){
        System.out.println("Bag Test 1");
        MyBag bag = new MyBag();

        System.out.println("\nAdded Elements");
        bag.add(11);
        bag.add(12);
        bag.add(13);
        bag.add(14);
        bag.add(19);

        System.out.println("\n(List)Added Elements");
        List elementsList = new ArrayList();
        elementsList.add(15);
        elementsList.add(16);
        elementsList.add(17);
        elementsList.add(18);
        bag.addAll(elementsList);

        System.out.println("\nDisplay Random Element");
        System.out.println(bag.any());

        System.out.println("\nRemove '19' from the Bag");
        bag.remove(19);

        System.out.println("\nT or F: Does the Bag contain '19'?");
        System.out.println(bag.contains(19));

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
