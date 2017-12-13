package fizzbuzz;

class FizzBuzzRule {

    boolean validate(int number) {
        return (number % 15) == 0;
    }

    String say() {
        return "FizzBuzz";
    }
    
}
