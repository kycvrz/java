package account;

public class BankAccount {
    protected String accountNumber;
    protected double balance;
    public BankAccount(){}
    public BankAccount(String accountNumber,double balance){
        this.accountNumber=accountNumber;
        this.balance=balance;
    }
//    public double getBalance(){
//        return balance;
//    }
//    public void setBalance(double balance){
//        this.balance=balance;
//    }
    public void deposit(double amount){
        if (amount >0 ){
            this.balance+=amount;
            System.out.println("存款成功"+amount);
        }else{
            System.out.println("你输入的不合理");
        }
    }
    public void withdraw(double amount){
        if (amount >0 && amount<this.balance){
            balance-=amount;
            System.out.println("取款成功"+amount);
        }else{
            System.out.println("取款失败，余额不足"+amount);
        }
    }
    public void displayBalance(){
        System.out.println("剩余金额为："+balance);
    }
//    public static void info(String accountNumber,double balance){
//        System.out.println("账户名称："+accountNumber+",余额："+balance);
//    }
}
