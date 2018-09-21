package befaster.solutions.FIZ;

public class FizzBuzzSolution {

    public String fizzBuzz(Integer number) {
        if (number % 3 == 0) {
            return "fizz";
        }
        return String.valueOf(number);
    }

}