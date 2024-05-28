package creational.builder;

public class LaptopBuilder {

    private Laptop laptop;

    public LaptopBuilder() {
        this.laptop = new Laptop();
    }

    public void reset() {
        laptop = new Laptop();
    }

    public void motherboard(String motherboard){
        laptop.setMotherboard(motherboard);
    }

    public void keyboard(String keyboard) {
        laptop.setKeyboard(keyboard);
    }

    public void touchpad(String touchpad) {
        laptop.setTouchpad(touchpad);
    }

    public void ports(String ports) {
        laptop.setPorts(ports);
    }

    public void screen(String screen) {
        laptop.setScreen(screen);
    }

    public void touchScreen(String touchScreen) {
        laptop.setTouchScreen(touchScreen);
    }

    public void gpu(String gpu) {
        laptop.setGpu(gpu);
    }

    public void backlights(String backlights) {
        laptop.setBacklights(backlights);
    }

    public void fingerPrintScanner(String fingerPrintScanner) {
        laptop.setFingerPrintScanner(fingerPrintScanner);
    }

    public Laptop build() {
        if((laptop.getScreen() == null && laptop.getTouchScreen() == null)
            || laptop.getMotherboard() == null
            || laptop.getKeyboard() == null
            || laptop.getTouchpad() == null
            || laptop.getPorts() == null) {
            throw new RuntimeException("Laptop is not built completely. Need to add all the necessary components");
        } else {
            Laptop laptopToReturn = this.laptop;
            this.reset();
            return laptopToReturn;
        }
    }
}
