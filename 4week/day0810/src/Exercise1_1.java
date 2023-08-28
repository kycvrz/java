public class Exercise1_1 {
    public static void main(String[] args) {
        // 编写一个Java程序，使用循环计算π的近似值。可以使用Leibniz级数来近似的值:  π= 4 * (1/1- 1/3+
        // 1/5 - 1/7 + 1/9 - 1/11 + ...)，通过增加级数项的数量来改进近似结果。(2*i+1)
        // π的无穷级数展开式,计算到1000000项时，π的近似值为：3.1415916535897743
        double sum=0;
        for (int i = 0; i < 1000000; i++) {
            if (i%2==0){
                sum+=1.0/(i*2+1);
            }else{
                sum-=1.0/(i*2+1);
            }
        }
        System.out.println(sum);
        double count=4*sum;
        System.out.println(count);
    }
}
