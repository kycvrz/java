public abstract class BankAccount {
    // 银行账户继承体系
    // 你正在为一个银行开发账户管理系统。系统需要处理不同类型的账户，如储蓄账户、支票账户等。
    // 1.创建一个抽象类 BankAccount ，包含实例变量 accountNumber 和 balance，以及抽象方法 withdraw()和 deposit().
    // 2,派生出两个子类:SavingsAccount 和 CheckingAccount ，CheckingAccount 中新增属性 overdraftLimit 透支额度，
    // 分别实现 withdraw() 和 deposit() 方法考虑不同类型账户的操作规则。普通账户只能取自己的余额，checkingAccount 允许在一定范围内透支
    // 3.在主程序中，创建几个储蓄账户和支票账户对象，进行存款和取款操作。
    protected String accountNumber;
    protected double balance;

    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public abstract double withdraw(double amount);

    public abstract double deposit(double amount);

    public void displayBalance() { //
        System.out.println("账户名称：" + accountNumber + "，账户余额：" + balance);
    }
}

/**
 * 储蓄账户
 */
class SavingsAccount extends BankAccount {
    public SavingsAccount(String accountNumber, double balance) {
        super(accountNumber, balance);
    }

    /**
     * 取款方法
     *
     * @param amount 取款的参数多少
     * @return 返回取款后的余额
     */
    @Override
    public double withdraw(double amount) { // 取款
        if (amount > 0 && amount <= super.balance) {
            System.out.println("取款成功");
            return super.balance -= amount;
        }
        System.out.println("余额不足，取款失败");
        return balance;
    }

    @Override
    public double deposit(double amount) { // 存款
        if (amount > 0) {
            System.out.println("存款成功");
            return super.balance += amount;
        }
        System.out.println("存款失败");
        return super.balance;
    }
}

/**
 * 支票账户
 */
class CheckingAccount extends BankAccount {
    double overdraftLimit;

    public CheckingAccount(String accountNumber, double balance, double overdraftLimit) {
        super(accountNumber, balance);
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public double withdraw(double amount) { // 取款
        if (amount > 0 & amount <= super.balance) {
            System.out.println("取款成功");
            return super.balance -= amount;
        } else {
            System.out.println("余额不足，取款失败");
        }
        return super.balance;
    }

    @Override
    public double deposit(double amount) { // 存款
        if (amount > 0) {
            System.out.println("存款成功");
            return super.balance += amount;
        } else {
            System.out.println("存款失败");
        }
        return super.balance;
    }
}

class BankAccountTest {
    public static void main(String[] args) {
        BankAccount bankAccount = new SavingsAccount("张三", 20000);
        bankAccount.withdraw(2000);// 取款2000
        bankAccount.withdraw(18000);// 取款1800
        bankAccount.displayBalance();
        BankAccount bankAccount1 = new CheckingAccount("李四", 18000, 5000);
        bankAccount1.displayBalance();
    }
}
