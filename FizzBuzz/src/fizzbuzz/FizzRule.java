package fizzbuzz;

class FizzRule {

    boolean validate(int number) {
        return (number % 3) == 0;
    }

    String say() {
        return "Fizz";
    }
    
}
