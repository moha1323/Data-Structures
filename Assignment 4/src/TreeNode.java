public class TreeNode<K extends Comparable<K>> {
    K key;
    Node node;
    Key<K> k = new Key<>();

    TreeNode(Node node){
        this.key = (K) k.createKey(10);
        this.node = node;
    }

    public String data(){
        return key + ", " + node.data;
    }
}
