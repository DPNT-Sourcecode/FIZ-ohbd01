package befaster.solutions.FIZ;

public class FizzBuzzSolution {

    public String fizzBuzz(Integer number) {

        String numberAsString = String.valueOf(number);

        if (isFizzBuzz(number)) {
            if (isDeluxe(number)) {
                if (isOddNumber(number)) {
                    return "fizz buzz fake deluxe";
                }
                return "fizz buzz deluxe";
            }
            return "fizz buzz";
        } else if (isBuzz(number)) {
            if (isDeluxe(number)) {
                if (isOddNumber(number)) {
                    return "buzz fake deluxe";
                }
                return "buzz deluxe";
            }
            return "buzz";
        } else if (isFizz(number)) {
            if (isDeluxe(number)) {
                if (isOddNumber(number)) {
                    return "fizz fake deluxe";
                }
                return "fizz deluxe";
            }
            return "fizz";

        } else if (isDeluxe(number)) {
            if (isOddNumber(number)) {
                return "fake deluxe";
            } else {
                return "deluxe";
            }
        }

        return numberAsString;
    }

    private boolean isEvenNumber(Integer number) {
        return number % 2 == 0;
    }

    private boolean isOddNumber(Integer number) {
        return number % 2 == 1;
    }

    private boolean isFizzBuzz(Integer number) {

        String numberAsString = String.valueOf(number);

        boolean fizzBuzz = false;

        if (number % 3 == 0 && number % 5 == 0) {
            fizzBuzz = true;
        } else if (numberAsString.contains("5") && numberAsString.contains("3")) {
            fizzBuzz = true;
        } else if ((number % 3 == 0 || numberAsString.contains("3")) && numberAsString.contains("5")) {
            fizzBuzz = true;
        } else if ((number % 5 == 0 || numberAsString.contains("5")) && numberAsString.contains("3")) {
            fizzBuzz = true;
        }

        return fizzBuzz;
    }

    private boolean isDeluxe(Integer number) {
        String numberAsString = String.valueOf(number);

            if (numberAsString.contains("5") && number % 5 == 0) {
                return true;
            }

            if (numberAsString.contains("3") && number % 3 == 0) {
                return true;
            }

        return false;
    }

    private boolean isBuzz(Integer number) {

        String numberAsString = String.valueOf(number);

        if (numberAsString.contains("5") || number % 5 == 0) {
            return true;
        }

        return false;
    }

    private boolean isFizz(Integer number) {

        String numberAsString = String.valueOf(number);

        if (numberAsString.contains("3") || number % 3 == 0) {
            return true;
        }

        return false;
    }

}
