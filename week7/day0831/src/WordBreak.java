import java.util.Arrays;

public class WordBreak {
    // 给定一个非空字符串和一个包含非空单词列表的字典，
    // 编写一个函数来确定字符串是否可以被空格拆分为一个或多个字典中的单词。
    public static boolean wordBreak(String s, String[] wordDict) {
        boolean[] dp=new boolean[s.length()];// 动态规划去实现，最后一个就是所要的结果
        int index=0;
        for (int i = 0; i < s.length(); i++) {
            String str=s.substring(index,i+1);
            for (int j = 0; j < wordDict.length; j++) {
                if (str.equals(wordDict[j])){
                    dp[i]=true;
                    index=i+1;
                    break;
                }
            }
        }
        System.out.println(Arrays.toString(dp));
        return dp[s.length()-1];
    }
    public static void main(String[] args) {
        String string = "hellocode";
        String[] wordDict = {"hello", "code"};
        System.out.println(wordBreak(string, wordDict)); // 输出: true
    }
}
