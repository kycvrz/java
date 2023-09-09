import java.util.*;

class Account {
    private static int nextId = 1;
    private int id;
    private double balance;

    public Account(double balance) {
        this.id = nextId++;
        this.balance = balance;
    }

    public int getId() {
        return id;
    }

    public double getBalance() {
        return balance;
    }
}

public class AccountMapDemo {
    public static void main(String[] args) {
        List<Account> accountList = new ArrayList<>();

        // 创建一些账户对象并添加到列表中
        accountList.add(new Account(1000.0));
        accountList.add(new Account(2000.0));
        accountList.add(new Account(3000.0));

        // 将账户对象放入Map中，以ID作为键
        Map<Integer, Account> accountMap = new HashMap<>();
        for (Account account : accountList) {
            accountMap.put(account.getId(), account);
        }

        // 遍历Map并打印所有Account对象的ID和余额
        for (Map.Entry<Integer, Account> entry : accountMap.entrySet()) {
            int accountId = entry.getKey();
            Account account = entry.getValue();
            double balance = account.getBalance();
            System.out.println("Account ID: " + accountId + ", Balance: " + balance);
        }
    }
}

