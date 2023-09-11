package exec;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.BinaryOperator;

public class Exec02 {
    public static void main(String[] args) {
        // 有一个整数集合，分别完成以下操作：
        // 所有元素之和
        // 最⼤值
        // 最⼩值
        List<Integer> list = new ArrayList<>();
        Collections.addAll(list,6,4,9,0,4);
        System.out.println(list);
        Integer i = list.stream().reduce(new BinaryOperator<Integer>() {
            @Override
            public Integer apply(Integer integer, Integer integer2) {
                return integer + integer2;
            }
        }).get();
        System.out.println("所有元素之和为：" + i);
        Integer a = list.stream().min(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        }).get();
        System.out.println("最⼤值：" + a);
        Integer b = list.stream().min(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 - o2;
            }
        }).get();

        System.out.println("最小值：" + b);
    }
}
