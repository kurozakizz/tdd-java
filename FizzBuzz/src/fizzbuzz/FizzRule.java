package fizzbuzz;

class FizzRule implements Rule {

    @Override
    public boolean validate(int number) {
        return (number % 3) == 0;
    }

    @Override
    public String say() {
        return "Fizz";
    }
    
}
