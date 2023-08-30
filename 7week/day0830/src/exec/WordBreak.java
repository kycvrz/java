package exec;
public class WordBreak {
    public static void main(String[] args) {
        // 给定一个非空字符串和一个包含非空单词列表的字典，
        // 编写一个函数来确定字符串是否可以被空格拆分为一个或多个字典中的单词。
//        Scanner sc=new Scanner(System.in);
//        System.out.println("请输入一个费控字符串");
//        String str=sc.next();
        String str="helloworld";
        String[] strings={"hello","world","hi"};
        String string = "hellocode";
        String[] wordDict = {"heqllo", "codde"};
        System.out.println(wordBreak(string, wordDict)); // 输出: true
    }
    public static boolean wordBreak(String s,String[] wordDict) {
        for (int i = 1; i <s.length()+1; i++) {
            for (int j = 0; j <=i; j++) {
                if (isContains(s.substring(j,i),wordDict)){
                    return true;
                }
            }
        }
        return false;
    }
    public static boolean isContains(String str,String[] wordDict){
        for (int i = 0; i < wordDict.length; i++) {
            if (str.contains(wordDict[i])){// wordDict[i].equals(str)
                return true;
            }
        }
        return false;
    }
}