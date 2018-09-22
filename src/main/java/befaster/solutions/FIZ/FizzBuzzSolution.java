package befaster.solutions.FIZ;

public class FizzBuzzSolution {

    public String fizzBuzz(Integer number) {

        String numberAsString = String.valueOf(number);

        if (number % 3 == 0 && number % 5 == 0) {
            return "fizz buzz";
        } else if (numberAsString.contains("5") && numberAsString.contains("3")) {
            return "fizz buzz";
        } else if (number % 3 == 0 || numberAsString.contains("3")) {
            if (numberAsString.contains("5")) {
                return "fizz buzz";
            }
            return "fizz";
        } else if (number % 5 == 0 || numberAsString.contains("5")) {
            if (numberAsString.contains("3")) {
                return "fizz buzz";
            }
            return "buzz";
        }


        return numberAsString;
    }

}
