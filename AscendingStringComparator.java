import java.util.Comparator;

/* Comparator class */
class AscendingStringComparator implements Comparator<String> {
public int compare (String s1, String s2) {
    return s1.compareTo(s2);
    }
}
