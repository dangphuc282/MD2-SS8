public class Rectangle implements Colorable {
    private double width;
    private double height;
    private String color;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
        this.color = "Chưa có màu";
    }

    @Override
    public void setColor(String color) {
        this.color = color;
    }

    public void displayInfo() {
        System.out.println("Hình chữ nhật - Rộng: " + width + ", Cao: " + height + ", Màu sắc: " + color);
    }
}
