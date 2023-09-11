package exec;

import java.sql.SQLOutput;
import java.time.LocalDate;
import java.util.*;

public class Exec05 {
    public static void main(String[] args) {
        // 编写一个生日提醒程序，使用Map来存储人名和对应的生日日期。根据日期提醒用户哪些人今天过生日？
        // 如何筛选显⽰出最近七天过⽣⽇的用户
        Map<String,LocalDate> map=new HashMap<>();
        map.put("黄子韬",LocalDate.of(1993,5,2));
        map.put("成毅",LocalDate.of(1990,5,17));
        map.put("罗云熙",LocalDate.of(1988,7,28));
        map.put("李钟硕",LocalDate.of(1989,9,14));
        map.put("张凌赫",LocalDate.of(1997,12,30));
        map.put("张三",LocalDate.of(2023,9,11));
        LocalDate today=LocalDate.now();
//        System.out.println(today);
        for (String t:map.keySet()) {
            LocalDate localDate=map.get(t);
//            System.out.println(localDate);
            if (localDate.equals(today)){
                System.out.println(t+"今天过生日");
            }
        }
        for (String t:map.keySet()) {
            LocalDate birthday=map.get(t);
            LocalDate sevenDaysAgo=today.minusDays(7);
            LocalDate sevenDaysLater=today.plusDays(7);
            if ((birthday.isAfter(sevenDaysAgo) && birthday.isBefore(today))
                    || (birthday.isAfter(today) && birthday.isBefore(sevenDaysLater))){
                System.out.println(t+"在最近七天过生日");
            }
        }
        LocalDate sevenDaysAgo1=today.plusDays(7);
        System.out.println(sevenDaysAgo1);
    }
}
