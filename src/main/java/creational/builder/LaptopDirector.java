package creational.builder;

public class LaptopDirector {

    private LaptopBuilder laptopBuilder;

    public LaptopDirector() {
        this.laptopBuilder = new LaptopBuilder();
    }

    public Laptop buildGamingLaptop() {
        laptopBuilder.motherboard("Intel I7, 16GB RAM");
        laptopBuilder.keyboard("Logitech");
        laptopBuilder.touchpad("Logitech");
        laptopBuilder.screen("15.7 Inch OLED");
        laptopBuilder.ports("3 USB A, 1 USB C");
        laptopBuilder.gpu("NVIDIA GTX 1650");
        laptopBuilder.backlights("Blue Backlights");
        return laptopBuilder.build();
    }

    public Laptop buildProductivitiyLaptop() {
        laptopBuilder.motherboard("Intel I7, 8GB RAM");
        laptopBuilder.keyboard("Logitech");
        laptopBuilder.touchpad("Logitech");
        laptopBuilder.touchScreen("14 Inch OLED");
        laptopBuilder.ports("3 USB C, 1 USB A");
        laptopBuilder.fingerPrintScanner("Generic Fingerprint Scanner");
        return laptopBuilder.build();
    }
}
