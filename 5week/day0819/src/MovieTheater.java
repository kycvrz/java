import java.util.Objects;

public class MovieTheater {
    private Movie[] movies;// 电影数组
    private static int movieCount;// 记录存储电影的下标
    private User[] users;// 用户数组
    private static int userCount;// 记录存储用户的下标
    public Movie[] getMovies(){
        return movies;
    }
    public void setMovies(Movie[] movies){
        this.movies=movies;
    }
    public int getMovieCount(){
        return movieCount;
    }
    public void setMovieCount(int movieCount){
        this.movieCount=movieCount;
    }
    public User[] getUsers(){
        return users;
    }
    public void setUsers(User[] users){
        this.users=users;
    }
    public int getUserCount(){
        return userCount;
    }
    public void setUserCount(int userCount){
        this.userCount=userCount;
    }
    public MovieTheater(){// 构造器  初始一些值
        movies=new Movie[10];
        movies[0]=new Movie("孤注一掷",49.9,"申奥",20230808,23);
        movies[1]=new Movie("我经过风暴",45.9,"秦海燕",20230817,32);
        movieCount=2;
        users=new User[10];
        users[0]=new User("admin","18865430189","admin123",1);
        users[1]=new User("user","16619807174","user123",2);
        userCount=2;
    }
    public void growUser(){// 用户数组扩容
        if (userCount==users.length){
            Movie[] users1=new Movie[movies.length*2];
            System.arraycopy(users,0,users1,0,users.length);
            movies=users1;
        }
    }
    public void growMovie(){// 电影数组的扩容
        if (movieCount==movies.length){
            Movie[] movies1=new Movie[movies.length*2];
            System.arraycopy(movies,0,movies1,0,movies.length);
            movies=movies1;
        }
    }
    public Movie findMovie(String name){// 查找电影信息
        for (int i = 0; i < movieCount; i++) {
            if (name.equals(movies[i].getName())){
                return movies[i];
            }
        }
        return null;
    }
    public void displayAllMovies(){// 展示所有的电影信息
        for (int i = 0; i < movieCount; i++) {
            System.out.println(movies[i]);
        }
    }
    public void displayAllUsers(){// 展示所有的用户信息
        for (int i = 0; i < userCount; i++) {
            System.out.println(users[i].toString());
        }
    }
    public User loginUser(String phone,String password,int role){// 管理员/用户登录
        for (int i = 0; i < userCount; i++) {
            if (Objects.equals(users[i].getPhone(),phone)// 比较传进来的和目前的是否相等
                    && Objects.equals(users[i].getPassword(),password)
                    && users[i].getRole()==role
            ){
                return users[i];
            }
        }
        return null;
    }
    public boolean addMovie(Movie movie){// 添加电影
        growMovie();// 电影数组的扩容
        movies[movieCount]=movie;
        movieCount++;
        return true;
    }
    public boolean deleteMovie(String name){ // 删除电影
        int index=-1;
        for (int i = 0; i < movieCount; i++) {
            if (Objects.equals(name,movies[i].getName())){
                index=i;
            }
        }
        if (index==-1){
            return false;
        }
        System.arraycopy(movies,0,movies,0,index);
        System.arraycopy(movies,index+1,movies,index,movies.length-index-1);
        movieCount--;
        return true;
    }
    public boolean addUser(User user){// 添加用户/用户注册
        growUser();// 用户数组的扩容
        users[userCount]=user;
        userCount++;
        return true;
    }
    public User updateUser(User user1,User user2){// 修改用户信息
        for (int i = 0; i < userCount; i++) {
            if (users[i].equals(user1)){
                if (user2.getUsername()!=null){
                    users[i].setUsername(user1.getUsername());
                }else if (user2.getPhone()!=null){
                    users[i].setPhone(user1.getPhone());
                } else if (user2.getPassword()!=null) {
                    users[i].setPassword(user2.getPassword());
                }
            }
            return users[i];
        }
        return null;
    }
}
