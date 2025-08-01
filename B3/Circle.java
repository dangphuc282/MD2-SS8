public class Circle implements Rectangle {
    private double radius;
    private String color;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public void setColor(String color) {
        this.color = color;
    }

    public void displayInfo() {
        System.out.println("Circle:");
        System.out.println("Radius: " + radius);
        System.out.println("Color: " + color);
    }
}
