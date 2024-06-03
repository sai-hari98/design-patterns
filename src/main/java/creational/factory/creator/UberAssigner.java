package creational.factory.creator;

import creational.factory.constant.UberType;
import creational.factory.product.UberVehicle;

public class UberAssigner {

    private UberShareCreator uberShareCreator;
    private UberXCreator uberXCreator;
    private UberXLCreator uberXLCreator;
    private static UberAssigner uberAssigner;

    private UberAssigner(){
        uberShareCreator = new UberShareCreator();
        uberXCreator = new UberXCreator();
        uberXLCreator = new UberXLCreator();
    }

    public static UberAssigner getUberAssigner() {
        if(uberAssigner == null) {
            uberAssigner = new UberAssigner();
        }
        return uberAssigner;
    }

    public UberCreator getUberCreator(UberType uberType){
        return switch (uberType) {
            case UberType.UBERXL -> uberXLCreator;
            case UberType.UBERSHARE -> uberShareCreator;
            case UberType.UBERX -> uberXCreator;
        };
    }

    public UberVehicle assignUberVehicle(String requestedType){
        return switch (requestedType) {
            case "UberShare" -> new UberShareCreator().createUberVehicle();
            case "UberX" -> new UberXCreator().createUberVehicle();
            case "UberXL" -> new UberXLCreator().createUberVehicle();
            default -> new UberXCreator().createUberVehicle();
        };
    }

}
