import java.io.File;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        clearScreen();
        PrintStart();
        System.out.println("Press any key to continue");
        String key = scanner.nextLine();
        int option = 0;
        String[][][] lockers = new String[5][5][5];
        boolean exit = false;
        if (!key.isEmpty()) {
            while (!exit) {
                clearScreen();
                System.out.println("Choose one of the Option:");
                System.out.println("Visualization");
                System.out.println("1. View Locker Contents");
                System.out.println("2. Add Item");
                System.out.println("3. Remove Item");
                System.out.println("4. Search for an Item");
                System.out.println("5. Check Locker Space Availability");
                System.out.println("6. Move Item Between Lockers");
                System.out.println("7. Clear a Locker");
                System.out.println("8. Exit System");
                option = scanner.nextInt();
                scanner.nextLine();


                switch (option){
                    case 1:
                        clearScreen();
                        //Visualization
                        break;
                    case 2:
                        clearScreen();
                        //Add item
                        break;
                    case 3:
                        clearScreen();
                        //Remove Item
                        break;
                    case 4:
                        clearScreen();
                        //Search for item
                        break;
                    case 5:
                        clearScreen();
                        //Check Space
                        break;
                    case 6:
                        clearScreen();
                        //Move item
                        break;
                    case 7:
                        clearScreen();
                        //Clear Locker
                        break;
                    case 8:
                        clearScreen();
                        System.out.println("Exiting the system. Goodbye!");
                        exit = true;
                        break;

                }

            }
        }

        scanner.close();
    }

    public static void PrintStart()
    {
        System.out.println("    _____  __                           __                           ");
        System.out.println("   |     \\|  \\                         |  \\                          ");
        System.out.println("    \\$$$$$| $$       ______    _______ | $$   __   ______    ______  ");
        System.out.println("      | $$| $$      /      \\  /       \\| $$  /  \\ /      \\  /      \\ ");
        System.out.println(" __   | $$| $$     |  $$$$$$\\|  $$$$$$$| $$_/  $$|  $$$$$$\\|  $$$$$$\\");
        System.out.println("|  \\  | $$| $$     | $$  | $$| $$      | $$   $$ | $$    $$| $$   \\$$");
        System.out.println("| $$__| $$| $$_____| $$__/ $$| $$_____ | $$$$$$\\ | $$$$$$$$| $$      ");
        System.out.println(" \\$$    $$| $$     \\\\$$    $$ \\$$     \\| $$  \\$$\\ \\$$     \\| $$      ");
        System.out.println("  \\$$$$$$  \\$$$$$$$$ \\$$$$$$   \\$$$$$$$ \\$$   \\$$  \\$$$$$$$ \\$$      ");
        System.out.println("                                                                     ");
        System.out.println("A Java Locker Inventory System");

    }

    public static void clearScreen() {
        try {
            if (System.getProperty("os.name").contains("Windows")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                new ProcessBuilder("clear").inheritIO().start().waitFor();
            }
        } catch (Exception e) {
            System.out.println("Error clearing the screen: " + e.getMessage());
        }
    }
}
