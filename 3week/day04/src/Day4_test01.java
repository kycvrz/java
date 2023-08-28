package thirdweek;

public class Day4_test01 {
    // 需求世界高山珠穆朗玛峰高度：8848860毫米   一张纸厚度0.1毫米 折多少次，可以折成珠穆朗玛峰
    public static void main(String[] args) {
        int count=0;
        for (double j=0.1;j<=8848860;count++){
            j=j*2;
        }
        System.out.println("折"+count+"次可以折成珠穆朗玛峰");
    }

}
