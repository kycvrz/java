package exec;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Map;

public class BirthdayReminder1 {
    public static void main(String[] args) {
        // 创建一个Map来存储名字和生日
        Map<String, LocalDate> birthdays = new HashMap<>();
        birthdays.put("Alice", LocalDate.of(1990, 5, 23));
        birthdays.put("Bob", LocalDate.of(1992, 3, 15));
        birthdays.put("Charlie", LocalDate.of(1994, 7, 12));

        // 获取今天的日期
        LocalDate today = LocalDate.now();

        // 创建一个日期格式化对象
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        // 遍历Map并检查哪些人的生日是最近七天之内
        for (Map.Entry<String, LocalDate> entry : birthdays.entrySet()) {
            LocalDate birthday = entry.getValue();
            LocalDate sevenDaysAgo = today.minusDays(7);
            if (birthday.isAfter(sevenDaysAgo) && birthday.isEqual(today)) {
                System.out.println(entry.getKey() + "的生日是今天!");
            } else if (birthday.isAfter(sevenDaysAgo) && birthday.isBefore(today)) {
                System.out.println(entry.getKey() + "的生日已经过去了!");
            } else if (birthday.isBefore(sevenDaysAgo)) {
                System.out.println(entry.getKey() + "的生日还在未来!");
            }
        }
    }
}
