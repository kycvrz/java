package exec;

import java.util.HashSet;
import java.util.Set;

public class Exec01 {
    public static void main(String[] args) {
        // 使⽤⼀个Set集合存储多个元素。计算集合中共有多少个不重复元素并输出。
        Set set=new HashSet();
        set.add(1);
        set.add(1);
        set.add(2);
        set.add(4);
        set.add(5);
        set.add(5);
        System.out.println(set.size());
    }
}
