package fizzbuzz;

import org.junit.Test;
import static org.junit.Assert.*;

public class FizzBuzzTest {
    FizzBuzz fizzbuzz = new FizzBuzz();
    
    @Test
    public void saySame () {
        assertEquals("1", fizzbuzz.say(1));
        assertEquals("2", fizzbuzz.say(2));
        assertEquals("4", fizzbuzz.say(4));
        assertEquals("7", fizzbuzz.say(7));
        assertEquals("8", fizzbuzz.say(8));
    }
    
    
    @Test
    public void sayFizz () {
        assertEquals("Fizz", fizzbuzz.say(3));
        assertEquals("Fizz", fizzbuzz.say(6));
        assertEquals("Fizz", fizzbuzz.say(9));
    }
    
    @Test
    public void sayBuzz () {
        assertEquals("Buzz", fizzbuzz.say(5));
        assertEquals("Buzz", fizzbuzz.say(10));
    }
    
    @Test
    public void sayFizzBuzz () {
        assertEquals("FizzBuzz", fizzbuzz.say(15));
        assertEquals("FizzBuzz", fizzbuzz.say(30));
    }
    
    
    
}
