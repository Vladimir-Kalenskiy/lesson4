package hw4;

public class Account {
    private double balans;
    private double deposite;

    private Account(double balans, double deposite) {
        this.balans = balans;
        this.deposite = deposite;
    }

    private Account(double balans) {
        this.balans = balans;
        this.deposite = 0;
    }

    public void setDeposite(double deposite) throws java.lang.IllegalArgumentException {
        if(deposite < 0) {
            throw new java.lang.IllegalArgumentException("Cумма депозита должна быть положительной.");
        }
        balans = balans - deposite;
        this.deposite = deposite;
    }

    public static Account createAccount(double balans) throws java.lang.IllegalArgumentException {
        if(balans < 0){
            throw new java.lang.IllegalArgumentException("При создании счета обязателен положительный баланс.");
        }
        return new Account(balans);
    }

    public void withdraw(double cash) throws InsufficientFundsException {
        if(balans < cash) {
            throw new InsufficientFundsException("Недостаток денежных средств.\nОстаток: "+ balans,balans);
        }
        balans = balans - cash;
        System.out.println("Вы сняли:" + cash + "\nОстаток средств на счету: " + balans);
    }

    @Override
    public String toString() {
        return  "Account{" +
                "balans=" + balans +
                ", deposite=" + deposite +
                '}';
    }
}
