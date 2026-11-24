class Vehicle {
    String brand;

    Vehicle(String brand) {
        this.brand = brand;
    }

    void start() {
        System.out.println(brand + " is starting.");
    }
}

class Hybrid extends Vehicle {
    int batteryRangeKm;

    Hybrid(String brand, int batteryRangeKm) {
        super(brand);
        this.batteryRangeKm = batteryRangeKm;
    }

    void showRange() {
        System.out.println("Electric range: " + batteryRangeKm + " km");
    }

    public static void main(String[] args) {
        Hybrid car = new Hybrid("Toyota", 50);
        car.start();
        car.showRange();
    }
}

