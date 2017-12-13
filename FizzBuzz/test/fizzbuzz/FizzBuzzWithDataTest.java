package fizzbuzz;

import java.util.Arrays;
import java.util.Collection;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class FizzBuzzWithDataTest {
    
    @Parameter
    public int input;
    @Parameter(1)
    public String expectedResult;
    
    
    @Parameters(name = "{index}: say({0}) =>\"{1}\"")
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
