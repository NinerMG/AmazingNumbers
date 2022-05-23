package mg;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        BuzzNumbers buzzNumbers = new BuzzNumbers();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a natural number: ");
        int number = scanner.nextInt();

        buzzNumbers.start(number);
    }
}

