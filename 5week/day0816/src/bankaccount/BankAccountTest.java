package bankaccount;

import bankaccount.BankAccount;

import java.util.Scanner;

public class BankAccountTest {
    static BankAccount account=new BankAccount();
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        while (true){
            menu();
            System.out.println("请输入操作内容");
            int op=sc.nextInt();
            switch(op){
                case 1->showInfo();
                case 2->saveMoney();
                case 3->drawMoney();
                case 4->{
                    System.out.println("退出成功");
                    return;
                }
            }
        }
    }
    public static void menu(){
        System.out.println("************");
        System.out.println("1.查看账户信息");
        System.out.println("2.存款");
        System.out.println("3.取款");
        System.out.println("4.退出");
        System.out.println("************");
    }
    public static void showInfo(){
        account.setAccountNumber("12345");
        account.setAccountHolder("张三");
        System.out.println(account.info());
    }
    public static void saveMoney(){
        System.out.println("请输入存款金额");
        double amount=sc.nextInt();
        if (account.deposit(amount)){
            System.out.println("存款成功!"+"剩余金额"+account.getBalance());
        }else{
            System.out.println("存款失败");
        }
    }
    public static void drawMoney(){
        System.out.println("请输入取款金额");
        double amount=sc.nextInt();
        if (account.withdrawal(amount)){
            System.out.println("取款成功!"+"剩余金额"+account.getBalance());
        }else{
            System.out.println("取款失败");
        }
    }
}
