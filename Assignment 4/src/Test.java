import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String [] args){

        Integer[] data = {50, 70, 20, 10, 60, 40, 30};
        BinarySearchTree<Integer> bst = new BinarySearchTree<>();
        for(Integer n : data){
            bst.add(n);
        }

        List preOrderList = new ArrayList();
        List inOrderList = new ArrayList();
        List postOrderList = new ArrayList();

        System.out.println("PreOrder Traversal");
        bst.collectPreOrder(preOrderList);
        System.out.println("\nInOrder Traversal");
        bst.collectInOrder(inOrderList);
        System.out.println("\nPostOrder Traversal");
        bst.collectPostOrder(postOrderList);

        System.out.println("\nSearch");
        System.out.println(bst.search(30));
    }
}
