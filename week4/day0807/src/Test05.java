package day0807;

public class Test05 {
    public static void main(String[] args) {
        // 创建长度为10的int型数组，初始值为1、2、3、4、5、6、7、8、9、10，按照下列规则更新数组中每一个元素的值
        // a)数组的第n位元素 = 数组的第n-1位元素 * 数组的第n位素 * 数的第n+1位元素
        // b)如果n = 1，则数组的第n-1位元素的值按1计算。
        // c)如果n = 10，则数组的第n+1位元素的值按1计算。
        // 更新后输出数组元素值应为: 2，6，24，60，120，210，336，504，720，90
        int[] a=new int[10];// 定义数组变量
        int[] b=new int[10];// 定义新数组变量
        for (int i=0;i<a.length;i++){
            a[i]=i+1;// 初始数组的值
        }
        for (int i=0;i<a.length;i++){
            if (i==0){ // 当n=1时
                b[i]=1*a[i]*a[i+1];
            }else if (i==9){ // 当n=10时
                b[i]=a[i-1]*a[i]*1;
            }else{
                b[i]=a[i-1]*a[i]*a[i+1];
            }
        }
        for (int i = 0; i <b.length; i++) {
            System.out.println(b[i]);
        }
    }
}
