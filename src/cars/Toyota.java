package cars;

public class Toyota extends Car {
    private boolean gps = false;

    public Toyota() {
        setMake("Toyota");
    }

    public boolean isGps() { return gps; }
    public void setGps(boolean gps) { this.gps = gps; }

    // Overriding parent's method
    @Override   // to tell Java you're overriding this mtd (useful in case wrong param(s) given)
    public void go(int distance, boolean turbo) {
        // toyota cars turns off turbo
        //super.go(distance);  
        this.fuel -= distance;
    }
    @Override
    public void setMake(String make) {}     // to ignore any attempts to change its make
}
