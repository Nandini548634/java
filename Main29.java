class Mobile {

    String brand;
    double price;

    // No-argument constructor
    Mobile() {
        brand = "Samsung";
        price = 25000;
    }

    // Method to display details
    void displayDetails() {
        System.out.println("Mobile Brand: " + brand);
        System.out.println("Mobile Price: " + price);
    }
}

public class Main29{
    public static void main(String[] args) {

        Mobile m = new Mobile();

        m.displayDetails();
    }
}
