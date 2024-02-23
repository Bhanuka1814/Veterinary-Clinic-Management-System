
package veterinary_clinic1;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;


public class InsertSickPet {
    public  void PetEnqueue() {
        // Create a doubly linked list to store pet ID numbers
        LinkedList<Integer> petIdList = new LinkedList<>();

        // Prompt the user to input pet ID numbers
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter pet ID numbers (enter -1 to stop):");

        // Read input until -1 is entered
        int id;
        while ((id = scanner.nextInt()) != -1) {
            petIdList.add(id);
        }

        // Display the elements using ListIterator (forward)
        System.out.println("Pet ID List (Forward):");
        ListIterator<Integer> forwardIterator = petIdList.listIterator();
        while (forwardIterator.hasNext()) {
            System.out.println(forwardIterator.next());
        }

        // Prompt the user to input a pet ID for insertion at the rear
        System.out.println("\nEnter the Pet ID to insert at the rear:");
        int inputId = scanner.nextInt();

        // Insert the entered pet ID at the rear of the linked list
        petIdList.addLast(inputId);

        // Display the updated list after insertion
        System.out.println("\nPet ID List after Insertion at Rear (Forward):");
        forwardIterator = petIdList.listIterator();
        while (forwardIterator.hasNext()) {
            System.out.println(forwardIterator.next());
        }

       
} 
}
