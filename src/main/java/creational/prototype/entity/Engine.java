package creational.prototype.entity;

public class Engine {

    private final String torque;
    private final String horsePower;
    private final Type type;

    public Engine(String torque, String horsePower, Type type) {
        this.torque = torque;
        this.horsePower = horsePower;
        this.type = type;
    }

    public Engine clone(){
        return new Engine(torque, horsePower, type);
    }
}
