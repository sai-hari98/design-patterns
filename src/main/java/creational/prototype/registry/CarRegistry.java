package creational.prototype.registry;

import creational.prototype.entity.Type;
import creational.prototype.entity.Vehicle;
import creational.prototype.entity.Car;
import creational.prototype.entity.Engine;

public class CarRegistry {

    private final Vehicle electricCar;
    private final Vehicle hybridCar;
    private final Vehicle gasCar;

    public CarRegistry(){
        electricCar = new Car(new Engine("250","250hp", Type.ELECTRIC), "Red");
        hybridCar = new Car(new Engine("250","250hp", Type.HYBRID), "Green");
        gasCar = new Car(new Engine("250","250hp", Type.GAS), "Silver");
    }

    public Vehicle cloneCar(Type type){
        Vehicle vehicle;
        switch(type){
            case ELECTRIC:
                System.out.print("Cloning Electric: ");
                System.out.println(electricCar);
                vehicle = electricCar.clone();
                break;
            case HYBRID:
                System.out.print("Cloning Hybrid: ");
                System.out.println(hybridCar);
                vehicle = hybridCar.clone();
                break;
            default:
                System.out.print("Cloning Gas: ");
                System.out.println(gasCar);
                vehicle = gasCar.clone();
                break;
        }
        System.out.print("Cloned Vehicle: ");
        System.out.println(vehicle);
        return vehicle;
    }
}
