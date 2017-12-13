package fizzbuzz;

import java.util.Arrays;
import java.util.Collection;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class FizzBuzzWithDataTest {
    
    private int input;
    private String expectedResult;
    
    public FizzBuzzWithDataTest(int input, String expectedResult) {
        this.input = input;
        this.expectedResult = expectedResult;
    }
    
    @Parameters
    public static Collection<Object[]> setupTestData() {
        return Arrays.asList(new Object[][]{
            {1, "1"},
            {2, "2"},
            {3, "Fizz"}
        });
    }
    
    @Test
    public void fizzBuzzTest() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertEquals(expectedResult, fizzBuzz.Say(input));
    }
    
}
