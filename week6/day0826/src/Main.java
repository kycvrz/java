class MyClass {
    static void staticMethod1() {
        System.out.println("This is staticMethod1.");
    }

    final  void staticMethod2() {
        System.out.println("This is staticMethod2.");
    }
}

public class Main {
    public static void main(String[] args) {
        MyClass c=new MyClass();
        c.staticMethod1();
        MyClass.staticMethod1(); // Calling staticMethod1 using class name
        c.staticMethod2(); // Calling staticMethod2 using class name
    }
}


