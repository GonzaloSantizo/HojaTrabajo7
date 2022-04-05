
import java.util.Comparator;

/* BST class */

public class BST <K, V> {

    private TreeNode<K, V> root;
    private Comparator<K> comparator;
    public BST (Comparator<K> comp) {
    root = null;

    // constructor
    comparator = comp;
    }

    // adds value
    public void add (K k, V v) {
    if (root == null) root = new TreeNode<K, V> (k, v, null, null);
    else root.add(k, v, comparator);
    }

    // prints content in the BST
    public void traverse () {
    if (root == null) System.out.println("Empty tree!");
    else root.traverse();
    }

    // searchs for the key and prints k+v
    public V search (K key) {
     if (root == null) return null;
    return root.search(key, comparator);
    }

    // removes values
    public TreeNode<K, V> remove (K key) {
    if (root == null) return null;
    return root.remove(key, root, comparator);
    }
}