import java.util.Vector;

public class Test {
    public static void main(String[] args) {
        Vector vector=new Vector();
        vector.add("莲花楼");
        vector.add("长相思");
        vector.add("长月烬明");
        vector.add("花千骨");
        testSort(vector);
        for (Object t:vector) {
            System.out.println(t);
        }
    }
    public static void testSort(Vector vector){
        // 冒泡排序
        for (int i = 0; i < vector.size()-1; i++) {
            for (int j = 0; j < vector.size()-i-1; j++) {
                String str1=(String) vector.get(j);
                String str2=(String) vector.get(j+1);
                if (str1.compareTo(str2)>0){
                    vector.set(j,str2);
                    vector.set(j+1,str1);
                }
            }
        }
    }
}
