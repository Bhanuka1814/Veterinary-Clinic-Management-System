
package veterinary_clinic1;

import java.util.Scanner;

public class Veterinary_Clinic1 {
    
    public void printWelcomeMessage() {
        System.out.println("&&   && &&&&&& &&     &&&&&& &&&&&& &&&  &&& &&&&&&   &&&&&&& &&&&&&  &&      &&  &&&&&&&&&  &&&&&&&  &&&&&&&&        &&       &&&&&&&  &&        &&  &&&&&&   &&      &&  &&&&&&&&&  ");
        System.out.println("&&   && &&     &&     &&     &&  && && && && &&         &&    &&      &&      &&    &&   &&  &&       &&     &        &&       &&   &&   &&      &&     &&     &&      &&  &&         ");
        System.out.println("&& & && &&&&&& &&     &&     &&  && &&    && &&&&&&     &&    &&&&&&  && &&   &&    &&   &&  &&&&&&&  &&&&&&&&        &&       &&   &&    &&    &&      &&     && &&   &&  &&  &&&&  ");
        System.out.println("&&& &&& &&     &&     &&     &&  && &&    && &&         &&    &&      &&   && &&    &&   &&  &&       &&     &&       &&       &&   &&     &&  &&       &&     &&   && &&  &&    &&  ");
        System.out.println("&&   && &&&&&& &&&&&& &&&&&& &&&&&& &&    && &&&&&&     &&    &&&&&&  &&     &&&  &&&&&&&&&  &&&&&&&& &&       &      &&&&&&&  &&&&&&&      &&&&      &&&&&&   &&     &&&  &&&&&&&&      \n\n\n");
        System.out.println("VETERINARY CLINIC MANAGEMENT SYSTEM  CLI\n\n\n");
        System.out.println("Our Servises");
        System.out.println("1.Register Pet");
        System.out.println("2.Register Pet Sitter");
        System.out.println("3.Select Pet Sitter");
        System.out.println("4.View Pet List");
        System.out.println("5.View Pet Sitter List");
        System.out.println("6.Remove and referral to Doctor");
        System.out.println("7.Find shortest path between pet owner and doctor ");
        System.out.println("8.Exit");
         System.out.println("9.Help\n\n\n");
       
        
    }
   /*private static void findShortestPath(Scanner scanner, VeterinarianList veterinarianList, PetList petList) {
        System.out.print("Enter Veterinarian ID: ");
        String vetId = scanner.next();
        Veterinarian vet = veterinarianList.SearchByID(vetId);
        if (vet == null) {
            System.out.println("Veterinarian not found!");
            return;
        }

        System.out.print("Enter Pet ID: ");
        String petId = scanner.next();
        Pet pet = petList.SearchByID(petId);
        if (pet == null) {
            System.out.println("Pet not found!");
            return;
        }

        int shortestPathLength = dijkstraShortestPathLength(vet, pet, veterinarianList);
        if (shortestPathLength == -1) {
            System.out.println("No path found between Veterinarian and Pet.");
        } else {
            System.out.println("Shortest path length from Veterinarian to Pet: " + shortestPathLength);
        }
    }

    private static int dijkstraShortestPathLength(Veterinarian sourceVet, Pet destinationPet, VeterinarianList vetList) {
        Map<Veterinarian, Integer> distanceMap = new HashMap<>();
        Set<Veterinarian> visitedSet = new HashSet<>();

        PriorityQueue<Veterinarian> priorityQueue = new PriorityQueue<>(Comparator.comparingInt(distanceMap::get));
        distanceMap.put(sourceVet, 0);
        priorityQueue.offer(sourceVet);

        while (!priorityQueue.isEmpty()) {
            Veterinarian currentVet = priorityQueue.poll();
            if (visitedSet.contains(currentVet)) continue;

            visitedSet.add(currentVet);

            if (currentVet.equals(destinationPet)) {
                return distanceMap.get(currentVet);
            }

            for (Pet connectedPet : getConnectedPets(currentVet)) {
                Veterinarian connectedVet = getVeterinarianForPet(connectedPet);

                int newDistance = distanceMap.get(currentVet) + 1; // Assuming equal weight for all edges
                if (!distanceMap.containsKey(connectedVet) || newDistance < distanceMap.get(connectedVet)) {
                    distanceMap.put(connectedVet, newDistance);
                    priorityQueue.offer(connectedVet);
                }
            }
        }

        return -1; // If no path is found
}*/

    
    public static void main(String[] args) {
       
        
     
        Veterinary_Clinic1 welcome = new Veterinary_Clinic1();
        welcome.printWelcomeMessage();
        
        Scanner scanner = new Scanner(System.in);
        while(true){
        System.out.print("Enter your choice :");
        int choice=scanner.nextInt();
        
        switch (choice) {
                case 1 -> {
                    PetRegister pet = new PetRegister();
                    pet.Inputs();
                    SelectPetSitter petsitter=new SelectPetSitter();
                    petsitter.removePetSitter();
                }
                case 2 -> {
                    PetSitterRegister sitter = new PetSitterRegister();
                    sitter.Inputs();
                }
                case 3 -> {
                    SelectPetSitter petsitter=new SelectPetSitter();
                    petsitter.removePetSitter();
                }
                case 4 -> {
                    ViewPetList list =new ViewPetList ();
                    list.viewPet();
                }
                case 5 -> {
                }
                case 6 -> {
                    InsertSickPet  sickpet= new InsertSickPet ();
                    sickpet.PetEnqueue();
                }
                case 7 -> {
                }
                case 8 -> {
                    System.out.println("Exiting Pet Care System CLI. Goodbye!");
                    System.exit(0);
                }
                    case 9->{
                CommandLineInterface interfa=new CommandLineInterface();
        interfa.runInterface();
                }
                
                
                    
                default -> System.out.println("Invalid choice. Please try again.");
}
        
       
        
        
       
         
          
       
    }
    
}
}

