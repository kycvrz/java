import java.util.Scanner;

public class Inter {
    // 给定一个数组，根据用户输入的数据在数组的指定位置插入指定的值

    public static void interNumber(int[] arr1,int[] arr,int number,int Index){
        System.arraycopy(arr,0,arr1,0,Index);
        arr1[Index]=number;
        System.arraycopy(arr,Index,arr1,Index+1,arr.length-Index);
    }
    public static void main(String[] agrs){
        int[] arr=new int[]{65,78,98,45,77,68};
        int[] arr1=new int[arr.length+1];
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一个数字");
        int number= sc.nextInt();
        System.out.println("请输入你插入数字的指定位置");
        int Index=sc.nextInt();
        int i=0;
        while (true){
            if (Index>=0 && Index<arr.length){
                break;
            }else{
                System.out.println("请重新输出插入数字的位置");
                Index=sc.nextInt();
            }
            i++;
        }
        interNumber(arr1,arr,number,Index);
        for (int a:arr1) {
            System.out.print(a+"\t");
        }
    }
}
