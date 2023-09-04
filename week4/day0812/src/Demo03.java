import java.util.Scanner;

public class Demo03{
    public static void interNumber(int[] arr,int[] arr1,int number,int Index){
        System.arraycopy(arr,0,arr1,0,Index-1);
        arr1[Index-1]=number;
        System.arraycopy(arr,Index-1,arr1,Index,arr1.length-Index);
    }
    public static void main(String[] args){
        int[] arr=new int[]{65,89,77,54,33};
        int[] arr1=new int[arr.length+1];
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入你要插入的数字");
        int number=sc.nextInt();
        System.out.println("请输入你要插入的位置");
        int Index=sc.nextInt();
        while(true){
            if(Index>=0 && Index<arr.length){
                break;
            }else{
                System.out.println("请重新输入插入的位置");
                Index=sc.nextInt();
            }
        }
        interNumber(arr,arr1,number,Index);
        for(int a:arr1){
            System.out.print(a+"\t");
        }
    }
}
