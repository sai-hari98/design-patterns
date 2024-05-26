package creational.factory.creator;

import creational.factory.product.UberShare;
import creational.factory.product.UberVehicle;

public class UberShareCreator implements UberCreator{
    @Override
    public UberVehicle createUberVehicle() {
        /*
         We can have our own logic to have a pool of UberShare objects
         manage those objects or create a new one.
        this pattern can be more useful when you have some logic to create a new object.
        this applies for all other creators as well.
        */
        return new UberShare();
    }
}
