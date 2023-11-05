package hw4;

import static hw4.Account.createAccount;

public class Program {
    public static void main(String[] args)  {

        try {
            processAccountOperation();
        }catch (IllegalArgumentException e){
            e.printStackTrace();
        }
        catch (InsufficientFundsException e){
            e.printStackTrace();
        }


    }

    public static void processAccountOperation() throws IllegalArgumentException, InsufficientFundsException{
        Account account = createAccount(150);
        System.out.println(account);
        account.setDeposite(50);
        System.out.println(account);
        account.withdraw(150);
    }
}
