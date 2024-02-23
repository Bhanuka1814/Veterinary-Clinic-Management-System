
package veterinary_clinic1;

import java.util.Scanner;


public class PetSitterRegister {
    String title, name, address, Qualification;
    int tp, nic; // Changed from int to String for phone number and NIC

    public void Inputs() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter pet sitter title");
        title = scanner.nextLine();

        System.out.println("Enter pet sitter name");
        name = scanner.nextLine();

        System.out.println("Enter pet sitter address");
        address = scanner.nextLine();

        System.out.println("Enter pet sitter Qualification");
        Qualification = scanner.nextLine();

        System.out.println("Enter pet sitter mobile number");
        tp = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Enter pet sitter NIC number");
        nic = scanner.nextInt();
        scanner.nextLine();

        
        
        
    }
    
}
