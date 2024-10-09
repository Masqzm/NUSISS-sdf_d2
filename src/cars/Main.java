package cars;

public class Main {
    public static void main(String[] args) {
        // Create an instance of the class (Instantiation)
        Car myCar = new Car("Toyota");
        myCar.setOwner("Qwe");
        myCar.info();

        Car yourCar = new Car("Nissan", "White");
        yourCar.setOwner("Asd");
        yourCar.info();

        Car ourCar = new Car();
        ourCar.setMake("BMW");
        ourCar.setOwner("Zxc");
        ourCar.info();

        Car batCar = new Car();
        batCar.setOwner("Bruce");
        batCar.info();

        batCar.fuelGauge();
        batCar.go();
        batCar.fuelGauge();
        batCar.go(5, true);
        batCar.fuelGauge();   

        // Car trailer for 6 cars
        Car[] trailer = new Car[6];
        trailer[0] = myCar;
        // ...
    }
}
