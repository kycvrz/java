package account;

public class SavingsAccount extends BankAccount{
    private double interestRate;
    public SavingsAccount(){}
    public SavingsAccount(String accountNumber,double balance,double interestRate){
        super(accountNumber,balance);
        this.interestRate=interestRate;
    }
    @Override
    public void withdraw(double amount) {
        if (balance-amount>=100){
            balance-=amount;
            System.out.println("取款成功"+amount);
        }else {
            System.out.println("余额过低,无法取款");
        }
    }
}
