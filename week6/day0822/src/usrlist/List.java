package usrlist;

import java.util.Objects;

public class List {
    private Object[] user;
    private int userCount;
    private int userCapacity;
    private Object[] movie;
    private int movieCount;
    private int movieCapacity;
    /**
     * 数组长度的初始化
     */
    public List() {
        this(10,10);// this可以调用同类的构造对象，而且要在第一行
    }
    /**
     * 数组的初始化
     * @param userCapacity 用户数组的长度
     * @param movieCapacity 电影数组的长度
     */
    public List(int userCapacity,int movieCapacity) {
        this.userCapacity = userCapacity;// 指代成员变量中的变量
        user = new Object[userCapacity]; // 再把长度赋给数组
        this.movieCapacity=movieCapacity;
        movie=new Object[movieCapacity];
    }
    /**
     * 用户数组的扩容
     */
    private void userGrow() {
        if (userCount == user.length) {// 每当下标和长度相等时就要扩容
            Object[] newUser = new Object[userCapacity * 2];// 定义一个扩容后的新数组
            System.arraycopy(user, 0, newUser, 0, user.length);// 再把旧数组的数据复制到新数组中
            user = newUser;// 旧的数组然后再换成新的数组
        }
    }
    /**
     * 电影数组的扩容
     */
    public void movieGrow(){
        if (movieCount==movie.length){
            Object[] newMovie=new Object[movieCapacity*2];
            System.arraycopy(movie,0,newMovie,0,movie.length);
            movie=newMovie;
        }
    }
    /**
     * 添加用户
     * @param obj 要添加的用户信息
     */
    public void addUser(Object obj) {
        userGrow();
        user[userCount ++] = obj;
    }
    /**
     * 添加电影
     * @param obj 要添加的电影信息(对象)
     */
    public void addMovie(Object obj){
        movieGrow();
        movie[movieCount++]=obj;
    }
    /**
     * 删除电影
     * @param obj 要删除的电影信息(对象)
     */
    private boolean deleteMovie(String obj){
        int index=-1;
        for (int i = 0; i < movieCount; i++) {
            if (Objects.equals(obj,movie[i])){
                index=i;
            }
        }
        if (index==-1){
            return false;
        }
        System.arraycopy(movie,0,movie,0,index);
        System.arraycopy(movie,index+1,movie,index,movie.length-index-1);
        movieCount--;
        return true;
    }
}
