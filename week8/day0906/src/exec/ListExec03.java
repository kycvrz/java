package exec;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class ListExec03 {
    public static void main(String[] args) {
        ArrayList arrayList=new ArrayList();
        ArrayList arrayList1=new ArrayList();
        arrayList.add(1);
        arrayList.add(5);
        arrayList.add(3);
        arrayList.add(8);
        arrayList1.add(3);
        arrayList1.add(6);
        arrayList1.add(5);
        arrayList.removeAll(arrayList1);
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }
    }
}
