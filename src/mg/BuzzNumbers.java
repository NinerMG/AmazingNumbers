package mg;

public class BuzzNumbers {

    void startOneNumber(long number) {

        if (!isNatural(number)) {
            System.exit(0);
        } else {
            System.out.println("Properties of " + number);
            System.out.println("buzz: " + isBuzzNumber(number));
            System.out.println("duck: " + duckNumber(number));
            System.out.println("palindromic: " + pallindormeCheck(number));
            System.out.println("gapful: " + isGapful(number));
            System.out.println("spy: " + checkSpy(number));
            System.out.println("even: " + isEven(number));
            System.out.println("odd: " + !isEven(number));
            System.out.println();
        }
    }

    void messenge (long number) {

        if (isBuzzNumber(number)) {
            System.out.print("buzz, ");
        }
        if (duckNumber(number)) {
            System.out.print("duck, ");
        }
        if (pallindormeCheck(number)) {
            System.out.print("palindromic, ");
        }
        if (isGapful(number)) {
            System.out.print("gapful, ");
        }

        if (checkSpy(number)) {
            System.out.println("spy, ");
        }

        if (isEven(number)) {
            System.out.print("even");
        }
        if (!isEven(number)) {
            System.out.print("odd");
        }
    }

    void startTwoNumbers (long number) {
        System.out.print(number + " is ");
       messenge(number);
       System.out.println();
    }


    private boolean isNatural(long number) {

        if (number > 0) {
            return true;
        } else {
            System.out.println("The first parameter should be a natural number or zero.");
            return false;
        }
    }

     boolean isEven(long number) {

        return number % 2 == 0;
    }

    private boolean isBuzzNumber(long number) {

        return endsWithSeven(number) && divideBySeven(number)
                || endsWithSeven(number) && !divideBySeven(number)
                || !endsWithSeven(number) && divideBySeven(number);
    }

    private boolean endsWithSeven(long number) {

        return number % 10 == 7;

    }

    private boolean divideBySeven(long number) {

        return number % 7 == 0;
    }

    private boolean duckNumber (long number) {

        return checkIfDuckNumber(number);
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

    private boolean pallindormeCheck (long number) {

        long rest;
        long reverse = 0;
        long original = number;

        while (original > 0) {
            rest = original % 10;
            reverse = (reverse * 10) + rest;
            original =  original / 10;
        }

        return number == reverse;
    }

    private static boolean isGapful(long number) {
        String nStr = String.valueOf(number);
        return nStr.length() >= 3 &&
                number % Long.parseLong(nStr.charAt(0) + nStr.substring(nStr.length() - 1)) == 0;
    }

    private static boolean checkSpy (long number) {
        long sum = 0;
        long product = 1;
        while (number != 0) {
            long digit = number % 10;
            sum += digit;
            product *= digit;
            number /= 10;
        }
        return sum == product;
    }



}
