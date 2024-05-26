package creational.factory.creator;

import creational.factory.product.UberVehicle;
import creational.factory.product.UberX;

public class UberXCreator implements UberCreator{
    @Override
    public UberVehicle createUberVehicle() {
        /*
         We can have our own logic to have a pool of UberX objects
         manage those objects or create a new one.
        this pattern can be more useful when you have some logic to create a new object.
        this applies for all other creators as well.
        */
        return new UberX();
    }
}
