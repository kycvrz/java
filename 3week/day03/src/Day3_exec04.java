package thirdweek;

import java.util.Scanner;

public class Day3_exec04 {
    public static void main(String[] args) {
        //编写一个程序，根据用户输入的月份和日期，输出该日期所在的星座。以下是一个简单的星座日期范围参考：
        //水瓶座（1月20日到2月18日）
        //双鱼座（2月19日到3月20日）
        //白羊座（3月21日到4月19日）
        //金牛座（4月20日到5月20日）
        //双子座（5月21日到6月20日）
        //巨蟹座（6月21日到7月22日）
        //狮子座（7月23日到8月22日）
        //处女座（8月23日到9月22日）
        //天秤座（9月23日到10月22日）
        //天蝎座（10月23日到11月21日）
        //射手座（11月22日到12月21日）
        //魔羯座（12月22日到1月19日）
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个月份");
        int month = sc.nextInt();
        System.out.println("请输入一个日期");
        int date = sc.nextInt();
        switch (month){
            case 1:
                if (date>0 && date<=19){
                    System.out.println(month+"月"+date+"日"+"是摩羯座");
                }else if (date<=31){
                    System.out.println(month+"月"+date+"日"+"是水瓶座");
                }else{
                    System.out.println("输入错误");
                }
                break;
            case 2:
                if (date>0 && date<=18){
                    System.out.println(month+"月"+date+"日"+"是水瓶座");
                }else if (date<=29){
                    System.out.println(month+"月"+date+"日"+"是双鱼座");
                }else{
                    System.out.println("输入错误");
                }
                break;
            case 3:
                if (date>0 && date<=20){
                    System.out.println(month+"月"+date+"日"+"是双鱼座");
                }else if (date<=31){
                    System.out.println(month+"月"+date+"日"+"是白羊座");
                }else{
                    System.out.println("输入错误");
                }
                break;
            case 4:
                if (date>0 && date<=19){
                    System.out.println(month+"月"+date+"日"+"是白羊座");
                }else if (date<=30){
                    System.out.println(month+"月"+date+"日"+"是金牛座");
                }else{
                    System.out.println("输入错误");
                }
                break;
            case 5:
                if (date>0 && date<=20){
                    System.out.println(month+"月"+date+"日"+"是金牛座");
                }else if (date<=31){
                    System.out.println(month+"月"+date+"日"+"是双子座");
                }else{
                    System.out.println("输入错误");
                }
                break;
            case 6:
                if (date>0 && date<=20){
                    System.out.println(month+"月"+date+"日"+"是双子座");
                }else if (date<=30){
                    System.out.println(month+"月"+date+"日"+"是巨蟹座");
                }else{
                    System.out.println("输入错误");
                }
                break;
            case 7:
                if (date>0 && date<=22){
                    System.out.println(month+"月"+date+"日"+"巨蟹座");
                }else if (date<=31){
                    System.out.println(month+"月"+date+"日"+"是狮子座");
                }else{
                    System.out.println("输入错误");
                }
                break;
            case 8:
                if (date>0 && date<=22){
                    System.out.println(month+"月"+date+"日"+"是狮子座");
                }else if (date<=31){
                    System.out.println(month+"月"+date+"日"+"是处女座");
                }else{
                    System.out.println("输入错误");
                }
                break;
            case 9:
                if (date>0 && date<=22){
                    System.out.println(month+"月"+date+"日"+"是处女座");
                }else if (date<=30){
                    System.out.println(month+"月"+date+"日"+"是天秤座");
                }else{
                    System.out.println("输入错误");
                }
                break;
            case 10:
                if (date>0 && date<=22){
                    System.out.println(month+"月"+date+"日"+"是天秤座");
                }else if (date<=31){
                    System.out.println(month+"月"+date+"日"+"是天蝎座");
                }else{
                    System.out.println("输入错误");
                }
                break;
            case 11:
                if (date>0 && date<=21){
                    System.out.println(month+"月"+date+"日"+"是天蝎座");
                }else if (date<=30){
                    System.out.println(month+"月"+date+"日"+"是射手座");
                }else{
                    System.out.println("输入错误");
                }
                break;
            case 12:
                if (date<=30){
                    System.out.println(month+"月"+date+"日"+"是摩羯座");
                }else{
                    System.out.println("输入错误");
                }
                break;
            default:
                System.out.println("输入错误");
                break;
        }
    }
}
