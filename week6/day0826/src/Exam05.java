public class Exam05 {
    public static void main(String[] args) {
        float d= (float) Math.random();
        System.out.println(d);
        Object obj = new int[] {1,2,3};// line 1
        int[] someArray = (int[]) obj;// line 2
        for(int i:someArray){// line 3
            System.out.print(i+" ");
        }
    }
}
