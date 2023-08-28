package animal;

public class Test {
    public static void main(String[] args) {

        Animal dog=new Dog("二哈","汪汪");
        dog.soundInfo();
        Animal cat=new Cat("波斯猫","喵喵");
        cat.soundInfo();
        Animal cow=new Cow("奶牛","哞哞");
        cow.soundInfo();
    }
}

