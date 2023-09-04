public class Exec01 {
    public static void main(String[] args) {
        // “Java语言是面向对象的，Java语言是健壮的，Java语言是安全的，
        // Java是高性能的，Java语言是跨平台的”。请编写程序，统计该文本中"Java"一词出现的次数
        String str="Java语言是面向对象的，Java语言是健壮的，Java语言是安全的，Java是高性能的，Java语言是跨平台的";
        // substring(int beginIndex, int endIndex)
        int count=0;
        int index=str.indexOf("Java");// 第一次出现的下标
        while (index>=0){
            count++;
            str=str.substring(index+4);// 下次开始的位置
            index=str.indexOf("Java");
        }
        System.out.println(count);
    }
}
