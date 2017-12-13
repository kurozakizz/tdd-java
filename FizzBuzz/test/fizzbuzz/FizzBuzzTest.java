package fizzbuzz;

import org.junit.Test;
import static org.junit.Assert.*;

public class FizzBuzzTest {
    FizzBuzz fizzbuzz = new FizzBuzz();
    
    @Test
    public void Test_Input1_Expected1 () {
        assertEquals("1", fizzbuzz.Say(1));
    }
    
    @Test
    public void Test_Input2_Expected2 () {
        assertEquals("2", fizzbuzz.Say(2));
    }
    
    @Test
    public void Test_Input3_ExpectedFizz () {
        assertEquals("Fizz", fizzbuzz.Say(3));
    }
    
    @Test
    public void Test_Input4_Expected4 () {
        assertEquals("4", fizzbuzz.Say(4));
    }
    
    @Test
    public void Test_Input5_ExpectedBuzz () {
        assertEquals("Buzz", fizzbuzz.Say(5));
    }
    
    @Test
    public void Test_Input6_ExpectedFizz () {
        assertEquals("Fizz", fizzbuzz.Say(6));
    }
    
    @Test
    public void Test_Input7_Expected7 () {
        assertEquals("7", fizzbuzz.Say(7));
    }
    
    @Test
    public void Test_Input8_Expected8 () {
        assertEquals("8", fizzbuzz.Say(8));
    }
    
    @Test
    public void Test_Input9_ExpectedFizz () {
        assertEquals("Fizz", fizzbuzz.Say(9));
    }
    
    @Test
    public void Test_Input10_ExpectedBuzz () {
        assertEquals("Buzz", fizzbuzz.Say(10));
    }
    
    @Test
    public void Test_Input15_ExpectedFizzBuzz () {
        assertEquals("FizzBuzz", fizzbuzz.Say(15));
    }
    
    @Test
    public void Test_Input30_ExpectedFizzBuzz () {
        assertEquals("FizzBuzz", fizzbuzz.Say(30));
    }
    
}
