package veterinary_clinic1;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class SelectPetSitter {
    public void removePetSitter(){
        // Create a doubly linked list to store pet sitter ID numbers
        LinkedList<Integer> petSitterIdList = new LinkedList<>();

        // Prompt the user to input pet sitter ID numbers
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter pet sitter ID numbers (enter -1 to stop):");

        // Read input until -1 is entered
        int id;
        while ((id = scanner.nextInt()) != -1) {
            petSitterIdList.add(id);
        }

        // Display the elements using ListIterator (forward)
        System.out.println("Pet Sitter ID List (Forward):");
        ListIterator<Integer> forwardIterator = petSitterIdList.listIterator();
        while (forwardIterator.hasNext()) {
            System.out.println(forwardIterator.next());
        }

        // Prompt the user to input a pet sitter ID for removal
        System.out.println("\nEnter the Pet Sitter ID to select:");
        int inputId = scanner.nextInt();

        // Remove the entered pet sitter ID from the linked list
        boolean removed = petSitterIdList.remove(Integer.valueOf(inputId));

        // Display the updated list after removal
        if (removed) {
            System.out.println("\nPet Sitter ID List after Removal (Forward):");
            forwardIterator = petSitterIdList.listIterator();
            while (forwardIterator.hasNext()) {
                System.out.println(forwardIterator.next());
            }
        } else {
            System.out.println("Pet Sitter ID not found in the list.");
        }

        
}
}

   



    
    





   




