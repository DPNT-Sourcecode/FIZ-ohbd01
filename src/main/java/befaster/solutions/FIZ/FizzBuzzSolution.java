package befaster.solutions.FIZ;

public class FizzBuzzSolution {

    public String fizzBuzz(Integer number) {

        String numberAsString = String.valueOf(number);

        if (isFizzBuzz(number)) {
            return "fizz buzz";
        } else if (isBuzz(number)) {
            return "buzz";
        } else if (isFizz(number)) {
            return "fizz";
        }

        return numberAsString;
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
