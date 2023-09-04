public enum Singleton {
    INSTANCE();
}
class Test006{
    public static void main(String[] args) {
        Singleton instance = Singleton.INSTANCE;
    }
}
