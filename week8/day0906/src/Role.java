import java.util.*;

class RoleTest {
    static Scanner sc=new Scanner(System.in);
    static RoleManage roleManage=new RoleManage();
    static Role role=new Role();
    public static void main(String[] args) {
        while (true){
            menu();
        }
    }
    private static void menu(){
        System.out.println("================");
        System.out.println("1.展示所有角色");
        System.out.println("2.添加角色");
        System.out.println("3.按等级排序");
        System.out.println("4.按命座排序");
        System.out.println("5.删除等级不满90级的角色");
        System.out.println("0.退出");
        System.out.println("================");
        System.out.println("请输入你要操作的序号");
        int type = sc.nextInt();
        switch (type){
            case 1 -> roleManage.displayRole();
            case 2 -> {
                addRole();
                roleManage.displayRole();
            }
            case 3 -> {
                roleManage.gradeBySort();
                roleManage.displayRole();
            }
            case 4 ->{
                roleManage.oderSeatBySort();
                roleManage.displayRole();
            }
            case 5 ->{
                roleManage.deleteLessGrade(90);
                roleManage.displayRole();
            }
            case 0 ->{
                System.exit(1);
            }
        }
    }
    private static void addRole(){
        System.out.println("请输入名称：");
        String name=sc.next();
        System.out.println("请输入属性：");
        String property=sc.next();
        System.out.println("请输入稀有度：");
        int rarity=sc.nextInt();
        System.out.println("请输入命座：");
        int oderSeat=sc.nextInt();
        System.out.println("请输入等级：");
        int grade=sc.nextInt();
        role=new Role(name,property,rarity,oderSeat,grade);
        roleManage.add(role);
    }
}
class RoleManage{
    private static final ArrayList arrayList=new ArrayList();
    public RoleManage(){
        arrayList.add(new Role("魈","风",5,1,90));
        arrayList.add(new Role("枫原万叶","风",5,0,90));
        arrayList.add(new Role("胡桃","火",5,1,89));
        arrayList.add(new Role("夜兰","水",5,0,89));
        arrayList.add(new Role("雷电将军","电",5,0,89));
        arrayList.add(new Role("纳西妲","草",5,1,89));
        arrayList.add(new Role("神里凌华","冰",5,0,90));
        arrayList.add(new Role("行秋","水",4,6,89));
    }

    public static void displayRole(){ // 展示所有角色
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }
    }
    public void add(Role role){ // 添加角色
        arrayList.add(role);
    }
    public void gradeBySort(){ // 按照等级排序
        arrayList.sort(new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                Role r1=(Role) o1;
                Role r2=(Role) o2;
                return r1.getGrade()-r2.getGrade();
            }
        });
    }
    public void oderSeatBySort(){ // 按照命座排序
        arrayList.sort(new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                Role r1=(Role) o1;
                Role r2=(Role) o2;
                return r1.getOderSeat()-r2.getOderSeat();
            }
        });
    }
    public void deleteLessGrade(int grade){ // 删除等级不满足grade
        Iterator iterator=arrayList.iterator();
        while (iterator.hasNext()){
            Role role=(Role) iterator.next();
            if (role.getGrade()<grade){
                iterator.remove();
            }
        }
    }
}
public class Role{
    private String name;
    private String property;// 属性
    private int rarity; // 稀有度
    private int oderSeat; // 命座
    private int grade;// 等级

    public Role() {
    }

    public Role(String name, String property, int rarity, int oderSeat, int grade) {
        this.name = name;
        this.property = property;
        this.rarity = rarity;
        this.oderSeat = oderSeat;
        this.grade=grade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProperty() {
        return property;
    }

    public void setProperty(String property) {
        this.property = property;
    }

    public int getRarity() {
        return rarity;
    }

    public void setRarity(int rarity) {
        this.rarity = rarity;
    }

    public int getOderSeat() {
        return oderSeat;
    }

    public void setOderSeat(int oderSeat) {
        this.oderSeat = oderSeat;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "ArrayListMessage{" +
                "名称：" + name +
                ", 属性：" + property +
                ", 稀有度：" + rarity +
                ", 命座：" + oderSeat +
                ", 等级：Lv." + grade +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Role that = (Role) o;
        return rarity == that.rarity && oderSeat == that.oderSeat && Objects.equals(name, that.name) && Objects.equals(property, that.property) && Objects.equals(grade, that.grade);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, property, rarity, oderSeat,grade);
    }
}
