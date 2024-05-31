package creational.prototype.entity;

public class Car implements Vehicle{

    private final Engine engine;
    private final String color;

    public Car(Engine engine, String color) {
        this.engine = engine;
        this.color = color;
    }

    public Vehicle clone(){
        return new Car(engine.clone(), color);
    }
}
