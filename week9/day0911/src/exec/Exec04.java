package exec;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Exec04 {
    public static void main(String[] args) {
        // 有一个整数集合，求每个元素平方的平均值。
        List<Integer> list=new ArrayList<>();
        Collections.addAll(list,4,5,7,9,3,7);
        List<Integer> list1=list.stream().map(new Function<Integer, Integer>() { // 平方
            @Override
            public Integer apply(Integer integer) {
                return integer*integer;
            }
        }).collect(Collectors.toList());
        System.out.println(list1);
        Integer i=list1.stream().reduce(new BinaryOperator<Integer>() { // 求和
            @Override
            public Integer apply(Integer integer, Integer integer2) {
                return integer+integer2;
            }
        }).get()/list1.size();
        System.out.println(i);

    }
}
