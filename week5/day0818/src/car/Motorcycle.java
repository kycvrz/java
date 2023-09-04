package car;

public class Motorcycle extends Vehicle {
    private boolean hasSideCar;
    public Motorcycle(String brand,int year,boolean hasSideCar){
        super(brand,year);
        this.hasSideCar=hasSideCar;
    }
    public boolean isHasSideCar(){
        return hasSideCar;
    }
    public void setHasSideCar(){
        this.hasSideCar=hasSideCar;
    }
    public void displayInfo(){
        super.displayInfo();
        System.out.println(hasSideCar?"有":"没有");
    }
}
