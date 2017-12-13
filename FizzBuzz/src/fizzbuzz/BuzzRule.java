package fizzbuzz;

class BuzzRule implements Rule {

    @Override
    public boolean validate(int number) {
        return (number % 5) == 0;
    }

    @Override
    public String say() {
        return "Buzz";
    }
    
}
