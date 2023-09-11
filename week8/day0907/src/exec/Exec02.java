package exec;

import java.util.*;

public class Exec02 {
    public static void main(String[] args) {
        // 创建一个HashSet，包含一些日期对象 (java.util.Date)。
        // 编写代码，找到集合中的最早日期和最晚日期
        HashSet hashSet = new HashSet();
        Date date1 = new Date(123, 9, 18);
        Date date2 = new Date(113, 7, 11);
        Date date3 = new Date(120, 3, 21);
        Date date4 = new Date(121, 1, 10);
        Date date5 = new Date(118, 9, 8);
        hashSet.add(date1);
        hashSet.add(date2);
        hashSet.add(date3);
        hashSet.add(date4);
        hashSet.add(date5);
        hashSet.forEach(obj-> System.out.println(hashSet));
        List list=new ArrayList(hashSet);
        Collections.sort(list);
        System.out.println("最早日期为："+list.get(0));
        System.out.println("最晚日期为："+list.get(list.size()-1));
        Date earliesDate = null;
        for (Object obj : hashSet) {
            Date date = (Date) obj;
            if (earliesDate == null || date.before(earliesDate)) {
                earliesDate = date;
            }
        }
        Date lateDates = null;
        for (Object obj : hashSet) {
            Date date = (Date) obj;
            if (lateDates == null || date.after(lateDates)) {
                lateDates = date;
            }
        }
//        System.out.println("最早日期为："+earliesDate);
//        System.out.println("最晚日期为："+lateDates);
        Set set=new TreeSet(hashSet);

    }
}

