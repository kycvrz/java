package account;

public class CheckingAccount extends BankAccount{
    private double overdraftFee;
    public CheckingAccount(){}
    public CheckingAccount(String accountNumber,double balance,double overdraftFee){
        super(accountNumber,balance);
        this.overdraftFee=overdraftFee;
    }

    @Override
    public void withdraw(double amount) {
        if (balance-amount>0){
            balance-=amount;
            System.out.println("透支成功"+amount);
        }else{
            System.out.println("余额不足以透支");
        }
    }
}
