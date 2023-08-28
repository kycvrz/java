package thirdweek.day05;

public class Day5_test02 {
    public static void main(String[] args) {
        // 打印100以内除了尾数为3,5,7的所有数
        for (int i=1;i<=100;i++){
            int gewei=i%10;
            if (gewei!=3 && gewei!=5 && gewei!=7){
                System.out.println(i);
            }
        }
//        for (int i=1;i<=100;i++){
//            int gewei=i%10;
//            if (gewei==3 || gewei==5 || gewei==7){
//                continue;
//            }
//            System.out.println(i);
//        }
    }
}
