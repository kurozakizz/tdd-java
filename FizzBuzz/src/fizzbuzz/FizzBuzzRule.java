package fizzbuzz;

class FizzBuzzRule implements Rule {

    @Override
    public boolean validate(int number) {
        return (number % 15) == 0;
    }

    @Override
    public String say() {
        return "FizzBuzz";
    }
    
}
