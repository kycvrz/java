public class Exam03 {
    public int x;
    public static void main(String[] args) {
        Exam03 s=new Exam03();
        int x1 = s.x;
        System.out.println(s);// 地址
        System.out.println(x1);// 创建对象时已经初始化为0
        System.out.println("Value is"+x1);
    }
}
