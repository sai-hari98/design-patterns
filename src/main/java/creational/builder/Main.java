package creational.builder;

public class Main {

    public static void main(String[] args) {
        LaptopDirector laptopDirector = new LaptopDirector();
        Laptop gamingLaptop = laptopDirector.buildGamingLaptop();
        Laptop productivityLaptop = laptopDirector.buildProductivitiyLaptop();
    }
}
