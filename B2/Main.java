public class Main {
    public static void main(String[] args) {
        Vehicle car = new Car("Toyota", 120);
        Vehicle bike = new Bike("Honda", 80);

        System.out.println("=== Car Info ===");
        car.start();
        car.displayInfo();

        System.out.println("\n=== Bike Info ===");
        bike.start();
        bike.displayInfo();
    }
}
