import java.util.Comparator;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.InputMismatchException;


public class Main{

    public static void main (String[] args) {
    System.out.println("Create a tree");
    BST<String, String> English = new BST<String, String>(new AscendingStringComparator()); // create english BST
    BST<String, String> French = new BST<String, String>(new AscendingStringComparator()); // create french BST

    
    // add english known words;
    English.add("house", "Casa");
    English.add("dog", "perro");
    English.add("woman", "mujer");
    English.add("homework", "tarea");
    English.add("town", "pueblo");
    English.add("yes", "si");
    


    // Add French known Words;

    French.add("house", "loger");
    French.add("dog", "chien");
    French.add("woman", "fremme");
    French.add("homework", "devoirs");
    French.add("town", "ville");
    French.add("yes", "oui");

    /*
       System.out.println("In-order traverse the tree");
       English.traverse();

       System.out.println("The value associated with e is " + English.search("Test2"));
       English.remove("Test2");

       System.out.println("In-order traverse the tree after removing 'Test3'");
       English.traverse();
       
       English.remove("Test3");
       System.out.println("In-order traverse the tree after removing 'i'");
       English.traverse(); 
       
    */

        Scanner scan = new Scanner(System.in);
        // Crear perro y persona
        int opcion = 0;
        

        while (opcion != 5) {

            System.out.println("\n\nWelcome to the translator what are you triying to do?");
            System.out.println("1. Translate a sentence");
            System.out.println("2. Edit the value in a word");
            System.out.println("3. Delete word from translator");
            System.out.println("4. Add a word");
            System.out.println("5. Show content on both dictionaries");
            System.out.println("6. Salir\n\n");

            opcion = scan.nextInt();

            if (opcion == 1) {
                // Translate a sentence
  

            } else if (opcion == 2) {
                // Edit the value in a word
            } else if (opcion == 3) {
                // Delete word from translator
            } else if (opcion == 4) {
                // Add a word
            } else if (opcion == 5) {
                // Show content on both dictionaries

                System.out.println("English dictionary:");
                English.traverse();

                System.out.println("\n\nFrench dictionary:");
                French.traverse();


            }else if (opcion == 6) {
                // Exit
            }
        }
      }
}