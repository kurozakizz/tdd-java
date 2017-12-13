package fizzbuzz;

public class FizzBuzz {

    public String Say(int number) {
        
        Rule[] allRule = new Rule[] {
            new FizzBuzzRule(),
            new FizzRule(),
            new BuzzRule()
        };
        for (Rule rule: allRule) {
            if (rule.validate(number)) {
                return rule.say();
            }
        }
        
        return String.format("%d", number);
    }
    
}
