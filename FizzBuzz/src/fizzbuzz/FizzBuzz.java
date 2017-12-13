package fizzbuzz;

public class FizzBuzz {

    public String say(int number) throws InvalidRuleException {
        
        Rule[] allRule = new Rule[] {
            new FizzBuzzRule(),
            new FizzRule(),
            new BuzzRule(),
            new DefaultRule()
        };
        
        for (Rule rule: allRule) {
            if (rule.validate(number)) {
                return rule.say();
            }
        }
        
        throw new InvalidRuleException();
    }
    
}
