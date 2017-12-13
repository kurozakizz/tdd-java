import fizzbuzz.FizzBuzz;
import org.junit.Test;
import static org.junit.Assert.*;

public class FizzBuzzTest {
    
    @Test
    public void Test_Input1_Expected1 () {
        FizzBuzz fizzbuzz = new FizzBuzz();
        String expected = "1";
        String actual = fizzbuzz.Say(1);
        assertEquals(expected, actual);
    }
    
    @Test
    public void Test_Input2_Expected2 () {
        FizzBuzz fizzbuzz = new FizzBuzz();
        String expected = "2";
        String actual = fizzbuzz.Say(2);
        assertEquals(expected, actual);
    }
    
    @Test
    public void Test_Input3_ExpectedFizz () {
        FizzBuzz fizzbuzz = new FizzBuzz();
        String expected = "Fizz";
        String actual = fizzbuzz.Say(3);
        assertEquals(expected, actual);
    }
    
    @Test
    public void Test_Input4_Expected4 () {
        FizzBuzz fizzbuzz = new FizzBuzz();
        String expected = "4";
        String actual = fizzbuzz.Say(4);
        assertEquals(expected, actual);
    }
    
    @Test
    public void Test_Input5_ExpectedBuzz () {
        FizzBuzz fizzbuzz = new FizzBuzz();
        String expected = "Buzz";
        String actual = fizzbuzz.Say(5);
        assertEquals(expected, actual);
    }
    
    @Test
    public void Test_Input6_ExpectedFizz () {
        FizzBuzz fizzbuzz = new FizzBuzz();
        String expected = "Fizz";
        String actual = fizzbuzz.Say(6);
        assertEquals(expected, actual);
    }
    
    @Test
    public void Test_Input7_Expected7 () {
        FizzBuzz fizzbuzz = new FizzBuzz();
        String expected = "7";
        String actual = fizzbuzz.Say(7);
        assertEquals(expected, actual);
    }
    
    @Test
    public void Test_Input8_Expected8 () {
        FizzBuzz fizzbuzz = new FizzBuzz();
        String expected = "8";
        String actual = fizzbuzz.Say(8);
        assertEquals(expected, actual);
    }
    
    @Test
    public void Test_Input9_ExpectedFizz () {
        FizzBuzz fizzbuzz = new FizzBuzz();
        String expected = "Fizz";
        String actual = fizzbuzz.Say(9);
        assertEquals(expected, actual);
    }
    
    @Test
    public void Test_Input10_ExpectedBuzz () {
        FizzBuzz fizzbuzz = new FizzBuzz();
        String expected = "Buzz";
        String actual = fizzbuzz.Say(10);
        assertEquals(expected, actual);
    }
    
    @Test
    public void Test_Input15_ExpectedFizzBuzz () {
        FizzBuzz fizzbuzz = new FizzBuzz();
        String expected = "FizzBuzz";
        String actual = fizzbuzz.Say(15);
        assertEquals(expected, actual);
    }
    
    @Test
    public void Test_Input30_ExpectedFizzBuzz () {
        FizzBuzz fizzbuzz = new FizzBuzz();
        String expected = "FizzBuzz";
        String actual = fizzbuzz.Say(30);
        assertEquals(expected, actual);
    }
    
}
