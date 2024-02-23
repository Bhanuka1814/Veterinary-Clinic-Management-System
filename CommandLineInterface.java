package veterinary_clinic1;
import java.util.Scanner;

public class CommandLineInterface {

    public void runInterface() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Command Line Interface!");
        boolean running = true;

        while (running) {
            System.out.print("Enter a command (type 'help' for list of commands): ");
            String command = scanner.nextLine();

            switch (command.toLowerCase()) {
                case "help":
                    printHelp();
                    break;
                case "quit":
                case "exit":
                    running = false;
                    break;
                default:
                    System.out.println("Unknown command. Type 'help' for list of commands.");
            }
        }

        System.out.println("Exiting the Command Line Interface. Goodbye!");
        scanner.close();
    }

    private void printHelp() {
        System.out.println("List of available commands:");
        System.out.println("help - Display list of commands");
        System.out.println("quit - Quit the program");
}
}
