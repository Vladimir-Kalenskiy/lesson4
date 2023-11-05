package hw4;

public class InsufficientFundsException extends CustomException{
    private final double balans;

    public double getBalans() {
        return balans;
    }

    public InsufficientFundsException(String message, double balans) {
        super(message);
        this.balans = balans;
    }
}
