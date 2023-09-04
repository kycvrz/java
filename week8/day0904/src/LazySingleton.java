public class LazySingleton {
    private static LazySingleton INSTANCE;
    private LazySingleton(){
        System.out.println("创建对象");
    }
    public static LazySingleton getINSTANCE(){
        if (INSTANCE==null){
            INSTANCE=new LazySingleton();
        }
        return INSTANCE;
    }
}
class Test004{
    public static void main(String[] args) {
        LazySingleton instance=LazySingleton.getINSTANCE();
        LazySingleton instance1=LazySingleton.getINSTANCE();
        System.out.println(instance==instance1);
    }
}
