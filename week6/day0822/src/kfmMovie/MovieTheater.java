package kfmMovie;

public class MovieTheater {
    private Movie[] movies;// 电影数组
    private static int movieCount;// 记录存储电影的下标
    private User[] users;// 用户数组
    private static int userCount;// 记录存储用户的下标
    public Movie[] getMovies() {
        return movies;
    }
    public void setMovies(Movie[] movies) {
        this.movies = movies;
    }
    public static int getMovieCount() {
        return movieCount;
    }
    public static void setMovieCount(int movieCount) {
        MovieTheater.movieCount = movieCount;
    }
    public User[] getUsers() {
        return users;
    }
    public void setUsers(User[] users) {
        this.users = users;
    }
    public static int getUserCount() {
        return userCount;
    }
    public static void setUserCount(int userCount) {
        MovieTheater.userCount = userCount;
    }
    public MovieTheater() {
        movies=new Movie[10];
        movies[0]=new Movie();
        movies[1]=new Movie();
        movieCount=2;
        users=new User[10];
        users[0]=new User();
        users[1]=new User();
        userCount=2;
    }
}
