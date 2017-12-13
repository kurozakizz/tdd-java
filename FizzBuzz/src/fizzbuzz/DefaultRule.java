package fizzbuzz;

class DefaultRule implements Rule {

    private int number;

    @Override
    public boolean validate(int number) {
        this.number = number;
        return true;
    }

    @Override
    public String say() {
        return String.valueOf(number);
    }
    
}
