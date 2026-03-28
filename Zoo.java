
import java.util.Scanner;

/** Block 1: 
 * The Driver Class -- contains main 
 * method to run app
 */
public class Zoo {

  public static void main(String[] args) {
    
    // BLock 2: The Scanner Setup
    // Initialize "llama" to listen to keyboard
    Scanner llama = new Scanner(System.in);

    // Block 3: User Input
    // We prompt the user to store the responses
    System.out.print("Enter the animal's name: ");
    String name = llama.nextLine();

    System.out.print("Enter the animal's color: ");
    String color = llama.nextLine();

    System.out.print("Enter the animal's age: ");
    int age = llama.nextInt();

    // Block 4: Buffer clear
    llama.nextLine();

    System.out.print("Enter the animal's favorite food: ");
    String favFood = llama.nextLine();

    // Block 5: Object creation
    // We represent the animal blueprint using
    // data llama just caught.
    Animal myAnimal = new Animal(name, color, age, favFood);

    // Block 6: Formatted Output
    // We call the logic method from our Animal object.
    System.out.printf("%nPrinting details:%n");
    myAnimal.printDetails();

    // Block 7: Resource Management
    // Always close stream to maintain memory state
    // llama has left the building...
    llama.close();

  } // main
} // class