package creational.prototype;

import creational.prototype.entity.Type;
import creational.prototype.registry.CarRegistry;

import java.util.Scanner;

public class PrototypeDemonstration {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CarRegistry registry = new CarRegistry();
        while(true) {
            System.out.print("1. Electric\n2. Hybrid\n3. Gas\nEnter your choice: ");
            int choice = scanner.nextInt();
            switch(choice) {
                case 1: registry.cloneCar(Type.ELECTRIC); break;
                case 2: registry.cloneCar(Type.HYBRID); break;
                default: registry.cloneCar(Type.GAS); break;
            }
            System.out.print("Do you want to continue (y/n): ");
            String y = scanner.next();
            if(!y.equalsIgnoreCase("y"))
                break;
        }
    }
}
