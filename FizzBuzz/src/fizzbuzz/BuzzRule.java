package fizzbuzz;

class BuzzRule {

    boolean validate(int number) {
        return (number % 5) == 0;
    }

    String say() {
        return "Buzz";
    }
    
}
