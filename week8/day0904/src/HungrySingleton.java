import com.sun.tools.javac.Main;

public class HungrySingleton {
    private static final HungrySingleton INSTANCE=new HungrySingleton();
    public HungrySingleton(){
        System.out.println("创建对象");
    }
    public static HungrySingleton getInstance(){
        return INSTANCE;
    }

}
class Test005{
    public static void main(String[] args) {
        HungrySingleton.getInstance();
        HungrySingleton.getInstance();
    }
}
