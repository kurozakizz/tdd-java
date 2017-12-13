package fizzbuzz;

public class FizzBuzz {

    public String Say(int number) {
        FizzBuzzRule fizzBuzzRule = new FizzBuzzRule();
        if (fizzBuzzRule.validate(number)) return fizzBuzzRule.say();
        
        FizzRule fizzRule = new FizzRule();
        if (fizzRule.validate(number)) return fizzRule.say();
        
        BuzzRule buzzRule = new BuzzRule();
        if (buzzRule.validate(number)) return buzzRule.say();
        
        return String.format("%d", number);
    }
    
}
