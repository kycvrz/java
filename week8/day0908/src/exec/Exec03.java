package exec;

import java.util.*;
import java.util.function.BiFunction;
import java.util.function.Function;

public class Exec03 {
    static Map<Integer,String> map = new HashMap<Integer, String>();
    public static void main(String[] args) {
        map.put(1, "安琪拉");
        map.put(2, "妲己");
        map.put(3, "貂蝉");
        map.put(4, "大乔");
        while (true){
            menu();
        }
    }
    public static void menu(){
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入要操作序号：");
        System.out.println("1.遍历集合，并将序号与对应⼈名打印");
        System.out.println("2.向该map集合中插⼊⼀个编码为5姓名为⼩乔的信息");
        System.out.println("3.移除该map中的编号为1的信息");
        System.out.println("4.将map集合中编号为2的姓名信息修改为\"孙策\"");
        System.out.println("0.退出");
        int type=sc.nextInt();
        switch(type){
            case 1->traverse(map);
            case 2->{
                insertMessage();
                traverse(map);
            }
            case 3->{
                removeMessage();
                traverse(map);
            }
            case 4->{
                modifyMessage();
                traverse(map);
            }
            case 0->{
                System.exit(1);
            }
        }
    }
    public static void traverse(Map<Integer,String> map){
        // 迭代遍历
        Set<Integer> set=map.keySet();
        Iterator<Integer> iterator=set.iterator();
        while (iterator.hasNext()){
            int t=iterator.next();
            String str=map.get(t);
            System.out.println("序号："+t+",姓名："+str);
        }
    }
    public static void insertMessage(){
        // key不存在 选择computeTfAbsent 或者 compute
        map.computeIfAbsent(5, new Function<Integer, String>() {
            @Override
            public String apply(Integer integer) {
                return "小乔";
            }
        });
    }
    public static void removeMessage(){
        // key 存在 选择computeIfPresent 或者 compute
        map.computeIfPresent(1, new BiFunction<Integer, String, String>() {
            @Override
            public String apply(Integer integer, String s) {
                return null;
            }
        });
    }
    public static void modifyMessage(){
        // key 存在 选择computeIfPresent 或者 compute
        map.computeIfPresent(2, new BiFunction<Integer, String, String>() {
            @Override
            public String apply(Integer integer, String s) {
                return "孙策";
            }
        });
    }
}
