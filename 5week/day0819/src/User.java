import java.util.Objects;

public class User {
    private String username;
    private String phone;
    private String password;
    private int role;
    private Movie[] movies;
    private int index;

    public User(){
        // 初始化数组
        Movie[] movies=new Movie[10];
        movies[0]=new Movie();
    }// 无参构造
    public User(String username,String phone,String password,int role){// 有参构造
        this.username=username;
        this.phone=phone;
        this.password=password;
        this.role=role;
    }
    // getter和setter方法
    public String getUsername(){
        return username;
    }
    public void setUsername(String username){
        this.username=username;
    }
    public String getPhone(){
        return phone;
    }
    public void setPhone(String phone){
        this.phone=phone;
    }
    public String getPassword(){
        return password;
    }
    public void setPassword(String password){
        this.password=password;
    }
    public int getRole(){
        return role;
    }
    public void setRole(int role){
        this.role=role;
    }
    public Movie[] getMovies(){
        return movies;
    }
    public void setMovies(Movie[] movies){
        this.movies=movies;
    }

    @Override
    public String toString(){// 返回用户信息
        return "用户名称："+username+",用户密码："+password+",用户登录手机号："+phone+",用户身份："+(role==1?"管理员":"普通用户");
    }
    @Override
    public boolean equals(Object obj){// 判断用户信息
        if (this==obj){
            return true;
        }
        if (obj instanceof User user){
            if (Objects.equals(this.password,user.getPassword())
                    && Objects.equals(this.username,user.getUsername())
                    && Objects.equals(this.phone,user.getPhone())
                    && this.role==user.getRole()
            ){
               return true;
            }
        }
        return false;
//        if (obj==null||getClass()!=obj.getClass()){
//            return false;
//        }
//        User user=(User) obj;
//        return phone.equals(user.phone);
    }
}
