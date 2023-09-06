package exec;

import java.util.ArrayList;
import java.util.List;

public class ListExec02 {
    public static void main(String[] args) {
        // 有两个List集合, 计算两个集合的交集元素。
        List list=new ArrayList();
        List list1=new ArrayList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list1.add(1);
        list1.add(3);
        list1.add(2);
        list1.add(6);
        list.retainAll(list1);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
