import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        // TODO: Ask the user to select an engine.
        // TODO: Create the selected Engine implementation.
        // TODO: Create one Car object before entering the menu loop.

        while (!exit) {
            System.out.println("\n1. Start car");
            System.out.println("2. Stop car");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    // TODO: Call startCar() on the same Car object.
                    break;
                case 2:
                    // TODO: Call stopCar() on the same Car object.
                    break;
                case 3:
                    exit = true;
                    System.out.println("Exiting Car System...");
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }

        scanner.close();
    }
}
