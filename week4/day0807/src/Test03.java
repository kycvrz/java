package day0807;

public class Test03 {
    public static void main(String[] args) {
        // 需求：某部门5名员工的销售额分别是：16、26、36、6、100，请计算出他们部门的总销售额。
        double[] salary=new double[]{16,26,36,61,100};
        double sum=0;
        for (int i=0;i<salary.length;i++){
            sum+=salary[i];
        }
        System.out.println(sum);
    }
}
