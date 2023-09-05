package exec;

import java.util.Iterator;
import java.util.Vector;

public class CommodityPrices {
    // 创建⼀个Vector集合，⽤于存储⼀组商品的价格。编写⼀个函数，计算并返回所有商品价格的平均值。
    public static void main(String[] args) {
        Vector vector=new Vector();
        vector.add(25.0);
        vector.add(2.5);
        vector.add(15.0);
        vector.add(8.0);
        System.out.println(calculateAveragePrice(vector));
    }
    public static double calculateAveragePrice(Vector vector){
        double sumPrice=0;
        Iterator iterator=vector.iterator();// Iterator是一个接口
        while (iterator.hasNext()){
            sumPrice+=(double)iterator.next();
        }
//        for (int i = 0; i < vector.size(); i++) {
//            sumPrice +=(double) vector.get(i);
//        }
        return sumPrice/vector.size();
    }
}
