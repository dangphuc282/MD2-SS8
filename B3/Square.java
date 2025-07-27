public class Square implements Colorable {
    private double side;
    private String color;

    public Square(double side) {
        this.side = side;
        this.color = "Chưa có màu";
    }

    @Override
    public void setColor(String color) {
        this.color = color;
    }

    public void displayInfo() {
        System.out.println("Hình vuông - Cạnh: " + side + ", Màu sắc: " + color);
    }
}
