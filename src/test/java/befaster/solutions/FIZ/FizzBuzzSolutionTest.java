package befaster.solutions.FIZ;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;


public class FizzBuzzSolutionTest {

    private FizzBuzzSolution classToTest = new FizzBuzzSolution();

    @Test
    public void shouldReturnFizzBuzzOrNumber(){

        // When //Then
        assertThat(classToTest.fizzBuzz(6), is("fizz"));
        assertThat(classToTest.fizzBuzz(10), is("buzz"));
        assertThat(classToTest.fizzBuzz(35), is("fizz buzz"));
    }
}