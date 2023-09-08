package exec;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListExec01 {
    public static void main(String[] args) {
        // 使⽤⼀个List集合存储多个元素。计算集合中共有多少个不重复元素并输出。
        List list=new ArrayList();
        list.add(1);
        list.add(5);
        list.add(1);
        list.add(3);
        list.add(4);
        list.add(3);
        List list1=new ArrayList();
        int count=0;
//        for (int i = 0; i < list.size(); i++) {
//            int element = (int) list.get(i);
//            boolean isDuplicate = false;
//
//            // 检查元素是否在集合中已经存在
//            for (int j = 0; j < i; j++) {
//                if (list.get(j).equals(element)) {
//                    isDuplicate = true;
//                    break;
//                }
//            }
//            if (!isDuplicate) {
//                count++;
//            }
//        }

        for (int i = 0; i < list.size(); i++) {
            if (list1.contains(list.get(i))){
                continue;
            }
            count++;
            list1.add(list.get(i));
        }
        Iterator iterator=list1.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
//        for (int i = 0; i < list1.size(); i++) {
//            System.out.println(list1.get(i));
//        }
        System.out.println("不重复元素的个数为："+count);
    }
}
