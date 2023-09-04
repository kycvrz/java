package kfmMovie;

import java.util.Arrays;
import java.util.Objects;

public class User {
    private String username;
    private String phone;
    private String password;
    private int role;
    private Movie[] buyMovies;
    private int buyMovieCount;
    public User() {
        buyMovies=new Movie[10];
    }
    public User(String username,String phone,String password,int role) {
        this.username = username;
        this.phone=phone;
        this.password=password;
        this.role=role;
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String name) {
        this.username = name;
    }
    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public int getRole() {
        return role;
    }
    public void setRole(int role) {
        this.role = role;
    }
    public Movie[] getMovies() {
        return buyMovies;
    }
    public void setMovies(Movie[] movies) {
        this.buyMovies = movies;
    }
    @Override
    public String toString() {
        return "User{" +
                "name='" + username + '\'' +
                ", phone='" + phone + '\'' +
                ", password='" + password + '\'' +
                ", role=" + role +
                '}';
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return role == user.role
                && Objects.equals(username, user.username)
                && Objects.equals(phone, user.phone)
                && Objects.equals(password, user.password)
                && Arrays.equals(buyMovies, user.buyMovies);
    }
    @Override
    public int hashCode() {
        int result = Objects.hash(username, phone, password, role);
        result = 31 * result + Arrays.hashCode(buyMovies);
        return result;
    }
    public void addMovie(Movie movie){
        // 电影信息扩容
        buyMovieCount=0;
        buyMovies[buyMovieCount]=movie;
        buyMovieCount++;
    }
}
