package structures;



public class Test{

    public static void main(String[] args){

        System.out.println("Bubble Sort");
        BubbleSort bs = new BubbleSort ();
        bs.add(9);
        bs.add(6);
        bs.add(4);
        bs.add(8);
        bs.add(5);
        bs.add(2);
        bs.add(3);
        bs.add(1);
        bs.add(7);

        System.out.println("\nDisplay List before sorting");
        bs.getSortedResult();

        System.out.println("\nSorting");
        bs.sort ();

        System.out.println("\nDisplay List after sorting");
        bs.getSortedResult();

        System.out.println("\nSelection Sort");
        SelectionSort ss = new SelectionSort();
        ss.add(70);
        ss.add(10);
        ss.add(30);
        ss.add(20);
        ss.add(50);
        ss.add(80);
        ss.add(40);
        ss.add(60);
        ss.add(90);

        System.out.println("\nDisplay List before sorting");
        ss.getSortedResult();

        System.out.println("\nSorting");
        ss.sort();

        System.out.println("\nDisplay List after sorting");
        ss.getSortedResult();
    }
}
