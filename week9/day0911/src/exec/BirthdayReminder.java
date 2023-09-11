package exec;

import java.time.LocalDate;
import java.time.Month;
import java.util.HashMap;
import java.util.Map;

public class BirthdayReminder {
    public static void main(String[] args) {
        // 创建一个存储生日信息的Map
        Map<String, LocalDate> birthdays = new HashMap<>();
        birthdays.put("Alice", LocalDate.of(2000, Month.JANUARY, 15));
        birthdays.put("Bob", LocalDate.of(1995, Month.MARCH, 20));
        birthdays.put("Charlie", LocalDate.of(1998, Month.MAY, 5));
        birthdays.put("David", LocalDate.of(1990, Month.AUGUST, 10));
        birthdays.put("Smith", LocalDate.of(1990, Month.SEPTEMBER, 10));

        // 获取今天的日期
        LocalDate today = LocalDate.now();
        System.out.println(today);

        // 遍历Map，查找最近七天过生日的用户
        for (Map.Entry<String, LocalDate> entry : birthdays.entrySet()) {
            String name = entry.getKey();
            LocalDate birthday = entry.getValue();

            // 计算生日日期在最近七天内的用户
            LocalDate sevenDaysAgo = today.minusDays(7);
            LocalDate nextWeek = today.plusDays(7);

            if (birthday.isEqual(sevenDaysAgo) || birthday.isEqual(nextWeek)) {
                System.out.println(name + "的生日在最近七天内！");
            }
        }
    }
}

