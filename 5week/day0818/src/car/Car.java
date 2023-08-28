package car;

public class Car extends Vehicle {
    private int numDoors;
    String hasSideCar;
    public Car(String brand,int year,int numDoors){
        super(brand,year);
        this.numDoors=numDoors;
    }
    public int  getNumDoors(){
        return numDoors;
    }
    public void setNumDoors(){
        this.numDoors=numDoors;
    }
    public void displayInfo(){
        super.displayInfo();
        System.out.println("车门数量："+this.numDoors);
    }
}
