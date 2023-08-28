package thirdweek.test;

public class Demo {
    public static void main(String[] args){
        int first=0;
        int second=1;
        int third=0;
        for(int i=0;i<=10;i++){
            third=first+second;
            first=second;
            second=third;
            System.out.print(first+" ");
        }
    }
}
