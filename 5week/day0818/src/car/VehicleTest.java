package car;

import car.Car;
import car.Motorcycle;
import car.Vehicle;

public class VehicleTest {
    public static void main(String[] args) {
        Vehicle vehicle=new Vehicle("兰博基尼",2002);
        vehicle.displayInfo();
        Car car=new Car("劳斯莱斯",2002,4);
        car.displayInfo();
        Motorcycle motorcycle=new Motorcycle("宝马",2012,false);
        motorcycle.displayInfo();
    }
}
