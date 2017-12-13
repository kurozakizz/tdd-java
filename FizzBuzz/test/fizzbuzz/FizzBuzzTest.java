package fizzbuzz;

import org.junit.Test;
import static org.junit.Assert.*;

public class FizzBuzzTest {
    FizzBuzz fizzbuzz = new FizzBuzz();
    
    @Test
    public void saySame () {
        assertEquals("1", fizzbuzz.Say(1));
        assertEquals("2", fizzbuzz.Say(2));
        assertEquals("4", fizzbuzz.Say(4));
        assertEquals("7", fizzbuzz.Say(7));
        assertEquals("8", fizzbuzz.Say(8));
    }
    
    
    @Test
    public void sayFizz () {
        assertEquals("Fizz", fizzbuzz.Say(3));
        assertEquals("Fizz", fizzbuzz.Say(6));
        assertEquals("Fizz", fizzbuzz.Say(9));
    }
    
    @Test
    public void sayBuzz () {
        assertEquals("Buzz", fizzbuzz.Say(5));
        assertEquals("Buzz", fizzbuzz.Say(10));
    }
    
    @Test
    public void sayFizzBuzz () {
        assertEquals("FizzBuzz", fizzbuzz.Say(15));
        assertEquals("FizzBuzz", fizzbuzz.Say(30));
    }
    
    
    
}
