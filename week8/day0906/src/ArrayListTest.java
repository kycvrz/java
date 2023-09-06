import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList arrayList =new ArrayList();
        arrayList.add("粉色水杯");
        arrayList.add("芭比娃娃");
        arrayList.add("保温水杯");
        arrayList.add("玻璃水杯");
//        List list=List.of();
//        list.add();
        arrayList.add("兰蔻口红");
        arrayList.add("圣罗兰口红");
        arrayList.add("3ce口红");
        // 删除购物车中的所有水杯
        // 首先遍历集合，找水杯并且删除
        // for 循环遍历
        for (int i = 0; i < arrayList.size(); i++) {
            String str=(String) arrayList.get(i);
            if (str.contains("水杯")){
                arrayList.remove(i);
                i--;
            }
        }
        // 使用迭代器删除
        Iterator iterator=arrayList.iterator();
        while (iterator.hasNext()){
            String str=(String)iterator.next();
            if (str.contains("口红")){
                iterator.remove();
            }
        }
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }
    }
}
