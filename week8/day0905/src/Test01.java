import java.util.Comparator;
import java.util.Vector;

public class Test01 {
    public static void main(String[] args) {
        Vector vector = new Vector();
        vector.add(new Actor("赵丽颖", "花千骨",18008));
        vector.add(new Actor("成毅", "莲花楼",20000));
        vector.add(new Actor("罗云熙", "长月烬明",18000));
        vector.add(new Actor("杨紫","长相思",16900));
        // 修改指定位置的值
        Object obj=vector.get(3);// 获取指定位置的元素
        if (obj instanceof Actor t){
            t.setName("杨幂");
        }
        // 用匿名类排序
//        vector.sort(new Comparator() {
//            @Override
//            public int compare(Object o1, Object o2) {
//                if (o1 instanceof Actor t1 && o2 instanceof Actor t2){
//                    return t1.getViewCounts()- t2.getViewCounts();
//                }
//                return 0;
//            }
//        });
        // 匿名类转换成lambda表达式
        vector.sort((o1,o2)->{ // 传两个元素
            if (o1 instanceof Actor t1 && o2 instanceof Actor t2){
                return t2.getViewCounts()- t1.getViewCounts();
            }
            return 0;
        });
        for (int i = 0; i < vector.size(); i++) {
            System.out.println(vector.get(i));
        }
    }

}
