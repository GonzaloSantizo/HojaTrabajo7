import java.util.Comparator;

public class Main{

    public static void main (String[] args) {
        System.out.println("Create a tree");
        BST<String, String> English = new BST<String, String>(new
       AscendingStringComparator());
       
       English.add("Test1", "Prueba 1");
       English.add("Test2", "Prueba 2");
       English.add("Test4", "Prueba 4");
       English.add("Test3", "Prueba 3");

       System.out.println("In-order traverse the tree");
       English.traverse();

       System.out.println("The value associated with e is " + English.search("Test2"));
       English.remove("Test2");

       System.out.println("In-order traverse the tree after removing 'Test3'");
       English.traverse();
       
       English.remove("Test3");
       System.out.println("In-order traverse the tree after removing 'i'");
       English.traverse();


      }
}