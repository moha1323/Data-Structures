import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class BinarySearchTree<E extends Comparable<E>> {
    Node<E> root;
    Comparator<E> comparator;
    List<E> preOrder = new ArrayList<>();
    List<E> inOrder = new ArrayList<>();
    List<E> postOrder = new ArrayList<>();

    public BinarySearchTree(){
        root = null;
        comparator = null;
    }

    private int compare(E a, E b){
        if(comparator == null){
            return a.compareTo(b);
        } else {
            return comparator.compare(a,b);
        }
    }

    private Node<E> add(Node<E> currentNode, E insert){
        if(currentNode == null){
            return new Node<E>(insert);
        }
        if(compare(insert,currentNode.data) == 0){
            return currentNode;
        }
        if(compare(insert,currentNode.data) < 0){
            currentNode.leftChild = add(currentNode.leftChild,insert);
        } else {
            currentNode.rightChild = add(currentNode.rightChild,insert);
        }
        return currentNode;
    }

    public void add(E data){
        root = add(root,data);
    }

    private List<E> preOrder(Node<E> root){
        if (root != null) {
            preOrder.add(root.data);
            //System.out.println(root.data); Testing
            preOrder (root.leftChild);
            preOrder (root.rightChild);
        }
        return preOrder;
    }

    public void collectPreOrder(List<E> collect){
        collect.addAll(preOrder(root));
        display(collect);
    }

    private List<E> inOrder(Node<E> root){
        if(root != null){
            inOrder(root.leftChild);
            inOrder.add(root.data);
            //System.out.println(root.data); Testing
            inOrder(root.rightChild);
        }
        return inOrder;
    }

    public void collectInOrder(List collect){
        collect.addAll(inOrder(root));
        display(collect);
    }

    private List<E> postOrder(Node<E> root){
        if(root != null){
            postOrder(root.leftChild);
            postOrder(root.rightChild);
            postOrder.add(root.data);
            //System.out.println(root.data); Testing
        }
        return postOrder;
    }

    public void collectPostOrder(List collect){
        collect.addAll(postOrder(root));
        display(collect);
    }

    private Object searching(Node<E> currentNode, E data){
        if(currentNode == null){
            return null;
        } else if(compare(data,currentNode.data) == 0){
            return currentNode.data;
        } else if(compare(data,currentNode.data) < 0){
            return searching(currentNode.leftChild,data);
        } else {
            return searching(currentNode.rightChild,data);
        }
    }

    public Object search(E data){
        return searching(root,data);
    }

    public void display(List<E> list){
        for(int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }
    }

}
