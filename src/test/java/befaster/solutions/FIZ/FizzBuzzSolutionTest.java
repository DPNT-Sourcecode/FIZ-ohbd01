package befaster.solutions.FIZ;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;


public class FizzBuzzSolutionTest {

    private FizzBuzzSolution classToTest = new FizzBuzzSolution();

    @Test
    public void shouldReturnFizzGivenNumberMultipleOfThree(){
        // Given
        int number = 6;

        // When
        String actual = classToTest.fizzBuzz(number);

        // Then
        assertThat(actual, is("fizz"));
    }

    @Test
    public void shouldReturnBuzzGivenNumberMultipleOfFive(){
        // Given
        int number = 10;

        // When
        String actual = classToTest.fizzBuzz(number);

        // Then
        assertThat(actual, is("buzz"));
    }
}