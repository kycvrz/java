public class Test03 {
    public static void main(String[] args) {

        // 插入排序
        int[] arr=new int[]{35,76,48,59,77};
        // 假设第一个数是排好的顺序
        // 插入排序
        for (int i=1;i<arr.length;i++){
            int current=arr[i];
            int Indenx=i-1;
            //判断下标不能小于0，后面是否大于前面(成立则进行换位置)
            for (;Indenx>=0 && arr[i]<arr[Indenx];Indenx--) {
                arr[Indenx+1]=arr[Indenx];
                arr[Indenx]=current;
            }
            arr[Indenx+1]=current;
        }
        for (int a:arr ) {
            System.out.print(a+"\t");
        }
    }
}
