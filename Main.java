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


        Scanner scan = new Scanner(System.in);
        // Crear perro y persona
        int opcion = 0;
        String word;
        

        while (opcion != 6) {

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
                // TODO
  

            } else if (opcion == 2) {
                // Edit the value in a word

                scan = new Scanner(System.in);


                int LanguageOpt;

                System.out.println("Which language are you trying to edit? (1 english / 2 french)");
                LanguageOpt = scan.nextInt();

                if(LanguageOpt == 1){
                    // change meaning of a word from english dict to a new meaning
                    
                    System.out.println("What word do you want to edit?");
                    word = scan.nextLine(); // adds the word from user

                    word.toLowerCase(); // makes sure there are no issues with caps
                    

                    String wordChangeEng;
                    String wordChangeSpa;

                    
                    wordChangeEng = scan.nextLine();

                    // assigns new definition to word
                    System.out.println("What is the new meaning you want it to have?");
                    wordChangeSpa = scan.nextLine();

                    English.add(wordChangeEng, wordChangeSpa);
                    English.remove(word);

                    English.traverse();


                }else if(LanguageOpt == 2){
                    // change meaning of a word from French dict to a new meaning
                    // this section is the same as the one above comments apply to both

                    System.out.println("What word do you want to edit?");
                    word = scan.nextLine();

                    word.toLowerCase();
                    

                    String wordChangeEng;
                    String wordChangeSpa;

                    
                    wordChangeEng = scan.nextLine();

                    System.out.println("What is the new meaning you want it to have?");
                    wordChangeSpa = scan.nextLine();

                    French.add(wordChangeEng, wordChangeSpa);
                    French.remove(word);

                    French.traverse();

                }

            } else if (opcion == 3) {
                // Delete word from translator

                scan = new Scanner(System.in);

                int LanguageOpt;

                System.out.println("Which language are you trying to edit? (1 english / 2 french)");
                LanguageOpt = scan.nextInt();

                if(LanguageOpt == 1){
                    // deletes a word from english dict to a new meaning
                    
                    System.out.println("What word do you want to remove?");
                    scan = new Scanner(System.in);
                    word = scan.nextLine(); // adds the word from user

                    word.toLowerCase(); // makes sure there are no issues with caps

                    English.remove(word); // removes word
                    

                    English.traverse();


                }else if(LanguageOpt == 2){
                    // deletes a word from french dict to a new meaning
                    
                    System.out.println("What word do you want to remove?");
                    scan = new Scanner(System.in);
                    word = scan.nextLine(); // adds the word from user

                    word.toLowerCase(); // makes sure there are no issues with caps

                    French.remove(word); // removes word
                    

                    French.traverse();
                }

                


            } else if (opcion == 4) {
                // Add a word
                String WordKey;
                String WordValue;


                scan = new Scanner(System.in);

                int LanguageOpt;

                System.out.println("Which language are you trying to edit? (1 english / 2 french)");
                LanguageOpt = scan.nextInt();

                if(LanguageOpt == 1){
                    // adds a word to the english dict
                    scan = new Scanner(System.in);

                    
                    System.out.println("What word do you want to add?");
                    
                    WordKey = scan.nextLine(); // adds the word from user

                    WordKey.toLowerCase(); // makes sure there are no issues with caps

                    System.out.println("What does it mean?");
                    scan = new Scanner(System.in);
                    WordValue = scan.nextLine(); // adds the meaning from user

                    WordValue.toLowerCase(); // makes sure there are no issues with caps

                    English.add(WordKey, WordValue); // adds word
                    

                    English.traverse();


                }else if(LanguageOpt == 2){
                    // adds a word to the french dict
                    scan = new Scanner(System.in);

                    
                    System.out.println("What word do you want to add?");
                    
                    WordKey = scan.nextLine(); // adds the word from user

                    WordKey.toLowerCase(); // makes sure there are no issues with caps

                    System.out.println("What does it mean?");
                    scan = new Scanner(System.in);
                    WordValue = scan.nextLine(); // adds the meaning from user

                    WordValue.toLowerCase(); // makes sure there are no issues with caps

                    French.add(WordKey, WordValue); // adds word
                    

                    French.traverse();
                }

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