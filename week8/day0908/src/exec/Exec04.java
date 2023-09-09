package exec;

import java.util.*;

public class Exec04 {
    public static void main(String[] args) {
        List<Account> list = new ArrayList<>();
        list.add(new Account(10.00, "1234"));
        list.add(new Account(15.00, "5678"));
        list.add(new Account(30.00, "1010"));
//        for (int i = 0; i < list.size(); i++) {
//            System.out.println(list.get(i));
//        }
        Map<Long, Account> map = new HashMap<>();
        for (Account account : list) {
            map.put(account.getId(), account);
        }
        // lambda表达式遍历
        map.forEach((key, value) -> System.out.println(value));
    }
}

class Account {
    private long id;
    private double balance;
    private String password;
    private static int i=1;// static 初始化一次 如果是实例变量时 每次创建对象时都是1

    public Account(double balance, String password) {
//        Random sc = new Random();
//        this.id = sc.nextInt(40);
        this.id=i++;
        this.balance = balance;
        this.password = password;
    }
    public long getId() {
        return id;
    }


    @Override
    public String toString() {
        return "Account{" +
                "账号：" + id +
                ", 余额：" + balance +
                '}';
    }
}
