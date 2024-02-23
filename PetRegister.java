
package veterinary_clinic1;

import java.util.Scanner;


public class PetRegister {
    public String pet_name, owner_name, owner_address;
    int age, owner_tp;

    public void Inputs() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter pet name");
        pet_name = scanner.nextLine();

        System.out.println("Enter pet age");
        age = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character after reading int

        System.out.println("Enter owner name");
        owner_name = scanner.nextLine();

        System.out.println("Enter owner address");
        owner_address = scanner.nextLine();

        System.out.println("Enter owner telephone number");
        owner_tp = scanner.nextInt();
      
        
       
}
    public int returnTp(){
        return owner_tp;
        }
    public String returnAddress(){
        return owner_address;
        }
    public String returnOwnerName(){
        return owner_name;
        }
    public int returnAge(){
        return age;
        }
     public String returnPetName(){
        return pet_name;
        }
    
}
