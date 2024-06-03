package creational.factory.constant;

public enum UberType {

    UBERSHARE("UberShare"),
    UBERX("UberX"),
    UBERXL("UberXL");

    private String type;

    private UberType(String type) {
        this.type = type;
    }

    public static UberType getUberType(String type){
        return switch (type){
            case "UberShare" -> UBERSHARE;
            case "UberXL" -> UBERXL;
            default -> UBERX;
        };
    }
}
