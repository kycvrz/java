## 正则表达式
正则表达式（Regular Expression，简称正则或正则表达式）是一种用于匹配、搜索、替换字符串的强大工具。它是由字符和特殊符号组成的模式，用于描述字符串的特定格式或结构。

正则表达式常用于以下场景：
- 验证输入数据的格式，如邮箱、电话号码、身份证号等。
- 在文本中查找、提取符合特定格式的内容。
- 替换文本中的部分内容。
- 进行字符串的分割。

在Java中，使用 `java.util.regex` 包来操作正则表达式。以下是一些常见的正则表达式操作方法：

1. `matches(String regex)`：判断字符串是否与正则表达式匹配。
2. `Pattern.compile(String regex)`：编译正则表达式为一个 `Pattern` 对象。
3. `Matcher`：通过 `Pattern.matcher(CharSequence input)` 方法获取 `Matcher` 对象，用于对字符串进行匹配和操作。

以下是一个简单的示例代码，展示如何使用正则表达式在字符串中查找邮箱地址：
```java
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexExample {
    public static void main(String[] args) {
        String text = "My email addresses are john@example.com and alice@example.com.";
        String regex = "\\w+@\\w+\\.\\w+"; // 匹配邮箱地址的正则表达式

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            String email = matcher.group(); // 获取匹配到的邮箱地址
            System.out.println("Found email: " + email);
        }
    }
}
```

在上述代码中，我们使用正则表达式 `\w+@\w+\.\w+` 来匹配邮箱地址。运行代码将输出：
```
Found email: john@example.com
Found email: alice@example.com
```

请注意，正则表达式的语法和规则很多，你可以根据需要学习更多内容以灵活应用。