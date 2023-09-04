public class Demo {

//    public static void test() throws Exception{
//        throw new Exception("这是一个异常");
//    }
    public static void test() throws MyException{
        throw new MyException("这是一个异常");
    }
    public static void test1() throws Exception{
        try{
            test();
        }catch (Exception e){
            throw new Exception("我又产生了新异常",e);
        }
    }
    public static void test2() throws Exception{
        try{
            test1();
        }catch (Exception e){
            throw new Exception("我也产生了异常",e);
        }
    }
    public static void main(String[] args) {
        try{
            test2();
        }catch (Exception e){
            System.out.println(e.getMessage());// 我也产生了异常
            System.out.println(e.getCause().getMessage());// 我又产生了新异常
            System.out.println(e.getCause().getCause().getMessage());// 这是一个异常
        }
    }
}
class MyException extends Exception{
    public MyException(String message){
        super(message);
    }
}
