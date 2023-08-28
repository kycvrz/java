package car;

public class Vehicle {
    private String brand;
    private int year;
    public Vehicle(){}
    public Vehicle(String brand,int year){
        this.brand=brand;
        this.year=year;
    }
    public String getBrand(){
        return brand;
    }
    public void setBrand(){
        this.brand=brand;
    }
    public int  getYear(){
        return year;
    }
    public void setYear(){
        this.year=year;
    }
    public void displayInfo(){
        System.out.println("品牌为："+this.brand+"，出产年份："+this.year);
    }
}
