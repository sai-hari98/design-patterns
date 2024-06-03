package creational.factory;

import creational.factory.constant.UberType;
import creational.factory.creator.UberAssigner;
import creational.factory.creator.UberCreator;
import creational.factory.product.UberVehicle;

import java.util.Scanner;

public class FactoryExample {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true) {
            System.out.print("Input the type of Uber Vehicle needed: ");
            String type = scanner.nextLine();
            UberType uberType = UberType.getUberType(type);
            UberCreator vehicleCreator = UberAssigner.getUberAssigner().getUberCreator(uberType);
            UberVehicle vehicle = vehicleCreator.createUberVehicle();
            System.out.println("Type of vehicle: "+vehicle.getClass());
            System.out.print("Do you want to continue (y/n): ");
            String response = scanner.nextLine();
            if(!response.equalsIgnoreCase("Y"))
                break;
        }
    }
}
