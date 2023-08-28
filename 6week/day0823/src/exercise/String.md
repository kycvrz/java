## String类

当你使用Java中的`String`类时，你可以利用它提供的方法来操作和处理字符串。以下是`String`类常用的方法总结：

1. 构造方法：
   - `String()`：创建一个空字符串。
   - `String(char[] chars)`：使用字符数组创建字符串。
   - `String(char[] chars, int offset, int count)`：使用字符数组的子串创建字符串。
   - `String(String original)`：使用现有字符串创建新字符串的副本。

2. 常用方法：
   - `length()`：返回字符串的长度。
   - `charAt(int index)`：返回指定位置的字符。
   - `substring(int beginIndex)`：返回从指定位置到末尾的子串。
   - `substring(int beginIndex, int endIndex)`：返回指定范围的子串。
   - `concat(String str)`：连接字符串。
   - `equals(Object another)`：比较字符串是否相等。
   - `equalsIgnoreCase(String another)`：忽略大小写比较字符串是否相等。
   - `startsWith(String prefix)`：判断是否以指定前缀开始。
   - `endsWith(String suffix)`：判断是否以指定后缀结束。
   - `isEmpty()`：判断字符串是否为空。
   - `contains(CharSequence sequence)`：判断是否包含指定子序列。
   - `indexOf(String str)`：返回指定子串在字符串中的第一个出现位置。
   - `lastIndexOf(String str)`：返回指定子串在字符串中的最后一个出现位置。
   - `replace(char oldChar, char newChar)`：替换指定字符。
   - `replaceAll(String regex, String replacement)`：使用正则表达式替换匹配的内容。
   - `toLowerCase()`：将字符串转换为小写。
   - `toUpperCase()`：将字符串转换为大写。
   - `trim()`：去除字符串首尾空白字符。
   - `split(String regex)`：按照正则表达式分割字符串。
   - `matches(String regex)`：判断字符串是否匹配正则表达式。
   - `valueOf()`：将其他数据类型转换为字符串。

3. 正则表达式相关：
   - `matches(String regex)`：判断字符串是否匹配正则表达式。
   - `split(String regex)`：使用正则表达式分割字符串。

这些只是`String`类的一部分方法。在实际编程中，你可以根据需要灵活使用这些方法来处理和操作字符串。

### 静态方法

```
copyValueOf(char[] data)
```

等效于 [`valueOf（char[\]）。`](#valueOf(char[]))

```
copyValueOf(char[] data, int offset, int count)
```

等效于 [`valueOf（char[\]， int， int）。`](#valueOf(char[],int,int))

```
format(String format, Object... args)
```

使用指定的格式字符串返回格式化字符串，并且 参数。

```
format(Locale l, String format, Object... args)
```

返回使用指定的区域设置、格式字符串、 和论据。

```
join(CharSequence delimiter, CharSequence... elements)
```

返回一个新的字符串，该字符串由联接的副本和 指定的 .`CharSequence elements``delimiter`

```
join(CharSequence delimiter, Iterable<? extends CharSequence> elements)
```

返回由联接的副本组成的新副本以及 指定。`String``CharSequence elements``delimiter`

```
valueOf(boolean b)
```

返回参数的字符串表示形式。`boolean`

```
valueOf(char c)
```

返回参数的字符串表示形式。`char`

```
valueOf(char[] data)
```

返回数组的字符串表示形式 论点。`char`

```
valueOf(char[] data, int offset, int count)
```

返回数组参数的特定子数组的字符串表示形式。`char`

```
valueOf(double d)
```

返回参数的字符串表示形式。`double`

```
valueOf(float f)
```

返回参数的字符串表示形式。`float`

```
valueOf(int i)
```

返回参数的字符串表示形式。`int`

```
valueOf(long l)
```

返回参数的字符串表示形式。`long`

```
valueOf(Object obj)
```

返回参数的字符串表示形式。`Object`

### 实例方法

```
char
charAt(int index)
```

返回 指定的索引。`char`

```
IntStream
chars()
```

返回扩展值的零流 从这个序列。`int``char`

```
int
codePointAt(int index)
```

返回指定位置的字符（Unicode 代码点） 指数。

```
int
codePointBefore(int index)
```

返回指定字符之前的字符（Unicode 代码点） 指数。

```
int
codePointCount(int beginIndex, int endIndex)
```

返回指定文本中 Unicode 码位的数目 这个范围.`String`

```
IntStream
codePoints()
```

从此序列返回代码点值流。

```
int
compareTo(String anotherString)
```

按字典顺序比较两个字符串。

```
int
compareToIgnoreCase(String str)
```

按字典顺序比较两个字符串，忽略大小写 差异。

```
String
concat(String str)
```

将指定的字符串连接到此字符串的末尾。

```
boolean
contains(CharSequence s)
```

当且仅当此字符串包含指定的 字符值的序列。

```
boolean
contentEquals(CharSequence cs)
```

将此字符串与指定的 .`CharSequence`

```
boolean
contentEquals(StringBuffer sb)
```

将此字符串与指定的 .`StringBuffer`

```
Optional<String>
describeConstable()
```

返回一个 [`Optional`](../util/Optional.html) ，其中包含此 实例，即实例本身。

```
boolean
endsWith(String suffix)
```

测试此字符串是否以指定的后缀结尾。

```
boolean
equals(Object anObject)
```

将此字符串与指定的对象进行比较。

```
boolean
equalsIgnoreCase(String anotherString)
```

将此与另一个，忽略案例进行比较 考虑。`String``String`

```
String
formatted(Object... args)
```

使用此字符串作为格式字符串的格式，以及提供的 参数。

```
byte[]
getBytes()
```

使用 平台的默认字符集，将结果存储到新的字节数组中。`String`

```
void
getBytes(int srcBegin, int srcEnd, byte[] dst, int dstBegin)
```

**荒废的。**

此方法未正确将字符转换为 字节。

```
byte[]
getBytes(String charsetName)
```

使用命名的 字符集，将结果存储到新的字节数组中。`String`

```
byte[]
getBytes(Charset charset)
```

使用给定[的字符集](../nio/charset/Charset.html)将其编码为字节序列，并将结果存储到 新字节数组。`String`

```
void
getChars(int srcBegin, int srcEnd, char[] dst, int dstBegin)
```

将此字符串中的字符复制到目标字符中 数组。

```
int
hashCode()
```

返回此字符串的哈希代码。

```
String
indent(int n)
```

根据 的值调整此字符串的每一行的缩进，并规范化行终止字符。`n`

```
int
indexOf(int ch)
```

返回此字符串中第一次出现的索引 指定的字符。

```
int
indexOf(int ch, int fromIndex)
```

返回此字符串中第一次出现的索引 指定字符，从指定的索引处开始搜索。

```
int
indexOf(String str)
```

返回此字符串中第一次出现的索引 指定的子字符串。

```
int
indexOf(String str, int fromIndex)
```

返回此字符串中第一次出现的索引 指定的子字符串，从指定的索引开始。

```
String
intern()
```

返回字符串对象的规范表示形式。

```
boolean
isBlank()
```

如果字符串为空或仅包含[空格](Character.html#isWhitespace(int))代码点，则返回， 否则。`true``false`

```
boolean
isEmpty()
```

返回当且仅当 [`length（）`](#length()) 为 。`true``0`

```
int
lastIndexOf(int ch)
```

返回此字符串中最后一次出现的索引 指定的字符。

```
int
lastIndexOf(int ch, int fromIndex)
```

返回此字符串中最后一次出现的索引 指定的字符，从 指定的索引。

```
int
lastIndexOf(String str)
```

返回此字符串中最后一次出现的索引 指定的子字符串。

```
int
lastIndexOf(String str, int fromIndex)
```

返回此字符串中最后一次出现的索引 指定的子字符串，从指定的索引开始向后搜索。

```
int
length()
```

返回此字符串的长度。

```
Stream<String>
lines()
```

返回从此字符串中提取的行流， 由行终止符分隔。

```
boolean
matches(String regex)
```

告知此字符串是否与给定的[正则表达式](../util/regex/Pattern.html#sum)匹配。

```
int
offsetByCodePoints(int index, int codePointOffset)
```

返回其中的索引 与给定的代码点偏移。`String``index``codePointOffset`

```
boolean
regionMatches(boolean ignoreCase, int toffset, String other, int ooffset, int len)
```

测试两个字符串区域是否相等。

```
boolean
regionMatches(int toffset, String other, int ooffset, int len)
```

测试两个字符串区域是否相等。

```
String
repeat(int count)
```

返回一个字符串，其值是 this 的串联 字符串重复多次。`count`

```
String
replace(char oldChar, char newChar)
```

返回将此字符串中的所有匹配项替换为 的字符串。`oldChar``newChar`

```
String
replace(CharSequence target, CharSequence replacement)
```

替换此字符串中与文本目标匹配的每个子字符串 具有指定文本替换序列的序列。

```
String
replaceAll(String regex, String replacement)
```

将此字符串中与给定[正则表达式](../util/regex/Pattern.html#sum)匹配的每个子字符串替换为 给定替换。

```
String
replaceFirst(String regex, String replacement)
```

将此字符串中与给定[正则表达式](../util/regex/Pattern.html#sum)匹配的第一个子字符串替换为 给定替换。

```
String
resolveConstantDesc(MethodHandles.Lookup lookup)
```

将此实例解析为 [`ConstantDesc`](constant/ConstantDesc.html)，其结果为 实例本身。

```
String[]
split(String regex)
```

围绕给定[正则表达式](../util/regex/Pattern.html#sum)的匹配项拆分此字符串。

```
String[]
split(String regex, int limit)
```

围绕给定[正则表达式](../util/regex/Pattern.html#sum)的匹配项拆分此字符串。

```
boolean
startsWith(String prefix)
```

测试此字符串是否以指定的前缀开头。

```
boolean
startsWith(String prefix, int toffset)
```

测试此字符串的子字符串是否以 指定的索引以指定的前缀开头。

```
String
strip()
```

返回一个字符串，其值为此字符串，所有前导 并删除了尾随[空格](Character.html#isWhitespace(int))。

```
String
stripIndent()
```

返回一个字符串，其值为此字符串，并从中删除附带[的空格](Character.html#isWhitespace(int)) 每行的开头和结尾。

```
String
stripLeading()
```

返回一个字符串，其值为此字符串，并删除所有前导[空格](Character.html#isWhitespace(int))。

```
String
stripTrailing()
```

返回一个字符串，其值为此字符串，并删除所有尾随[空格](Character.html#isWhitespace(int))。

```
CharSequence
subSequence(int beginIndex, int endIndex)
```

返回作为此序列的子序列的字符序列。

```
String
substring(int beginIndex)
```

返回一个字符串，该字符串是此字符串的子字符串。

```
String
substring(int beginIndex, int endIndex)
```

返回一个字符串，该字符串是此字符串的子字符串。

```
char[]
toCharArray()
```

将此字符串转换为新的字符数组。

```
String
toLowerCase()
```

将此中的所有字符转换为较低的字符 使用默认区域设置的规则。`String`

```
String
toLowerCase(Locale locale)
```

将此中的所有字符转换为较低的字符 案例使用给定的规则.`String``Locale`

```
String
toString()
```

这个对象（已经是一个字符串！

```
String
toUpperCase()
```

将此字符中的所有字符转换为上层字符 使用默认区域设置的规则。`String`

```
String
toUpperCase(Locale locale)
```

将此字符中的所有字符转换为上层字符 案例使用给定的规则.`String``Locale`

```
<R> R
transform(Function<? super String,? extends R> f)
```

此方法允许将函数应用于字符串。`this`

```
String
translateEscapes()
```

返回一个字符串，其值为此字符串，带有转义序列 翻译为字符串文字。

```
String
trim()
```

返回一个字符串，其值为此字符串，所有前导 和删除尾随空格，其中定义了空格 作为代码点小于或等于（空格字符）的任何字符。`'U+0020'`



