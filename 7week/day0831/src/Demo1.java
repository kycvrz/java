public class Demo1 {
    public static void test() throws Exception{
        throw new Exception("哈哈哈");
    }

    public static void main(String[] args) {
        try{
            test();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
