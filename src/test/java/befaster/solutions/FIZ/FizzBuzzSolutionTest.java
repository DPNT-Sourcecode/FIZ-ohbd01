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
        assertThat(classToTest.fizzBuzz(13), is("fizz"));
        assertThat(classToTest.fizzBuzz(35), is("fizz buzz"));
        assertThat(classToTest.fizzBuzz(546), is("fizz buzz"));
        assertThat(classToTest.fizzBuzz(11), is("deluxe"));
        assertThat(classToTest.fizzBuzz(22), is("deluxe"));
        assertThat(classToTest.fizzBuzz(111), is("fizz deluxe"));
        assertThat(classToTest.fizzBuzz(33), is("fizz deluxe"));
        assertThat(classToTest.fizzBuzz(111), is("fizz deluxe"));
        assertThat(classToTest.fizzBuzz(777), is("fizz deluxe"));
        assertThat(classToTest.fizzBuzz(55), is("buzz deluxe"));
        assertThat(classToTest.fizzBuzz(555), is("fizz buzz deluxe"));
    }
}