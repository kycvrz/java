public class Singleton2 {
    private Singleton2(){

    }
    public static Singleton2 getInstance(){
        return Singleton2Inner.INSTANCE;
    }
    static class Singleton2Inner{
        private static Singleton2 INSTANCE=new Singleton2();
    }
}
class Test007{
    public static void main(String[] args) {
        Singleton2.getInstance();
    }
}
