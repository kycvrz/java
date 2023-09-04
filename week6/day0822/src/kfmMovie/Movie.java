package kfmMovie;

import java.util.Objects;

public class Movie {
    private String name;
    private double price;
    private String director;
    private int date;
    private int ticketCount;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public String getDirector() {
        return director;
    }
    public void setDirector(String director) {
        this.director = director;
    }
    public int getDate() {
        return date;
    }
    public void setDate(int date) {
        this.date = date;
    }
    public int getTicketCount() {
        return ticketCount;
    }
    public void setTicketCount(int ticketCount) {
        this.ticketCount = ticketCount;
    }
    @Override
    public String toString() {
        return "Movie{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", director='" + director + '\'' +
                ", date=" + date +
                ", ticketCount=" + ticketCount +
                '}';
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Movie movie = (Movie) o;
        return Double.compare(movie.price, price) == 0 && date == movie.date && ticketCount == movie.ticketCount && Objects.equals(name, movie.name) && Objects.equals(director, movie.director);
    }
    @Override
    public int hashCode() {
        return Objects.hash(name, price, director, date, ticketCount);
    }
}
