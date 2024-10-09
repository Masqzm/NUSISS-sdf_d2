package cars;   

public class Car {
    // Members of the class
    private String make;
    private String owner;
    private String colour;
    protected int fuel = 100;   // protected: can be accessed within class and derivatives only

    // Constructor
    public Car() {
        this.make = "Honda";
        this.colour = "Silver";
    }
    // Overloading constructors
    public Car(String make) {
        this.make = make;
    }
    public Car(String make, String colour) {
        this.make = make;
        this.colour = colour;
    }

    // Getters and setters
    // Auto-generation Steps: Ctrl+Shift+P > Source Action > Getters and Setters
    public void setMake(String make) { this.make = make; }
    public void setOwner(String owner) { this.owner = owner; }
    public void setColour(String colour) { this.colour = colour; }

    public String getMake() { return this.make; }
    public String getOwner() { return this.owner; }
    public String getColour() { return colour; }

    // Methods/Behaviours
    public void info() {
        System.out.printf("Make: %s, Owner: %s, Colour: %s\n", this.make, this.owner, this.colour);
    }

    public void go() {
        this.fuel--;
    }
    public void go(int distance) {
        this.fuel -= distance;
    }
    public void go(int distance, boolean turbo) {
        if(turbo)
            this.fuel -= 2;
        this.fuel -= distance;
    }

    public void fuelGauge() {
        System.out.printf("FUEL: %d\n", this.fuel);
    }
}
