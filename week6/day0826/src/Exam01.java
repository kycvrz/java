public class Exam01 {
    static int arr[] =new int[10];
    private static int a;// 加载类的时候初始化为0
    public static void main(String[] args) {
        System.out.println(arr[1]);// 0
        int a=25;
        int i = a-- / a++;
        System.out.println(i);// 1
        System.out.println(a);// 25
        modify(a);
        System.out.println(a);// 输出的还是初始化的值
    }
    public static void  modify(int a){
        a++;// 没有返回值
    }
}
