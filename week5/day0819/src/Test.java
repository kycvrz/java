import java.util.Scanner;

public class Test {
    private static final Scanner sc=new Scanner(System.in);
    private static final MovieTheater movieTheater =new MovieTheater();
    private static User loginUser;
    public static void main(String[] args) {
        menu();
    }
    public static void menu(){// 菜单
        System.out.println("******************");
        System.out.println("**欢迎来到开发喵影院**");
        System.out.println("1.查询电影信息");
        System.out.println("2.显示所有电影信息");
        System.out.println("3.管理员登录");
        System.out.println("4.用户登录");
        System.out.println("5.用户注册");
        System.out.println("0.退出");
        System.out.println("*******************");
        System.out.println("请输入你要操作的序号");
        int op=sc.nextInt();
        switch (op){
            case 1 ->findMovie();
            case 2 ->movieInformation();
            case 3 ->login(1);
            case 4 ->login(2);
            case 5 ->userRegister();
            case 0 ->{
                System.out.println("退出成功");
                return;
            }
        }
    }
    public static void findMovie(){// 查找电影
        System.out.println("请输入你要查找的电影");
        String name=sc.next();
        Movie movie= movieTheater.findMovie(name);
        if (movie==null){
            System.out.println("没有此电影");
        }else{
            System.out.println(movie);
        }
        menu();
    }
    public static void movieInformation(){ // 展示所有电影信息
        movieTheater.displayAllMovies();
        menu();
    }
    /**
     * 管理员或者用户登录
     * @param role 身份信息是管理员或者用户登录各自的界面
     */
    public static void login(int role){
        System.out.println("请输入电话号码");
        String phone= sc.next();
        System.out.println("请输入密码");
        String password=sc.next();
        loginUser=movieTheater.loginUser(phone,password,role);
        if (loginUser==null){
            System.out.println("登录失败,用户名或密码不对");
            menu();
        }else{
            System.out.println("登录成功");
            System.out.println(loginUser.getUsername()+",欢迎您！");
            if (role==1){
                managerMenu();
            }else{
                userMenu();
            }
        }
    }
    public static void managerMenu(){// 管理员登录后界面
        System.out.println("************");
        System.out.println("1.新增电影");
        System.out.println("2.删除电影");
        System.out.println("3.修改电影");
        System.out.println("4.查看所有用户信息");
        System.out.println("0.退出");
        System.out.println("************");
        System.out.println("请输入你要操作的序号");
        int op= sc.nextInt();
        switch (op){
            case 1 ->addMovie();
            case 2 ->deleteMovie();
            case 3 ->modifyMovie();
            case 4 ->lookUsers();
            case 0 ->{
            menu();
            }
        }
    }
    public static void addMovie(){// 添加电影
        System.out.println("请输入你要添加的电影名称");
        String name= sc.next();
        System.out.println("请输入电影价格");
        double price= sc.nextDouble();
        System.out.println("请输入电影导演");
        String director= sc.next();
        System.out.println("请输入上映时间");
        int date= sc.nextInt();
        System.out.println("请输入电影票数");
        int ticketCount= sc.nextInt();
        Movie movie=new Movie(name,price,director,date,ticketCount);
        movieTheater.addMovie(movie);
        System.out.println("添加成功！"+movie);
        managerMenu();
    }
    public static void deleteMovie(){// 删除电影
        System.out.println("请输入电影名称");
        String name= sc.next();
        if (movieTheater.deleteMovie(name)){
            System.out.println("删除成功");
        }else{
            System.out.println("删除失败，你删除的电影可能不存在");
        }
        managerMenu();
    }
    public static void modifyMovie(){// 修改电影
        System.out.println("请输入电影名称：");
        String name= sc.next();
        Movie movie=movieTheater.findMovie(name);
        if (movie!=null){
            System.out.println(movie);
            System.out.println("1.价格");
            System.out.println("2.上映时间");
            System.out.println("0.取消");
            System.out.println("请输入你要修改的内容");
            int op= sc.nextInt();
            switch (op){
                case 1 -> {
                    System.out.println("请输入新的价格");
                    double price= sc.nextDouble();
                    movie.setPrice(price);
                    System.out.println("修改完成");
                }
                case 2 ->{
                    System.out.println("请输入新的上映时间");
                    int date= sc.nextInt();
                    movie.setDate(date);
                    System.out.println("修改完成");
                }
                case 0 ->{
                    managerMenu();
                }
            }
        }else{
            System.out.println("目前还没有上映该电影");
        }
        managerMenu();
    }
    public static void lookUsers(){// 查看所有用户信息
        movieTheater.displayAllUsers();
        managerMenu();
    }
    public static void userMenu(){// 用户登录页面列表
        System.out.println("************");
        System.out.println("1.修改用户信息");
        System.out.println("2.查询用户信息");
        System.out.println("0.退出");
        System.out.println("************");
        System.out.println("请输入你要操作的序号");
        int op= sc.nextInt();
        switch (op){
            case 1 ->modifyUserInformation();
            case 2 ->findUserInformation();
            case 0 ->{
                loginUser=null;
                menu();
            }
        }
    }
    public static void modifyUserInformation(){// 修改用户信息
        System.out.println("1.用户名");
        System.out.println("2.手机号");
        System.out.println("3.密码");
        System.out.println("0.取消");
        System.out.println("请输入你要修改的内容");
        int op= sc.nextInt();
        switch (op){
            case 1 ->{
                System.out.println("请输入用户名");
                String name=sc.next();
                loginUser.setUsername(name);
                System.out.println("修改成功");
            }
            case 2 ->{
                System.out.println("请输入手机号");
                String phone=sc.next();
                loginUser.setPhone(phone);
                System.out.println("修改成功");
            }
            case 3 ->{
                System.out.println("请输入密码");
                String password=sc.next();
                loginUser.setPassword(password);
                System.out.println("修改成功");
            }
            case 0 ->{
                userMenu();
            }
        }
        userMenu();
    }
    public static void findUserInformation(){// 查询用户信息
        System.out.println(loginUser);
        userMenu();
    }
    public static void userRegister(){// 用户注册
        System.out.println("请输入用户名");
        String username= sc.next();
        System.out.println("请输入电话");
        String phone= sc.next();
        System.out.println("请输入密码");
        String password= sc.next();
        User user=new User(username,phone,password,2);
        movieTheater.addUser(user);
        System.out.println("注册成功，你可以去登录了");
        menu();
    }
}
