import java.util.Objects;

public class Movie {
    private String name;
    private double price;
    private String director;
    private int date;
    private int ticketCount;
    // getter和setter方法
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public double getPrice(){
        return price;
    }
    public void setPrice(double price){
        this.price=price;
    }
    public String  getDirector(){
        return director;
    }
    public void setDirector(String director){
        this.director=director;
    }
    public int getDate(){
        return date;
    }
    public void setDate(int date){
        this.date=date;
    }
    public int getTicketCount(){
        return ticketCount;
    }
    public void setTicketCount(int ticketCount){
        this.ticketCount=ticketCount;
    }
    public Movie(){}// 无参构造
    public Movie(String name,double price,String director,int date,int ticketCount){// 有参构造
        this.name=name;
        this.price=price;
        this.director=director;
        this.date=date;
        this.ticketCount=ticketCount;
    }
    @Override
    public String toString(){// 返回电影信息
        return "电影名称："+this.name+",电影价格："+this.price+",电影导演："+this.director+",上映时间："+this.date+",电影票数："+ticketCount;
    }
    @Override
    public boolean equals(Object obj){// 判断电影信息
        if (this==obj){// 判断地址相不相等
            return  true;
        }
        if (obj instanceof Movie movie){// 判断每个值相不相等
            if (Objects.equals(this.name,movie.getName())
                    && Objects.equals(this.director,movie.getDirector())
                    && this.price==movie.getPrice()
                    && this.date==movie.getDate()
            ){
                return true;
            }
        }
        return false;
    }

}
