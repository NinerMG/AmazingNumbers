package mg;

import java.util.Scanner;

public class Menu {

    public void mainMenu () {
        Scanner scanner = new Scanner(System.in);
        BuzzNumbers buzzNumbers = new BuzzNumbers();

        boolean status = true;

        greetings();

        do {

            long choice =  scanner.nextLong();

            if (choice == 0) {
                System.out.println("Goodbye!");
                status = false;
            }
            else if (choice < 0) {
                System.out.println("The first parameter should be a natural number or zero.");
                System.out.println();
                System.out.println("Enter a request: ");
                status = true;
            }
            else {
                buzzNumbers.start(choice);
                System.out.println("Enter a request: ");
                status = true;
            }
        }
        while (status);
    }

    private void greetings() {
        System.out.println("Welcome to Amazing Numbers!");
        System.out.println();
        System.out.println("Supported requests:");
        System.out.println("enter a natural number to know its properties;");
        System.out.println("enter 0 to exit.");
        System.out.println();
        System.out.println("Enter a request: ");
    }
}
