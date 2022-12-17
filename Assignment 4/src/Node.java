public class Node<E extends Comparable<E>> {
    E data;
    Node<E> leftChild, rightChild;

    Node(E data){
        this.data = data;
    }

    Node(E data, Node<E> left, Node<E> right){
        leftChild = left;
        rightChild = right;
        this.data = data;
    }

}
