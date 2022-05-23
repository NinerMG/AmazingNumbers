package mg;

public class BuzzNumbers {

    void start(int number) {

        if (!isNatural(number)) {
            System.exit(0);
        } else {
            isEven(number);
            isBuzzNumber(number);
        }
    }

    private boolean isNatural(int number) {

        if (number > 0) {
            return true;
        } else {
            System.out.println("This number is not natural!");
            return false;
        }
    }

    private void isEven(int number) {

        if (number % 2 == 0) {
            System.out.println("This number is Even.");
        } else {
            System.out.println("This number is Odd.");
        }
    }

    private void isBuzzNumber(int number) {

        if (endsWithSeven(number) == true && divideBySeven(number) == true) {
            System.out.println("It is a Buzz number.");
            System.out.println("Explanation: ");
            System.out.println(number + " is divisible by 7 and ends with 7.");
        } else if (endsWithSeven(number) == true && divideBySeven(number) == false) {
            System.out.println("It is a Buzz number.");
            System.out.println("Explanation: ");
            System.out.println(number + " ends with 7.");
        } else if (endsWithSeven(number) == false && divideBySeven(number) == true) {
            System.out.println("It is a Buzz number.");
            System.out.println("Explanation: ");
            System.out.println(number + " is divisible by 7.");
        } else {
            System.out.println("It is not a Buzz number.");
            System.out.println("Explanation: ");
            System.out.println(number + " is neither divisible by 7 nor does it end with 7.");
        }
    }

    private boolean endsWithSeven(int number) {

        if (number % 10 == 7) {
            return true;
        } else {
            return false;
        }

    }

    private boolean divideBySeven(int number) {

        if (number % 7 == 0) {
            return true;
        } else
            return false;
    }

}
