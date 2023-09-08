package exec;

import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;

public class DateHashSetDemo {
    public static void main(String[] args) {
        HashSet dateSet = new HashSet();

        // 添加日期对象到集合
        dateSet.add(new Date(121, 0, 1)); // 2021年1月1日
        dateSet.add(new Date(120, 11, 31)); // 2020年12月31日
        dateSet.add(new Date(122, 3, 15)); // 2022年4月15日
        dateSet.add(new Date(119, 8, 10)); // 2019年9月10日

        // 找到最早日期和最晚日期
        Iterator iterator = dateSet.iterator();
        Date earliestDate = null;
        Date latestDate = null;

        while (iterator.hasNext()) {
            Date currentDate = (Date) iterator.next();
            if (earliestDate == null || currentDate.before(earliestDate)) {
                earliestDate = currentDate;
            }
            if (latestDate == null || currentDate.after(latestDate)) {
                latestDate = currentDate;
            }
        }

        System.out.println("最早的日期: " + earliestDate);
        System.out.println("最晚的日期: " + latestDate);
    }
}

