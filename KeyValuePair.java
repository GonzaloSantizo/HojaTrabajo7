import java.util.Comparator;


public class KeyValuePair<K, V> {
    private K key;
    private V value;

    // constructor de la clase
    public KeyValuePair (K k, V v) {
     key = k;
     value = v;
     }

     // setters and getters for this class
    public K getKey () { return key; }
    public V getValue () { return value; }
    public void setValue (V v) { value = v; }
    public String toString () { return "(" + key + ", " + value + ")"; }
    }