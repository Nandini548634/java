
class Vehicle {
    public void startEngine() {
        System.out.println("Vehicle engine started");
    }

    public void stopEngine() {
        System.out.println("Vehicle engine stopped");
    }
}

class Bike extends Vehicle {

    @Override
    public void startEngine() {
        System.out.println("Bike engine started using self-start");
    }
}
public class Main21 {
    public static void main(String[] args) {
        Bike myBike = new Bike();
        myBike.startEngine();
        myBike.stopEngine();
    }
}
