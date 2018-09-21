package befaster.solutions.HLO;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;


public class HelloSolutionTest {

    @Test
    public void shouldReturnHelloJohnMessage(){
        // Given
        String name = "John";

        // When
        String message = new HelloSolution().hello(name);

        // Then
        assertThat(message, is("Hello, John!"));
    }

    @Test
    public void shouldReturnHelloWorldMessage(){
        // Given

        // When
        String message = new HelloSolution().hello("Dave");

        // Then
        assertThat(message, is("Hello, world!"));
    }
}