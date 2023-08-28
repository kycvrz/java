package bankaccount;

public class BankAccount {
    // 属性：账户号码（accountNumber）、账户持有人姓名（accountHolder）、余额（balance）
    //方法：构造方法、获取账户号码的方法、获取账户持有人姓名的方法、获取余额的方法、存款方法、取款方法
    private String accountNumber;
    private String accountHolder;
    private double balance;
    public BankAccount(){}
    public BankAccount(String accountHolder,String accountNumber){// 有参方法
        this.accountNumber=accountNumber;
        this.accountHolder=accountHolder;
//        this.balance=balance;
    }
    public String getAccountNumber(){
        return this.accountNumber;
    }
    public void setAccountNumber(String accountNumber){
        this.accountNumber=accountNumber;
    }
    public String getAccountHolder(){
        return this.accountHolder;
    }
    public void setAccountHolder(String accountHolder){
        this.accountHolder=accountHolder;
    }
    public double getBalance(){
        return this.balance;
    }
    public void setBalance(double balance){
        this.balance=balance;
    }
    public String info(){// 查看账户信息
        return "账户名称："+this.accountHolder+",账户编号："+this.accountNumber+",账户余额："+this.balance;
    }
    public boolean deposit(double amount){// 存款方法
        if (amount>0){
            this.balance+=amount;
            return true;
        }else{
            System.out.println("输入不合理");
            return false;
        }
    }
    public boolean withdrawal(double amount){// 取款方法
        if (amount>0 && amount<balance){
            System.out.println("取款成功");
            balance-=amount;
            return true;
        }else{
            System.out.println("你输入的金额不对,取款失败");
            return false;
        }
    }
}
