import java.util.Arrays;

public class Test {
//    public static void main(String[] args) {
//        int[] ages = {32,43,444,32,'a'};
//        System.out.println(ages[4]);
//    }
public static void turn(char[] a){
    for (int i = 0; i < a.length/2; i++) {
        char temp=a[i];
        a[i]=a[a.length-1-i];
        a[a.length-1-i]=temp;
    }
    System.out.println(Arrays.toString(a));
}
    public static void main(String[] args){
        char[][] chunXiao={
                {'春', '眠', '不', '觉', '晓'},
                {'处', '处', '闻', '啼', '鸟'},
                {'夜', '来', '风', '雨', '声'},
                {'花', '落', '知', '多', '少'}
        };
        for (char[] chars : chunXiao) {
            turn(chars);
        }
    }
}
