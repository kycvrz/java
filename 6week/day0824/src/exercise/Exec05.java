package exercise;

import java.util.Scanner;

public class Exec05 {
    public static void main(String[] args) {
        // 控制台输入一个计算公式(包含 + / - / * / / 4种运算符号)，计算出结果
        //要求:
        //1.满⾜运算规则，乘除的优先级⼤于加减
        //2.例如，输⼊：1+2*3-4/2 =5
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入你要计算的式子");
        String str=sc.next();
        int result=calculate(str);
        System.out.println(result);
    }
    public static int calculate(String str){
        str=str.replace(" ","");
        while(str.indexOf('*')!=-1 || str.indexOf('/')!=-1){
            int index=str.indexOf("*");// 乘法的下标 有0 / 没有-1
            int index2=str.indexOf("/");// 除法的下标 有0 / 没有-1
            if (index==-1){// 没有乘法
                index=index2;// 就让除法的下标等于它 0 / -1
            }else if (index2==-1 && index2 < index){// 没有除法 并且除法在乘法左边
                index=index2;
            }
            int left=index-1;// 记录下标
            int right=index+1;// 记录下标
            while(left>=0 && Character.isDigit(left)){
                left--;
            }
            while (right<str.length() && Character.isDigit(right)){
                right++;
            }
            int leftNumber=Integer.parseInt(str.substring(left+1,index));// 将字符串转为int类型 拆箱
            int rightNumber=Integer.parseInt(str.substring(index+1,right));// 将字符串转为int类型 拆箱
//            int c=0;
            int c=str.charAt(index)=='*'?leftNumber*rightNumber:leftNumber/rightNumber;
//            if (str.charAt(index)=='*'){
//                c=leftNumber*rightNumber;
//            }else{
//                c=leftNumber/rightNumber;
//            }
            str=str.substring(0,left+1)+c+str.substring(right);
        }
        while (str.indexOf('-')!=-1 || str.indexOf('+')!=-1){
            int index=str.indexOf('+');
            int index2=str.indexOf('-',1);
            if (index==-1){// 如果第一位是负数,直接结束循环
                break;
            }
            if (index==-1){// 没有减法
                index=index2;
            }else if (index2==-1 && index2<index){ // 没有加法 并且减法在乘法之前
                index=index2;
            }
            int left=index+1;
            int right=index;
            while(left>=0 && Character.isDigit(left)){
                left--;
            }
            while(right<str.length() && Character.isDigit(right)){
                right++;
            }
            int leftNumber=Integer.parseInt(str.substring(left-1,index));
            int rightNumber=Integer.parseInt(str.substring(index+1,right));
            int c=str.indexOf('+')==-1 ? leftNumber+rightNumber:leftNumber-rightNumber;
            str=str.substring(0,left+1)+c+str.substring(right);
        }
        int result=Integer.parseInt(str);
        return result;
    }
}
