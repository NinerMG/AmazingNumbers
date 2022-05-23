package mg;

public class BuzzNumbers {

    void start(long number) {

        if (!isNatural(number)) {
            System.exit(0);
        } else {
            System.out.println("Properties of " + number);
            isEven(number);
            isBuzzNumber(number);
            duckNumber(number);
            pallindormeCheck(number);
            System.out.println();
        }
    }

    private boolean isNatural(long number) {

        if (number > 0) {
            return true;
        } else {
            System.out.println("The first parameter should be a natural number or zero.");
            return false;
        }
    }

    private void isEven(long number) {

        if (number % 2 == 0) {
            System.out.println("even: true");
            System.out.println("odd: false");
        } else {
            System.out.println("even: false");
            System.out.println("odd: true");
        }
    }

    private void isBuzzNumber(long number) {

        if (endsWithSeven(number) == true && divideBySeven(number) == true) {
            System.out.println("buzz: true");
        } else if (endsWithSeven(number) == true && divideBySeven(number) == false) {
            System.out.println("buzz: true");
        } else if (endsWithSeven(number) == false && divideBySeven(number) == true) {
            System.out.println("buzz: true");
        } else {
            System.out.println("buzz: false");
        }
    }

    private boolean endsWithSeven(long number) {

        if (number % 10 == 7) {
            return true;
        } else {
            return false;
        }

    }

    private boolean divideBySeven(long number) {

        if (number % 7 == 0) {
            return true;
        } else
            return false;
    }

    private void duckNumber (long number) {

        if (checkIfDuckNumber(number) == true) {
            System.out.println("duck: true");
        }
        else {
            System.out.println("duck: false");
        }
    }

    private boolean checkIfDuckNumber (long number) {

        while (number != 0) {
            if (number % 10 == 0) {
                return true;
            }
            else {
                number = number / 10;
            }
        }
        return false;
    }

    private void pallindormeCheck (long number) {

        long rest;
        long reverse = 0;
        long original = number;

        while (original > 0) {
            rest = original % 10;
            reverse = (reverse * 10) + rest;
            original =  original / 10;
        }

        if (number == reverse) {
            System.out.println("palindromic: true");
        }
        else
            System.out.println("palindromic: false");
    }

}
