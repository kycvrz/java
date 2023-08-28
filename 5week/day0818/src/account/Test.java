package account;

public class Test {
    public static void main(String[] args) {
        BankAccount bankAccount=new BankAccount();
        bankAccount.deposit(10000);
        bankAccount.displayBalance();
        BankAccount savingsAccount=new SavingsAccount();
        savingsAccount.deposit(1010);
        savingsAccount.withdraw(1000);
        savingsAccount.displayBalance();
        BankAccount checkingAccount=new CheckingAccount();
        checkingAccount.deposit(9999);
        checkingAccount.withdraw(9999);
        checkingAccount.displayBalance();
    }
    public static void menu(){
        System.out.println("*************");
        System.out.println("1.查看账户信息");
        System.out.println("2.存款");
        System.out.println("1.取款");
        System.out.println("1.退出");
    }
    public static void deposit(){

    }

}
