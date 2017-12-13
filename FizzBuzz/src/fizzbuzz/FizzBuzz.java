package fizzbuzz;

public class FizzBuzz {

    public String Say(int number) {
        boolean isFizz = (number % 3) == 0;
        boolean isBuzz = (number % 5) == 0;
        if (isFizz && isBuzz) return "FizzBuzz";
        if (isFizz) return "Fizz";
        if (isBuzz) return "Buzz";
        return String.format("%d", number);
    }
    
}
