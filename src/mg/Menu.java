package mg;

import java.util.Scanner;

public class Menu {

    public void mainMenu () {

        Scanner scanner = new Scanner(System.in);
        try {
            BuzzNumbers buzzNumbers = new BuzzNumbers();

            boolean status = true;

            greetings();

            do {

                String choice = scanner.nextLine();

                String[] inputArray = choice.split(" ");

                long numberOne = Long.valueOf(inputArray[0]);

                if (numberOne < 0L) {
                    System.out.println("The first parameter should be a natural number or zero.");
                    greetings();
                    System.out.println("Enter a request:");
                    status = true;
                }

                if (inputArray.length == 1) {
                    if (numberOne == 0) {
                        System.out.println("Goodbye!");
                        status = false;
                    } else if (numberOne < 0L) {
                        System.out.println("The first parameter should be a natural number or zero.");
                        greetings();
                        System.out.println("Enter a request:");
                        status = true;
                    } else {
                        buzzNumbers.startOneNumber(numberOne);
                        System.out.println("Enter a request:");
                        status = true;
                    }
                }

                if (inputArray.length == 2) {
                    long numberTwo = Long.valueOf(inputArray[1]);
                    if (numberTwo <= 0) {
                        System.out.println("The second parameter should be a natural number.");
                        greetings();
                        System.out.println("Enter a request: ");
                        status = true;
                    }
                    for (long i = 0; i < numberTwo; i++) {
                        buzzNumbers.startTwoNumbers(numberOne);
                        numberOne++;
                    }
                    System.out.println("Enter a request: ");
                    status = true;
                }

            }

            while (status);
        }
        catch (Exception e) {
            System.out.println("The first parameter should be a natural number.");
            mainMenu();
        }

    }


    private void greetings() {

        System.out.println("Supported requests:");
        System.out.println("enter a natural number to know its properties;");
        System.out.println("enter two natural numbers to obtain the properties of the list:");
        System.out.println("* the first parameter represents a starting number;");
        System.out.println("* the second parameter shows how many consecutive numbers are to be processed;");
        System.out.println("separate the parameters with one space;");
        System.out.println("enter 0 to exit.");
        System.out.println();
        System.out.println("Enter a request: ");
    }



}
