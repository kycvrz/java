package thirdweek.day04;

public class Day4_test11 {
    public static void main(String[] args) {
        for (int i=1;i<=3;i++){
            for (int j=0;j<5-i;j++){
                System.out.print("  ");
            }
            for (int j=0;j<2*i-1;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i=1;i<=3;i++){
            for (int j=0;j<4-i;j++){
                System.out.print("  ");
            }
            for (int j=0;j<2*i+1;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i=1;i<=3;i++){
            for (int j=0;j<3-i;j++){
                System.out.print("  ");
            }
            for (int j=0;j<3+2*i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i=1;i<=3;i++){
            for (int j=0;j<2;j++){
                System.out.print("  ");
            }
            for (int j=0;j<5;j++){
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
